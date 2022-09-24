package p333v8;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p312i9.C12790d;

/* renamed from: v8.j */
/* compiled from: CookieSpecRegistry */
public final class C12925j {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C12924i> f55621a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C12923h mo48099a(String str, C12790d dVar) throws IllegalStateException {
        if (str != null) {
            C12924i iVar = this.f55621a.get(str.toLowerCase(Locale.ENGLISH));
            if (iVar != null) {
                return iVar.mo47684a(dVar);
            }
            throw new IllegalStateException("Unsupported cookie spec: " + str);
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: b */
    public void mo48100b(String str, C12924i iVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (iVar != null) {
            this.f55621a.put(str.toLowerCase(Locale.ENGLISH), iVar);
        } else {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        }
    }
}
