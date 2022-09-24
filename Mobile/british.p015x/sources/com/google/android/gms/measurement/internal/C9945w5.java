package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9945w5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46829b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46830c;

    C9945w5(C9779g6 g6Var, AtomicReference atomicReference) {
        this.f46830c = g6Var;
        this.f46829b = atomicReference;
    }

    public final void run() {
        synchronized (this.f46829b) {
            try {
                this.f46829b.set(this.f46830c.f21269a.mo19392z().mo19357x(this.f46830c.f21269a.mo19361B().mo19408s(), C9903s2.f46662M));
                this.f46829b.notify();
            } catch (Throwable th) {
                this.f46829b.notify();
                throw th;
            }
        }
    }
}
