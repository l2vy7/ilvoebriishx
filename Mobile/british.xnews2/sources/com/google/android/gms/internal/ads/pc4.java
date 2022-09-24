package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pc4 implements wc4 {

    /* renamed from: a */
    private final long[] f37584a;

    /* renamed from: b */
    private final long[] f37585b;

    /* renamed from: c */
    private final long f37586c;

    /* renamed from: d */
    private final boolean f37587d;

    public pc4(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        nu1.m20745d(length == length2);
        boolean z = length2 > 0;
        this.f37587d = z;
        if (!z || jArr2[0] <= 0) {
            this.f37584a = jArr;
            this.f37585b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f37584a = jArr3;
            long[] jArr4 = new long[i];
            this.f37585b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f37586c = j;
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        if (!this.f37587d) {
            xc4 xc4 = xc4.f41130c;
            return new uc4(xc4, xc4);
        }
        int J = d13.m20279J(this.f37585b, j, true, true);
        xc4 xc42 = new xc4(this.f37585b[J], this.f37584a[J]);
        if (xc42.f41131a != j) {
            long[] jArr = this.f37585b;
            if (J != jArr.length - 1) {
                int i = J + 1;
                return new uc4(xc42, new xc4(jArr[i], this.f37584a[i]));
            }
        }
        return new uc4(xc42, xc42);
    }

    public final long zze() {
        return this.f37586c;
    }

    public final boolean zzh() {
        return this.f37587d;
    }
}
