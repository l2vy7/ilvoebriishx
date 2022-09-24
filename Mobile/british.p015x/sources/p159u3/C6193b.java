package p159u3;

import java.util.Objects;
import p159u3.C6199g;

/* renamed from: u3.b */
/* compiled from: AutoValue_BackendResponse */
final class C6193b extends C6199g {

    /* renamed from: a */
    private final C6199g.C6200a f25545a;

    /* renamed from: b */
    private final long f25546b;

    C6193b(C6199g.C6200a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f25545a = aVar;
        this.f25546b = j;
    }

    /* renamed from: b */
    public long mo23619b() {
        return this.f25546b;
    }

    /* renamed from: c */
    public C6199g.C6200a mo23620c() {
        return this.f25545a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6199g)) {
            return false;
        }
        C6199g gVar = (C6199g) obj;
        if (!this.f25545a.equals(gVar.mo23620c()) || this.f25546b != gVar.mo23619b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f25546b;
        return ((this.f25545a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f25545a + ", nextRequestWaitMillis=" + this.f25546b + "}";
    }
}
