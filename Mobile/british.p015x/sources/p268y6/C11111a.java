package p268y6;

import java.util.Set;
import p216h7.C10581b;

/* renamed from: y6.a */
/* compiled from: AbstractComponentContainer */
abstract class C11111a implements C11119e {
    C11111a() {
    }

    /* renamed from: a */
    public <T> T mo43389a(Class<T> cls) {
        C10581b<T> b = mo43405b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo43390d(Class<T> cls) {
        return mo43406c(cls).get();
    }
}
