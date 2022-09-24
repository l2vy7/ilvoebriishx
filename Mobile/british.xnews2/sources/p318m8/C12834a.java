package p318m8;

import p312i9.C12790d;

/* renamed from: m8.a */
/* compiled from: HttpClientParams */
public class C12834a {
    /* renamed from: a */
    public static String m54402a(C12790d dVar) {
        if (dVar != null) {
            String str = (String) dVar.mo43553i("http.protocol.cookie-policy");
            return str == null ? "best-match" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static boolean m54403b(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.protocol.handle-authentication", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static boolean m54404c(C12790d dVar) {
        if (dVar != null) {
            return dVar.mo47931h("http.protocol.handle-redirects", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
