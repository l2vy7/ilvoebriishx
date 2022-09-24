package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kq */
/* compiled from: IMASDK */
final class C4132kq {

    /* renamed from: a */
    public final aaz f17734a;

    /* renamed from: b */
    public final Object f17735b;

    /* renamed from: c */
    public final ach[] f17736c;

    /* renamed from: d */
    public boolean f17737d;

    /* renamed from: e */
    public boolean f17738e;

    /* renamed from: f */
    public C4133kr f17739f;

    /* renamed from: g */
    public boolean f17740g;

    /* renamed from: h */
    private final boolean[] f17741h;

    /* renamed from: i */
    private final C4157lo[] f17742i;

    /* renamed from: j */
    private final aio f17743j;

    /* renamed from: k */
    private final C4143la f17744k;

    /* renamed from: l */
    private C4132kq f17745l;

    /* renamed from: m */
    private acq f17746m = acq.f14192a;

    /* renamed from: n */
    private aip f17747n;

    /* renamed from: o */
    private long f17748o;

    public C4132kq(C4157lo[] loVarArr, long j, aio aio, ajl ajl, C4143la laVar, C4133kr krVar, aip aip) {
        this.f17742i = loVarArr;
        this.f17748o = j;
        this.f17743j = aio;
        this.f17744k = laVar;
        abb abb = krVar.f17749a;
        this.f17735b = abb.f13998a;
        this.f17739f = krVar;
        this.f17747n = aip;
        this.f17736c = new ach[2];
        this.f17741h = new boolean[2];
        long j2 = krVar.f17750b;
        long j3 = krVar.f17752d;
        aaz m = laVar.mo16212m(abb, ajl, j2);
        if (!(j3 == C6540C.TIME_UNSET || j3 == Long.MIN_VALUE)) {
            m = new aab(m, j3);
        }
        this.f17734a = m;
    }

    /* renamed from: t */
    private final void m17750t() {
        if (m17752v()) {
            int i = 0;
            while (true) {
                aip aip = this.f17747n;
                if (i < aip.f15004a) {
                    boolean a = aip.mo13781a(i);
                    aih aih = this.f17747n.f15006c[i];
                    if (a && aih != null) {
                        aih.mo13731e();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final void m17751u() {
        if (m17752v()) {
            int i = 0;
            while (true) {
                aip aip = this.f17747n;
                if (i < aip.f15004a) {
                    boolean a = aip.mo13781a(i);
                    aih aih = this.f17747n.f15006c[i];
                    if (a && aih != null) {
                        aih.mo13732f();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    private final boolean m17752v() {
        return this.f17745l == null;
    }

    /* renamed from: a */
    public final long mo16158a(long j) {
        return j + this.f17748o;
    }

    /* renamed from: b */
    public final long mo16159b(long j) {
        return j - this.f17748o;
    }

    /* renamed from: c */
    public final long mo16160c() {
        return this.f17748o;
    }

    /* renamed from: d */
    public final long mo16161d() {
        return this.f17739f.f17750b + this.f17748o;
    }

    /* renamed from: e */
    public final boolean mo16162e() {
        return this.f17737d && (!this.f17738e || this.f17734a.mo13234g() == Long.MIN_VALUE);
    }

    /* renamed from: f */
    public final long mo16163f() {
        if (!this.f17737d) {
            return this.f17739f.f17750b;
        }
        long g = this.f17738e ? this.f17734a.mo13234g() : Long.MIN_VALUE;
        return g == Long.MIN_VALUE ? this.f17739f.f17753e : g;
    }

    /* renamed from: g */
    public final long mo16164g() {
        if (!this.f17737d) {
            return 0;
        }
        return this.f17734a.mo13238k();
    }

    /* renamed from: h */
    public final void mo16165h(float f, C4171mb mbVar) throws C4089ja {
        this.f17737d = true;
        this.f17746m = this.f17734a.mo13231c();
        aip k = mo16168k(f, mbVar);
        C4133kr krVar = this.f17739f;
        long j = krVar.f17750b;
        long j2 = krVar.f17753e;
        if (j2 != C6540C.TIME_UNSET && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long r = mo16175r(k, j);
        long j3 = this.f17748o;
        C4133kr krVar2 = this.f17739f;
        this.f17748o = j3 + (krVar2.f17750b - r);
        this.f17739f = krVar2.mo16177a(r);
    }

    /* renamed from: i */
    public final void mo16166i(long j) {
        aup.m14887r(m17752v());
        if (this.f17737d) {
            this.f17734a.mo13230bd(mo16159b(j));
        }
    }

    /* renamed from: j */
    public final void mo16167j(long j) {
        aup.m14887r(m17752v());
        this.f17734a.mo13240m(mo16159b(j));
    }

    /* renamed from: k */
    public final aip mo16168k(float f, C4171mb mbVar) throws C4089ja {
        aip h = this.f17743j.mo13779h(this.f17742i, this.f17746m, this.f17739f.f17749a, mbVar);
        for (aih aih : h.f15006c) {
            if (aih != null) {
                aih.mo13733g(f);
            }
        }
        return h;
    }

    /* renamed from: l */
    public final long mo16169l(aip aip, long j, boolean z, boolean[] zArr) {
        aip aip2 = aip;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= aip2.f15004a) {
                break;
            }
            boolean[] zArr2 = this.f17741h;
            if (z || !aip.mo13782b(this.f17747n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            C4157lo[] loVarArr = this.f17742i;
            if (i2 >= 2) {
                break;
            }
            loVarArr[i2].mo15945a();
            i2++;
        }
        m17751u();
        this.f17747n = aip2;
        m17750t();
        long d = this.f17734a.mo13232d(aip2.f15006c, this.f17741h, this.f17736c, zArr, j);
        int i3 = 0;
        while (true) {
            C4157lo[] loVarArr2 = this.f17742i;
            if (i3 >= 2) {
                break;
            }
            loVarArr2[i3].mo15945a();
            i3++;
        }
        this.f17738e = false;
        int i4 = 0;
        while (true) {
            ach[] achArr = this.f17736c;
            if (i4 >= 2) {
                return d;
            }
            if (achArr[i4] != null) {
                aup.m14887r(aip.mo13781a(i4));
                this.f17742i[i4].mo15945a();
                this.f17738e = true;
            } else {
                aup.m14887r(aip2.f15006c[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: m */
    public final void mo16170m() {
        m17751u();
        long j = this.f17739f.f17752d;
        C4143la laVar = this.f17744k;
        aaz aaz = this.f17734a;
        if (j == C6540C.TIME_UNSET || j == Long.MIN_VALUE) {
            laVar.mo16205d(aaz);
            return;
        }
        try {
            laVar.mo16205d(((aab) aaz).f13911a);
        } catch (RuntimeException e) {
            ali.m14023b("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: n */
    public final void mo16171n(C4132kq kqVar) {
        if (kqVar != this.f17745l) {
            m17751u();
            this.f17745l = kqVar;
            m17750t();
        }
    }

    /* renamed from: o */
    public final C4132kq mo16172o() {
        return this.f17745l;
    }

    /* renamed from: p */
    public final acq mo16173p() {
        return this.f17746m;
    }

    /* renamed from: q */
    public final aip mo16174q() {
        return this.f17747n;
    }

    /* renamed from: r */
    public final long mo16175r(aip aip, long j) {
        return mo16169l(aip, j, false, new boolean[2]);
    }

    /* renamed from: s */
    public final void mo16176s() {
        this.f17748o = 0;
    }
}
