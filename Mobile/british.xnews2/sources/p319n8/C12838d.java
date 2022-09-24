package p319n8;

import java.io.IOException;
import java.util.Collection;
import p307g8.C12716c;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12732p;
import p314j9.C12811e;

/* renamed from: n8.d */
/* compiled from: RequestDefaultHeaders */
public class C12838d implements C12732p {
    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws C12727k, IOException {
        Collection<C12716c> collection;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo43589y().mo47758c().equalsIgnoreCase("CONNECT") && (collection = (Collection) oVar.mo47801s().mo43553i("http.default-headers")) != null) {
            for (C12716c d : collection) {
                oVar.mo47795d(d);
            }
        }
    }
}
