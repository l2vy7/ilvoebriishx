package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sw3 {

    /* renamed from: a */
    private final gf0 f39086a = new gf0();

    /* renamed from: b */
    private final gh0 f39087b = new gh0();

    /* renamed from: c */
    private final a04 f39088c;

    /* renamed from: d */
    private final Handler f39089d;

    /* renamed from: e */
    private long f39090e;

    /* renamed from: f */
    private int f39091f;

    /* renamed from: g */
    private boolean f39092g;

    /* renamed from: h */
    private pw3 f39093h;

    /* renamed from: i */
    private pw3 f39094i;

    /* renamed from: j */
    private pw3 f39095j;

    /* renamed from: k */
    private int f39096k;

    /* renamed from: l */
    private Object f39097l;

    /* renamed from: m */
    private long f39098m;

    public sw3(a04 a04, Handler handler) {
        this.f39088c = a04;
        this.f39089d = handler;
    }

    /* renamed from: A */
    private static c54 m37577A(gi0 gi0, Object obj, long j, long j2, gf0 gf0) {
        gi0.mo32144n(obj, gf0);
        int c = gf0.mo32103c(j);
        if (c == -1) {
            return new c54(obj, j2, gf0.mo32102b(j));
        }
        return new c54(obj, c, gf0.mo32104d(c), j2);
    }

    /* renamed from: B */
    private final void m37578B() {
        c54 c54;
        m63 t = p63.m20820t();
        for (pw3 pw3 = this.f39093h; pw3 != null; pw3 = pw3.mo34201h()) {
            t.mo33496f(pw3.f37786f.f38301a);
        }
        pw3 pw32 = this.f39094i;
        if (pw32 == null) {
            c54 = null;
        } else {
            c54 = pw32.f37786f.f38301a;
        }
        this.f39089d.post(new rw3(this, t, c54));
    }

    /* renamed from: C */
    private final boolean m37579C(gi0 gi0, c54 c54, boolean z) {
        int a = gi0.mo32133a(c54.f34474a);
        if (!gi0.mo31485e(gi0.mo31484d(a, this.f39086a, false).f32286c, this.f39087b, 0).f32315g) {
            if (gi0.mo32139i(a, this.f39086a, this.f39087b, this.f39091f, this.f39092g) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m37580a(gi0 gi0, c54 c54) {
        if (!m37582c(c54)) {
            return false;
        }
        int i = gi0.mo32144n(c54.f34474a, this.f39086a).f32286c;
        if (gi0.mo31485e(i, this.f39087b, 0).f32322n == gi0.mo32133a(c54.f34474a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m37581b(gi0 gi0) {
        pw3 pw3 = this.f39093h;
        if (pw3 == null) {
            return true;
        }
        int a = gi0.mo32133a(pw3.f37782b);
        while (true) {
            a = gi0.mo32139i(a, this.f39086a, this.f39087b, this.f39091f, this.f39092g);
            while (pw3.mo34201h() != null && !pw3.f37786f.f38307g) {
                pw3 = pw3.mo34201h();
            }
            pw3 h = pw3.mo34201h();
            if (a == -1 || h == null || gi0.mo32133a(h.f37782b) != a) {
                boolean p = mo34820p(pw3);
                pw3.f37786f = mo34814j(gi0, pw3.f37786f);
            } else {
                pw3 = h;
            }
        }
        boolean p2 = mo34820p(pw3);
        pw3.f37786f = mo34814j(gi0, pw3.f37786f);
        if (!p2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m37582c(c54 c54) {
        return !c54.mo33183b() && c54.f34478e == -1;
    }

    /* renamed from: v */
    private final long m37583v(gi0 gi0, Object obj, int i) {
        gi0.mo32144n(obj, this.f39086a);
        this.f39086a.mo32108g(i);
        this.f39086a.mo32111i(i);
        return 0;
    }

    /* renamed from: w */
    private final qw3 m37584w(gi0 gi0, pw3 pw3, long j) {
        long j2;
        gi0 gi02 = gi0;
        qw3 qw3 = pw3.f37786f;
        long e = (pw3.mo34198e() + qw3.f38305e) - j;
        if (qw3.f38307g) {
            long j3 = 0;
            int i = gi0.mo32139i(gi02.mo32133a(qw3.f38301a.f34474a), this.f39086a, this.f39087b, this.f39091f, this.f39092g);
            if (i == -1) {
                return null;
            }
            int i2 = gi02.mo31484d(i, this.f39086a, true).f32286c;
            Object obj = this.f39086a.f32285b;
            long j4 = qw3.f38301a.f34477d;
            if (gi02.mo31485e(i2, this.f39087b, 0).f32321m == i) {
                Pair<Object, Long> m = gi0.mo32143m(this.f39087b, this.f39086a, i2, C6540C.TIME_UNSET, Math.max(0, e));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                pw3 h = pw3.mo34201h();
                if (h == null || !h.f37782b.equals(obj)) {
                    j4 = this.f39090e;
                    this.f39090e = 1 + j4;
                } else {
                    j4 = h.f37786f.f38301a.f34477d;
                }
                j2 = longValue;
                j3 = C6540C.TIME_UNSET;
            } else {
                j2 = 0;
            }
            return m37585x(gi0, m37577A(gi0, obj, j2, j4, this.f39086a), j3, j2);
        }
        c54 c54 = qw3.f38301a;
        gi02.mo32144n(c54.f34474a, this.f39086a);
        if (c54.mo33183b()) {
            int i3 = c54.f34475b;
            if (this.f39086a.mo32101a(i3) == -1) {
                return null;
            }
            int e2 = this.f39086a.mo32105e(i3, c54.f34476c);
            if (e2 < 0) {
                return m37586y(gi0, c54.f34474a, i3, e2, qw3.f38303c, c54.f34477d);
            }
            long j5 = qw3.f38303c;
            if (j5 == C6540C.TIME_UNSET) {
                gh0 gh0 = this.f39087b;
                gf0 gf0 = this.f39086a;
                Pair<Object, Long> m2 = gi0.mo32143m(gh0, gf0, gf0.f32286c, C6540C.TIME_UNSET, Math.max(0, e));
                if (m2 == null) {
                    return null;
                }
                j5 = ((Long) m2.second).longValue();
            }
            m37583v(gi02, c54.f34474a, c54.f34475b);
            return m37587z(gi0, c54.f34474a, Math.max(0, j5), qw3.f38303c, c54.f34477d);
        }
        int d = this.f39086a.mo32104d(c54.f34478e);
        if (d == this.f39086a.mo32101a(c54.f34478e)) {
            m37583v(gi02, c54.f34474a, c54.f34478e);
            return m37587z(gi0, c54.f34474a, 0, qw3.f38305e, c54.f34477d);
        }
        return m37586y(gi0, c54.f34474a, c54.f34478e, d, qw3.f38305e, c54.f34477d);
    }

    /* renamed from: x */
    private final qw3 m37585x(gi0 gi0, c54 c54, long j, long j2) {
        c54 c542 = c54;
        gi0 gi02 = gi0;
        gi0.mo32144n(c542.f34474a, this.f39086a);
        if (c54.mo33183b()) {
            return m37586y(gi0, c542.f34474a, c542.f34475b, c542.f34476c, j, c542.f34477d);
        }
        return m37587z(gi0, c542.f34474a, j2, j, c542.f34477d);
    }

    /* renamed from: y */
    private final qw3 m37586y(gi0 gi0, Object obj, int i, int i2, long j, long j2) {
        c54 c54 = new c54(obj, i, i2, j2);
        long f = gi0.mo32144n(c54.f34474a, this.f39086a).mo32107f(c54.f34475b, c54.f34476c);
        if (i2 == this.f39086a.mo32104d(i)) {
            this.f39086a.mo32109h();
        }
        this.f39086a.mo32113k(c54.f34475b);
        long j3 = 0;
        if (f != C6540C.TIME_UNSET && f <= 0) {
            j3 = Math.max(0, -1 + f);
        }
        return new qw3(c54, j3, j, C6540C.TIME_UNSET, f, false, false, false, false);
    }

    /* renamed from: z */
    private final qw3 m37587z(gi0 gi0, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        gi0 gi02 = gi0;
        Object obj2 = obj;
        long j6 = j;
        gi02.mo32144n(obj2, this.f39086a);
        int b = this.f39086a.mo32102b(j6);
        c54 c54 = new c54(obj2, j3, b);
        boolean c = m37582c(c54);
        boolean a = m37580a(gi02, c54);
        boolean C = m37579C(gi02, c54, c);
        if (b != -1) {
            this.f39086a.mo32113k(b);
        }
        if (b != -1) {
            this.f39086a.mo32108g(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != C6540C.TIME_UNSET) {
            j5 = j4;
        } else {
            j5 = this.f39086a.f32287d;
        }
        if (j5 != C6540C.TIME_UNSET && j6 >= j5) {
            j6 = Math.max(0, -1 + j5);
        }
        return new qw3(c54, j6, j2, j4, j5, false, c, a, C);
    }

    /* renamed from: d */
    public final pw3 mo34808d() {
        pw3 pw3 = this.f39093h;
        if (pw3 == null) {
            return null;
        }
        if (pw3 == this.f39094i) {
            this.f39094i = pw3.mo34201h();
        }
        this.f39093h.mo34207n();
        int i = this.f39096k - 1;
        this.f39096k = i;
        if (i == 0) {
            this.f39095j = null;
            pw3 pw32 = this.f39093h;
            this.f39097l = pw32.f37782b;
            this.f39098m = pw32.f37786f.f38301a.f34477d;
        }
        this.f39093h = this.f39093h.mo34201h();
        m37578B();
        return this.f39093h;
    }

    /* renamed from: e */
    public final pw3 mo34809e() {
        pw3 pw3 = this.f39094i;
        boolean z = false;
        if (!(pw3 == null || pw3.mo34201h() == null)) {
            z = true;
        }
        nu1.m20747f(z);
        this.f39094i = this.f39094i.mo34201h();
        m37578B();
        return this.f39094i;
    }

    /* renamed from: f */
    public final pw3 mo34810f() {
        return this.f39095j;
    }

    /* renamed from: g */
    public final pw3 mo34811g() {
        return this.f39093h;
    }

    /* renamed from: h */
    public final pw3 mo34812h() {
        return this.f39094i;
    }

    /* renamed from: i */
    public final qw3 mo34813i(long j, bx3 bx3) {
        pw3 pw3 = this.f39095j;
        if (pw3 != null) {
            return m37584w(bx3.f30151a, pw3, j);
        }
        return m37585x(bx3.f30151a, bx3.f30152b, bx3.f30153c, bx3.f30169s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.qw3 mo34814j(com.google.android.gms.internal.ads.gi0 r19, com.google.android.gms.internal.ads.qw3 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.c54 r3 = r2.f38301a
            boolean r12 = m37582c(r3)
            boolean r13 = r0.m37580a(r1, r3)
            boolean r14 = r0.m37579C(r1, r3, r12)
            com.google.android.gms.internal.ads.c54 r4 = r2.f38301a
            java.lang.Object r4 = r4.f34474a
            com.google.android.gms.internal.ads.gf0 r5 = r0.f39086a
            r1.mo32144n(r4, r5)
            boolean r1 = r3.mo33183b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0036
            int r1 = r3.f34478e
            if (r1 != r4) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            com.google.android.gms.internal.ads.gf0 r7 = r0.f39086a
            r7.mo32108g(r1)
            r7 = 0
            goto L_0x0037
        L_0x0036:
            r7 = r5
        L_0x0037:
            boolean r1 = r3.mo33183b()
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.gf0 r1 = r0.f39086a
            int r5 = r3.f34475b
            int r6 = r3.f34476c
            long r5 = r1.mo32107f(r5, r6)
        L_0x0047:
            r9 = r5
            goto L_0x0054
        L_0x0049:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x004f
            r9 = r7
            goto L_0x0054
        L_0x004f:
            com.google.android.gms.internal.ads.gf0 r1 = r0.f39086a
            long r5 = r1.f32287d
            goto L_0x0047
        L_0x0054:
            boolean r1 = r3.mo33183b()
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.gf0 r1 = r0.f39086a
            int r4 = r3.f34475b
            r1.mo32113k(r4)
            goto L_0x006b
        L_0x0062:
            int r1 = r3.f34478e
            if (r1 == r4) goto L_0x006b
            com.google.android.gms.internal.ads.gf0 r4 = r0.f39086a
            r4.mo32113k(r1)
        L_0x006b:
            com.google.android.gms.internal.ads.qw3 r15 = new com.google.android.gms.internal.ads.qw3
            long r4 = r2.f38302b
            long r1 = r2.f38303c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sw3.mo34814j(com.google.android.gms.internal.ads.gi0, com.google.android.gms.internal.ads.qw3):com.google.android.gms.internal.ads.qw3");
    }

    /* renamed from: k */
    public final c54 mo34815k(gi0 gi0, Object obj, long j) {
        long j2;
        int a;
        int i = gi0.mo32144n(obj, this.f39086a).f32286c;
        Object obj2 = this.f39097l;
        if (obj2 == null || (a = gi0.mo32133a(obj2)) == -1 || gi0.mo31484d(a, this.f39086a, false).f32286c != i) {
            pw3 pw3 = this.f39093h;
            while (true) {
                if (pw3 == null) {
                    pw3 pw32 = this.f39093h;
                    while (true) {
                        if (pw32 != null) {
                            int a2 = gi0.mo32133a(pw32.f37782b);
                            if (a2 != -1 && gi0.mo31484d(a2, this.f39086a, false).f32286c == i) {
                                j2 = pw32.f37786f.f38301a.f34477d;
                                break;
                            }
                            pw32 = pw32.mo34201h();
                        } else {
                            j2 = this.f39090e;
                            this.f39090e = 1 + j2;
                            if (this.f39093h == null) {
                                this.f39097l = obj;
                                this.f39098m = j2;
                            }
                        }
                    }
                } else if (pw3.f37782b.equals(obj)) {
                    j2 = pw3.f37786f.f38301a.f34477d;
                    break;
                } else {
                    pw3 = pw3.mo34201h();
                }
            }
        } else {
            j2 = this.f39098m;
        }
        return m37577A(gi0, obj, j, j2, this.f39086a);
    }

    /* renamed from: l */
    public final void mo34816l() {
        if (this.f39096k != 0) {
            pw3 pw3 = this.f39093h;
            nu1.m20743b(pw3);
            this.f39097l = pw3.f37782b;
            this.f39098m = pw3.f37786f.f38301a.f34477d;
            while (pw3 != null) {
                pw3.mo34207n();
                pw3 = pw3.mo34201h();
            }
            this.f39093h = null;
            this.f39095j = null;
            this.f39094i = null;
            this.f39096k = 0;
            m37578B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo34817m(m63 m63, c54 c54) {
        this.f39088c.mo18047d0(m63.mo33497g(), c54);
    }

    /* renamed from: n */
    public final void mo34818n(long j) {
        pw3 pw3 = this.f39095j;
        if (pw3 != null) {
            pw3.mo34206m(j);
        }
    }

    /* renamed from: o */
    public final boolean mo34819o(b54 b54) {
        pw3 pw3 = this.f39095j;
        return pw3 != null && pw3.f37781a == b54;
    }

    /* renamed from: p */
    public final boolean mo34820p(pw3 pw3) {
        boolean z = false;
        nu1.m20747f(pw3 != null);
        if (pw3.equals(this.f39095j)) {
            return false;
        }
        this.f39095j = pw3;
        while (pw3.mo34201h() != null) {
            pw3 = pw3.mo34201h();
            if (pw3 == this.f39094i) {
                this.f39094i = this.f39093h;
                z = true;
            }
            pw3.mo34207n();
            this.f39096k--;
        }
        this.f39095j.mo34208o((pw3) null);
        m37578B();
        return z;
    }

    /* renamed from: q */
    public final boolean mo34821q() {
        pw3 pw3 = this.f39095j;
        if (pw3 != null) {
            return !pw3.f37786f.f38309i && pw3.mo34211r() && this.f39095j.f37786f.f38305e != C6540C.TIME_UNSET && this.f39096k < 100;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo34822r(gi0 gi0, long j, long j2) {
        qw3 qw3;
        long j3;
        boolean z;
        gi0 gi02 = gi0;
        pw3 pw3 = this.f39093h;
        pw3 pw32 = null;
        while (pw3 != null) {
            qw3 qw32 = pw3.f37786f;
            if (pw32 == null) {
                qw3 = mo34814j(gi02, qw32);
                long j4 = j;
            } else {
                qw3 w = m37584w(gi02, pw32, j);
                if (w == null) {
                    return !mo34820p(pw32);
                }
                if (qw32.f38302b != w.f38302b || !qw32.f38301a.equals(w.f38301a)) {
                    return !mo34820p(pw32);
                }
                qw3 = w;
            }
            pw3.f37786f = qw3.mo34421a(qw32.f38303c);
            long j5 = qw32.f38305e;
            long j6 = qw3.f38305e;
            if (j5 == C6540C.TIME_UNSET || j5 == j6) {
                pw32 = pw3;
                pw3 = pw3.mo34201h();
            } else {
                pw3.mo34210q();
                long j7 = qw3.f38305e;
                if (j7 == C6540C.TIME_UNSET) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + pw3.mo34198e();
                }
                if (pw3 == this.f39094i) {
                    boolean z2 = pw3.f37786f.f38306f;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return mo34820p(pw3) && !z;
                    }
                }
                z = false;
                if (mo34820p(pw3)) {
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo34823s(gi0 gi0, int i) {
        this.f39091f = i;
        return m37581b(gi0);
    }

    /* renamed from: t */
    public final boolean mo34824t(gi0 gi0, boolean z) {
        this.f39092g = z;
        return m37581b(gi0);
    }

    /* renamed from: u */
    public final pw3 mo34825u(ix3[] ix3Arr, y74 y74, o84 o84, ax3 ax3, qw3 qw3, z74 z74) {
        long j;
        qw3 qw32 = qw3;
        pw3 pw3 = this.f39095j;
        if (pw3 == null) {
            if (qw32.f38301a.mo33183b()) {
                long j2 = qw32.f38303c;
                if (j2 != C6540C.TIME_UNSET) {
                    j = j2;
                }
            }
            j = 0;
        } else {
            j = (pw3.mo34198e() + this.f39095j.f37786f.f38305e) - qw32.f38302b;
        }
        pw3 pw32 = new pw3(ix3Arr, j, y74, o84, ax3, qw3, z74, (byte[]) null);
        pw3 pw33 = this.f39095j;
        if (pw33 != null) {
            pw33.mo34208o(pw32);
        } else {
            this.f39093h = pw32;
            this.f39094i = pw32;
        }
        this.f39097l = null;
        this.f39095j = pw32;
        this.f39096k++;
        m37578B();
        return pw32;
    }
}
