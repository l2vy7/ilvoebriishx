package p272b9;

import java.io.IOException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p270a9.C11159c;
import p270a9.C11161e;
import p270a9.C11173j;
import p270a9.C11176l;
import p274c9.C11210g;
import p274c9.C11214k;
import p274c9.C11215l;
import p302d9.C12663g0;
import p302d9.C12669l;
import p302d9.C12671n;
import p302d9.C12678s;
import p302d9.C12682w;
import p302d9.C12685z;
import p307g8.C12712a;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12732p;
import p307g8.C12733q;
import p307g8.C12735s;
import p309h8.C12752c;
import p312i9.C12790d;
import p313j8.C12794b;
import p313j8.C12796d;
import p313j8.C12797e;
import p313j8.C12798f;
import p313j8.C12799g;
import p313j8.C12800h;
import p313j8.C12804l;
import p313j8.C12805m;
import p313j8.C12806n;
import p314j9.C12807a;
import p314j9.C12808b;
import p314j9.C12809c;
import p314j9.C12811e;
import p314j9.C12812f;
import p314j9.C12813g;
import p314j9.C12814h;
import p317l8.C12833g;
import p320o8.C12845b;
import p321p8.C12850b;
import p321p8.C12851c;
import p321p8.C12855g;
import p325r8.C12873d;
import p327s8.C12887e;
import p333v8.C12925j;
import p341z8.C12995b;

/* renamed from: b9.b */
/* compiled from: AbstractHttpClient */
public abstract class C11182b implements C12799g {

    /* renamed from: a */
    private final Log f50236a = LogFactory.getLog(getClass());

    /* renamed from: b */
    private C12790d f50237b;

    /* renamed from: c */
    private C12813g f50238c;

    /* renamed from: d */
    private C12850b f50239d;

    /* renamed from: e */
    private C12712a f50240e;

    /* renamed from: f */
    private C12855g f50241f;

    /* renamed from: g */
    private C12925j f50242g;

    /* renamed from: h */
    private C12752c f50243h;

    /* renamed from: i */
    private C12808b f50244i;

    /* renamed from: j */
    private C12814h f50245j;

    /* renamed from: k */
    private C12800h f50246k;

    /* renamed from: l */
    private C12804l f50247l;

    /* renamed from: m */
    private C12794b f50248m;

    /* renamed from: n */
    private C12794b f50249n;

    /* renamed from: o */
    private C12797e f50250o;

    /* renamed from: p */
    private C12798f f50251p;

    /* renamed from: q */
    private C12873d f50252q;

    /* renamed from: r */
    private C12806n f50253r;

    protected C11182b(C12850b bVar, C12790d dVar) {
        this.f50237b = dVar;
        this.f50239d = bVar;
    }

    /* renamed from: G */
    private final synchronized C12812f m49877G() {
        if (this.f50245j == null) {
            C12808b D = mo43509D();
            int l = D.mo47942l();
            C12732p[] pVarArr = new C12732p[l];
            for (int i = 0; i < l; i++) {
                pVarArr[i] = D.mo47941k(i);
            }
            int n = D.mo47944n();
            C12735s[] sVarArr = new C12735s[n];
            for (int i2 = 0; i2 < n; i2++) {
                sVarArr[i2] = D.mo47943m(i2);
            }
            this.f50245j = new C12814h(pVarArr, sVarArr);
        }
        return this.f50245j;
    }

    /* renamed from: u */
    private static C12728l m49878u(C12833g gVar) throws C12796d {
        URI C = gVar.mo43581C();
        if (!C.isAbsolute()) {
            return null;
        }
        C12728l b = C12845b.m54422b(C);
        if (b != null) {
            return b;
        }
        throw new C12796d("URI does not specify a valid host name: " + C);
    }

    /* renamed from: A */
    public final synchronized C12925j mo43506A() {
        if (this.f50242g == null) {
            this.f50242g = mo43525h();
        }
        return this.f50242g;
    }

    /* renamed from: B */
    public final synchronized C12797e mo43507B() {
        if (this.f50250o == null) {
            this.f50250o = mo43526i();
        }
        return this.f50250o;
    }

