package p320n8;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p308g8.C12716c;
import p308g8.C12727k;
import p308g8.C12731o;
import p308g8.C12732p;
import p310h8.C12750a;
import p310h8.C12754e;
import p310h8.C12755f;
import p310h8.C12756g;
import p310h8.C12757h;
import p315j9.C12811e;

/* renamed from: n8.f */
/* compiled from: RequestTargetAuthentication */
public class C12840f implements C12732p {

    /* renamed from: b */
    private final Log f55508b = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        C12716c cVar;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo43589y().mo47758c().equalsIgnoreCase("CONNECT") && !oVar.mo47791H(RtspHeaders.AUTHORIZATION)) {
            C12754e eVar2 = (C12754e) eVar.mo43606b("http.auth.target-scope");
            if (eVar2 == null) {
                this.f55508b.debug("Target auth state not set in the context");
                return;
            }
            C12750a a = eVar2.mo47828a();
            if (a != null) {
                C12757h c = eVar2.mo47830c();
                if (c == null) {
                    this.f55508b.debug("User credentials not available");
                } else if (eVar2.mo47829b() != null || !a.mo43468h()) {
                    try {
                        if (a instanceof C12756g) {
                            cVar = ((C12756g) a).mo43461a(c, oVar, eVar);
                        } else {
                            cVar = a.mo43467e(c, oVar);
                        }
                        oVar.mo47795d(cVar);
                    } catch (C12755f e) {
                        if (this.f55508b.isErrorEnabled()) {
                            Log log = this.f55508b;
                            log.error("Authentication error: " + e.getMessage());
                        }
                    }
                }
            }
        }
    }
}
