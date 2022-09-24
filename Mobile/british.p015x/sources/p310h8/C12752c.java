package p310h8;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p313i9.C12790d;

/* renamed from: h8.c */
/* compiled from: AuthSchemeRegistry */
public final class C12752c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C12751b> f55411a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C12750a mo47822a(String str, C12790d dVar) throws IllegalStateException {
        if (str != null) {
            C12751b bVar = this.f55411a.get(str.toLowerCase(Locale.ENGLISH));
            if (bVar != null) {
                return bVar.mo43470a(dVar);
            }
            throw new IllegalStateException("Unsupported authentication scheme: " + str);
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: b */
    public void mo47823b(String str, C12751b bVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (bVar != null) {
            this.f55411a.put(str.toLowerCase(Locale.ENGLISH), bVar);
        } else {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
    }
}
