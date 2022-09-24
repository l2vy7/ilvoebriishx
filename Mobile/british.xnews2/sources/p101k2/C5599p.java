package p101k2;

import com.bumptech.glide.C3327h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p104l0.C5645e;

/* renamed from: k2.p */
/* compiled from: ModelLoaderRegistry */
public class C5599p {

    /* renamed from: a */
    private final C5604r f24130a;

    /* renamed from: b */
    private final C5600a f24131b;

    /* renamed from: k2.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C5600a {

        /* renamed from: a */
        private final Map<Class<?>, C5601a<?>> f24132a = new HashMap();

        /* renamed from: k2.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C5601a<Model> {

            /* renamed from: a */
            final List<C5596n<Model, ?>> f24133a;

            public C5601a(List<C5596n<Model, ?>> list) {
                this.f24133a = list;
            }
        }

        C5600a() {
        }

        /* renamed from: a */
        public void mo22167a() {
            this.f24132a.clear();
        }

        /* renamed from: b */
        public <Model> List<C5596n<Model, ?>> mo22168b(Class<Model> cls) {
            C5601a aVar = this.f24132a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f24133a;
        }

        /* renamed from: c */
        public <Model> void mo22169c(Class<Model> cls, List<C5596n<Model, ?>> list) {
            if (this.f24132a.put(cls, new C5601a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C5599p(C5645e<List<Throwable>> eVar) {
        this(new C5604r(eVar));
    }

    /* renamed from: b */
    private static <A> Class<A> m24855b(A a) {
        return a.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<C5596n<A, ?>> m24856e(Class<A> cls) {
        List<C5596n<A, ?>> b;
        b = this.f24131b.mo22168b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f24130a.mo22172c(cls));
            this.f24131b.mo22169c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo22164a(Class<Model> cls, Class<Data> cls2, C5598o<? extends Model, ? extends Data> oVar) {
        this.f24130a.mo22171b(cls, cls2, oVar);
        this.f24131b.mo22167a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> mo22165c(Class<?> cls) {
        return this.f24130a.mo22174g(cls);
    }

    /* renamed from: d */
    public <A> List<C5596n<A, ?>> mo22166d(A a) {
        List e = m24856e(m24855b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<C5596n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C5596n nVar = (C5596n) e.get(i);
                if (nVar.mo22114b(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C3327h.C3330c(a, e);
        }
        throw new C3327h.C3330c(a);
    }

    private C5599p(C5604r rVar) {
        this.f24131b = new C5600a();
        this.f24130a = rVar;
    }
}
