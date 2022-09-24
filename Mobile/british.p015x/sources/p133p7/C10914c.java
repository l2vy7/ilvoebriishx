package p133p7;

import java.util.Iterator;
import java.util.Set;
import p268y6.C11114d;
import p268y6.C11119e;
import p268y6.C11133q;

/* renamed from: p7.c */
/* compiled from: DefaultUserAgentPublisher */
public class C10914c implements C10919i {

    /* renamed from: a */
    private final String f49791a;

    /* renamed from: b */
    private final C10915d f49792b;

    C10914c(Set<C5907f> set, C10915d dVar) {
        this.f49791a = m49127e(set);
        this.f49792b = dVar;
    }

    /* renamed from: c */
    public static C11114d<C10919i> m49125c() {
        return C11114d.m49620c(C10919i.class).mo43400b(C11133q.m49700i(C5907f.class)).mo43404f(C12847b.f55515a).mo43402d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C10919i m49126d(C11119e eVar) {
        return new C10914c(eVar.mo43390d(C5907f.class), C10915d.m49129a());
    }

    /* renamed from: e */
    private static String m49127e(Set<C5907f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C5907f> it = set.iterator();
        while (it.hasNext()) {
            C5907f next = it.next();
            sb.append(next.mo22893b());
            sb.append('/');
            sb.append(next.mo22894c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo43184a() {
        if (this.f49792b.mo43185b().isEmpty()) {
            return this.f49791a;
        }
        return this.f49791a + ' ' + m49127e(this.f49792b.mo43185b());
    }
}
