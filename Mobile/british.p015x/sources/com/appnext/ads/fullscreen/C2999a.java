package com.appnext.ads.fullscreen;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.appnext.base.C3117a;

/* renamed from: com.appnext.ads.fullscreen.a */
public final class C2999a extends Animation {

    /* renamed from: d */
    private Circle f11995d;

    /* renamed from: e */
    private float f11996e;

    /* renamed from: f */
    private float f11997f;

    public C2999a(Circle circle, float f) {
        setInterpolator(new LinearInterpolator());
        this.f11996e = circle.getAngle();
        this.f11997f = f;
        this.f11995d = circle;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        try {
            float f2 = this.f11996e;
            this.f11995d.setAngle(f2 - ((f2 - this.f11997f) * f));
            this.f11995d.invalidate();
            this.f11995d.requestLayout();
        } catch (Throwable th) {
            C3117a.m10553a("CircleAngleAnimation$applyTransformation", th);
        }
    }
}
