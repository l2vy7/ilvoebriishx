package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adi */
/* compiled from: IMASDK */
public final class adi extends acu {

    /* renamed from: m */
    private final int f14277m;

    /* renamed from: n */
    private final long f14278n;

    /* renamed from: o */
    private final adc f14279o;

    /* renamed from: p */
    private long f14280p;

    /* renamed from: q */
    private volatile boolean f14281q;

    /* renamed from: r */
    private boolean f14282r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adi(ajg ajg, ajk ajk, C4120ke keVar, int i, long j, long j2, long j3, long j4, long j5, int i2, long j6, adc adc) {
        super(ajg, ajk, keVar, i, j, j2, j3, j4, j5);
        this.f14277m = i2;
        this.f14278n = j6;
        this.f14279o = adc;
    }

    /* renamed from: b */
    public final void mo13355b() {
        this.f14281q = true;
    }

    /* renamed from: c */
    public final void mo13356c() throws IOException {
        C4302qy qyVar;
        long j;
        long j2;
        if (this.f14280p == 0) {
            acw e = mo13466e();
            e.mo13471b(this.f14278n);
            adc adc = this.f14279o;
            long j3 = this.f14205a;
            if (j3 == C6540C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                j = j3 - this.f14278n;
            }
            long j4 = this.f14206b;
            if (j4 == C6540C.TIME_UNSET) {
                j2 = -9223372036854775807L;
            } else {
                j2 = j4 - this.f14278n;
            }
            adc.mo13478h(e, j, j2);
        }
        try {
            ajk c = this.f14239d.mo13813c(this.f14280p);
            ako ako = this.f14246k;
            qyVar = new C4302qy(ako, c.f15060e, ako.mo13296c(c));
            do {
                if (this.f14281q || !this.f14279o.mo13477g(qyVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f14279o.mo13477g(qyVar));
            break;
            this.f14280p = qyVar.mo16605l() - this.f14239d.f15060e;
            amm.m14247q(this.f14246k);
            this.f14282r = !this.f14281q;
        } catch (Throwable th) {
            amm.m14247q(this.f14246k);
            throw th;
        }
    }

    /* renamed from: i */
    public final long mo13502i() {
        return this.f14289l + ((long) this.f14277m);
    }

    /* renamed from: j */
    public final boolean mo13503j() {
        return this.f14282r;
    }
}
