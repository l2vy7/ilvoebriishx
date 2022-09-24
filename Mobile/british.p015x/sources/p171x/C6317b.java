package p171x;

import java.util.ArrayList;
import p161v.C6213d;
import p161v.C6216e;
import p166w.C6243d;
import p166w.C6246e;
import p166w.C6249f;
import p166w.C6252h;
import p166w.C6254i;
import p166w.C6256k;
import p166w.C6257l;

/* renamed from: x.b */
/* compiled from: BasicMeasure */
public class C6317b {

    /* renamed from: a */
    private final ArrayList<C6246e> f26078a = new ArrayList<>();

    /* renamed from: b */
    private C6318a f26079b = new C6318a();

    /* renamed from: c */
    private C6249f f26080c;

    /* renamed from: x.b$a */
    /* compiled from: BasicMeasure */
    public static class C6318a {

        /* renamed from: a */
        public C6246e.C6248b f26081a;

        /* renamed from: b */
        public C6246e.C6248b f26082b;

        /* renamed from: c */
        public int f26083c;

        /* renamed from: d */
        public int f26084d;

        /* renamed from: e */
        public int f26085e;

        /* renamed from: f */
        public int f26086f;

        /* renamed from: g */
        public int f26087g;

        /* renamed from: h */
        public boolean f26088h;

        /* renamed from: i */
        public boolean f26089i;

        /* renamed from: j */
        public boolean f26090j;
    }

    /* renamed from: x.b$b */
    /* compiled from: BasicMeasure */
    public interface C6319b {
        /* renamed from: a */
        void mo2861a();

        /* renamed from: b */
        void mo2862b(C6246e eVar, C6318a aVar);
    }

    public C6317b(C6249f fVar) {
        this.f26080c = fVar;
    }

    /* renamed from: a */
    private boolean m27826a(C6319b bVar, C6246e eVar, boolean z) {
        this.f26079b.f26081a = eVar.mo23859z();
        this.f26079b.f26082b = eVar.mo23805N();
        this.f26079b.f26083c = eVar.mo23808Q();
        this.f26079b.f26084d = eVar.mo23853w();
        C6318a aVar = this.f26079b;
        aVar.f26089i = false;
        aVar.f26090j = z;
        C6246e.C6248b bVar2 = aVar.f26081a;
        C6246e.C6248b bVar3 = C6246e.C6248b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.f26082b == bVar3;
        boolean z4 = z2 && eVar.f25751S > 0.0f;
        boolean z5 = z3 && eVar.f25751S > 0.0f;
        if (z4 && eVar.f25785n[0] == 4) {
            aVar.f26081a = C6246e.C6248b.FIXED;
        }
        if (z5 && eVar.f25785n[1] == 4) {
            aVar.f26082b = C6246e.C6248b.FIXED;
        }
        bVar.mo2862b(eVar, aVar);
        eVar.mo23792F0(this.f26079b.f26085e);
        eVar.mo23827i0(this.f26079b.f26086f);
        eVar.mo23825h0(this.f26079b.f26088h);
        eVar.mo23819c0(this.f26079b.f26087g);
        C6318a aVar2 = this.f26079b;
        aVar2.f26090j = false;
        return aVar2.f26089i;
    }

    /* renamed from: b */
    private void m27827b(C6249f fVar) {
        int size = fVar.f25907G0.size();
        C6319b W0 = fVar.mo23867W0();
        for (int i = 0; i < size; i++) {
            C6246e eVar = fVar.f25907G0.get(i);
            if (!(eVar instanceof C6252h) && (!eVar.f25767e.f26141e.f26111j || !eVar.f25769f.f26141e.f26111j)) {
                C6246e.C6248b t = eVar.mo23847t(0);
                boolean z = true;
                C6246e.C6248b t2 = eVar.mo23847t(1);
                C6246e.C6248b bVar = C6246e.C6248b.MATCH_CONSTRAINT;
                if (t != bVar || eVar.f25781l == 1 || t2 != bVar || eVar.f25783m == 1) {
                    z = false;
                }
                if (!z) {
                    m27826a(W0, eVar, false);
                }
            }
        }
        W0.mo2861a();
    }

