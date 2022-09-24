package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8073q4 implements wc4 {

    /* renamed from: a */
    private final C7966n4 f37852a;

    /* renamed from: b */
    private final int f37853b;

    /* renamed from: c */
    private final long f37854c;

    /* renamed from: d */
    private final long f37855d;

    /* renamed from: e */
    private final long f37856e;

    public C8073q4(C7966n4 n4Var, int i, long j, long j2) {
        this.f37852a = n4Var;
        this.f37853b = i;
        this.f37854c = j;
        long j3 = (j2 - j) / ((long) n4Var.f35895d);
        this.f37855d = j3;
        this.f37856e = m36283a(j3);
    }

    /* renamed from: a */
    private final long m36283a(long j) {
        return d13.m20295Z(j * ((long) this.f37853b), 1000000, (long) this.f37852a.f35894c);
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        long U = d13.m20290U((((long) this.f37852a.f35894c) * j) / (((long) this.f37853b) * 1000000), 0, this.f37855d - 1);
        long j2 = this.f37854c;
        int i = this.f37852a.f35895d;
        long a = m36283a(U);
        xc4 xc4 = new xc4(a, j2 + (((long) i) * U));
        if (a >= j || U == this.f37855d - 1) {
            return new uc4(xc4, xc4);
        }
        long j3 = U + 1;
        return new uc4(xc4, new xc4(m36283a(j3), this.f37854c + (j3 * ((long) this.f37852a.f35895d))));
    }

    public final long zze() {
        return this.f37856e;
    }

    public final boolean zzh() {
        return true;
    }
}
