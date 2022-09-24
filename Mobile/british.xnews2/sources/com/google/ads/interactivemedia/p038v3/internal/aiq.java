package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiq */
/* compiled from: IMASDK */
final class aiq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ air f15008a;

    /* renamed from: b */
    private boolean f15009b;

    /* synthetic */ aiq(air air) {
        this.f15008a = air;
    }

    /* renamed from: a */
    public final void mo13783a() {
        if (!this.f15009b) {
            this.f15009b = true;
            this.f15008a.post(this);
        }
    }

    public final void run() {
        this.f15009b = false;
    }
}
