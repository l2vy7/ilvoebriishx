package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9876p5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ long f46573b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46574c;

    C9876p5(C9779g6 g6Var, long j) {
        this.f46574c = g6Var;
        this.f46573b = j;
    }

    public final void run() {
        this.f46574c.mo38961z(this.f46573b, true);
        this.f46574c.f21269a.mo19370L().mo39212S(new AtomicReference());
    }
}
