package p004a3;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* renamed from: a3.j */
/* compiled from: Preconditions */
public final class C0065j {
    /* renamed from: a */
    public static void m244a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m245b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m246c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m247d(T t) {
        return m248e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m248e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
