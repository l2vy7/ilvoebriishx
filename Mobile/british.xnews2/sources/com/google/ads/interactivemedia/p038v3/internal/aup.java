package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aup */
/* compiled from: IMASDK */
public final class aup {
    /* renamed from: a */
    static <T> T m14870a(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: b */
    static void m14871b(Iterator<?> it) {
        ars.m14627g(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    static int m14872c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: d */
    static int m14873d(Object obj) {
        return m14872c(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: e */
    static int m14874e(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) ((double) highestOneBit))) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: f */
    static Object m14875f(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    /* renamed from: g */
    static int m14876g(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: h */
    static void m14877h(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: i */
    static int m14878i(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: j */
    static int m14879j(int i, int i2) {
        return i & (i2 ^ -1);
    }

    /* renamed from: k */
    static int m14880k(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    /* renamed from: l */
    static int m14881l(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int d = m14873d(obj);
        int i4 = d & i;
        int g = m14876g(obj3, i4);
        if (g == 0) {
            return -1;
        }
        int j = m14879j(d, i);
        int i5 = -1;
        while (true) {
            i2 = g - 1;
            i3 = iArr[i2];
            if (m14879j(i3, i) != j || !arq.m14618b(obj, objArr[i2]) || (objArr2 != null && !arq.m14618b(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                int i7 = i6;
                i5 = i2;
                g = i7;
            }
        }
        int i8 = i3 & i;
        if (i5 == -1) {
            m14877h(obj3, i4, i8);
        } else {
            iArr[i5] = m14880k(iArr[i5], i8, i);
        }
        return i2;
    }

    /* renamed from: m */
    static void m14882m(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    /* renamed from: n */
    static void m14883n(boolean z) {
        ars.m14624d(z, "no calls to next() since the last call to remove()");
    }

    /* renamed from: o */
    static void m14884o(int i, String str) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append(str);
            sb.append(" cannot be negative but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: p */
    public static void m14885p(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: q */
    public static void m14886q(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: r */
    public static void m14887r(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: s */
    public static void m14888s(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: t */
    public static <T> T m14889t(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u */
    public static <T> T m14890u(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: v */
    public static void m14891v(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: w */
    public static <T> void m14892w(T t, Object obj) {
        if (t == null) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: x */
    public static long m14893x(aka aka) {
        IOException iOException = aka.f15130a;
        if (!(iOException instanceof ajx)) {
            return C6540C.TIME_UNSET;
        }
        int i = ((ajx) iOException).f15123a;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return 60000;
        }
        return C6540C.TIME_UNSET;
    }

    /* renamed from: y */
    public static int m14894y(int i) {
        return i == 7 ? 6 : 3;
    }

    /* renamed from: z */
    public static long m14895z(aka aka) {
        IOException iOException = aka.f15130a;
        return ((iOException instanceof C4144lb) || (iOException instanceof FileNotFoundException) || (iOException instanceof ajv) || (iOException instanceof akh)) ? C6540C.TIME_UNSET : (long) Math.min((aka.f15131b - 1) * 1000, 5000);
    }
}
