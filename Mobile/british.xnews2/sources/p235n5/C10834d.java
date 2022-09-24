package p235n5;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n5.d */
final class C10834d {

    /* renamed from: a */
    private final ConcurrentHashMap<C10835e, List<Throwable>> f49592a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f49593b = new ReferenceQueue<>();

    C10834d() {
    }

    /* renamed from: a */
    public final List<Throwable> mo42995a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f49593b.poll();
        while (poll != null) {
            this.f49592a.remove(poll);
            poll = this.f49593b.poll();
        }
        List<Throwable> list = this.f49592a.get(new C10835e(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f49592a.putIfAbsent(new C10835e(th, this.f49593b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
