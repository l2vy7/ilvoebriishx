package p319n8;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12732p;
import p309h8.C12750a;
import p309h8.C12753d;
import p309h8.C12754e;
import p309h8.C12757h;
import p313j8.C12793a;
import p313j8.C12798f;
import p314j9.C12811e;

/* renamed from: n8.b */
/* compiled from: RequestAuthCache */
public class C12836b implements C12732p {

    /* renamed from: b */
    private final Log f55505b = LogFactory.getLog(getClass());

    /* renamed from: b */
    private void m54406b(C12728l lVar, C12750a aVar, C12754e eVar, C12798f fVar) {
        String i = aVar.mo43469i();
        if (this.f55505b.isDebugEnabled()) {
            Log log = this.f55505b;
            log.debug("Re-using cached '" + i + "' auth scheme for " + lVar);
        }
        C12757h a = fVar.mo43550a(new C12753d(lVar.mo47782a(), lVar.mo47783b(), C12753d.f55413f, i));
        if (a != null) {
            eVar.mo47833f(aVar);
            eVar.mo47835h(a);
            return;
        }
        this.f55505b.debug("No credentials for preemptive authentication");
    }

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        C12750a a;
        C12750a a2;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar != null) {
            C12793a aVar = (C12793a) eVar.mo43606b("http.auth.auth-cache");
            if (aVar == null) {
                this.f55505b.debug("Auth cache not set in the context");
                return;
            }
            C12798f fVar = (C12798f) eVar.mo43606b("http.auth.credentials-provider");
            if (fVar == null) {
                this.f55505b.debug("Credentials provider not set in the context");
                return;
            }
            C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
            C12754e eVar2 = (C12754e) eVar.mo43606b("http.auth.target-scope");
            if (!(lVar == null || eVar2 == null || eVar2.mo47828a() != null || (a2 = aVar.mo43543a(lVar)) == null)) {
                m54406b(lVar, a2, eVar2, fVar);
            }
            C12728l lVar2 = (C12728l) eVar.mo43606b("http.proxy_host");
            C12754e eVar3 = (C12754e) eVar.mo43606b("http.auth.proxy-scope");
            if (lVar2 != null && eVar3 != null && eVar3.mo47828a() == null && (a = aVar.mo43543a(lVar2)) != null) {
                m54406b(lVar2, a, eVar3, fVar);
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
