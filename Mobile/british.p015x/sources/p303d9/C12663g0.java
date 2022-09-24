package p303d9;

import java.util.Collection;
import p313i9.C12790d;
import p334v8.C12923h;
import p334v8.C12924i;

/* renamed from: d9.g0 */
/* compiled from: RFC2965SpecFactory */
public class C12663g0 implements C12924i {
    /* renamed from: a */
    public C12923h mo47684a(C12790d dVar) {
        if (dVar == null) {
            return new C12661f0();
        }
        String[] strArr = null;
        Collection collection = (Collection) dVar.mo43553i("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C12661f0(strArr, dVar.mo47931h("http.protocol.single-cookie-header", false));
    }
}
