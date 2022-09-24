package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.are */
/* compiled from: IMASDK */
final class are implements arf {

    /* renamed from: a */
    private final CountDownLatch f15604a = new CountDownLatch(1);

    private are() {
    }

    /* renamed from: a */
    public final boolean mo14241a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f15604a.await(j, timeUnit);
    }

    /* renamed from: b */
    public final void mo14210b(Object obj) {
        this.f15604a.countDown();
    }

    /* renamed from: c */
    public final void mo14211c(Exception exc) {
        this.f15604a.countDown();
    }

    /* renamed from: d */
    public final void mo14212d() {
        this.f15604a.countDown();
    }

    /* synthetic */ are(byte[] bArr) {
    }
}
