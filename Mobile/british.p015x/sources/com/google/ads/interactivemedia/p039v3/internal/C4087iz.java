package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iz */
/* compiled from: IMASDK */
final class C4087iz implements alk {

    /* renamed from: a */
    private final amf f17493a;

    /* renamed from: b */
    private final C4086iy f17494b;

    /* renamed from: c */
    private C4156ln f17495c;

    /* renamed from: d */
    private alk f17496d;

    /* renamed from: e */
    private boolean f17497e = true;

    /* renamed from: f */
    private boolean f17498f;

    public C4087iz(C4086iy iyVar, aks aks) {
        this.f17494b = iyVar;
        this.f17493a = new amf(aks);
    }

    /* renamed from: a */
    public final void mo15978a() {
        this.f17498f = true;
        this.f17493a.mo13983a();
    }

    /* renamed from: b */
    public final void mo15979b() {
        this.f17498f = false;
        this.f17493a.mo13984b();
    }

    /* renamed from: c */
    public final void mo15980c(long j) {
        this.f17493a.mo13985c(j);
    }

    /* renamed from: d */
    public final void mo15981d(C4156ln lnVar) throws C4089ja {
        alk alk;
        alk d = lnVar.mo15951d();
        if (d != null && d != (alk = this.f17496d)) {
            if (alk == null) {
                this.f17496d = d;
                this.f17495c = lnVar;
                d.mo13913h(this.f17493a.mo13914i());
                return;
            }
            throw C4089ja.m17490d(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: e */
    public final void mo15982e(C4156ln lnVar) {
        if (lnVar == this.f17495c) {
            this.f17496d = null;
            this.f17495c = null;
            this.f17497e = true;
        }
    }

    /* renamed from: f */
    public final long mo15983f(boolean z) {
        C4156ln lnVar = this.f17495c;
        if (lnVar == null || lnVar.mo13723N() || (!this.f17495c.mo13722M() && (z || this.f17495c.mo15954j()))) {
            this.f17497e = true;
            if (this.f17498f) {
                this.f17493a.mo13983a();
            }
        } else {
            alk alk = this.f17496d;
            aup.m14890u(alk);
            long g = alk.mo13912g();
            if (this.f17497e) {
                if (g < this.f17493a.mo13912g()) {
                    this.f17493a.mo13984b();
                } else {
                    this.f17497e = false;
                    if (this.f17498f) {
                        this.f17493a.mo13983a();
                    }
                }
            }
            this.f17493a.mo13985c(g);
            C4146ld i = alk.mo13914i();
            if (!i.equals(this.f17493a.mo13914i())) {
                this.f17493a.mo13913h(i);
                this.f17494b.mo15977a(i);
            }
        }
        if (this.f17497e) {
            return this.f17493a.mo13912g();
        }
        alk alk2 = this.f17496d;
        aup.m14890u(alk2);
        return alk2.mo13912g();
    }

    /* renamed from: g */
    public final long mo13912g() {
        throw null;
    }

    /* renamed from: h */
    public final void mo13913h(C4146ld ldVar) {
        alk alk = this.f17496d;
        if (alk != null) {
            alk.mo13913h(ldVar);
            ldVar = this.f17496d.mo13914i();
        }
        this.f17493a.mo13913h(ldVar);
    }

    /* renamed from: i */
    public final C4146ld mo13914i() {
        alk alk = this.f17496d;
        return alk != null ? alk.mo13914i() : this.f17493a.mo13914i();
    }
}
