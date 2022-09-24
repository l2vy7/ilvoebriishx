package p272b9;

import java.net.URI;
import java.net.URISyntaxException;
import p307g8.C12715b0;
import p307g8.C12731o;
import p307g8.C12741y;
import p307g8.C12742z;
import p310h9.C12762a;
import p310h9.C12774m;
import p312i9.C12791e;
import p317l8.C12833g;

/* renamed from: b9.q */
/* compiled from: RequestWrapper */
public class C11198q extends C12762a implements C12833g {

    /* renamed from: d */
    private final C12731o f50290d;

    /* renamed from: e */
    private URI f50291e;

    /* renamed from: f */
    private String f50292f;

    /* renamed from: g */
    private C12742z f50293g;

    /* renamed from: h */
    private int f50294h;

    public C11198q(C12731o oVar) throws C12741y {
        if (oVar != null) {
            this.f50290d = oVar;
            mo47797l(oVar.mo47801s());
            mo47796i(oVar.mo47793J());
            if (oVar instanceof C12833g) {
                C12833g gVar = (C12833g) oVar;
                this.f50291e = gVar.mo43581C();
                this.f50292f = gVar.mo43588c();
                this.f50293g = null;
            } else {
                C12715b0 y = oVar.mo43589y();
                try {
                    this.f50291e = new URI(y.getUri());
                    this.f50292f = y.mo47758c();
                    this.f50293g = oVar.mo43587a();
                } catch (URISyntaxException e) {
                    throw new C12741y("Invalid request URI: " + y.getUri(), e);
                }
            }
            this.f50294h = 0;
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    /* renamed from: C */
    public URI mo43581C() {
        return this.f50291e;
    }

    /* renamed from: L */
    public int mo43582L() {
        return this.f50294h;
    }

    /* renamed from: M */
    public C12731o mo43583M() {
        return this.f50290d;
    }

    /* renamed from: N */
    public void mo43584N() {
        this.f50294h++;
    }

    /* renamed from: O */
    public boolean mo43573O() {
        return true;
    }

    /* renamed from: P */
    public void mo43585P() {
        this.f55426b.mo47909b();
        mo47796i(this.f50290d.mo47793J());
    }

    /* renamed from: Q */
    public void mo43586Q(URI uri) {
        this.f50291e = uri;
    }

    /* renamed from: a */
    public C12742z mo43587a() {
        if (this.f50293g == null) {
            this.f50293g = C12791e.m54280c(mo47801s());
        }
        return this.f50293g;
    }

    /* renamed from: c */
    public String mo43588c() {
        return this.f50292f;
    }

    /* renamed from: y */
    public C12715b0 mo43589y() {
        String c = mo43588c();
        C12742z a = mo43587a();
        URI uri = this.f50291e;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C12774m(c, aSCIIString, a);
    }
}
