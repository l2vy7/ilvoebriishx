package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aku */
/* compiled from: IMASDK */
public final class aku {

    /* renamed from: a */
    private boolean f15181a;

    /* renamed from: a */
    public final synchronized boolean mo13859a() {
        if (this.f15181a) {
            return false;
        }
        this.f15181a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo13860b() throws InterruptedException {
        while (!this.f15181a) {
            wait();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo13861c() {
        return this.f15181a;
    }

    /* renamed from: d */
    public final synchronized void mo13862d() {
        this.f15181a = false;
    }
}
