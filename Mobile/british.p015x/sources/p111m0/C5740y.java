package p111m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: m0.y */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C5740y {

    /* renamed from: a */
    private WeakReference<View> f24375a;

    /* renamed from: b */
    Runnable f24376b = null;

    /* renamed from: c */
    Runnable f24377c = null;

    /* renamed from: d */
    int f24378d = -1;

    /* renamed from: m0.y$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C5741a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5744z f24379a;

        /* renamed from: b */
        final /* synthetic */ View f24380b;

        C5741a(C5744z zVar, View view) {
            this.f24379a = zVar;
            this.f24380b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f24379a.mo2054a(this.f24380b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f24379a.mo875b(this.f24380b);
        }

        public void onAnimationStart(Animator animator) {
            this.f24379a.mo876c(this.f24380b);
        }
    }

    /* renamed from: m0.y$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C5742b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5688b0 f24382a;

        /* renamed from: b */
        final /* synthetic */ View f24383b;

        C5742b(C5688b0 b0Var, View view) {
            this.f24382a = b0Var;
            this.f24383b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24382a.mo974a(this.f24383b);
        }
    }

    /* renamed from: m0.y$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C5743c implements C5744z {

        /* renamed from: a */
        C5740y f24385a;

        /* renamed from: b */
        boolean f24386b;

        C5743c(C5740y yVar) {
            this.f24385a = yVar;
        }

        /* renamed from: a */
        public void mo2054a(View view) {
            Object tag = view.getTag(2113929216);
            C5744z zVar = tag instanceof C5744z ? (C5744z) tag : null;
            if (zVar != null) {
                zVar.mo2054a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: m0.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo875b(android.view.View r4) {
            /*
                r3 = this;
                m0.y r0 = r3.f24385a
                int r0 = r0.f24378d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                m0.y r0 = r3.f24385a
                r0.f24378d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f24386b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                m0.y r0 = r3.f24385a
                java.lang.Runnable r1 = r0.f24377c
                if (r1 == 0) goto L_0x0024
                r0.f24377c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p111m0.C5744z
                if (r1 == 0) goto L_0x0031
                r2 = r0
                m0.z r2 = (p111m0.C5744z) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo875b(r4)
            L_0x0036:
                r4 = 1
                r3.f24386b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111m0.C5740y.C5743c.mo875b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: m0.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo876c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f24386b = r0
                m0.y r0 = r3.f24385a
                int r0 = r0.f24378d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                m0.y r0 = r3.f24385a
                java.lang.Runnable r2 = r0.f24376b
                if (r2 == 0) goto L_0x001a
                r0.f24376b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p111m0.C5744z
                if (r2 == 0) goto L_0x0027
                r1 = r0
                m0.z r1 = (p111m0.C5744z) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo876c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111m0.C5740y.C5743c.mo876c(android.view.View):void");
        }
    }

    C5740y(View view) {
        this.f24375a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m25415g(View view, C5744z zVar) {
        if (zVar != null) {
            view.animate().setListener(new C5741a(zVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C5740y mo22504a(float f) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo22505b() {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo22506c() {
        View view = (View) this.f24375a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C5740y mo22507d(long j) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C5740y mo22508e(Interpolator interpolator) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C5740y mo22509f(C5744z zVar) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m25415g(view, zVar);
            } else {
                view.setTag(2113929216, zVar);
                m25415g(view, new C5743c(this));
            }
        }
        return this;
    }

    /* renamed from: h */
    public C5740y mo22510h(long j) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C5740y mo22511i(C5688b0 b0Var) {
        View view = (View) this.f24375a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C5742b bVar = null;
            if (b0Var != null) {
                bVar = new C5742b(b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void mo22512j() {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C5740y mo22513k(float f) {
        View view = (View) this.f24375a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
