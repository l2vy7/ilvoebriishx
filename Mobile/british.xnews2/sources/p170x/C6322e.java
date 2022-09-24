package p170x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p165w.C6243d;
import p165w.C6246e;
import p165w.C6249f;
import p165w.C6252h;
import p165w.C6255j;
import p170x.C6317b;

/* renamed from: x.e */
/* compiled from: DependencyGraph */
public class C6322e {

    /* renamed from: a */
    private C6249f f26093a;

    /* renamed from: b */
    private boolean f26094b = true;

    /* renamed from: c */
    private boolean f26095c = true;

    /* renamed from: d */
    private C6249f f26096d;

    /* renamed from: e */
    private ArrayList<C6333m> f26097e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C6330k> f26098f = new ArrayList<>();

    /* renamed from: g */
    private C6317b.C6319b f26099g = null;

    /* renamed from: h */
    private C6317b.C6318a f26100h = new C6317b.C6318a();

    /* renamed from: i */
    ArrayList<C6330k> f26101i = new ArrayList<>();

    public C6322e(C6249f fVar) {
        this.f26093a = fVar;
        this.f26096d = fVar;
    }

    /* renamed from: a */
    private void m27843a(C6323f fVar, int i, int i2, C6323f fVar2, ArrayList<C6330k> arrayList, C6330k kVar) {
        C6333m mVar = fVar.f26105d;
        if (mVar.f26139c == null) {
            C6249f fVar3 = this.f26093a;
            if (mVar != fVar3.f25767e && mVar != fVar3.f25769f) {
                if (kVar == null) {
                    kVar = new C6330k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f26139c = kVar;
                kVar.mo24103a(mVar);
                for (C6321d next : mVar.f26144h.f26112k) {
                    if (next instanceof C6323f) {
                        m27843a((C6323f) next, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (C6321d next2 : mVar.f26145i.f26112k) {
                    if (next2 instanceof C6323f) {
                        m27843a((C6323f) next2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C6331l)) {
                    for (C6321d next3 : ((C6331l) mVar).f26134k.f26112k) {
                        if (next3 instanceof C6323f) {
                            m27843a((C6323f) next3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C6323f next4 : mVar.f26144h.f26113l) {
                    if (next4 == fVar2) {
                        kVar.f26128b = true;
                    }
                    m27843a(next4, i, 0, fVar2, arrayList, kVar);
                }
                for (C6323f next5 : mVar.f26145i.f26113l) {
                    if (next5 == fVar2) {
                        kVar.f26128b = true;
                    }
                    m27843a(next5, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C6331l)) {
                    for (C6323f a : ((C6331l) mVar).f26134k.f26113l) {
                        m27843a(a, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m27844b(C6249f fVar) {
        C6246e.C6248b bVar;
        C6246e.C6248b bVar2;
        int i;
        C6246e.C6248b bVar3;
        int i2;
        C6246e.C6248b bVar4;
        C6249f fVar2 = fVar;
        Iterator<C6246e> it = fVar2.f25907G0.iterator();
        while (it.hasNext()) {
            C6246e next = it.next();
            C6246e.C6248b[] bVarArr = next.f25747O;
            C6246e.C6248b bVar5 = bVarArr[0];
            C6246e.C6248b bVar6 = bVarArr[1];
            if (next.mo23807P() == 8) {
                next.f25759a = true;
            } else {
                if (next.f25791q < 1.0f && bVar5 == C6246e.C6248b.MATCH_CONSTRAINT) {
                    next.f25781l = 2;
                }
                if (next.f25797t < 1.0f && bVar6 == C6246e.C6248b.MATCH_CONSTRAINT) {
                    next.f25783m = 2;
                }
                if (next.mo23849u() > 0.0f) {
                    C6246e.C6248b bVar7 = C6246e.C6248b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == C6246e.C6248b.WRAP_CONTENT || bVar6 == C6246e.C6248b.FIXED)) {
                        next.f25781l = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == C6246e.C6248b.WRAP_CONTENT || bVar5 == C6246e.C6248b.FIXED)) {
                        next.f25783m = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f25781l == 0) {
                            next.f25781l = 3;
                        }
                        if (next.f25783m == 0) {
                            next.f25783m = 3;
                        }
                    }
                }
                C6246e.C6248b bVar8 = C6246e.C6248b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f25781l == 1 && (next.f25734D.f25712d == null || next.f25738F.f25712d == null)) {
                    bVar5 = C6246e.C6248b.WRAP_CONTENT;
                }
                C6246e.C6248b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f25783m == 1 && (next.f25736E.f25712d == null || next.f25739G.f25712d == null)) {
                    bVar6 = C6246e.C6248b.WRAP_CONTENT;
                }
                C6246e.C6248b bVar10 = bVar6;
                C6328j jVar = next.f25767e;
                jVar.f26140d = bVar9;
                int i3 = next.f25781l;
                jVar.f26137a = i3;
                C6331l lVar = next.f25769f;
                lVar.f26140d = bVar10;
                int i4 = next.f25783m;
                lVar.f26137a = i4;
                C6246e.C6248b bVar11 = C6246e.C6248b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == C6246e.C6248b.FIXED || bVar9 == C6246e.C6248b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == C6246e.C6248b.FIXED || bVar10 == C6246e.C6248b.WRAP_CONTENT)) {
                    int Q = next.mo23808Q();
                    if (bVar9 == bVar11) {
                        i = (fVar.mo23808Q() - next.f25734D.f25713e) - next.f25738F.f25713e;
                        bVar3 = C6246e.C6248b.FIXED;
                    } else {
                        i = Q;
                        bVar3 = bVar9;
                    }
                    int w = next.mo23853w();
                    if (bVar10 == bVar11) {
                        i2 = (fVar.mo23853w() - next.f25736E.f25713e) - next.f25739G.f25713e;
                        bVar4 = C6246e.C6248b.FIXED;
                    } else {
                        i2 = w;
                        bVar4 = bVar10;
                    }
                    m27847l(next, bVar3, i, bVar4, i2);
                    next.f25767e.f26141e.mo24099d(next.mo23808Q());
                    next.f25769f.f26141e.mo24099d(next.mo23853w());
                    next.f25759a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar2 = C6246e.C6248b.WRAP_CONTENT) || bVar10 == C6246e.C6248b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar10 == bVar2) {
                                m27847l(next, bVar2, 0, bVar2, 0);
                            }
                            int w2 = next.mo23853w();
                            C6246e.C6248b bVar12 = C6246e.C6248b.FIXED;
                            m27847l(next, bVar12, (int) ((((float) w2) * next.f25751S) + 0.5f), bVar12, w2);
                            next.f25767e.f26141e.mo24099d(next.mo23808Q());
                            next.f25769f.f26141e.mo24099d(next.mo23853w());
                            next.f25759a = true;
                        } else if (i3 == 1) {
                            m27847l(next, bVar2, 0, bVar10, 0);
                            next.f25767e.f26141e.f26123m = next.mo23808Q();
                        } else if (i3 == 2) {
                            C6246e.C6248b[] bVarArr2 = fVar2.f25747O;
                            C6246e.C6248b bVar13 = bVarArr2[0];
                            C6246e.C6248b bVar14 = C6246e.C6248b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                m27847l(next, bVar14, (int) ((next.f25791q * ((float) fVar.mo23808Q())) + 0.5f), bVar10, next.mo23853w());
                                next.f25767e.f26141e.mo24099d(next.mo23808Q());
                                next.f25769f.f26141e.mo24099d(next.mo23853w());
                                next.f25759a = true;
                            }
                        } else {
                            C6243d[] dVarArr = next.f25744L;
                            if (dVarArr[0].f25712d == null || dVarArr[1].f25712d == null) {
                                m27847l(next, bVar2, 0, bVar10, 0);
                                next.f25767e.f26141e.mo24099d(next.mo23808Q());
                                next.f25769f.f26141e.mo24099d(next.mo23853w());
                                next.f25759a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar = C6246e.C6248b.WRAP_CONTENT) || bVar9 == C6246e.C6248b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar9 == bVar) {
                                m27847l(next, bVar, 0, bVar, 0);
                            }
                            int Q2 = next.mo23808Q();
                            float f = next.f25751S;
                            if (next.mo23851v() == -1) {
                                f = 1.0f / f;
                            }
                            C6246e.C6248b bVar15 = C6246e.C6248b.FIXED;
                            m27847l(next, bVar15, Q2, bVar15, (int) ((((float) Q2) * f) + 0.5f));
                            next.f25767e.f26141e.mo24099d(next.mo23808Q());
                            next.f25769f.f26141e.mo24099d(next.mo23853w());
                            next.f25759a = true;
                        } else if (i4 == 1) {
                            m27847l(next, bVar9, 0, bVar, 0);
                            next.f25769f.f26141e.f26123m = next.mo23853w();
                        } else if (i4 == 2) {
                            C6246e.C6248b[] bVarArr3 = fVar2.f25747O;
                            C6246e.C6248b bVar16 = bVarArr3[1];
                            C6246e.C6248b bVar17 = C6246e.C6248b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                C6246e eVar = next;
                                C6246e.C6248b bVar18 = bVar9;
                                C6246e.C6248b bVar19 = bVar17;
                                m27847l(eVar, bVar18, next.mo23808Q(), bVar19, (int) ((next.f25797t * ((float) fVar.mo23853w())) + 0.5f));
                                next.f25767e.f26141e.mo24099d(next.mo23808Q());
                                next.f25769f.f26141e.mo24099d(next.mo23853w());
                                next.f25759a = true;
                            }
                        } else {
                            C6243d[] dVarArr2 = next.f25744L;
                            if (dVarArr2[2].f25712d == null || dVarArr2[3].f25712d == null) {
                                m27847l(next, bVar, 0, bVar10, 0);
                                next.f25767e.f26141e.mo24099d(next.mo23808Q());
                                next.f25769f.f26141e.mo24099d(next.mo23853w());
                                next.f25759a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i3 == 1 || i4 == 1) {
                            C6246e.C6248b bVar20 = C6246e.C6248b.WRAP_CONTENT;
                            m27847l(next, bVar20, 0, bVar20, 0);
                            next.f25767e.f26141e.f26123m = next.mo23808Q();
                            next.f25769f.f26141e.f26123m = next.mo23853w();
                        } else if (i4 == 2 && i3 == 2) {
                            C6246e.C6248b[] bVarArr4 = fVar2.f25747O;
                            C6246e.C6248b bVar21 = bVarArr4[0];
                            C6246e.C6248b bVar22 = C6246e.C6248b.FIXED;
                            if ((bVar21 == bVar22 || bVarArr4[0] == bVar22) && (bVarArr4[1] == bVar22 || bVarArr4[1] == bVar22)) {
                                float f2 = next.f25791q;
                                float f3 = next.f25797t;
                                m27847l(next, bVar22, (int) ((f2 * ((float) fVar.mo23808Q())) + 0.5f), bVar22, (int) ((f3 * ((float) fVar.mo23853w())) + 0.5f));
                                next.f25767e.f26141e.mo24099d(next.mo23808Q());
                                next.f25769f.f26141e.mo24099d(next.mo23853w());
                                next.f25759a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m27845e(C6249f fVar, int i) {
        int size = this.f26101i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f26101i.get(i2).mo24104b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m27846i(C6333m mVar, int i, ArrayList<C6330k> arrayList) {
        for (C6321d next : mVar.f26144h.f26112k) {
            if (next instanceof C6323f) {
                m27843a((C6323f) next, i, 0, mVar.f26145i, arrayList, (C6330k) null);
            } else if (next instanceof C6333m) {
                m27843a(((C6333m) next).f26144h, i, 0, mVar.f26145i, arrayList, (C6330k) null);
            }
        }
        for (C6321d next2 : mVar.f26145i.f26112k) {
            if (next2 instanceof C6323f) {
                m27843a((C6323f) next2, i, 1, mVar.f26144h, arrayList, (C6330k) null);
            } else if (next2 instanceof C6333m) {
                m27843a(((C6333m) next2).f26145i, i, 1, mVar.f26144h, arrayList, (C6330k) null);
            }
        }
        if (i == 1) {
            for (C6321d next3 : ((C6331l) mVar).f26134k.f26112k) {
                if (next3 instanceof C6323f) {
                    m27843a((C6323f) next3, i, 2, (C6323f) null, arrayList, (C6330k) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m27847l(C6246e eVar, C6246e.C6248b bVar, int i, C6246e.C6248b bVar2, int i2) {
        C6317b.C6318a aVar = this.f26100h;
        aVar.f26081a = bVar;
        aVar.f26082b = bVar2;
        aVar.f26083c = i;
        aVar.f26084d = i2;
        this.f26099g.mo2862b(eVar, aVar);
        eVar.mo23792F0(this.f26100h.f26085e);
        eVar.mo23827i0(this.f26100h.f26086f);
        eVar.mo23825h0(this.f26100h.f26088h);
        eVar.mo23819c0(this.f26100h.f26087g);
    }

    /* renamed from: c */
    public void mo24088c() {
        mo24089d(this.f26097e);
        this.f26101i.clear();
        C6330k.f26126h = 0;
        m27846i(this.f26093a.f25767e, 0, this.f26101i);
        m27846i(this.f26093a.f25769f, 1, this.f26101i);
        this.f26094b = false;
    }

    /* renamed from: d */
    public void mo24089d(ArrayList<C6333m> arrayList) {
        arrayList.clear();
        this.f26096d.f25767e.mo24084f();
        this.f26096d.f25769f.mo24084f();
        arrayList.add(this.f26096d.f25767e);
        arrayList.add(this.f26096d.f25769f);
        Iterator<C6246e> it = this.f26096d.f25907G0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C6246e next = it.next();
            if (next instanceof C6252h) {
                arrayList.add(new C6326h(next));
            } else {
                if (next.mo23813W()) {
                    if (next.f25763c == null) {
                        next.f25763c = new C6320c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f25763c);
                } else {
                    arrayList.add(next.f25767e);
                }
                if (next.mo23815Y()) {
                    if (next.f25765d == null) {
                        next.f25765d = new C6320c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f25765d);
                } else {
                    arrayList.add(next.f25769f);
                }
                if (next instanceof C6255j) {
                    arrayList.add(new C6327i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C6333m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo24084f();
        }
        Iterator<C6333m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C6333m next2 = it3.next();
            if (next2.f26138b != this.f26096d) {
                next2.mo24082d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo24090f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f26094b || this.f26095c) {
            Iterator<C6246e> it = this.f26093a.f25907G0.iterator();
            while (it.hasNext()) {
                C6246e next = it.next();
                next.f25759a = false;
                next.f25767e.mo24101r();
                next.f25769f.mo24105q();
            }
            C6249f fVar = this.f26093a;
            fVar.f25759a = false;
            fVar.f25767e.mo24101r();
            this.f26093a.f25769f.mo24105q();
            this.f26095c = false;
        }
        if (m27844b(this.f26096d)) {
            return false;
        }
        this.f26093a.mo23794G0(0);
        this.f26093a.mo23796H0(0);
        C6246e.C6248b t = this.f26093a.mo23847t(0);
        C6246e.C6248b t2 = this.f26093a.mo23847t(1);
        if (this.f26094b) {
            mo24088c();
        }
        int R = this.f26093a.mo23809R();
        int S = this.f26093a.mo23810S();
        this.f26093a.f25767e.f26144h.mo24099d(R);
        this.f26093a.f25769f.f26144h.mo24099d(S);
        mo24095m();
        C6246e.C6248b bVar = C6246e.C6248b.WRAP_CONTENT;
        if (t == bVar || t2 == bVar) {
            if (z4) {
                Iterator<C6333m> it2 = this.f26097e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo24086m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && t == C6246e.C6248b.WRAP_CONTENT) {
                this.f26093a.mo23834m0(C6246e.C6248b.FIXED);
                C6249f fVar2 = this.f26093a;
                fVar2.mo23792F0(m27845e(fVar2, 0));
                C6249f fVar3 = this.f26093a;
                fVar3.f25767e.f26141e.mo24099d(fVar3.mo23808Q());
            }
            if (z4 && t2 == C6246e.C6248b.WRAP_CONTENT) {
                this.f26093a.mo23784B0(C6246e.C6248b.FIXED);
                C6249f fVar4 = this.f26093a;
                fVar4.mo23827i0(m27845e(fVar4, 1));
                C6249f fVar5 = this.f26093a;
                fVar5.f25769f.f26141e.mo24099d(fVar5.mo23853w());
            }
        }
        C6249f fVar6 = this.f26093a;
        C6246e.C6248b[] bVarArr = fVar6.f25747O;
        C6246e.C6248b bVar2 = bVarArr[0];
        C6246e.C6248b bVar3 = C6246e.C6248b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C6246e.C6248b.MATCH_PARENT) {
            int Q = fVar6.mo23808Q() + R;
            this.f26093a.f25767e.f26145i.mo24099d(Q);
            this.f26093a.f25767e.f26141e.mo24099d(Q - R);
            mo24095m();
            C6249f fVar7 = this.f26093a;
            C6246e.C6248b[] bVarArr2 = fVar7.f25747O;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C6246e.C6248b.MATCH_PARENT) {
                int w = fVar7.mo23853w() + S;
                this.f26093a.f25769f.f26145i.mo24099d(w);
                this.f26093a.f25769f.f26141e.mo24099d(w - S);
            }
            mo24095m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C6333m> it3 = this.f26097e.iterator();
        while (it3.hasNext()) {
            C6333m next2 = it3.next();
            if (next2.f26138b != this.f26093a || next2.f26143g) {
                next2.mo24083e();
            }
        }
        Iterator<C6333m> it4 = this.f26097e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C6333m next3 = it4.next();
            if ((z2 || next3.f26138b != this.f26093a) && (!next3.f26144h.f26111j || ((!next3.f26145i.f26111j && !(next3 instanceof C6326h)) || (!next3.f26141e.f26111j && !(next3 instanceof C6320c) && !(next3 instanceof C6326h))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f26093a.mo23834m0(t);
        this.f26093a.mo23784B0(t2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo24091g(boolean z) {
        if (this.f26094b) {
            Iterator<C6246e> it = this.f26093a.f25907G0.iterator();
            while (it.hasNext()) {
                C6246e next = it.next();
                next.f25759a = false;
                C6328j jVar = next.f25767e;
                jVar.f26141e.f26111j = false;
                jVar.f26143g = false;
                jVar.mo24101r();
                C6331l lVar = next.f25769f;
                lVar.f26141e.f26111j = false;
                lVar.f26143g = false;
                lVar.mo24105q();
            }
            C6249f fVar = this.f26093a;
            fVar.f25759a = false;
            C6328j jVar2 = fVar.f25767e;
            jVar2.f26141e.f26111j = false;
            jVar2.f26143g = false;
            jVar2.mo24101r();
            C6331l lVar2 = this.f26093a.f25769f;
            lVar2.f26141e.f26111j = false;
            lVar2.f26143g = false;
            lVar2.mo24105q();
            mo24088c();
        }
        if (m27844b(this.f26096d)) {
            return false;
        }
        this.f26093a.mo23794G0(0);
        this.f26093a.mo23796H0(0);
        this.f26093a.f25767e.f26144h.mo24099d(0);
        this.f26093a.f25769f.f26144h.mo24099d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24092h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            w.f r1 = r9.f26093a
            r2 = 0
            w.e$b r1 = r1.mo23847t(r2)
            w.f r3 = r9.f26093a
            w.e$b r3 = r3.mo23847t(r0)
            w.f r4 = r9.f26093a
            int r4 = r4.mo23809R()
            w.f r5 = r9.f26093a
            int r5 = r5.mo23810S()
            if (r10 == 0) goto L_0x0089
            w.e$b r6 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<x.m> r6 = r9.f26097e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            x.m r7 = (p170x.C6333m) r7
            int r8 = r7.f26142f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo24086m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            w.e$b r10 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            w.f r10 = r9.f26093a
            w.e$b r6 = p165w.C6246e.C6248b.FIXED
            r10.mo23834m0(r6)
            w.f r10 = r9.f26093a
            int r6 = r9.m27845e(r10, r2)
            r10.mo23792F0(r6)
            w.f r10 = r9.f26093a
            x.j r6 = r10.f25767e
            x.g r6 = r6.f26141e
            int r10 = r10.mo23808Q()
            r6.mo24099d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            w.e$b r10 = p165w.C6246e.C6248b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            w.f r10 = r9.f26093a
            w.e$b r6 = p165w.C6246e.C6248b.FIXED
            r10.mo23784B0(r6)
            w.f r10 = r9.f26093a
            int r6 = r9.m27845e(r10, r0)
            r10.mo23827i0(r6)
            w.f r10 = r9.f26093a
            x.l r6 = r10.f25769f
            x.g r6 = r6.f26141e
            int r10 = r10.mo23853w()
            r6.mo24099d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b4
            w.f r10 = r9.f26093a
            w.e$b[] r5 = r10.f25747O
            r6 = r5[r2]
            w.e$b r7 = p165w.C6246e.C6248b.FIXED
            if (r6 == r7) goto L_0x009b
            r5 = r5[r2]
            w.e$b r6 = p165w.C6246e.C6248b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c5
        L_0x009b:
            int r10 = r10.mo23808Q()
            int r10 = r10 + r4
            w.f r5 = r9.f26093a
            x.j r5 = r5.f25767e
            x.f r5 = r5.f26145i
            r5.mo24099d(r10)
            w.f r5 = r9.f26093a
            x.j r5 = r5.f25767e
            x.g r5 = r5.f26141e
            int r10 = r10 - r4
            r5.mo24099d(r10)
            goto L_0x00df
        L_0x00b4:
            w.f r10 = r9.f26093a
            w.e$b[] r4 = r10.f25747O
            r6 = r4[r0]
            w.e$b r7 = p165w.C6246e.C6248b.FIXED
            if (r6 == r7) goto L_0x00c7
            r4 = r4[r0]
            w.e$b r6 = p165w.C6246e.C6248b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00e0
        L_0x00c7:
            int r10 = r10.mo23853w()
            int r10 = r10 + r5
            w.f r4 = r9.f26093a
            x.l r4 = r4.f25769f
            x.f r4 = r4.f26145i
            r4.mo24099d(r10)
            w.f r4 = r9.f26093a
            x.l r4 = r4.f25769f
            x.g r4 = r4.f26141e
            int r10 = r10 - r5
            r4.mo24099d(r10)
        L_0x00df:
            r10 = 1
        L_0x00e0:
            r9.mo24095m()
            java.util.ArrayList<x.m> r4 = r9.f26097e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            x.m r5 = (p170x.C6333m) r5
            int r6 = r5.f26142f
            if (r6 == r11) goto L_0x00fa
            goto L_0x00e9
        L_0x00fa:
            w.e r6 = r5.f26138b
            w.f r7 = r9.f26093a
            if (r6 != r7) goto L_0x0105
            boolean r6 = r5.f26143g
            if (r6 != 0) goto L_0x0105
            goto L_0x00e9
        L_0x0105:
            r5.mo24083e()
            goto L_0x00e9
        L_0x0109:
            java.util.ArrayList<x.m> r4 = r9.f26097e
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r4.next()
            x.m r5 = (p170x.C6333m) r5
            int r6 = r5.f26142f
            if (r6 == r11) goto L_0x0120
            goto L_0x010f
        L_0x0120:
            if (r10 != 0) goto L_0x0129
            w.e r6 = r5.f26138b
            w.f r7 = r9.f26093a
            if (r6 != r7) goto L_0x0129
            goto L_0x010f
        L_0x0129:
            x.f r6 = r5.f26144h
            boolean r6 = r6.f26111j
            if (r6 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            goto L_0x0143
        L_0x0131:
            x.f r6 = r5.f26145i
            boolean r6 = r6.f26111j
            if (r6 != 0) goto L_0x0138
            goto L_0x012f
        L_0x0138:
            boolean r6 = r5 instanceof p170x.C6320c
            if (r6 != 0) goto L_0x010f
            x.g r5 = r5.f26141e
            boolean r5 = r5.f26111j
            if (r5 != 0) goto L_0x010f
            goto L_0x012f
        L_0x0143:
            w.f r10 = r9.f26093a
            r10.mo23834m0(r1)
            w.f r10 = r9.f26093a
            r10.mo23784B0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p170x.C6322e.mo24092h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo24093j() {
        this.f26094b = true;
    }

    /* renamed from: k */
    public void mo24094k() {
        this.f26095c = true;
    }

    /* renamed from: m */
    public void mo24095m() {
        C6325g gVar;
        Iterator<C6246e> it = this.f26093a.f25907G0.iterator();
        while (it.hasNext()) {
            C6246e next = it.next();
            if (!next.f25759a) {
                C6246e.C6248b[] bVarArr = next.f25747O;
                boolean z = false;
                C6246e.C6248b bVar = bVarArr[0];
                C6246e.C6248b bVar2 = bVarArr[1];
                int i = next.f25781l;
                int i2 = next.f25783m;
                C6246e.C6248b bVar3 = C6246e.C6248b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == C6246e.C6248b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C6246e.C6248b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C6325g gVar2 = next.f25767e.f26141e;
                boolean z3 = gVar2.f26111j;
                C6325g gVar3 = next.f25769f.f26141e;
                boolean z4 = gVar3.f26111j;
                if (z3 && z4) {
                    C6246e.C6248b bVar4 = C6246e.C6248b.FIXED;
                    m27847l(next, bVar4, gVar2.f26108g, bVar4, gVar3.f26108g);
                    next.f25759a = true;
                } else if (z3 && z) {
                    m27847l(next, C6246e.C6248b.FIXED, gVar2.f26108g, bVar3, gVar3.f26108g);
                    if (bVar2 == C6246e.C6248b.MATCH_CONSTRAINT) {
                        next.f25769f.f26141e.f26123m = next.mo23853w();
                    } else {
                        next.f25769f.f26141e.mo24099d(next.mo23853w());
                        next.f25759a = true;
                    }
                } else if (z4 && z2) {
                    m27847l(next, bVar3, gVar2.f26108g, C6246e.C6248b.FIXED, gVar3.f26108g);
                    if (bVar == C6246e.C6248b.MATCH_CONSTRAINT) {
                        next.f25767e.f26141e.f26123m = next.mo23808Q();
                    } else {
                        next.f25767e.f26141e.mo24099d(next.mo23808Q());
                        next.f25759a = true;
                    }
                }
                if (next.f25759a && (gVar = next.f25769f.f26135l) != null) {
                    gVar.mo24099d(next.mo23837o());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo24096n(C6317b.C6319b bVar) {
        this.f26099g = bVar;
    }
}
