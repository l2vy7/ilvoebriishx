package p165v3;

import java.util.Objects;

/* renamed from: v3.d */
/* compiled from: Preconditions */
public final class C6239d {
    /* renamed from: a */
    public static <T> void m27331a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m27332b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m27333c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
