package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kt */
/* compiled from: IMASDK */
final class C4135kt {

    /* renamed from: a */
    private final C4168lz f17760a = new C4168lz();

    /* renamed from: b */
    private final C4170ma f17761b = new C4170ma();

    /* renamed from: c */
    private final C4201ne f17762c;

    /* renamed from: d */
    private final Handler f17763d;

    /* renamed from: e */
    private long f17764e;

    /* renamed from: f */
    private int f17765f;

    /* renamed from: g */
    private boolean f17766g;

    /* renamed from: h */
    private C4132kq f17767h;

    /* renamed from: i */
    private C4132kq f17768i;

    /* renamed from: j */
    private C4132kq f17769j;

    /* renamed from: k */
    private int f17770k;

    /* renamed from: l */
    private Object f17771l;

    /* renamed from: m */
    private long f17772m;

    public C4135kt(C4201ne neVar, Handler handler) {
        this.f17762c = neVar;
        this.f17763d = handler;
    }

    /* renamed from: A */
    private final boolean m17774A(C4171mb mbVar, abb abb, boolean z) {
        int i = mbVar.mo13290i(abb.f13998a);
        if (mbVar.mo16334w(mbVar.mo16330A(i, this.f17760a).f17914c, this.f17761b).f17933i) {
            return false;
        }
        return mbVar.mo16335x(i, this.f17760a, this.f17761b, this.f17765f, this.f17766g) == -1 && z;
    }

    /* renamed from: B */
    private static final boolean m17775B(abb abb) {
        return !abb.mo13312b() && abb.f14002e == -1;
    }

    /* renamed from: s */
    private final void m17776s() {
        abb abb;
        if (this.f17762c != null) {
            atv s = atz.m14815s();
            for (C4132kq kqVar = this.f17767h; kqVar != null; kqVar = kqVar.mo16172o()) {
                s.mo14514d(kqVar.f17739f.f17749a);
            }
            C4132kq kqVar2 = this.f17768i;
            if (kqVar2 == null) {
                abb = null;
            } else {
                abb = kqVar2.f17739f.f17749a;
            }
            this.f17763d.post(new C4134ks(this, s, abb));
        }
    }

    /* renamed from: t */
    private static abb m17777t(C4171mb mbVar, Object obj, long j, long j2, C4168lz lzVar) {
        mbVar.mo15925g(obj, lzVar);
        int d = lzVar.mo16317d(j);
        if (d == -1) {
            return new abb(obj, j2, lzVar.mo16318e(j));
        }
        return new abb(obj, d, lzVar.mo16316c(d), j2);
    }

