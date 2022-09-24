package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmv */
/* compiled from: IMASDK */
final class bmv {

    /* renamed from: a */
    static final long f16710a = ((long) m16719A(byte[].class));

    /* renamed from: b */
    static final boolean f16711b;

    /* renamed from: c */
    private static final Unsafe f16712c;

    /* renamed from: d */
    private static final Class<?> f16713d = bjf.m16026a();

    /* renamed from: e */
    private static final boolean f16714e;

    /* renamed from: f */
    private static final boolean f16715f;

    /* renamed from: g */
    private static final bmu f16716g;

    /* renamed from: h */
    private static final boolean f16717h;

    /* renamed from: i */
    private static final boolean f16718i;

    static {
        boolean z;
        boolean z2;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe q = m16743q();
        f16712c = q;
        boolean r = m16744r(Long.TYPE);
        f16714e = r;
        boolean r2 = m16744r(Integer.TYPE);
        f16715f = r2;
        bmu bmu = null;
        if (q != null) {
            if (r) {
                bmu = new bmt(q);
            } else if (r2) {
                bmu = new bms(q);
            }
        }
        f16716g = bmu;
        boolean z3 = false;
        if (bmu == null) {
            z = false;
        } else {
            z = bmu.mo15548q();
        }
        f16717h = z;
        if (bmu == null) {
            z2 = false;
        } else {
            z2 = bmu.mo15541j();
        }
        f16718i = z2;
        m16719A(cls6);
        m16726H(cls6);
        m16719A(cls5);
        m16726H(cls5);
        m16719A(cls4);
        m16726H(cls4);
        m16719A(cls3);
        m16726H(cls3);
        m16719A(cls2);
        m16726H(cls2);
        m16719A(cls);
        m16726H(cls);
        Field B = m16720B();
        if (!(B == null || bmu == null)) {
            bmu.mo15549r(B);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        }
        f16711b = z3;
    }

    private bmv() {
    }

    /* renamed from: A */
    private static int m16719A(Class<?> cls) {
        if (f16718i) {
            return f16716g.mo15539h(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static Field m16720B() {
        int i = bjf.f16467a;
        Field C = m16721C(Buffer.class, "effectiveDirectAddress");
        if (C != null) {
            return C;
        }
        Field C2 = m16721C(Buffer.class, "address");
        if (C2 == null || C2.getType() != Long.TYPE) {
            return null;
        }
        return C2;
    }

    /* renamed from: C */
    private static Field m16721C(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static byte m16722D(Object obj, long j) {
        return (byte) ((m16730d(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255);
    }

    /* renamed from: E */
    private static byte m16723E(Object obj, long j) {
        return (byte) ((m16730d(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static void m16724F(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m16731e(obj, j2, ((b & 255) << i) | (m16730d(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static void m16725G(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m16731e(obj, j2, ((b & 255) << i) | (m16730d(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: H */
    private static void m16726H(Class<?> cls) {
        if (f16718i) {
            f16716g.mo15540i(cls);
        }
    }

    /* renamed from: a */
    static boolean m16727a() {
        return f16718i;
    }

    /* renamed from: b */
    static boolean m16728b() {
        return f16717h;
    }

    /* renamed from: c */
    static <T> T m16729c(Class<T> cls) {
        try {
            return f16712c.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    static int m16730d(Object obj, long j) {
        return f16716g.mo15542k(obj, j);
    }

    /* renamed from: e */
    static void m16731e(Object obj, long j, int i) {
        f16716g.mo15543l(obj, j, i);
    }

    /* renamed from: f */
    static long m16732f(Object obj, long j) {
        return f16716g.mo15544m(obj, j);
    }

    /* renamed from: g */
    static void m16733g(Object obj, long j, long j2) {
        f16716g.mo15545n(obj, j, j2);
    }

    /* renamed from: h */
    static boolean m16734h(Object obj, long j) {
        return f16716g.mo15533b(obj, j);
    }

    /* renamed from: i */
    static void m16735i(Object obj, long j, boolean z) {
        f16716g.mo15534c(obj, j, z);
    }

    /* renamed from: j */
    static float m16736j(Object obj, long j) {
        return f16716g.mo15535d(obj, j);
    }

    /* renamed from: k */
    static void m16737k(Object obj, long j, float f) {
        f16716g.mo15536e(obj, j, f);
    }

    /* renamed from: l */
    static double m16738l(Object obj, long j) {
        return f16716g.mo15537f(obj, j);
    }

    /* renamed from: m */
    static void m16739m(Object obj, long j, double d) {
        f16716g.mo15538g(obj, j, d);
    }

    /* renamed from: n */
    static Object m16740n(Object obj, long j) {
        return f16716g.mo15546o(obj, j);
    }

    /* renamed from: o */
    static void m16741o(Object obj, long j, Object obj2) {
        f16716g.mo15547p(obj, j, obj2);
    }

    /* renamed from: p */
    static void m16742p(byte[] bArr, long j, byte b) {
        f16716g.mo15532a(bArr, f16710a + j, b);
    }

    /* renamed from: q */
    static Unsafe m16743q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new bmr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static boolean m16744r(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = bjf.f16467a;
        try {
            Class<?> cls3 = f16713d;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: s */
    static /* synthetic */ void m16745s(Throwable th) {
        Logger logger = Logger.getLogger(bmv.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* renamed from: w */
    static /* synthetic */ boolean m16749w(Object obj, long j) {
        return m16722D(obj, j) != 0;
    }

    /* renamed from: x */
    static /* synthetic */ boolean m16750x(Object obj, long j) {
        return m16723E(obj, j) != 0;
    }
}
