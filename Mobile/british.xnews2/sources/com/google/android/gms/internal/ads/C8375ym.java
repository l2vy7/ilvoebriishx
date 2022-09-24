package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.ym */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8375ym implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Surface f41924b;

    /* renamed from: c */
    final /* synthetic */ C7509an f41925c;

    C8375ym(C7509an anVar, Surface surface) {
        this.f41925c = anVar;
        this.f41924b = surface;
    }

    public final void run() {
        this.f41925c.f29695b.mo30736y(this.f41924b);
    }
}
