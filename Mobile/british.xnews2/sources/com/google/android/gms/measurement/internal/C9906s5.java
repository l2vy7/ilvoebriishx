package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9906s5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46732b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46733c;

    C9906s5(C9779g6 g6Var, AtomicReference atomicReference) {
        this.f46733c = g6Var;
        this.f46732b = atomicReference;
    }

    public final void run() {
        synchronized (this.f46732b) {
            try {
                this.f46732b.set(Boolean.valueOf(this.f46733c.f21269a.mo19392z().mo19337B(this.f46733c.f21269a.mo19361B().mo19408s(), C9903s2.f46661L)));
                this.f46732b.notify();
            } catch (Throwable th) {
                this.f46732b.notify();
                throw th;
            }
        }
    }
}
