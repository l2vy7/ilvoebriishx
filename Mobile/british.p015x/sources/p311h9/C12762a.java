package p311h9;

import p308g8.C12716c;
import p308g8.C12722f;
import p308g8.C12730n;
import p313i9.C12788b;
import p313i9.C12790d;

/* renamed from: h9.a */
/* compiled from: AbstractHttpMessage */
public abstract class C12762a implements C12730n {

    /* renamed from: b */
    protected C12778q f55426b;

    /* renamed from: c */
    protected C12790d f55427c;

    protected C12762a(C12790d dVar) {
        this.f55426b = new C12778q();
        this.f55427c = dVar;
    }

    /* renamed from: H */
    public boolean mo47791H(String str) {
        return this.f55426b.mo47910c(str);
    }

    /* renamed from: I */
    public C12716c mo47792I(String str) {
        return this.f55426b.mo47913g(str);
    }

    /* renamed from: J */
    public C12716c[] mo47793J() {
        return this.f55426b.mo47912d();
    }

    /* renamed from: K */
    public void mo47794K(String str, String str2) {
        if (str != null) {
            this.f55426b.mo47918m(new C12763b(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    /* renamed from: d */
    public void mo47795d(C12716c cVar) {
        this.f55426b.mo47908a(cVar);
    }

    /* renamed from: i */
    public void mo47796i(C12716c[] cVarArr) {
        this.f55426b.mo47917l(cVarArr);
    }

    /* renamed from: l */
    public void mo47797l(C12790d dVar) {
        if (dVar != null) {
            this.f55427c = dVar;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: m */
    public C12722f mo47798m(String str) {
        return this.f55426b.mo47916k(str);
    }

    /* renamed from: n */
    public C12722f mo47799n() {
        return this.f55426b.mo47915i();
    }

    /* renamed from: o */
    public C12716c[] mo47800o(String str) {
        return this.f55426b.mo47914h(str);
    }

    /* renamed from: s */
    public C12790d mo47801s() {
        if (this.f55427c == null) {
            this.f55427c = new C12788b();
        }
        return this.f55427c;
    }

    /* renamed from: w */
    public void mo47802w(String str, String str2) {
        if (str != null) {
            this.f55426b.mo47908a(new C12763b(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    protected C12762a() {
        this((C12790d) null);
    }
}
