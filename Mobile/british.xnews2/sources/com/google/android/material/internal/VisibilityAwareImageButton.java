package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b */
    private int f47996b;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo40884b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f47996b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f47996b;
    }

    public void setVisibility(int i) {
        mo40884b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47996b = getVisibility();
    }
}
