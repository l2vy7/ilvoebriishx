package p342z8;

import java.io.IOException;
import p305e9.C12692a;
import p305e9.C12693b;
import p305e9.C12694c;
import p305e9.C12695d;
import p307f9.C12706i;
import p308g8.C12723g;
import p308g8.C12726j;
import p308g8.C12727k;
import p308g8.C12731o;
import p308g8.C12733q;
import p308g8.C12734r;
import p309g9.C12744b;
import p309g9.C12745c;
import p309g9.C12746d;
import p309g9.C12747e;
import p309g9.C12748f;
import p309g9.C12749g;
import p311h9.C12780s;
import p313i9.C12790d;

/* renamed from: z8.a */
/* compiled from: AbstractHttpClientConnection */
public abstract class C12994a implements C12723g {

    /* renamed from: b */
    private final C12693b f55745b = mo48169D();

    /* renamed from: c */
    private final C12692a f55746c = mo48168A();

    /* renamed from: d */
    private C12748f f55747d = null;

    /* renamed from: e */
    private C12749g f55748e = null;

    /* renamed from: f */
    private C12744b f55749f = null;

    /* renamed from: g */
    private C12745c f55750g = null;

    /* renamed from: h */
    private C12746d f55751h = null;

    /* renamed from: i */
    private C12998e f55752i = null;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C12692a mo48168A() {
        return new C12692a(new C12694c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C12693b mo48169D() {
        return new C12693b(new C12695d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C12734r mo48170E() {
        return new C12996c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C12746d mo48171F(C12749g gVar, C12790d dVar) {
        return new C12706i(gVar, (C12780s) null, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract C12745c mo43640G(C12748f fVar, C12734r rVar, C12790d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo48172H() throws IOException {
        this.f55748e.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo48173I(C12748f fVar, C12749g gVar, C12790d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        } else if (gVar != null) {
            this.f55747d = fVar;
            this.f55748e = gVar;
            if (fVar instanceof C12744b) {
                this.f55749f = (C12744b) fVar;
            }
            this.f55750g = mo43640G(fVar, mo48170E(), dVar);
            this.f55751h = mo48171F(gVar, dVar);
            this.f55752i = mo48176n(fVar.getMetrics(), gVar.getMetrics());
        } else {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo48174J() {
        C12744b bVar = this.f55749f;
        return bVar != null && bVar.mo43656b();
    }

    /* renamed from: e */
    public void mo43607e(C12731o oVar) throws C12727k, IOException {
        if (oVar != null) {
            mo48175g();
            this.f55751h.mo47708a(oVar);
            this.f55752i.mo48179a();
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    public void flush() throws IOException {
        mo48175g();
        mo48172H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo48175g() throws IllegalStateException;

    /* renamed from: i */
    public void mo43611i(C12726j jVar) throws C12727k, IOException {
        if (jVar != null) {
            mo48175g();
            if (jVar.mo43574b() != null) {
                this.f55745b.mo47697b(this.f55748e, jVar, jVar.mo43574b());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    /* renamed from: k */
    public boolean mo43612k(int i) throws IOException {
        mo48175g();
        return this.f55747d.mo43657c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C12998e mo48176n(C12747e eVar, C12747e eVar2) {
        return new C12998e(eVar, eVar2);
    }

    /* renamed from: t */
    public C12733q mo43618t() throws C12727k, IOException {
        mo48175g();
        C12733q qVar = (C12733q) this.f55750g.mo47707a();
        if (qVar.mo47806p().mo47764b() >= 200) {
            this.f55752i.mo48180b();
        }
        return qVar;
    }

    /* renamed from: v */
    public void mo43620v(C12733q qVar) throws C12727k, IOException {
        if (qVar != null) {
            mo48175g();
            qVar.mo47804B(this.f55746c.mo47694a(this.f55747d, qVar));
            return;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: z */
    public boolean mo43623z() {
        if (!mo43616q() || mo48174J()) {
            return true;
        }
        try {
            this.f55747d.mo43657c(1);
            return mo48174J();
        } catch (IOException unused) {
            return true;
        }
    }
}
