package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.ads.interactivemedia.v3.internal.air */
/* compiled from: IMASDK */
public final class air extends FrameLayout {

    /* renamed from: a */
    private final aiq f15010a = new aiq(this);

    /* renamed from: b */
    private float f15011b;

    /* renamed from: c */
    private final int f15012c = 0;

    public air(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo13785a(float f) {
        if (this.f15011b != f) {
            this.f15011b = f;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f15011b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = (this.f15011b / (f / f2)) - 4.0f;
            if (Math.abs(f3) <= 0.01f) {
                this.f15010a.mo13783a();
                return;
            }
            if (f3 > 0.0f) {
                measuredHeight = (int) (f / this.f15011b);
            } else {
                measuredWidth = (int) (f2 * this.f15011b);
            }
            this.f15010a.mo13783a();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }
}
