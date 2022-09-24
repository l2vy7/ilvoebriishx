package p323q8;

import java.net.InetAddress;
import p307g8.C12728l;
import p312i9.C12790d;
import p325r8.C12871b;

/* renamed from: q8.a */
/* compiled from: ConnRouteParams */
public class C12867a {

    /* renamed from: a */
    public static final C12728l f55529a;

    /* renamed from: b */
    public static final C12871b f55530b;

    static {
        C12728l lVar = new C12728l("127.0.0.255", 0, "no-host");
        f55529a = lVar;
        f55530b = new C12871b(lVar);
    }

    /* renamed from: a */
    public static C12728l m54482a(C12790d dVar) {
        if (dVar != null) {
            C12728l lVar = (C12728l) dVar.mo43553i("http.route.default-proxy");
            if (lVar == null || !f55529a.equals(lVar)) {
                return lVar;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: b */
    public static C12871b m54483b(C12790d dVar) {
        if (dVar != null) {
            C12871b bVar = (C12871b) dVar.mo43553i("http.route.forced-route");
            if (bVar == null || !f55530b.equals(bVar)) {
                return bVar;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: c */
    public static InetAddress m54484c(C12790d dVar) {
        if (dVar != null) {
            return (InetAddress) dVar.mo43553i("http.route.local-address");
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
