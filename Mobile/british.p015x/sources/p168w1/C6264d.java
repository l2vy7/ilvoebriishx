package p168w1;

/* renamed from: w1.d */
/* compiled from: Preference */
public class C6264d {

    /* renamed from: a */
    public String f25913a;

    /* renamed from: b */
    public Long f25914b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6264d(String str, boolean z) {
        this(str, z ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6264d)) {
            return false;
        }
        C6264d dVar = (C6264d) obj;
        if (!this.f25913a.equals(dVar.f25913a)) {
            return false;
        }
        Long l = this.f25914b;
        Long l2 = dVar.f25914b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f25913a.hashCode() * 31;
        Long l = this.f25914b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public C6264d(String str, long j) {
        this.f25913a = str;
        this.f25914b = Long.valueOf(j);
    }
}
