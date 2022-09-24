package p319n8;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307g8.C12716c;
import p307g8.C12727k;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12732p;
import p307g8.C12741y;
import p313j8.C12797e;
import p314j9.C12811e;
import p317l8.C12833g;
import p318m8.C12834a;
import p321p8.C12861m;
import p333v8.C12917b;
import p333v8.C12920e;
import p333v8.C12923h;
import p333v8.C12925j;
import p333v8.C12927l;

/* renamed from: n8.a */
/* compiled from: RequestAddCookies */
public class C12835a implements C12732p {

    /* renamed from: b */
    private final Log f55504b = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        URI uri;
        C12716c d;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo43589y().mo47758c().equalsIgnoreCase("CONNECT")) {
            C12797e eVar2 = (C12797e) eVar.mo43606b("http.cookie-store");
            if (eVar2 == null) {
                this.f55504b.debug("Cookie store not specified in HTTP context");
                return;
            }
            C12925j jVar = (C12925j) eVar.mo43606b("http.cookiespec-registry");
            if (jVar == null) {
                this.f55504b.debug("CookieSpec registry not specified in HTTP context");
                return;
            }
            C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
            if (lVar == null) {
                this.f55504b.debug("Target host not set in the context");
                return;
            }
            C12861m mVar = (C12861m) eVar.mo43606b("http.connection");
            if (mVar == null) {
                this.f55504b.debug("HTTP connection not set in the context");
                return;
            }
            String a = C12834a.m54402a(oVar.mo47801s());
            if (this.f55504b.isDebugEnabled()) {
                Log log = this.f55504b;
                log.debug("CookieSpec selected: " + a);
            }
            if (oVar instanceof C12833g) {
                uri = ((C12833g) oVar).mo43581C();
            } else {
                try {
                    uri = new URI(oVar.mo43589y().getUri());
                } catch (URISyntaxException e) {
                    throw new C12741y("Invalid request URI: " + oVar.mo43589y().getUri(), e);
                }
            }
            String a2 = lVar.mo47782a();
            int b = lVar.mo47783b();
            boolean z = false;
            if (b < 0) {
                if (mVar.mo43634c().mo48018b() == 1) {
                    b = mVar.mo43614o();
                } else {
                    String c = lVar.mo47784c();
                    if (c.equalsIgnoreCase("http")) {
                        b = 80;
                    } else {
                        b = c.equalsIgnoreCase("https") ? 443 : 0;
                    }
                }
            }
            C12920e eVar3 = new C12920e(a2, b, uri.getPath(), mVar.mo43605a());
            C12923h a3 = jVar.mo48099a(a, oVar.mo47801s());
            ArrayList<C12917b> arrayList = new ArrayList<>(eVar2.getCookies());
            ArrayList<C12917b> arrayList2 = new ArrayList<>();
            Date date = new Date();
            for (C12917b bVar : arrayList) {
                if (!bVar.mo47658s(date)) {
                    if (a3.mo47677b(bVar, eVar3)) {
                        if (this.f55504b.isDebugEnabled()) {
                            Log log2 = this.f55504b;
                            log2.debug("Cookie " + bVar + " match " + eVar3);
                        }
                        arrayList2.add(bVar);
                    }
                } else if (this.f55504b.isDebugEnabled()) {
                    Log log3 = this.f55504b;
                    log3.debug("Cookie " + bVar + " expired");
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C12716c d2 : a3.mo47685f(arrayList2)) {
                    oVar.mo47795d(d2);
                }
            }
            int c2 = a3.mo47678c();
            if (c2 > 0) {
                for (C12917b bVar2 : arrayList2) {
                    if (c2 != bVar2.mo47662c() || !(bVar2 instanceof C12927l)) {
                        z = true;
                    }
                }
                if (z && (d = a3.mo47679d()) != null) {
                    oVar.mo47795d(d);
                }
            }
            eVar.mo43615p("http.cookie-spec", a3);
            eVar.mo43615p("http.cookie-origin", eVar3);
        }
    }
}
