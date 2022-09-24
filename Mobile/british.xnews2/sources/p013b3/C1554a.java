package p013b3;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p104l0.C5645e;
import p104l0.C5647g;

/* renamed from: b3.a */
/* compiled from: FactoryPools */
public final class C1554a {

    /* renamed from: a */
    private static final C1561g<Object> f6651a = new C1555a();

    /* renamed from: b3.a$a */
    /* compiled from: FactoryPools */
    class C1555a implements C1561g<Object> {
        C1555a() {
        }

        /* renamed from: a */
        public void mo7106a(Object obj) {
        }
    }

    /* renamed from: b3.a$b */
    /* compiled from: FactoryPools */
    class C1556b implements C1558d<List<T>> {
        C1556b() {
        }

        /* renamed from: b */
        public List<T> mo7107a() {
            return new ArrayList();
        }
    }

    /* renamed from: b3.a$c */
    /* compiled from: FactoryPools */
    class C1557c implements C1561g<List<T>> {
        C1557c() {
        }

        /* renamed from: b */
        public void mo7106a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: b3.a$d */
    /* compiled from: FactoryPools */
    public interface C1558d<T> {
        /* renamed from: a */
        T mo7107a();
    }

    /* renamed from: b3.a$e */
    /* compiled from: FactoryPools */
    private static final class C1559e<T> implements C5645e<T> {

        /* renamed from: a */
        private final C1558d<T> f6652a;

        /* renamed from: b */
        private final C1561g<T> f6653b;

        /* renamed from: c */
        private final C5645e<T> f6654c;

        C1559e(C5645e<T> eVar, C1558d<T> dVar, C1561g<T> gVar) {
            this.f6654c = eVar;
            this.f6652a = dVar;
            this.f6653b = gVar;
        }

        /* renamed from: a */
        public boolean mo7110a(T t) {
            if (t instanceof C1560f) {
                ((C1560f) t).mo7112k().mo7113b(true);
            }
            this.f6653b.mo7106a(t);
            return this.f6654c.mo7110a(t);
        }

        public T acquire() {
            T acquire = this.f6654c.acquire();
            if (acquire == null) {
                acquire = this.f6652a.mo7107a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof C1560f) {
                ((C1560f) acquire).mo7112k().mo7113b(false);
            }
            return acquire;
        }
    }

    /* renamed from: b3.a$f */
    /* compiled from: FactoryPools */
    public interface C1560f {
        /* renamed from: k */
        C1563c mo7112k();
    }

    /* renamed from: b3.a$g */
    /* compiled from: FactoryPools */
    public interface C1561g<T> {
        /* renamed from: a */
        void mo7106a(T t);
    }

    /* renamed from: a */
    private static <T extends C1560f> C5645e<T> m7977a(C5645e<T> eVar, C1558d<T> dVar) {
        return m7978b(eVar, dVar, m7979c());
    }

    /* renamed from: b */
    private static <T> C5645e<T> m7978b(C5645e<T> eVar, C1558d<T> dVar, C1561g<T> gVar) {
        return new C1559e(eVar, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> C1561g<T> m7979c() {
        return f6651a;
    }

    /* renamed from: d */
    public static <T extends C1560f> C5645e<T> m7980d(int i, C1558d<T> dVar) {
        return m7977a(new C5647g(i), dVar);
    }

    /* renamed from: e */
    public static <T> C5645e<List<T>> m7981e() {
        return m7982f(20);
    }

    /* renamed from: f */
    public static <T> C5645e<List<T>> m7982f(int i) {
        return m7978b(new C5647g(i), new C1556b(), new C1557c());
    }
}
