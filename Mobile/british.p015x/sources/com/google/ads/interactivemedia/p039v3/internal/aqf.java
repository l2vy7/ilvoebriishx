package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqf */
/* compiled from: IMASDK */
final class aqf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqg f15563a;

    aqf(aqg aqg) {
        this.f15563a = aqg;
    }

    public final void run() {
        synchronized (this.f15563a.f15565b) {
            if (this.f15563a.f15566c != null) {
                this.f15563a.f15566c.mo14212d();
            }
        }
    }
}
