package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adk */
/* compiled from: IMASDK */
public final class adk extends ada {

    /* renamed from: a */
    private final adc f14285a;

    /* renamed from: b */
    private long f14286b;

    /* renamed from: l */
    private volatile boolean f14287l;

    /* renamed from: m */
    private acw f14288m;

    public adk(ajg ajg, ajk ajk, C4120ke keVar, int i, adc adc) {
        super(ajg, ajk, 2, keVar, i, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
        this.f14285a = adc;
    }

    /* renamed from: a */
    public final void mo13506a(acw acw) {
        this.f14288m = acw;
    }

    /* renamed from: b */
    public final void mo13355b() {
        this.f14287l = true;
    }

    /* renamed from: c */
    public final void mo13356c() throws IOException {
        C4302qy qyVar;
        if (this.f14286b == 0) {
            this.f14285a.mo13478h(this.f14288m, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
        }
        try {
            ajk c = this.f14239d.mo13813c(this.f14286b);
            ako ako = this.f14246k;
            qyVar = new C4302qy(ako, c.f15060e, ako.mo13296c(c));
            do {
                if (this.f14287l || !this.f14285a.mo13477g(qyVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f14285a.mo13477g(qyVar));
            break;
            this.f14286b = qyVar.mo16605l() - this.f14239d.f15060e;
            amm.m14247q(this.f14246k);
        } catch (Throwable th) {
            amm.m14247q(this.f14246k);
            throw th;
        }
    }
}
