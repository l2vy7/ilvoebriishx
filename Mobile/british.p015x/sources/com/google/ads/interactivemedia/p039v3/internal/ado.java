package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ado */
/* compiled from: IMASDK */
public final class ado extends acu {

    /* renamed from: m */
    private final int f14291m;

    /* renamed from: n */
    private final C4120ke f14292n;

    /* renamed from: o */
    private long f14293o;

    /* renamed from: p */
    private boolean f14294p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ado(ajg ajg, ajk ajk, C4120ke keVar, int i, long j, long j2, long j3, int i2, C4120ke keVar2) {
        super(ajg, ajk, keVar, i, j, j2, C6540C.TIME_UNSET, C6540C.TIME_UNSET, j3);
        this.f14291m = i2;
        this.f14292n = keVar2;
    }

    /* renamed from: b */
    public final void mo13355b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo13356c() throws IOException {
        acw e = mo13466e();
        e.mo13471b(0);
        C4327rw c = e.mo13472c(this.f14291m);
        c.mo13403a(this.f14292n);
        try {
            long c2 = this.f14246k.mo13296c(this.f14239d.mo13813c(this.f14293o));
            if (c2 != -1) {
                c2 += this.f14293o;
            }
            C4302qy qyVar = new C4302qy(this.f14246k, this.f14293o, c2);
            for (int i = 0; i != -1; i = c.mo13405c(qyVar, Integer.MAX_VALUE, true)) {
                this.f14293o += (long) i;
            }
            c.mo13404b(this.f14244i, 1, (int) this.f14293o, 0, (C4326rv) null);
            amm.m14247q(this.f14246k);
            this.f14294p = true;
        } catch (Throwable th) {
            amm.m14247q(this.f14246k);
            throw th;
        }
    }

    /* renamed from: j */
    public final boolean mo13503j() {
        return this.f14294p;
    }
}
