package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.C10080c;

/* renamed from: com.google.android.material.circularreveal.a */
/* compiled from: CircularRevealCompat */
public final class C10076a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    /* compiled from: CircularRevealCompat */
    static class C10077a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10080c f47616a;

        C10077a(C10080c cVar) {
            this.f47616a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f47616a.mo40338b();
        }

        public void onAnimationStart(Animator animator) {
            this.f47616a.mo40337a();
        }
    }

    /* renamed from: a */
    public static Animator m46386a(C10080c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C10080c.C10083c.f47629a, C10080c.C10082b.f47627b, new C10080c.C10085e[]{new C10080c.C10085e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C10080c.C10085e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f47633c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m46387b(C10080c cVar) {
        return new C10077a(cVar);
    }
}