    /* renamed from: u */
    private final boolean m17778u(C4171mb mbVar) {
        C4132kq kqVar = this.f17767h;
        if (kqVar == null) {
            return true;
        }
        int i = mbVar.mo13290i(kqVar.f17735b);
        while (true) {
            i = mbVar.mo16335x(i, this.f17760a, this.f17761b, this.f17765f, this.f17766g);
            while (kqVar.mo16172o() != null && !kqVar.f17739f.f17754f) {
                kqVar = kqVar.mo16172o();
            }
            C4132kq o = kqVar.mo16172o();
            if (i == -1 || o == null || mbVar.mo13290i(o.f17735b) != i) {
                boolean l = mo16193l(kqVar);
                kqVar.f17739f = mo16196o(mbVar, kqVar.f17739f);
            } else {
                kqVar = o;
            }
        }
        boolean l2 = mo16193l(kqVar);
        kqVar.f17739f = mo16196o(mbVar, kqVar.f17739f);
        if (!l2) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final C4133kr m17779v(C4171mb mbVar, C4132kq kqVar, long j) {
        long j2;
        long j3;
        C4171mb mbVar2 = mbVar;
        C4133kr krVar = kqVar.f17739f;
        long c = (kqVar.mo16160c() + krVar.f17753e) - j;
        if (krVar.f17754f) {
            int x = mbVar.mo16335x(mbVar.mo13290i(krVar.f17749a.f13998a), this.f17760a, this.f17761b, this.f17765f, this.f17766g);
            if (x == -1) {
                return null;
            }
            int i = mbVar.mo13289h(x, this.f17760a, true).f17914c;
            Object obj = this.f17760a.f17913b;
            long j4 = krVar.f17749a.f14001d;
            if (mbVar.mo16334w(i, this.f17761b).f17939o == x) {
                Pair<Object, Long> z = mbVar.mo16337z(this.f17761b, this.f17760a, i, C6540C.TIME_UNSET, Math.max(0, c));
                if (z == null) {
                    return null;
                }
                obj = z.first;
                long longValue = ((Long) z.second).longValue();
                C4132kq o = kqVar.mo16172o();
                if (o == null || !o.f17735b.equals(obj)) {
                    j4 = this.f17764e;
                    this.f17764e = 1 + j4;
                } else {
                    j4 = o.f17739f.f17749a.f14001d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j3 = 0;
                j2 = 0;
            }
            return m17780w(mbVar, m17777t(mbVar, obj, j2, j4, this.f17760a), j3, j2);
        }
        abb abb = krVar.f17749a;
        mbVar.mo15925g(abb.f13998a, this.f17760a);
        if (abb.mo13312b()) {
            this.f17760a.mo16320f(abb.f13999b);
            return null;
        }
        int d = this.f17760a.mo16317d(krVar.f17752d);
        if (d == -1) {
            Object obj2 = abb.f13998a;
            long j5 = krVar.f17753e;
            return m17782y(mbVar, obj2, j5, j5, abb.f14001d);
        }
        return m17781x(mbVar, abb.f13998a, d, this.f17760a.mo16316c(d), krVar.f17753e, abb.f14001d);
    }

    /* renamed from: w */
    private final C4133kr m17780w(C4171mb mbVar, abb abb, long j, long j2) {
        abb abb2 = abb;
        C4171mb mbVar2 = mbVar;
        mbVar.mo15925g(abb2.f13998a, this.f17760a);
        if (abb.mo13312b()) {
            return m17781x(mbVar, abb2.f13998a, abb2.f13999b, abb2.f14000c, j, abb2.f14001d);
        }
        return m17782y(mbVar, abb2.f13998a, j2, j, abb2.f14001d);
    }

    /* renamed from: x */
    private final C4133kr m17781x(C4171mb mbVar, Object obj, int i, int i2, long j, long j2) {
        abb abb = new abb(obj, i, i2, j2);
        mbVar.mo15925g(abb.f13998a, this.f17760a).mo16321g(abb.f13999b);
        if (i2 == this.f17760a.mo16316c(i)) {
            this.f17760a.mo16322h();
        }
        return new C4133kr(abb, 0, j, C6540C.TIME_UNSET, C6540C.TIME_UNSET, false, false, false);
    }

    /* renamed from: y */
    private final C4133kr m17782y(C4171mb mbVar, Object obj, long j, long j2, long j3) {
        C4171mb mbVar2 = mbVar;
        Object obj2 = obj;
        long j4 = j;
        mbVar2.mo15925g(obj2, this.f17760a);
        int e = this.f17760a.mo16318e(j4);
        abb abb = new abb(obj2, j3, e);
        boolean B = m17775B(abb);
        boolean z = m17783z(mbVar2, abb);
        boolean A = m17774A(mbVar2, abb, B);
        long b = e != -1 ? this.f17760a.mo16315b(e) : -9223372036854775807L;
        long j5 = (b == C6540C.TIME_UNSET || b == Long.MIN_VALUE) ? this.f17760a.f17915d : b;
        if (j5 != C6540C.TIME_UNSET && j4 >= j5) {
            j4 = Math.max(0, -1 + j5);
        }
        return new C4133kr(abb, j4, j2, b, j5, B, z, A);
    }

    /* renamed from: z */
    private final boolean m17783z(C4171mb mbVar, abb abb) {
        if (!m17775B(abb)) {
            return false;
        }
        int i = mbVar.mo15925g(abb.f13998a, this.f17760a).f17914c;
        if (mbVar.mo16334w(i, this.f17761b).f17940p == mbVar.mo13290i(abb.f13998a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo16182a(C4171mb mbVar, int i) {
        this.f17765f = i;
        return m17778u(mbVar);
    }

    /* renamed from: b */
    public final boolean mo16183b(C4171mb mbVar, boolean z) {
        this.f17766g = z;
        return m17778u(mbVar);
    }

    /* renamed from: c */
    public final boolean mo16184c(aaz aaz) {
        C4132kq kqVar = this.f17769j;
        return kqVar != null && kqVar.f17734a == aaz;
    }

    /* renamed from: d */
    public final void mo16185d(long j) {
        C4132kq kqVar = this.f17769j;
        if (kqVar != null) {
            kqVar.mo16166i(j);
        }
    }

    /* renamed from: e */
    public final boolean mo16186e() {
        C4132kq kqVar = this.f17769j;
        if (kqVar != null) {
            return !kqVar.f17739f.f17756h && kqVar.mo16162e() && this.f17769j.f17739f.f17753e != C6540C.TIME_UNSET && this.f17770k < 100;
        }
        return true;
    }

    /* renamed from: f */
    public final C4133kr mo16187f(long j, C4145lc lcVar) {
        C4132kq kqVar = this.f17769j;
        if (kqVar != null) {
            return m17779v(lcVar.f17807a, kqVar, j);
        }
        return m17780w(lcVar.f17807a, lcVar.f17808b, lcVar.f17809c, lcVar.f17824r);
    }

    /* renamed from: g */
    public final C4132kq mo16188g() {
        return this.f17769j;
    }

    /* renamed from: h */
    public final C4132kq mo16189h() {
        return this.f17767h;
    }

    /* renamed from: i */
    public final C4132kq mo16190i() {
        return this.f17768i;
    }

    /* renamed from: j */
    public final C4132kq mo16191j() {
        C4132kq kqVar = this.f17768i;
        boolean z = false;
        if (!(kqVar == null || kqVar.mo16172o() == null)) {
            z = true;
        }
        aup.m14887r(z);
        this.f17768i = this.f17768i.mo16172o();
        m17776s();
        return this.f17768i;
    }

    /* renamed from: k */
    public final C4132kq mo16192k() {
        C4132kq kqVar = this.f17767h;
        if (kqVar == null) {
            return null;
        }
        if (kqVar == this.f17768i) {
            this.f17768i = kqVar.mo16172o();
        }
        this.f17767h.mo16170m();
        int i = this.f17770k - 1;
        this.f17770k = i;
        if (i == 0) {
            this.f17769j = null;
            C4132kq kqVar2 = this.f17767h;
            this.f17771l = kqVar2.f17735b;
            this.f17772m = kqVar2.f17739f.f17749a.f14001d;
        }
        this.f17767h = this.f17767h.mo16172o();
        m17776s();
        return this.f17767h;
    }

    /* renamed from: l */
    public final boolean mo16193l(C4132kq kqVar) {
        boolean z = false;
        aup.m14887r(kqVar != null);
        if (kqVar.equals(this.f17769j)) {
            return false;
        }
        this.f17769j = kqVar;
        while (kqVar.mo16172o() != null) {
            kqVar = kqVar.mo16172o();
            if (kqVar == this.f17768i) {
                this.f17768i = this.f17767h;
                z = true;
            }
            kqVar.mo16170m();
            this.f17770k--;
        }
        this.f17769j.mo16171n((C4132kq) null);
        m17776s();
        return z;
    }

    /* renamed from: m */
    public final void mo16194m() {
        if (this.f17770k != 0) {
            C4132kq kqVar = this.f17767h;
            aup.m14889t(kqVar);
            this.f17771l = kqVar.f17735b;
            this.f17772m = kqVar.f17739f.f17749a.f14001d;
            while (kqVar != null) {
                kqVar.mo16170m();
                kqVar = kqVar.mo16172o();
            }
            this.f17767h = null;
            this.f17769j = null;
            this.f17768i = null;
            this.f17770k = 0;
            m17776s();
        }
    }

    /* renamed from: n */
    public final boolean mo16195n(C4171mb mbVar, long j, long j2) {
        C4133kr krVar;
        long j3;
        C4171mb mbVar2 = mbVar;
        C4132kq kqVar = this.f17767h;
        C4132kq kqVar2 = null;
        while (kqVar != null) {
            C4133kr krVar2 = kqVar.f17739f;
            if (kqVar2 == null) {
                krVar = mo16196o(mbVar2, krVar2);
                long j4 = j;
            } else {
                C4133kr v = m17779v(mbVar2, kqVar2, j);
                if (v == null) {
                    return !mo16193l(kqVar2);
                }
                if (krVar2.f17750b != v.f17750b || !krVar2.f17749a.equals(v.f17749a)) {
                    return !mo16193l(kqVar2);
                }
                krVar = v;
            }
            kqVar.f17739f = krVar.mo16178b(krVar2.f17751c);
            long j5 = krVar2.f17753e;
            long j6 = krVar.f17753e;
            if (j5 == C6540C.TIME_UNSET || j5 == j6) {
                kqVar2 = kqVar;
                kqVar = kqVar.mo16172o();
            } else {
                if (j6 == C6540C.TIME_UNSET) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = kqVar.mo16158a(j6);
                }
                return !mo16193l(kqVar) && !(kqVar == this.f17768i && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1)) >= 0));
            }
        }
        return true;
    }

    /* renamed from: o */
    public final C4133kr mo16196o(C4171mb mbVar, C4133kr krVar) {
        long j;
        abb abb = krVar.f17749a;
        boolean B = m17775B(abb);
        boolean z = m17783z(mbVar, abb);
        boolean A = m17774A(mbVar, abb, B);
        mbVar.mo15925g(krVar.f17749a.f13998a, this.f17760a);
        boolean b = abb.mo13312b();
        long j2 = C6540C.TIME_UNSET;
        if (b) {
            this.f17760a.mo16321g(abb.f13999b);
        } else {
            long j3 = krVar.f17752d;
            if (j3 == C6540C.TIME_UNSET || j3 == Long.MIN_VALUE) {
                j2 = this.f17760a.f17915d;
            } else {
                j = j3;
                return new C4133kr(abb, krVar.f17750b, krVar.f17751c, krVar.f17752d, j, B, z, A);
            }
        }
        j = j2;
        return new C4133kr(abb, krVar.f17750b, krVar.f17751c, krVar.f17752d, j, B, z, A);
    }

    /* renamed from: p */
    public final abb mo16197p(C4171mb mbVar, Object obj, long j) {
        long j2;
        int i;
        int i2 = mbVar.mo15925g(obj, this.f17760a).f17914c;
        Object obj2 = this.f17771l;
        if (obj2 == null || (i = mbVar.mo13290i(obj2)) == -1 || mbVar.mo16330A(i, this.f17760a).f17914c != i2) {
            C4132kq kqVar = this.f17767h;
            while (true) {
                if (kqVar == null) {
                    C4132kq kqVar2 = this.f17767h;
                    while (true) {
                        if (kqVar2 != null) {
                            int i3 = mbVar.mo13290i(kqVar2.f17735b);
                            if (i3 != -1 && mbVar.mo16330A(i3, this.f17760a).f17914c == i2) {
                                j2 = kqVar2.f17739f.f17749a.f14001d;
                                break;
                            }
                            kqVar2 = kqVar2.mo16172o();
                        } else {
                            j2 = this.f17764e;
                            this.f17764e = 1 + j2;
                            if (this.f17767h == null) {
                                this.f17771l = obj;
                                this.f17772m = j2;
                            }
                        }
                    }
                } else if (kqVar.f17735b.equals(obj)) {
                    j2 = kqVar.f17739f.f17749a.f14001d;
                    break;
                } else {
                    kqVar = kqVar.mo16172o();
                }
            }
        } else {
            j2 = this.f17772m;
        }
        return m17777t(mbVar, obj, j, j2, this.f17760a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo16198q(atv atv, abb abb) {
        this.f17762c.mo16356S(atv.mo14513c(), abb);
    }

    /* renamed from: r */
    public final C4132kq mo16199r(C4157lo[] loVarArr, aio aio, ajl ajl, C4143la laVar, C4133kr krVar, aip aip) {
        long j;
        C4133kr krVar2 = krVar;
        C4132kq kqVar = this.f17769j;
        if (kqVar == null) {
            if (krVar2.f17749a.mo13312b()) {
                long j2 = krVar2.f17751c;
                if (j2 != C6540C.TIME_UNSET) {
                    j = j2;
                }
            }
            j = 0;
        } else {
            j = (kqVar.mo16160c() + this.f17769j.f17739f.f17753e) - krVar2.f17750b;
        }
        C4132kq kqVar2 = new C4132kq(loVarArr, j, aio, ajl, laVar, krVar, aip);
        C4132kq kqVar3 = this.f17769j;
        if (kqVar3 != null) {
            kqVar3.mo16171n(kqVar2);
        } else {
            this.f17767h = kqVar2;
            this.f17768i = kqVar2;
        }
        this.f17771l = null;
        this.f17769j = kqVar2;
        this.f17770k++;
        m17776s();
        return kqVar2;
    }
}
