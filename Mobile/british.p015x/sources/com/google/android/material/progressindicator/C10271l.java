package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.C1344b;
import androidx.vectordrawable.graphics.drawable.C1349d;
import java.util.Arrays;
import p194c6.C6521a;
import p208f6.C10538a;

/* renamed from: com.google.android.material.progressindicator.l */
/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
final class C10271l extends C10265h<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f48307l = {533, 567, 850, 750};

    /* renamed from: m */
    private static final int[] f48308m = {1267, 1000, 333, 0};

    /* renamed from: n */
    private static final Property<C10271l, Float> f48309n = new C10273b(Float.class, "animationFraction");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ObjectAnimator f48310d;

    /* renamed from: e */
    private final Interpolator[] f48311e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10251b f48312f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f48313g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f48314h;

    /* renamed from: i */
    private float f48315i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f48316j;

    /* renamed from: k */
    C1344b f48317k = null;

    /* renamed from: com.google.android.material.progressindicator.l$a */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    class C10272a extends AnimatorListenerAdapter {
        C10272a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (C10271l.this.f48316j) {
                C10271l.this.f48310d.setRepeatCount(-1);
                C10271l lVar = C10271l.this;
                lVar.f48317k.mo6391a(lVar.f48291a);
                boolean unused = C10271l.this.f48316j = false;
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C10271l lVar = C10271l.this;
            int unused = lVar.f48313g = (lVar.f48313g + 1) % C10271l.this.f48312f.f48243c.length;
            boolean unused2 = C10271l.this.f48314h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.l$b */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    static class C10273b extends Property<C10271l, Float> {
        C10273b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C10271l lVar) {
            return Float.valueOf(lVar.m47381q());
        }

        /* renamed from: b */
        public void set(C10271l lVar, Float f) {
            lVar.mo41258u(f.floatValue());
        }
    }

    public C10271l(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f48312f = linearProgressIndicatorSpec;
        this.f48311e = new Interpolator[]{C1349d.m7165b(context, C6521a.linear_indeterminate_line1_head_interpolator), C1349d.m7165b(context, C6521a.linear_indeterminate_line1_tail_interpolator), C1349d.m7165b(context, C6521a.linear_indeterminate_line2_head_interpolator), C1349d.m7165b(context, C6521a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public float m47381q() {
        return this.f48315i;
    }

    /* renamed from: r */
    private void m47382r() {
        if (this.f48310d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48309n, new float[]{0.0f, 1.0f});
            this.f48310d = ofFloat;
            ofFloat.setDuration(1800);
            this.f48310d.setInterpolator((TimeInterpolator) null);
            this.f48310d.setRepeatCount(-1);
            this.f48310d.addListener(new C10272a());
        }
    }

    /* renamed from: s */
    private void m47383s() {
        if (this.f48314h) {
            Arrays.fill(this.f48293c, C10538a.m48267a(this.f48312f.f48243c[this.f48313g], this.f48291a.getAlpha()));
            this.f48314h = false;
        }
    }

    /* renamed from: v */
    private void m47384v(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f48292b[i2] = Math.max(0.0f, Math.min(1.0f, this.f48311e[i2].getInterpolation(mo41241b(i, f48308m[i2], f48307l[i2]))));
        }
    }

    /* renamed from: a */
    public void mo41188a() {
        ObjectAnimator objectAnimator = this.f48310d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo41189c() {
        mo41257t();
    }

    /* renamed from: d */
    public void mo41190d(C1344b bVar) {
        this.f48317k = bVar;
    }

    /* renamed from: f */
    public void mo41191f() {
        if (this.f48291a.isVisible()) {
            this.f48316j = true;
            this.f48310d.setRepeatCount(0);
            return;
        }
        mo41188a();
    }

    /* renamed from: g */
    public void mo41192g() {
        m47382r();
        mo41257t();
        this.f48310d.start();
    }

    /* renamed from: h */
    public void mo41193h() {
        this.f48317k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo41257t() {
        this.f48313g = 0;
        int a = C10538a.m48267a(this.f48312f.f48243c[0], this.f48291a.getAlpha());
        int[] iArr = this.f48293c;
        iArr[0] = a;
        iArr[1] = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo41258u(float f) {
        this.f48315i = f;
        m47384v((int) (f * 1800.0f));
        m47383s();
        this.f48291a.invalidateSelf();
    }
}
