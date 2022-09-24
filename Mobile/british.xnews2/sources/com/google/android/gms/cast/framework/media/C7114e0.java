package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

/* renamed from: com.google.android.gms.cast.framework.media.e0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7114e0 extends TimerTask {

    /* renamed from: b */
    final /* synthetic */ C4580e f28693b;

    /* renamed from: c */
    final /* synthetic */ C7116f0 f28694c;

    C7114e0(C7116f0 f0Var, C4580e eVar) {
        this.f28694c = f0Var;
        this.f28693b = eVar;
    }

    public final void run() {
        C7116f0 f0Var = this.f28694c;
        f0Var.f28707e.m19855d0(f0Var.f28703a);
        this.f28694c.f28707e.f19926b.postDelayed(this, this.f28694c.f28704b);
    }
}
