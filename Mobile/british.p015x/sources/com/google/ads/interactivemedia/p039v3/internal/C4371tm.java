package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tm */
/* compiled from: IMASDK */
final class C4371tm implements C4370tl {

    /* renamed from: a */
    private final long[] f18822a;

    /* renamed from: b */
    private final long[] f18823b;

    /* renamed from: c */
    private final long f18824c;

    /* renamed from: d */
    private final long f18825d;

    private C4371tm(long[] jArr, long[] jArr2, long j, long j2) {
        this.f18822a = jArr;
        this.f18823b = jArr2;
        this.f18824c = j;
        this.f18825d = j2;
    }

    /* renamed from: f */
    public static C4371tm m18986f(long j, long j2, C4255pe peVar, alw alw) {
        int i;
        long j3 = j;
        C4255pe peVar2 = peVar;
        alw alw2 = alw;
        alw2.mo13954l(10);
        int w = alw.mo13965w();
        if (w <= 0) {
            return null;
        }
        int i2 = peVar2.f18313d;
        long M = amm.m14196M((long) w, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int p = alw.mo13958p();
        int p2 = alw.mo13958p();
        int p3 = alw.mo13958p();
        alw2.mo13954l(2);
        long j4 = j2 + ((long) peVar2.f18312c);
        long[] jArr = new long[p];
        long[] jArr2 = new long[p];
        int i3 = 0;
        long j5 = j2;
        while (i3 < p) {
            int i4 = p2;
            jArr[i3] = (((long) i3) * M) / ((long) p);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (p3 == 1) {
                i = alw.mo13957o();
            } else if (p3 == 2) {
                i = alw.mo13958p();
            } else if (p3 == 3) {
                i = alw.mo13961s();
            } else if (p3 != 4) {
                return null;
            } else {
                i = alw.mo13934C();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            p2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new C4371tm(jArr, jArr2, M, j5);
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        int am = amm.m14223am(this.f18822a, j, true);
        C4325ru ruVar = new C4325ru(this.f18822a[am], this.f18823b[am]);
        if (ruVar.f18539b < j) {
            long[] jArr = this.f18822a;
            if (am != jArr.length - 1) {
                int i = am + 1;
                return new C4322rr(ruVar, new C4325ru(jArr[i], this.f18823b[i]));
            }
        }
        return new C4322rr(ruVar, ruVar);
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18824c;
    }

    /* renamed from: d */
    public final long mo16621d(long j) {
        return this.f18822a[amm.m14223am(this.f18823b, j, true)];
    }

    /* renamed from: e */
    public final long mo16622e() {
        return this.f18825d;
    }
}
