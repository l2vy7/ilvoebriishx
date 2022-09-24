package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9843m5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ long f46465b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46466c;

    C9843m5(C9779g6 g6Var, long j) {
        this.f46466c = g6Var;
        this.f46465b = j;
    }

    public final void run() {
        this.f46466c.f21269a.mo19365F().f21335k.mo39076b(this.f46465b);
        this.f46466c.f21269a.mo19276j().mo19281p().mo38857b("Session timeout duration set", Long.valueOf(this.f46465b));
    }
}
