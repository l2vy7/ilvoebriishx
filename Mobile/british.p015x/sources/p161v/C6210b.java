package p161v;

import java.util.ArrayList;
import java.util.Iterator;
import p161v.C6213d;
import p161v.C6222i;

/* renamed from: v.b */
/* compiled from: ArrayRow */
public class C6210b implements C6213d.C6214a {

    /* renamed from: a */
    C6222i f25583a = null;

    /* renamed from: b */
    float f25584b = 0.0f;

    /* renamed from: c */
    boolean f25585c = false;

    /* renamed from: d */
    ArrayList<C6222i> f25586d = new ArrayList<>();

    /* renamed from: e */
    public C6211a f25587e;

    /* renamed from: f */
    boolean f25588f = false;

    /* renamed from: v.b$a */
    /* compiled from: ArrayRow */
    public interface C6211a {
        /* renamed from: a */
        float mo23650a(C6210b bVar, boolean z);

        /* renamed from: b */
        void mo23651b(C6222i iVar, float f);

        /* renamed from: c */
        int mo23652c();

        void clear();

        /* renamed from: d */
        C6222i mo23654d(int i);

        /* renamed from: e */
        boolean mo23655e(C6222i iVar);

        /* renamed from: f */
        void mo23656f();

        /* renamed from: g */
        float mo23657g(int i);

        /* renamed from: h */
        float mo23658h(C6222i iVar, boolean z);

        /* renamed from: i */
        void mo23659i(C6222i iVar, float f, boolean z);

        /* renamed from: j */
        float mo23660j(C6222i iVar);

        /* renamed from: k */
        void mo23661k(float f);
    }

    public C6210b() {
    }

    /* renamed from: v */
    private boolean m27191v(C6222i iVar, C6213d dVar) {
        return iVar.f25640m <= 1;
    }

