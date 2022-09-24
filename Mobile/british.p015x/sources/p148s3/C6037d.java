package p148s3;

import java.util.List;
import java.util.Objects;

/* renamed from: s3.d */
/* compiled from: AutoValue_BatchedLogRequest */
final class C6037d extends C6051j {

    /* renamed from: a */
    private final List<C6057m> f25153a;

    C6037d(List<C6057m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f25153a = list;
    }

    /* renamed from: c */
    public List<C6057m> mo23189c() {
        return this.f25153a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6051j) {
            return this.f25153a.equals(((C6051j) obj).mo23189c());
        }
        return false;
    }

    public int hashCode() {
        return this.f25153a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f25153a + "}";
    }
}
