package p170x;

import p165w.C6240a;
import p165w.C6246e;
import p170x.C6323f;

/* renamed from: x.i */
/* compiled from: HelperReferences */
class C6327i extends C6333m {
    public C6327i(C6246e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m27868q(C6323f fVar) {
        this.f26144h.f26112k.add(fVar);
        fVar.f26113l.add(this.f26144h);
    }

    /* renamed from: a */
    public void mo24081a(C6321d dVar) {
        C6240a aVar = (C6240a) this.f26138b;
        int M0 = aVar.mo23755M0();
        int i = 0;
        int i2 = -1;
        for (C6323f fVar : this.f26144h.f26113l) {
            int i3 = fVar.f26108g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (M0 == 0 || M0 == 2) {
            this.f26144h.mo24099d(i2 + aVar.mo23756N0());
        } else {
            this.f26144h.mo24099d(i + aVar.mo23756N0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24082d() {
        C6246e eVar = this.f26138b;
        if (eVar instanceof C6240a) {
            this.f26144h.f26103b = true;
            C6240a aVar = (C6240a) eVar;
            int M0 = aVar.mo23755M0();
            boolean L0 = aVar.mo23754L0();
            int i = 0;
            if (M0 == 0) {
                this.f26144h.f26106e = C6323f.C6324a.LEFT;
                while (i < aVar.f25892H0) {
                    C6246e eVar2 = aVar.f25891G0[i];
                    if (L0 || eVar2.mo23807P() != 8) {
                        C6323f fVar = eVar2.f25767e.f26144h;
                        fVar.f26112k.add(this.f26144h);
                        this.f26144h.f26113l.add(fVar);
                    }
                    i++;
                }
                m27868q(this.f26138b.f25767e.f26144h);
                m27868q(this.f26138b.f25767e.f26145i);
            } else if (M0 == 1) {
                this.f26144h.f26106e = C6323f.C6324a.RIGHT;
                while (i < aVar.f25892H0) {
                    C6246e eVar3 = aVar.f25891G0[i];
                    if (L0 || eVar3.mo23807P() != 8) {
                        C6323f fVar2 = eVar3.f25767e.f26145i;
                        fVar2.f26112k.add(this.f26144h);
                        this.f26144h.f26113l.add(fVar2);
                    }
                    i++;
                }
                m27868q(this.f26138b.f25767e.f26144h);
                m27868q(this.f26138b.f25767e.f26145i);
            } else if (M0 == 2) {
                this.f26144h.f26106e = C6323f.C6324a.TOP;
                while (i < aVar.f25892H0) {
                    C6246e eVar4 = aVar.f25891G0[i];
                    if (L0 || eVar4.mo23807P() != 8) {
                        C6323f fVar3 = eVar4.f25769f.f26144h;
                        fVar3.f26112k.add(this.f26144h);
                        this.f26144h.f26113l.add(fVar3);
                    }
                    i++;
                }
                m27868q(this.f26138b.f25769f.f26144h);
                m27868q(this.f26138b.f25769f.f26145i);
            } else if (M0 == 3) {
                this.f26144h.f26106e = C6323f.C6324a.BOTTOM;
                while (i < aVar.f25892H0) {
                    C6246e eVar5 = aVar.f25891G0[i];
                    if (L0 || eVar5.mo23807P() != 8) {
                        C6323f fVar4 = eVar5.f25769f.f26145i;
                        fVar4.f26112k.add(this.f26144h);
                        this.f26144h.f26113l.add(fVar4);
                    }
                    i++;
                }
                m27868q(this.f26138b.f25769f.f26144h);
                m27868q(this.f26138b.f25769f.f26145i);
            }
        }
    }

    /* renamed from: e */
    public void mo24083e() {
        C6246e eVar = this.f26138b;
        if (eVar instanceof C6240a) {
            int M0 = ((C6240a) eVar).mo23755M0();
            if (M0 == 0 || M0 == 1) {
                this.f26138b.mo23794G0(this.f26144h.f26108g);
            } else {
                this.f26138b.mo23796H0(this.f26144h.f26108g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24084f() {
        this.f26139c = null;
        this.f26144h.mo24098c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24086m() {
        return false;
    }
}
