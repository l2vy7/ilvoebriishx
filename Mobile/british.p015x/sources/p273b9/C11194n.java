package p273b9;

import java.security.Principal;
import p310h8.C12750a;
import p310h8.C12754e;
import p310h8.C12757h;
import p314j8.C12806n;

/* renamed from: b9.n */
/* compiled from: DefaultUserTokenHandler */
public class C11194n implements C12806n {
    /* renamed from: b */
    private static Principal m49955b(C12754e eVar) {
        C12757h c;
        C12750a a = eVar.mo47828a();
        if (a == null || !a.mo43466d() || !a.mo43468h() || (c = eVar.mo47830c()) == null) {
            return null;
        }
        return c.mo47837a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r3 = r3.mo43622y();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo43571a(p315j9.C12811e r3) {
        /*
            r2 = this;
            java.lang.String r0 = "http.auth.target-scope"
            java.lang.Object r0 = r3.mo43606b(r0)
            h8.e r0 = (p310h8.C12754e) r0
            if (r0 == 0) goto L_0x001d
            java.security.Principal r0 = m49955b(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "http.auth.proxy-scope"
            java.lang.Object r0 = r3.mo43606b(r0)
            h8.e r0 = (p310h8.C12754e) r0
            java.security.Principal r0 = m49955b(r0)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0038
            java.lang.String r1 = "http.connection"
            java.lang.Object r3 = r3.mo43606b(r1)
            p8.m r3 = (p322p8.C12861m) r3
            boolean r1 = r3.mo43616q()
            if (r1 == 0) goto L_0x0038
            javax.net.ssl.SSLSession r3 = r3.mo43622y()
            if (r3 == 0) goto L_0x0038
            java.security.Principal r0 = r3.getLocalPrincipal()
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p273b9.C11194n.mo43571a(j9.e):java.lang.Object");
    }
}
