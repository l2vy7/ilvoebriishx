package p082g2;

import java.util.HashMap;
import java.util.Map;
import p065d2.C5159f;

/* renamed from: g2.s */
/* compiled from: Jobs */
final class C5319s {

    /* renamed from: a */
    private final Map<C5159f, C5305l<?>> f23479a = new HashMap();

    /* renamed from: b */
    private final Map<C5159f, C5305l<?>> f23480b = new HashMap();

    C5319s() {
    }

    /* renamed from: b */
    private Map<C5159f, C5305l<?>> m23979b(boolean z) {
        return z ? this.f23480b : this.f23479a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5305l<?> mo21615a(C5159f fVar, boolean z) {
        return m23979b(z).get(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21616c(C5159f fVar, C5305l<?> lVar) {
        m23979b(lVar.mo21573p()).put(fVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21617d(C5159f fVar, C5305l<?> lVar) {
        Map<C5159f, C5305l<?>> b = m23979b(lVar.mo21573p());
        if (lVar.equals(b.get(fVar))) {
            b.remove(fVar);
        }
    }
}
