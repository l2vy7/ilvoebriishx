package p272b9;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p309h8.C12753d;
import p309h8.C12757h;
import p313j8.C12798f;

/* renamed from: b9.e */
/* compiled from: BasicCredentialsProvider */
public class C11185e implements C12798f {

    /* renamed from: a */
    private final ConcurrentHashMap<C12753d, C12757h> f50256a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static C12757h m49920b(Map<C12753d, C12757h> map, C12753d dVar) {
        C12757h hVar = map.get(dVar);
        if (hVar != null) {
            return hVar;
        }
        int i = -1;
        C12753d dVar2 = null;
        for (C12753d next : map.keySet()) {
            int a = dVar.mo47824a(next);
            if (a > i) {
                dVar2 = next;
                i = a;
            }
        }
        return dVar2 != null ? map.get(dVar2) : hVar;
    }

    /* renamed from: a */
    public C12757h mo43550a(C12753d dVar) {
        if (dVar != null) {
            return m49920b(this.f50256a, dVar);
        }
        throw new IllegalArgumentException("Authentication scope may not be null");
    }

    public String toString() {
        return this.f50256a.toString();
    }
}
