package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: com.google.android.material.internal.n */
/* compiled from: ToolbarUtils */
public class C10221n {
    /* renamed from: a */
    public static TextView m47118a(Toolbar toolbar) {
        return m47119b(toolbar, toolbar.getSubtitle());
    }

    /* renamed from: b */
    private static TextView m47119b(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static TextView m47120c(Toolbar toolbar) {
        return m47119b(toolbar, toolbar.getTitle());
    }
}
