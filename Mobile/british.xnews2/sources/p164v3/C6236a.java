package p164v3;

import p271b8.C11180a;

/* renamed from: v3.a */
/* compiled from: DoubleCheck */
public final class C6236a<T> implements C11180a<T> {

    /* renamed from: c */
    private static final Object f25679c = new Object();

    /* renamed from: a */
    private volatile C11180a<T> f25680a;

    /* renamed from: b */
    private volatile Object f25681b = f25679c;

    private C6236a(C11180a<T> aVar) {
        this.f25680a = aVar;
    }

    /* renamed from: a */
    public static <P extends C11180a<T>, T> C11180a<T> m27328a(P p) {
        C6239d.m27332b(p);
        if (p instanceof C6236a) {
            return p;
        }
        return new C6236a(p);
    }

    /* renamed from: b */
    public static Object m27329b(Object obj, Object obj2) {
        if (!(obj != f25679c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f25681b;
        T t2 = f25679c;
        if (t == t2) {
            synchronized (this) {
                t = this.f25681b;
                if (t == t2) {
                    t = this.f25680a.get();
                    this.f25681b = m27329b(this.f25681b, t);
                    this.f25680a = null;
                }
            }
        }
        return t;
    }
}