    /* renamed from: x */
    private C6222i m27192x(boolean[] zArr, C6222i iVar) {
        C6222i.C6223a aVar;
        int c = this.f25587e.mo23652c();
        C6222i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < c; i++) {
            float g = this.f25587e.mo23657g(i);
            if (g < 0.0f) {
                C6222i d = this.f25587e.mo23654d(i);
                if ((zArr == null || !zArr[d.f25630c]) && d != iVar && (((aVar = d.f25637j) == C6222i.C6223a.SLACK || aVar == C6222i.C6223a.ERROR) && g < f)) {
                    f = g;
                    iVar2 = d;
                }
            }
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo23663A() {
        /*
            r9 = this;
            v.i r0 = r9.f25583a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            v.i r1 = r9.f25583a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f25584b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f25584b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            v.b$a r5 = r9.f25587e
            int r5 = r5.mo23652c()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ee
            v.b$a r6 = r9.f25587e
            v.i r6 = r6.mo23654d(r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00ea
        L_0x0069:
            v.b$a r7 = r9.f25587e
            float r7 = r7.mo23657g(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00ea
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x0093:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00bc
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ba:
            float r7 = r7 * r8
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e9
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ee:
            if (r1 != 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161v.C6210b.mo23663A():java.lang.String");
    }

    /* renamed from: B */
    public void mo23664B(C6213d dVar, C6222i iVar, boolean z) {
        if (iVar.f25634g) {
            this.f25584b += iVar.f25633f * this.f25587e.mo23660j(iVar);
            this.f25587e.mo23658h(iVar, z);
            if (z) {
                iVar.mo23728c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo23665C(C6210b bVar, boolean z) {
        this.f25584b += bVar.f25584b * this.f25587e.mo23650a(bVar, z);
        if (z) {
            bVar.f25583a.mo23728c(this);
        }
    }

    /* renamed from: D */
    public void mo23666D(C6213d dVar) {
        if (dVar.f25603f.length != 0) {
            boolean z = false;
            while (!z) {
                int c = this.f25587e.mo23652c();
                for (int i = 0; i < c; i++) {
                    C6222i d = this.f25587e.mo23654d(i);
                    if (d.f25631d != -1 || d.f25634g) {
                        this.f25586d.add(d);
                    }
                }
                if (this.f25586d.size() > 0) {
                    Iterator<C6222i> it = this.f25586d.iterator();
                    while (it.hasNext()) {
                        C6222i next = it.next();
                        if (next.f25634g) {
                            mo23664B(dVar, next, true);
                        } else {
                            mo23665C(dVar.f25603f[next.f25631d], true);
                        }
                    }
                    this.f25586d.clear();
                } else {
                    z = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23667a(C6213d.C6214a aVar) {
        if (aVar instanceof C6210b) {
            C6210b bVar = (C6210b) aVar;
            this.f25583a = null;
            this.f25587e.clear();
            for (int i = 0; i < bVar.f25587e.mo23652c(); i++) {
                this.f25587e.mo23659i(bVar.f25587e.mo23654d(i), bVar.f25587e.mo23657g(i), true);
            }
        }
    }

    /* renamed from: b */
    public C6222i mo23668b(C6213d dVar, boolean[] zArr) {
        return m27192x(zArr, (C6222i) null);
    }

    /* renamed from: c */
    public void mo23669c(C6222i iVar) {
        int i = iVar.f25632e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f25587e.mo23651b(iVar, f);
    }

    public void clear() {
        this.f25587e.clear();
        this.f25583a = null;
        this.f25584b = 0.0f;
    }

    /* renamed from: d */
    public C6210b mo23671d(C6213d dVar, int i) {
        this.f25587e.mo23651b(dVar.mo23707o(i, "ep"), 1.0f);
        this.f25587e.mo23651b(dVar.mo23707o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6210b mo23672e(C6222i iVar, int i) {
        this.f25587e.mo23651b(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo23673f(C6213d dVar) {
        boolean z;
        C6222i g = mo23674g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo23692y(g);
            z = false;
        }
        if (this.f25587e.mo23652c() == 0) {
            this.f25588f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6222i mo23674g(C6213d dVar) {
        boolean v;
        boolean v2;
        int c = this.f25587e.mo23652c();
        C6222i iVar = null;
        C6222i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < c; i++) {
            float g = this.f25587e.mo23657g(i);
            C6222i d = this.f25587e.mo23654d(i);
            if (d.f25637j == C6222i.C6223a.UNRESTRICTED) {
                if (iVar == null) {
                    v2 = m27191v(d, dVar);
                } else if (f > g) {
                    v2 = m27191v(d, dVar);
                } else if (!z && m27191v(d, dVar)) {
                    f = g;
                    iVar = d;
                    z = true;
                }
                z = v2;
                f = g;
                iVar = d;
            } else if (iVar == null && g < 0.0f) {
                if (iVar2 == null) {
                    v = m27191v(d, dVar);
                } else if (f2 > g) {
                    v = m27191v(d, dVar);
                } else if (!z2 && m27191v(d, dVar)) {
                    f2 = g;
                    iVar2 = d;
                    z2 = true;
                }
                z2 = v;
                f2 = g;
                iVar2 = d;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C6222i getKey() {
        return this.f25583a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C6210b mo23676h(C6222i iVar, C6222i iVar2, int i, float f, C6222i iVar3, C6222i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar4, 1.0f);
            this.f25587e.mo23651b(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25587e.mo23651b(iVar3, -1.0f);
            this.f25587e.mo23651b(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f25584b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f25587e.mo23651b(iVar, -1.0f);
            this.f25587e.mo23651b(iVar2, 1.0f);
            this.f25584b = (float) i;
        } else if (f >= 1.0f) {
            this.f25587e.mo23651b(iVar4, -1.0f);
            this.f25587e.mo23651b(iVar3, 1.0f);
            this.f25584b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f25587e.mo23651b(iVar, f2 * 1.0f);
            this.f25587e.mo23651b(iVar2, f2 * -1.0f);
            this.f25587e.mo23651b(iVar3, -1.0f * f);
            this.f25587e.mo23651b(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f25584b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C6210b mo23677i(C6222i iVar, int i) {
        this.f25583a = iVar;
        float f = (float) i;
        iVar.f25633f = f;
        this.f25584b = f;
        this.f25588f = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C6210b mo23678j(C6222i iVar, C6222i iVar2, float f) {
        this.f25587e.mo23651b(iVar, -1.0f);
        this.f25587e.mo23651b(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C6210b mo23679k(C6222i iVar, C6222i iVar2, C6222i iVar3, C6222i iVar4, float f) {
        this.f25587e.mo23651b(iVar, -1.0f);
        this.f25587e.mo23651b(iVar2, 1.0f);
        this.f25587e.mo23651b(iVar3, f);
        this.f25587e.mo23651b(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C6210b mo23680l(float f, float f2, float f3, C6222i iVar, C6222i iVar2, C6222i iVar3, C6222i iVar4) {
        this.f25584b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25587e.mo23651b(iVar4, 1.0f);
            this.f25587e.mo23651b(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f25587e.mo23651b(iVar3, 1.0f);
            this.f25587e.mo23651b(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25587e.mo23651b(iVar4, f4);
            this.f25587e.mo23651b(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C6210b mo23681m(C6222i iVar, int i) {
        if (i < 0) {
            this.f25584b = (float) (i * -1);
            this.f25587e.mo23651b(iVar, 1.0f);
        } else {
            this.f25584b = (float) i;
            this.f25587e.mo23651b(iVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C6210b mo23682n(C6222i iVar, C6222i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f25584b = (float) i;
        }
        if (!z) {
            this.f25587e.mo23651b(iVar, -1.0f);
            this.f25587e.mo23651b(iVar2, 1.0f);
        } else {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C6210b mo23683o(C6222i iVar, C6222i iVar2, C6222i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f25584b = (float) i;
        }
        if (!z) {
            this.f25587e.mo23651b(iVar, -1.0f);
            this.f25587e.mo23651b(iVar2, 1.0f);
            this.f25587e.mo23651b(iVar3, 1.0f);
        } else {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25587e.mo23651b(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C6210b mo23684p(C6222i iVar, C6222i iVar2, C6222i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f25584b = (float) i;
        }
        if (!z) {
            this.f25587e.mo23651b(iVar, -1.0f);
            this.f25587e.mo23651b(iVar2, 1.0f);
            this.f25587e.mo23651b(iVar3, -1.0f);
        } else {
            this.f25587e.mo23651b(iVar, 1.0f);
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25587e.mo23651b(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C6210b mo23685q(C6222i iVar, C6222i iVar2, C6222i iVar3, C6222i iVar4, float f) {
        this.f25587e.mo23651b(iVar3, 0.5f);
        this.f25587e.mo23651b(iVar4, 0.5f);
        this.f25587e.mo23651b(iVar, -0.5f);
        this.f25587e.mo23651b(iVar2, -0.5f);
        this.f25584b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23686r() {
        float f = this.f25584b;
        if (f < 0.0f) {
            this.f25584b = f * -1.0f;
            this.f25587e.mo23656f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo23687s() {
        C6222i iVar = this.f25583a;
        return iVar != null && (iVar.f25637j == C6222i.C6223a.UNRESTRICTED || this.f25584b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo23688t(C6222i iVar) {
        return this.f25587e.mo23655e(iVar);
    }

    public String toString() {
        return mo23663A();
    }

    /* renamed from: u */
    public boolean mo23690u() {
        return this.f25583a == null && this.f25584b == 0.0f && this.f25587e.mo23652c() == 0;
    }

    /* renamed from: w */
    public C6222i mo23691w(C6222i iVar) {
        return m27192x((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo23692y(C6222i iVar) {
        C6222i iVar2 = this.f25583a;
        if (iVar2 != null) {
            this.f25587e.mo23651b(iVar2, -1.0f);
            this.f25583a = null;
        }
        float h = this.f25587e.mo23658h(iVar, true) * -1.0f;
        this.f25583a = iVar;
        if (h != 1.0f) {
            this.f25584b /= h;
            this.f25587e.mo23661k(h);
        }
    }

    /* renamed from: z */
    public void mo23693z() {
        this.f25583a = null;
        this.f25587e.clear();
        this.f25584b = 0.0f;
        this.f25588f = false;
    }

    public C6210b(C6212c cVar) {
        this.f25587e = new C6209a(this, cVar);
    }
}
