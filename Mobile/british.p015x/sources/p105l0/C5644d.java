package p105l0;

/* renamed from: l0.d */
/* compiled from: Pair */
public class C5644d<F, S> {

    /* renamed from: a */
    public final F f24210a;

    /* renamed from: b */
    public final S f24211b;

    public C5644d(F f, S s) {
        this.f24210a = f;
        this.f24211b = s;
    }

    /* renamed from: a */
    public static <A, B> C5644d<A, B> m24957a(A a, B b) {
        return new C5644d<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5644d)) {
            return false;
        }
        C5644d dVar = (C5644d) obj;
        if (!C5643c.m24954a(dVar.f24210a, this.f24210a) || !C5643c.m24954a(dVar.f24211b, this.f24211b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f24210a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f24211b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f24210a + " " + this.f24211b + "}";
    }
}
