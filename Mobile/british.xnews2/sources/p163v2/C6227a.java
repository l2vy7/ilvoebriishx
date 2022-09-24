package p163v2;

import java.util.ArrayList;
import java.util.List;
import p064d2.C5157d;

/* renamed from: v2.a */
/* compiled from: EncoderRegistry */
public class C6227a {

    /* renamed from: a */
    private final List<C6228a<?>> f25662a = new ArrayList();

    /* renamed from: v2.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C6228a<T> {

        /* renamed from: a */
        private final Class<T> f25663a;

        /* renamed from: b */
        final C5157d<T> f25664b;

        C6228a(Class<T> cls, C5157d<T> dVar) {
            this.f25663a = cls;
            this.f25664b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo23738a(Class<?> cls) {
            return this.f25663a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo23736a(Class<T> cls, C5157d<T> dVar) {
        this.f25662a.add(new C6228a(cls, dVar));
    }

    /* renamed from: b */
    public synchronized <T> C5157d<T> mo23737b(Class<T> cls) {
        for (C6228a next : this.f25662a) {
            if (next.mo23738a(cls)) {
                return next.f25664b;
            }
        }
        return null;
    }
}
