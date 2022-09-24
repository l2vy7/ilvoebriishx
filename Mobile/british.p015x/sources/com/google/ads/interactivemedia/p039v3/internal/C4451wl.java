package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wl */
/* compiled from: IMASDK */
final class C4451wl {

    /* renamed from: a */
    private final amk f19440a = new amk(0);

    /* renamed from: b */
    private final alw f19441b = new alw();

    /* renamed from: c */
    private boolean f19442c;

    /* renamed from: d */
    private boolean f19443d;

    /* renamed from: e */
    private boolean f19444e;

    /* renamed from: f */
    private long f19445f = C6540C.TIME_UNSET;

    /* renamed from: g */
    private long f19446g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private long f19447h = C6540C.TIME_UNSET;

    C4451wl() {
    }

    /* renamed from: e */
    public static long m19369e(alw alw) {
        alw alw2 = alw;
        int h = alw.mo13950h();
        if (alw.mo13947e() < 9) {
            return C6540C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        alw2.mo13956n(bArr, 0, 9);
        alw2.mo13951i(h);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C6540C.TIME_UNSET;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final void m19370f(C4307rc rcVar) {
        this.f19441b.mo13944b(amm.f15303f);
        this.f19442c = true;
        rcVar.mo16603j();
    }

    /* renamed from: g */
    private static final int m19371g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final boolean mo16751a() {
        return this.f19442c;
    }

    /* renamed from: b */
    public final amk mo16752b() {
        return this.f19440a;
    }

    /* renamed from: c */
    public final int mo16753c(C4307rc rcVar, C4321rq rqVar) throws IOException {
        boolean z = this.f19444e;
        long j = C6540C.TIME_UNSET;
        if (!z) {
            long m = rcVar.mo16606m();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, m);
            long j2 = m - ((long) min);
            if (rcVar.mo16605l() != j2) {
                rqVar.f18533a = j2;
                return 1;
            }
            this.f19441b.mo13943a(min);
            rcVar.mo16603j();
            rcVar.mo16600g(this.f19441b.mo13952j(), 0, min);
            alw alw = this.f19441b;
            int h = alw.mo13950h();
            int f = alw.mo13948f() - 4;
            while (true) {
                if (f < h) {
                    break;
                }
                if (m19371g(alw.mo13952j(), f) == 442) {
                    alw.mo13951i(f + 4);
                    long e = m19369e(alw);
                    if (e != C6540C.TIME_UNSET) {
                        j = e;
                        break;
                    }
                }
                f--;
            }
            this.f19446g = j;
            this.f19444e = true;
            return 0;
        } else if (this.f19446g == C6540C.TIME_UNSET) {
            m19370f(rcVar);
            return 0;
        } else if (!this.f19443d) {
            int min2 = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, rcVar.mo16606m());
            if (rcVar.mo16605l() != 0) {
                rqVar.f18533a = 0;
                return 1;
            }
            this.f19441b.mo13943a(min2);
            rcVar.mo16603j();
            rcVar.mo16600g(this.f19441b.mo13952j(), 0, min2);
            alw alw2 = this.f19441b;
            int h2 = alw2.mo13950h();
            int f2 = alw2.mo13948f();
            while (true) {
                if (h2 >= f2 - 3) {
                    break;
                }
                if (m19371g(alw2.mo13952j(), h2) == 442) {
                    alw2.mo13951i(h2 + 4);
                    long e2 = m19369e(alw2);
                    if (e2 != C6540C.TIME_UNSET) {
                        j = e2;
                        break;
                    }
                }
                h2++;
            }
            this.f19445f = j;
            this.f19443d = true;
            return 0;
        } else {
            long j3 = this.f19445f;
            if (j3 == C6540C.TIME_UNSET) {
                m19370f(rcVar);
                return 0;
            }
            this.f19447h = this.f19440a.mo13998f(this.f19446g) - this.f19440a.mo13998f(j3);
            m19370f(rcVar);
            return 0;
        }
    }

    /* renamed from: d */
    public final long mo16754d() {
        return this.f19447h;
    }
}
