package p235n5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: n5.e */
final class C10835e extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f49594a;

    public C10835e(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f49594a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C10835e.class) {
            if (this == obj) {
                return true;
            }
            C10835e eVar = (C10835e) obj;
            return this.f49594a == eVar.f49594a && get() == eVar.get();
        }
    }

    public final int hashCode() {
        return this.f49594a;
    }
}
