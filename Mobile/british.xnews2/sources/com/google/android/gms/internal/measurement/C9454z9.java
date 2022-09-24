package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.z9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9454z9<T> implements C9179ha<T> {

    /* renamed from: p */
    private static final int[] f45548p = new int[0];

    /* renamed from: q */
    private static final Unsafe f45549q = C9165gb.m42956l();

    /* renamed from: a */
    private final int[] f45550a;

    /* renamed from: b */
    private final Object[] f45551b;

    /* renamed from: c */
    private final int f45552c;

    /* renamed from: d */
    private final int f45553d;

    /* renamed from: e */
    private final C9409w9 f45554e;

    /* renamed from: f */
    private final boolean f45555f;

    /* renamed from: g */
    private final boolean f45556g;

    /* renamed from: h */
    private final int[] f45557h;

    /* renamed from: i */
    private final int f45558i;

    /* renamed from: j */
    private final int f45559j;

    /* renamed from: k */
    private final C9208j9 f45560k;

    /* renamed from: l */
    private final C9410wa f45561l;

    /* renamed from: m */
    private final C9147f8 f45562m;

    /* renamed from: n */
    private final C9086ba f45563n;

    /* renamed from: o */
    private final C9315q9 f45564o;

    private C9454z9(int[] iArr, Object[] objArr, int i, int i2, C9409w9 w9Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C9086ba baVar, C9208j9 j9Var, C9410wa waVar, C9147f8 f8Var, C9315q9 q9Var, byte[] bArr) {
        C9409w9 w9Var2 = w9Var;
        C9147f8 f8Var2 = f8Var;
        this.f45550a = iArr;
        this.f45551b = objArr;
        this.f45552c = i;
        this.f45553d = i2;
        this.f45556g = z;
        boolean z3 = false;
        if (f8Var2 != null && f8Var2.mo37563c(w9Var)) {
            z3 = true;
        }
        this.f45555f = z3;
        this.f45557h = iArr2;
        this.f45558i = i3;
        this.f45559j = i4;
        this.f45563n = baVar;
        this.f45560k = j9Var;
        this.f45561l = waVar;
        this.f45562m = f8Var2;
        this.f45554e = w9Var2;
        this.f45564o = q9Var;
    }

    /* renamed from: B */
    static C9425xa m43979B(Object obj) {
        C9330r8 r8Var = (C9330r8) obj;
        C9425xa xaVar = r8Var.zzc;
        if (xaVar != C9425xa.m43841c()) {
            return xaVar;
        }
        C9425xa e = C9425xa.m43843e();
        r8Var.zzc = e;
        return e;
    }

    /* renamed from: C */
    static C9454z9 m43980C(Class cls, C9347s9 s9Var, C9086ba baVar, C9208j9 j9Var, C9410wa waVar, C9147f8 f8Var, C9315q9 q9Var) {
        if (s9Var instanceof C9164ga) {
            return m43981D((C9164ga) s9Var, baVar, j9Var, waVar, f8Var, q9Var);
        }
        C9348sa saVar = (C9348sa) s9Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C9454z9 m43981D(com.google.android.gms.internal.measurement.C9164ga r34, com.google.android.gms.internal.measurement.C9086ba r35, com.google.android.gms.internal.measurement.C9208j9 r36, com.google.android.gms.internal.measurement.C9410wa r37, com.google.android.gms.internal.measurement.C9147f8 r38, com.google.android.gms.internal.measurement.C9315q9 r39) {
        /*
            int r0 = r34.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo37604a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f45548p
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f45549q
            java.lang.Object[] r17 = r34.mo37605b()
            com.google.android.gms.internal.measurement.w9 r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m44001m(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m44001m(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m44001m(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m44001m(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.measurement.z9 r0 = new com.google.android.gms.internal.measurement.z9
            r4 = r0
            com.google.android.gms.internal.measurement.w9 r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.m43981D(com.google.android.gms.internal.measurement.ga, com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.j9, com.google.android.gms.internal.measurement.wa, com.google.android.gms.internal.measurement.f8, com.google.android.gms.internal.measurement.q9):com.google.android.gms.internal.measurement.z9");
    }

    /* renamed from: E */
    private static double m43982E(Object obj, long j) {
        return ((Double) C9165gb.m42955k(obj, j)).doubleValue();
    }

    /* renamed from: F */
    private static float m43983F(Object obj, long j) {
        return ((Float) C9165gb.m42955k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030d, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030e, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054e, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m43984G(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f45549q
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f45550a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r0.m43996h(r5)
            int[] r10 = r0.f45550a
            r11 = r10[r5]
            int r12 = m43995g(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x0341;
                case 31: goto L_0x0335;
                case 32: goto L_0x0329;
                case 33: goto L_0x031d;
                case 34: goto L_0x0311;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02e3;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b9;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028f;
                case 41: goto L_0x0279;
                case 42: goto L_0x0263;
                case 43: goto L_0x024d;
                case 44: goto L_0x0237;
                case 45: goto L_0x0221;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a2;
                case 53: goto L_0x018a;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0152;
                case 57: goto L_0x0145;
                case 58: goto L_0x0136;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x037e
        L_0x0042:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.w9 r3 = (com.google.android.gms.internal.measurement.C9409w9) r3
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43949y(r11, r3, r4)
            goto L_0x037d
        L_0x0058:
            boolean r10 = r0.m44010v(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m43997i(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0074:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m43986I(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030d
        L_0x008f:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x01be
        L_0x009d:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x01ae
        L_0x00ab:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m43986I(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r3)
            goto L_0x030d
        L_0x00c1:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m43986I(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030d
        L_0x00d7:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.r7 r3 = (com.google.android.gms.internal.measurement.C9329r7) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = r3.mo37731c()
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x00f1:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030e
        L_0x00f5:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43102Q(r11, r3, r4)
            goto L_0x037d
        L_0x0109:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C9329r7
            if (r4 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.r7 r3 = (com.google.android.gms.internal.measurement.C9329r7) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = r3.mo37731c()
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x00f1
        L_0x0128:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43942C(r3)
            goto L_0x030d
        L_0x0136:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0145:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x01ae
        L_0x0152:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x01be
        L_0x015f:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m43986I(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r3)
            goto L_0x030d
        L_0x0175:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m43997i(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r9)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
            goto L_0x019e
        L_0x018a:
            boolean r9 = r0.m44010v(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m43997i(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r9)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
        L_0x019e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x01a2:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x01ae:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01b2:
            boolean r3 = r0.m44010v(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x01be:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m44000l(r5)
            com.google.android.gms.internal.measurement.C9315q9.m43513a(r11, r3, r4)
            goto L_0x037e
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43097L(r11, r3, r4)
            goto L_0x037d
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43107V(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43105T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x020b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x0221:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x0237:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43092G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43110Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x0263:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43089D(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x02a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43099N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x02b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43113a0(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43101P(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x02e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x030c
        L_0x02f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r11)
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x030c:
            int r4 = r4 + r9
        L_0x030d:
            int r4 = r4 + r3
        L_0x030e:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43106U(r11, r3, r9)
            goto L_0x037d
        L_0x031d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43104S(r11, r3, r9)
            goto L_0x037d
        L_0x0329:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r11, r3, r9)
            goto L_0x037d
        L_0x0335:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r11, r3, r9)
            goto L_0x037d
        L_0x0341:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43091F(r11, r3, r9)
            goto L_0x037d
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43109X(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43090E(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43103R(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43108W(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43086A(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43098M(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43111Z(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43100O(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.w9 r3 = (com.google.android.gms.internal.measurement.C9409w9) r3
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43949y(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.r7 r3 = (com.google.android.gms.internal.measurement.C9329r7) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = r3.mo37731c()
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ha r4 = r0.m43999k(r5)
            int r3 = com.google.android.gms.internal.measurement.C9209ja.m43102Q(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C9329r7
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.measurement.r7 r3 = (com.google.android.gms.internal.measurement.C9329r7) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = r3.mo37731c()
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43942C(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r9)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r9)
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0555:
            com.google.android.gms.internal.measurement.wa r2 = r0.f45561l
            java.lang.Object r3 = r2.mo38124c(r1)
            int r2 = r2.mo38122a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f45555f
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.measurement.f8 r2 = r0.f45562m
            r2.mo37561a(r1)
            r1 = 0
            goto L_0x056d
        L_0x056c:
            throw r1
        L_0x056d:
            goto L_0x056c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.m43984G(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m43985H(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f45549q
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f45550a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m43996h(r2)
            int r5 = m43995g(r4)
            int[] r6 = r11.f45550a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.k8 r4 = com.google.android.gms.internal.measurement.C9222k8.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.k8 r4 = com.google.android.gms.internal.measurement.C9222k8.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f45550a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.w9 r4 = (com.google.android.gms.internal.measurement.C9409w9) r4
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43949y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m44010v(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m43997i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m43986I(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m43986I(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m43986I(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.r7 r4 = (com.google.android.gms.internal.measurement.C9329r7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = r4.mo37731c()
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43102Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C9329r7
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.r7 r4 = (com.google.android.gms.internal.measurement.C9329r7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = r4.mo37731c()
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43942C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m43986I(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m43997i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r6)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m43997i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r6)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m44010v(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.lang.Object r5 = r11.m44000l(r2)
            com.google.android.gms.internal.measurement.C9315q9.m43513a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43097L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43107V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43105T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43092G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43110Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43089D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43099N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43113a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43101P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43094I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43096K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43943D(r6)
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43106U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43104S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43091F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43109X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43090E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43103R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43108W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43086A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43098M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43111Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43100O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43093H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43095J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.w9 r4 = (com.google.android.gms.internal.measurement.C9409w9) r4
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43949y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m44007s(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.r7 r4 = (com.google.android.gms.internal.measurement.C9329r7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = r4.mo37731c()
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            com.google.android.gms.internal.measurement.ha r5 = r11.m43999k(r2)
            int r4 = com.google.android.gms.internal.measurement.C9209ja.m43102Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C9329r7
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.r7 r4 = (com.google.android.gms.internal.measurement.C9329r7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = r4.mo37731c()
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43942C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r5)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43950z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r6)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r6)
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43945b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m44007s(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C9452z7.m43944a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.measurement.wa r0 = r11.f45561l
            java.lang.Object r12 = r0.mo38124c(r12)
            int r12 = r0.mo38122a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.m43985H(java.lang.Object):int");
    }

    /* renamed from: I */
    private static int m43986I(Object obj, long j) {
        return ((Integer) C9165gb.m42955k(obj, j)).intValue();
    }

    /* renamed from: J */
    private final int m43987J(Object obj, byte[] bArr, int i, int i2, int i3, long j, C9131e7 e7Var) throws IOException {
        Unsafe unsafe = f45549q;
        Object l = m44000l(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C9300p9) object).mo37935h()) {
            C9300p9 c = C9300p9.m43489b().mo37929c();
            C9315q9.m43514b(c, object);
            unsafe.putObject(obj, j, c);
        }
        C9285o9 o9Var = (C9285o9) l;
        throw null;
    }

    /* renamed from: K */
    private final int m43988K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C9131e7 e7Var) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C9131e7 e7Var2 = e7Var;
        Unsafe unsafe = f45549q;
        long j3 = (long) (this.f45550a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C9146f7.m42879n(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C9146f7.m42867b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C9146f7.m42878m(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(e7Var2.f45006b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C9146f7.m42875j(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(e7Var2.f45005a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C9146f7.m42879n(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C9146f7.m42867b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C9146f7.m42878m(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(e7Var2.f45006b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C9146f7.m42875j(bArr2, i9, e7Var2);
                    int i14 = e7Var2.f45005a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C9240lb.m43189f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, C9453z8.f45543b));
                        j5 += i14;
                    } else {
                        throw C9085b9.m42685c();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = C9146f7.m42869d(m43999k(i13), bArr2, i9, i2, e7Var2);
                    Object object = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj2, j2, e7Var2.f45007c);
                    } else {
                        unsafe.putObject(obj2, j2, C9453z8.m43976g(object, e7Var2.f45007c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C9146f7.m42866a(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, e7Var2.f45007c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C9146f7.m42875j(bArr2, i9, e7Var2);
                    int i15 = e7Var2.f45005a;
                    C9393v8 j7 = m43998j(i13);
                    if (j7 == null || j7.mo37520m(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m43979B(obj).mo38172h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j8 = C9146f7.m42875j(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C9392v7.m43755a(e7Var2.f45005a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j8;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = C9146f7.m42878m(bArr2, i9, e7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C9392v7.m43756b(e7Var2.f45006b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = C9146f7.m42868c(m43999k(i13), bArr, i, i2, (i10 & -8) | 4, e7Var);
                    Object object2 = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj2, j2, e7Var2.f45007c);
                    } else {
                        unsafe.putObject(obj2, j2, C9453z8.m43976g(object2, e7Var2.f45007c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032e, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0351, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c5, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0237, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023b, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0241, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e7, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m43989L(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C9131e7 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f45549q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x037a
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42876k(r0, r12, r3, r11)
            int r3 = r11.f45005a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m43992O(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m43991N(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = -1
            r23 = 0
            goto L_0x0354
        L_0x004e:
            int[] r0 = r15.f45550a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = m43995g(r1)
            r33 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x024c
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x008b
            r20 = r2
            if (r7 == r5) goto L_0x007f
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            if (r0 == r5) goto L_0x0088
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r2 = r7
            r7 = r0
            goto L_0x008f
        L_0x008b:
            r20 = r2
            r2 = r19
        L_0x008f:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0201;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01c8;
                case 5: goto L_0x01a6;
                case 6: goto L_0x018f;
                case 7: goto L_0x016f;
                case 8: goto L_0x014c;
                case 9: goto L_0x011f;
                case 10: goto L_0x0107;
                case 11: goto L_0x01c8;
                case 12: goto L_0x00f0;
                case 13: goto L_0x018f;
                case 14: goto L_0x01a6;
                case 15: goto L_0x00d5;
                case 16: goto L_0x00a0;
                default: goto L_0x0093;
            }
        L_0x0093:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            goto L_0x0241
        L_0x00a0:
            if (r3 != 0) goto L_0x00c7
            int r10 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r4, r11)
            long r0 = r11.f45006b
            long r21 = com.google.android.gms.internal.measurement.C9392v7.m43756b(r0)
            r0 = r2
            r1 = r31
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r33
            r8 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x023b
        L_0x00c7:
            r19 = r7
            r8 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0241
        L_0x00d5:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r4, r11)
            int r1 = r11.f45005a
            int r1 = com.google.android.gms.internal.measurement.C9392v7.m43755a(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x00f0:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r4, r11)
            int r1 = r11.f45005a
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x0107:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42866a(r12, r4, r11)
            java.lang.Object r1 = r11.f45007c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x011f:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            com.google.android.gms.internal.measurement.ha r0 = r15.m43999k(r10)
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42869d(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.f45007c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x0141:
            java.lang.Object r2 = r11.f45007c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C9453z8.m43976g(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x014c:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0164
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42872g(r12, r4, r11)
            goto L_0x0168
        L_0x0164:
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42873h(r12, r4, r11)
        L_0x0168:
            java.lang.Object r1 = r11.f45007c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x016f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r4, r11)
            long r1 = r11.f45006b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            com.google.android.gms.internal.measurement.C9165gb.m42962r(r14, r8, r1)
            goto L_0x0237
        L_0x018f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0237
        L_0x01a6:
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            long r21 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0237
        L_0x01c5:
            r5 = r4
            goto L_0x0241
        L_0x01c8:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r5, r11)
            int r1 = r11.f45005a
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x01e0:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r17 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r5, r11)
            long r4 = r11.f45006b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x023b
        L_0x0201:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C9165gb.m42965u(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0237
        L_0x021c:
            r5 = r4
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            long r0 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C9165gb.m42964t(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0237:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x023b:
            r7 = r19
            r1 = r20
            goto L_0x0374
        L_0x0241:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x0354
        L_0x024c:
            r20 = r33
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x02aa
            r0 = 2
            if (r3 != r0) goto L_0x029d
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.y8 r0 = (com.google.android.gms.internal.measurement.C9438y8) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x027d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0275
            r1 = 10
            goto L_0x0276
        L_0x0275:
            int r1 = r1 + r1
        L_0x0276:
            com.google.android.gms.internal.measurement.y8 r0 = r0.mo37416s(r1)
            r7.putObject(r14, r8, r0)
        L_0x027d:
            r8 = r0
            com.google.android.gms.internal.measurement.ha r0 = r15.m43999k(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42870e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            goto L_0x0374
        L_0x029d:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0331
        L_0x02aa:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02ff
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
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r33
            r24 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r35
            int r0 = r0.m43990M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02fd
        L_0x02e9:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0372
        L_0x02fd:
            r2 = r0
            goto L_0x0332
        L_0x02ff:
            r33 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x0337
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0331
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r8 = r35
            int r0 = r0.m43987J(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0331:
            r2 = r15
        L_0x0332:
            r6 = r26
            r7 = r27
            goto L_0x0354
        L_0x0337:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r35
            int r0 = r0.m43988K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0354:
            com.google.android.gms.internal.measurement.xa r4 = m43979B(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42874i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
        L_0x0372:
            r9 = r28
        L_0x0374:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x037a:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x038d
            long r1 = (long) r7
            r3 = r31
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x038d:
            r1 = r34
            if (r0 != r1) goto L_0x0392
            return r0
        L_0x0392:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.C9085b9.m42687e()
            goto L_0x0398
        L_0x0397:
            throw r0
        L_0x0398:
            goto L_0x0397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.m43989L(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: M */
    private final int m43990M(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C9131e7 r29) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = f45549q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.y8 r12 = (com.google.android.gms.internal.measurement.C9438y8) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.y8 r12 = r12.mo37416s(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.measurement.ha r1 = r15.m43999k(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42868c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45007c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r1, r7)
            long r4 = r7.f45006b
            long r4 = com.google.android.gms.internal.measurement.C9392v7.m43756b(r4)
            r12.mo37685f(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r4, r7)
            long r8 = r7.f45006b
            long r8 = com.google.android.gms.internal.measurement.C9392v7.m43756b(r8)
            r12.mo37685f(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r4, r7)
            long r8 = r7.f45006b
            long r8 = com.google.android.gms.internal.measurement.C9392v7.m43756b(r8)
            r12.mo37685f(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.measurement.s8 r12 = (com.google.android.gms.internal.measurement.C9346s8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r4 = r7.f45005a
            int r4 = com.google.android.gms.internal.measurement.C9392v7.m43755a(r4)
            r12.mo38029p(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.s8 r12 = (com.google.android.gms.internal.measurement.C9346s8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r4 = r7.f45005a
            int r4 = com.google.android.gms.internal.measurement.C9392v7.m43755a(r4)
            r12.mo38029p(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r4 = r7.f45005a
            int r4 = com.google.android.gms.internal.measurement.C9392v7.m43755a(r4)
            r12.mo38029p(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.C9146f7.m42871f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C9146f7.m42877l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.r8 r1 = (com.google.android.gms.internal.measurement.C9330r8) r1
            com.google.android.gms.internal.measurement.xa r3 = r1.zzc
            com.google.android.gms.internal.measurement.xa r4 = com.google.android.gms.internal.measurement.C9425xa.m43841c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.measurement.v8 r4 = r15.m43998j(r8)
            com.google.android.gms.internal.measurement.wa r5 = r0.f45561l
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9209ja.m43116c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.measurement.xa r3 = (com.google.android.gms.internal.measurement.C9425xa) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r4 = r7.f45005a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.measurement.r7 r4 = com.google.android.gms.internal.measurement.C9329r7.f45419c
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.measurement.r7 r6 = com.google.android.gms.internal.measurement.C9329r7.m43544t(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r4 = r7.f45005a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.measurement.r7 r4 = com.google.android.gms.internal.measurement.C9329r7.f45419c
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.measurement.r7 r6 = com.google.android.gms.internal.measurement.C9329r7.m43544t(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.measurement.ha r1 = r15.m43999k(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42870e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r6 = r7.f45005a
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C9453z8.f45543b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r8 = r7.f45005a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r6, r7)
            int r6 = r7.f45005a
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C9453z8.f45543b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r6 = r7.f45005a
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C9240lb.m43189f(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C9453z8.f45543b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r8 = r7.f45005a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r6, r7)
            int r6 = r7.f45005a
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C9240lb.m43189f(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C9453z8.f45543b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42685c()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42685c()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42686d()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.measurement.g7 r12 = (com.google.android.gms.internal.measurement.C9161g7) r12
            int r2 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r4 = r7.f45005a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r2, r7)
            long r5 = r7.f45006b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.mo37598e(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.g7 r12 = (com.google.android.gms.internal.measurement.C9161g7) r12
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r4, r7)
            long r8 = r7.f45006b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.mo37598e(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r8 = r7.f45005a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r6, r7)
            long r8 = r7.f45006b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.mo37598e(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.measurement.s8 r12 = (com.google.android.gms.internal.measurement.C9346s8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r3, r1)
            r12.mo38029p(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.s8 r12 = (com.google.android.gms.internal.measurement.C9346s8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r17, r18)
            r12.mo38029p(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r3, r4)
            r12.mo38029p(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r3, r1)
            r12.mo37685f(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            long r8 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r17, r18)
            r12.mo37685f(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r3, r4)
            r12.mo37685f(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42871f(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42877l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r1, r7)
            long r4 = r7.f45006b
            r12.mo37685f(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.k9 r12 = (com.google.android.gms.internal.measurement.C9223k9) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r4, r7)
            long r8 = r7.f45006b
            r12.mo37685f(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r3, r4, r7)
            long r8 = r7.f45006b
            r12.mo37685f(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.measurement.l8 r12 = (com.google.android.gms.internal.measurement.C9237l8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo37711e(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.l8 r12 = (com.google.android.gms.internal.measurement.C9237l8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo37711e(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo37711e(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.measurement.b8 r12 = (com.google.android.gms.internal.measurement.C9084b8) r12
            int r1 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r2 = r7.f45005a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo37409e(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.measurement.b9 r1 = com.google.android.gms.internal.measurement.C9085b9.m42688f()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.b8 r12 = (com.google.android.gms.internal.measurement.C9084b8) r12
            long r8 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo37409e(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r1, r7)
            int r6 = r7.f45005a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo37409e(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r3, r4, r7)
            int r9 = r7.f45005a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C9146f7.m42868c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45007c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.m43990M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.e7):int");
    }

    /* renamed from: N */
    private final int m43991N(int i) {
        if (i < this.f45552c || i > this.f45553d) {
            return -1;
        }
        return m43994Q(i, 0);
    }

    /* renamed from: O */
    private final int m43992O(int i, int i2) {
        if (i < this.f45552c || i > this.f45553d) {
            return -1;
        }
        return m43994Q(i, i2);
    }

    /* renamed from: P */
    private final int m43993P(int i) {
        return this.f45550a[i + 2];
    }

    /* renamed from: Q */
    private final int m43994Q(int i, int i2) {
        int length = (this.f45550a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f45550a[i4];
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

    /* renamed from: g */
    private static int m43995g(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: h */
    private final int m43996h(int i) {
        return this.f45550a[i + 1];
    }

    /* renamed from: i */
    private static long m43997i(Object obj, long j) {
        return ((Long) C9165gb.m42955k(obj, j)).longValue();
    }

    /* renamed from: j */
    private final C9393v8 m43998j(int i) {
        int i2 = i / 3;
        return (C9393v8) this.f45551b[i2 + i2 + 1];
    }

    /* renamed from: k */
    private final C9179ha m43999k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C9179ha haVar = (C9179ha) this.f45551b[i3];
        if (haVar != null) {
            return haVar;
        }
        C9179ha b = C9134ea.m42831a().mo37546b((Class) this.f45551b[i3 + 1]);
        this.f45551b[i3] = b;
        return b;
    }

    /* renamed from: l */
    private final Object m44000l(int i) {
        int i2 = i / 3;
        return this.f45551b[i2 + i2];
    }

    /* renamed from: m */
    private static Field m44001m(Class cls, String str) {
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

    /* renamed from: n */
    private final void m44002n(Object obj, Object obj2, int i) {
        long h = (long) (m43996h(i) & 1048575);
        if (m44007s(obj2, i)) {
            Object k = C9165gb.m42955k(obj, h);
            Object k2 = C9165gb.m42955k(obj2, h);
            if (k != null && k2 != null) {
                C9165gb.m42968x(obj, h, C9453z8.m43976g(k, k2));
                m44004p(obj, i);
            } else if (k2 != null) {
                C9165gb.m42968x(obj, h, k2);
                m44004p(obj, i);
            }
        }
    }

    /* renamed from: o */
    private final void m44003o(Object obj, Object obj2, int i) {
        int h = m43996h(i);
        int i2 = this.f45550a[i];
        long j = (long) (h & 1048575);
        if (m44010v(obj2, i2, i)) {
            Object k = m44010v(obj, i2, i) ? C9165gb.m42955k(obj, j) : null;
            Object k2 = C9165gb.m42955k(obj2, j);
            if (k != null && k2 != null) {
                C9165gb.m42968x(obj, j, C9453z8.m43976g(k, k2));
                m44005q(obj, i2, i);
            } else if (k2 != null) {
                C9165gb.m42968x(obj, j, k2);
                m44005q(obj, i2, i);
            }
        }
    }

    /* renamed from: p */
    private final void m44004p(Object obj, int i) {
        int P = m43993P(i);
        long j = (long) (1048575 & P);
        if (j != 1048575) {
            C9165gb.m42966v(obj, j, (1 << (P >>> 20)) | C9165gb.m42952h(obj, j));
        }
    }

    /* renamed from: q */
    private final void m44005q(Object obj, int i, int i2) {
        C9165gb.m42966v(obj, (long) (m43993P(i2) & 1048575), i);
    }

    /* renamed from: r */
    private final boolean m44006r(Object obj, Object obj2, int i) {
        return m44007s(obj, i) == m44007s(obj2, i);
    }

    /* renamed from: s */
    private final boolean m44007s(Object obj, int i) {
        int P = m43993P(i);
        long j = (long) (P & 1048575);
        if (j != 1048575) {
            return (C9165gb.m42952h(obj, j) & (1 << (P >>> 20))) != 0;
        }
        int h = m43996h(i);
        long j2 = (long) (h & 1048575);
        switch (m43995g(h)) {
            case 0:
                return Double.doubleToRawLongBits(C9165gb.m42950f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C9165gb.m42951g(obj, j2)) != 0;
            case 2:
                return C9165gb.m42953i(obj, j2) != 0;
            case 3:
                return C9165gb.m42953i(obj, j2) != 0;
            case 4:
                return C9165gb.m42952h(obj, j2) != 0;
            case 5:
                return C9165gb.m42953i(obj, j2) != 0;
            case 6:
                return C9165gb.m42952h(obj, j2) != 0;
            case 7:
                return C9165gb.m42941B(obj, j2);
            case 8:
                Object k = C9165gb.m42955k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof C9329r7) {
                    return !C9329r7.f45419c.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return C9165gb.m42955k(obj, j2) != null;
            case 10:
                return !C9329r7.f45419c.equals(C9165gb.m42955k(obj, j2));
            case 11:
                return C9165gb.m42952h(obj, j2) != 0;
            case 12:
                return C9165gb.m42952h(obj, j2) != 0;
            case 13:
                return C9165gb.m42952h(obj, j2) != 0;
            case 14:
                return C9165gb.m42953i(obj, j2) != 0;
            case 15:
                return C9165gb.m42952h(obj, j2) != 0;
            case 16:
                return C9165gb.m42953i(obj, j2) != 0;
            case 17:
                return C9165gb.m42955k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: t */
    private final boolean m44008t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m44007s(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: u */
    private static boolean m44009u(Object obj, int i, C9179ha haVar) {
        return haVar.mo37355b(C9165gb.m42955k(obj, (long) (i & 1048575)));
    }

    /* renamed from: v */
    private final boolean m44010v(Object obj, int i, int i2) {
        return C9165gb.m42952h(obj, (long) (m43993P(i2) & 1048575)) == i;
    }

    /* renamed from: w */
    private static boolean m44011w(Object obj, long j) {
        return ((Boolean) C9165gb.m42955k(obj, j)).booleanValue();
    }

    /* renamed from: x */
    private final void m44012x(Object obj, C9069a8 a8Var) throws IOException {
        int i;
        Object obj2 = obj;
        C9069a8 a8Var2 = a8Var;
        if (!this.f45555f) {
            int length = this.f45550a.length;
            Unsafe unsafe = f45549q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int h = m43996h(i3);
                int[] iArr = this.f45550a;
                int i6 = iArr[i3];
                int g = m43995g(h);
                if (g <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (h & i2);
                switch (g) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            a8Var2.mo37344q(i6, C9165gb.m42950f(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37353z(i6, C9165gb.m42951g(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37322E(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37338j(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37320C(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37351x(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37349v(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37340m(i6, C9165gb.m42941B(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m44014z(i6, unsafe.getObject(obj2, j), a8Var2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37324G(i6, unsafe.getObject(obj2, j), m43999k(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37342o(i6, (C9329r7) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37336h(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37347t(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37325H(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37327J(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37329a(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37331c(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            a8Var2.mo37319B(i6, unsafe.getObject(obj2, j), m43999k(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C9209ja.m43125l(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 19:
                        C9209ja.m43129p(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 20:
                        C9209ja.m43132s(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 21:
                        C9209ja.m43087B(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 22:
                        C9209ja.m43131r(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 23:
                        C9209ja.m43128o(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 24:
                        C9209ja.m43127n(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 25:
                        C9209ja.m43123j(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        continue;
                    case 26:
                        C9209ja.m43138y(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2);
                        break;
                    case 27:
                        C9209ja.m43133t(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, m43999k(i3));
                        break;
                    case 28:
                        C9209ja.m43124k(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2);
                        break;
                    case 29:
                        C9209ja.m43139z(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 30:
                        C9209ja.m43126m(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 31:
                        C9209ja.m43134u(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 32:
                        C9209ja.m43135v(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 33:
                        C9209ja.m43136w(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 34:
                        C9209ja.m43137x(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, false);
                        break;
                    case 35:
                        C9209ja.m43125l(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 36:
                        C9209ja.m43129p(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 37:
                        C9209ja.m43132s(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 38:
                        C9209ja.m43087B(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 39:
                        C9209ja.m43131r(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 40:
                        C9209ja.m43128o(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 41:
                        C9209ja.m43127n(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 42:
                        C9209ja.m43123j(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 43:
                        C9209ja.m43139z(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 44:
                        C9209ja.m43126m(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 45:
                        C9209ja.m43134u(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 46:
                        C9209ja.m43135v(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 47:
                        C9209ja.m43136w(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 48:
                        C9209ja.m43137x(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, true);
                        break;
                    case 49:
                        C9209ja.m43130q(this.f45550a[i3], (List) unsafe.getObject(obj2, j), a8Var2, m43999k(i3));
                        break;
                    case 50:
                        m44013y(a8Var2, i6, unsafe.getObject(obj2, j), i3);
                        break;
                    case 51:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37344q(i6, m43982E(obj2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37353z(i6, m43983F(obj2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37322E(i6, m43997i(obj2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37338j(i6, m43997i(obj2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37320C(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37351x(i6, m43997i(obj2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37349v(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37340m(i6, m44011w(obj2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m44010v(obj2, i6, i3)) {
                            m44014z(i6, unsafe.getObject(obj2, j), a8Var2);
                            break;
                        }
                        break;
                    case 60:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37324G(i6, unsafe.getObject(obj2, j), m43999k(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37342o(i6, (C9329r7) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37336h(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37347t(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37325H(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37327J(i6, m43997i(obj2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37329a(i6, m43986I(obj2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37331c(i6, m43997i(obj2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m44010v(obj2, i6, i3)) {
                            a8Var2.mo37319B(i6, unsafe.getObject(obj2, j), m43999k(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            C9410wa waVar = this.f45561l;
            waVar.mo38130i(waVar.mo38124c(obj2), a8Var2);
            return;
        }
        this.f45562m.mo37561a(obj2);
        throw null;
    }

    /* renamed from: y */
    private final void m44013y(C9069a8 a8Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C9285o9 o9Var = (C9285o9) m44000l(i2);
            throw null;
        }
    }

    /* renamed from: z */
    private static final void m44014z(int i, Object obj, C9069a8 a8Var) throws IOException {
        if (obj instanceof String) {
            a8Var.mo37334f(i, (String) obj);
        } else {
            a8Var.mo37342o(i, (C9329r7) obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037c, code lost:
        if (r0 != r15) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0398, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c4, code lost:
        if (r0 != r15) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e6, code lost:
        if (r0 != r15) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0163, code lost:
        r5 = r6 | r25;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0167, code lost:
        r3 = r8;
        r1 = r11;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019e, code lost:
        r21 = r3;
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0200, code lost:
        r5 = r6 | r25;
        r3 = r2;
        r1 = r11;
        r6 = r27;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020c, code lost:
        r13 = r2;
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020f, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b0, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b2, code lost:
        r5 = r6 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b4, code lost:
        r2 = r32;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bd, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d2, code lost:
        r7 = r34;
        r22 = r6;
        r28 = r10;
        r8 = r18;
        r2 = r21;
        r6 = r27;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38222A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.C9131e7 r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f45549q
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x0457
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42876k(r0, r12, r1, r9)
            int r1 = r9.f45005a
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r8
            int r2 = r15.m43992O(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m43991N(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r32 = r0
            r2 = r1
            r8 = r4
            r22 = r5
            r28 = r10
            r7 = r11
            r19 = -1
            r21 = 0
            goto L_0x03e9
        L_0x0050:
            int[] r3 = r15.f45550a
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = m43995g(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02e2
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r25 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x0089
            r18 = r4
            if (r6 == r3) goto L_0x0081
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0081:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            goto L_0x008d
        L_0x0089:
            r18 = r4
            r27 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0297;
                case 1: goto L_0x027b;
                case 2: goto L_0x0254;
                case 3: goto L_0x0254;
                case 4: goto L_0x023b;
                case 5: goto L_0x0213;
                case 6: goto L_0x01e8;
                case 7: goto L_0x01c7;
                case 8: goto L_0x01a3;
                case 9: goto L_0x016d;
                case 10: goto L_0x0149;
                case 11: goto L_0x023b;
                case 12: goto L_0x0112;
                case 13: goto L_0x01e8;
                case 14: goto L_0x0213;
                case 15: goto L_0x00f4;
                case 16: goto L_0x00c1;
                default: goto L_0x0092;
            }
        L_0x0092:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bd
            com.google.android.gms.internal.measurement.ha r0 = r15.m43999k(r13)
            int r1 = r32 << 3
            r7 = r1 | 4
            r1 = r31
            r2 = r11
            r3 = r33
            r11 = r4
            r4 = r7
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42868c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x02c0
            java.lang.Object r1 = r9.f45007c
            r10.putObject(r14, r11, r1)
            goto L_0x02cd
        L_0x00c1:
            if (r7 != 0) goto L_0x00ea
            r3 = r21
            int r7 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r3, r9)
            long r0 = r9.f45006b
            long r4 = com.google.android.gms.internal.measurement.C9392v7.m43756b(r0)
            r11 = r20
            r0 = r10
            r1 = r30
            r8 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r32 = r11
            r11 = r18
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r0 = r7
            goto L_0x0167
        L_0x00ea:
            r32 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r2
            goto L_0x02d2
        L_0x00f4:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r3, r9)
            int r1 = r9.f45005a
            int r1 = com.google.android.gms.internal.measurement.C9392v7.m43755a(r1)
            r4 = r22
            r10.putInt(r14, r4, r1)
            goto L_0x0163
        L_0x0112:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r3, r9)
            int r1 = r9.f45005a
            com.google.android.gms.internal.measurement.v8 r2 = r15.m43998j(r8)
            if (r2 == 0) goto L_0x0145
            boolean r2 = r2.mo37520m(r1)
            if (r2 == 0) goto L_0x0135
            goto L_0x0145
        L_0x0135:
            com.google.android.gms.internal.measurement.xa r2 = m43979B(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo38172h(r11, r1)
            r2 = r32
            r5 = r6
            goto L_0x0167
        L_0x0145:
            r10.putInt(r14, r4, r1)
            goto L_0x0163
        L_0x0149:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019e
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42866a(r12, r3, r9)
            java.lang.Object r1 = r9.f45007c
            r10.putObject(r14, r4, r1)
        L_0x0163:
            r5 = r6 | r25
            r2 = r32
        L_0x0167:
            r3 = r8
            r1 = r11
            r6 = r27
            goto L_0x0208
        L_0x016d:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019e
            com.google.android.gms.internal.measurement.ha r0 = r15.m43999k(r8)
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42869d(r0, r12, r3, r13, r9)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x0190
            java.lang.Object r1 = r9.f45007c
            r10.putObject(r14, r4, r1)
            goto L_0x0163
        L_0x0190:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.f45007c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C9453z8.m43976g(r1, r2)
            r10.putObject(r14, r4, r1)
            goto L_0x0163
        L_0x019e:
            r21 = r3
            r13 = r8
            goto L_0x020f
        L_0x01a3:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01bd
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42872g(r12, r3, r9)
            goto L_0x01c1
        L_0x01bd:
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42873h(r12, r3, r9)
        L_0x01c1:
            java.lang.Object r1 = r9.f45007c
            r10.putObject(r14, r4, r1)
            goto L_0x0200
        L_0x01c7:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x020c
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r3, r9)
            long r7 = r9.f45006b
            r17 = 0
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01e3
            goto L_0x01e4
        L_0x01e3:
            r1 = 0
        L_0x01e4:
            com.google.android.gms.internal.measurement.C9165gb.m42962r(r14, r4, r1)
            goto L_0x0200
        L_0x01e8:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020c
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0200:
            r5 = r6 | r25
            r3 = r2
            r1 = r11
            r6 = r27
            r2 = r32
        L_0x0208:
            r11 = r34
            goto L_0x0019
        L_0x020c:
            r13 = r2
            r21 = r3
        L_0x020f:
            r18 = r11
            goto L_0x02d2
        L_0x0213:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0234
            long r7 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r12, r3)
            r0 = r10
            r1 = r30
            r13 = r2
            r18 = r11
            r11 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02b0
        L_0x0234:
            r13 = r2
            r18 = r11
            r21 = r3
            goto L_0x02d2
        L_0x023b:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bd
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42875j(r12, r11, r9)
            int r1 = r9.f45005a
            r10.putInt(r14, r4, r1)
            goto L_0x02b2
        L_0x0254:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bd
            int r7 = com.google.android.gms.internal.measurement.C9146f7.m42878m(r12, r11, r9)
            long r2 = r9.f45006b
            r0 = r10
            r1 = r30
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r11 = r34
            r0 = r7
            goto L_0x02b8
        L_0x027b:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bd
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42867b(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C9165gb.m42965u(r14, r4, r0)
            int r0 = r11 + 4
            goto L_0x02b2
        L_0x0297:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02bd
            long r0 = com.google.android.gms.internal.measurement.C9146f7.m42879n(r12, r11)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C9165gb.m42964t(r14, r4, r0)
        L_0x02b0:
            int r0 = r11 + 8
        L_0x02b2:
            r5 = r6 | r25
        L_0x02b4:
            r2 = r32
            r11 = r34
        L_0x02b8:
            r3 = r13
            r1 = r18
            goto L_0x0334
        L_0x02bd:
            r21 = r11
            goto L_0x02d2
        L_0x02c0:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f45007c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C9453z8.m43976g(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x02cd:
            r5 = r6 | r25
            r12 = r31
            goto L_0x02b4
        L_0x02d2:
            r7 = r34
            r22 = r6
            r28 = r10
            r8 = r18
            r2 = r21
            r6 = r27
            r21 = r13
            goto L_0x03e9
        L_0x02e2:
            r13 = r2
            r18 = r4
            r3 = r11
            r4 = r20
            r11 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r3 != r0) goto L_0x0348
            r0 = 2
            if (r7 != r0) goto L_0x033a
            java.lang.Object r0 = r10.getObject(r14, r11)
            com.google.android.gms.internal.measurement.y8 r0 = (com.google.android.gms.internal.measurement.C9438y8) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0313
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030b
            r1 = 10
            goto L_0x030c
        L_0x030b:
            int r1 = r1 + r1
        L_0x030c:
            com.google.android.gms.internal.measurement.y8 r0 = r0.mo37416s(r1)
            r10.putObject(r14, r11, r0)
        L_0x0313:
            r7 = r0
            com.google.android.gms.internal.measurement.ha r0 = r15.m43999k(r13)
            r1 = r18
            r2 = r31
            r3 = r21
            r8 = r4
            r4 = r33
            r22 = r5
            r5 = r7
            r27 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42870e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r31
            r11 = r34
            r2 = r8
            r3 = r13
            r5 = r22
        L_0x0334:
            r6 = r27
            r13 = r33
            goto L_0x0019
        L_0x033a:
            r22 = r5
            r27 = r6
            r32 = r4
            r28 = r10
            r15 = r21
            r21 = r13
            goto L_0x03c7
        L_0x0348:
            r22 = r5
            r27 = r6
            r6 = r4
            r0 = 49
            if (r3 > r0) goto L_0x039c
            long r4 = (long) r8
            r0 = r29
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r21
            r23 = r4
            r4 = r33
            r5 = r18
            r32 = r6
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r23
            r25 = r11
            r15 = r21
            r12 = r34
            r11 = r20
            r21 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.m43990M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0398
        L_0x037e:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r3 = r21
            r5 = r22
            r6 = r27
            r10 = r28
            goto L_0x0019
        L_0x0398:
            r7 = r34
            r2 = r0
            goto L_0x03ca
        L_0x039c:
            r20 = r3
            r32 = r6
            r28 = r10
            r25 = r11
            r15 = r21
            r21 = r13
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x03cf
            r0 = 2
            if (r7 != r0) goto L_0x03c7
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r25
            r8 = r35
            int r0 = r0.m43987J(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0398
            goto L_0x037e
        L_0x03c7:
            r7 = r34
            r2 = r15
        L_0x03ca:
            r8 = r18
            r6 = r27
            goto L_0x03e9
        L_0x03cf:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r32
            r10 = r25
            r12 = r21
            r13 = r35
            int r0 = r0.m43988K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0398
            goto L_0x037e
        L_0x03e9:
            if (r8 != r7) goto L_0x03f7
            if (r7 == 0) goto L_0x03f7
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r22
            goto L_0x0460
        L_0x03f7:
            r9 = r29
            boolean r0 = r9.f45555f
            if (r0 == 0) goto L_0x0430
            r10 = r35
            com.google.android.gms.internal.measurement.e8 r0 = r10.f45008d
            com.google.android.gms.internal.measurement.e8 r1 = com.google.android.gms.internal.measurement.C9132e8.m42824a()
            if (r0 == r1) goto L_0x042b
            com.google.android.gms.internal.measurement.w9 r0 = r9.f45554e
            com.google.android.gms.internal.measurement.e8 r1 = r10.f45008d
            r11 = r32
            com.google.android.gms.internal.measurement.q8 r0 = r1.mo37540c(r0, r11)
            if (r0 != 0) goto L_0x0425
            com.google.android.gms.internal.measurement.xa r4 = m43979B(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42874i(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0445
        L_0x0425:
            r12 = r30
            r0 = r12
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.C9299p8) r0
            throw r17
        L_0x042b:
            r12 = r30
            r11 = r32
            goto L_0x0436
        L_0x0430:
            r12 = r30
            r11 = r32
            r10 = r35
        L_0x0436:
            com.google.android.gms.internal.measurement.xa r4 = m43979B(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C9146f7.m42874i(r0, r1, r2, r3, r4, r5)
        L_0x0445:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r22
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x0019
        L_0x0457:
            r22 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0460:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x046b
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x046b:
            int r3 = r9.f45558i
        L_0x046d:
            int r4 = r9.f45559j
            if (r3 >= r4) goto L_0x0498
            int[] r4 = r9.f45557h
            r4 = r4[r3]
            int[] r5 = r9.f45550a
            r5 = r5[r4]
            int r5 = r9.m43996h(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r12, r5)
            if (r5 != 0) goto L_0x0486
            goto L_0x048c
        L_0x0486:
            com.google.android.gms.internal.measurement.v8 r6 = r9.m43998j(r4)
            if (r6 != 0) goto L_0x048f
        L_0x048c:
            int r3 = r3 + 1
            goto L_0x046d
        L_0x048f:
            com.google.android.gms.internal.measurement.p9 r5 = (com.google.android.gms.internal.measurement.C9300p9) r5
            java.lang.Object r0 = r9.m44000l(r4)
            com.google.android.gms.internal.measurement.o9 r0 = (com.google.android.gms.internal.measurement.C9285o9) r0
            throw r17
        L_0x0498:
            if (r7 != 0) goto L_0x04a4
            r2 = r33
            if (r0 != r2) goto L_0x049f
            goto L_0x04aa
        L_0x049f:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.C9085b9.m42687e()
            throw r0
        L_0x04a4:
            r2 = r33
            if (r0 > r2) goto L_0x04ab
            if (r1 != r7) goto L_0x04ab
        L_0x04aa:
            return r0
        L_0x04ab:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.C9085b9.m42687e()
            goto L_0x04b1
        L_0x04b0:
            throw r0
        L_0x04b1:
            goto L_0x04b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.mo38222A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    /* renamed from: a */
    public final void mo37354a(Object obj) {
        int i;
        int i2 = this.f45558i;
        while (true) {
            i = this.f45559j;
            if (i2 >= i) {
                break;
            }
            long h = (long) (m43996h(this.f45557h[i2]) & 1048575);
            Object k = C9165gb.m42955k(obj, h);
            if (k != null) {
                ((C9300p9) k).mo37931d();
                C9165gb.m42968x(obj, h, k);
            }
            i2++;
        }
        int length = this.f45557h.length;
        while (i < length) {
            this.f45560k.mo37617a(obj, (long) this.f45557h[i]);
            i++;
        }
        this.f45561l.mo38128g(obj);
        if (this.f45555f) {
            this.f45562m.mo37562b(obj);
        }
    }

    /* renamed from: b */
    public final boolean mo37355b(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f45558i) {
            int i6 = this.f45557h[i5];
            int i7 = this.f45550a[i6];
            int h = m43996h(i6);
            int i8 = this.f45550a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f45549q.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & h) != 0 && !m44008t(obj, i6, i2, i, i10)) {
                return false;
            }
            int g = m43995g(h);
            if (g != 9 && g != 17) {
                if (g != 27) {
                    if (g == 60 || g == 68) {
                        if (m44010v(obj2, i7, i6) && !m44009u(obj2, h, m43999k(i6))) {
                            return false;
                        }
                    } else if (g != 49) {
                        if (g == 50 && !((C9300p9) C9165gb.m42955k(obj2, (long) (h & 1048575))).isEmpty()) {
                            C9285o9 o9Var = (C9285o9) m44000l(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C9165gb.m42955k(obj2, (long) (h & 1048575));
                if (!list.isEmpty()) {
                    C9179ha k = m43999k(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!k.mo37355b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m44008t(obj, i6, i2, i, i10) && !m44009u(obj2, h, m43999k(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f45555f) {
            return true;
        }
        this.f45562m.mo37561a(obj2);
        throw null;
    }

    /* renamed from: c */
    public final void mo37356c(Object obj, byte[] bArr, int i, int i2, C9131e7 e7Var) throws IOException {
        if (this.f45556g) {
            m43989L(obj, bArr, i, i2, e7Var);
        } else {
            mo38222A(obj, bArr, i, i2, 0, e7Var);
        }
    }

    /* renamed from: d */
    public final void mo37357d(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f45550a.length; i += 3) {
            int h = m43996h(i);
            long j = (long) (1048575 & h);
            int i2 = this.f45550a[i];
            switch (m43995g(h)) {
                case 0:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42964t(obj, j, C9165gb.m42950f(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 1:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42965u(obj, j, C9165gb.m42951g(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 2:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42967w(obj, j, C9165gb.m42953i(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 3:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42967w(obj, j, C9165gb.m42953i(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 4:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 5:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42967w(obj, j, C9165gb.m42953i(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 6:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 7:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42962r(obj, j, C9165gb.m42941B(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 8:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42968x(obj, j, C9165gb.m42955k(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 9:
                    m44002n(obj, obj2, i);
                    break;
                case 10:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42968x(obj, j, C9165gb.m42955k(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 11:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 12:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 13:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 14:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42967w(obj, j, C9165gb.m42953i(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 15:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42966v(obj, j, C9165gb.m42952h(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 16:
                    if (!m44007s(obj2, i)) {
                        break;
                    } else {
                        C9165gb.m42967w(obj, j, C9165gb.m42953i(obj2, j));
                        m44004p(obj, i);
                        break;
                    }
                case 17:
                    m44002n(obj, obj2, i);
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
                    this.f45560k.mo37618b(obj, obj2, j);
                    break;
                case 50:
                    C9209ja.m43122i(this.f45564o, obj, obj2, j);
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
                    if (!m44010v(obj2, i2, i)) {
                        break;
                    } else {
                        C9165gb.m42968x(obj, j, C9165gb.m42955k(obj2, j));
                        m44005q(obj, i2, i);
                        break;
                    }
                case 60:
                    m44003o(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m44010v(obj2, i2, i)) {
                        break;
                    } else {
                        C9165gb.m42968x(obj, j, C9165gb.m42955k(obj2, j));
                        m44005q(obj, i2, i);
                        break;
                    }
                case 68:
                    m44003o(obj, obj2, i);
                    break;
            }
        }
        C9209ja.m43119f(this.f45561l, obj, obj2);
        if (this.f45555f) {
            C9209ja.m43118e(this.f45562m, obj, obj2);
        }
    }

    /* renamed from: e */
    public final boolean mo37358e(Object obj, Object obj2) {
        boolean z;
        int length = this.f45550a.length;
        for (int i = 0; i < length; i += 3) {
            int h = m43996h(i);
            long j = (long) (h & 1048575);
            switch (m43995g(h)) {
                case 0:
                    if (m44006r(obj, obj2, i) && Double.doubleToLongBits(C9165gb.m42950f(obj, j)) == Double.doubleToLongBits(C9165gb.m42950f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m44006r(obj, obj2, i) && Float.floatToIntBits(C9165gb.m42951g(obj, j)) == Float.floatToIntBits(C9165gb.m42951g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m44006r(obj, obj2, i) && C9165gb.m42953i(obj, j) == C9165gb.m42953i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m44006r(obj, obj2, i) && C9165gb.m42953i(obj, j) == C9165gb.m42953i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m44006r(obj, obj2, i) && C9165gb.m42953i(obj, j) == C9165gb.m42953i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m44006r(obj, obj2, i) && C9165gb.m42941B(obj, j) == C9165gb.m42941B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m44006r(obj, obj2, i) && C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m44006r(obj, obj2, i) && C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m44006r(obj, obj2, i) && C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m44006r(obj, obj2, i) && C9165gb.m42953i(obj, j) == C9165gb.m42953i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m44006r(obj, obj2, i) && C9165gb.m42952h(obj, j) == C9165gb.m42952h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m44006r(obj, obj2, i) && C9165gb.m42953i(obj, j) == C9165gb.m42953i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m44006r(obj, obj2, i) && C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j))) {
                        continue;
                    }
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
                    z = C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j));
                    break;
                case 50:
                    z = C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long P = (long) (m43993P(i) & 1048575);
                    if (C9165gb.m42952h(obj, P) == C9165gb.m42952h(obj2, P) && C9209ja.m43121h(C9165gb.m42955k(obj, j), C9165gb.m42955k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f45561l.mo38124c(obj).equals(this.f45561l.mo38124c(obj2))) {
            return false;
        }
        if (!this.f45555f) {
            return true;
        }
        this.f45562m.mo37561a(obj);
        this.f45562m.mo37561a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final void mo37359f(Object obj, C9069a8 a8Var) throws IOException {
        if (!this.f45556g) {
            m44012x(obj, a8Var);
        } else if (!this.f45555f) {
            int length = this.f45550a.length;
            for (int i = 0; i < length; i += 3) {
                int h = m43996h(i);
                int i2 = this.f45550a[i];
                switch (m43995g(h)) {
                    case 0:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37344q(i2, C9165gb.m42950f(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37353z(i2, C9165gb.m42951g(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37322E(i2, C9165gb.m42953i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37338j(i2, C9165gb.m42953i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37320C(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37351x(i2, C9165gb.m42953i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37349v(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37340m(i2, C9165gb.m42941B(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            m44014z(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var);
                            break;
                        }
                    case 9:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37324G(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), m43999k(i));
                            break;
                        }
                    case 10:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37342o(i2, (C9329r7) C9165gb.m42955k(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37336h(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37347t(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37325H(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37327J(i2, C9165gb.m42953i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37329a(i2, C9165gb.m42952h(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37331c(i2, C9165gb.m42953i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m44007s(obj, i)) {
                            break;
                        } else {
                            a8Var.mo37319B(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), m43999k(i));
                            break;
                        }
                    case 18:
                        C9209ja.m43125l(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 19:
                        C9209ja.m43129p(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 20:
                        C9209ja.m43132s(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 21:
                        C9209ja.m43087B(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 22:
                        C9209ja.m43131r(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 23:
                        C9209ja.m43128o(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 24:
                        C9209ja.m43127n(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 25:
                        C9209ja.m43123j(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 26:
                        C9209ja.m43138y(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var);
                        break;
                    case 27:
                        C9209ja.m43133t(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, m43999k(i));
                        break;
                    case 28:
                        C9209ja.m43124k(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var);
                        break;
                    case 29:
                        C9209ja.m43139z(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 30:
                        C9209ja.m43126m(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 31:
                        C9209ja.m43134u(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 32:
                        C9209ja.m43135v(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 33:
                        C9209ja.m43136w(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 34:
                        C9209ja.m43137x(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, false);
                        break;
                    case 35:
                        C9209ja.m43125l(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 36:
                        C9209ja.m43129p(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 37:
                        C9209ja.m43132s(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 38:
                        C9209ja.m43087B(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 39:
                        C9209ja.m43131r(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 40:
                        C9209ja.m43128o(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 41:
                        C9209ja.m43127n(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 42:
                        C9209ja.m43123j(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 43:
                        C9209ja.m43139z(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 44:
                        C9209ja.m43126m(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 45:
                        C9209ja.m43134u(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 46:
                        C9209ja.m43135v(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 47:
                        C9209ja.m43136w(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 48:
                        C9209ja.m43137x(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, true);
                        break;
                    case 49:
                        C9209ja.m43130q(i2, (List) C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var, m43999k(i));
                        break;
                    case 50:
                        m44013y(a8Var, i2, C9165gb.m42955k(obj, (long) (h & 1048575)), i);
                        break;
                    case 51:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37344q(i2, m43982E(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37353z(i2, m43983F(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37322E(i2, m43997i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37338j(i2, m43997i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37320C(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37351x(i2, m43997i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37349v(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37340m(i2, m44011w(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            m44014z(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), a8Var);
                            break;
                        }
                    case 60:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37324G(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), m43999k(i));
                            break;
                        }
                    case 61:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37342o(i2, (C9329r7) C9165gb.m42955k(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37336h(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37347t(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37325H(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37327J(i2, m43997i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37329a(i2, m43986I(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37331c(i2, m43997i(obj, (long) (h & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m44010v(obj, i2, i)) {
                            break;
                        } else {
                            a8Var.mo37319B(i2, C9165gb.m42955k(obj, (long) (h & 1048575)), m43999k(i));
                            break;
                        }
                }
            }
            C9410wa waVar = this.f45561l;
            waVar.mo38130i(waVar.mo38124c(obj), a8Var);
        } else {
            this.f45562m.mo37561a(obj);
            throw null;
        }
    }

    public final int zza(Object obj) {
        return this.f45556g ? m43985H(obj) : m43984G(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f45550a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m43996h(r1)
            int[] r4 = r8.f45550a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m43995g(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m43997i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m43997i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m44011w(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43970a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m43997i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m43986I(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m43997i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m43997i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m43983F(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m44010v(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m43982E(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C9165gb.m42955k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C9165gb.m42941B(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43970a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C9165gb.m42952h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C9165gb.m42953i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C9165gb.m42951g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C9165gb.m42950f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C9453z8.m43972c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.wa r0 = r8.f45561l
            java.lang.Object r0 = r0.mo38124c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f45555f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.measurement.f8 r0 = r8.f45562m
            r0.mo37561a(r9)
            r9 = 0
            goto L_0x0245
        L_0x0244:
            throw r9
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9454z9.zzb(java.lang.Object):int");
    }

    public final Object zze() {
        return ((C9330r8) this.f45554e).mo37393y(4, (Object) null, (Object) null);
    }
}
