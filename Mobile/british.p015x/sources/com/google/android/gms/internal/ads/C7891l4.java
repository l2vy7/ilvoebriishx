package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.l4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7891l4 implements C7854k4 {

    /* renamed from: a */
    private final yb4 f34886a;

    /* renamed from: b */
    private final ad4 f34887b;

    /* renamed from: c */
    private final C7966n4 f34888c;

    /* renamed from: d */
    private final C8281w f34889d;

    /* renamed from: e */
    private final int f34890e;

    /* renamed from: f */
    private long f34891f;

    /* renamed from: g */
    private int f34892g;

    /* renamed from: h */
    private long f34893h;

    public C7891l4(yb4 yb4, ad4 ad4, C7966n4 n4Var, String str, int i) throws C7811iy {
        this.f34886a = yb4;
        this.f34887b = ad4;
        this.f34888c = n4Var;
        int i2 = (n4Var.f35893b * n4Var.f35896e) / 8;
        int i3 = n4Var.f35895d;
        if (i3 == i2) {
            int i4 = n4Var.f35894c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f34890e = max;
            ge4 ge4 = new ge4();
            ge4.mo32093s(str);
            ge4.mo32074d0(i5);
            ge4.mo32089o(i5);
            ge4.mo32086l(max);
            ge4.mo32076e0(n4Var.f35893b);
            ge4.mo32094t(n4Var.f35894c);
            ge4.mo32088n(i);
            this.f34889d = ge4.mo32099y();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw C7811iy.m33482a(sb.toString(), (Throwable) null);
    }

    /* renamed from: a */
    public final void mo32829a(long j) {
        this.f34891f = j;
        this.f34892g = 0;
        this.f34893h = 0;
    }

    /* renamed from: b */
    public final boolean mo32830b(wb4 wb4, long j) throws IOException {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.f34892g) < (i2 = this.f34890e)) {
            int a = yc4.m39856a(this.f34887b, wb4, (int) Math.min((long) (i2 - i), j3), true);
            if (a == -1) {
                j3 = 0;
            } else {
                this.f34892g += a;
                j3 -= (long) a;
            }
        }
        C7966n4 n4Var = this.f34888c;
        int i3 = n4Var.f35895d;
        int i4 = this.f34892g / i3;
        if (i4 > 0) {
            long j4 = this.f34891f;
            long Z = d13.m20295Z(this.f34893h, 1000000, (long) n4Var.f35894c);
            int i5 = i4 * i3;
            int i6 = this.f34892g - i5;
            this.f34887b.mo30358e(j4 + Z, 1, i5, i6, (zc4) null);
            this.f34893h += (long) i4;
            this.f34892g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }

    public final void zza(int i, long j) {
        this.f34886a.mo18210l(new C8073q4(this.f34888c, 1, (long) i, j));
        this.f34887b.mo30354a(this.f34889d);
    }
}
