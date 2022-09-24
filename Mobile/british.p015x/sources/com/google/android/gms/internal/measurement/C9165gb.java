package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.gb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9165gb {

    /* renamed from: a */
    private static final Unsafe f45050a;

    /* renamed from: b */
    private static final Class f45051b = C9115d7.m42778a();

    /* renamed from: c */
    private static final boolean f45052c;

    /* renamed from: d */
    private static final C9150fb f45053d;

    /* renamed from: e */
    private static final boolean f45054e;

    /* renamed from: f */
    private static final boolean f45055f;

    /* renamed from: g */
    static final long f45056g = ((long) m42944E(byte[].class));

    /* renamed from: h */
    static final boolean f45057h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m42956l()
            f45050a = r7
            java.lang.Class r8 = com.google.android.gms.internal.measurement.C9115d7.m42778a()
            f45051b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m42940A(r8)
            f45052c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m42940A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.measurement.eb r11 = new com.google.android.gms.internal.measurement.eb
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.db r11 = new com.google.android.gms.internal.measurement.db
            r11.<init>(r7)
        L_0x003b:
            f45053d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f45030a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m42946b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C9165gb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f45054e = r8
            com.google.android.gms.internal.measurement.fb r8 = f45053d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f45030a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C9165gb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f45055f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m42944E(r6)
            long r6 = (long) r6
            f45056g = r6
            m42944E(r5)
            m42945a(r5)
            m42944E(r4)
            m42945a(r4)
            m42944E(r3)
            m42945a(r3)
            m42944E(r2)
            m42945a(r2)
            m42944E(r1)
            m42945a(r1)
            m42944E(r0)
            m42945a(r0)
            java.lang.reflect.Field r0 = m42946b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.measurement.fb r1 = f45053d
            if (r1 == 0) goto L_0x0129
            r1.mo37572l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f45057h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9165gb.<clinit>():void");
    }

    private C9165gb() {
    }

    /* renamed from: A */
    static boolean m42940A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C9115d7.f44952a;
        try {
            Class cls3 = f45051b;
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

    /* renamed from: B */
    static boolean m42941B(Object obj, long j) {
        return f45053d.mo37514g(obj, j);
    }

    /* renamed from: C */
    static boolean m42942C() {
        return f45055f;
    }

    /* renamed from: D */
    static boolean m42943D() {
        return f45054e;
    }

    /* renamed from: E */
    private static int m42944E(Class cls) {
        if (f45055f) {
            return f45053d.mo37568h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m42945a(Class cls) {
        if (f45055f) {
            return f45053d.mo37569i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m42946b() {
        int i = C9115d7.f44952a;
        Field c = m42947c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m42947c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m42947c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m42948d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C9150fb fbVar = f45053d;
        int i = ((((int) j) ^ -1) & 3) << 3;
        fbVar.mo37574n(obj, j2, ((255 & b) << i) | (fbVar.mo37570j(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m42949e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C9150fb fbVar = f45053d;
        int i = (((int) j) & 3) << 3;
        fbVar.mo37574n(obj, j2, ((255 & b) << i) | (fbVar.mo37570j(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: f */
    static double m42950f(Object obj, long j) {
        return f45053d.mo37508a(obj, j);
    }

    /* renamed from: g */
    static float m42951g(Object obj, long j) {
        return f45053d.mo37509b(obj, j);
    }

    /* renamed from: h */
    static int m42952h(Object obj, long j) {
        return f45053d.mo37570j(obj, j);
    }

    /* renamed from: i */
    static long m42953i(Object obj, long j) {
        return f45053d.mo37571k(obj, j);
    }

    /* renamed from: j */
    static Object m42954j(Class cls) {
        try {
            return f45050a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m42955k(Object obj, long j) {
        return f45053d.mo37573m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m42956l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C9103cb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m42962r(Object obj, long j, boolean z) {
        f45053d.mo37510c(obj, j, z);
    }

    /* renamed from: s */
    static void m42963s(byte[] bArr, long j, byte b) {
        f45053d.mo37511d(bArr, f45056g + j, b);
    }

    /* renamed from: t */
    static void m42964t(Object obj, long j, double d) {
        f45053d.mo37512e(obj, j, d);
    }

    /* renamed from: u */
    static void m42965u(Object obj, long j, float f) {
        f45053d.mo37513f(obj, j, f);
    }

    /* renamed from: v */
    static void m42966v(Object obj, long j, int i) {
        f45053d.mo37574n(obj, j, i);
    }

    /* renamed from: w */
    static void m42967w(Object obj, long j, long j2) {
        f45053d.mo37575o(obj, j, j2);
    }

    /* renamed from: x */
    static void m42968x(Object obj, long j, Object obj2) {
        f45053d.mo37576p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* synthetic */ boolean m42969y(Object obj, long j) {
        return ((byte) ((f45053d.mo37570j(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* synthetic */ boolean m42970z(Object obj, long j) {
        return ((byte) ((f45053d.mo37570j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
