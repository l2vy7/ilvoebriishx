package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.vision.j4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9546j4<T> implements C9664w4<T> {

    /* renamed from: r */
    private static final int[] f45680r = new int[0];

    /* renamed from: s */
    private static final Unsafe f45681s = C9652v5.m44701w();

    /* renamed from: a */
    private final int[] f45682a;

    /* renamed from: b */
    private final Object[] f45683b;

    /* renamed from: c */
    private final int f45684c;

    /* renamed from: d */
    private final int f45685d;

    /* renamed from: e */
    private final C9522g4 f45686e;

    /* renamed from: f */
    private final boolean f45687f;

    /* renamed from: g */
    private final boolean f45688g;

    /* renamed from: h */
    private final boolean f45689h;

    /* renamed from: i */
    private final boolean f45690i;

    /* renamed from: j */
    private final int[] f45691j;

    /* renamed from: k */
    private final int f45692k;

    /* renamed from: l */
    private final int f45693l;

    /* renamed from: m */
    private final C9579n4 f45694m;

    /* renamed from: n */
    private final C9594p3 f45695n;

    /* renamed from: o */
    private final C9588o5<?, ?> f45696o;

    /* renamed from: p */
    private final C9528h2<?> f45697p;

    /* renamed from: q */
    private final C9690z3 f45698q;

    private C9546j4(int[] iArr, Object[] objArr, int i, int i2, C9522g4 g4Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C9579n4 n4Var, C9594p3 p3Var, C9588o5<?, ?> o5Var, C9528h2<?> h2Var, C9690z3 z3Var) {
        this.f45682a = iArr;
        this.f45683b = objArr;
        this.f45684c = i;
        this.f45685d = i2;
        this.f45688g = g4Var instanceof C9643v2;
        this.f45689h = z;
        this.f45687f = h2Var != null && h2Var.mo38416d(g4Var);
        this.f45690i = false;
        this.f45691j = iArr2;
        this.f45692k = i3;
        this.f45693l = i4;
        this.f45694m = n4Var;
        this.f45695n = p3Var;
        this.f45696o = o5Var;
        this.f45697p = h2Var;
        this.f45686e = g4Var;
        this.f45698q = z3Var;
    }

    /* renamed from: A */
    private final boolean m44351A(T t, int i, int i2) {
        return C9652v5.m44664A(t, (long) (m44356F(i2) & 1048575)) == i;
    }

    /* renamed from: B */
    private final C9664w4 m44352B(int i) {
        int i2 = (i / 3) << 1;
        C9664w4 w4Var = (C9664w4) this.f45683b[i2];
        if (w4Var != null) {
            return w4Var;
        }
        C9664w4 a = C9628t4.m44591b().mo38580a((Class) this.f45683b[i2 + 1]);
        this.f45683b[i2] = a;
        return a;
    }

    /* renamed from: C */
    private final Object m44353C(int i) {
        return this.f45683b[(i / 3) << 1];
    }

    /* renamed from: D */
    private final C9474b3 m44354D(int i) {
        return (C9474b3) this.f45683b[((i / 3) << 1) + 1];
    }

    /* renamed from: E */
    private final int m44355E(int i) {
        return this.f45682a[i + 1];
    }

    /* renamed from: F */
    private final int m44356F(int i) {
        return this.f45682a[i + 2];
    }

    /* renamed from: G */
    private final void m44357G(T t, int i, int i2) {
        C9652v5.m44689k(t, (long) (m44356F(i2) & 1048575), i);
    }

    /* renamed from: H */
    private final boolean m44358H(T t, int i) {
        int F = m44356F(i);
        long j = (long) (F & 1048575);
        if (j == 1048575) {
            int E = m44355E(i);
            long j2 = (long) (E & 1048575);
            switch ((E & 267386880) >>> 20) {
                case 0:
                    return C9652v5.m44669F(t, j2) != 0.0d;
                case 1:
                    return C9652v5.m44668E(t, j2) != 0.0f;
                case 2:
                    return C9652v5.m44666C(t, j2) != 0;
                case 3:
                    return C9652v5.m44666C(t, j2) != 0;
                case 4:
                    return C9652v5.m44664A(t, j2) != 0;
                case 5:
                    return C9652v5.m44666C(t, j2) != 0;
                case 6:
                    return C9652v5.m44664A(t, j2) != 0;
                case 7:
                    return C9652v5.m44667D(t, j2);
                case 8:
                    Object G = C9652v5.m44670G(t, j2);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof C9552k1) {
                        return !C9552k1.f45714c.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C9652v5.m44670G(t, j2) != null;
                case 10:
                    return !C9552k1.f45714c.equals(C9652v5.m44670G(t, j2));
                case 11:
                    return C9652v5.m44664A(t, j2) != 0;
                case 12:
                    return C9652v5.m44664A(t, j2) != 0;
                case 13:
                    return C9652v5.m44664A(t, j2) != 0;
                case 14:
                    return C9652v5.m44666C(t, j2) != 0;
                case 15:
                    return C9652v5.m44664A(t, j2) != 0;
                case 16:
                    return C9652v5.m44666C(t, j2) != 0;
                case 17:
                    return C9652v5.m44670G(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C9652v5.m44664A(t, j) & (1 << (F >>> 20))) != 0;
        }
    }

    /* renamed from: I */
    private final boolean m44359I(T t, T t2, int i) {
        return m44358H(t, i) == m44358H(t2, i);
    }

    /* renamed from: J */
    private final int m44360J(int i) {
        if (i < this.f45684c || i > this.f45685d) {
            return -1;
        }
        return m44370T(i, 0);
    }

    /* renamed from: K */
    private final void m44361K(T t, int i) {
        int F = m44356F(i);
        long j = (long) (1048575 & F);
        if (j != 1048575) {
            C9652v5.m44689k(t, j, (1 << (F >>> 20)) | C9652v5.m44664A(t, j));
        }
    }

    /* renamed from: L */
    private static List<?> m44362L(Object obj, long j) {
        return (List) C9652v5.m44670G(obj, j);
    }

    /* renamed from: M */
    private static <T> double m44363M(T t, long j) {
        return ((Double) C9652v5.m44670G(t, j)).doubleValue();
    }

    /* renamed from: N */
    private static <T> float m44364N(T t, long j) {
        return ((Float) C9652v5.m44670G(t, j)).floatValue();
    }

    /* renamed from: O */
    private static <T> int m44365O(T t, long j) {
        return ((Integer) C9652v5.m44670G(t, j)).intValue();
    }

    /* renamed from: P */
    private static <T> long m44366P(T t, long j) {
        return ((Long) C9652v5.m44670G(t, j)).longValue();
    }

    /* renamed from: Q */
    private static <T> boolean m44367Q(T t, long j) {
        return ((Boolean) C9652v5.m44670G(t, j)).booleanValue();
    }

    /* renamed from: R */
    private final int m44368R(int i, int i2) {
        if (i < this.f45684c || i > this.f45685d) {
            return -1;
        }
        return m44370T(i, i2);
    }

    /* renamed from: S */
    private static C9580n5 m44369S(Object obj) {
        C9643v2 v2Var = (C9643v2) obj;
        C9580n5 n5Var = v2Var.zzxz;
        if (n5Var != C9580n5.m44487i()) {
            return n5Var;
        }
        C9580n5 j = C9580n5.m44488j();
        v2Var.zzxz = j;
        return j;
    }

    /* renamed from: T */
    private final int m44370T(int i, int i2) {
        int length = (this.f45682a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f45682a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static <UT, UB> int m44371j(C9588o5<UT, UB> o5Var, T t) {
        return o5Var.mo38538k(o5Var.mo38539l(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m44372k(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.C9527h1 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f45681s
            int[] r7 = r0.f45682a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.vision.w4 r2 = r0.m44352B(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44240f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f45655c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f45655c
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9662w2.m44752f(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r11)
            long r3 = r11.f45654b
            long r3 = com.google.android.gms.internal.vision.C9672x1.m44796e(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r11)
            int r3 = r11.f45653a
            int r3 = com.google.android.gms.internal.vision.C9672x1.m44795c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r11)
            int r4 = r11.f45653a
            com.google.android.gms.internal.vision.b3 r5 = r0.m44354D(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo38239k(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.vision.n5 r1 = m44369S(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo38515d(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44251q(r3, r4, r11)
            java.lang.Object r3 = r11.f45655c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.vision.w4 r2 = r0.m44352B(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44241g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f45655c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f45655c
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9662w2.m44752f(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r11)
            int r4 = r11.f45653a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.C9676x5.m44827f(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44260f()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.vision.C9662w2.f45956a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r11)
            long r3 = r11.f45654b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44242h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.vision.C9510f1.m44246l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r11)
            int r3 = r11.f45653a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r11)
            long r3 = r11.f45654b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.vision.C9510f1.m44249o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.vision.C9510f1.m44247m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.m44372k(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.h1):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0420 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e8  */
    /* renamed from: l */
    private final int m44373l(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.vision.C9527h1 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f45681s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.vision.c3 r12 = (com.google.android.gms.internal.vision.C9485c3) r12
            boolean r13 = r12.mo38298C()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.vision.c3 r12 = r12.mo38300w(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x03a3;
                case 20: goto L_0x0362;
                case 21: goto L_0x0362;
                case 22: goto L_0x0348;
                case 23: goto L_0x0309;
                case 24: goto L_0x02ca;
                case 25: goto L_0x0273;
                case 26: goto L_0x01c0;
                case 27: goto L_0x01a6;
                case 28: goto L_0x014e;
                case 29: goto L_0x0348;
                case 30: goto L_0x0116;
                case 31: goto L_0x02ca;
                case 32: goto L_0x0309;
                case 33: goto L_0x00c9;
                case 34: goto L_0x007c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x03a3;
                case 37: goto L_0x0362;
                case 38: goto L_0x0362;
                case 39: goto L_0x0348;
                case 40: goto L_0x0309;
                case 41: goto L_0x02ca;
                case 42: goto L_0x0273;
                case 43: goto L_0x0348;
                case 44: goto L_0x0116;
                case 45: goto L_0x02ca;
                case 46: goto L_0x0309;
                case 47: goto L_0x00c9;
                case 48: goto L_0x007c;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x041f
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x041f
            com.google.android.gms.internal.vision.w4 r1 = r15.m44352B(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44240f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45655c
            r12.add(r8)
        L_0x005c:
            if (r4 >= r5) goto L_0x041f
            int r8 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r9 = r7.f45653a
            if (r2 != r9) goto L_0x041f
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44240f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45655c
            r12.add(r8)
            goto L_0x005c
        L_0x007c:
            if (r6 != r13) goto L_0x00a0
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x0087:
            if (r1 >= r2) goto L_0x0097
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r1, r7)
            long r4 = r7.f45654b
            long r4 = com.google.android.gms.internal.vision.C9672x1.m44796e(r4)
            r12.mo38595g(r4)
            goto L_0x0087
        L_0x0097:
            if (r1 != r2) goto L_0x009b
            goto L_0x0420
        L_0x009b:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x00a0:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r7)
            long r8 = r7.f45654b
            long r8 = com.google.android.gms.internal.vision.C9672x1.m44796e(r8)
            r12.mo38595g(r8)
        L_0x00b1:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r7)
            long r8 = r7.f45654b
            long r8 = com.google.android.gms.internal.vision.C9672x1.m44796e(r8)
            r12.mo38595g(r8)
            goto L_0x00b1
        L_0x00c9:
            if (r6 != r13) goto L_0x00ed
            com.google.android.gms.internal.vision.x2 r12 = (com.google.android.gms.internal.vision.C9673x2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x00d4:
            if (r1 >= r2) goto L_0x00e4
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r4 = r7.f45653a
            int r4 = com.google.android.gms.internal.vision.C9672x1.m44795c(r4)
            r12.mo38643j(r4)
            goto L_0x00d4
        L_0x00e4:
            if (r1 != r2) goto L_0x00e8
            goto L_0x0420
        L_0x00e8:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x00ed:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.vision.x2 r12 = (com.google.android.gms.internal.vision.C9673x2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r4 = r7.f45653a
            int r4 = com.google.android.gms.internal.vision.C9672x1.m44795c(r4)
            r12.mo38643j(r4)
        L_0x00fe:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r4 = r7.f45653a
            int r4 = com.google.android.gms.internal.vision.C9672x1.m44795c(r4)
            r12.mo38643j(r4)
            goto L_0x00fe
        L_0x0116:
            if (r6 != r13) goto L_0x011d
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44244j(r3, r4, r12, r7)
            goto L_0x012e
        L_0x011d:
            if (r6 != 0) goto L_0x041f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44236b(r2, r3, r4, r5, r6, r7)
        L_0x012e:
            com.google.android.gms.internal.vision.v2 r1 = (com.google.android.gms.internal.vision.C9643v2) r1
            com.google.android.gms.internal.vision.n5 r3 = r1.zzxz
            com.google.android.gms.internal.vision.n5 r4 = com.google.android.gms.internal.vision.C9580n5.m44487i()
            if (r3 != r4) goto L_0x0139
            r3 = 0
        L_0x0139:
            com.google.android.gms.internal.vision.b3 r4 = r15.m44354D(r8)
            com.google.android.gms.internal.vision.o5<?, ?> r5 = r0.f45696o
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9683y4.m44871b(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.vision.n5 r3 = (com.google.android.gms.internal.vision.C9580n5) r3
            if (r3 == 0) goto L_0x014b
            r1.zzxz = r3
        L_0x014b:
            r1 = r2
            goto L_0x0420
        L_0x014e:
            if (r6 != r13) goto L_0x041f
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r4 = r7.f45653a
            if (r4 < 0) goto L_0x01a1
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019c
            if (r4 != 0) goto L_0x0164
            com.google.android.gms.internal.vision.k1 r4 = com.google.android.gms.internal.vision.C9552k1.f45714c
            r12.add(r4)
            goto L_0x016c
        L_0x0164:
            com.google.android.gms.internal.vision.k1 r6 = com.google.android.gms.internal.vision.C9552k1.m44403b(r3, r1, r4)
            r12.add(r6)
        L_0x016b:
            int r1 = r1 + r4
        L_0x016c:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r4 = r7.f45653a
            if (r4 < 0) goto L_0x0197
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0192
            if (r4 != 0) goto L_0x018a
            com.google.android.gms.internal.vision.k1 r4 = com.google.android.gms.internal.vision.C9552k1.f45714c
            r12.add(r4)
            goto L_0x016c
        L_0x018a:
            com.google.android.gms.internal.vision.k1 r6 = com.google.android.gms.internal.vision.C9552k1.m44403b(r3, r1, r4)
            r12.add(r6)
            goto L_0x016b
        L_0x0192:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x0197:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x019c:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x01a1:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x01a6:
            if (r6 != r13) goto L_0x041f
            com.google.android.gms.internal.vision.w4 r1 = r15.m44352B(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44239e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0420
        L_0x01c0:
            if (r6 != r13) goto L_0x041f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0213
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r6 = r7.f45653a
            if (r6 < 0) goto L_0x020e
            if (r6 != 0) goto L_0x01db
            r12.add(r1)
            goto L_0x01e6
        L_0x01db:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.C9662w2.f45956a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01e5:
            int r4 = r4 + r6
        L_0x01e6:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r8 = r7.f45653a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r6, r7)
            int r6 = r7.f45653a
            if (r6 < 0) goto L_0x0209
            if (r6 != 0) goto L_0x01fe
            r12.add(r1)
            goto L_0x01e6
        L_0x01fe:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.C9662w2.f45956a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01e5
        L_0x0209:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x020e:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x0213:
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r6 = r7.f45653a
            if (r6 < 0) goto L_0x026e
            if (r6 != 0) goto L_0x0221
            r12.add(r1)
            goto L_0x0234
        L_0x0221:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.vision.C9676x5.m44827f(r3, r4, r8)
            if (r9 == 0) goto L_0x0269
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.C9662w2.f45956a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0233:
            r4 = r8
        L_0x0234:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r8 = r7.f45653a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r6, r7)
            int r6 = r7.f45653a
            if (r6 < 0) goto L_0x0264
            if (r6 != 0) goto L_0x024c
            r12.add(r1)
            goto L_0x0234
        L_0x024c:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.vision.C9676x5.m44827f(r3, r4, r8)
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.C9662w2.f45956a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0233
        L_0x025f:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44260f()
            throw r1
        L_0x0264:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x0269:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44260f()
            throw r1
        L_0x026e:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44256b()
            throw r1
        L_0x0273:
            r1 = 0
            if (r6 != r13) goto L_0x029b
            com.google.android.gms.internal.vision.j1 r12 = (com.google.android.gms.internal.vision.C9543j1) r12
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r4 = r7.f45653a
            int r4 = r4 + r2
        L_0x027f:
            if (r2 >= r4) goto L_0x0292
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r2, r7)
            long r5 = r7.f45654b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x028d
            r5 = 1
            goto L_0x028e
        L_0x028d:
            r5 = 0
        L_0x028e:
            r12.mo38435e(r5)
            goto L_0x027f
        L_0x0292:
            if (r2 != r4) goto L_0x0296
            goto L_0x014b
        L_0x0296:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x029b:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.vision.j1 r12 = (com.google.android.gms.internal.vision.C9543j1) r12
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r7)
            long r8 = r7.f45654b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ab
            r6 = 1
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            r12.mo38435e(r6)
        L_0x02af:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r8 = r7.f45653a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r6, r7)
            long r8 = r7.f45654b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02c5
            r6 = 1
            goto L_0x02c6
        L_0x02c5:
            r6 = 0
        L_0x02c6:
            r12.mo38435e(r6)
            goto L_0x02af
        L_0x02ca:
            if (r6 != r13) goto L_0x02ea
            com.google.android.gms.internal.vision.x2 r12 = (com.google.android.gms.internal.vision.C9673x2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44242h(r3, r1)
            r12.mo38643j(r4)
            int r1 = r1 + 4
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x0420
        L_0x02e5:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x02ea:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.vision.x2 r12 = (com.google.android.gms.internal.vision.C9673x2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44242h(r17, r18)
            r12.mo38643j(r1)
        L_0x02f5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44242h(r3, r4)
            r12.mo38643j(r1)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r13) goto L_0x0329
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x0314:
            if (r1 >= r2) goto L_0x0320
            long r4 = com.google.android.gms.internal.vision.C9510f1.m44246l(r3, r1)
            r12.mo38595g(r4)
            int r1 = r1 + 8
            goto L_0x0314
        L_0x0320:
            if (r1 != r2) goto L_0x0324
            goto L_0x0420
        L_0x0324:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x0329:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            long r8 = com.google.android.gms.internal.vision.C9510f1.m44246l(r17, r18)
            r12.mo38595g(r8)
        L_0x0334:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            long r8 = com.google.android.gms.internal.vision.C9510f1.m44246l(r3, r4)
            r12.mo38595g(r8)
            goto L_0x0334
        L_0x0348:
            if (r6 != r13) goto L_0x0350
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44244j(r3, r4, r12, r7)
            goto L_0x0420
        L_0x0350:
            if (r6 != 0) goto L_0x041f
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44236b(r20, r21, r22, r23, r24, r25)
            goto L_0x0420
        L_0x0362:
            if (r6 != r13) goto L_0x0382
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x036d:
            if (r1 >= r2) goto L_0x0379
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r1, r7)
            long r4 = r7.f45654b
            r12.mo38595g(r4)
            goto L_0x036d
        L_0x0379:
            if (r1 != r2) goto L_0x037d
            goto L_0x0420
        L_0x037d:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x0382:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.vision.u3 r12 = (com.google.android.gms.internal.vision.C9635u3) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r7)
            long r8 = r7.f45654b
            r12.mo38595g(r8)
        L_0x038f:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44245k(r3, r4, r7)
            long r8 = r7.f45654b
            r12.mo38595g(r8)
            goto L_0x038f
        L_0x03a3:
            if (r6 != r13) goto L_0x03c2
            com.google.android.gms.internal.vision.q2 r12 = (com.google.android.gms.internal.vision.C9601q2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x03ae:
            if (r1 >= r2) goto L_0x03ba
            float r4 = com.google.android.gms.internal.vision.C9510f1.m44249o(r3, r1)
            r12.mo38555i(r4)
            int r1 = r1 + 4
            goto L_0x03ae
        L_0x03ba:
            if (r1 != r2) goto L_0x03bd
            goto L_0x0420
        L_0x03bd:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x03c2:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.vision.q2 r12 = (com.google.android.gms.internal.vision.C9601q2) r12
            float r1 = com.google.android.gms.internal.vision.C9510f1.m44249o(r17, r18)
            r12.mo38555i(r1)
        L_0x03cd:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            float r1 = com.google.android.gms.internal.vision.C9510f1.m44249o(r3, r4)
            r12.mo38555i(r1)
            goto L_0x03cd
        L_0x03e1:
            if (r6 != r13) goto L_0x0400
            com.google.android.gms.internal.vision.d2 r12 = (com.google.android.gms.internal.vision.C9493d2) r12
            int r1 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r4, r7)
            int r2 = r7.f45653a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03f8
            double r4 = com.google.android.gms.internal.vision.C9510f1.m44247m(r3, r1)
            r12.mo38326i(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03f8:
            if (r1 != r2) goto L_0x03fb
            goto L_0x0420
        L_0x03fb:
            com.google.android.gms.internal.vision.f3 r1 = com.google.android.gms.internal.vision.C9513f3.m44255a()
            throw r1
        L_0x0400:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.vision.d2 r12 = (com.google.android.gms.internal.vision.C9493d2) r12
            double r8 = com.google.android.gms.internal.vision.C9510f1.m44247m(r17, r18)
            r12.mo38326i(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.vision.C9510f1.m44243i(r3, r1, r7)
            int r6 = r7.f45653a
            if (r2 != r6) goto L_0x0420
            double r8 = com.google.android.gms.internal.vision.C9510f1.m44247m(r3, r4)
            r12.mo38326i(r8)
            goto L_0x040b
        L_0x041f:
            r1 = r4
        L_0x0420:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.m44373l(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.h1):int");
    }

    /* renamed from: m */
    private final <K, V> int m44374m(T t, byte[] bArr, int i, int i2, int i3, long j, C9527h1 h1Var) throws IOException {
        Unsafe unsafe = f45681s;
        Object C = m44353C(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f45698q.mo38308h(object)) {
            Object f = this.f45698q.mo38306f(C);
            this.f45698q.mo38302b(f, object);
            unsafe.putObject(t, j, f);
            object = f;
        }
        this.f45698q.mo38303c(C);
        this.f45698q.mo38301a(object);
        int i4 = C9510f1.m44243i(bArr, i, h1Var);
        int i5 = h1Var.f45653a;
        if (i5 < 0 || i5 > i2 - i4) {
            throw C9513f3.m44255a();
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.vision.C9546j4<T> m44375o(java.lang.Class<T> r33, com.google.android.gms.internal.vision.C9504e4 r34, com.google.android.gms.internal.vision.C9579n4 r35, com.google.android.gms.internal.vision.C9594p3 r36, com.google.android.gms.internal.vision.C9588o5<?, ?> r37, com.google.android.gms.internal.vision.C9528h2<?> r38, com.google.android.gms.internal.vision.C9690z3 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C9636u4
            if (r1 == 0) goto L_0x040f
            com.google.android.gms.internal.vision.u4 r0 = (com.google.android.gms.internal.vision.C9636u4) r0
            int r1 = r0.mo38378a()
            int r2 = com.google.android.gms.internal.vision.C9603q4.f45839b
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.mo38602d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = f45680r
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = f45681s
            java.lang.Object[] r16 = r0.mo38603e()
            com.google.android.gms.internal.vision.g4 r17 = r0.mo38379b()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m44378r(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m44378r(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m44378r(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = m44378r(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            com.google.android.gms.internal.vision.j4 r2 = new com.google.android.gms.internal.vision.j4
            com.google.android.gms.internal.vision.g4 r10 = r0.mo38379b()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            com.google.android.gms.internal.vision.h5 r0 = (com.google.android.gms.internal.vision.C9531h5) r0
            r0.mo38378a()
            int r0 = com.google.android.gms.internal.vision.C9603q4.f45839b
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            goto L_0x041d
        L_0x041c:
            throw r0
        L_0x041d:
            goto L_0x041c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.m44375o(java.lang.Class, com.google.android.gms.internal.vision.e4, com.google.android.gms.internal.vision.n4, com.google.android.gms.internal.vision.p3, com.google.android.gms.internal.vision.o5, com.google.android.gms.internal.vision.h2, com.google.android.gms.internal.vision.z3):com.google.android.gms.internal.vision.j4");
    }

    /* renamed from: p */
    private final <K, V, UT, UB> UB m44376p(int i, int i2, Map<K, V> map, C9474b3 b3Var, UB ub, C9588o5<UT, UB> o5Var) {
        C9674x3<?, ?> c = this.f45698q.mo38303c(m44353C(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!b3Var.mo38239k(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o5Var.mo38537j();
                }
                C9625t1 i3 = C9552k1.m44404i(C9682y3.m44841a(c, next.getKey(), next.getValue()));
                try {
                    C9682y3.m44842b(i3.mo38578b(), c, next.getKey(), next.getValue());
                    o5Var.mo38529b(ub, i2, i3.mo38577a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: q */
    private final <UT, UB> UB m44377q(Object obj, int i, UB ub, C9588o5<UT, UB> o5Var) {
        C9474b3 D;
        int i2 = this.f45682a[i];
        Object G = C9652v5.m44670G(obj, (long) (m44355E(i) & 1048575));
        if (G == null || (D = m44354D(i)) == null) {
            return ub;
        }
        return m44376p(i, i2, this.f45698q.mo38301a(G), D, ub, o5Var);
    }

    /* renamed from: r */
    private static Field m44378r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: s */
    private static void m44379s(int i, Object obj, C9540i6 i6Var) throws IOException {
        if (obj instanceof String) {
            i6Var.mo38352b(i, (String) obj);
        } else {
            i6Var.mo38349M(i, (C9552k1) obj);
        }
    }

    /* renamed from: t */
    private static <UT, UB> void m44380t(C9588o5<UT, UB> o5Var, T t, C9540i6 i6Var) throws IOException {
        o5Var.mo38530c(o5Var.mo38539l(t), i6Var);
    }

    /* renamed from: u */
    private final <K, V> void m44381u(C9540i6 i6Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            i6Var.mo38344H(i, this.f45698q.mo38303c(m44353C(i2)), this.f45698q.mo38305e(obj));
        }
    }

    /* renamed from: v */
    private final void m44382v(T t, T t2, int i) {
        long E = (long) (m44355E(i) & 1048575);
        if (m44358H(t2, i)) {
            Object G = C9652v5.m44670G(t, E);
            Object G2 = C9652v5.m44670G(t2, E);
            if (G != null && G2 != null) {
                C9652v5.m44684f(t, E, C9662w2.m44752f(G, G2));
                m44361K(t, i);
            } else if (G2 != null) {
                C9652v5.m44684f(t, E, G2);
                m44361K(t, i);
            }
        }
    }

    /* renamed from: w */
    private final boolean m44383w(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m44358H(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: x */
    private static boolean m44384x(Object obj, int i, C9664w4 w4Var) {
        return w4Var.mo38445d(C9652v5.m44670G(obj, (long) (i & 1048575)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m44385y(T r18, com.google.android.gms.internal.vision.C9540i6 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f45687f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.vision.h2<?> r3 = r0.f45697p
            com.google.android.gms.internal.vision.k2 r3 = r3.mo38417e(r1)
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r5 = r3.f45719a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo38473d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f45682a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f45681s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x0493
            int r13 = r0.m44355E(r10)
            int[] r14 = r0.f45682a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            boolean r9 = r0.f45689h
            if (r9 != 0) goto L_0x005e
            r9 = 17
            if (r4 > r9) goto L_0x005e
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0058
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0058:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            if (r5 == 0) goto L_0x007d
            com.google.android.gms.internal.vision.h2<?> r9 = r0.f45697p
            int r9 = r9.mo38413a(r5)
            if (r9 > r15) goto L_0x007d
            com.google.android.gms.internal.vision.h2<?> r9 = r0.f45697p
            r9.mo38415c(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005f
        L_0x007b:
            r5 = 0
            goto L_0x005f
        L_0x007d:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x0484;
                case 1: goto L_0x0478;
                case 2: goto L_0x046c;
                case 3: goto L_0x0460;
                case 4: goto L_0x0454;
                case 5: goto L_0x0448;
                case 6: goto L_0x043c;
                case 7: goto L_0x0430;
                case 8: goto L_0x0424;
                case 9: goto L_0x0413;
                case 10: goto L_0x0404;
                case 11: goto L_0x03f7;
                case 12: goto L_0x03ea;
                case 13: goto L_0x03dd;
                case 14: goto L_0x03d0;
                case 15: goto L_0x03c3;
                case 16: goto L_0x03b6;
                case 17: goto L_0x03a5;
                case 18: goto L_0x0395;
                case 19: goto L_0x0385;
                case 20: goto L_0x0375;
                case 21: goto L_0x0365;
                case 22: goto L_0x0355;
                case 23: goto L_0x0345;
                case 24: goto L_0x0335;
                case 25: goto L_0x0325;
                case 26: goto L_0x0316;
                case 27: goto L_0x0303;
                case 28: goto L_0x02f4;
                case 29: goto L_0x02e4;
                case 30: goto L_0x02d4;
                case 31: goto L_0x02c4;
                case 32: goto L_0x02b4;
                case 33: goto L_0x02a4;
                case 34: goto L_0x0294;
                case 35: goto L_0x0284;
                case 36: goto L_0x0274;
                case 37: goto L_0x0264;
                case 38: goto L_0x0254;
                case 39: goto L_0x0244;
                case 40: goto L_0x0234;
                case 41: goto L_0x0224;
                case 42: goto L_0x0214;
                case 43: goto L_0x0204;
                case 44: goto L_0x01f4;
                case 45: goto L_0x01e4;
                case 46: goto L_0x01d4;
                case 47: goto L_0x01c4;
                case 48: goto L_0x01b4;
                case 49: goto L_0x01a1;
                case 50: goto L_0x0198;
                case 51: goto L_0x0189;
                case 52: goto L_0x017a;
                case 53: goto L_0x016b;
                case 54: goto L_0x015c;
                case 55: goto L_0x014d;
                case 56: goto L_0x013e;
                case 57: goto L_0x012f;
                case 58: goto L_0x0120;
                case 59: goto L_0x0111;
                case 60: goto L_0x00fe;
                case 61: goto L_0x00ee;
                case 62: goto L_0x00e0;
                case 63: goto L_0x00d2;
                case 64: goto L_0x00c4;
                case 65: goto L_0x00b6;
                case 66: goto L_0x00a8;
                case 67: goto L_0x009a;
                case 68: goto L_0x0088;
                default: goto L_0x0085;
            }
        L_0x0085:
            r4 = 0
            goto L_0x048f
        L_0x0088:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r10)
            r2.mo38342F(r15, r4, r8)
            goto L_0x0085
        L_0x009a:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            long r13 = m44366P(r1, r13)
            r2.mo38356f(r15, r13)
            goto L_0x0085
        L_0x00a8:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38346J(r15, r4)
            goto L_0x0085
        L_0x00b6:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            long r13 = m44366P(r1, r13)
            r2.mo38353c(r15, r13)
            goto L_0x0085
        L_0x00c4:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38341E(r15, r4)
            goto L_0x0085
        L_0x00d2:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38348L(r15, r4)
            goto L_0x0085
        L_0x00e0:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38340D(r15, r4)
            goto L_0x0085
        L_0x00ee:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.k1 r4 = (com.google.android.gms.internal.vision.C9552k1) r4
            r2.mo38349M(r15, r4)
            goto L_0x0085
        L_0x00fe:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r10)
            r2.mo38338B(r15, r4, r8)
            goto L_0x0085
        L_0x0111:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r7.getObject(r1, r13)
            m44379s(r15, r4, r2)
            goto L_0x0085
        L_0x0120:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            boolean r4 = m44367Q(r1, r13)
            r2.mo38372v(r15, r4)
            goto L_0x0085
        L_0x012f:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38375y(r15, r4)
            goto L_0x0085
        L_0x013e:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            long r13 = m44366P(r1, r13)
            r2.mo38359i(r15, r13)
            goto L_0x0085
        L_0x014d:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            int r4 = m44365O(r1, r13)
            r2.mo38355e(r15, r4)
            goto L_0x0085
        L_0x015c:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            long r13 = m44366P(r1, r13)
            r2.zza(r15, r13)
            goto L_0x0085
        L_0x016b:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            long r13 = m44366P(r1, r13)
            r2.mo38351a(r15, r13)
            goto L_0x0085
        L_0x017a:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            float r4 = m44364N(r1, r13)
            r2.mo38367q(r15, r4)
            goto L_0x0085
        L_0x0189:
            boolean r4 = r0.m44351A(r1, r15, r10)
            if (r4 == 0) goto L_0x0085
            double r13 = m44363M(r1, r13)
            r2.mo38366p(r15, r13)
            goto L_0x0085
        L_0x0198:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.m44381u(r2, r15, r4, r10)
            goto L_0x0085
        L_0x01a1:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.w4 r13 = r0.m44352B(r10)
            com.google.android.gms.internal.vision.C9683y4.m44882j(r4, r8, r2, r13)
            goto L_0x0085
        L_0x01b4:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.vision.C9683y4.m44891s(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01c4:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44847E(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01d4:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44894v(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01e4:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44849G(r4, r8, r2, r15)
            goto L_0x0085
        L_0x01f4:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44850H(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0204:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44897y(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0214:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44852J(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0224:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44848F(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0234:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44893u(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0244:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44896x(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0254:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44890r(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0264:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44887o(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0274:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44883k(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0284:
            r15 = 1
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44877e(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0294:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.C9683y4.m44891s(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02a4:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44847E(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02b4:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44894v(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02c4:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44849G(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02d4:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44850H(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02e4:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44897y(r4, r8, r2, r15)
            goto L_0x0085
        L_0x02f4:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44881i(r4, r8, r2)
            goto L_0x0085
        L_0x0303:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.w4 r13 = r0.m44352B(r10)
            com.google.android.gms.internal.vision.C9683y4.m44875d(r4, r8, r2, r13)
            goto L_0x0085
        L_0x0316:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44873c(r4, r8, r2)
            goto L_0x0085
        L_0x0325:
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.C9683y4.m44852J(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0335:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44848F(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0345:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44893u(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0355:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44896x(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0365:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44890r(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0375:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44887o(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0385:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44883k(r4, r8, r2, r15)
            goto L_0x0085
        L_0x0395:
            r15 = 0
            int[] r4 = r0.f45682a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44877e(r4, r8, r2, r15)
            goto L_0x0085
        L_0x03a5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.w4 r13 = r0.m44352B(r10)
            r2.mo38342F(r15, r8, r13)
            goto L_0x048f
        L_0x03b6:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            long r13 = r7.getLong(r1, r13)
            r2.mo38356f(r15, r13)
            goto L_0x048f
        L_0x03c3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38346J(r15, r8)
            goto L_0x048f
        L_0x03d0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            long r13 = r7.getLong(r1, r13)
            r2.mo38353c(r15, r13)
            goto L_0x048f
        L_0x03dd:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38341E(r15, r8)
            goto L_0x048f
        L_0x03ea:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38348L(r15, r8)
            goto L_0x048f
        L_0x03f7:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38340D(r15, r8)
            goto L_0x048f
        L_0x0404:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.k1 r8 = (com.google.android.gms.internal.vision.C9552k1) r8
            r2.mo38349M(r15, r8)
            goto L_0x048f
        L_0x0413:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.w4 r13 = r0.m44352B(r10)
            r2.mo38338B(r15, r8, r13)
            goto L_0x048f
        L_0x0424:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            java.lang.Object r8 = r7.getObject(r1, r13)
            m44379s(r15, r8, r2)
            goto L_0x048f
        L_0x0430:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            boolean r8 = com.google.android.gms.internal.vision.C9652v5.m44667D(r1, r13)
            r2.mo38372v(r15, r8)
            goto L_0x048f
        L_0x043c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38375y(r15, r8)
            goto L_0x048f
        L_0x0448:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            long r13 = r7.getLong(r1, r13)
            r2.mo38359i(r15, r13)
            goto L_0x048f
        L_0x0454:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            int r8 = r7.getInt(r1, r13)
            r2.mo38355e(r15, r8)
            goto L_0x048f
        L_0x0460:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            long r13 = r7.getLong(r1, r13)
            r2.zza(r15, r13)
            goto L_0x048f
        L_0x046c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            long r13 = r7.getLong(r1, r13)
            r2.mo38351a(r15, r13)
            goto L_0x048f
        L_0x0478:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            float r8 = com.google.android.gms.internal.vision.C9652v5.m44668E(r1, r13)
            r2.mo38367q(r15, r8)
            goto L_0x048f
        L_0x0484:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x048f
            double r13 = com.google.android.gms.internal.vision.C9652v5.m44669F(r1, r13)
            r2.mo38366p(r15, r13)
        L_0x048f:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x0493:
            if (r5 == 0) goto L_0x04aa
            com.google.android.gms.internal.vision.h2<?> r4 = r0.f45697p
            r4.mo38415c(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a8
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0493
        L_0x04a8:
            r5 = 0
            goto L_0x0493
        L_0x04aa:
            com.google.android.gms.internal.vision.o5<?, ?> r3 = r0.f45696o
            m44380t(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.m44385y(java.lang.Object, com.google.android.gms.internal.vision.i6):void");
    }

    /* renamed from: z */
    private final void m44386z(T t, T t2, int i) {
        int E = m44355E(i);
        int i2 = this.f45682a[i];
        long j = (long) (E & 1048575);
        if (m44351A(t2, i2, i)) {
            Object G = C9652v5.m44670G(t, j);
            Object G2 = C9652v5.m44670G(t2, j);
            if (G != null && G2 != null) {
                C9652v5.m44684f(t, j, C9662w2.m44752f(G, G2));
                m44357G(t, i2, i);
            } else if (G2 != null) {
                C9652v5.m44684f(t, j, G2);
                m44357G(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.vision.C9683y4.m44892t(com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6), com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.vision.C9683y4.m44892t(com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6), com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.vision.C9683y4.m44892t(com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6), com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.vision.C9683y4.m44892t(com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6), com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44667D(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44667D(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6) == com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.C9652v5.m44668E(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.C9652v5.m44668E(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.C9652v5.m44669F(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.C9652v5.m44669F(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.C9683y4.m44892t(com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6), com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo38442a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f45682a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m44355E(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m44356F(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r4)
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.C9683y4.m44892t(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.C9683y4.m44892t(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.C9683y4.m44892t(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.C9683y4.m44892t(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6)
            long r6 = com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6)
            long r6 = com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.C9683y4.m44892t(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.C9683y4.m44892t(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9652v5.m44670G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.C9683y4.m44892t(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.vision.C9652v5.m44667D(r10, r6)
            boolean r5 = com.google.android.gms.internal.vision.C9652v5.m44667D(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6)
            long r6 = com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.vision.C9652v5.m44664A(r10, r6)
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6)
            long r6 = com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.vision.C9652v5.m44666C(r10, r6)
            long r6 = com.google.android.gms.internal.vision.C9652v5.m44666C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.vision.C9652v5.m44668E(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.vision.C9652v5.m44668E(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m44359I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.vision.C9652v5.m44669F(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.vision.C9652v5.m44669F(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.vision.o5<?, ?> r0 = r9.f45696o
            java.lang.Object r0 = r0.mo38539l(r10)
            com.google.android.gms.internal.vision.o5<?, ?> r2 = r9.f45696o
            java.lang.Object r2 = r2.mo38539l(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f45687f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.vision.h2<?> r0 = r9.f45697p
            com.google.android.gms.internal.vision.k2 r10 = r0.mo38417e(r10)
            com.google.android.gms.internal.vision.h2<?> r0 = r9.f45697p
            com.google.android.gms.internal.vision.k2 r11 = r0.mo38417e(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38442a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public final void mo38443b(T t) {
        int i;
        int i2 = this.f45692k;
        while (true) {
            i = this.f45693l;
            if (i2 >= i) {
                break;
            }
            long E = (long) (m44355E(this.f45691j[i2]) & 1048575);
            Object G = C9652v5.m44670G(t, E);
            if (G != null) {
                C9652v5.m44684f(t, E, this.f45698q.mo38307g(G));
            }
            i2++;
        }
        int length = this.f45691j.length;
        while (i < length) {
            this.f45695n.mo38544b(t, (long) this.f45691j[i]);
            i++;
        }
        this.f45696o.mo38536i(t);
        if (this.f45687f) {
            this.f45697p.mo38419g(t);
        }
    }

    /* renamed from: c */
    public final T mo38444c() {
        return this.f45694m.mo38504a(this.f45686e);
    }

    /* renamed from: d */
    public final boolean mo38445d(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.f45692k) {
                return !this.f45687f || this.f45697p.mo38417e(t2).mo38471c();
            }
            int i6 = this.f45691j[i5];
            int i7 = this.f45682a[i6];
            int E = m44355E(i6);
            int i8 = this.f45682a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f45681s.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if (((268435456 & E) != 0) && !m44383w(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (267386880 & E) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (m44351A(t2, i7, i6) && !m44384x(t2, E, m44352B(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !this.f45698q.mo38305e(C9652v5.m44670G(t2, (long) (E & 1048575))).isEmpty()) {
                            this.f45698q.mo38303c(m44353C(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C9652v5.m44670G(t2, (long) (E & 1048575));
                if (!list.isEmpty()) {
                    C9664w4 B = m44352B(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!B.mo38445d(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m44383w(t, i6, i2, i, i10) && !m44384x(t2, E, m44352B(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
    }

    /* renamed from: e */
    public final void mo38446e(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f45682a.length; i += 3) {
            int E = m44355E(i);
            long j = (long) (1048575 & E);
            int i2 = this.f45682a[i];
            switch ((E & 267386880) >>> 20) {
                case 0:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44681c(t, j, C9652v5.m44669F(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 1:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44682d(t, j, C9652v5.m44668E(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 2:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44683e(t, j, C9652v5.m44666C(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 3:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44683e(t, j, C9652v5.m44666C(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 4:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 5:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44683e(t, j, C9652v5.m44666C(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 6:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 7:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44685g(t, j, C9652v5.m44667D(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 8:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44684f(t, j, C9652v5.m44670G(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 9:
                    m44382v(t, t2, i);
                    break;
                case 10:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44684f(t, j, C9652v5.m44670G(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 11:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 12:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 13:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 14:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44683e(t, j, C9652v5.m44666C(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 15:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44689k(t, j, C9652v5.m44664A(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 16:
                    if (!m44358H(t2, i)) {
                        break;
                    } else {
                        C9652v5.m44683e(t, j, C9652v5.m44666C(t2, j));
                        m44361K(t, i);
                        break;
                    }
                case 17:
                    m44382v(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f45695n.mo38543a(t, t2, j);
                    break;
                case 50:
                    C9683y4.m44879g(this.f45698q, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m44351A(t2, i2, i)) {
                        break;
                    } else {
                        C9652v5.m44684f(t, j, C9652v5.m44670G(t2, j));
                        m44357G(t, i2, i);
                        break;
                    }
                case 60:
                    m44386z(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m44351A(t2, i2, i)) {
                        break;
                    } else {
                        C9652v5.m44684f(t, j, C9652v5.m44670G(t2, j));
                        m44357G(t, i2, i);
                        break;
                    }
                case 68:
                    m44386z(t, t2, i);
                    break;
            }
        }
        C9683y4.m44880h(this.f45696o, t, t2);
        if (this.f45687f) {
            C9683y4.m44878f(this.f45697p, t, t2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38447f(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f45682a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m44355E(r1)
            int[] r4 = r8.f45682a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m44366P(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m44366P(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m44367Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44756j(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m44366P(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m44365O(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m44366P(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m44366P(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m44364N(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m44351A(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m44363M(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.C9652v5.m44666C(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.C9652v5.m44666C(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9652v5.m44670G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.vision.C9652v5.m44667D(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44756j(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.C9652v5.m44666C(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.C9652v5.m44664A(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.C9652v5.m44666C(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.C9652v5.m44666C(r9, r5)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.vision.C9652v5.m44668E(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.vision.C9652v5.m44669F(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.C9662w2.m44751e(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.o5<?, ?> r0 = r8.f45696o
            java.lang.Object r0 = r0.mo38539l(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f45687f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.h2<?> r0 = r8.f45697p
            com.google.android.gms.internal.vision.k2 r9 = r0.mo38417e(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38447f(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x072e, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07fa, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x080f, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0854, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0902, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0925, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38448g(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f45689h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x047d
            sun.misc.Unsafe r2 = f45681s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f45682a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0475
            int r14 = r0.m44355E(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f45682a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.vision.p2 r14 = com.google.android.gms.internal.vision.C9593p2.DOUBLE_LIST_PACKED
            int r14 = r14.mo38542d()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.vision.p2 r14 = com.google.android.gms.internal.vision.C9593p2.SINT64_LIST_PACKED
            int r14 = r14.mo38542d()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f45682a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x0461;
                case 1: goto L_0x0455;
                case 2: goto L_0x0445;
                case 3: goto L_0x0435;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03e3;
                case 9: goto L_0x03cf;
                case 10: goto L_0x03be;
                case 11: goto L_0x03af;
                case 12: goto L_0x03a0;
                case 13: goto L_0x0395;
                case 14: goto L_0x038a;
                case 15: goto L_0x037b;
                case 16: goto L_0x036c;
                case 17: goto L_0x0357;
                case 18: goto L_0x034c;
                case 19: goto L_0x0343;
                case 20: goto L_0x033a;
                case 21: goto L_0x0331;
                case 22: goto L_0x0328;
                case 23: goto L_0x031f;
                case 24: goto L_0x0316;
                case 25: goto L_0x030d;
                case 26: goto L_0x0304;
                case 27: goto L_0x02f7;
                case 28: goto L_0x02ee;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02db;
                case 31: goto L_0x02d1;
                case 32: goto L_0x02c7;
                case 33: goto L_0x02bd;
                case 34: goto L_0x02b3;
                case 35: goto L_0x029b;
                case 36: goto L_0x0286;
                case 37: goto L_0x0271;
                case 38: goto L_0x025c;
                case 39: goto L_0x0247;
                case 40: goto L_0x0232;
                case 41: goto L_0x021c;
                case 42: goto L_0x0206;
                case 43: goto L_0x01f0;
                case 44: goto L_0x01da;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01ae;
                case 47: goto L_0x0198;
                case 48: goto L_0x0182;
                case 49: goto L_0x0174;
                case 50: goto L_0x0164;
                case 51: goto L_0x0156;
                case 52: goto L_0x014a;
                case 53: goto L_0x013a;
                case 54: goto L_0x012a;
                case 55: goto L_0x011a;
                case 56: goto L_0x010e;
                case 57: goto L_0x0102;
                case 58: goto L_0x00f6;
                case 59: goto L_0x00d8;
                case 60: goto L_0x00c4;
                case 61: goto L_0x00b2;
                case 62: goto L_0x00a2;
                case 63: goto L_0x0092;
                case 64: goto L_0x0086;
                case 65: goto L_0x007a;
                case 66: goto L_0x006a;
                case 67: goto L_0x005a;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x046f
        L_0x0044:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.g4 r5 = (com.google.android.gms.internal.vision.C9522g4) r5
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44071R(r3, r5, r6)
            goto L_0x0354
        L_0x005a:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m44366P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44078a0(r3, r5)
            goto L_0x0354
        L_0x006a:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m44365O(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44089p0(r3, r5)
            goto L_0x0354
        L_0x007a:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44085g0(r3, r9)
            goto L_0x0354
        L_0x0086:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44093r0(r3, r11)
            goto L_0x0354
        L_0x0092:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m44365O(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44095s0(r3, r5)
            goto L_0x0354
        L_0x00a2:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m44365O(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44088o0(r3, r5)
            goto L_0x0354
        L_0x00b2:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.k1 r5 = (com.google.android.gms.internal.vision.C9552k1) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r3, r5)
            goto L_0x0354
        L_0x00c4:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44884l(r3, r5, r6)
            goto L_0x0354
        L_0x00d8:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r6 == 0) goto L_0x00ee
            com.google.android.gms.internal.vision.k1 r5 = (com.google.android.gms.internal.vision.C9552k1) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r3, r5)
            goto L_0x0354
        L_0x00ee:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44101x(r3, r5)
            goto L_0x0354
        L_0x00f6:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44102y(r3, r8)
            goto L_0x0354
        L_0x0102:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44091q0(r3, r11)
            goto L_0x0354
        L_0x010e:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44081c0(r3, r9)
            goto L_0x0354
        L_0x011a:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = m44365O(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44087n0(r3, r5)
            goto L_0x0354
        L_0x012a:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m44366P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44076Y(r3, r5)
            goto L_0x0354
        L_0x013a:
            boolean r14 = r0.m44351A(r1, r3, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = m44366P(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44073V(r3, r5)
            goto L_0x0354
        L_0x014a:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44096t(r3, r4)
            goto L_0x0354
        L_0x0156:
            boolean r5 = r0.m44351A(r1, r3, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44094s(r3, r5)
            goto L_0x0354
        L_0x0164:
            com.google.android.gms.internal.vision.z3 r14 = r0.f45698q
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            java.lang.Object r6 = r0.m44353C(r12)
            int r3 = r14.mo38304d(r3, r5, r6)
            goto L_0x0354
        L_0x0174:
            java.util.List r5 = m44362L(r1, r5)
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44889q(r3, r5, r6)
            goto L_0x0354
        L_0x0182:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44860R(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0198:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44868Z(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x01ae:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x01c4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x01da:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44862T(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x01f0:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44866X(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0206:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44876d0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x021c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0232:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0247:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44864V(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x025c:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44858P(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0271:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44856N(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x0286:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
            goto L_0x02af
        L_0x029b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r5)
            if (r5 <= 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44061H(r3)
            int r6 = com.google.android.gms.internal.vision.C9482c2.m44063J(r5)
        L_0x02af:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0354
        L_0x02b3:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44855M(r3, r5, r11)
            goto L_0x0354
        L_0x02bd:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44863U(r3, r5, r11)
            goto L_0x0354
        L_0x02c7:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r3, r5, r11)
            goto L_0x0354
        L_0x02d1:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44865W(r3, r5, r11)
            goto L_0x0354
        L_0x02db:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44857O(r3, r5, r11)
            goto L_0x0354
        L_0x02e5:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44861S(r3, r5, r11)
            goto L_0x0354
        L_0x02ee:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44888p(r3, r5)
            goto L_0x0354
        L_0x02f7:
            java.util.List r5 = m44362L(r1, r5)
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44886n(r3, r5, r6)
            goto L_0x0354
        L_0x0304:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44885m(r3, r5)
            goto L_0x0354
        L_0x030d:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44870a0(r3, r5, r11)
            goto L_0x0354
        L_0x0316:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44865W(r3, r5, r11)
            goto L_0x0354
        L_0x031f:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r3, r5, r11)
            goto L_0x0354
        L_0x0328:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44859Q(r3, r5, r11)
            goto L_0x0354
        L_0x0331:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44854L(r3, r5, r11)
            goto L_0x0354
        L_0x033a:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44853K(r3, r5, r11)
            goto L_0x0354
        L_0x0343:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44865W(r3, r5, r11)
            goto L_0x0354
        L_0x034c:
            java.util.List r5 = m44362L(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r3, r5, r11)
        L_0x0354:
            int r13 = r13 + r3
            goto L_0x046f
        L_0x0357:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.g4 r5 = (com.google.android.gms.internal.vision.C9522g4) r5
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44071R(r3, r5, r6)
            goto L_0x0354
        L_0x036c:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.vision.C9652v5.m44666C(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44078a0(r3, r5)
            goto L_0x0354
        L_0x037b:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44089p0(r3, r5)
            goto L_0x0354
        L_0x038a:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44085g0(r3, r9)
            goto L_0x0354
        L_0x0395:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44093r0(r3, r11)
            goto L_0x0354
        L_0x03a0:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44095s0(r3, r5)
            goto L_0x0354
        L_0x03af:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44088o0(r3, r5)
            goto L_0x0354
        L_0x03be:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.k1 r5 = (com.google.android.gms.internal.vision.C9552k1) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r3, r5)
            goto L_0x0354
        L_0x03cf:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            com.google.android.gms.internal.vision.w4 r6 = r0.m44352B(r12)
            int r3 = com.google.android.gms.internal.vision.C9683y4.m44884l(r3, r5, r6)
            goto L_0x0354
        L_0x03e3:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            java.lang.Object r5 = com.google.android.gms.internal.vision.C9652v5.m44670G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r6 == 0) goto L_0x03f9
            com.google.android.gms.internal.vision.k1 r5 = (com.google.android.gms.internal.vision.C9552k1) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r3, r5)
            goto L_0x0354
        L_0x03f9:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44101x(r3, r5)
            goto L_0x0354
        L_0x0401:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44102y(r3, r8)
            goto L_0x0354
        L_0x040d:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44091q0(r3, r11)
            goto L_0x0354
        L_0x0419:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44081c0(r3, r9)
            goto L_0x0354
        L_0x0425:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            int r5 = com.google.android.gms.internal.vision.C9652v5.m44664A(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44087n0(r3, r5)
            goto L_0x0354
        L_0x0435:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.vision.C9652v5.m44666C(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44076Y(r3, r5)
            goto L_0x0354
        L_0x0445:
            boolean r14 = r0.m44358H(r1, r12)
            if (r14 == 0) goto L_0x046f
            long r5 = com.google.android.gms.internal.vision.C9652v5.m44666C(r1, r5)
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44073V(r3, r5)
            goto L_0x0354
        L_0x0455:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44096t(r3, r4)
            goto L_0x0354
        L_0x0461:
            boolean r5 = r0.m44358H(r1, r12)
            if (r5 == 0) goto L_0x046f
            r5 = 0
            int r3 = com.google.android.gms.internal.vision.C9482c2.m44094s(r3, r5)
            goto L_0x0354
        L_0x046f:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0475:
            com.google.android.gms.internal.vision.o5<?, ?> r2 = r0.f45696o
            int r1 = m44371j(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x047d:
            sun.misc.Unsafe r2 = f45681s
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0485:
            int[] r13 = r0.f45682a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0930
            int r13 = r0.m44355E(r3)
            int[] r14 = r0.f45682a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x04b0
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r6) goto L_0x04b1
            long r8 = (long) r14
            int r6 = r2.getInt(r1, r8)
            r12 = r6
            r6 = r14
            goto L_0x04b1
        L_0x04b0:
            r11 = 0
        L_0x04b1:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0915;
                case 1: goto L_0x0904;
                case 2: goto L_0x08f3;
                case 3: goto L_0x08e3;
                case 4: goto L_0x08d3;
                case 5: goto L_0x08c6;
                case 6: goto L_0x08b9;
                case 7: goto L_0x08ad;
                case 8: goto L_0x0891;
                case 9: goto L_0x087f;
                case 10: goto L_0x0870;
                case 11: goto L_0x0863;
                case 12: goto L_0x0856;
                case 13: goto L_0x084b;
                case 14: goto L_0x0840;
                case 15: goto L_0x0833;
                case 16: goto L_0x0826;
                case 17: goto L_0x0813;
                case 18: goto L_0x07ff;
                case 19: goto L_0x07ef;
                case 20: goto L_0x07e3;
                case 21: goto L_0x07d7;
                case 22: goto L_0x07cb;
                case 23: goto L_0x07bf;
                case 24: goto L_0x07b3;
                case 25: goto L_0x07a7;
                case 26: goto L_0x079c;
                case 27: goto L_0x078c;
                case 28: goto L_0x0780;
                case 29: goto L_0x0773;
                case 30: goto L_0x0766;
                case 31: goto L_0x0759;
                case 32: goto L_0x074c;
                case 33: goto L_0x073f;
                case 34: goto L_0x0732;
                case 35: goto L_0x071a;
                case 36: goto L_0x0705;
                case 37: goto L_0x06f0;
                case 38: goto L_0x06db;
                case 39: goto L_0x06c6;
                case 40: goto L_0x06b1;
                case 41: goto L_0x069b;
                case 42: goto L_0x0685;
                case 43: goto L_0x066f;
                case 44: goto L_0x0659;
                case 45: goto L_0x0643;
                case 46: goto L_0x062d;
                case 47: goto L_0x0617;
                case 48: goto L_0x0601;
                case 49: goto L_0x05f1;
                case 50: goto L_0x05e1;
                case 51: goto L_0x05d3;
                case 52: goto L_0x05c6;
                case 53: goto L_0x05b6;
                case 54: goto L_0x05a6;
                case 55: goto L_0x0596;
                case 56: goto L_0x0588;
                case 57: goto L_0x057b;
                case 58: goto L_0x056e;
                case 59: goto L_0x0550;
                case 60: goto L_0x053c;
                case 61: goto L_0x052a;
                case 62: goto L_0x051a;
                case 63: goto L_0x050a;
                case 64: goto L_0x04fd;
                case 65: goto L_0x04ef;
                case 66: goto L_0x04df;
                case 67: goto L_0x04cf;
                case 68: goto L_0x04b9;
                default: goto L_0x04b7;
            }
        L_0x04b7:
            goto L_0x080b
        L_0x04b9:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.g4 r4 = (com.google.android.gms.internal.vision.C9522g4) r4
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44071R(r15, r4, r8)
            goto L_0x080a
        L_0x04cf:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = m44366P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44078a0(r15, r8)
            goto L_0x080a
        L_0x04df:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = m44365O(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44089p0(r15, r4)
            goto L_0x080a
        L_0x04ef:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44085g0(r15, r8)
            goto L_0x080a
        L_0x04fd:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44093r0(r15, r4)
            goto L_0x0854
        L_0x050a:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = m44365O(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44095s0(r15, r4)
            goto L_0x080a
        L_0x051a:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = m44365O(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44088o0(r15, r4)
            goto L_0x080a
        L_0x052a:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.k1 r4 = (com.google.android.gms.internal.vision.C9552k1) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r15, r4)
            goto L_0x080a
        L_0x053c:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44884l(r15, r4, r8)
            goto L_0x080a
        L_0x0550:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r8 == 0) goto L_0x0566
            com.google.android.gms.internal.vision.k1 r4 = (com.google.android.gms.internal.vision.C9552k1) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r15, r4)
            goto L_0x080a
        L_0x0566:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44101x(r15, r4)
            goto L_0x080a
        L_0x056e:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 1
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44102y(r15, r4)
            goto L_0x0854
        L_0x057b:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44091q0(r15, r4)
            goto L_0x0854
        L_0x0588:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44081c0(r15, r8)
            goto L_0x080a
        L_0x0596:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            int r4 = m44365O(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44087n0(r15, r4)
            goto L_0x080a
        L_0x05a6:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = m44366P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44076Y(r15, r8)
            goto L_0x080a
        L_0x05b6:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            long r8 = m44366P(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44073V(r15, r8)
            goto L_0x080a
        L_0x05c6:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44096t(r15, r4)
            goto L_0x0854
        L_0x05d3:
            boolean r4 = r0.m44351A(r1, r15, r3)
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44094s(r15, r8)
            goto L_0x080a
        L_0x05e1:
            com.google.android.gms.internal.vision.z3 r4 = r0.f45698q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m44353C(r3)
            int r4 = r4.mo38304d(r15, r8, r9)
            goto L_0x080a
        L_0x05f1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44889q(r15, r4, r8)
            goto L_0x080a
        L_0x0601:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44860R(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x0617:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44868Z(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x062d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x0643:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x0659:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44862T(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x066f:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44866X(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44876d0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x069b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x06b1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x06c6:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44864V(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x06db:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44858P(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x06f0:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44856N(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x0705:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44872b0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
            goto L_0x072e
        L_0x071a:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44874c0(r4)
            if (r4 <= 0) goto L_0x080b
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44061H(r15)
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44063J(r4)
        L_0x072e:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0854
        L_0x0732:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44855M(r15, r4, r10)
            goto L_0x07fa
        L_0x073f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44863U(r15, r4, r10)
            goto L_0x07fa
        L_0x074c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r15, r4, r10)
            goto L_0x07fa
        L_0x0759:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44865W(r15, r4, r10)
            goto L_0x07fa
        L_0x0766:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44857O(r15, r4, r10)
            goto L_0x07fa
        L_0x0773:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44861S(r15, r4, r10)
            goto L_0x080a
        L_0x0780:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44888p(r15, r4)
            goto L_0x080a
        L_0x078c:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44886n(r15, r4, r8)
            goto L_0x080a
        L_0x079c:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44885m(r15, r4)
            goto L_0x080a
        L_0x07a7:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44870a0(r15, r4, r10)
            goto L_0x07fa
        L_0x07b3:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44865W(r15, r4, r10)
            goto L_0x07fa
        L_0x07bf:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r15, r4, r10)
            goto L_0x07fa
        L_0x07cb:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44859Q(r15, r4, r10)
            goto L_0x07fa
        L_0x07d7:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44854L(r15, r4, r10)
            goto L_0x07fa
        L_0x07e3:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44853K(r15, r4, r10)
            goto L_0x07fa
        L_0x07ef:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44865W(r15, r4, r10)
        L_0x07fa:
            int r5 = r5 + r4
            r4 = 1
        L_0x07fc:
            r7 = 0
            goto L_0x080f
        L_0x07ff:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44867Y(r15, r4, r10)
        L_0x080a:
            int r5 = r5 + r4
        L_0x080b:
            r4 = 1
        L_0x080c:
            r7 = 0
            r10 = 0
        L_0x080f:
            r13 = 0
            goto L_0x0925
        L_0x0813:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.g4 r4 = (com.google.android.gms.internal.vision.C9522g4) r4
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44071R(r15, r4, r8)
            goto L_0x080a
        L_0x0826:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44078a0(r15, r8)
            goto L_0x080a
        L_0x0833:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44089p0(r15, r4)
            goto L_0x080a
        L_0x0840:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r8 = 0
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44085g0(r15, r8)
            goto L_0x080a
        L_0x084b:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r4 = 0
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44093r0(r15, r4)
        L_0x0854:
            int r5 = r5 + r8
            goto L_0x080b
        L_0x0856:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44095s0(r15, r4)
            goto L_0x080a
        L_0x0863:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44088o0(r15, r4)
            goto L_0x080a
        L_0x0870:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.k1 r4 = (com.google.android.gms.internal.vision.C9552k1) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r15, r4)
            goto L_0x080a
        L_0x087f:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.w4 r8 = r0.m44352B(r3)
            int r4 = com.google.android.gms.internal.vision.C9683y4.m44884l(r15, r4, r8)
            goto L_0x080a
        L_0x0891:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r8 == 0) goto L_0x08a5
            com.google.android.gms.internal.vision.k1 r4 = (com.google.android.gms.internal.vision.C9552k1) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44070Q(r15, r4)
            goto L_0x080a
        L_0x08a5:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.vision.C9482c2.m44101x(r15, r4)
            goto L_0x080a
        L_0x08ad:
            r4 = r12 & r11
            if (r4 == 0) goto L_0x080b
            r4 = 1
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44102y(r15, r4)
            int r5 = r5 + r8
            goto L_0x080c
        L_0x08b9:
            r4 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x07fc
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44091q0(r15, r10)
            int r5 = r5 + r8
            goto L_0x07fc
        L_0x08c6:
            r4 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x0912
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44081c0(r15, r13)
            goto L_0x0902
        L_0x08d3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44087n0(r15, r8)
            goto L_0x0902
        L_0x08e3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44076Y(r15, r8)
            goto L_0x0902
        L_0x08f3:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0912
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C9482c2.m44073V(r15, r8)
        L_0x0902:
            int r5 = r5 + r8
            goto L_0x0912
        L_0x0904:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0912
            r8 = 0
            int r9 = com.google.android.gms.internal.vision.C9482c2.m44096t(r15, r8)
            int r5 = r5 + r9
        L_0x0912:
            r7 = 0
            goto L_0x0925
        L_0x0915:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            if (r9 == 0) goto L_0x0912
            r7 = 0
            int r11 = com.google.android.gms.internal.vision.C9482c2.m44094s(r15, r7)
            int r5 = r5 + r11
        L_0x0925:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x0485
        L_0x0930:
            r10 = 0
            com.google.android.gms.internal.vision.o5<?, ?> r2 = r0.f45696o
            int r2 = m44371j(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f45687f
            if (r2 == 0) goto L_0x098a
            com.google.android.gms.internal.vision.h2<?> r2 = r0.f45697p
            com.google.android.gms.internal.vision.k2 r1 = r2.mo38417e(r1)
            r11 = 0
        L_0x0943:
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r2 = r1.f45719a
            int r2 = r2.mo38657o()
            if (r11 >= r2) goto L_0x0963
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r2 = r1.f45719a
            java.util.Map$Entry r2 = r2.mo38656j(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.vision.m2 r3 = (com.google.android.gms.internal.vision.C9569m2) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.C9553k2.m44421m(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0943
        L_0x0963:
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r1 = r1.f45719a
            java.lang.Iterable r1 = r1.mo38658p()
            java.util.Iterator r1 = r1.iterator()
        L_0x096d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0989
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.vision.m2 r3 = (com.google.android.gms.internal.vision.C9569m2) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.C9553k2.m44421m(r3, r2)
            int r10 = r10 + r2
            goto L_0x096d
        L_0x0989:
            int r5 = r5 + r10
        L_0x098a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38448g(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02dc, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0323, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0346, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0348, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ca, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0234, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38449h(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.vision.C9527h1 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f45689h
            if (r0 == 0) goto L_0x038d
            sun.misc.Unsafe r9 = f45681s
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0370
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44238d(r0, r12, r3, r11)
            int r3 = r11.f45653a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.m44368R(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.m44360J(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r18 = 0
        L_0x004e:
            r20 = -1
            goto L_0x034a
        L_0x0052:
            int[] r0 = r15.f45682a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0242
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021d;
                case 1: goto L_0x0206;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ab;
                case 6: goto L_0x0194;
                case 7: goto L_0x0174;
                case 8: goto L_0x0151;
                case 9: goto L_0x0124;
                case 10: goto L_0x010c;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00f5;
                case 13: goto L_0x0194;
                case 14: goto L_0x01ab;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x0239
        L_0x00a5:
            if (r3 != 0) goto L_0x00cc
            int r10 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r4, r11)
            long r0 = r11.f45654b
            long r17 = com.google.android.gms.internal.vision.C9672x1.m44796e(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x028c
        L_0x00cc:
            r25 = r33
            r8 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0239
        L_0x00da:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r4, r11)
            int r1 = r11.f45653a
            int r1 = com.google.android.gms.internal.vision.C9672x1.m44795c(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x00f5:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r4, r11)
            int r1 = r11.f45653a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x010c:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44251q(r12, r4, r11)
            java.lang.Object r1 = r11.f45655c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0124:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            com.google.android.gms.internal.vision.w4 r0 = r15.m44352B(r10)
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44241g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0146
            java.lang.Object r1 = r11.f45655c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0146:
            java.lang.Object r2 = r11.f45655c
            java.lang.Object r1 = com.google.android.gms.internal.vision.C9662w2.m44752f(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0151:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44248n(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44250p(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f45655c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0174:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r4, r11)
            long r1 = r11.f45654b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            com.google.android.gms.internal.vision.C9652v5.m44685g(r14, r8, r1)
            goto L_0x0234
        L_0x0194:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44242h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0234
        L_0x01ab:
            r25 = r33
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            long r17 = com.google.android.gms.internal.vision.C9510f1.m44246l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0234
        L_0x01ca:
            r5 = r4
            goto L_0x0239
        L_0x01cd:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r5, r11)
            int r1 = r11.f45653a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x01e4:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r17 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r5, r11)
            long r4 = r11.f45654b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x028c
        L_0x0206:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            float r0 = com.google.android.gms.internal.vision.C9510f1.m44249o(r12, r5)
            com.google.android.gms.internal.vision.C9652v5.m44682d(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0234
        L_0x021d:
            r25 = r33
            r5 = r4
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            double r0 = com.google.android.gms.internal.vision.C9510f1.m44247m(r12, r5)
            com.google.android.gms.internal.vision.C9652v5.m44681c(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0234:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x028c
        L_0x0239:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            goto L_0x004e
        L_0x0242:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x029f
            r0 = 2
            if (r3 != r0) goto L_0x0292
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.vision.c3 r0 = (com.google.android.gms.internal.vision.C9485c3) r0
            boolean r1 = r0.mo38298C()
            if (r1 != 0) goto L_0x0272
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0269
            r1 = 10
            goto L_0x026b
        L_0x0269:
            int r1 = r1 << 1
        L_0x026b:
            com.google.android.gms.internal.vision.c3 r0 = r0.mo38300w(r1)
            r7.putObject(r14, r8, r0)
        L_0x0272:
            r8 = r0
            com.google.android.gms.internal.vision.w4 r0 = r15.m44352B(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44239e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x028c:
            r7 = r20
            r1 = r25
            goto L_0x036a
        L_0x0292:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x0326
        L_0x029f:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f4
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.m44373l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x02e0:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0368
        L_0x02f4:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x032c
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0326
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.m44374m(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x0326:
            r2 = r15
        L_0x0327:
            r6 = r27
            r7 = r28
            goto L_0x034a
        L_0x032c:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.m44372k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02e0
        L_0x0348:
            r2 = r0
            goto L_0x0327
        L_0x034a:
            com.google.android.gms.internal.vision.n5 r4 = m44369S(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44237c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
        L_0x0368:
            r9 = r29
        L_0x036a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x0370:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0383
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r4 = r34
            if (r0 != r4) goto L_0x0388
            return
        L_0x0388:
            com.google.android.gms.internal.vision.f3 r0 = com.google.android.gms.internal.vision.C9513f3.m44259e()
            throw r0
        L_0x038d:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo38451n(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38449h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.h1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38450i(T r14, com.google.android.gms.internal.vision.C9540i6 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo38350N()
            int r1 = com.google.android.gms.internal.vision.C9557k6.f45727b
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.vision.o5<?, ?> r0 = r13.f45696o
            m44380t(r0, r14, r15)
            boolean r0 = r13.f45687f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.vision.h2<?> r0 = r13.f45697p
            com.google.android.gms.internal.vision.k2 r0 = r0.mo38417e(r14)
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r1 = r0.f45719a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo38469a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f45682a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.m44355E(r7)
            int[] r9 = r13.f45682a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.vision.h2<?> r10 = r13.f45697p
            int r10 = r10.mo38413a(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.vision.h2<?> r10 = r13.f45697p
            r10.mo38415c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            r15.mo38342F(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m44366P(r14, r10)
            r15.mo38356f(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38346J(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m44366P(r14, r10)
            r15.mo38353c(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38341E(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38348L(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38340D(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.k1 r8 = (com.google.android.gms.internal.vision.C9552k1) r8
            r15.mo38349M(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            r15.mo38338B(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            m44379s(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m44367Q(r14, r10)
            r15.mo38372v(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38375y(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m44366P(r14, r10)
            r15.mo38359i(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m44365O(r14, r10)
            r15.mo38355e(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m44366P(r14, r10)
            r15.zza(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m44366P(r14, r10)
            r15.mo38351a(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m44364N(r14, r10)
            r15.mo38367q(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.m44351A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m44363M(r14, r10)
            r15.mo38366p(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            r13.m44381u(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            com.google.android.gms.internal.vision.C9683y4.m44882j(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44891s(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44847E(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44894v(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44849G(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44850H(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44897y(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44852J(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44848F(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44893u(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44896x(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44890r(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44887o(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44883k(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44877e(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44891s(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44847E(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44894v(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44849G(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44850H(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44897y(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44881i(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            com.google.android.gms.internal.vision.C9683y4.m44875d(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44873c(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44852J(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44848F(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44893u(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44896x(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44890r(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44887o(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44883k(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f45682a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.C9683y4.m44877e(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            r15.mo38342F(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r10)
            r15.mo38356f(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38346J(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r10)
            r15.mo38353c(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38341E(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38348L(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38340D(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.k1 r8 = (com.google.android.gms.internal.vision.C9552k1) r8
            r15.mo38349M(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            com.google.android.gms.internal.vision.w4 r10 = r13.m44352B(r7)
            r15.mo38338B(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r10)
            m44379s(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.vision.C9652v5.m44667D(r14, r10)
            r15.mo38372v(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38375y(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r10)
            r15.mo38359i(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r10)
            r15.mo38355e(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r10)
            r15.zza(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r10)
            r15.mo38351a(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.vision.C9652v5.m44668E(r14, r10)
            r15.mo38367q(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.m44358H(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.vision.C9652v5.m44669F(r14, r10)
            r15.mo38366p(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.vision.h2<?> r14 = r13.f45697p
            r14.mo38415c(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f45689h
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.f45687f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.vision.h2<?> r0 = r13.f45697p
            com.google.android.gms.internal.vision.k2 r0 = r0.mo38417e(r14)
            com.google.android.gms.internal.vision.x4<T, java.lang.Object> r1 = r0.f45719a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.mo38473d()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f45682a
            int r7 = r7.length
            r8 = 0
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.m44355E(r8)
            int[] r10 = r13.f45682a
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.vision.h2<?> r11 = r13.f45697p
            int r11 = r11.mo38413a(r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.vision.h2<?> r11 = r13.f45697p
            r11.mo38415c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            r15.mo38342F(r10, r9, r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m44366P(r14, r11)
            r15.mo38356f(r10, r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38346J(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m44366P(r14, r11)
            r15.mo38353c(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38341E(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38348L(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38340D(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.k1 r9 = (com.google.android.gms.internal.vision.C9552k1) r9
            r15.mo38349M(r10, r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            r15.mo38338B(r10, r9, r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            m44379s(r10, r9, r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m44367Q(r14, r11)
            r15.mo38372v(r10, r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38375y(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m44366P(r14, r11)
            r15.mo38359i(r10, r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m44365O(r14, r11)
            r15.mo38355e(r10, r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m44366P(r14, r11)
            r15.zza(r10, r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m44366P(r14, r11)
            r15.mo38351a(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m44364N(r14, r11)
            r15.mo38367q(r10, r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.m44351A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m44363M(r14, r11)
            r15.mo38366p(r10, r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            r13.m44381u(r15, r10, r9, r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            com.google.android.gms.internal.vision.C9683y4.m44882j(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44891s(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44847E(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44894v(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44849G(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44850H(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44897y(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44852J(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44848F(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44893u(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44896x(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44890r(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44887o(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44883k(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44877e(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44891s(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44847E(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44894v(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44849G(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44850H(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44897y(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44881i(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            com.google.android.gms.internal.vision.C9683y4.m44875d(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44873c(r10, r9, r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44852J(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44848F(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44893u(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44896x(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44890r(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44887o(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44883k(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.f45682a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.C9683y4.m44877e(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            r15.mo38342F(r10, r9, r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r11)
            r15.mo38356f(r10, r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38346J(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r11)
            r15.mo38353c(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38341E(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38348L(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38340D(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.k1 r9 = (com.google.android.gms.internal.vision.C9552k1) r9
            r15.mo38349M(r10, r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            com.google.android.gms.internal.vision.w4 r11 = r13.m44352B(r8)
            r15.mo38338B(r10, r9, r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.C9652v5.m44670G(r14, r11)
            m44379s(r10, r9, r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.vision.C9652v5.m44667D(r14, r11)
            r15.mo38372v(r10, r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38375y(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r11)
            r15.mo38359i(r10, r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.C9652v5.m44664A(r14, r11)
            r15.mo38355e(r10, r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r11)
            r15.zza(r10, r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.C9652v5.m44666C(r14, r11)
            r15.mo38351a(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.vision.C9652v5.m44668E(r14, r11)
            r15.mo38367q(r10, r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.m44358H(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.vision.C9652v5.m44669F(r14, r11)
            r15.mo38366p(r10, r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.vision.h2<?> r2 = r13.f45697p
            r2.mo38415c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.vision.o5<?, ?> r0 = r13.f45696o
            m44380t(r0, r14, r15)
            return
        L_0x0a44:
            r13.m44385y(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38450i(java.lang.Object, com.google.android.gms.internal.vision.i6):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02be, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c0, code lost:
        r11 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c4, code lost:
        r6 = r35;
        r15 = r37;
        r2 = r3;
        r7 = r8;
        r31 = r10;
        r25 = r11;
        r26 = r13;
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x036e, code lost:
        if (r0 == r3) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b4, code lost:
        if (r0 == r14) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x044f, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x056c, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0580, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0584, code lost:
        r1 = r12.f45922b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0588, code lost:
        if (r1.f45912d == false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x058a, code lost:
        r14.mo38479k(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x058e, code lost:
        r1 = r15[r1.f45911c.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0598, code lost:
        if (r1 == 17) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x059c, code lost:
        if (r1 == 18) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x059f, code lost:
        r1 = r14.mo38475f(r12.f45922b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05a5, code lost:
        if (r1 == null) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05a7, code lost:
        r0 = com.google.android.gms.internal.vision.C9662w2.m44752f(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ab, code lost:
        r14.mo38477h(r12.f45922b, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05b0, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r13 = r0;
        r11 = r2;
        r23 = r6;
        r35 = r8;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0172, code lost:
        r5 = r6 | r24;
        r6 = r35;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0179, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027e, code lost:
        r6 = r35;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0299, code lost:
        r0 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b7, code lost:
        r5 = r23 | r24;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bb, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02bc, code lost:
        r2 = r11;
        r1 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38451n(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.vision.C9527h1 r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r34
            r13 = r36
            r11 = r37
            r9 = r38
            sun.misc.Unsafe r10 = f45681s
            r16 = 0
            r0 = r35
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x05f7
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44238d(r0, r12, r3, r9)
            int r3 = r9.f45653a
            r4 = r3
            r3 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003a
            int r2 = r2 / r8
            int r1 = r15.m44368R(r0, r2)
            goto L_0x003e
        L_0x003a:
            int r1 = r15.m44360J(r0)
        L_0x003e:
            r2 = r1
            r20 = 0
            r8 = -1
            if (r2 != r8) goto L_0x0055
            r26 = r0
            r2 = r3
            r7 = r4
            r23 = r5
            r31 = r10
            r15 = r11
            r18 = 1
            r24 = -1
            r25 = 0
            goto L_0x03da
        L_0x0055:
            int[] r8 = r15.f45682a
            int r23 = r2 + 1
            r1 = r8[r23]
            r23 = 267386880(0xff00000, float:2.3665827E-29)
            r23 = r1 & r23
            int r11 = r23 >>> 20
            r18 = r4
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r1 & r13
            long r13 = (long) r4
            r4 = 17
            if (r11 > r4) goto L_0x02d6
            int r24 = r2 + 2
            r8 = r8[r24]
            int r24 = r8 >>> 20
            r22 = 1
            int r24 = r22 << r24
            r25 = r13
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r13
            if (r8 == r6) goto L_0x0095
            if (r6 == r13) goto L_0x008a
            long r13 = (long) r6
            r6 = r33
            r27 = r25
            r10.putInt(r6, r13, r5)
            goto L_0x008e
        L_0x008a:
            r6 = r33
            r27 = r25
        L_0x008e:
            long r13 = (long) r8
            int r5 = r10.getInt(r6, r13)
            r14 = r6
            goto L_0x009a
        L_0x0095:
            r14 = r33
            r27 = r25
            r8 = r6
        L_0x009a:
            r6 = r5
            r5 = 5
            switch(r11) {
                case 0: goto L_0x029e;
                case 1: goto L_0x0282;
                case 2: goto L_0x025c;
                case 3: goto L_0x025c;
                case 4: goto L_0x0242;
                case 5: goto L_0x0220;
                case 6: goto L_0x0207;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01c1;
                case 9: goto L_0x017d;
                case 10: goto L_0x015e;
                case 11: goto L_0x0242;
                case 12: goto L_0x0128;
                case 13: goto L_0x0207;
                case 14: goto L_0x0220;
                case 15: goto L_0x0110;
                case 16: goto L_0x00e9;
                case 17: goto L_0x00ad;
                default: goto L_0x009f;
            }
        L_0x009f:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
        L_0x00a7:
            r2 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02c4
        L_0x00ad:
            r11 = 3
            if (r7 != r11) goto L_0x009f
            int r1 = r0 << 3
            r4 = r1 | 4
            com.google.android.gms.internal.vision.w4 r1 = r15.m44352B(r2)
            r13 = r0
            r0 = r1
            r1 = r34
            r11 = r2
            r2 = r3
            r3 = r36
            r7 = r18
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44240f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x00d4
            java.lang.Object r1 = r9.f45655c
            r2 = r27
            r10.putObject(r14, r2, r1)
            goto L_0x00e3
        L_0x00d4:
            r2 = r27
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f45655c
            java.lang.Object r1 = com.google.android.gms.internal.vision.C9662w2.m44752f(r1, r4)
            r10.putObject(r14, r2, r1)
        L_0x00e3:
            r5 = r6 | r24
            r3 = r7
            r6 = r8
            goto L_0x02bc
        L_0x00e9:
            r13 = r0
            r11 = r2
            r5 = r18
            r1 = r27
            if (r7 != 0) goto L_0x010b
            int r7 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r3, r9)
            long r3 = r9.f45654b
            long r17 = com.google.android.gms.internal.vision.C9672x1.m44796e(r3)
            r0 = r10
            r2 = r1
            r1 = r33
            r35 = r8
            r8 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r24
            goto L_0x027e
        L_0x010b:
            r35 = r8
            r8 = r5
            goto L_0x0179
        L_0x0110:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            if (r7 != 0) goto L_0x0179
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r3, r9)
            int r3 = r9.f45653a
            int r3 = com.google.android.gms.internal.vision.C9672x1.m44795c(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0172
        L_0x0128:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            if (r7 != 0) goto L_0x0179
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r3, r9)
            int r3 = r9.f45653a
            com.google.android.gms.internal.vision.b3 r4 = r15.m44354D(r11)
            if (r4 == 0) goto L_0x015a
            boolean r4 = r4.mo38239k(r3)
            if (r4 == 0) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            com.google.android.gms.internal.vision.n5 r0 = m44369S(r33)
            long r3 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.mo38515d(r8, r1)
            r0 = r2
            r5 = r6
            r3 = r8
            r2 = r11
            r1 = r13
            r6 = r35
            goto L_0x02be
        L_0x015a:
            r10.putInt(r14, r0, r3)
            goto L_0x0172
        L_0x015e:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            r2 = 2
            if (r7 != r2) goto L_0x0179
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44251q(r12, r3, r9)
            java.lang.Object r3 = r9.f45655c
            r10.putObject(r14, r0, r3)
        L_0x0172:
            r5 = r6 | r24
            r6 = r35
            r0 = r2
            goto L_0x02bb
        L_0x0179:
            r23 = r6
            goto L_0x00a7
        L_0x017d:
            r13 = r0
            r11 = r2
            r35 = r8
            r8 = r18
            r0 = r27
            r2 = 2
            if (r7 != r2) goto L_0x01b8
            com.google.android.gms.internal.vision.w4 r2 = r15.m44352B(r11)
            r5 = r36
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44241g(r2, r12, r3, r5, r9)
            r3 = r6 & r24
            if (r3 != 0) goto L_0x019f
            java.lang.Object r3 = r9.f45655c
            r10.putObject(r14, r0, r3)
            goto L_0x01ac
        L_0x019f:
            java.lang.Object r3 = r10.getObject(r14, r0)
            java.lang.Object r4 = r9.f45655c
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9662w2.m44752f(r3, r4)
            r10.putObject(r14, r0, r3)
        L_0x01ac:
            r0 = r6 | r24
            r6 = r35
            r3 = r8
            r1 = r13
            r13 = r5
            r5 = r0
            r0 = r2
            r2 = r11
            goto L_0x02c0
        L_0x01b8:
            r5 = r36
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r23 = r6
            goto L_0x029c
        L_0x01c1:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01db
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44248n(r12, r3, r9)
            goto L_0x01df
        L_0x01db:
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44250p(r12, r3, r9)
        L_0x01df:
            java.lang.Object r1 = r9.f45655c
            r10.putObject(r14, r5, r1)
            goto L_0x02b7
        L_0x01e6:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x029c
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r3, r9)
            long r1 = r9.f45654b
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0201
            r1 = 1
            goto L_0x0202
        L_0x0201:
            r1 = 0
        L_0x0202:
            com.google.android.gms.internal.vision.C9652v5.m44685g(r14, r5, r1)
            goto L_0x02b7
        L_0x0207:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 5
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029c
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44242h(r12, r3)
            r10.putInt(r14, r5, r0)
            goto L_0x0299
        L_0x0220:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029c
            long r20 = com.google.android.gms.internal.vision.C9510f1.m44246l(r12, r3)
            r0 = r10
            r1 = r33
            r7 = r3
            r2 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x02b7
        L_0x0242:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x029c
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44243i(r12, r3, r9)
            int r1 = r9.f45653a
            r10.putInt(r14, r5, r1)
            goto L_0x02b7
        L_0x025c:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x029c
            int r7 = com.google.android.gms.internal.vision.C9510f1.m44245k(r12, r3, r9)
            long r2 = r9.f45654b
            r0 = r10
            r1 = r33
            r20 = r2
            r2 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r23 | r24
        L_0x027e:
            r6 = r35
            r0 = r7
            goto L_0x02bb
        L_0x0282:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r0 = 5
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x029c
            float r0 = com.google.android.gms.internal.vision.C9510f1.m44249o(r12, r3)
            com.google.android.gms.internal.vision.C9652v5.m44682d(r14, r5, r0)
        L_0x0299:
            int r0 = r3 + 4
            goto L_0x02b7
        L_0x029c:
            r2 = 1
            goto L_0x02c4
        L_0x029e:
            r13 = r0
            r11 = r2
            r23 = r6
            r35 = r8
            r8 = r18
            r5 = r27
            r2 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r2) goto L_0x02c4
            double r0 = com.google.android.gms.internal.vision.C9510f1.m44247m(r12, r3)
            com.google.android.gms.internal.vision.C9652v5.m44681c(r14, r5, r0)
            int r0 = r3 + 8
        L_0x02b7:
            r5 = r23 | r24
            r6 = r35
        L_0x02bb:
            r3 = r8
        L_0x02bc:
            r2 = r11
            r1 = r13
        L_0x02be:
            r13 = r36
        L_0x02c0:
            r11 = r37
            goto L_0x0019
        L_0x02c4:
            r6 = r35
            r15 = r37
            r2 = r3
            r7 = r8
            r31 = r10
            r25 = r11
            r26 = r13
            r18 = 1
            r24 = -1
            goto L_0x03da
        L_0x02d6:
            r23 = r5
            r22 = r6
            r5 = r13
            r8 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r33
            r13 = r0
            r0 = r2
            r2 = 27
            if (r11 != r2) goto L_0x033b
            r2 = 2
            if (r7 != r2) goto L_0x032a
            java.lang.Object r1 = r10.getObject(r14, r5)
            com.google.android.gms.internal.vision.c3 r1 = (com.google.android.gms.internal.vision.C9485c3) r1
            boolean r2 = r1.mo38298C()
            if (r2 != 0) goto L_0x0309
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0300
            r2 = 10
            goto L_0x0302
        L_0x0300:
            int r2 = r2 << 1
        L_0x0302:
            com.google.android.gms.internal.vision.c3 r1 = r1.mo38300w(r2)
            r10.putObject(r14, r5, r1)
        L_0x0309:
            r5 = r1
            com.google.android.gms.internal.vision.w4 r1 = r15.m44352B(r0)
            r25 = r0
            r0 = r1
            r1 = r8
            r2 = r34
            r4 = r36
            r6 = r38
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44239e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r37
            r3 = r8
            r1 = r13
            r6 = r22
            r5 = r23
            r2 = r25
            r13 = r36
            goto L_0x0019
        L_0x032a:
            r25 = r0
            r15 = r37
            r14 = r3
            r19 = r8
            r31 = r10
            r26 = r13
            r18 = 1
            r24 = -1
            goto L_0x03b7
        L_0x033b:
            r25 = r0
            r0 = 49
            if (r11 > r0) goto L_0x038b
            long r1 = (long) r1
            r0 = r32
            r26 = r1
            r1 = r33
            r24 = 1
            r2 = r34
            r35 = r3
            r4 = r36
            r29 = r5
            r5 = r8
            r6 = r13
            r19 = r8
            r18 = 1
            r24 = -1
            r8 = r25
            r31 = r10
            r9 = r26
            r15 = r37
            r26 = r13
            r12 = r29
            r14 = r38
            int r0 = r0.m44373l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r35
            if (r0 != r14) goto L_0x0372
            goto L_0x03d8
        L_0x0372:
            r14 = r33
            r12 = r34
            r13 = r36
            r9 = r38
            r11 = r15
            r3 = r19
        L_0x037d:
            r6 = r22
            r5 = r23
            r2 = r25
            r1 = r26
            r10 = r31
            r15 = r32
            goto L_0x0019
        L_0x038b:
            r15 = r37
            r14 = r3
            r29 = r5
            r19 = r8
            r31 = r10
            r26 = r13
            r18 = 1
            r24 = -1
            r0 = 50
            if (r11 != r0) goto L_0x03bd
            r0 = 2
            if (r7 != r0) goto L_0x03b7
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r25
            r6 = r29
            r8 = r38
            int r0 = r0.m44374m(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r14) goto L_0x0372
            goto L_0x03d8
        L_0x03b7:
            r2 = r14
        L_0x03b8:
            r7 = r19
            r6 = r22
            goto L_0x03da
        L_0x03bd:
            r0 = r32
            r8 = r1
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r19
            r6 = r26
            r9 = r11
            r10 = r29
            r12 = r25
            r13 = r38
            int r0 = r0.m44372k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x05e9
        L_0x03d8:
            r2 = r0
            goto L_0x03b8
        L_0x03da:
            if (r7 != r15) goto L_0x03f0
            if (r15 != 0) goto L_0x03df
            goto L_0x03f0
        L_0x03df:
            r8 = r32
            r13 = r33
            r0 = r2
            r1 = r6
            r3 = r7
            r9 = r15
            r5 = r23
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r36
            goto L_0x0606
        L_0x03f0:
            r8 = r32
            r9 = r15
            boolean r0 = r8.f45687f
            if (r0 == 0) goto L_0x05bd
            r10 = r38
            com.google.android.gms.internal.vision.f2 r0 = r10.f45656d
            com.google.android.gms.internal.vision.f2 r1 = com.google.android.gms.internal.vision.C9511f2.m44252b()
            if (r0 == r1) goto L_0x05b8
            com.google.android.gms.internal.vision.g4 r0 = r8.f45686e
            com.google.android.gms.internal.vision.f2 r1 = r10.f45656d
            r11 = r26
            com.google.android.gms.internal.vision.v2$f r12 = r1.mo38386a(r0, r11)
            if (r12 != 0) goto L_0x0428
            com.google.android.gms.internal.vision.n5 r4 = m44369S(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44237c(r0, r1, r2, r3, r4, r5)
            r13 = r33
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            goto L_0x05d6
        L_0x0428:
            r13 = r33
            r0 = r13
            com.google.android.gms.internal.vision.v2$d r0 = (com.google.android.gms.internal.vision.C9643v2.C9647d) r0
            r0.mo38619s()
            com.google.android.gms.internal.vision.k2<com.google.android.gms.internal.vision.v2$c> r14 = r0.zzyg
            com.google.android.gms.internal.vision.v2$c r0 = r12.f45922b
            boolean r1 = r0.f45912d
            com.google.android.gms.internal.vision.c6 r0 = r0.f45911c
            com.google.android.gms.internal.vision.c6 r1 = com.google.android.gms.internal.vision.C9488c6.ENUM
            if (r0 == r1) goto L_0x05b2
            int[] r15 = com.google.android.gms.internal.vision.C9535i1.f45673a
            int r0 = r0.ordinal()
            r0 = r15[r0]
            switch(r0) {
                case 1: goto L_0x0570;
                case 2: goto L_0x055c;
                case 3: goto L_0x0548;
                case 4: goto L_0x0548;
                case 5: goto L_0x0534;
                case 6: goto L_0x0534;
                case 7: goto L_0x0523;
                case 8: goto L_0x0523;
                case 9: goto L_0x0512;
                case 10: goto L_0x0512;
                case 11: goto L_0x04f7;
                case 12: goto L_0x04df;
                case 13: goto L_0x04c7;
                case 14: goto L_0x04bf;
                case 15: goto L_0x04af;
                case 16: goto L_0x049f;
                case 17: goto L_0x0473;
                case 18: goto L_0x0453;
                default: goto L_0x0447;
            }
        L_0x0447:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
        L_0x044f:
            r0 = r17
            goto L_0x0584
        L_0x0453:
            com.google.android.gms.internal.vision.t4 r0 = com.google.android.gms.internal.vision.C9628t4.m44591b()
            com.google.android.gms.internal.vision.g4 r1 = r12.f45921a
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.vision.w4 r0 = r0.mo38580a(r1)
            r5 = r34
            r4 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44241g(r0, r5, r2, r4, r10)
            java.lang.Object r0 = r10.f45655c
            r35 = r6
            r26 = r11
            r6 = r4
            r11 = r5
            goto L_0x0584
        L_0x0473:
            r5 = r34
            r4 = r36
            int r0 = r11 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.vision.t4 r0 = com.google.android.gms.internal.vision.C9628t4.m44591b()
            com.google.android.gms.internal.vision.g4 r1 = r12.f45921a
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.vision.w4 r0 = r0.mo38580a(r1)
            r1 = r34
            r3 = r36
            r35 = r6
            r6 = r4
            r4 = r17
            r26 = r11
            r11 = r5
            r5 = r38
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44240f(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r10.f45655c
            goto L_0x0584
        L_0x049f:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44248n(r11, r2, r10)
            java.lang.Object r0 = r10.f45655c
            goto L_0x0584
        L_0x04af:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44251q(r11, r2, r10)
            java.lang.Object r0 = r10.f45655c
            goto L_0x0584
        L_0x04bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x04c7:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r11, r2, r10)
            long r0 = r10.f45654b
            long r0 = com.google.android.gms.internal.vision.C9672x1.m44796e(r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x044f
        L_0x04df:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r11, r2, r10)
            int r0 = r10.f45653a
            int r0 = com.google.android.gms.internal.vision.C9672x1.m44795c(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x044f
        L_0x04f7:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r11, r2, r10)
            long r0 = r10.f45654b
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x050a
            goto L_0x050c
        L_0x050a:
            r18 = 0
        L_0x050c:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            goto L_0x044f
        L_0x0512:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44242h(r11, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x056c
        L_0x0523:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            long r0 = com.google.android.gms.internal.vision.C9510f1.m44246l(r11, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x0580
        L_0x0534:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44243i(r11, r2, r10)
            int r0 = r10.f45653a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x044f
        L_0x0548:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            int r2 = com.google.android.gms.internal.vision.C9510f1.m44245k(r11, r2, r10)
            long r0 = r10.f45654b
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x044f
        L_0x055c:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            float r0 = com.google.android.gms.internal.vision.C9510f1.m44249o(r11, r2)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
        L_0x056c:
            int r2 = r2 + 4
            goto L_0x044f
        L_0x0570:
            r35 = r6
            r26 = r11
            r11 = r34
            r6 = r36
            double r0 = com.google.android.gms.internal.vision.C9510f1.m44247m(r11, r2)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
        L_0x0580:
            int r2 = r2 + 8
            goto L_0x044f
        L_0x0584:
            com.google.android.gms.internal.vision.v2$c r1 = r12.f45922b
            boolean r3 = r1.f45912d
            if (r3 == 0) goto L_0x058e
            r14.mo38479k(r1, r0)
            goto L_0x05b0
        L_0x058e:
            com.google.android.gms.internal.vision.c6 r1 = r1.f45911c
            int r1 = r1.ordinal()
            r1 = r15[r1]
            r3 = 17
            if (r1 == r3) goto L_0x059f
            r3 = 18
            if (r1 == r3) goto L_0x059f
            goto L_0x05ab
        L_0x059f:
            com.google.android.gms.internal.vision.v2$c r1 = r12.f45922b
            java.lang.Object r1 = r14.mo38475f(r1)
            if (r1 == 0) goto L_0x05ab
            java.lang.Object r0 = com.google.android.gms.internal.vision.C9662w2.m44752f(r1, r0)
        L_0x05ab:
            com.google.android.gms.internal.vision.v2$c r1 = r12.f45922b
            r14.mo38477h(r1, r0)
        L_0x05b0:
            r0 = r2
            goto L_0x05d6
        L_0x05b2:
            r11 = r34
            com.google.android.gms.internal.vision.C9510f1.m44243i(r11, r2, r10)
            throw r17
        L_0x05b8:
            r13 = r33
            r11 = r34
            goto L_0x05c3
        L_0x05bd:
            r13 = r33
            r11 = r34
            r10 = r38
        L_0x05c3:
            r35 = r6
            r6 = r36
            com.google.android.gms.internal.vision.n5 r4 = m44369S(r33)
            r0 = r7
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.vision.C9510f1.m44237c(r0, r1, r2, r3, r4, r5)
        L_0x05d6:
            r3 = r7
            r15 = r8
            r12 = r11
            r14 = r13
            r5 = r23
            r2 = r25
            r1 = r26
            r13 = r6
            r11 = r9
            r9 = r10
            r10 = r31
            r6 = r35
            goto L_0x0019
        L_0x05e9:
            r7 = r19
            r14 = r33
            r12 = r34
            r13 = r36
            r9 = r38
            r3 = r7
            r11 = r15
            goto L_0x037d
        L_0x05f7:
            r23 = r5
            r22 = r6
            r31 = r10
            r9 = r11
            r6 = r13
            r13 = r14
            r8 = r15
            r1 = r22
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0606:
            if (r1 == r2) goto L_0x060e
            long r1 = (long) r1
            r4 = r31
            r4.putInt(r13, r1, r5)
        L_0x060e:
            int r1 = r8.f45692k
            r2 = r17
        L_0x0612:
            int r4 = r8.f45693l
            if (r1 >= r4) goto L_0x0625
            int[] r4 = r8.f45691j
            r4 = r4[r1]
            com.google.android.gms.internal.vision.o5<?, ?> r5 = r8.f45696o
            java.lang.Object r2 = r8.m44377q(r13, r4, r2, r5)
            com.google.android.gms.internal.vision.n5 r2 = (com.google.android.gms.internal.vision.C9580n5) r2
            int r1 = r1 + 1
            goto L_0x0612
        L_0x0625:
            if (r2 == 0) goto L_0x062c
            com.google.android.gms.internal.vision.o5<?, ?> r1 = r8.f45696o
            r1.mo38534g(r13, r2)
        L_0x062c:
            if (r9 != 0) goto L_0x0636
            if (r0 != r6) goto L_0x0631
            goto L_0x063a
        L_0x0631:
            com.google.android.gms.internal.vision.f3 r0 = com.google.android.gms.internal.vision.C9513f3.m44259e()
            throw r0
        L_0x0636:
            if (r0 > r6) goto L_0x063b
            if (r3 != r9) goto L_0x063b
        L_0x063a:
            return r0
        L_0x063b:
            com.google.android.gms.internal.vision.f3 r0 = com.google.android.gms.internal.vision.C9513f3.m44259e()
            goto L_0x0641
        L_0x0640:
            throw r0
        L_0x0641:
            goto L_0x0640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9546j4.mo38451n(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.h1):int");
    }
}
