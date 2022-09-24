package p273b9;

import java.util.List;
import java.util.Map;
import p308g8.C12716c;
import p308g8.C12733q;
import p310h8.C12759j;
import p315j9.C12811e;

/* renamed from: b9.j */
/* compiled from: DefaultProxyAuthenticationHandler */
public class C11190j extends C11181a {
    /* renamed from: a */
    public Map<String, C12716c> mo43556a(C12733q qVar, C12811e eVar) throws C12759j {
        if (qVar != null) {
            return mo43505f(qVar.mo47800o(RtspHeaders.PROXY_AUTHENTICATE));
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: b */
    public boolean mo43557b(C12733q qVar, C12811e eVar) {
        if (qVar != null) {
            return qVar.mo47806p().mo47764b() == 407;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<String> mo43504e(C12733q qVar, C12811e eVar) {
        List<String> list = (List) qVar.mo47801s().mo43553i("http.auth.proxy-scheme-pref");
        if (list != null) {
            return list;
        }
        return super.mo43504e(qVar, eVar);
    }
}
