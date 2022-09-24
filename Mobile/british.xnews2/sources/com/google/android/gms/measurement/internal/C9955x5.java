package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9955x5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46852b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46853c;

    C9955x5(C9779g6 g6Var, AtomicReference atomicReference) {
        this.f46853c = g6Var;
        this.f46852b = atomicReference;
    }

    public final void run() {
        synchronized (this.f46852b) {
            try {
                this.f46852b.set(Long.valueOf(this.f46853c.f21269a.mo19392z().mo19351q(this.f46853c.f21269a.mo19361B().mo19408s(), C9903s2.f46663N)));
                this.f46852b.notify();
            } catch (Throwable th) {
                this.f46852b.notify();
                throw th;
            }
        }
    }
}
