package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.v3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8250v3 {

    /* renamed from: a */
    private final ay2 f40275a = new ay2(0);

    /* renamed from: b */
    private final uq2 f40276b = new uq2();

    /* renamed from: c */
    private boolean f40277c;

    /* renamed from: d */
    private boolean f40278d;

    /* renamed from: e */
    private boolean f40279e;

    /* renamed from: f */
    private long f40280f = C6540C.TIME_UNSET;

    /* renamed from: g */
    private long f40281g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private long f40282h = C6540C.TIME_UNSET;

    C8250v3(int i) {
    }

    /* renamed from: e */
    private final int m38686e(wb4 wb4) {
        uq2 uq2 = this.f40276b;
        byte[] bArr = d13.f20200f;
        int length = bArr.length;
        uq2.mo35234d(bArr, 0);
        this.f40277c = true;
        wb4.zzj();
        return 0;
    }

    /* renamed from: a */
    public final int mo35351a(wb4 wb4, tc4 tc4, int i) throws IOException {
        if (i <= 0) {
            m38686e(wb4);
            return 0;
        }
        boolean z = this.f40279e;
        long j = C6540C.TIME_UNSET;
        if (!z) {
            long zzc = wb4.zzc();
            int min = (int) Math.min(112800, zzc);
            long j2 = zzc - ((long) min);
            if (wb4.zze() != j2) {
                tc4.f39386a = j2;
                return 1;
            }
            this.f40276b.mo35233c(min);
            wb4.zzj();
            ((qb4) wb4).mo33311e(this.f40276b.mo35238h(), 0, min, false);
            uq2 uq2 = this.f40276b;
            int k = uq2.mo35241k();
            int l = uq2.mo35242l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = uq2.mo35238h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * TsExtractor.TS_PACKET_SIZE) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b = C7707g4.m32351b(uq2, i2, i);
                            if (b != C6540C.TIME_UNSET) {
                                j = b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f40281g = j;
            this.f40279e = true;
            return 0;
        } else if (this.f40281g == C6540C.TIME_UNSET) {
            m38686e(wb4);
            return 0;
        } else if (!this.f40278d) {
            int min2 = (int) Math.min(112800, wb4.zzc());
            if (wb4.zze() != 0) {
                tc4.f39386a = 0;
                return 1;
            }
            this.f40276b.mo35233c(min2);
            wb4.zzj();
            ((qb4) wb4).mo33311e(this.f40276b.mo35238h(), 0, min2, false);
            uq2 uq22 = this.f40276b;
            int k2 = uq22.mo35241k();
            int l2 = uq22.mo35242l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (uq22.mo35238h()[k2] == 71) {
                    long b2 = C7707g4.m32351b(uq22, k2, i);
                    if (b2 != C6540C.TIME_UNSET) {
                        j = b2;
                        break;
                    }
                }
                k2++;
            }
            this.f40280f = j;
            this.f40278d = true;
            return 0;
        } else {
            long j3 = this.f40280f;
            if (j3 == C6540C.TIME_UNSET) {
                m38686e(wb4);
                return 0;
            }
            long b3 = this.f40275a.mo30573b(this.f40281g) - this.f40275a.mo30573b(j3);
            this.f40282h = b3;
            if (b3 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b3);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.f40282h = C6540C.TIME_UNSET;
            }
            m38686e(wb4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo35352b() {
        return this.f40282h;
    }

    /* renamed from: c */
    public final ay2 mo35353c() {
        return this.f40275a;
    }

    /* renamed from: d */
    public final boolean mo35354d() {
        return this.f40277c;
    }
}
