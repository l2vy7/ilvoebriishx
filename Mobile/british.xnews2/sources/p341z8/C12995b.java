package p341z8;

import p307g8.C12712a;
import p307g8.C12719d0;
import p307g8.C12722f;
import p307g8.C12724h;
import p307g8.C12725i;
import p307g8.C12733q;
import p307g8.C12736t;
import p307g8.C12740x;
import p307g8.C12742z;
import p310h9.C12776o;
import p314j9.C12811e;

/* renamed from: z8.b */
/* compiled from: DefaultConnectionReuseStrategy */
public class C12995b implements C12712a {
    /* renamed from: a */
    public boolean mo47754a(C12733q qVar, C12811e eVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        } else if (eVar != null) {
            C12724h hVar = (C12724h) eVar.mo43606b("http.connection");
            if (hVar != null && !hVar.mo43616q()) {
                return false;
            }
            C12725i b = qVar.mo47805b();
            C12742z a = qVar.mo47806p().mo47763a();
            if (b != null && b.mo47776b() < 0 && (!b.mo47780o() || a.mo47820i(C12736t.f55406f))) {
                return false;
            }
            C12722f m = qVar.mo47798m(RtspHeaders.CONNECTION);
            if (!m.hasNext()) {
                m = qVar.mo47798m("Proxy-Connection");
            }
            if (m.hasNext()) {
                try {
                    C12719d0 b2 = mo48177b(m);
                    boolean z = false;
                    while (b2.hasNext()) {
                        String k = b2.mo47771k();
                        if ("Close".equalsIgnoreCase(k)) {
                            return false;
                        }
                        if ("Keep-Alive".equalsIgnoreCase(k)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } catch (C12740x unused) {
                    return false;
                }
            }
            return !a.mo47820i(C12736t.f55406f);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12719d0 mo48177b(C12722f fVar) {
        return new C12776o(fVar);
    }
}
