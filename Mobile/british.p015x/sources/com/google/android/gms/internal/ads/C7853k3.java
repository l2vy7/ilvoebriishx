package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.k3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7853k3 implements lb4 {

    /* renamed from: a */
    private final ay2 f34131a;

    /* renamed from: b */
    private final uq2 f34132b = new uq2();

    /* synthetic */ C7853k3(ay2 ay2, C7817j3 j3Var) {
        this.f34131a = ay2;
    }

    /* renamed from: a */
    public final kb4 mo33023a(wb4 wb4, long j) throws IOException {
        int h;
        long j2;
        long zze = wb4.zze();
        int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, wb4.zzc() - zze);
        this.f34132b.mo35233c(min);
        ((qb4) wb4).mo33311e(this.f34132b.mo35238h(), 0, min, false);
        uq2 uq2 = this.f34132b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (uq2.mo35239i() >= 4) {
            if (C7890l3.m34279h(uq2.mo35238h(), uq2.mo35241k()) != 442) {
                uq2.mo35237g(1);
            } else {
                uq2.mo35237g(4);
                long c = C7927m3.m34665c(uq2);
                if (c != C6540C.TIME_UNSET) {
                    long b = this.f34131a.mo30573b(c);
                    if (b > j) {
                        if (j3 == C6540C.TIME_UNSET) {
                            return kb4.m33900d(b, zze);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b > j) {
                        j2 = (long) uq2.mo35241k();
                    } else {
                        i2 = uq2.mo35241k();
                        j3 = b;
                    }
                    return kb4.m33901e(zze + j2);
                }
                int l = uq2.mo35242l();
                if (uq2.mo35239i() >= 10) {
                    uq2.mo35237g(9);
                    int s = uq2.mo35249s() & 7;
                    if (uq2.mo35239i() >= s) {
                        uq2.mo35237g(s);
                        if (uq2.mo35239i() >= 4) {
                            if (C7890l3.m34279h(uq2.mo35238h(), uq2.mo35241k()) == 443) {
                                uq2.mo35237g(4);
                                int w = uq2.mo35253w();
                                if (uq2.mo35239i() < w) {
                                    uq2.mo35236f(l);
                                } else {
                                    uq2.mo35237g(w);
                                }
                            }
                            while (true) {
                                if (uq2.mo35239i() < 4 || (h = C7890l3.m34279h(uq2.mo35238h(), uq2.mo35241k())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                uq2.mo35237g(4);
                                if (uq2.mo35239i() < 2) {
                                    uq2.mo35236f(l);
                                    break;
                                }
                                uq2.mo35236f(Math.min(uq2.mo35242l(), uq2.mo35241k() + uq2.mo35253w()));
                            }
                        } else {
                            uq2.mo35236f(l);
                        }
                    } else {
                        uq2.mo35236f(l);
                    }
                } else {
                    uq2.mo35236f(l);
                }
                i = uq2.mo35241k();
            }
        }
        return j3 != C6540C.TIME_UNSET ? kb4.m33902f(j3, zze + ((long) i)) : kb4.f34230d;
    }

    public final void zzb() {
        uq2 uq2 = this.f34132b;
        byte[] bArr = d13.f20200f;
        int length = bArr.length;
        uq2.mo35234d(bArr, 0);
    }
}
