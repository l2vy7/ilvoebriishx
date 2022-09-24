package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class pb4 implements wc4 {

    /* renamed from: a */
    private final long f37573a;

    /* renamed from: b */
    private final long f37574b;

    /* renamed from: c */
    private final int f37575c;

    /* renamed from: d */
    private final long f37576d;

    /* renamed from: e */
    private final int f37577e;

    /* renamed from: f */
    private final long f37578f;

    public pb4(long j, long j2, int i, int i2, boolean z) {
        long c;
        this.f37573a = j;
        this.f37574b = j2;
        this.f37575c = i2 == -1 ? 1 : i2;
        this.f37577e = i;
        if (j == -1) {
            this.f37576d = -1;
            c = C6540C.TIME_UNSET;
        } else {
            this.f37576d = j - j2;
            c = m36046c(j, j2, i);
        }
        this.f37578f = c;
    }

    /* renamed from: c */
    private static long m36046c(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: a */
    public final long mo34111a(long j) {
        return m36046c(j, this.f37574b, this.f37577e);
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        long j2 = this.f37576d;
        if (j2 != -1) {
            int i = this.f37577e;
            long j3 = (long) this.f37575c;
            long j4 = (((((long) i) * j) / 8000000) / j3) * j3;
            if (j2 != -1) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f37574b + Math.max(j4, 0);
            long a = mo34111a(max);
            xc4 xc4 = new xc4(a, max);
            if (this.f37576d != -1 && a < j) {
                long j5 = max + ((long) this.f37575c);
                if (j5 < this.f37573a) {
                    return new uc4(xc4, new xc4(mo34111a(j5), j5));
                }
            }
            return new uc4(xc4, xc4);
        }
        xc4 xc42 = new xc4(0, this.f37574b);
        return new uc4(xc42, xc42);
    }

    public final long zze() {
        return this.f37578f;
    }

    public final boolean zzh() {
        return this.f37576d != -1;
    }
}
