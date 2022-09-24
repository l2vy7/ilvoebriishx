package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.C1344b;
import java.util.Arrays;
import p155u0.C6172b;
import p207f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.k */
/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
final class C10268k extends C10265h<ObjectAnimator> {

    /* renamed from: j */
    private static final Property<C10268k, Float> f48299j = new C10270b(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f48300d;

    /* renamed from: e */
    private C6172b f48301e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10251b f48302f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f48303g = 1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f48304h;

    /* renamed from: i */
    private float f48305i;

    /* renamed from: com.google.android.material.progressindicator.k$a */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    class C10269a extends AnimatorListenerAdapter {
        C10269a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C10268k kVar = C10268k.this;
            int unused = kVar.f48303g = (kVar.f48303g + 1) % C10268k.this.f48302f.f48243c.length;
            boolean unused2 = C10268k.this.f48304h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.k$b */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    static class C10270b extends Property<C10268k, Float> {
        C10270b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C10268k kVar) {
            return Float.valueOf(kVar.m47359n());
        }

        /* renamed from: b */
        public void set(C10268k kVar, Float f) {
            kVar.mo41251r(f.floatValue());
        }
    }

    public C10268k(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f48302f = linearProgressIndicatorSpec;
        this.f48301e = new C6172b();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m47359n() {
        return this.f48305i;
    }

    /* renamed from: o */
    private void m47360o() {
        if (this.f48300d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48299j, new float[]{0.0f, 1.0f});
            this.f48300d = ofFloat;
            ofFloat.setDuration(333);
            this.f48300d.setInterpolator((TimeInterpolator) null);
            this.f48300d.setRepeatCount(-1);
            this.f48300d.addListener(new C10269a());
        }
    }

    /* renamed from: p */
    private void m47361p() {
        if (this.f48304h && this.f48292b[3] < 1.0f) {
            int[] iArr = this.f48293c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = C10538a.m48267a(this.f48302f.f48243c[this.f48303g], this.f48291a.getAlpha());
            this.f48304h = false;
        }
    }

    /* renamed from: s */
    private void m47362s(int i) {
        this.f48292b[0] = 0.0f;
        float b = mo41241b(i, 0, 667);
        float[] fArr = this.f48292b;
        float interpolation = this.f48301e.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f48292b;
        float interpolation2 = this.f48301e.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f48292b[5] = 1.0f;
    }

    /* renamed from: a */
    public void mo41188a() {
        ObjectAnimator objectAnimator = this.f48300d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo41189c() {
        mo41250q();
    }

    /* renamed from: d */
    public void mo41190d(C1344b bVar) {
    }

    /* renamed from: f */
    public void mo41191f() {
    }

    /* renamed from: g */
    public void mo41192g() {
        m47360o();
        mo41250q();
        this.f48300d.start();
    }

    /* renamed from: h */
    public void mo41193h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo41250q() {
        this.f48304h = true;
        this.f48303g = 1;
        Arrays.fill(this.f48293c, C10538a.m48267a(this.f48302f.f48243c[0], this.f48291a.getAlpha()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo41251r(float f) {
        this.f48305i = f;
        m47362s((int) (f * 333.0f));
        m47361p();
        this.f48291a.invalidateSelf();
    }
}
