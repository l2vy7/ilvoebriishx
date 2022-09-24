package p171x;

import p166w.C6243d;
import p166w.C6246e;
import p166w.C6254i;
import p171x.C6323f;
import p171x.C6333m;

/* renamed from: x.l */
/* compiled from: VerticalWidgetRun */
public class C6331l extends C6333m {

    /* renamed from: k */
    public C6323f f26134k;

    /* renamed from: l */
    C6325g f26135l = null;

    /* renamed from: x.l$a */
    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class C6332a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26136a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                x.m$b[] r0 = p171x.C6333m.C6335b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26136a = r0
                x.m$b r1 = p171x.C6333m.C6335b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26136a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.m$b r1 = p171x.C6333m.C6335b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26136a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.m$b r1 = p171x.C6333m.C6335b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171x.C6331l.C6332a.<clinit>():void");
        }
    }

    public C6331l(C6246e eVar) {
        super(eVar);
        C6323f fVar = new C6323f(this);
        this.f26134k = fVar;
        this.f26144h.f26106e = C6323f.C6324a.TOP;
        this.f26145i.f26106e = C6323f.C6324a.BOTTOM;
        fVar.f26106e = C6323f.C6324a.BASELINE;
        this.f26142f = 1;
    }

    /* renamed from: a */
    public void mo24081a(C6321d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C6332a.f26136a[this.f26146j.ordinal()];
        if (i2 == 1) {
            mo24115p(dVar);
        } else if (i2 == 2) {
            mo24114o(dVar);
        } else if (i2 == 3) {
            C6246e eVar = this.f26138b;
            mo24113n(dVar, eVar.f25736E, eVar.f25739G, 1);
            return;
        }
        C6325g gVar = this.f26141e;
        if (gVar.f26104c && !gVar.f26111j && this.f26140d == C6246e.C6248b.MATCH_CONSTRAINT) {
            C6246e eVar2 = this.f26138b;
            int i3 = eVar2.f25783m;
            if (i3 == 2) {
                C6246e H = eVar2.mo23795H();
                if (H != null) {
                    C6325g gVar2 = H.f25769f.f26141e;
                    if (gVar2.f26111j) {
                        float f4 = this.f26138b.f25797t;
                        this.f26141e.mo24099d((int) ((((float) gVar2.f26108g) * f4) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.f25767e.f26141e.f26111j) {
                int v = eVar2.mo23851v();
                if (v == -1) {
                    C6246e eVar3 = this.f26138b;
                    f3 = (float) eVar3.f25767e.f26141e.f26108g;
                    f2 = eVar3.mo23849u();
                } else if (v == 0) {
                    C6246e eVar4 = this.f26138b;
                    f = ((float) eVar4.f25767e.f26141e.f26108g) * eVar4.mo23849u();
                    i = (int) (f + 0.5f);
                    this.f26141e.mo24099d(i);
                } else if (v != 1) {
                    i = 0;
                    this.f26141e.mo24099d(i);
                } else {
                    C6246e eVar5 = this.f26138b;
                    f3 = (float) eVar5.f25767e.f26141e.f26108g;
                    f2 = eVar5.mo23849u();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f26141e.mo24099d(i);
            }
        }
        C6323f fVar = this.f26144h;
        if (fVar.f26104c) {
            C6323f fVar2 = this.f26145i;
            if (fVar2.f26104c) {
                if (!fVar.f26111j || !fVar2.f26111j || !this.f26141e.f26111j) {
                    if (!this.f26141e.f26111j && this.f26140d == C6246e.C6248b.MATCH_CONSTRAINT) {
                        C6246e eVar6 = this.f26138b;
                        if (eVar6.f25781l == 0 && !eVar6.mo23815Y()) {
                            int i4 = this.f26144h.f26113l.get(0).f26108g;
                            C6323f fVar3 = this.f26144h;
                            int i5 = i4 + fVar3.f26107f;
                            int i6 = this.f26145i.f26113l.get(0).f26108g + this.f26145i.f26107f;
                            fVar3.mo24099d(i5);
                            this.f26145i.mo24099d(i6);
                            this.f26141e.mo24099d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f26141e.f26111j && this.f26140d == C6246e.C6248b.MATCH_CONSTRAINT && this.f26137a == 1 && this.f26144h.f26113l.size() > 0 && this.f26145i.f26113l.size() > 0) {
                        int i7 = (this.f26145i.f26113l.get(0).f26108g + this.f26145i.f26107f) - (this.f26144h.f26113l.get(0).f26108g + this.f26144h.f26107f);
                        C6325g gVar3 = this.f26141e;
                        int i8 = gVar3.f26123m;
                        if (i7 < i8) {
                            gVar3.mo24099d(i7);
                        } else {
                            gVar3.mo24099d(i8);
                        }
                    }
                    if (this.f26141e.f26111j && this.f26144h.f26113l.size() > 0 && this.f26145i.f26113l.size() > 0) {
                        C6323f fVar4 = this.f26144h.f26113l.get(0);
                        C6323f fVar5 = this.f26145i.f26113l.get(0);
                        int i9 = fVar4.f26108g + this.f26144h.f26107f;
                        int i10 = fVar5.f26108g + this.f26145i.f26107f;
                        float L = this.f26138b.mo23803L();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f26108g;
                            i10 = fVar5.f26108g;
                            L = 0.5f;
                        }
                        this.f26144h.mo24099d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f26141e.f26108g)) * L)));
                        this.f26145i.mo24099d(this.f26144h.f26108g + this.f26141e.f26108g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24082d() {
        C6246e H;
        C6246e H2;
        C6246e eVar = this.f26138b;
        if (eVar.f25759a) {
            this.f26141e.mo24099d(eVar.mo23853w());
        }
        if (!this.f26141e.f26111j) {
            this.f26140d = this.f26138b.mo23805N();
            if (this.f26138b.mo23811T()) {
                this.f26135l = new C6316a(this);
            }
            C6246e.C6248b bVar = this.f26140d;
            if (bVar != C6246e.C6248b.MATCH_CONSTRAINT) {
                if (bVar == C6246e.C6248b.MATCH_PARENT && (H2 = this.f26138b.mo23795H()) != null && H2.mo23805N() == C6246e.C6248b.FIXED) {
                    int w = (H2.mo23853w() - this.f26138b.f25736E.mo23768c()) - this.f26138b.f25739G.mo23768c();
                    mo24107b(this.f26144h, H2.f25769f.f26144h, this.f26138b.f25736E.mo23768c());
                    mo24107b(this.f26145i, H2.f25769f.f26145i, -this.f26138b.f25739G.mo23768c());
                    this.f26141e.mo24099d(w);
                    return;
                } else if (this.f26140d == C6246e.C6248b.FIXED) {
                    this.f26141e.mo24099d(this.f26138b.mo23853w());
                }
            }
        } else if (this.f26140d == C6246e.C6248b.MATCH_PARENT && (H = this.f26138b.mo23795H()) != null && H.mo23805N() == C6246e.C6248b.FIXED) {
            mo24107b(this.f26144h, H.f25769f.f26144h, this.f26138b.f25736E.mo23768c());
            mo24107b(this.f26145i, H.f25769f.f26145i, -this.f26138b.f25739G.mo23768c());
            return;
        }
        C6325g gVar = this.f26141e;
        boolean z = gVar.f26111j;
        if (z) {
            C6246e eVar2 = this.f26138b;
            if (eVar2.f25759a) {
                C6243d[] dVarArr = eVar2.f25744L;
                if (dVarArr[2].f25712d != null && dVarArr[3].f25712d != null) {
                    if (eVar2.mo23815Y()) {
                        this.f26144h.f26107f = this.f26138b.f25744L[2].mo23768c();
                        this.f26145i.f26107f = -this.f26138b.f25744L[3].mo23768c();
                    } else {
                        C6323f h = mo24110h(this.f26138b.f25744L[2]);
                        if (h != null) {
                            mo24107b(this.f26144h, h, this.f26138b.f25744L[2].mo23768c());
                        }
                        C6323f h2 = mo24110h(this.f26138b.f25744L[3]);
                        if (h2 != null) {
                            mo24107b(this.f26145i, h2, -this.f26138b.f25744L[3].mo23768c());
                        }
                        this.f26144h.f26103b = true;
                        this.f26145i.f26103b = true;
                    }
                    if (this.f26138b.mo23811T()) {
                        mo24107b(this.f26134k, this.f26144h, this.f26138b.mo23837o());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f25712d != null) {
                    C6323f h3 = mo24110h(dVarArr[2]);
                    if (h3 != null) {
                        mo24107b(this.f26144h, h3, this.f26138b.f25744L[2].mo23768c());
                        mo24107b(this.f26145i, this.f26144h, this.f26141e.f26108g);
                        if (this.f26138b.mo23811T()) {
                            mo24107b(this.f26134k, this.f26144h, this.f26138b.mo23837o());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f25712d != null) {
                    C6323f h4 = mo24110h(dVarArr[3]);
                    if (h4 != null) {
                        mo24107b(this.f26145i, h4, -this.f26138b.f25744L[3].mo23768c());
                        mo24107b(this.f26144h, this.f26145i, -this.f26141e.f26108g);
                    }
                    if (this.f26138b.mo23811T()) {
                        mo24107b(this.f26134k, this.f26144h, this.f26138b.mo23837o());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f25712d != null) {
                    C6323f h5 = mo24110h(dVarArr[4]);
                    if (h5 != null) {
                        mo24107b(this.f26134k, h5, 0);
                        mo24107b(this.f26144h, this.f26134k, -this.f26138b.mo23837o());
                        mo24107b(this.f26145i, this.f26144h, this.f26141e.f26108g);
                        return;
                    }
                    return;
                } else if (!(eVar2 instanceof C6254i) && eVar2.mo23795H() != null && this.f26138b.mo23835n(C6243d.C6245b.CENTER).f25712d == null) {
                    mo24107b(this.f26144h, this.f26138b.mo23795H().f25769f.f26144h, this.f26138b.mo23810S());
                    mo24107b(this.f26145i, this.f26144h, this.f26141e.f26108g);
                    if (this.f26138b.mo23811T()) {
                        mo24107b(this.f26134k, this.f26144h, this.f26138b.mo23837o());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z || this.f26140d != C6246e.C6248b.MATCH_CONSTRAINT) {
            gVar.mo24097b(this);
        } else {
            C6246e eVar3 = this.f26138b;
            int i = eVar3.f25783m;
            if (i == 2) {
                C6246e H3 = eVar3.mo23795H();
                if (H3 != null) {
                    C6325g gVar2 = H3.f25769f.f26141e;
                    this.f26141e.f26113l.add(gVar2);
                    gVar2.f26112k.add(this.f26141e);
                    C6325g gVar3 = this.f26141e;
                    gVar3.f26103b = true;
                    gVar3.f26112k.add(this.f26144h);
                    this.f26141e.f26112k.add(this.f26145i);
                }
            } else if (i == 3 && !eVar3.mo23815Y()) {
                C6246e eVar4 = this.f26138b;
                if (eVar4.f25781l != 3) {
                    C6325g gVar4 = eVar4.f25767e.f26141e;
                    this.f26141e.f26113l.add(gVar4);
                    gVar4.f26112k.add(this.f26141e);
                    C6325g gVar5 = this.f26141e;
                    gVar5.f26103b = true;
                    gVar5.f26112k.add(this.f26144h);
                    this.f26141e.f26112k.add(this.f26145i);
                }
            }
        }
        C6246e eVar5 = this.f26138b;
        C6243d[] dVarArr2 = eVar5.f25744L;
        if (dVarArr2[2].f25712d != null && dVarArr2[3].f25712d != null) {
            if (eVar5.mo23815Y()) {
                this.f26144h.f26107f = this.f26138b.f25744L[2].mo23768c();
                this.f26145i.f26107f = -this.f26138b.f25744L[3].mo23768c();
            } else {
                C6323f h6 = mo24110h(this.f26138b.f25744L[2]);
                C6323f h7 = mo24110h(this.f26138b.f25744L[3]);
                h6.mo24097b(this);
                h7.mo24097b(this);
                this.f26146j = C6333m.C6335b.CENTER;
            }
            if (this.f26138b.mo23811T()) {
                mo24108c(this.f26134k, this.f26144h, 1, this.f26135l);
            }
        } else if (dVarArr2[2].f25712d != null) {
            C6323f h8 = mo24110h(dVarArr2[2]);
            if (h8 != null) {
                mo24107b(this.f26144h, h8, this.f26138b.f25744L[2].mo23768c());
                mo24108c(this.f26145i, this.f26144h, 1, this.f26141e);
                if (this.f26138b.mo23811T()) {
                    mo24108c(this.f26134k, this.f26144h, 1, this.f26135l);
                }
                C6246e.C6248b bVar2 = this.f26140d;
                C6246e.C6248b bVar3 = C6246e.C6248b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f26138b.mo23849u() > 0.0f) {
                    C6328j jVar = this.f26138b.f25767e;
                    if (jVar.f26140d == bVar3) {
                        jVar.f26141e.f26112k.add(this.f26141e);
                        this.f26141e.f26113l.add(this.f26138b.f25767e.f26141e);
                        this.f26141e.f26102a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f25712d != null) {
            C6323f h9 = mo24110h(dVarArr2[3]);
            if (h9 != null) {
                mo24107b(this.f26145i, h9, -this.f26138b.f25744L[3].mo23768c());
                mo24108c(this.f26144h, this.f26145i, -1, this.f26141e);
                if (this.f26138b.mo23811T()) {
                    mo24108c(this.f26134k, this.f26144h, 1, this.f26135l);
                }
            }
        } else if (dVarArr2[4].f25712d != null) {
            C6323f h10 = mo24110h(dVarArr2[4]);
            if (h10 != null) {
                mo24107b(this.f26134k, h10, 0);
                mo24108c(this.f26144h, this.f26134k, -1, this.f26135l);
                mo24108c(this.f26145i, this.f26144h, 1, this.f26141e);
            }
        } else if (!(eVar5 instanceof C6254i) && eVar5.mo23795H() != null) {
            mo24107b(this.f26144h, this.f26138b.mo23795H().f25769f.f26144h, this.f26138b.mo23810S());
            mo24108c(this.f26145i, this.f26144h, 1, this.f26141e);
            if (this.f26138b.mo23811T()) {
                mo24108c(this.f26134k, this.f26144h, 1, this.f26135l);
            }
            C6246e.C6248b bVar4 = this.f26140d;
            C6246e.C6248b bVar5 = C6246e.C6248b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f26138b.mo23849u() > 0.0f) {
                C6328j jVar2 = this.f26138b.f25767e;
                if (jVar2.f26140d == bVar5) {
                    jVar2.f26141e.f26112k.add(this.f26141e);
                    this.f26141e.f26113l.add(this.f26138b.f25767e.f26141e);
                    this.f26141e.f26102a = this;
                }
            }
        }
        if (this.f26141e.f26113l.size() == 0) {
            this.f26141e.f26104c = true;
        }
    }

    /* renamed from: e */
    public void mo24083e() {
        C6323f fVar = this.f26144h;
        if (fVar.f26111j) {
            this.f26138b.mo23796H0(fVar.f26108g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24084f() {
        this.f26139c = null;
        this.f26144h.mo24098c();
        this.f26145i.mo24098c();
        this.f26134k.mo24098c();
        this.f26141e.mo24098c();
        this.f26143g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24086m() {
        if (this.f26140d != C6246e.C6248b.MATCH_CONSTRAINT || this.f26138b.f25783m == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo24105q() {
        this.f26143g = false;
        this.f26144h.mo24098c();
        this.f26144h.f26111j = false;
        this.f26145i.mo24098c();
        this.f26145i.f26111j = false;
        this.f26134k.mo24098c();
        this.f26134k.f26111j = false;
        this.f26141e.f26111j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f26138b.mo23845s();
    }
}
