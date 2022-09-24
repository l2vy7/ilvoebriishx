package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.b4 */
final class C8859b4 {

    /* renamed from: a */
    private static final Logger f44402a = Logger.getLogger(C8859b4.class.getName());

    /* renamed from: b */
    private static final Unsafe f44403b;

    /* renamed from: c */
    private static final Class<?> f44404c = C9007u.m42370c();

    /* renamed from: d */
    private static final boolean f44405d;

    /* renamed from: e */
    private static final boolean f44406e;

    /* renamed from: f */
    private static final C8863d f44407f;

    /* renamed from: g */
    private static final boolean f44408g = m41541B();

    /* renamed from: h */
    private static final boolean f44409h = m41540A();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f44410i = ((long) m41544E(byte[].class));

    /* renamed from: j */
    private static final long f44411j;

    /* renamed from: k */
    private static final long f44412k;

    /* renamed from: l */
    private static final long f44413l;

    /* renamed from: m */
    private static final long f44414m;

    /* renamed from: n */
    private static final long f44415n;

    /* renamed from: o */
    private static final long f44416o;

    /* renamed from: p */
    private static final long f44417p;

    /* renamed from: q */
    private static final long f44418q;

    /* renamed from: r */
    private static final long f44419r;

    /* renamed from: s */
    private static final long f44420s;

    /* renamed from: t */
    private static final long f44421t;

    /* renamed from: u */
    private static final long f44422u;

    /* renamed from: v */
    private static final long f44423v = m41574n(m41542C());