    /* renamed from: c */
    private void m27828c(C6249f fVar, String str, int i, int i2) {
        int F = fVar.mo23791F();
        int E = fVar.mo23789E();
        fVar.mo23852v0(0);
        fVar.mo23850u0(0);
        fVar.mo23792F0(i);
        fVar.mo23827i0(i2);
        fVar.mo23852v0(F);
        fVar.mo23850u0(E);
        this.f26080c.mo23861M0();
    }

    /* renamed from: d */
    public long mo24079d(C6249f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        C6319b bVar;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        C6249f fVar2 = fVar;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        C6319b W0 = fVar.mo23867W0();
        int size = fVar2.f25907G0.size();
        int Q = fVar.mo23808Q();
        int w = fVar.mo23853w();
        boolean b = C6256k.m27554b(i15, 128);
        boolean z6 = b || C6256k.m27554b(i15, 64);
        if (z6) {
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                }
                C6246e eVar = fVar2.f25907G0.get(i18);
                C6246e.C6248b z7 = eVar.mo23859z();
                C6246e.C6248b bVar2 = C6246e.C6248b.MATCH_CONSTRAINT;
                boolean z8 = (z7 == bVar2) && (eVar.mo23805N() == bVar2) && eVar.mo23849u() > 0.0f;
                if ((!eVar.mo23813W() || !z8) && ((!eVar.mo23815Y() || !z8) && !(eVar instanceof C6257l) && !eVar.mo23813W() && !eVar.mo23815Y())) {
                    i18++;
                }
            }
            z6 = false;
        }
        if (z6) {
            C6216e eVar2 = C6213d.f25594r;
        }
        if (z6 && ((i16 == 1073741824 && i17 == 1073741824) || b)) {
            int min = Math.min(fVar.mo23787D(), i5);
            int min2 = Math.min(fVar.mo23785C(), i7);
            if (i16 == 1073741824 && fVar.mo23808Q() != min) {
                fVar2.mo23792F0(min);
                fVar.mo23870Z0();
            }
            if (i17 == 1073741824 && fVar.mo23853w() != min2) {
                fVar2.mo23827i0(min2);
                fVar.mo23870Z0();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z = fVar2.mo23864T0(b);
                i10 = 2;
            } else {
                boolean U0 = fVar2.mo23865U0(b);
                if (i16 == 1073741824) {
                    z5 = U0 & fVar2.mo23866V0(b, 0);
                    i14 = 1;
                } else {
                    z5 = U0;
                    i14 = 0;
                }
                if (i17 == 1073741824) {
                    boolean V0 = fVar2.mo23866V0(b, 1) & z5;
                    i10 = i14 + 1;
                    z = V0;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                fVar2.mo23800J0(i16 == 1073741824, i17 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        if (size > 0) {
            m27827b(fVar);
        }
        int X0 = fVar.mo23868X0();
        int size2 = this.f26078a.size();
        if (size > 0) {
            m27828c(fVar2, "First pass", Q, w);
        }
        if (size2 > 0) {
            C6246e.C6248b z9 = fVar.mo23859z();
            C6246e.C6248b bVar3 = C6246e.C6248b.WRAP_CONTENT;
            boolean z10 = z9 == bVar3;
            boolean z11 = fVar.mo23805N() == bVar3;
            int max = Math.max(fVar.mo23808Q(), this.f26080c.mo23791F());
            int max2 = Math.max(fVar.mo23853w(), this.f26080c.mo23789E());
            int i19 = 0;
            boolean z12 = false;
            while (i19 < size2) {
                C6246e eVar3 = this.f26078a.get(i19);
                if (!(eVar3 instanceof C6257l)) {
                    i13 = X0;
                } else {
                    int Q2 = eVar3.mo23808Q();
                    int w2 = eVar3.mo23853w();
                    i13 = X0;
                    boolean a = z12 | m27826a(W0, eVar3, true);
                    int Q3 = eVar3.mo23808Q();
                    boolean z13 = a;
                    int w3 = eVar3.mo23853w();
                    if (Q3 != Q2) {
                        eVar3.mo23792F0(Q3);
                        if (z10 && eVar3.mo23799J() > max) {
                            max = Math.max(max, eVar3.mo23799J() + eVar3.mo23835n(C6243d.C6245b.RIGHT).mo23768c());
                        }
                        z4 = true;
                    } else {
                        z4 = z13;
                    }
                    if (w3 != w2) {
                        eVar3.mo23827i0(w3);
                        if (z11 && eVar3.mo23841q() > max2) {
                            max2 = Math.max(max2, eVar3.mo23841q() + eVar3.mo23835n(C6243d.C6245b.BOTTOM).mo23768c());
                        }
                        z4 = true;
                    }
                    z12 = z4 | ((C6257l) eVar3).mo23931W0();
                }
                i19++;
                X0 = i13;
            }
            int i20 = X0;
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                while (i22 < size2) {
                    C6246e eVar4 = this.f26078a.get(i22);
                    if ((!(eVar4 instanceof C6254i) || (eVar4 instanceof C6257l)) && !(eVar4 instanceof C6252h) && eVar4.mo23807P() != 8 && ((!eVar4.f25767e.f26141e.f26111j || !eVar4.f25769f.f26141e.f26111j) && !(eVar4 instanceof C6257l))) {
                        int Q4 = eVar4.mo23808Q();
                        int w4 = eVar4.mo23853w();
                        i11 = size2;
                        int o = eVar4.mo23837o();
                        i12 = i21;
                        z12 |= m27826a(W0, eVar4, true);
                        int Q5 = eVar4.mo23808Q();
                        bVar = W0;
                        int w5 = eVar4.mo23853w();
                        if (Q5 != Q4) {
                            eVar4.mo23792F0(Q5);
                            if (z10 && eVar4.mo23799J() > max) {
                                max = Math.max(max, eVar4.mo23799J() + eVar4.mo23835n(C6243d.C6245b.RIGHT).mo23768c());
                            }
                            z12 = true;
                        }
                        if (w5 != w4) {
                            eVar4.mo23827i0(w5);
                            if (z11 && eVar4.mo23841q() > max2) {
                                max2 = Math.max(max2, eVar4.mo23841q() + eVar4.mo23835n(C6243d.C6245b.BOTTOM).mo23768c());
                            }
                            z12 = true;
                        }
                        if (eVar4.mo23811T() && o != eVar4.mo23837o()) {
                            z12 = true;
                        }
                    } else {
                        i12 = i21;
                        i11 = size2;
                        bVar = W0;
                    }
                    i22++;
                    size2 = i11;
                    W0 = bVar;
                    i21 = i12;
                }
                int i23 = i21;
                int i24 = size2;
                C6319b bVar4 = W0;
                if (z12) {
                    m27828c(fVar2, "intermediate pass", Q, w);
                    z12 = false;
                }
                i21 = i23 + 1;
                size2 = i24;
                W0 = bVar4;
            }
            if (z12) {
                m27828c(fVar2, "2nd pass", Q, w);
                if (fVar.mo23808Q() < max) {
                    fVar2.mo23792F0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.mo23853w() < max2) {
                    fVar2.mo23827i0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m27828c(fVar2, "3rd pass", Q, w);
                }
            }
            X0 = i20;
        }
        fVar2.mo23878i1(X0);
        return 0;
    }

    /* renamed from: e */
    public void mo24080e(C6249f fVar) {
        C6246e.C6248b bVar;
        this.f26078a.clear();
        int size = fVar.f25907G0.size();
        for (int i = 0; i < size; i++) {
            C6246e eVar = fVar.f25907G0.get(i);
            C6246e.C6248b z = eVar.mo23859z();
            C6246e.C6248b bVar2 = C6246e.C6248b.MATCH_CONSTRAINT;
            if (z == bVar2 || eVar.mo23859z() == (bVar = C6246e.C6248b.MATCH_PARENT) || eVar.mo23805N() == bVar2 || eVar.mo23805N() == bVar) {
                this.f26078a.add(eVar);
            }
        }
        fVar.mo23870Z0();
    }
}
