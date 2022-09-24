package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ob4 implements wc4 {

    /* renamed from: a */
    public final int f36365a;

    /* renamed from: b */
    public final int[] f36366b;

    /* renamed from: c */
    public final long[] f36367c;

    /* renamed from: d */
    public final long[] f36368d;

    /* renamed from: e */
    public final long[] f36369e;

    /* renamed from: f */
    private final long f36370f;

    public ob4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f36366b = iArr;
        this.f36367c = jArr;
        this.f36368d = jArr2;
        this.f36369e = jArr3;
        int length = iArr.length;
        this.f36365a = length;
        if (length > 0) {
            int i = length - 1;
            this.f36370f = jArr2[i] + jArr3[i];
            return;
        }
        this.f36370f = 0;
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        int J = d13.m20279J(this.f36369e, j, true, true);
        xc4 xc4 = new xc4(this.f36369e[J], this.f36367c[J]);
        if (xc4.f41131a >= j || J == this.f36365a - 1) {
            return new uc4(xc4, xc4);
        }
        int i = J + 1;
        return new uc4(xc4, new xc4(this.f36369e[i], this.f36367c[i]));
    }

    public final String toString() {
        int i = this.f36365a;
        String arrays = Arrays.toString(this.f36366b);
        String arrays2 = Arrays.toString(this.f36367c);
        String arrays3 = Arrays.toString(this.f36369e);
        String arrays4 = Arrays.toString(this.f36368d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    public final long zze() {
        return this.f36370f;
    }

    public final boolean zzh() {
        return true;
    }
}
