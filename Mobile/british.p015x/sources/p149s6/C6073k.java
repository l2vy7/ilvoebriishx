package p149s6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: s6.k */
/* compiled from: Preconditions */
public final class C6073k {
    /* renamed from: a */
    private static String m26678a(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C6075n.m26695a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C6075n.m26695a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: b */
    private static String m26679b(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return C6075n.m26695a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C6075n.m26695a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: c */
    private static String m26680c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m26679b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m26679b(i2, i3, "end index");
        }
        return C6075n.m26695a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m26681d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m26682e(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m26683f(boolean z, @NullableDecl String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C6075n.m26695a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: g */
    public static void m26684g(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C6075n.m26695a(str, obj));
        }
    }

    /* renamed from: h */
    public static void m26685h(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C6075n.m26695a(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: i */
    public static int m26686i(int i, int i2) {
        return m26687j(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static int m26687j(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m26678a(i, i2, str));
    }

    @NonNullDecl
    @CanIgnoreReturnValue
    /* renamed from: k */
    public static <T> T m26688k(@NonNullDecl T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @NonNullDecl
    @CanIgnoreReturnValue
    /* renamed from: l */
    public static <T> T m26689l(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: m */
    public static int m26690m(int i, int i2) {
        return m26691n(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: n */
    public static int m26691n(int i, int i2, @NullableDecl String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m26679b(i, i2, str));
    }

    /* renamed from: o */
    public static void m26692o(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m26680c(i, i2, i3));
        }
    }

    /* renamed from: p */
    public static void m26693p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: q */
    public static void m26694q(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
