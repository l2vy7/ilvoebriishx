package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ws */
/* compiled from: IMASDK */
final class C4458ws implements C4298qu {

    /* renamed from: a */
    private final amk f19478a;

    /* renamed from: b */
    private final alw f19479b = new alw();

    /* renamed from: c */
    private final int f19480c;

    /* renamed from: d */
    private final int f19481d = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    public C4458ws(int i, amk amk, int i2) {
        this.f19480c = i;
        this.f19478a = amk;
    }

    /* renamed from: a */
    public final C4297qt mo16585a(C4307rc rcVar, long j) throws IOException {
        int e;
        int i;
        long j2;
        long l = rcVar.mo16605l();
        int min = (int) Math.min(112800, rcVar.mo16606m() - l);
        this.f19479b.mo13943a(min);
        rcVar.mo16600g(this.f19479b.mo13952j(), 0, min);
        alw alw = this.f19479b;
        int f = alw.mo13948f();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (alw.mo13947e() >= 188 && (i = e + TsExtractor.TS_PACKET_SIZE) <= f) {
            long f2 = C4396uk.m19137f(alw, (e = C4396uk.m19136e(alw.mo13952j(), alw.mo13950h(), f)), this.f19480c);
            if (f2 != C6540C.TIME_UNSET) {
                long f3 = this.f19478a.mo13998f(f2);
                if (f3 > j) {
                    if (j5 == C6540C.TIME_UNSET) {
                        return C4297qt.m18674a(f3, l);
                    }
                    j2 = l + j4;
                } else if (100000 + f3 > j) {
                    j2 = l + ((long) e);
                } else {
                    j4 = (long) e;
                    j5 = f3;
                }
                return C4297qt.m18676c(j2);
            }
            alw.mo13951i(i);
            j3 = (long) i;
        }
        return j5 != C6540C.TIME_UNSET ? C4297qt.m18675b(j5, l + j3) : C4297qt.f18448a;
    }

    /* renamed from: b */
    public final void mo16586b() {
        this.f19479b.mo13944b(amm.f15303f);
    }
}
