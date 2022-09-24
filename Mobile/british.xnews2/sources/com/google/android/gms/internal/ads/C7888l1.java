package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7888l1 {

    /* renamed from: a */
    public final C7778i1 f34775a;

    /* renamed from: b */
    public final int f34776b;

    /* renamed from: c */
    public final long[] f34777c;

    /* renamed from: d */
    public final int[] f34778d;

    /* renamed from: e */
    public final int f34779e;

    /* renamed from: f */
    public final long[] f34780f;

    /* renamed from: g */
    public final int[] f34781g;

    /* renamed from: h */
    public final long f34782h;

    public C7888l1(C7778i1 i1Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        nu1.m20745d(length == length2);
        int length3 = jArr.length;
        nu1.m20745d(length3 == length2);
        int length4 = iArr2.length;
        nu1.m20745d(length4 != length2 ? false : z);
        this.f34775a = i1Var;
        this.f34777c = jArr;
        this.f34778d = iArr;
        this.f34779e = i;
        this.f34780f = jArr2;
        this.f34781g = iArr2;
        this.f34782h = j;
        this.f34776b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo33225a(long j) {
        for (int J = d13.m20279J(this.f34780f, j, true, false); J >= 0; J--) {
            if ((this.f34781g[J] & 1) != 0) {
                return J;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo33226b(long j) {
        for (int H = d13.m20277H(this.f34780f, j, true, false); H < this.f34780f.length; H++) {
            if ((this.f34781g[H] & 1) != 0) {
                return H;
            }
        }
        return -1;
    }
}
