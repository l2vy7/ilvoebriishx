package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qs3 {

    /* renamed from: a */
    private static final Unsafe f38272a;

    /* renamed from: b */
    private static final Class<?> f38273b = nn3.m35226a();

    /* renamed from: c */
    private static final boolean f38274c;

    /* renamed from: d */
    private static final boolean f38275d;

    /* renamed from: e */
    private static final ps3 f38276e;

    /* renamed from: f */
    private static final boolean f38277f;

    /* renamed from: g */
    private static final boolean f38278g;

    /* renamed from: h */
    static final long f38279h = ((long) m36711c(byte[].class));

    /* renamed from: i */
    private static final long f38280i;

    /* renamed from: j */
    static final boolean f38281j;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m36725q()
            f38272a = r7
            java.lang.Class r8 = com.google.android.gms.internal.ads.nn3.m35226a()
            f38273b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m36707G(r8)
            f38274c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m36707G(r10)
            f38275d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.os3 r11 = new com.google.android.gms.internal.ads.os3
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.ns3 r11 = new com.google.android.gms.internal.ads.ns3
            r11.<init>(r7)
        L_0x003d:
            f38276e = r11
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
            sun.misc.Unsafe r11 = r11.f37764a
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
            java.lang.reflect.Field r8 = m36713e()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.qs3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0048
        L_0x0073:
            f38277f = r8
            com.google.android.gms.internal.ads.ps3 r8 = f38276e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f37764a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.qs3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0079
        L_0x00f6:
            f38278g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m36711c(r6)
            long r6 = (long) r6
            f38279h = r6
            m36711c(r5)
            m36712d(r5)
            m36711c(r4)
            m36712d(r4)
            m36711c(r3)
            m36712d(r3)
            m36711c(r2)
            m36712d(r2)
            m36711c(r1)
            m36712d(r1)
            m36711c(r0)
            m36712d(r0)
            java.lang.reflect.Field r0 = m36713e()
            r1 = -1
            if (r0 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.ps3 r3 = f38276e
            if (r3 != 0) goto L_0x0132
            goto L_0x0136
        L_0x0132:
            long r1 = r3.mo34185n(r0)
        L_0x0136:
            f38280i = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r12 = 0
        L_0x0142:
            f38281j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qs3.<clinit>():void");
    }

    private qs3() {
    }

    /* renamed from: A */
    static void m36701A(Object obj, long j, float f) {
        f38276e.mo33745h(obj, j, f);
    }

    /* renamed from: B */
    static void m36702B(Object obj, long j, int i) {
        f38276e.mo34187p(obj, j, i);
    }

    /* renamed from: C */
    static void m36703C(Object obj, long j, long j2) {
        f38276e.mo34188q(obj, j, j2);
    }

    /* renamed from: D */
    static void m36704D(Object obj, long j, Object obj2) {
        f38276e.mo34189r(obj, j, obj2);
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ boolean m36705E(Object obj, long j) {
        return ((byte) ((f38276e.mo34183l(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ boolean m36706F(Object obj, long j) {
        return ((byte) ((f38276e.mo34183l(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: G */
    static boolean m36707G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = nn3.f36061a;
        try {
            Class<?> cls3 = f38273b;
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

    /* renamed from: H */
    static boolean m36708H(Object obj, long j) {
        return f38276e.mo33746i(obj, j);
    }

    /* renamed from: a */
    static boolean m36709a() {
        return f38278g;
    }

    /* renamed from: b */
    static boolean m36710b() {
        return f38277f;
    }

    /* renamed from: c */
    private static int m36711c(Class<?> cls) {
        if (f38278g) {
            return f38276e.mo34181j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m36712d(Class<?> cls) {
        if (f38278g) {
            return f38276e.mo34182k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m36713e() {
        int i = nn3.f36061a;
        Field f = m36714f(Buffer.class, "effectiveDirectAddress");
        if (f != null) {
            return f;
        }
        Field f2 = m36714f(Buffer.class, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: f */
    private static Field m36714f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m36715g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ps3 ps3 = f38276e;
        int i = ((((int) j) ^ -1) & 3) << 3;
        ps3.mo34187p(obj, j2, ((255 & b) << i) | (ps3.mo34183l(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m36716h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ps3 ps3 = f38276e;
        int i = (((int) j) & 3) << 3;
        ps3.mo34187p(obj, j2, ((255 & b) << i) | (ps3.mo34183l(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: i */
    static byte m36717i(long j) {
        return f38276e.mo33738a(j);
    }

    /* renamed from: j */
    static double m36718j(Object obj, long j) {
        return f38276e.mo33739b(obj, j);
    }

    /* renamed from: k */
    static float m36719k(Object obj, long j) {
        return f38276e.mo33740c(obj, j);
    }

    /* renamed from: l */
    static int m36720l(Object obj, long j) {
        return f38276e.mo34183l(obj, j);
    }

    /* renamed from: m */
    static long m36721m(ByteBuffer byteBuffer) {
        return f38276e.mo34184m(byteBuffer, f38280i);
    }

    /* renamed from: n */
    static long m36722n(Object obj, long j) {
        return f38276e.mo34184m(obj, j);
    }

    /* renamed from: o */
    static <T> T m36723o(Class<T> cls) {
        try {
            return f38272a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    static Object m36724p(Object obj, long j) {
        return f38276e.mo34186o(obj, j);
    }

    /* renamed from: q */
    static Unsafe m36725q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ms3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static void m36731w(long j, byte[] bArr, long j2, long j3) {
        f38276e.mo33741d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    static void m36732x(Object obj, long j, boolean z) {
        f38276e.mo33742e(obj, j, z);
    }

    /* renamed from: y */
    static void m36733y(byte[] bArr, long j, byte b) {
        f38276e.mo33743f(bArr, f38279h + j, b);
    }

    /* renamed from: z */
    static void m36734z(Object obj, long j, double d) {
        f38276e.mo33744g(obj, j, d);
    }
}
