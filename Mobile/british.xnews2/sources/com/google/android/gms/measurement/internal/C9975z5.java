package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9975z5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46920b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46921c;

    C9975z5(C9779g6 g6Var, AtomicReference atomicReference) {
        this.f46921c = g6Var;
        this.f46920b = atomicReference;
    }

    public final void run() {
        synchronized (this.f46920b) {
            try {
                this.f46920b.set(Double.valueOf(this.f46921c.f21269a.mo19392z().mo19344i(this.f46921c.f21269a.mo19361B().mo19408s(), C9903s2.f46665P)));
                this.f46920b.notify();
            } catch (Throwable th) {
                this.f46920b.notify();
                throw th;
            }
        }
    }
}
