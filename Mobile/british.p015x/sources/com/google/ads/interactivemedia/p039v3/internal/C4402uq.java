package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uq */
/* compiled from: IMASDK */
final class C4402uq {

    /* renamed from: a */
    public final C4399un f19077a;

    /* renamed from: b */
    public final int f19078b;

    /* renamed from: c */
    public final long[] f19079c;

    /* renamed from: d */
    public final int[] f19080d;

    /* renamed from: e */
    public final int f19081e;

    /* renamed from: f */
    public final long[] f19082f;

    /* renamed from: g */
    public final int[] f19083g;

    /* renamed from: h */
    public final long f19084h;

    public C4402uq(C4399un unVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        aup.m14885p(length == length2);
        int length3 = jArr.length;
        aup.m14885p(length3 == length2);
        int length4 = iArr2.length;
        aup.m14885p(length4 != length2 ? false : z);
        this.f19077a = unVar;
        this.f19079c = jArr;
        this.f19080d = iArr;
        this.f19081e = i;
        this.f19082f = jArr2;
        this.f19083g = iArr2;
        this.f19084h = j;
        this.f19078b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo16683a(long j) {
        for (int am = amm.m14223am(this.f19082f, j, false); am >= 0; am--) {
            if ((this.f19083g[am] & 1) != 0) {
                return am;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo16684b(long j) {
        for (int aj = amm.m14220aj(this.f19082f, j, true); aj < this.f19082f.length; aj++) {
            if ((this.f19083g[aj] & 1) != 0) {
                return aj;
            }
        }
        return -1;
    }
}