    /* renamed from: C */
    public final synchronized C12798f mo43508C() {
        if (this.f50251p == null) {
            this.f50251p = mo43527j();
        }
        return this.f50251p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final synchronized C12808b mo43509D() {
        if (this.f50244i == null) {
            this.f50244i = mo43530m();
        }
        return this.f50244i;
    }

    /* renamed from: E */
    public final synchronized C12800h mo43510E() {
        if (this.f50246k == null) {
            this.f50246k = mo43531n();
        }
        return this.f50246k;
    }

    /* renamed from: F */
    public final synchronized C12790d mo43511F() {
        if (this.f50237b == null) {
            this.f50237b = mo43529l();
        }
        return this.f50237b;
    }

    /* renamed from: H */
    public final synchronized C12794b mo43512H() {
        if (this.f50249n == null) {
            this.f50249n = mo43533p();
        }
        return this.f50249n;
    }

    /* renamed from: I */
    public final synchronized C12804l mo43513I() {
        if (this.f50247l == null) {
            this.f50247l = new C11191k();
        }
        return this.f50247l;
    }

    /* renamed from: J */
    public final synchronized C12813g mo43514J() {
        if (this.f50238c == null) {
            this.f50238c = mo43534q();
        }
        return this.f50238c;
    }

    /* renamed from: K */
    public final synchronized C12873d mo43515K() {
        if (this.f50252q == null) {
            this.f50252q = mo43532o();
        }
        return this.f50252q;
    }

    /* renamed from: L */
    public final synchronized C12794b mo43516L() {
        if (this.f50248m == null) {
            this.f50248m = mo43535r();
        }
        return this.f50248m;
    }

    /* renamed from: M */
    public final synchronized C12806n mo43517M() {
        if (this.f50253r == null) {
            this.f50253r = mo43536s();
        }
        return this.f50253r;
    }

    /* renamed from: a */
    public final C12733q mo43518a(C12833g gVar) throws IOException, C12796d {
        return mo43539w(gVar, (C12811e) null);
    }

    /* renamed from: b */
    public final synchronized C12850b mo43519b() {
        if (this.f50239d == null) {
            this.f50239d = mo43521d();
        }
        return this.f50239d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12752c mo43520c() {
        C12752c cVar = new C12752c();
        cVar.mo47823b("Basic", new C11159c());
        cVar.mo47823b("Digest", new C11161e());
        cVar.mo47823b("NTLM", new C11173j());
        cVar.mo47823b("negotiate", new C11176l());
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12850b mo43521d() {
        C12851c cVar;
        C12887e a = C11214k.m50048a();
        C12790d F = mo43511F();
        String str = (String) F.mo43553i("http.connection-manager.factory-class-name");
        if (str != null) {
            try {
                cVar = (C12851c) Class.forName(str).newInstance();
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.mo47996a(F, a);
        }
        return new C11215l(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12805m mo43522e(C12813g gVar, C12850b bVar, C12712a aVar, C12855g gVar2, C12873d dVar, C12812f fVar, C12800h hVar, C12804l lVar, C12794b bVar2, C12794b bVar3, C12806n nVar, C12790d dVar2) {
        return new C11192l(this.f50236a, gVar, bVar, aVar, gVar2, dVar, fVar, hVar, lVar, bVar2, bVar3, nVar, dVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C12855g mo43523f() {
        return new C11187g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C12712a mo43524g() {
        return new C12995b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C12925j mo43525h() {
        C12925j jVar = new C12925j();
        jVar.mo48100b("best-match", new C12669l());
        jVar.mo48100b("compatibility", new C12671n());
        jVar.mo48100b("netscape", new C12682w());
        jVar.mo48100b("rfc2109", new C12685z());
        jVar.mo48100b("rfc2965", new C12663g0());
        jVar.mo48100b("ignoreCookies", new C12678s());
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C12797e mo43526i() {
        return new C11184d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C12798f mo43527j() {
        return new C11185e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C12811e mo43528k() {
        C12807a aVar = new C12807a();
        aVar.mo43615p("http.scheme-registry", mo43519b().mo43667a());
        aVar.mo43615p("http.authscheme-registry", mo43540x());
        aVar.mo43615p("http.cookiespec-registry", mo43506A());
        aVar.mo43615p("http.cookie-store", mo43507B());
        aVar.mo43615p("http.auth.credentials-provider", mo43508C());
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C12790d mo43529l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C12808b mo43530m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C12800h mo43531n() {
        return new C11189i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C12873d mo43532o() {
        return new C11210g(mo43519b().mo43667a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C12794b mo43533p() {
        return new C11190j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C12813g mo43534q() {
        return new C12813g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C12794b mo43535r() {
        return new C11193m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C12806n mo43536s() {
        return new C11194n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C12790d mo43537t(C12731o oVar) {
        return new C11186f((C12790d) null, mo43511F(), oVar.mo47801s(), (C12790d) null);
    }

    /* renamed from: v */
    public final C12733q mo43538v(C12728l lVar, C12731o oVar, C12811e eVar) throws IOException, C12796d {
        C12809c cVar;
        C12805m e;
        C12731o oVar2 = oVar;
        C12811e eVar2 = eVar;
        if (oVar2 != null) {
            synchronized (this) {
                C12811e k = mo43528k();
                if (eVar2 == null) {
                    cVar = k;
                } else {
                    cVar = new C12809c(eVar2, k);
                }
                e = mo43522e(mo43514J(), mo43519b(), mo43542z(), mo43541y(), mo43515K(), m49877G(), mo43510E(), mo43513I(), mo43516L(), mo43512H(), mo43517M(), mo43537t(oVar2));
            }
            try {
                return e.mo43562a(lVar, oVar2, cVar);
            } catch (C12727k e2) {
                throw new C12796d((Throwable) e2);
            }
        } else {
            throw new IllegalArgumentException("Request must not be null.");
        }
    }

    /* renamed from: w */
    public final C12733q mo43539w(C12833g gVar, C12811e eVar) throws IOException, C12796d {
        if (gVar != null) {
            return mo43538v(m49878u(gVar), gVar, eVar);
        }
        throw new IllegalArgumentException("Request must not be null.");
    }

    /* renamed from: x */
    public final synchronized C12752c mo43540x() {
        if (this.f50243h == null) {
            this.f50243h = mo43520c();
        }
        return this.f50243h;
    }

    /* renamed from: y */
    public final synchronized C12855g mo43541y() {
        if (this.f50241f == null) {
            this.f50241f = mo43523f();
        }
        return this.f50241f;
    }

    /* renamed from: z */
    public final synchronized C12712a mo43542z() {
        if (this.f50240e == null) {
            this.f50240e = mo43524g();
        }
        return this.f50240e;
    }
}
