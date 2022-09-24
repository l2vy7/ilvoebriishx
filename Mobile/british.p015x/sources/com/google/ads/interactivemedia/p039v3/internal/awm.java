package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.awb;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awm */
/* compiled from: IMASDK */
final class awm extends awb.C3865i<Void> implements Runnable {

    /* renamed from: a */
    private final Runnable f15858a;

    public awm(Runnable runnable) {
        ars.m14627g(runnable);
        this.f15858a = runnable;
    }

    public final void run() {
        try {
            this.f15858a.run();
        } catch (Throwable th) {
            mo14665o(th);
            arw.m14643a(th);
            throw new RuntimeException(th);
        }
    }
}
