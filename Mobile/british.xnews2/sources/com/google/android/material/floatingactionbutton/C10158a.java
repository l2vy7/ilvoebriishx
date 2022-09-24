package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: AnimatorTracker */
class C10158a {

    /* renamed from: a */
    private Animator f47858a;

    C10158a() {
    }

    /* renamed from: a */
    public void mo40686a() {
        Animator animator = this.f47858a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo40687b() {
        this.f47858a = null;
    }

    /* renamed from: c */
    public void mo40688c(Animator animator) {
        mo40686a();
        this.f47858a = animator;
    }
}
