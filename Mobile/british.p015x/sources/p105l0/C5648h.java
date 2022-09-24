package p105l0;

import java.util.Objects;

/* renamed from: l0.h */
/* compiled from: Preconditions */
public final class C5648h {
    /* renamed from: a */
    public static void m24962a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m24963b(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static <T> T m24964c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    public static <T> T m24965d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
