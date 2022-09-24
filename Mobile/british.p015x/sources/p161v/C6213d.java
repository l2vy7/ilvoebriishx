package p161v;

import java.util.Arrays;
import java.util.HashMap;
import p161v.C6222i;
import p166w.C6243d;
import p166w.C6246e;

/* renamed from: v.d */
/* compiled from: LinearSystem */
public class C6213d {

    /* renamed from: q */
    private static int f25593q = 1000;

    /* renamed from: r */
    public static C6216e f25594r = null;

    /* renamed from: s */
    public static boolean f25595s = true;

    /* renamed from: t */
    public static long f25596t;

    /* renamed from: u */
    public static long f25597u;

    /* renamed from: a */
    int f25598a;

    /* renamed from: b */
    private HashMap<String, C6222i> f25599b;

    /* renamed from: c */
    private C6214a f25600c;

    /* renamed from: d */
    private int f25601d;

    /* renamed from: e */
    private int f25602e;

    /* renamed from: f */
    C6210b[] f25603f;

    /* renamed from: g */
    public boolean f25604g;

    /* renamed from: h */
    public boolean f25605h;

    /* renamed from: i */
    private boolean[] f25606i;

    /* renamed from: j */
    int f25607j;

    /* renamed from: k */
    int f25608k;

    /* renamed from: l */
    private int f25609l;

    /* renamed from: m */
    final C6212c f25610m;

    /* renamed from: n */
    private C6222i[] f25611n;

    /* renamed from: o */
    private int f25612o;

    /* renamed from: p */
    private C6214a f25613p;

    /* renamed from: v.d$a */
    /* compiled from: LinearSystem */
    interface C6214a {
        /* renamed from: a */
        void mo23667a(C6214a aVar);

        /* renamed from: b */
        C6222i mo23668b(C6213d dVar, boolean[] zArr);

        /* renamed from: c */
        void mo23669c(C6222i iVar);

        void clear();

        C6222i getKey();
    }

    /* renamed from: v.d$b */
    /* compiled from: LinearSystem */
    class C6215b extends C6210b {
        public C6215b(C6212c cVar) {
            this.f25587e = new C6224j(this, cVar);
        }
    }

    public C6213d() {
        this.f25598a = 0;
        this.f25599b = null;
        this.f25601d = 32;
        this.f25602e = 32;
        this.f25603f = null;
        this.f25604g = false;
        this.f25605h = false;
        this.f25606i = new boolean[32];
        this.f25607j = 1;
        this.f25608k = 0;
        this.f25609l = 32;
        this.f25611n = new C6222i[f25593q];
        this.f25612o = 0;
        this.f25603f = new C6210b[32];
        m27233C();
        C6212c cVar = new C6212c();
        this.f25610m = cVar;
        this.f25600c = new C6219h(cVar);
        if (f25595s) {
            this.f25613p = new C6215b(cVar);
        } else {
            this.f25613p = new C6210b(cVar);
        }
    }

