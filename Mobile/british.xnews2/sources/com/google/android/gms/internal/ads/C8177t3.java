package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8177t3 implements lb4 {

    /* renamed from: a */
    private final ay2 f39263a;

    /* renamed from: b */
    private final uq2 f39264b = new uq2();

    /* renamed from: c */
    private final int f39265c;

    public C8177t3(int i, ay2 ay2, int i2) {
        this.f39265c = i;
        this.f39263a = ay2;
    }

    /* renamed from: a */
    public final kb4 mo33023a(wb4 wb4, long j) throws IOException {
        int a;
        int i;
        long j2;
        long zze = wb4.zze();
        int min = (int) Math.min(112800, wb4.zzc() - zze);
        this.f39264b.mo35233c(min);
        ((qb4) wb4).mo33311e(this.f39264b.mo35238h(), 0, min, false);
        uq2 uq2 = this.f39264b;
        int l = uq2.mo35242l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (uq2.mo35239i() >= 188 && (i = a + TsExtractor.TS_PACKET_SIZE) <= l) {
            long b = C7707g4.m32351b(uq2, (a = C7707g4.m32350a(uq2.mo35238h(), uq2.mo35241k(), l)), this.f39265c);
            if (b != C6540C.TIME_UNSET) {
                long b2 = this.f39263a.mo30573b(b);
                if (b2 > j) {
                    if (j5 == C6540C.TIME_UNSET) {
                        return kb4.m33900d(b2, zze);
                    }
                    j2 = zze + j4;
                } else if (100000 + b2 > j) {
                    j2 = zze + ((long) a);
                } else {
                    j4 = (long) a;
                    j5 = b2;
                }
                return kb4.m33901e(j2);
            }
            uq2.mo35236f(i);
            j3 = (long) i;
        }
        return j5 != C6540C.TIME_UNSET ? kb4.m33902f(j5, zze + j3) : kb4.f34230d;
    }

    public final void zzb() {
        uq2 uq2 = this.f39264b;
        byte[] bArr = d13.f20200f;
        int length = bArr.length;
        uq2.mo35234d(bArr, 0);
    }
}
