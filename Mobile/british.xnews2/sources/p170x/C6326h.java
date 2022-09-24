package p170x;

import p165w.C6246e;
import p165w.C6252h;

/* renamed from: x.h */
/* compiled from: GuidelineReference */
class C6326h extends C6333m {
    public C6326h(C6246e eVar) {
        super(eVar);
        eVar.f25767e.mo24084f();
        eVar.f25769f.mo24084f();
        this.f26142f = ((C6252h) eVar).mo23910L0();
    }

    /* renamed from: q */
    private void m27862q(C6323f fVar) {
        this.f26144h.f26112k.add(fVar);
        fVar.f26113l.add(this.f26144h);
    }

    /* renamed from: a */
    public void mo24081a(C6321d dVar) {
        C6323f fVar = this.f26144h;
        if (fVar.f26104c && !fVar.f26111j) {
            this.f26144h.mo24099d((int) ((((float) fVar.f26113l.get(0).f26108g) * ((C6252h) this.f26138b).mo23913O0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24082d() {
        C6252h hVar = (C6252h) this.f26138b;
        int M0 = hVar.mo23911M0();
        int N0 = hVar.mo23912N0();
        hVar.mo23913O0();
        if (hVar.mo23910L0() == 1) {
            if (M0 != -1) {
                this.f26144h.f26113l.add(this.f26138b.f25748P.f25767e.f26144h);
                this.f26138b.f25748P.f25767e.f26144h.f26112k.add(this.f26144h);
                this.f26144h.f26107f = M0;
            } else if (N0 != -1) {
                this.f26144h.f26113l.add(this.f26138b.f25748P.f25767e.f26145i);
                this.f26138b.f25748P.f25767e.f26145i.f26112k.add(this.f26144h);
                this.f26144h.f26107f = -N0;
            } else {
                C6323f fVar = this.f26144h;
                fVar.f26103b = true;
                fVar.f26113l.add(this.f26138b.f25748P.f25767e.f26145i);
                this.f26138b.f25748P.f25767e.f26145i.f26112k.add(this.f26144h);
            }
            m27862q(this.f26138b.f25767e.f26144h);
            m27862q(this.f26138b.f25767e.f26145i);
            return;
        }
        if (M0 != -1) {
            this.f26144h.f26113l.add(this.f26138b.f25748P.f25769f.f26144h);
            this.f26138b.f25748P.f25769f.f26144h.f26112k.add(this.f26144h);
            this.f26144h.f26107f = M0;
        } else if (N0 != -1) {
            this.f26144h.f26113l.add(this.f26138b.f25748P.f25769f.f26145i);
            this.f26138b.f25748P.f25769f.f26145i.f26112k.add(this.f26144h);
            this.f26144h.f26107f = -N0;
        } else {
            C6323f fVar2 = this.f26144h;
            fVar2.f26103b = true;
            fVar2.f26113l.add(this.f26138b.f25748P.f25769f.f26145i);
            this.f26138b.f25748P.f25769f.f26145i.f26112k.add(this.f26144h);
        }
        m27862q(this.f26138b.f25769f.f26144h);
        m27862q(this.f26138b.f25769f.f26145i);
    }

    /* renamed from: e */
    public void mo24083e() {
        if (((C6252h) this.f26138b).mo23910L0() == 1) {
            this.f26138b.mo23794G0(this.f26144h.f26108g);
        } else {
            this.f26138b.mo23796H0(this.f26144h.f26108g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24084f() {
        this.f26144h.mo24098c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24086m() {
        return false;
    }
}
