package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9815k implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9747d5 f46394b;

    /* renamed from: c */
    final /* synthetic */ C9826l f46395c;

    C9815k(C9826l lVar, C9747d5 d5Var) {
        this.f46395c = lVar;
        this.f46394b = d5Var;
    }

    public final void run() {
        this.f46394b.mo19275g();
        if (C9721b.m45001a()) {
            this.f46394b.mo19273e().mo38909z(this);
            return;
        }
        boolean e = this.f46395c.mo39050e();
        this.f46395c.f46424c = 0;
        if (e) {
            this.f46395c.mo38885c();
        }
    }
}
