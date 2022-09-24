package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rx1 {

    /* renamed from: a */
    private final ov1 f38797a;

    /* renamed from: b */
    private boolean f38798b;

    public rx1(ov1 ov1) {
        this.f38797a = ov1;
    }

    /* renamed from: a */
    public final synchronized void mo34629a() throws InterruptedException {
        while (!this.f38798b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo34630b() {
        boolean z = false;
        while (!this.f38798b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo34631c() {
        boolean z;
        z = this.f38798b;
        this.f38798b = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo34632d() {
        return this.f38798b;
    }

    /* renamed from: e */
    public final synchronized boolean mo34633e() {
        if (this.f38798b) {
            return false;
        }
        this.f38798b = true;
        notifyAll();
        return true;
    }
}
