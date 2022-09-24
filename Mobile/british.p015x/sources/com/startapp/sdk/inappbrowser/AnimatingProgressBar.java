package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* compiled from: Sta */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final Interpolator f54699c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f54700a;

    /* renamed from: b */
    public boolean f54701b = false;

    /* renamed from: com.startapp.sdk.inappbrowser.AnimatingProgressBar$a */
    /* compiled from: Sta */
    public class C12315a implements ValueAnimator.AnimatorUpdateListener {
        public C12315a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatingProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f54701b = Build.VERSION.SDK_INT >= 11 ? true : z;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f54700a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setProgress(int i) {
        if (!this.f54701b) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f54700a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f54700a = ofInt;
            ofInt.setInterpolator(f54699c);
            this.f54700a.addUpdateListener(new C12315a());
        }
        this.f54700a.setIntValues(new int[]{getProgress(), i});
        this.f54700a.start();
    }

    /* renamed from: a */
    public void mo46450a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f54700a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
