package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqi */
/* compiled from: IMASDK */
final class aqi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aqs f15567a;

    /* renamed from: b */
    final /* synthetic */ aqj f15568b;

    aqi(aqj aqj, aqs aqs) {
        this.f15568b = aqj;
        this.f15567a = aqs;
    }

    public final void run() {
        synchronized (this.f15568b.f15570b) {
            this.f15568b.f15571c.mo14215a(this.f15567a);
        }
    }
}
