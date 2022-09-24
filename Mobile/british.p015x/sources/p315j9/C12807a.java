package p315j9;

import java.util.HashMap;
import java.util.Map;

/* renamed from: j9.a */
/* compiled from: BasicHttpContext */
public class C12807a implements C12811e {

    /* renamed from: b */
    private final C12811e f55479b;

    /* renamed from: c */
    private Map f55480c;

    public C12807a() {
        this((C12811e) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = r2.f55479b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo43606b(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0016
            r0 = 0
            java.util.Map r1 = r2.f55480c
            if (r1 == 0) goto L_0x000b
            java.lang.Object r0 = r1.get(r3)
        L_0x000b:
            if (r0 != 0) goto L_0x0015
            j9.e r1 = r2.f55479b
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r1.mo43606b(r3)
        L_0x0015:
            return r0
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Id may not be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p315j9.C12807a.mo43606b(java.lang.String):java.lang.Object");
    }

    /* renamed from: p */
    public void mo43615p(String str, Object obj) {
        if (str != null) {
            if (this.f55480c == null) {
                this.f55480c = new HashMap();
            }
            this.f55480c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public C12807a(C12811e eVar) {
        this.f55480c = null;
        this.f55479b = eVar;
    }
}
