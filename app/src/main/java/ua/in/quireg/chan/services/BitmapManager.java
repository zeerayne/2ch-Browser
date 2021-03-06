package ua.in.quireg.chan.services;

import android.graphics.Bitmap;

import httpimage.HttpImageManager;
import httpimage.HttpImageManager.LoadRequest;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import ua.in.quireg.chan.common.utils.AppearanceUtils;

public class BitmapManager {
    private final HttpImageManager mImageManager;

    public BitmapManager(HttpImageManager imageManager) {
        this.mImageManager = imageManager;
    }

    public boolean isCached(String uriString) {
        return this.mImageManager.isCached(uriString);
    }

    public void fetchBitmapOnThread(final Uri uri, final ImageView imageView, boolean reduceSize, final View indeterminateProgressBar, final Integer errorImageId) {
        imageView.setTag(uri);

        LoadRequest r = new LoadRequest(uri, new HttpImageManager.OnLoadResponseListener() {
            @Override
            public void beforeLoad(final LoadRequest r) {
                if (imageView.getTag() == r.getUri()) {
                    imageView.setImageResource(android.R.color.transparent);
                    AppearanceUtils.showImageProgressBar(indeterminateProgressBar, imageView);
                }
            }

            @Override
            public void onLoadResponse(final LoadRequest r, final Bitmap data) {
                if (imageView.getTag() == r.getUri()) {
                    imageView.setImageBitmap(data);
                    AppearanceUtils.hideImageProgressBar(indeterminateProgressBar, imageView);
                }
            }

            @Override
            public void onLoadError(final LoadRequest r, Throwable e) {
                if (imageView.getTag() == r.getUri()) {
                    if (errorImageId != null) {
                        imageView.setImageResource(errorImageId.intValue());
                    }
                    AppearanceUtils.hideImageProgressBar(indeterminateProgressBar, imageView);
                }
            }
        });

        // Запрос
        Bitmap b = this.mImageManager.loadImage(r, reduceSize);
        // Если удалось взять из кэша, отображаем сразу
        if (b != null) {
            imageView.setImageBitmap(b);
        }
    }
}