    /* renamed from: B */
    private final int m27232B(C6214a aVar, boolean z) {
        for (int i = 0; i < this.f25607j; i++) {
            this.f25606i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f25607j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f25606i[aVar.getKey().f25630c] = true;
            }
            C6222i b = aVar.mo23668b(this, this.f25606i);
            if (b != null) {
                boolean[] zArr = this.f25606i;
                int i3 = b.f25630c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f25608k; i5++) {
                    C6210b bVar = this.f25603f[i5];
                    if (bVar.f25583a.f25637j != C6222i.C6223a.UNRESTRICTED && !bVar.f25588f && bVar.mo23688t(b)) {
                        float j = bVar.f25587e.mo23660j(b);
                        if (j < 0.0f) {
                            float f2 = (-bVar.f25584b) / j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C6210b bVar2 = this.f25603f[i4];
                    bVar2.f25583a.f25631d = -1;
                    bVar2.mo23692y(b);
                    C6222i iVar = bVar2.f25583a;
                    iVar.f25631d = i4;
                    iVar.mo23732g(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m27233C() {
        int i = 0;
        if (f25595s) {
            while (true) {
                C6210b[] bVarArr = this.f25603f;
                if (i < bVarArr.length) {
                    C6210b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f25610m.f25589a.mo23715a(bVar);
                    }
                    this.f25603f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C6210b[] bVarArr2 = this.f25603f;
                if (i < bVarArr2.length) {
                    C6210b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f25610m.f25590b.mo23715a(bVar2);
                    }
                    this.f25603f[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C6222i m27234a(C6222i.C6223a aVar, String str) {
        C6222i acquire = this.f25610m.f25591c.acquire();
        if (acquire == null) {
            acquire = new C6222i(aVar, str);
            acquire.mo23731f(aVar, str);
        } else {
            acquire.mo23729d();
            acquire.mo23731f(aVar, str);
        }
        int i = this.f25612o;
        int i2 = f25593q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f25593q = i3;
            this.f25611n = (C6222i[]) Arrays.copyOf(this.f25611n, i3);
        }
        C6222i[] iVarArr = this.f25611n;
        int i4 = this.f25612o;
        this.f25612o = i4 + 1;
        iVarArr[i4] = acquire;
        return acquire;
    }

    /* renamed from: l */
    private final void m27235l(C6210b bVar) {
        if (f25595s) {
            C6210b[] bVarArr = this.f25603f;
            int i = this.f25608k;
            if (bVarArr[i] != null) {
                this.f25610m.f25589a.mo23715a(bVarArr[i]);
            }
        } else {
            C6210b[] bVarArr2 = this.f25603f;
            int i2 = this.f25608k;
            if (bVarArr2[i2] != null) {
                this.f25610m.f25590b.mo23715a(bVarArr2[i2]);
            }
        }
        C6210b[] bVarArr3 = this.f25603f;
        int i3 = this.f25608k;
        bVarArr3[i3] = bVar;
        C6222i iVar = bVar.f25583a;
        iVar.f25631d = i3;
        this.f25608k = i3 + 1;
        iVar.mo23732g(bVar);
    }

    /* renamed from: n */
    private void m27236n() {
        for (int i = 0; i < this.f25608k; i++) {
            C6210b bVar = this.f25603f[i];
            bVar.f25583a.f25633f = bVar.f25584b;
        }
    }

    /* renamed from: s */
    public static C6210b m27237s(C6213d dVar, C6222i iVar, C6222i iVar2, float f) {
        return dVar.mo23710r().mo23678j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m27238u(C6214a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f25608k) {
                z = false;
                break;
            }
            C6210b[] bVarArr = this.f25603f;
            if (bVarArr[i].f25583a.f25637j != C6222i.C6223a.UNRESTRICTED && bVarArr[i].f25584b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.f25608k) {
                C6210b bVar = this.f25603f[i3];
                if (bVar.f25583a.f25637j != C6222i.C6223a.UNRESTRICTED && !bVar.f25588f && bVar.f25584b < f) {
                    int i7 = 1;
                    while (i7 < this.f25607j) {
                        C6222i iVar = this.f25610m.f25592d[i7];
                        float j = bVar.f25587e.mo23660j(iVar);
                        if (j > f) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float f3 = iVar.f25635h[i8] / j;
                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                    i6 = i8;
                                    f2 = f3;
                                    i4 = i3;
                                    i5 = i7;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C6210b bVar2 = this.f25603f[i4];
                bVar2.f25583a.f25631d = -1;
                bVar2.mo23692y(this.f25610m.f25592d[i5]);
                C6222i iVar2 = bVar2.f25583a;
                iVar2.f25631d = i4;
                iVar2.mo23732g(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f25607j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: w */
    public static C6216e m27239w() {
        return f25594r;
    }

    /* renamed from: y */
    private void m27240y() {
        int i = this.f25601d * 2;
        this.f25601d = i;
        this.f25603f = (C6210b[]) Arrays.copyOf(this.f25603f, i);
        C6212c cVar = this.f25610m;
        cVar.f25592d = (C6222i[]) Arrays.copyOf(cVar.f25592d, this.f25601d);
        int i2 = this.f25601d;
        this.f25606i = new boolean[i2];
        this.f25602e = i2;
        this.f25609l = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo23694A(C6214a aVar) throws Exception {
        m27238u(aVar);
        m27232B(aVar, false);
        m27236n();
    }

    /* renamed from: D */
    public void mo23695D() {
        C6212c cVar;
        int i = 0;
        while (true) {
            cVar = this.f25610m;
            C6222i[] iVarArr = cVar.f25592d;
            if (i >= iVarArr.length) {
                break;
            }
            C6222i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo23729d();
            }
            i++;
        }
        cVar.f25591c.mo23717b(this.f25611n, this.f25612o);
        this.f25612o = 0;
        Arrays.fill(this.f25610m.f25592d, (Object) null);
        HashMap<String, C6222i> hashMap = this.f25599b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f25598a = 0;
        this.f25600c.clear();
        this.f25607j = 1;
        for (int i2 = 0; i2 < this.f25608k; i2++) {
            this.f25603f[i2].f25585c = false;
        }
        m27233C();
        this.f25608k = 0;
        if (f25595s) {
            this.f25613p = new C6215b(this.f25610m);
        } else {
            this.f25613p = new C6210b(this.f25610m);
        }
    }

    /* renamed from: b */
    public void mo23696b(C6246e eVar, C6246e eVar2, float f, int i) {
        C6246e eVar3 = eVar;
        C6246e eVar4 = eVar2;
        C6243d.C6245b bVar = C6243d.C6245b.LEFT;
        C6222i q = mo23709q(eVar3.mo23835n(bVar));
        C6243d.C6245b bVar2 = C6243d.C6245b.TOP;
        C6222i q2 = mo23709q(eVar3.mo23835n(bVar2));
        C6243d.C6245b bVar3 = C6243d.C6245b.RIGHT;
        C6222i q3 = mo23709q(eVar3.mo23835n(bVar3));
        C6243d.C6245b bVar4 = C6243d.C6245b.BOTTOM;
        C6222i q4 = mo23709q(eVar3.mo23835n(bVar4));
        C6222i q5 = mo23709q(eVar4.mo23835n(bVar));
        C6222i q6 = mo23709q(eVar4.mo23835n(bVar2));
        C6222i q7 = mo23709q(eVar4.mo23835n(bVar3));
        C6222i q8 = mo23709q(eVar4.mo23835n(bVar4));
        C6210b r = mo23710r();
        double d = (double) f;
        double sin = Math.sin(d);
        C6222i iVar = q7;
        double d2 = (double) i;
        Double.isNaN(d2);
        r.mo23685q(q2, q4, q6, q8, (float) (sin * d2));
        mo23698d(r);
        C6210b r2 = mo23710r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        r2.mo23685q(q, q3, q5, iVar, (float) (cos * d2));
        mo23698d(r2);
    }

    /* renamed from: c */
    public void mo23697c(C6222i iVar, C6222i iVar2, int i, float f, C6222i iVar3, C6222i iVar4, int i2, int i3) {
        int i4 = i3;
        C6210b r = mo23710r();
        r.mo23676h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo23671d(this, i4);
        }
        mo23698d(r);
    }

    /* renamed from: d */
    public void mo23698d(C6210b bVar) {
        C6222i w;
        if (bVar != null) {
            boolean z = true;
            if (this.f25608k + 1 >= this.f25609l || this.f25607j + 1 >= this.f25602e) {
                m27240y();
            }
            boolean z2 = false;
            if (!bVar.f25588f) {
                bVar.mo23666D(this);
                if (!bVar.mo23690u()) {
                    bVar.mo23686r();
                    if (bVar.mo23673f(this)) {
                        C6222i p = mo23708p();
                        bVar.f25583a = p;
                        m27235l(bVar);
                        this.f25613p.mo23667a(bVar);
                        m27232B(this.f25613p, true);
                        if (p.f25631d == -1) {
                            if (bVar.f25583a == p && (w = bVar.mo23691w(p)) != null) {
                                bVar.mo23692y(w);
                            }
                            if (!bVar.f25588f) {
                                bVar.f25583a.mo23732g(bVar);
                            }
                            this.f25608k--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.mo23687s()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m27235l(bVar);
            }
        }
    }

    /* renamed from: e */
    public C6210b mo23699e(C6222i iVar, C6222i iVar2, int i, int i2) {
        if (i2 == 8 && iVar2.f25634g && iVar.f25631d == -1) {
            iVar.mo23730e(this, iVar2.f25633f + ((float) i));
            return null;
        }
        C6210b r = mo23710r();
        r.mo23682n(iVar, iVar2, i);
        if (i2 != 8) {
            r.mo23671d(this, i2);
        }
        mo23698d(r);
        return r;
    }

    /* renamed from: f */
    public void mo23700f(C6222i iVar, int i) {
        int i2 = iVar.f25631d;
        if (i2 == -1) {
            iVar.mo23730e(this, (float) i);
        } else if (i2 != -1) {
            C6210b bVar = this.f25603f[i2];
            if (bVar.f25588f) {
                bVar.f25584b = (float) i;
            } else if (bVar.f25587e.mo23652c() == 0) {
                bVar.f25588f = true;
                bVar.f25584b = (float) i;
            } else {
                C6210b r = mo23710r();
                r.mo23681m(iVar, i);
                mo23698d(r);
            }
        } else {
            C6210b r2 = mo23710r();
            r2.mo23677i(iVar, i);
            mo23698d(r2);
        }
    }

    /* renamed from: g */
    public void mo23701g(C6222i iVar, C6222i iVar2, int i, boolean z) {
        C6210b r = mo23710r();
        C6222i t = mo23711t();
        t.f25632e = 0;
        r.mo23683o(iVar, iVar2, t, i);
        mo23698d(r);
    }

    /* renamed from: h */
    public void mo23702h(C6222i iVar, C6222i iVar2, int i, int i2) {
        C6210b r = mo23710r();
        C6222i t = mo23711t();
        t.f25632e = 0;
        r.mo23683o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo23706m(r, (int) (r.f25587e.mo23660j(t) * -1.0f), i2);
        }
        mo23698d(r);
    }

    /* renamed from: i */
    public void mo23703i(C6222i iVar, C6222i iVar2, int i, boolean z) {
        C6210b r = mo23710r();
        C6222i t = mo23711t();
        t.f25632e = 0;
        r.mo23684p(iVar, iVar2, t, i);
        mo23698d(r);
    }

    /* renamed from: j */
    public void mo23704j(C6222i iVar, C6222i iVar2, int i, int i2) {
        C6210b r = mo23710r();
        C6222i t = mo23711t();
        t.f25632e = 0;
        r.mo23684p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo23706m(r, (int) (r.f25587e.mo23660j(t) * -1.0f), i2);
        }
        mo23698d(r);
    }

    /* renamed from: k */
    public void mo23705k(C6222i iVar, C6222i iVar2, C6222i iVar3, C6222i iVar4, float f, int i) {
        C6210b r = mo23710r();
        r.mo23679k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo23671d(this, i);
        }
        mo23698d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23706m(C6210b bVar, int i, int i2) {
        bVar.mo23672e(mo23707o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C6222i mo23707o(int i, String str) {
        if (this.f25607j + 1 >= this.f25602e) {
            m27240y();
        }
        C6222i a = m27234a(C6222i.C6223a.ERROR, str);
        int i2 = this.f25598a + 1;
        this.f25598a = i2;
        this.f25607j++;
        a.f25630c = i2;
        a.f25632e = i;
        this.f25610m.f25592d[i2] = a;
        this.f25600c.mo23669c(a);
        return a;
    }

    /* renamed from: p */
    public C6222i mo23708p() {
        if (this.f25607j + 1 >= this.f25602e) {
            m27240y();
        }
        C6222i a = m27234a(C6222i.C6223a.SLACK, (String) null);
        int i = this.f25598a + 1;
        this.f25598a = i;
        this.f25607j++;
        a.f25630c = i;
        this.f25610m.f25592d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C6222i mo23709q(Object obj) {
        C6222i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f25607j + 1 >= this.f25602e) {
            m27240y();
        }
        if (obj instanceof C6243d) {
            C6243d dVar = (C6243d) obj;
            iVar = dVar.mo23771f();
            if (iVar == null) {
                dVar.mo23778m(this.f25610m);
                iVar = dVar.mo23771f();
            }
            int i = iVar.f25630c;
            if (i == -1 || i > this.f25598a || this.f25610m.f25592d[i] == null) {
                if (i != -1) {
                    iVar.mo23729d();
                }
                int i2 = this.f25598a + 1;
                this.f25598a = i2;
                this.f25607j++;
                iVar.f25630c = i2;
                iVar.f25637j = C6222i.C6223a.UNRESTRICTED;
                this.f25610m.f25592d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C6210b mo23710r() {
        C6210b bVar;
        if (f25595s) {
            bVar = this.f25610m.f25589a.acquire();
            if (bVar == null) {
                bVar = new C6215b(this.f25610m);
                f25597u++;
            } else {
                bVar.mo23693z();
            }
        } else {
            bVar = this.f25610m.f25590b.acquire();
            if (bVar == null) {
                bVar = new C6210b(this.f25610m);
                f25596t++;
            } else {
                bVar.mo23693z();
            }
        }
        C6222i.m27281b();
        return bVar;
    }

    /* renamed from: t */
    public C6222i mo23711t() {
        if (this.f25607j + 1 >= this.f25602e) {
            m27240y();
        }
        C6222i a = m27234a(C6222i.C6223a.SLACK, (String) null);
        int i = this.f25598a + 1;
        this.f25598a = i;
        this.f25607j++;
        a.f25630c = i;
        this.f25610m.f25592d[i] = a;
        return a;
    }

    /* renamed from: v */
    public C6212c mo23712v() {
        return this.f25610m;
    }

    /* renamed from: x */
    public int mo23713x(Object obj) {
        C6222i f = ((C6243d) obj).mo23771f();
        if (f != null) {
            return (int) (f.f25633f + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo23714z() throws Exception {
        if (this.f25604g || this.f25605h) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f25608k) {
                    z = true;
                    break;
                } else if (!this.f25603f[i].f25588f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo23694A(this.f25600c);
            } else {
                m27236n();
            }
        } else {
            mo23694A(this.f25600c);
        }
    }
}
