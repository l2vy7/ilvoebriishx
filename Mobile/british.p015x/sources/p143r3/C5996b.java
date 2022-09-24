package p143r3;

import java.util.Objects;

/* renamed from: r3.b */
/* compiled from: Encoding */
public final class C5996b {

    /* renamed from: a */
    private final String f24986a;

    private C5996b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f24986a = str;
    }

    /* renamed from: b */
    public static C5996b m26427b(String str) {
        return new C5996b(str);
    }

    /* renamed from: a */
    public String mo23095a() {
        return this.f24986a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5996b)) {
            return false;
        }
        return this.f24986a.equals(((C5996b) obj).f24986a);
    }

    public int hashCode() {
        return this.f24986a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f24986a + "\"}";
    }
}
