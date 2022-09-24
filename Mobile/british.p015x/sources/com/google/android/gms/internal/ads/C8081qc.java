package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8081qc implements Callable {

    /* renamed from: a */
    private final C8400zb f37965a;

    /* renamed from: b */
    private final C7600d8 f37966b;

    public C8081qc(C8400zb zbVar, C7600d8 d8Var) {
        this.f37965a = zbVar;
        this.f37966b = d8Var;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f37965a.mo36038l() != null) {
            this.f37965a.mo36038l().get();
        }
        C8218u8 c = this.f37965a.mo36030c();
        if (c == null) {
            return null;
        }
        try {
            synchronized (this.f37966b) {
                C7600d8 d8Var = this.f37966b;
                byte[] g = c.mo33365g();
                d8Var.mo32423o(g, 0, g.length, wo3.m39219a());
            }
            return null;
        } catch (wp3 | NullPointerException unused) {
            return null;
        }
    }
}
