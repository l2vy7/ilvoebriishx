package p267y6;

import p215h7.C10581b;

/* renamed from: y6.w */
/* compiled from: Lazy */
public class C11138w<T> implements C10581b<T> {

    /* renamed from: c */
    private static final Object f50128c = new Object();

    /* renamed from: a */
    private volatile Object f50129a = f50128c;

    /* renamed from: b */
    private volatile C10581b<T> f50130b;

    public C11138w(C10581b<T> bVar) {
        this.f50130b = bVar;
    }

    public T get() {
        T t = this.f50129a;
        T t2 = f50128c;
        if (t == t2) {
            synchronized (this) {
                t = this.f50129a;
                if (t == t2) {
                    t = this.f50130b.get();
                    this.f50129a = t;
                    this.f50130b = null;
                }
            }
        }
        return t;
    }
}
