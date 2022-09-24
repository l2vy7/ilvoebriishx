package p148s3;

/* renamed from: s3.h */
/* compiled from: AutoValue_LogResponse */
final class C6047h extends C6059n {

    /* renamed from: a */
    private final long f25186a;

    C6047h(long j) {
        this.f25186a = j;
    }

    /* renamed from: c */
    public long mo23237c() {
        return this.f25186a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6059n) || this.f25186a != ((C6059n) obj).mo23237c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f25186a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f25186a + "}";
    }
}
