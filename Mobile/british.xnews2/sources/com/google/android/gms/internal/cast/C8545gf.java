package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.gf */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8545gf {

    /* renamed from: a */
    private static final Unsafe f43502a;

    /* renamed from: b */
    private static final Class<?> f43503b = C8640mb.m41134a();

    /* renamed from: c */
    private static final boolean f43504c;

    /* renamed from: d */
    private static final boolean f43505d;

    /* renamed from: e */
    private static final C8529ff f43506e;

    /* renamed from: f */
    private static final boolean f43507f;

    /* renamed from: g */
    private static final boolean f43508g;

    /* renamed from: h */
    static final long f43509h = ((long) m40946E(byte[].class));

    /* renamed from: i */
    static final boolean f43510i;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m40968v()
            f43502a = r7
            java.lang.Class r8 = com.google.android.gms.internal.cast.C8640mb.m41134a()
            f43503b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m40969w(r8)
            f43504c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m40969w(r10)
            f43505d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.cast.ef r11 = new com.google.android.gms.internal.cast.ef
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.cast.df r11 = new com.google.android.gms.internal.cast.df
            r11.<init>(r7)
        L_0x003d:
            f43506e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f43476a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m40948b()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            m40970x(r8)
            goto L_0x0048
        L_0x0073:
            f43507f = r8
            com.google.android.gms.internal.cast.ff r8 = f43506e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f43476a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            m40970x(r6)
            goto L_0x0079
        L_0x00f6:
            f43508g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m40946E(r6)
            long r6 = (long) r6
            f43509h = r6
            m40946E(r5)
            m40947a(r5)
            m40946E(r4)
            m40947a(r4)
            m40946E(r3)
            m40947a(r3)
            m40946E(r2)
            m40947a(r2)
            m40946E(r1)
            m40947a(r1)
            m40946E(r0)
            m40947a(r0)
            java.lang.reflect.Field r0 = m40948b()
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.internal.cast.ff r1 = f43506e
            if (r1 == 0) goto L_0x0132
            r1.mo36528h(r0)
        L_0x0132:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            f43510i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C8545gf.<clinit>():void");
    }

    private C8545gf() {
    }

    /* renamed from: A */
    static /* synthetic */ boolean m40942A(Object obj, long j) {
        return ((byte) ((f43506e.mo36531k(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: B */
    static /* synthetic */ boolean m40943B(Object obj, long j) {
        return ((byte) ((f43506e.mo36531k(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: E */
    private static int m40946E(Class<?> cls) {
        if (f43508g) {
            return f43506e.mo36529i(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m40947a(Class<?> cls) {
        if (f43508g) {
            return f43506e.mo36530j(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m40948b() {
        int i = C8640mb.f43715a;
        Field c = m40949c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m40949c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m40949c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m40950d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C8529ff ffVar = f43506e;
        int i = ((((int) j) ^ -1) & 3) << 3;
        ffVar.mo36532l(obj, j2, ((255 & b) << i) | (ffVar.mo36531k(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m40951e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C8529ff ffVar = f43506e;
        int i = (((int) j) & 3) << 3;
        ffVar.mo36532l(obj, j2, ((255 & b) << i) | (ffVar.mo36531k(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: f */
    static boolean m40952f() {
        return f43508g;
    }

    /* renamed from: g */
    static boolean m40953g() {
        return f43507f;
    }

    /* renamed from: h */
    static <T> T m40954h(Class<T> cls) {
        try {
            return f43502a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    static int m40955i(Object obj, long j) {
        return f43506e.mo36531k(obj, j);
    }

    /* renamed from: j */
    static void m40956j(Object obj, long j, int i) {
        f43506e.mo36532l(obj, j, i);
    }

    /* renamed from: k */
    static long m40957k(Object obj, long j) {
        return f43506e.mo36533m(obj, j);
    }

    /* renamed from: l */
    static void m40958l(Object obj, long j, long j2) {
        f43506e.mo36534n(obj, j, j2);
    }

    /* renamed from: m */
    static boolean m40959m(Object obj, long j) {
        return f43506e.mo36436b(obj, j);
    }

    /* renamed from: n */
    static void m40960n(Object obj, long j, boolean z) {
        f43506e.mo36437c(obj, j, z);
    }

    /* renamed from: o */
    static float m40961o(Object obj, long j) {
        return f43506e.mo36438d(obj, j);
    }

    /* renamed from: p */
    static void m40962p(Object obj, long j, float f) {
        f43506e.mo36439e(obj, j, f);
    }

    /* renamed from: q */
    static double m40963q(Object obj, long j) {
        return f43506e.mo36440f(obj, j);
    }

    /* renamed from: r */
    static void m40964r(Object obj, long j, double d) {
        f43506e.mo36441g(obj, j, d);
    }

    /* renamed from: s */
    static Object m40965s(Object obj, long j) {
        return f43506e.mo36535o(obj, j);
    }

    /* renamed from: t */
    static void m40966t(Object obj, long j, Object obj2) {
        f43506e.mo36536p(obj, j, obj2);
    }

    /* renamed from: u */
    static void m40967u(byte[] bArr, long j, byte b) {
        f43506e.mo36435a(bArr, f43509h + j, b);
    }

    /* renamed from: v */
    static Unsafe m40968v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8479cf());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static boolean m40969w(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C8640mb.f43715a;
        try {
            Class<?> cls3 = f43503b;
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

    /* renamed from: x */
    static /* synthetic */ void m40970x(Throwable th) {
        Logger logger = Logger.getLogger(C8545gf.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
