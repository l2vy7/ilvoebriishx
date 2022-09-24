package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C7302r0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7306s0 f29101b;

    /* synthetic */ C7302r0(C7306s0 s0Var, C7297q0 q0Var) {
        this.f29101b = s0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29885a();

    public final void run() {
        Lock y;
        this.f29101b.f29107b.lock();
        try {
            if (Thread.interrupted()) {
                y = this.f29101b.f29107b;
            } else {
                mo29885a();
                y = this.f29101b.f29107b;
            }
        } catch (RuntimeException e) {
            this.f29101b.f29106a.mo17923p(e);
            y = this.f29101b.f29107b;
        } catch (Throwable th) {
            this.f29101b.f29107b.unlock();
            throw th;
        }
        y.unlock();
    }
}
