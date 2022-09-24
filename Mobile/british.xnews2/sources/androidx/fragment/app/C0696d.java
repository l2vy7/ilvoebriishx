package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0722r;
import p089i0.C5421b;
import p110m0.C5720r;
import p150t0.C6092a;
import p150t0.C6093b;

/* renamed from: androidx.fragment.app.d */
/* compiled from: FragmentAnim */
class C0696d {

    /* renamed from: androidx.fragment.app.d$a */
    /* compiled from: FragmentAnim */
    class C0697a implements C5421b.C5422a {

        /* renamed from: a */
        final /* synthetic */ Fragment f3596a;

        C0697a(Fragment fragment) {
            this.f3596a = fragment;
        }

        public void onCancel() {
            if (this.f3596a.mo3452s() != null) {
                View s = this.f3596a.mo3452s();
                this.f3596a.mo3472y1((View) null);
                s.clearAnimation();
            }
            this.f3596a.mo3475z1((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* compiled from: FragmentAnim */
    class C0698b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3597a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3598b;

        /* renamed from: c */
        final /* synthetic */ C0722r.C0729g f3599c;

        /* renamed from: d */
        final /* synthetic */ C5421b f3600d;

        /* renamed from: androidx.fragment.app.d$b$a */
        /* compiled from: FragmentAnim */
        class C0699a implements Runnable {
            C0699a() {
            }

            public void run() {
                if (C0698b.this.f3598b.mo3452s() != null) {
                    C0698b.this.f3598b.mo3472y1((View) null);
                    C0698b bVar = C0698b.this;
                    bVar.f3599c.mo3625a(bVar.f3598b, bVar.f3600d);
                }
            }
        }

        C0698b(ViewGroup viewGroup, Fragment fragment, C0722r.C0729g gVar, C5421b bVar) {
            this.f3597a = viewGroup;
            this.f3598b = fragment;
            this.f3599c = gVar;
            this.f3600d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3597a.post(new C0699a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* compiled from: FragmentAnim */
    class C0700c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3602a;

        /* renamed from: b */
        final /* synthetic */ View f3603b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3604c;

        /* renamed from: d */
        final /* synthetic */ C0722r.C0729g f3605d;

        /* renamed from: e */
        final /* synthetic */ C5421b f3606e;

        C0700c(ViewGroup viewGroup, View view, Fragment fragment, C0722r.C0729g gVar, C5421b bVar) {
            this.f3602a = viewGroup;
            this.f3603b = view;
            this.f3604c = fragment;
            this.f3605d = gVar;
            this.f3606e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3602a.endViewTransition(this.f3603b);
            Animator t = this.f3604c.mo3456t();
            this.f3604c.mo3475z1((Animator) null);
            if (t != null && this.f3602a.indexOfChild(this.f3603b) < 0) {
                this.f3605d.mo3625a(this.f3604c, this.f3606e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    /* compiled from: FragmentAnim */
    static class C0703f extends AnimationSet {
        C0703f(Animation animation) {
            super(false);
            addAnimation(animation);
        }
    }

    /* renamed from: a */
    static void m3958a(Fragment fragment, C0701d dVar, C0722r.C0729g gVar) {
        View view = fragment.f3345I;
        ViewGroup viewGroup = fragment.f3344H;
        viewGroup.startViewTransition(view);
        C5421b bVar = new C5421b();
        bVar.mo21874d(new C0697a(fragment));
        gVar.mo3626b(fragment, bVar);
        if (dVar.f3607a != null) {
            C0702e eVar = new C0702e(dVar.f3607a, viewGroup, view);
            fragment.mo3472y1(fragment.f3345I);
            eVar.setAnimationListener(new C0698b(viewGroup, fragment, gVar, bVar));
            fragment.f3345I.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3608b;
        fragment.mo3475z1(animator);
        animator.addListener(new C0700c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.f3345I);
        animator.start();
    }

    /* renamed from: b */
    static C0701d m3959b(Context context, Fragment fragment, boolean z) {
        int c;
        int I = fragment.mo3365I();
        int H = fragment.mo3362H();
        boolean z2 = false;
        fragment.mo3352D1(0);
        ViewGroup viewGroup = fragment.f3344H;
        if (viewGroup != null) {
            int i = C6093b.f25326c;
            if (viewGroup.getTag(i) != null) {
                fragment.f3344H.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f3344H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation u0 = fragment.mo3461u0(I, z, H);
        if (u0 != null) {
            return new C0701d(u0);
        }
        Animator v0 = fragment.mo3464v0(I, z, H);
        if (v0 != null) {
            return new C0701d(v0);
        }
        if (H != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(H));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, H);
                    if (loadAnimation != null) {
                        return new C0701d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, H);
                    if (loadAnimator != null) {
                        return new C0701d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, H);
                        if (loadAnimation2 != null) {
                            return new C0701d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (I != 0 && (c = m3960c(I, z)) >= 0) {
            return new C0701d(AnimationUtils.loadAnimation(context, c));
        }
        return null;
    }

    /* renamed from: c */
    private static int m3960c(int i, boolean z) {
        if (i == 4097) {
            return z ? C6092a.f25323e : C6092a.f25324f;
        }
        if (i == 4099) {
            return z ? C6092a.f25321c : C6092a.f25322d;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C6092a.f25319a : C6092a.f25320b;
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* compiled from: FragmentAnim */
    static class C0701d {

        /* renamed from: a */
        public final Animation f3607a;

        /* renamed from: b */
        public final Animator f3608b;

        C0701d(Animation animation) {
            this.f3607a = animation;
            this.f3608b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0701d(Animator animator) {
            this.f3607a = null;
            this.f3608b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* compiled from: FragmentAnim */
    static class C0702e extends AnimationSet implements Runnable {

        /* renamed from: b */
        private final ViewGroup f3609b;

        /* renamed from: c */
        private final View f3610c;

        /* renamed from: d */
        private boolean f3611d;

        /* renamed from: e */
        private boolean f3612e;

        /* renamed from: f */
        private boolean f3613f = true;

        C0702e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3609b = viewGroup;
            this.f3610c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3613f = true;
            if (this.f3611d) {
                return !this.f3612e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3611d = true;
                C5720r.m25259a(this.f3609b, this);
            }
            return true;
        }

        public void run() {
            if (this.f3611d || !this.f3613f) {
                this.f3609b.endViewTransition(this.f3610c);
                this.f3612e = true;
                return;
            }
            this.f3613f = false;
            this.f3609b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3613f = true;
            if (this.f3611d) {
                return !this.f3612e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3611d = true;
                C5720r.m25259a(this.f3609b, this);
            }
            return true;
        }
    }
}
