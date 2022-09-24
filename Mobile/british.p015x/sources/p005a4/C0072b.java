package p005a4;

import java.util.Objects;
import p154t3.C6141h;
import p154t3.C6150m;

/* renamed from: a4.b */
/* compiled from: AutoValue_PersistedEvent */
final class C0072b extends C0095i {

    /* renamed from: a */
    private final long f206a;

    /* renamed from: b */
    private final C6150m f207b;

    /* renamed from: c */
    private final C6141h f208c;

    C0072b(long j, C6150m mVar, C6141h hVar) {
        this.f206a = j;
        Objects.requireNonNull(mVar, "Null transportContext");
        this.f207b = mVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f208c = hVar;
    }

    /* renamed from: b */
    public C6141h mo213b() {
        return this.f208c;
    }

    /* renamed from: c */
    public long mo214c() {
        return this.f206a;
    }

    /* renamed from: d */
    public C6150m mo215d() {
        return this.f207b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0095i)) {
            return false;
        }
        C0095i iVar = (C0095i) obj;
        if (this.f206a != iVar.mo214c() || !this.f207b.equals(iVar.mo215d()) || !this.f208c.equals(iVar.mo213b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f206a;
        return this.f208c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f207b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f206a + ", transportContext=" + this.f207b + ", event=" + this.f208c + "}";
    }
}
