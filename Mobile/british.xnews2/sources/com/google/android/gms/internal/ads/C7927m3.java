package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.m3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7927m3 {

    /* renamed from: a */
    private final ay2 f35372a = new ay2(0);

    /* renamed from: b */
    private final uq2 f35373b = new uq2();

    /* renamed from: c */
    private boolean f35374c;

    /* renamed from: d */
    private boolean f35375d;

    /* renamed from: e */
    private boolean f35376e;

    /* renamed from: f */
    private long f35377f = C6540C.TIME_UNSET;

    /* renamed from: g */
    private long f35378g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private long f35379h = C6540C.TIME_UNSET;

    C7927m3() {
    }

    /* renamed from: c */
    public static long m34665c(uq2 uq2) {
        uq2 uq22 = uq2;
        int k = uq2.mo35241k();
        if (uq2.mo35239i() < 9) {
            return C6540C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        uq22.mo35232b(bArr, 0, 9);
        uq22.mo35236f(k);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C6540C.TIME_UNSET;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final int m34666f(wb4 wb4) {
        uq2 uq2 = this.f35373b;
        byte[] bArr = d13.f20200f;
        int length = bArr.length;
        uq2.mo35234d(bArr, 0);
        this.f35374c = true;
        wb4.zzj();
        return 0;
    }

    /* renamed from: g */
    private static final int m34667g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int mo33461a(wb4 wb4, tc4 tc4) throws IOException {
        boolean z = this.f35376e;
        long j = C6540C.TIME_UNSET;
        if (!z) {
            long zzc = wb4.zzc();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzc);
            long j2 = zzc - ((long) min);
            if (wb4.zze() != j2) {
                tc4.f39386a = j2;
                return 1;
            }
            this.f35373b.mo35233c(min);
            wb4.zzj();
            ((qb4) wb4).mo33311e(this.f35373b.mo35238h(), 0, min, false);
            uq2 uq2 = this.f35373b;
            int k = uq2.mo35241k();
            int l = uq2.mo35242l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (m34667g(uq2.mo35238h(), l) == 442) {
                    uq2.mo35236f(l + 4);
                    long c = m34665c(uq2);
                    if (c != C6540C.TIME_UNSET) {
                        j = c;
                        break;
                    }
                }
                l--;
            }
            this.f35378g = j;
            this.f35376e = true;
            return 0;
        } else if (this.f35378g == C6540C.TIME_UNSET) {
            m34666f(wb4);
            return 0;
        } else if (!this.f35375d) {
            int min2 = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, wb4.zzc());
            if (wb4.zze() != 0) {
                tc4.f39386a = 0;
                return 1;
            }
            this.f35373b.mo35233c(min2);
            wb4.zzj();
            ((qb4) wb4).mo33311e(this.f35373b.mo35238h(), 0, min2, false);
            uq2 uq22 = this.f35373b;
            int k2 = uq22.mo35241k();
            int l2 = uq22.mo35242l();
            while (true) {
                if (k2 >= l2 - 3) {
                    break;
                }
                if (m34667g(uq22.mo35238h(), k2) == 442) {
                    uq22.mo35236f(k2 + 4);
                    long c2 = m34665c(uq22);
                    if (c2 != C6540C.TIME_UNSET) {
                        j = c2;
                        break;
                    }
                }
                k2++;
            }
            this.f35377f = j;
            this.f35375d = true;
            return 0;
        } else {
            long j3 = this.f35377f;
            if (j3 == C6540C.TIME_UNSET) {
                m34666f(wb4);
                return 0;
            }
            long b = this.f35372a.mo30573b(this.f35378g) - this.f35372a.mo30573b(j3);
            this.f35379h = b;
            if (b < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.f35379h = C6540C.TIME_UNSET;
            }
            m34666f(wb4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo33462b() {
        return this.f35379h;
    }

    /* renamed from: d */
    public final ay2 mo33463d() {
        return this.f35372a;
    }

    /* renamed from: e */
    public final boolean mo33464e() {
        return this.f35374c;
    }
}
