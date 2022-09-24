package p273b9;

import java.util.HashMap;
import p308g8.C12728l;
import p310h8.C12750a;
import p314j8.C12793a;

/* renamed from: b9.c */
/* compiled from: BasicAuthCache */
public class C11183c implements C12793a {

    /* renamed from: a */
    private final HashMap<C12728l, C12750a> f50254a = new HashMap<>();

    /* renamed from: a */
    public C12750a mo43543a(C12728l lVar) {
        if (lVar != null) {
            return this.f50254a.get(lVar);
        }
        throw new IllegalArgumentException("HTTP host may not be null");
    }

    /* renamed from: b */
    public void mo43544b(C12728l lVar, C12750a aVar) {
        if (lVar != null) {
            this.f50254a.put(lVar, aVar);
            return;
        }
        throw new IllegalArgumentException("HTTP host may not be null");
    }

    /* renamed from: c */
    public void mo43545c(C12728l lVar) {
        if (lVar != null) {
            this.f50254a.remove(lVar);
            return;
        }
        throw new IllegalArgumentException("HTTP host may not be null");
    }

    public String toString() {
        return this.f50254a.toString();
    }
}
