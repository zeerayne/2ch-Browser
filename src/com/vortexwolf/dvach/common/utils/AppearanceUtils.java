package com.vortexwolf.dvach.common.utils;

import com.vortexwolf.dvach.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class AppearanceUtils {

    public static void showToastMessage(Context context, String msg) {
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public static ListViewPosition getCurrentListPosition(ListView listView) {
        int index = 0;
        int top = 0;

        if (listView != null) {
            index = listView.getFirstVisiblePosition();
            View v = listView.getChildAt(0);
            top = (v == null) ? 0 : v.getTop();
        }

        ListViewPosition position = new ListViewPosition(index, top);
        return position;
    }

    public static void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
            view.setBackgroundDrawable(null);
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(null);
        }

        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                unbindDrawables(((ViewGroup) view).getChildAt(i));
            }
        }
    }

    public static void showImageProgressBar(final View indeterminateProgressBar, final ImageView imageView) {
        imageView.setVisibility(View.INVISIBLE);
        
        if (indeterminateProgressBar != null) {
            indeterminateProgressBar.setVisibility(View.VISIBLE);
        }
    }

    public static void hideImageProgressBar(final View indeterminateProgressBar, final ImageView imageView) {
        imageView.setVisibility(View.VISIBLE);
        
        if (indeterminateProgressBar != null) {
            indeterminateProgressBar.setVisibility(View.GONE);
        }
    }
    
    public static Bitmap reduceBitmapSize(Resources resources, Bitmap bitmap){
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        int newSize = resources.getDimensionPixelSize(R.dimen.thumbnail_size);
        
        float scaleWidth = newSize / (float)width;
        float scaleHeight = newSize / (float)height;

        if(scaleWidth >= 1.0 || scaleHeight >= 1.0) {
            return bitmap;
        }
        
        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);

        Bitmap resizedBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmap.recycle();
        
        return resizedBitmap;
    }

    public static class ListViewPosition {

        public ListViewPosition(int position, int top) {
            this.position = position;
            this.top = top;
        }

        public int position;
        public int top;
    }
}
