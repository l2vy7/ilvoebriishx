package p188a7;

import java.util.Collections;
import java.util.Map;

/* renamed from: a7.c */
/* compiled from: FieldDescriptor */
public final class C6503c {

    /* renamed from: a */
    private final String f26581a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f26582b;

    private C6503c(String str, Map<Class<?>, Object> map) {
        this.f26581a = str;
        this.f26582b = map;
    }

    /* renamed from: b */
    public static C6503c m28302b(String str) {
        return new C6503c(str, Collections.emptyMap());
    }

    /* renamed from: a */
    public String mo24328a() {
        return this.f26581a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6503c)) {
            return false;
        }
        C6503c cVar = (C6503c) obj;
        if (!this.f26581a.equals(cVar.f26581a) || !this.f26582b.equals(cVar.f26582b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f26581a.hashCode() * 31) + this.f26582b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f26581a + ", properties=" + this.f26582b.values() + "}";
    }
}