    /* renamed from: w */
    private static final long f44424w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final boolean f44425x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.clearcut.b4$a */
    static final class C8860a extends C8863d {
        C8860a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo36840b(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: c */
        public final void mo36841c(Object obj, long j, double d) {
            mo36852f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo36842d(Object obj, long j, float f) {
            mo36851e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo36843g(Object obj, long j, boolean z) {
            if (C8859b4.f44425x) {
                C8859b4.m41578r(obj, j, z);
            } else {
                C8859b4.m41580t(obj, j, z);
            }
        }

        /* renamed from: h */
        public final void mo36844h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        /* renamed from: i */
        public final void mo36845i(Object obj, long j, byte b) {
            if (C8859b4.f44425x) {
                C8859b4.m41564d(obj, j, b);
            } else {
                C8859b4.m41577q(obj, j, b);
            }
        }

        /* renamed from: l */
        public final boolean mo36846l(Object obj, long j) {
            return C8859b4.f44425x ? C8859b4.m41555P(obj, j) : C8859b4.m41556Q(obj, j);
        }

        /* renamed from: m */
        public final float mo36847m(Object obj, long j) {
            return Float.intBitsToFloat(mo36853j(obj, j));
        }

        /* renamed from: n */
        public final double mo36848n(Object obj, long j) {
            return Double.longBitsToDouble(mo36854k(obj, j));
        }

        /* renamed from: o */
        public final byte mo36849o(Object obj, long j) {
            return C8859b4.f44425x ? C8859b4.m41553N(obj, j) : C8859b4.m41554O(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b4$b */
    static final class C8861b extends C8863d {
        C8861b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo36840b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: c */
        public final void mo36841c(Object obj, long j, double d) {
            mo36852f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo36842d(Object obj, long j, float f) {
            mo36851e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo36843g(Object obj, long j, boolean z) {
            if (C8859b4.f44425x) {
                C8859b4.m41578r(obj, j, z);
            } else {
                C8859b4.m41580t(obj, j, z);
            }
        }

        /* renamed from: h */
        public final void mo36844h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        /* renamed from: i */
        public final void mo36845i(Object obj, long j, byte b) {
            if (C8859b4.f44425x) {
                C8859b4.m41564d(obj, j, b);
            } else {
                C8859b4.m41577q(obj, j, b);
            }
        }

        /* renamed from: l */
        public final boolean mo36846l(Object obj, long j) {
            return C8859b4.f44425x ? C8859b4.m41555P(obj, j) : C8859b4.m41556Q(obj, j);
        }

        /* renamed from: m */
        public final float mo36847m(Object obj, long j) {
            return Float.intBitsToFloat(mo36853j(obj, j));
        }

        /* renamed from: n */
        public final double mo36848n(Object obj, long j) {
            return Double.longBitsToDouble(mo36854k(obj, j));
        }

        /* renamed from: o */
        public final byte mo36849o(Object obj, long j) {
            return C8859b4.f44425x ? C8859b4.m41553N(obj, j) : C8859b4.m41554O(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b4$c */
    static final class C8862c extends C8863d {
        C8862c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: b */
        public final void mo36840b(long j, byte b) {
            this.f44426a.putByte(j, b);
        }

        /* renamed from: c */
        public final void mo36841c(Object obj, long j, double d) {
            this.f44426a.putDouble(obj, j, d);
        }

        /* renamed from: d */
        public final void mo36842d(Object obj, long j, float f) {
            this.f44426a.putFloat(obj, j, f);
        }

        /* renamed from: g */
        public final void mo36843g(Object obj, long j, boolean z) {
            this.f44426a.putBoolean(obj, j, z);
        }

        /* renamed from: h */
        public final void mo36844h(byte[] bArr, long j, long j2, long j3) {
            this.f44426a.copyMemory(bArr, C8859b4.f44410i + j, (Object) null, j2, j3);
        }

        /* renamed from: i */
        public final void mo36845i(Object obj, long j, byte b) {
            this.f44426a.putByte(obj, j, b);
        }

        /* renamed from: l */
        public final boolean mo36846l(Object obj, long j) {
            return this.f44426a.getBoolean(obj, j);
        }

        /* renamed from: m */
        public final float mo36847m(Object obj, long j) {
            return this.f44426a.getFloat(obj, j);
        }

        /* renamed from: n */
        public final double mo36848n(Object obj, long j) {
            return this.f44426a.getDouble(obj, j);
        }

        /* renamed from: o */
        public final byte mo36849o(Object obj, long j) {
            return this.f44426a.getByte(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.b4$d */
    static abstract class C8863d {

        /* renamed from: a */
        Unsafe f44426a;

        C8863d(Unsafe unsafe) {
            this.f44426a = unsafe;
        }

        /* renamed from: a */
        public final long mo36850a(Field field) {
            return this.f44426a.objectFieldOffset(field);
        }

        /* renamed from: b */
        public abstract void mo36840b(long j, byte b);

        /* renamed from: c */
        public abstract void mo36841c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo36842d(Object obj, long j, float f);

        /* renamed from: e */
        public final void mo36851e(Object obj, long j, int i) {
            this.f44426a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void mo36852f(Object obj, long j, long j2) {
            this.f44426a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo36843g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract void mo36844h(byte[] bArr, long j, long j2, long j3);

        /* renamed from: i */
        public abstract void mo36845i(Object obj, long j, byte b);

        /* renamed from: j */
        public final int mo36853j(Object obj, long j) {
            return this.f44426a.getInt(obj, j);
        }

        /* renamed from: k */
        public final long mo36854k(Object obj, long j) {
            return this.f44426a.getLong(obj, j);
        }

        /* renamed from: l */
        public abstract boolean mo36846l(Object obj, long j);

        /* renamed from: m */
        public abstract float mo36847m(Object obj, long j);

        /* renamed from: n */
        public abstract double mo36848n(Object obj, long j);

        /* renamed from: o */
        public abstract byte mo36849o(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.clearcut.b4> r6 = com.google.android.gms.internal.clearcut.C8859b4.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f44402a = r6
            sun.misc.Unsafe r6 = m41586z()
            f44403b = r6
            java.lang.Class r7 = com.google.android.gms.internal.clearcut.C9007u.m42370c()
            f44404c = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = m41546G(r7)
            f44405d = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = m41546G(r8)
            f44406e = r8
            r9 = 0
            if (r6 != 0) goto L_0x0039
        L_0x0037:
            r7 = r9
            goto L_0x0054
        L_0x0039:
            boolean r10 = com.google.android.gms.internal.clearcut.C9007u.m42369b()
            if (r10 == 0) goto L_0x004f
            if (r7 == 0) goto L_0x0047
            com.google.android.gms.internal.clearcut.b4$b r7 = new com.google.android.gms.internal.clearcut.b4$b
            r7.<init>(r6)
            goto L_0x0054
        L_0x0047:
            if (r8 == 0) goto L_0x0037
            com.google.android.gms.internal.clearcut.b4$a r7 = new com.google.android.gms.internal.clearcut.b4$a
            r7.<init>(r6)
            goto L_0x0054
        L_0x004f:
            com.google.android.gms.internal.clearcut.b4$c r7 = new com.google.android.gms.internal.clearcut.b4$c
            r7.<init>(r6)
        L_0x0054:
            f44407f = r7
            boolean r6 = m41541B()
            f44408g = r6
            boolean r6 = m41540A()
            f44409h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m41544E(r6)
            long r6 = (long) r6
            f44410i = r6
            int r6 = m41544E(r5)
            long r6 = (long) r6
            f44411j = r6
            int r5 = m41545F(r5)
            long r5 = (long) r5
            f44412k = r5
            int r5 = m41544E(r4)
            long r5 = (long) r5
            f44413l = r5
            int r4 = m41545F(r4)
            long r4 = (long) r4
            f44414m = r4
            int r4 = m41544E(r3)
            long r4 = (long) r4
            f44415n = r4
            int r3 = m41545F(r3)
            long r3 = (long) r3
            f44416o = r3
            int r3 = m41544E(r2)
            long r3 = (long) r3
            f44417p = r3
            int r2 = m41545F(r2)
            long r2 = (long) r2
            f44418q = r2
            int r2 = m41544E(r1)
            long r2 = (long) r2
            f44419r = r2
            int r1 = m41545F(r1)
            long r1 = (long) r1
            f44420s = r1
            int r1 = m41544E(r0)
            long r1 = (long) r1
            f44421t = r1
            int r0 = m41545F(r0)
            long r0 = (long) r0
            f44422u = r0
            java.lang.reflect.Field r0 = m41542C()
            long r0 = m41574n(r0)
            f44423v = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = m41576p(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00dc
            r9 = r0
        L_0x00dc:
            long r0 = m41574n(r9)
            f44424w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            f44425x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8859b4.<clinit>():void");
    }

    private C8859b4() {
    }

    /* renamed from: A */
    private static boolean m41540A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f44403b;
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
            if (C9007u.m42369b()) {
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
            Logger logger = f44402a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    private static boolean m41541B() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f44403b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m41542C() == null) {
                return false;
            }
            if (C9007u.m42369b()) {
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
            Logger logger = f44402a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: C */
    private static Field m41542C() {
        Field p;
        if (C9007u.m42369b() && (p = m41576p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m41576p(Buffer.class, "address");
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: E */
    private static int m41544E(Class<?> cls) {
        if (f44409h) {
            return f44407f.f44426a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: F */
    private static int m41545F(Class<?> cls) {
        if (f44409h) {
            return f44407f.f44426a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: G */
    private static boolean m41546G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C9007u.m42369b()) {
            return false;
        }
        try {
            Class<?> cls3 = f44404c;
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
    static int m41547H(Object obj, long j) {
        return f44407f.mo36853j(obj, j);
    }

    /* renamed from: I */
    static long m41548I(Object obj, long j) {
        return f44407f.mo36854k(obj, j);
    }

    /* renamed from: J */
    static boolean m41549J(Object obj, long j) {
        return f44407f.mo36846l(obj, j);
    }

    /* renamed from: K */
    static float m41550K(Object obj, long j) {
        return f44407f.mo36847m(obj, j);
    }

    /* renamed from: L */
    static double m41551L(Object obj, long j) {
        return f44407f.mo36848n(obj, j);
    }

    /* renamed from: M */
    static Object m41552M(Object obj, long j) {
        return f44407f.f44426a.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static byte m41553N(Object obj, long j) {
        return (byte) (m41547H(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static byte m41554O(Object obj, long j) {
        return (byte) (m41547H(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static boolean m41555P(Object obj, long j) {
        return m41553N(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static boolean m41556Q(Object obj, long j) {
        return m41554O(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m41561a(byte[] bArr, long j) {
        return f44407f.mo36849o(bArr, f44410i + j);
    }

    /* renamed from: b */
    static long m41562b(Field field) {
        return f44407f.mo36850a(field);
    }

    /* renamed from: c */
    static void m41563c(long j, byte b) {
        f44407f.mo36840b(j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m41564d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m41567g(obj, j2, ((255 & b) << i) | (m41547H(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: e */
    static void m41565e(Object obj, long j, double d) {
        f44407f.mo36841c(obj, j, d);
    }

    /* renamed from: f */
    static void m41566f(Object obj, long j, float f) {
        f44407f.mo36842d(obj, j, f);
    }

    /* renamed from: g */
    static void m41567g(Object obj, long j, int i) {
        f44407f.mo36851e(obj, j, i);
    }

    /* renamed from: h */
    static void m41568h(Object obj, long j, long j2) {
        f44407f.mo36852f(obj, j, j2);
    }

    /* renamed from: i */
    static void m41569i(Object obj, long j, Object obj2) {
        f44407f.f44426a.putObject(obj, j, obj2);
    }

    /* renamed from: j */
    static void m41570j(Object obj, long j, boolean z) {
        f44407f.mo36843g(obj, j, z);
    }

    /* renamed from: k */
    static void m41571k(byte[] bArr, long j, byte b) {
        f44407f.mo36845i(bArr, f44410i + j, b);
    }

    /* renamed from: l */
    static void m41572l(byte[] bArr, long j, long j2, long j3) {
        f44407f.mo36844h(bArr, j, j2, j3);
    }

    /* renamed from: n */
    private static long m41574n(Field field) {
        C8863d dVar;
        if (field == null || (dVar = f44407f) == null) {
            return -1;
        }
        return dVar.mo36850a(field);
    }

    /* renamed from: o */
    static long m41575o(ByteBuffer byteBuffer) {
        return f44407f.mo36854k(byteBuffer, f44423v);
    }

    /* renamed from: p */
    private static Field m41576p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m41577q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m41567g(obj, j2, ((255 & b) << i) | (m41547H(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m41578r(Object obj, long j, boolean z) {
        m41564d(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static void m41580t(Object obj, long j, boolean z) {
        m41577q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: x */
    static boolean m41584x() {
        return f44409h;
    }

    /* renamed from: y */
    static boolean m41585y() {
        return f44408g;
    }

    /* renamed from: z */
    static Unsafe m41586z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8871c4());
        } catch (Throwable unused) {
            return null;
        }
    }
}
