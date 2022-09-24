package p164v2;

import java.util.ArrayList;
import java.util.List;
import p065d2.C5166k;

/* renamed from: v2.f */
/* compiled from: ResourceEncoderRegistry */
public class C6234f {

    /* renamed from: a */
    private final List<C6235a<?>> f25676a = new ArrayList();

    /* renamed from: v2.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C6235a<T> {

        /* renamed from: a */
        private final Class<T> f25677a;

        /* renamed from: b */
        final C5166k<T> f25678b;

        C6235a(Class<T> cls, C5166k<T> kVar) {
            this.f25677a = cls;
            this.f25678b = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo23753a(Class<?> cls) {
            return this.f25677a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo23751a(Class<Z> cls, C5166k<Z> kVar) {
        this.f25676a.add(new C6235a(cls, kVar));
    }

    /* renamed from: b */
    public synchronized <Z> C5166k<Z> mo23752b(Class<Z> cls) {
        int size = this.f25676a.size();
        for (int i = 0; i < size; i++) {
            C6235a aVar = this.f25676a.get(i);
            if (aVar.mo23753a(cls)) {
                return aVar.f25678b;
            }
        }
        return null;
    }
}
