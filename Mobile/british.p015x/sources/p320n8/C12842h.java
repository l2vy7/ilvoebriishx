package p320n8;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p308g8.C12716c;
import p308g8.C12722f;
import p308g8.C12727k;
import p308g8.C12733q;
import p308g8.C12735s;
import p314j8.C12797e;
import p315j9.C12811e;
import p334v8.C12917b;
import p334v8.C12920e;
import p334v8.C12923h;
import p334v8.C12926k;

/* renamed from: n8.h */
/* compiled from: ResponseProcessCookies */
public class C12842h implements C12735s {

    /* renamed from: b */
    private final Log f55510b = LogFactory.getLog(getClass());

    /* renamed from: a */
    private void m54415a(C12722f fVar, C12923h hVar, C12920e eVar, C12797e eVar2) {
        while (fVar.hasNext()) {
            C12716c j = fVar.mo47775j();
            try {
                for (C12917b next : hVar.mo47680e(j, eVar)) {
                    try {
                        hVar.mo47676a(next, eVar);
                        eVar2.mo43547a(next);
                        if (this.f55510b.isDebugEnabled()) {
                            Log log = this.f55510b;
                            log.debug("Cookie accepted: \"" + next + "\". ");
                        }
                    } catch (C12926k e) {
                        if (this.f55510b.isWarnEnabled()) {
                            Log log2 = this.f55510b;
                            log2.warn("Cookie rejected: \"" + next + "\". " + e.getMessage());
                        }
                    }
                }
            } catch (C12926k e2) {
                if (this.f55510b.isWarnEnabled()) {
                    Log log3 = this.f55510b;
                    log3.warn("Invalid cookie header: \"" + j + "\". " + e2.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public void mo47808b(C12733q qVar, C12811e eVar) throws C12727k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar != null) {
            C12923h hVar = (C12923h) eVar.mo43606b("http.cookie-spec");
            if (hVar == null) {
                this.f55510b.debug("Cookie spec not specified in HTTP context");
                return;
            }
            C12797e eVar2 = (C12797e) eVar.mo43606b("http.cookie-store");
            if (eVar2 == null) {
                this.f55510b.debug("Cookie store not specified in HTTP context");
                return;
            }
            C12920e eVar3 = (C12920e) eVar.mo43606b("http.cookie-origin");
            if (eVar3 == null) {
                this.f55510b.debug("Cookie origin not specified in HTTP context");
                return;
            }
            m54415a(qVar.mo47798m("Set-Cookie"), hVar, eVar3, eVar2);
            if (hVar.mo47678c() > 0) {
                m54415a(qVar.mo47798m("Set-Cookie2"), hVar, eVar3, eVar2);
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
