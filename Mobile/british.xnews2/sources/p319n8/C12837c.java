package p319n8;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12732p;
import p314j9.C12811e;
import p321p8.C12861m;
import p325r8.C12871b;

/* renamed from: n8.c */
/* compiled from: RequestClientConnControl */
public class C12837c implements C12732p {

    /* renamed from: b */
    private final Log f55506b = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (oVar.mo43589y().mo47758c().equalsIgnoreCase("CONNECT")) {
            oVar.mo47794K("Proxy-Connection", "Keep-Alive");
        } else {
            C12861m mVar = (C12861m) eVar.mo43606b("http.connection");
            if (mVar == null) {
                this.f55506b.debug("HTTP connection not set in the context");
                return;
            }
            C12871b c = mVar.mo43634c();
            if ((c.mo48018b() == 1 || c.mo48019c()) && !oVar.mo47791H(RtspHeaders.CONNECTION)) {
                oVar.mo47802w(RtspHeaders.CONNECTION, "Keep-Alive");
            }
            if (c.mo48018b() == 2 && !c.mo48019c() && !oVar.mo47791H("Proxy-Connection")) {
                oVar.mo47802w("Proxy-Connection", "Keep-Alive");
            }
        }
    }
}
