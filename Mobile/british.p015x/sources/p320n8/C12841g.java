package p320n8;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p273b9.C11183c;
import p308g8.C12727k;
import p308g8.C12728l;
import p308g8.C12733q;
import p308g8.C12735s;
import p310h8.C12750a;
import p310h8.C12754e;
import p314j8.C12793a;
import p315j9.C12811e;

/* renamed from: n8.g */
/* compiled from: ResponseAuthCache */
public class C12841g implements C12735s {

    /* renamed from: b */
    private final Log f55509b = LogFactory.getLog(getClass());

    /* renamed from: a */
    private void m54412a(C12793a aVar, C12728l lVar, C12754e eVar) {
        C12750a a = eVar.mo47828a();
        if (eVar.mo47829b() == null) {
            return;
        }
        if (eVar.mo47830c() != null) {
            if (this.f55509b.isDebugEnabled()) {
                Log log = this.f55509b;
                log.debug("Caching '" + a.mo43469i() + "' auth scheme for " + lVar);
            }
            aVar.mo43544b(lVar, a);
            return;
        }
        aVar.mo43545c(lVar);
    }

    /* renamed from: c */
    private boolean m54413c(C12754e eVar) {
        C12750a a = eVar.mo47828a();
        if (a == null || !a.mo43466d()) {
            return false;
        }
        String i = a.mo43469i();
        if (i.equalsIgnoreCase("Basic") || i.equalsIgnoreCase("Digest")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo47808b(C12733q qVar, C12811e eVar) throws C12727k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar != null) {
            C12793a aVar = (C12793a) eVar.mo43606b("http.auth.auth-cache");
            C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
            C12754e eVar2 = (C12754e) eVar.mo43606b("http.auth.target-scope");
            if (!(lVar == null || eVar2 == null || !m54413c(eVar2))) {
                if (aVar == null) {
                    aVar = new C11183c();
                    eVar.mo43615p("http.auth.auth-cache", aVar);
                }
                m54412a(aVar, lVar, eVar2);
            }
            C12728l lVar2 = (C12728l) eVar.mo43606b("http.proxy_host");
            C12754e eVar3 = (C12754e) eVar.mo43606b("http.auth.proxy-scope");
            if (lVar2 != null && eVar3 != null && m54413c(eVar3)) {
                if (aVar == null) {
                    aVar = new C11183c();
                    eVar.mo43615p("http.auth.auth-cache", aVar);
                }
                m54412a(aVar, lVar2, eVar3);
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
