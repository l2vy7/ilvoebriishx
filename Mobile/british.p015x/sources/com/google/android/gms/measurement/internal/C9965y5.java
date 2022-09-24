package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9965y5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46903b;

    /* renamed from: c */
    final /* synthetic */ C9779g6 f46904c;

    C9965y5(C9779g6 g6Var, AtomicReference atomicReference) {
        this.f46904c = g6Var;
        this.f46903b = atomicReference;
    }

    public final void run() {
        synchronized (this.f46903b) {
            try {
                this.f46903b.set(Integer.valueOf(this.f46904c.f21269a.mo19392z().mo19348n(this.f46904c.f21269a.mo19361B().mo19408s(), C9903s2.f46664O)));
                this.f46903b.notify();
            } catch (Throwable th) {
                this.f46903b.notify();
                throw th;
            }
        }
    }
}
