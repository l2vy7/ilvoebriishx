package p303d9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p334v8.C12918c;
import p334v8.C12923h;

/* renamed from: d9.b */
/* compiled from: AbstractCookieSpec */
public abstract class C12652b implements C12923h {

    /* renamed from: a */
    private final Map<String, C12918c> f55291a = new HashMap(10);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C12918c mo47650g(String str) {
        return this.f55291a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Collection<C12918c> mo47651h() {
        return this.f55291a.values();
    }

    /* renamed from: i */
    public void mo47652i(String str, C12918c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Attribute name may not be null");
        } else if (cVar != null) {
            this.f55291a.put(str, cVar);
        } else {
            throw new IllegalArgumentException("Attribute handler may not be null");
        }
    }
}
