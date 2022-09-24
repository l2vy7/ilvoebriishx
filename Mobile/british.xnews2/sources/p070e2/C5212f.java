package p070e2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p004a3.C0065j;
import p070e2.C5210e;

/* renamed from: e2.f */
/* compiled from: DataRewinderRegistry */
public class C5212f {

    /* renamed from: b */
    private static final C5210e.C5211a<?> f22724b = new C5213a();

    /* renamed from: a */
    private final Map<Class<?>, C5210e.C5211a<?>> f22725a = new HashMap();

    /* renamed from: e2.f$a */
    /* compiled from: DataRewinderRegistry */
    class C5213a implements C5210e.C5211a<Object> {
        C5213a() {
        }

        /* renamed from: a */
        public Class<Object> mo21442a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C5210e<Object> mo21443b(Object obj) {
            return new C5214b(obj);
        }
    }

    /* renamed from: e2.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C5214b implements C5210e<Object> {

        /* renamed from: a */
        private final Object f22726a;

        C5214b(Object obj) {
            this.f22726a = obj;
        }

        /* renamed from: a */
        public Object mo21440a() {
            return this.f22726a;
        }

        /* renamed from: b */
        public void mo21441b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C5210e<T> mo21444a(T t) {
        C5210e.C5211a<?> aVar;
        C0065j.m247d(t);
        aVar = this.f22725a.get(t.getClass());
        if (aVar == null) {
            Iterator<C5210e.C5211a<?>> it = this.f22725a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5210e.C5211a<?> next = it.next();
                if (next.mo21442a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f22724b;
        }
        return aVar.mo21443b(t);
    }

    /* renamed from: b */
    public synchronized void mo21445b(C5210e.C5211a<?> aVar) {
        this.f22725a.put(aVar.mo21442a(), aVar);
    }
}
