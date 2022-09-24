package p328s8;

import java.util.concurrent.ConcurrentHashMap;
import p308g8.C12728l;

/* renamed from: s8.e */
/* compiled from: SchemeRegistry */
public final class C12887e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C12886d> f55566a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final C12886d mo48055a(String str) {
        if (str != null) {
            return this.f55566a.get(str);
        }
        throw new IllegalArgumentException("Name must not be null.");
    }

    /* renamed from: b */
    public final C12886d mo48056b(C12728l lVar) {
        if (lVar != null) {
            return mo48057c(lVar.mo47784c());
        }
        throw new IllegalArgumentException("Host must not be null.");
    }

    /* renamed from: c */
    public final C12886d mo48057c(String str) {
        C12886d a = mo48055a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }

    /* renamed from: d */
    public final C12886d mo48058d(C12886d dVar) {
        if (dVar != null) {
            return this.f55566a.put(dVar.mo48048b(), dVar);
        }
        throw new IllegalArgumentException("Scheme must not be null.");
    }
}
