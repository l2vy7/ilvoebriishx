package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wu */
/* compiled from: IMASDK */
final class C4460wu {

    /* renamed from: a */
    private final int f19482a = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    /* renamed from: b */
    private final amk f19483b = new amk(0);

    /* renamed from: c */
    private final alw f19484c = new alw();

    /* renamed from: d */
    private boolean f19485d;

    /* renamed from: e */
    private boolean f19486e;

    /* renamed from: f */
    private boolean f19487f;

    /* renamed from: g */
    private long f19488g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private long f19489h = C6540C.TIME_UNSET;

    /* renamed from: i */
    private long f19490i = C6540C.TIME_UNSET;

    C4460wu(int i) {
    }

    /* renamed from: e */
    private final void m19395e(C4307rc rcVar) {
        this.f19484c.mo13944b(amm.f15303f);
        this.f19485d = true;
        rcVar.mo16603j();
    }

    /* renamed from: a */
    public final boolean mo16759a() {
        return this.f19485d;
    }

    /* renamed from: b */
    public final int mo16760b(C4307rc rcVar, C4321rq rqVar, int i) throws IOException {
        if (i <= 0) {
            m19395e(rcVar);
            return 0;
        }
        boolean z = this.f19487f;
        long j = C6540C.TIME_UNSET;
        if (!z) {
            long m = rcVar.mo16606m();
            int min = (int) Math.min(112800, m);
            long j2 = m - ((long) min);
            if (rcVar.mo16605l() != j2) {
                rqVar.f18533a = j2;
                return 1;
            }
            this.f19484c.mo13943a(min);
            rcVar.mo16603j();
            rcVar.mo16600g(this.f19484c.mo13952j(), 0, min);
            alw alw = this.f19484c;
            int h = alw.mo13950h();
            int f = alw.mo13948f();
            while (true) {
                f--;
                if (f < h) {
                    break;
                } else if (alw.mo13952j()[f] == 71) {
                    long f2 = C4396uk.m19137f(alw, f, i);
                    if (f2 != C6540C.TIME_UNSET) {
                        j = f2;
                        break;
                    }
                }
            }
            this.f19489h = j;
            this.f19487f = true;
            return 0;
        } else if (this.f19489h == C6540C.TIME_UNSET) {
            m19395e(rcVar);
            return 0;
        } else if (!this.f19486e) {
            int min2 = (int) Math.min(112800, rcVar.mo16606m());
            if (rcVar.mo16605l() != 0) {
                rqVar.f18533a = 0;
                return 1;
            }
            this.f19484c.mo13943a(min2);
            rcVar.mo16603j();
            rcVar.mo16600g(this.f19484c.mo13952j(), 0, min2);
            alw alw2 = this.f19484c;
            int h2 = alw2.mo13950h();
            int f3 = alw2.mo13948f();
            while (true) {
                if (h2 >= f3) {
                    break;
                }
                if (alw2.mo13952j()[h2] == 71) {
                    long f4 = C4396uk.m19137f(alw2, h2, i);
                    if (f4 != C6540C.TIME_UNSET) {
                        j = f4;
                        break;
                    }
                }
                h2++;
            }
            this.f19488g = j;
            this.f19486e = true;
            return 0;
        } else {
            long j3 = this.f19488g;
            if (j3 == C6540C.TIME_UNSET) {
                m19395e(rcVar);
                return 0;
            }
            this.f19490i = this.f19483b.mo13998f(this.f19489h) - this.f19483b.mo13998f(j3);
            m19395e(rcVar);
            return 0;
        }
    }

    /* renamed from: c */
    public final long mo16761c() {
        return this.f19490i;
    }

    /* renamed from: d */
    public final amk mo16762d() {
        return this.f19483b;
    }
}
