package ua.in.quireg.chan.interfaces;

import ua.in.quireg.chan.ui.controls.ClickableURLSpan;

import android.view.View;

public interface IURLSpanClickListener {
    void onClick(View v, ClickableURLSpan span, String url);
}
