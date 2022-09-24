package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ars */
/* compiled from: IMASDK */
public final class ars {
    /* renamed from: a */
    public static void m14621a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m14622b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m14623c(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(aru.m14637c(str, obj));
        }
    }

    /* renamed from: d */
    public static void m14624d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: e */
    public static void m14625e(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m14629i(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m14629i(i2, i3, "end index");
            } else {
                str = aru.m14637c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: f */
    public static void m14626f(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = aru.m14637c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = aru.m14637c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: g */
    public static <T> void m14627g(T t) {
        Objects.requireNonNull(t);
    }

    /* renamed from: h */
    public static void m14628h(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m14629i(i, i2, "index"));
        }
    }

    /* renamed from: i */
    private static String m14629i(int i, int i2, String str) {
        if (i < 0) {
            return aru.m14637c("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return aru.m14637c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
