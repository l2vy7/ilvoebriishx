package p142r3;

import java.util.Objects;

/* renamed from: r3.a */
/* compiled from: AutoValue_Event */
final class C5995a<T> extends C5997c<T> {

    /* renamed from: a */
    private final Integer f24983a;

    /* renamed from: b */
    private final T f24984b;

    /* renamed from: c */
    private final C5998d f24985c;

    C5995a(Integer num, T t, C5998d dVar) {
        this.f24983a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f24984b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f24985c = dVar;
    }

    /* renamed from: a */
    public Integer mo23089a() {
        return this.f24983a;
    }

    /* renamed from: b */
    public T mo23090b() {
        return this.f24984b;
    }

    /* renamed from: c */
    public C5998d mo23091c() {
        return this.f24985c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5997c)) {
            return false;
        }
        C5997c cVar = (C5997c) obj;
        Integer num = this.f24983a;
        if (num != null ? num.equals(cVar.mo23089a()) : cVar.mo23089a() == null) {
            if (!this.f24984b.equals(cVar.mo23090b()) || !this.f24985c.equals(cVar.mo23091c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f24983a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f24984b.hashCode()) * 1000003) ^ this.f24985c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f24983a + ", payload=" + this.f24984b + ", priority=" + this.f24985c + "}";
    }
}
