package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wk */
/* compiled from: IMASDK */
final class C4450wk implements C4298qu {

    /* renamed from: a */
    private final amk f19438a;

    /* renamed from: b */
    private final alw f19439b = new alw();

    /* synthetic */ C4450wk(amk amk) {
        this.f19438a = amk;
    }

    /* renamed from: a */
    public final C4297qt mo16585a(C4307rc rcVar, long j) throws IOException {
        int h;
        long j2;
        long l = rcVar.mo16605l();
        int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, rcVar.mo16606m() - l);
        this.f19439b.mo13943a(min);
        rcVar.mo16600g(this.f19439b.mo13952j(), 0, min);
        alw alw = this.f19439b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (alw.mo13947e() >= 4) {
            if (C4459wt.m19394h(alw.mo13952j(), alw.mo13950h()) != 442) {
                alw.mo13954l(1);
            } else {
                alw.mo13954l(4);
                long e = C4451wl.m19369e(alw);
                if (e != C6540C.TIME_UNSET) {
                    long f = this.f19438a.mo13998f(e);
                    if (f > j) {
                        if (j3 == C6540C.TIME_UNSET) {
                            return C4297qt.m18674a(f, l);
                        }
                        j2 = (long) i2;
                    } else if (100000 + f > j) {
                        j2 = (long) alw.mo13950h();
                    } else {
                        i2 = alw.mo13950h();
                        j3 = f;
                    }
                    return C4297qt.m18676c(l + j2);
                }
                int f2 = alw.mo13948f();
                if (alw.mo13947e() >= 10) {
                    alw.mo13954l(9);
                    int o = alw.mo13957o() & 7;
                    if (alw.mo13947e() >= o) {
                        alw.mo13954l(o);
                        if (alw.mo13947e() >= 4) {
                            if (C4459wt.m19394h(alw.mo13952j(), alw.mo13950h()) == 443) {
                                alw.mo13954l(4);
                                int p = alw.mo13958p();
                                if (alw.mo13947e() < p) {
                                    alw.mo13951i(f2);
                                } else {
                                    alw.mo13954l(p);
                                }
                            }
                            while (true) {
                                if (alw.mo13947e() < 4 || (h = C4459wt.m19394h(alw.mo13952j(), alw.mo13950h())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                alw.mo13954l(4);
                                if (alw.mo13947e() < 2) {
                                    alw.mo13951i(f2);
                                    break;
                                }
                                alw.mo13951i(Math.min(alw.mo13948f(), alw.mo13950h() + alw.mo13958p()));
                            }
                        } else {
                            alw.mo13951i(f2);
                        }
                    } else {
                        alw.mo13951i(f2);
                    }
                } else {
                    alw.mo13951i(f2);
                }
                i = alw.mo13950h();
            }
        }
        return j3 != C6540C.TIME_UNSET ? C4297qt.m18675b(j3, l + ((long) i)) : C4297qt.f18448a;
    }

    /* renamed from: b */
    public final void mo16586b() {
        this.f19439b.mo13944b(amm.f15303f);
    }
}
