package p132p7;

import java.util.Objects;
import javax.annotation.Nonnull;

/* renamed from: p7.a */
/* compiled from: AutoValue_LibraryVersion */
final class C5906a extends C5907f {

    /* renamed from: a */
    private final String f24754a;

    /* renamed from: b */
    private final String f24755b;

    C5906a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f24754a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f24755b = str2;
    }

    @Nonnull
    /* renamed from: b */
    public String mo22893b() {
        return this.f24754a;
    }

    @Nonnull
    /* renamed from: c */
    public String mo22894c() {
        return this.f24755b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5907f)) {
            return false;
        }
        C5907f fVar = (C5907f) obj;
        if (!this.f24754a.equals(fVar.mo22893b()) || !this.f24755b.equals(fVar.mo22894c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f24754a.hashCode() ^ 1000003) * 1000003) ^ this.f24755b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f24754a + ", version=" + this.f24755b + "}";
    }
}
