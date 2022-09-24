package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adv */
/* compiled from: IMASDK */
final class adv extends C4171mb {

    /* renamed from: b */
    private final long f14329b;

    /* renamed from: c */
    private final long f14330c;

    /* renamed from: d */
    private final long f14331d;

    /* renamed from: e */
    private final int f14332e;

    /* renamed from: f */
    private final long f14333f;

    /* renamed from: g */
    private final long f14334g;

    /* renamed from: h */
    private final long f14335h;

    /* renamed from: i */
    private final aep f14336i;

    /* renamed from: j */
    private final C4129kn f14337j;

    /* renamed from: k */
    private final C4127kl f14338k;

    public adv(long j, long j2, long j3, int i, long j4, long j5, long j6, aep aep, C4129kn knVar, C4127kl klVar) {
        aep aep2 = aep;
        C4127kl klVar2 = klVar;
        aup.m14887r(aep2.f14440d == (klVar2 != null));
        this.f14329b = j;
        this.f14330c = j2;
        this.f14331d = j3;
        this.f14332e = i;
        this.f14333f = j4;
        this.f14334g = j5;
        this.f14335h = j6;
        this.f14336i = aep2;
        this.f14337j = knVar;
        this.f14338k = klVar2;
    }

    /* renamed from: a */
    private static boolean m13243a(aep aep) {
        return aep.f14440d && aep.f14441e != C6540C.TIME_UNSET && aep.f14438b == C6540C.TIME_UNSET;
    }

    /* renamed from: f */
    public final C4170ma mo13288f(int i, C4170ma maVar, long j) {
        aed l;
        aup.m14891v(i, 1);
        long j2 = this.f14335h;
        if (m13243a(this.f14336i)) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f14334g) {
                    j2 = C6540C.TIME_UNSET;
                }
            }
            long j3 = this.f14333f + j2;
            long e = this.f14336i.mo13568e(0);
            int i2 = 0;
            while (i2 < this.f14336i.mo13565b() - 1 && j3 >= e) {
                j3 -= e;
                i2++;
                e = this.f14336i.mo13568e(i2);
            }
            aeu c = this.f14336i.mo13566c(i2);
            int size = c.f14471c.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (c.f14471c.get(i3).f14432b == 2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (!(i3 == -1 || (l = c.f14471c.get(i3).f14433c.get(0).mo13587l()) == null || l.mo13535g(e) == 0)) {
                j2 = (j2 + l.mo13530b(l.mo13529a(j3, e))) - j3;
            }
        }
        long j4 = j2;
        Object obj = C4170ma.f17924a;
        C4129kn knVar = this.f14337j;
        aep aep = this.f14336i;
        maVar.mo16327c(obj, knVar, aep, this.f14329b, this.f14330c, this.f14331d, true, m13243a(aep), this.f14338k, j4, this.f14334g, mo13272u() - 1, this.f14333f);
        return maVar;
    }

    /* renamed from: h */
    public final C4168lz mo13289h(int i, C4168lz lzVar, boolean z) {
        aup.m14891v(i, mo13272u());
        Integer num = null;
        String str = z ? this.f14336i.mo13566c(i).f14469a : null;
        if (z) {
            num = Integer.valueOf(this.f14332e + i);
        }
        return lzVar.mo16324i(str, num, this.f14336i.mo13568e(i), C4083iv.m17452b(this.f14336i.mo13566c(i).f14470b - this.f14336i.mo13566c(0).f14470b) - this.f14333f);
    }

    /* renamed from: i */
    public final int mo13290i(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f14332e) >= 0 && intValue < mo13272u()) {
            return intValue;
        }
        return -1;
    }

    /* renamed from: j */
    public final Object mo13291j(int i) {
        aup.m14891v(i, mo13272u());
        return Integer.valueOf(this.f14332e + i);
    }

    /* renamed from: t */
    public final int mo13271t() {
        return 1;
    }

    /* renamed from: u */
    public final int mo13272u() {
        return this.f14336i.mo13565b();
    }
}
