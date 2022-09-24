package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqo */
/* compiled from: IMASDK */
final class aqo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqs f15577a;

    /* renamed from: b */
    final /* synthetic */ aqp f15578b;

    aqo(aqp aqp, aqs aqs) {
        this.f15578b = aqp;
        this.f15577a = aqs;
    }

    public final void run() {
        synchronized (this.f15578b.f15580b) {
            if (this.f15578b.f15581c != null) {
                this.f15578b.f15581c.mo14210b(this.f15577a.mo14221d());
            }
        }
    }
}
