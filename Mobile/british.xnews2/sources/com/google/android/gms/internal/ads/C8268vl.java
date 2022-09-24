package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8268vl {

    /* renamed from: a */
    private boolean f40458a;

    /* renamed from: a */
    public final synchronized void mo35437a() throws InterruptedException {
        while (!this.f40458a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo35438b() {
        boolean z;
        z = this.f40458a;
        this.f40458a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo35439c() {
        if (this.f40458a) {
            return false;
        }
        this.f40458a = true;
        notifyAll();
        return true;
    }
}
