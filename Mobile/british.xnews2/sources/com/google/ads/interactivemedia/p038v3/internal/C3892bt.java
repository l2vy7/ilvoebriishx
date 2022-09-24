package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bt */
/* compiled from: IMASDK */
final class C3892bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f16784a = 0;

    C3892bt() {
    }

    C3892bt(byte[] bArr) {
    }

    public final void run() {
        if (this.f16784a != 0) {
            C3895bw.m16883g(C3895bw.m16881b());
        } else if (C3895bw.f16787c != null) {
            C3895bw.f16787c.post(C3895bw.f16788j);
            C3895bw.f16787c.postDelayed(C3895bw.f16789k, 200);
        }
    }
}
