package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9897r6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9844m6 f46641b;

    /* renamed from: c */
    final /* synthetic */ long f46642c;

    /* renamed from: d */
    final /* synthetic */ C9917t6 f46643d;

    C9897r6(C9917t6 t6Var, C9844m6 m6Var, long j) {
        this.f46643d = t6Var;
        this.f46641b = m6Var;
        this.f46642c = j;
    }

    public final void run() {
        this.f46643d.m45363p(this.f46641b, false, this.f46642c);
        C9917t6 t6Var = this.f46643d;
        t6Var.f46752e = null;
        t6Var.f21269a.mo19370L().mo39223u((C9844m6) null);
    }
}
