package p314j9;

import java.io.IOException;
import java.net.InetAddress;
import p307g8.C12724h;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12729m;
import p307g8.C12731o;
import p307g8.C12732p;
import p307g8.C12736t;
import p307g8.C12741y;
import p307g8.C12742z;

/* renamed from: j9.k */
/* compiled from: RequestTargetHost */
public class C12817k implements C12732p {
    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar != null) {
            C12742z a = oVar.mo43589y().mo47757a();
            if ((!oVar.mo43589y().mo47758c().equalsIgnoreCase("CONNECT") || !a.mo47820i(C12736t.f55406f)) && !oVar.mo47791H("Host")) {
                C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
                if (lVar == null) {
                    C12724h hVar = (C12724h) eVar.mo43606b("http.connection");
                    if (hVar instanceof C12729m) {
                        C12729m mVar = (C12729m) hVar;
                        InetAddress w = mVar.mo43621w();
                        int o = mVar.mo43614o();
                        if (w != null) {
                            lVar = new C12728l(w.getHostName(), o);
                        }
                    }
                    if (lVar == null) {
                        if (!a.mo47820i(C12736t.f55406f)) {
                            throw new C12741y("Target host missing");
                        }
                        return;
                    }
                }
                oVar.mo47802w("Host", lVar.mo47786d());
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
