package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzp extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ zzr f27814a;

    zzp(zzr zzr) {
        this.f27814a = zzr;
    }

    /* renamed from: a */
    private final void m28795a(boolean z) {
        this.f27814a.setClickable(z);
        this.f27814a.f27815b.setClickable(z);
    }

    public final void onAnimationCancel(Animator animator) {
        m28795a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        m28795a(true);
    }

    public final void onAnimationStart(Animator animator) {
        m28795a(false);
    }
}
