package p267y6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p215h7.C10581b;

/* renamed from: y6.x */
/* compiled from: LazySet */
class C11139x<T> implements C10581b<Set<T>> {

    /* renamed from: a */
    private volatile Set<C10581b<T>> f50131a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f50132b = null;

    C11139x(Collection<C10581b<T>> collection) {
        this.f50131a.addAll(collection);
    }

    /* renamed from: b */
    static C11139x<?> m49713b(Collection<C10581b<?>> collection) {
        return new C11139x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m49714d() {
        for (C10581b<T> bVar : this.f50131a) {
            this.f50132b.add(bVar.get());
        }
        this.f50131a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo43434a(C10581b<T> bVar) {
        if (this.f50132b == null) {
            this.f50131a.add(bVar);
        } else {
            this.f50132b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f50132b == null) {
            synchronized (this) {
                if (this.f50132b == null) {
                    this.f50132b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m49714d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f50132b);
    }
}
