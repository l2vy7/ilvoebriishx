package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.C1344b;
import p155u0.C6172b;
import p199d6.C10495c;
import p207f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.d */
/* compiled from: CircularIndeterminateAnimatorDelegate */
final class C10253d extends C10265h<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f48251l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f48252m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f48253n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<C10253d, Float> f48254o;

    /* renamed from: p */
    private static final Property<C10253d, Float> f48255p;

    /* renamed from: d */
    private ObjectAnimator f48256d;

    /* renamed from: e */
    private ObjectAnimator f48257e;

    /* renamed from: f */
    private final C6172b f48258f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10251b f48259g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f48260h = 0;

    /* renamed from: i */
    private float f48261i;

    /* renamed from: j */
    private float f48262j;

    /* renamed from: k */
    C1344b f48263k = null;

    /* renamed from: com.google.android.material.progressindicator.d$a */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    class C10254a extends AnimatorListenerAdapter {
        C10254a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C10253d dVar = C10253d.this;
            int unused = dVar.f48260h = (dVar.f48260h + 4) % C10253d.this.f48259g.f48243c.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$b */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    class C10255b extends AnimatorListenerAdapter {
        C10255b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C10253d.this.mo41188a();
            C10253d dVar = C10253d.this;
            dVar.f48263k.mo6391a(dVar.f48291a);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$c */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    static class C10256c extends Property<C10253d, Float> {
        C10256c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C10253d dVar) {
            return Float.valueOf(dVar.m47262o());
        }

        /* renamed from: b */
        public void set(C10253d dVar, Float f) {
            dVar.mo41195t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    static class C10257d extends Property<C10253d, Float> {
        C10257d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C10253d dVar) {
            return Float.valueOf(dVar.m47263p());
        }

        /* renamed from: b */
        public void set(C10253d dVar, Float f) {
            dVar.m47266u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f48254o = new C10256c(cls, "animationFraction");
        f48255p = new C10257d(cls, "completeEndFraction");
    }

    public C10253d(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f48259g = circularProgressIndicatorSpec;
        this.f48258f = new C6172b();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public float m47262o() {
        return this.f48261i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public float m47263p() {
        return this.f48262j;
    }

    /* renamed from: q */
    private void m47264q() {
        if (this.f48256d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48254o, new float[]{0.0f, 1.0f});
            this.f48256d = ofFloat;
            ofFloat.setDuration(5400);
            this.f48256d.setInterpolator((TimeInterpolator) null);
            this.f48256d.setRepeatCount(-1);
            this.f48256d.addListener(new C10254a());
        }
        if (this.f48257e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f48255p, new float[]{0.0f, 1.0f});
            this.f48257e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f48257e.setInterpolator(this.f48258f);
            this.f48257e.addListener(new C10255b());
        }
    }

    /* renamed from: r */
    private void m47265r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo41241b(i, f48253n[i2], 333);
            if (b < 0.0f || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f48260h;
                int[] iArr = this.f48259g.f48243c;
                int length = i3 % iArr.length;
                int a = C10538a.m48267a(iArr[length], this.f48291a.getAlpha());
                int a2 = C10538a.m48267a(this.f48259g.f48243c[(length + 1) % iArr.length], this.f48291a.getAlpha());
                this.f48293c[0] = C10495c.m48202b().evaluate(this.f48258f.getInterpolation(b), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m47266u(float f) {
        this.f48262j = f;
    }

    /* renamed from: v */
    private void m47267v(int i) {
        float[] fArr = this.f48292b;
        float f = this.f48261i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo41241b(i, f48251l[i2], 667);
            float[] fArr2 = this.f48292b;
            fArr2[1] = fArr2[1] + (this.f48258f.getInterpolation(b) * 250.0f);
            float b2 = mo41241b(i, f48252m[i2], 667);
            float[] fArr3 = this.f48292b;
            fArr3[0] = fArr3[0] + (this.f48258f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f48292b;
        fArr4[0] = fArr4[0] + ((fArr4[1] - fArr4[0]) * this.f48262j);
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41188a() {
        ObjectAnimator objectAnimator = this.f48256d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo41189c() {
        mo41194s();
    }

    /* renamed from: d */
    public void mo41190d(C1344b bVar) {
        this.f48263k = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo41191f() {
        if (!this.f48257e.isRunning()) {
            if (this.f48291a.isVisible()) {
                this.f48257e.start();
            } else {
                mo41188a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo41192g() {
        m47264q();
        mo41194s();
        this.f48256d.start();
    }

    /* renamed from: h */
    public void mo41193h() {
        this.f48263k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo41194s() {
        this.f48260h = 0;
        this.f48293c[0] = C10538a.m48267a(this.f48259g.f48243c[0], this.f48291a.getAlpha());
        this.f48262j = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo41195t(float f) {
        this.f48261i = f;
        int i = (int) (f * 5400.0f);
        m47267v(i);
        m47265r(i);
        this.f48291a.invalidateSelf();
    }
}
