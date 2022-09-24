package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7942mi {

    /* renamed from: a */
    public final int f35519a;

    /* renamed from: b */
    public final long[] f35520b;

    /* renamed from: c */
    public final int[] f35521c;

    /* renamed from: d */
    public final int f35522d;

    /* renamed from: e */
    public final long[] f35523e;

    /* renamed from: f */
    public final int[] f35524f;

    public C7942mi(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        C8195tl.m37898c(iArr.length == length);
        int length2 = jArr.length;
        C8195tl.m37898c(length2 == length);
        C8195tl.m37898c(iArr2.length != length ? false : z);
        this.f35520b = jArr;
        this.f35521c = iArr;
        this.f35522d = i;
        this.f35523e = jArr2;
        this.f35524f = iArr2;
        this.f35519a = length2;
    }

    /* renamed from: a */
    public final int mo33548a(long j) {
        for (int c = C7836jm.m33641c(this.f35523e, j, true, false); c >= 0; c--) {
            if ((this.f35524f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo33549b(long j) {
        for (int b = C7836jm.m33640b(this.f35523e, j, true, false); b < this.f35523e.length; b++) {
            if ((this.f35524f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
