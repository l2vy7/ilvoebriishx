package p165w;

import java.util.ArrayList;
import p165w.C6246e;

/* renamed from: w.c */
/* compiled from: ChainHead */
public class C6242c {

    /* renamed from: a */
    protected C6246e f25687a;

    /* renamed from: b */
    protected C6246e f25688b;

    /* renamed from: c */
    protected C6246e f25689c;

    /* renamed from: d */
    protected C6246e f25690d;

    /* renamed from: e */
    protected C6246e f25691e;

    /* renamed from: f */
    protected C6246e f25692f;

    /* renamed from: g */
    protected C6246e f25693g;

    /* renamed from: h */
    protected ArrayList<C6246e> f25694h;

    /* renamed from: i */
    protected int f25695i;

    /* renamed from: j */
    protected int f25696j;

    /* renamed from: k */
    protected float f25697k = 0.0f;

    /* renamed from: l */
    int f25698l;

    /* renamed from: m */
    int f25699m;

    /* renamed from: n */
    int f25700n;

    /* renamed from: o */
    boolean f25701o;

    /* renamed from: p */
    private int f25702p;

    /* renamed from: q */
    private boolean f25703q = false;

    /* renamed from: r */
    protected boolean f25704r;

    /* renamed from: s */
    protected boolean f25705s;

    /* renamed from: t */
    protected boolean f25706t;

    /* renamed from: u */
    protected boolean f25707u;

    /* renamed from: v */
    private boolean f25708v;

    public C6242c(C6246e eVar, int i, boolean z) {
        this.f25687a = eVar;
        this.f25702p = i;
        this.f25703q = z;
    }

    /* renamed from: b */
    private void m27346b() {
        int i = this.f25702p * 2;
        C6246e eVar = this.f25687a;
        boolean z = true;
        this.f25701o = true;
        C6246e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f25695i++;
            C6246e[] eVarArr = eVar.f25733C0;
            int i2 = this.f25702p;
            C6246e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f25731B0[i2] = null;
            if (eVar.mo23807P() != 8) {
                this.f25698l++;
                C6246e.C6248b t = eVar.mo23847t(this.f25702p);
                C6246e.C6248b bVar = C6246e.C6248b.MATCH_CONSTRAINT;
                if (t != bVar) {
                    this.f25699m += eVar.mo23783B(this.f25702p);
                }
                int c = this.f25699m + eVar.f25744L[i].mo23768c();
                this.f25699m = c;
                int i3 = i + 1;
                this.f25699m = c + eVar.f25744L[i3].mo23768c();
                int c2 = this.f25700n + eVar.f25744L[i].mo23768c();
                this.f25700n = c2;
                this.f25700n = c2 + eVar.f25744L[i3].mo23768c();
                if (this.f25688b == null) {
                    this.f25688b = eVar;
                }
                this.f25690d = eVar;
                C6246e.C6248b[] bVarArr = eVar.f25747O;
                int i4 = this.f25702p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.f25785n;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f25696j++;
                        float[] fArr = eVar.f25729A0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f25697k += fArr[i4];
                        }
                        if (m27347c(eVar, i4)) {
                            if (f < 0.0f) {
                                this.f25704r = true;
                            } else {
                                this.f25705s = true;
                            }
                            if (this.f25694h == null) {
                                this.f25694h = new ArrayList<>();
                            }
                            this.f25694h.add(eVar);
                        }
                        if (this.f25692f == null) {
                            this.f25692f = eVar;
                        }
                        C6246e eVar4 = this.f25693g;
                        if (eVar4 != null) {
                            eVar4.f25731B0[this.f25702p] = eVar;
                        }
                        this.f25693g = eVar;
                    }
                    if (this.f25702p == 0) {
                        if (eVar.f25781l != 0) {
                            this.f25701o = false;
                        } else if (!(eVar.f25787o == 0 && eVar.f25789p == 0)) {
                            this.f25701o = false;
                        }
                    } else if (eVar.f25783m != 0) {
                        this.f25701o = false;
                    } else if (!(eVar.f25793r == 0 && eVar.f25795s == 0)) {
                        this.f25701o = false;
                    }
                    if (eVar.f25751S != 0.0f) {
                        this.f25701o = false;
                        this.f25707u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f25733C0[this.f25702p] = eVar;
            }
            C6243d dVar = eVar.f25744L[i + 1].f25712d;
            if (dVar != null) {
                C6246e eVar5 = dVar.f25710b;
                C6243d[] dVarArr = eVar5.f25744L;
                if (dVarArr[i].f25712d != null && dVarArr[i].f25712d.f25710b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C6246e eVar6 = this.f25688b;
        if (eVar6 != null) {
            this.f25699m -= eVar6.f25744L[i].mo23768c();
        }
        C6246e eVar7 = this.f25690d;
        if (eVar7 != null) {
            this.f25699m -= eVar7.f25744L[i + 1].mo23768c();
        }
        this.f25689c = eVar;
        if (this.f25702p != 0 || !this.f25703q) {
            this.f25691e = this.f25687a;
        } else {
            this.f25691e = eVar;
        }
        if (!this.f25705s || !this.f25704r) {
            z = false;
        }
        this.f25706t = z;
    }

    /* renamed from: c */
    private static boolean m27347c(C6246e eVar, int i) {
        if (eVar.mo23807P() != 8 && eVar.f25747O[i] == C6246e.C6248b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f25785n;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23765a() {
        if (!this.f25708v) {
            m27346b();
        }
        this.f25708v = true;
    }
}
