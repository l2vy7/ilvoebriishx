package p268y6;

import java.util.Objects;

/* renamed from: y6.c0 */
/* compiled from: Preconditions */
public final class C11113c0 {
    /* renamed from: a */
    public static void m49614a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m49615b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m49616c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m49617d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
