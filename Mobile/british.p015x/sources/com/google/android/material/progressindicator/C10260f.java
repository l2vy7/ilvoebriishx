package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.C1344b;
import java.util.ArrayList;
import java.util.List;
import p200d6.C10493a;
import p230l6.C10724a;

/* renamed from: com.google.android.material.progressindicator.f */
/* compiled from: DrawableWithAnimatedVisibilityChange */
abstract class C10260f extends Drawable implements Animatable {

    /* renamed from: p */
    private static final Property<C10260f, Float> f48272p = new C10263c(Float.class, "growFraction");

    /* renamed from: b */
    final Context f48273b;

    /* renamed from: c */
    final C10251b f48274c;

    /* renamed from: d */
    C10724a f48275d;

    /* renamed from: e */
    private ValueAnimator f48276e;

    /* renamed from: f */
    private ValueAnimator f48277f;

    /* renamed from: g */
    private boolean f48278g;

    /* renamed from: h */
    private boolean f48279h;

    /* renamed from: i */
    private float f48280i;

    /* renamed from: j */
    private List<C1344b> f48281j;

    /* renamed from: k */
    private C1344b f48282k;

    /* renamed from: l */
    private boolean f48283l;

    /* renamed from: m */
    private float f48284m;

    /* renamed from: n */
    final Paint f48285n = new Paint();

    /* renamed from: o */
    private int f48286o;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    class C10261a extends AnimatorListenerAdapter {
        C10261a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C10260f.this.m47304e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.f$b */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    class C10262b extends AnimatorListenerAdapter {
        C10262b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = C10260f.super.setVisible(false, false);
            C10260f.this.m47303d();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.f$c */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    static class C10263c extends Property<C10260f, Float> {
        C10263c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C10260f fVar) {
            return Float.valueOf(fVar.mo41231g());
        }

        /* renamed from: b */
        public void set(C10260f fVar, Float f) {
            fVar.mo41232m(f.floatValue());
        }
    }

    C10260f(Context context, C10251b bVar) {
        this.f48273b = context;
        this.f48274c = bVar;
        this.f48275d = new C10724a();
        setAlpha(255);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m47303d() {
        C1344b bVar = this.f48282k;
        if (bVar != null) {
            bVar.mo6391a(this);
        }
        List<C1344b> list = this.f48281j;
        if (list != null && !this.f48283l) {
            for (C1344b a : list) {
                a.mo6391a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m47304e() {
        C1344b bVar = this.f48282k;
        if (bVar != null) {
            bVar.mo6392b(this);
        }
        List<C1344b> list = this.f48281j;
        if (list != null && !this.f48283l) {
            for (C1344b b : list) {
                b.mo6392b(this);
            }
        }
    }

    /* renamed from: f */
    private void m47305f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f48283l;
        this.f48283l = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f48283l = z;
    }

    /* renamed from: k */
    private void m47306k() {
        if (this.f48276e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f48272p, new float[]{0.0f, 1.0f});
            this.f48276e = ofFloat;
            ofFloat.setDuration(500);
            this.f48276e.setInterpolator(C10493a.f49009b);
            m47308o(this.f48276e);
        }
        if (this.f48277f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f48272p, new float[]{1.0f, 0.0f});
            this.f48277f = ofFloat2;
            ofFloat2.setDuration(500);
            this.f48277f.setInterpolator(C10493a.f49009b);
            m47307n(this.f48277f);
        }
    }

    /* renamed from: n */
    private void m47307n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f48277f;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f48277f = valueAnimator;
            valueAnimator.addListener(new C10262b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: o */
    private void m47308o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f48276e;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f48276e = valueAnimator;
            valueAnimator.addListener(new C10261a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo41231g() {
        if (!this.f48274c.mo41182b() && !this.f48274c.mo41181a()) {
            return 1.0f;
        }
        if (this.f48279h || this.f48278g) {
            return this.f48280i;
        }
        return this.f48284m;
    }

    public int getAlpha() {
        return this.f48286o;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo41212h() {
        return mo41219p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo41213i() {
        ValueAnimator valueAnimator = this.f48277f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f48279h;
    }

    public boolean isRunning() {
        return mo41215j() || mo41213i();
    }

    /* renamed from: j */
    public boolean mo41215j() {
        ValueAnimator valueAnimator = this.f48276e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f48278g;
    }

    /* renamed from: l */
    public void mo41217l(C1344b bVar) {
        if (this.f48281j == null) {
            this.f48281j = new ArrayList();
        }
        if (!this.f48281j.contains(bVar)) {
            this.f48281j.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo41232m(float f) {
        if (this.f48284m != f) {
            this.f48284m = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo41219p(boolean z, boolean z2, boolean z3) {
        return mo41220q(z, z2, z3 && this.f48275d.mo42876a(this.f48273b.getContentResolver()) > 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo41220q(boolean z, boolean z2, boolean z3) {
        m47306k();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f48276e : this.f48277f;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m47305f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(z ? this.f48274c.mo41182b() : this.f48274c.mo41181a())) {
                m47305f(valueAnimator);
                return z4;
            }
            if (z2 || Build.VERSION.SDK_INT < 19 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo41221r(C1344b bVar) {
        List<C1344b> list = this.f48281j;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f48281j.remove(bVar);
        if (!this.f48281j.isEmpty()) {
            return true;
        }
        this.f48281j = null;
        return true;
    }

    public void setAlpha(int i) {
        this.f48286o = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f48285n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo41219p(z, z2, true);
    }

    public void start() {
        mo41220q(true, true, false);
    }

    public void stop() {
        mo41220q(false, true, false);
    }
}
