package p272b9;

import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import p307g8.C12716c;
import p307g8.C12728l;
import p307g8.C12731o;
import p307g8.C12733q;
import p307g8.C12741y;
import p312i9.C12790d;
import p313j8.C12795c;
import p313j8.C12804l;
import p314j9.C12811e;
import p317l8.C12829c;
import p317l8.C12830d;
import p317l8.C12833g;
import p320o8.C12845b;

/* renamed from: b9.k */
/* compiled from: DefaultRedirectStrategy */
public class C11191k implements C12804l {

    /* renamed from: a */
    private final Log f50263a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public boolean mo43558a(C12731o oVar, C12733q qVar, C12811e eVar) throws C12741y {
        if (qVar != null) {
            int b = qVar.mo47806p().mo47764b();
            String c = oVar.mo43589y().mo47758c();
            C12716c I = qVar.mo47792I("location");
            if (b != 307) {
                switch (b) {
                    case 301:
                        break;
                    case IronSourceConstants.OFFERWALL_AVAILABLE /*302*/:
                        if ((c.equalsIgnoreCase("GET") || c.equalsIgnoreCase(VersionInfo.GIT_BRANCH)) && I != null) {
                            return true;
                        }
                        return false;
                    case 303:
                        return true;
                    default:
                        return false;
                }
            }
            if (c.equalsIgnoreCase("GET") || c.equalsIgnoreCase(VersionInfo.GIT_BRANCH)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: b */
    public C12833g mo43559b(C12731o oVar, C12733q qVar, C12811e eVar) throws C12741y {
        URI d = mo43561d(oVar, qVar, eVar);
        if (oVar.mo43589y().mo47758c().equalsIgnoreCase(VersionInfo.GIT_BRANCH)) {
            return new C12830d(d);
        }
        return new C12829c(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public URI mo43560c(String str) throws C12741y {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new C12741y("Invalid redirect URI: " + str, e);
        }
    }

    /* renamed from: d */
    public URI mo43561d(C12731o oVar, C12733q qVar, C12811e eVar) throws C12741y {
        URI uri;
        if (qVar != null) {
            C12716c I = qVar.mo47792I("location");
            if (I != null) {
                String value = I.getValue();
                if (this.f50263a.isDebugEnabled()) {
                    Log log = this.f50263a;
                    log.debug("Redirect requested to location '" + value + "'");
                }
                URI c = mo43560c(value);
                C12790d s = qVar.mo47801s();
                if (!c.isAbsolute()) {
                    if (!s.mo47932k("http.protocol.reject-relative-redirect")) {
                        C12728l lVar = (C12728l) eVar.mo43606b("http.target_host");
                        if (lVar != null) {
                            try {
                                c = C12845b.m54425e(C12845b.m54428h(new URI(oVar.mo43589y().getUri()), lVar, true), c);
                            } catch (URISyntaxException e) {
                                throw new C12741y(e.getMessage(), e);
                            }
                        } else {
                            throw new IllegalStateException("Target host not available in the HTTP context");
                        }
                    } else {
                        throw new C12741y("Relative redirect location '" + c + "' not allowed");
                    }
                }
                if (s.mo47929d("http.protocol.allow-circular-redirects")) {
                    C11197p pVar = (C11197p) eVar.mo43606b("http.protocol.redirect-locations");
                    if (pVar == null) {
                        pVar = new C11197p();
                        eVar.mo43615p("http.protocol.redirect-locations", pVar);
                    }
                    if (c.getFragment() != null) {
                        try {
                            uri = C12845b.m54428h(c, new C12728l(c.getHost(), c.getPort(), c.getScheme()), true);
                        } catch (URISyntaxException e2) {
                            throw new C12741y(e2.getMessage(), e2);
                        }
                    } else {
                        uri = c;
                    }
                    if (!pVar.mo43580b(uri)) {
                        pVar.mo43579a(uri);
                    } else {
                        throw new C12795c("Circular redirect to '" + uri + "'");
                    }
                }
                return c;
            }
            throw new C12741y("Received redirect response " + qVar.mo47806p() + " but no location header");
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
