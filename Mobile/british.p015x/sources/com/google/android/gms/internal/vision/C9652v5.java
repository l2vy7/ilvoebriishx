package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.vision.v5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9652v5 {

    /* renamed from: a */
    private static final Logger f45924a = Logger.getLogger(C9652v5.class.getName());

    /* renamed from: b */
    private static final Unsafe f45925b;

    /* renamed from: c */
    private static final Class<?> f45926c = C9519g1.m44269b();

    /* renamed from: d */
    private static final boolean f45927d;

    /* renamed from: e */
    private static final boolean f45928e;

    /* renamed from: f */
    private static final C9655c f45929f;

    /* renamed from: g */
    private static final boolean f45930g = m44703y();

    /* renamed from: h */
    private static final boolean f45931h = m44702x();

    /* renamed from: i */
    private static final long f45932i;

    /* renamed from: j */
    private static final long f45933j;

    /* renamed from: k */
    private static final long f45934k;

    /* renamed from: l */
    private static final long f45935l;

    /* renamed from: m */
    private static final long f45936m;

    /* renamed from: n */
    private static final long f45937n;

    /* renamed from: o */
    private static final long f45938o;

    /* renamed from: p */
    private static final long f45939p;

    /* renamed from: q */
    private static final long f45940q;

    /* renamed from: r */
    private static final long f45941r;

    /* renamed from: s */
    private static final long f45942s;

    /* renamed from: t */
    private static final long f45943t;

    /* renamed from: u */
    private static final long f45944u;

    /* renamed from: v */
    private static final long f45945v;

    /* renamed from: w */
    private static final int f45946w;

    /* renamed from: x */
    static final boolean f45947x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.vision.v5$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static final class C9653a extends C9655c {
        C9653a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo38620a(Object obj, long j, double d) {
            mo38628c(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: b */
        public final void mo38621b(Object obj, long j, float f) {
            mo38629e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final void mo38622d(Object obj, long j, boolean z) {
            if (C9652v5.f45947x) {
                C9652v5.m44690l(obj, j, z);
            } else {
                C9652v5.m44692n(obj, j, z);
            }
        }

        /* renamed from: f */
        public final void mo38623f(Object obj, long j, byte b) {
            if (C9652v5.f45947x) {
                C9652v5.m44680b(obj, j, b);
            } else {
                C9652v5.m44688j(obj, j, b);
            }
        }

        /* renamed from: i */
        public final boolean mo38624i(Object obj, long j) {
            if (C9652v5.f45947x) {
                return C9652v5.m44673J(obj, j);
            }
            return C9652v5.m44674K(obj, j);
        }

        /* renamed from: j */
        public final float mo38625j(Object obj, long j) {
            return Float.intBitsToFloat(mo38630g(obj, j));
        }

        /* renamed from: k */
        public final double mo38626k(Object obj, long j) {
            return Double.longBitsToDouble(mo38631h(obj, j));
        }

        /* renamed from: l */
        public final byte mo38627l(Object obj, long j) {
            if (C9652v5.f45947x) {
                return C9652v5.m44671H(obj, j);
            }
            return C9652v5.m44672I(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v5$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static final class C9654b extends C9655c {
        C9654b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo38620a(Object obj, long j, double d) {
            mo38628c(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: b */
        public final void mo38621b(Object obj, long j, float f) {
            mo38629e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final void mo38622d(Object obj, long j, boolean z) {
            if (C9652v5.f45947x) {
                C9652v5.m44690l(obj, j, z);
            } else {
                C9652v5.m44692n(obj, j, z);
            }
        }

        /* renamed from: f */
        public final void mo38623f(Object obj, long j, byte b) {
            if (C9652v5.f45947x) {
                C9652v5.m44680b(obj, j, b);
            } else {
                C9652v5.m44688j(obj, j, b);
            }
        }

        /* renamed from: i */
        public final boolean mo38624i(Object obj, long j) {
            if (C9652v5.f45947x) {
                return C9652v5.m44673J(obj, j);
            }
            return C9652v5.m44674K(obj, j);
        }

        /* renamed from: j */
        public final float mo38625j(Object obj, long j) {
            return Float.intBitsToFloat(mo38630g(obj, j));
        }

        /* renamed from: k */
        public final double mo38626k(Object obj, long j) {
            return Double.longBitsToDouble(mo38631h(obj, j));
        }

        /* renamed from: l */
        public final byte mo38627l(Object obj, long j) {
            if (C9652v5.f45947x) {
                return C9652v5.m44671H(obj, j);
            }
            return C9652v5.m44672I(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v5$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static abstract class C9655c {

        /* renamed from: a */
        Unsafe f45948a;

        C9655c(Unsafe unsafe) {
            this.f45948a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo38620a(Object obj, long j, double d);

        /* renamed from: b */
        public abstract void mo38621b(Object obj, long j, float f);

        /* renamed from: c */
        public final void mo38628c(Object obj, long j, long j2) {
            this.f45948a.putLong(obj, j, j2);
        }

        /* renamed from: d */
        public abstract void mo38622d(Object obj, long j, boolean z);

        /* renamed from: e */
        public final void mo38629e(Object obj, long j, int i) {
            this.f45948a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public abstract void mo38623f(Object obj, long j, byte b);

        /* renamed from: g */
        public final int mo38630g(Object obj, long j) {
            return this.f45948a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo38631h(Object obj, long j) {
            return this.f45948a.getLong(obj, j);
        }

        /* renamed from: i */
        public abstract boolean mo38624i(Object obj, long j);

        /* renamed from: j */
        public abstract float mo38625j(Object obj, long j);

        /* renamed from: k */
        public abstract double mo38626k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo38627l(Object obj, long j);
    }

    /* renamed from: com.google.android.gms.internal.vision.v5$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private static final class C9656d extends C9655c {
        C9656d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo38620a(Object obj, long j, double d) {
            this.f45948a.putDouble(obj, j, d);
        }

        /* renamed from: b */
        public final void mo38621b(Object obj, long j, float f) {
            this.f45948a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final void mo38622d(Object obj, long j, boolean z) {
            this.f45948a.putBoolean(obj, j, z);
        }

        /* renamed from: f */
        public final void mo38623f(Object obj, long j, byte b) {
            this.f45948a.putByte(obj, j, b);
        }

        /* renamed from: i */
        public final boolean mo38624i(Object obj, long j) {
            return this.f45948a.getBoolean(obj, j);
        }

        /* renamed from: j */
        public final float mo38625j(Object obj, long j) {
            return this.f45948a.getFloat(obj, j);
        }

        /* renamed from: k */
        public final double mo38626k(Object obj, long j) {
            return this.f45948a.getDouble(obj, j);
        }

        /* renamed from: l */
        public final byte mo38627l(Object obj, long j) {
            return this.f45948a.getByte(obj, j);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe w = m44701w();
        f45925b = w;
        boolean B = m44665B(Long.TYPE);
        f45927d = B;
        boolean B2 = m44665B(Integer.TYPE);
        f45928e = B2;
        C9655c cVar = null;
        if (w != null) {
            if (!C9519g1.m44268a()) {
                cVar = new C9656d(w);
            } else if (B) {
                cVar = new C9653a(w);
            } else if (B2) {
                cVar = new C9654b(w);
            }
        }
        f45929f = cVar;
        long s = (long) m44697s(byte[].class);
        f45932i = s;
        f45933j = (long) m44697s(cls6);
        f45934k = (long) m44698t(cls6);
        f45935l = (long) m44697s(cls5);
        f45936m = (long) m44698t(cls5);
        f45937n = (long) m44697s(cls4);
        f45938o = (long) m44698t(cls4);
        f45939p = (long) m44697s(cls3);
        f45940q = (long) m44698t(cls3);
        f45941r = (long) m44697s(cls2);
        f45942s = (long) m44698t(cls2);
        f45943t = (long) m44697s(cls);
        f45944u = (long) m44698t(cls);
        Field z = m44704z();
        f45945v = (z == null || cVar == null) ? -1 : cVar.f45948a.objectFieldOffset(z);
        f45946w = (int) (7 & s);
    }

    private C9652v5() {
    }

    /* renamed from: A */
    static int m44664A(Object obj, long j) {
        return f45929f.mo38630g(obj, j);
    }

    /* renamed from: B */
    private static boolean m44665B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C9519g1.m44268a()) {
            return false;
        }
        try {
            Class<?> cls3 = f45926c;
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

    /* renamed from: C */
    static long m44666C(Object obj, long j) {
        return f45929f.mo38631h(obj, j);
    }

    /* renamed from: D */
    static boolean m44667D(Object obj, long j) {
        return f45929f.mo38624i(obj, j);
    }

    /* renamed from: E */
    static float m44668E(Object obj, long j) {
        return f45929f.mo38625j(obj, j);
    }

    /* renamed from: F */
    static double m44669F(Object obj, long j) {
        return f45929f.mo38626k(obj, j);
    }

    /* renamed from: G */
    static Object m44670G(Object obj, long j) {
        return f45929f.f45948a.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static byte m44671H(Object obj, long j) {
        return (byte) (m44664A(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static byte m44672I(Object obj, long j) {
        return (byte) (m44664A(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static boolean m44673J(Object obj, long j) {
        return m44671H(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static boolean m44674K(Object obj, long j) {
        return m44672I(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m44679a(byte[] bArr, long j) {
        return f45929f.mo38627l(bArr, f45932i + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m44680b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m44689k(obj, j2, ((255 & b) << i) | (m44664A(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: c */
    static void m44681c(Object obj, long j, double d) {
        f45929f.mo38620a(obj, j, d);
    }

    /* renamed from: d */
    static void m44682d(Object obj, long j, float f) {
        f45929f.mo38621b(obj, j, f);
    }

    /* renamed from: e */
    static void m44683e(Object obj, long j, long j2) {
        f45929f.mo38628c(obj, j, j2);
    }

    /* renamed from: f */
    static void m44684f(Object obj, long j, Object obj2) {
        f45929f.f45948a.putObject(obj, j, obj2);
    }

    /* renamed from: g */
    static void m44685g(Object obj, long j, boolean z) {
        f45929f.mo38622d(obj, j, z);
    }

    /* renamed from: h */
    static void m44686h(byte[] bArr, long j, byte b) {
        f45929f.mo38623f(bArr, f45932i + j, b);
    }

    /* renamed from: i */
    private static Field m44687i(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m44688j(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m44689k(obj, j2, ((255 & b) << i) | (m44664A(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: k */
    static void m44689k(Object obj, long j, int i) {
        f45929f.mo38629e(obj, j, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m44690l(Object obj, long j, boolean z) {
        m44680b(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m44692n(Object obj, long j, boolean z) {
        m44688j(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: r */
    static <T> T m44696r(Class<T> cls) {
        try {
            return f45925b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: s */
    private static int m44697s(Class<?> cls) {
        if (f45931h) {
            return f45929f.f45948a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: t */
    private static int m44698t(Class<?> cls) {
        if (f45931h) {
            return f45929f.f45948a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: u */
    static boolean m44699u() {
        return f45931h;
    }

    /* renamed from: v */
    static boolean m44700v() {
        return f45930g;
    }

    /* renamed from: w */
    static Unsafe m44701w() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C9637u5());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    private static boolean m44702x() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f45925b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (C9519g1.m44268a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f45924a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: y */
    private static boolean m44703y() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f45925b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m44704z() == null) {
                return false;
            }
            if (C9519g1.m44268a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = f45924a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: z */
    private static Field m44704z() {
        Field i;
        if (C9519g1.m44268a() && (i = m44687i(Buffer.class, "effectiveDirectAddress")) != null) {
            return i;
        }
        Field i2 = m44687i(Buffer.class, "address");
        if (i2 == null || i2.getType() != Long.TYPE) {
            return null;
        }
        return i2;
    }
}
