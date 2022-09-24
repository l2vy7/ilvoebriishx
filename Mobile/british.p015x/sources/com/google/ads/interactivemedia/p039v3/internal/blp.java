package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.blp */
/* compiled from: IMASDK */
final class blp<T> implements bly<T> {

    /* renamed from: a */
    private static final int[] f16638a = new int[0];

    /* renamed from: b */
    private static final Unsafe f16639b = bmv.m16743q();

    /* renamed from: c */
    private final int[] f16640c;

    /* renamed from: d */
    private final Object[] f16641d;

    /* renamed from: e */
    private final int f16642e;

    /* renamed from: f */
    private final int f16643f;

    /* renamed from: g */
    private final bln f16644g;

    /* renamed from: h */
    private final boolean f16645h;

    /* renamed from: i */
    private final boolean f16646i;

    /* renamed from: j */
    private final boolean f16647j;

    /* renamed from: k */
    private final boolean f16648k;

    /* renamed from: l */
    private final int[] f16649l;

    /* renamed from: m */
    private final int f16650m;

    /* renamed from: n */
    private final int f16651n;

    /* renamed from: o */
    private final blb f16652o;

    /* renamed from: p */
    private final bmm<?, ?> f16653p;

    /* renamed from: q */
    private final blr f16654q;

    /* renamed from: r */
    private final bli f16655r;

    /* renamed from: s */
    private final bmw f16656s;

    private blp(int[] iArr, Object[] objArr, int i, int i2, bln bln, boolean z, boolean z2, int[] iArr2, int i3, int i4, blr blr, blb blb, bmm bmm, bmw bmw, bli bli, byte[] bArr, byte[] bArr2) {
        bln bln2 = bln;
        bmw bmw2 = bmw;
        this.f16640c = iArr;
        this.f16641d = objArr;
        this.f16642e = i;
        this.f16643f = i2;
        this.f16646i = bln2 instanceof bkl;
        this.f16647j = z;
        this.f16645h = bmw2 != null && bmw.m16763l(bln);
        this.f16648k = false;
        this.f16649l = iArr2;
        this.f16650m = i3;
        this.f16651n = i4;
        this.f16654q = blr;
        this.f16652o = blb;
        this.f16653p = bmm;
        this.f16656s = bmw2;
        this.f16644g = bln2;
        this.f16655r = bli;
    }

    /* renamed from: A */
    private final Object m16430A(int i) {
        int i2 = i / 3;
        return this.f16641d[i2 + i2];
    }

    /* renamed from: B */
    private final bko m16431B(int i) {
        int i2 = i / 3;
        return (bko) this.f16641d[i2 + i2 + 1];
    }

    /* renamed from: C */
    private final <UT, UB> UB m16432C(Object obj, int i, UB ub, bmm<UT, UB> bmm) {
        bko B;
        int F = m16435F(i);
        Object n = bmv.m16740n(obj, m16440K(m16436G(i)));
        if (n == null || (B = m16431B(i)) == null) {
            return ub;
        }
        Map<?, ?> c = bli.m16406c(n);
        blg<?, ?> b = bli.m16405b(m16430A(i));
        Iterator<Map.Entry<?, ?>> it = c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!B.mo15404a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = bmn.m16672b();
                }
                int j = bli.m16413j(b, next.getKey(), next.getValue());
                bjq bjq = bjq.f16482b;
                byte[] bArr = new byte[j];
                bjw t = bjw.m16203t(bArr);
                try {
                    bli.m16412i(bjr.m16070b(t), b, next.getKey(), next.getValue());
                    ((bmn) ub).mo15514i(bnd.m16789c(F, 2), bjr.m16069a(t, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: D */
    private static boolean m16433D(Object obj, int i, bly bly) {
        return bly.mo15457l(bmv.m16740n(obj, m16440K(i)));
    }

    /* renamed from: E */
    private final void m16434E(Object obj, int i, blx blx) throws IOException {
        if (m16439J(i)) {
            bmv.m16741o(obj, m16440K(i), blx.mo15281n());
        } else if (this.f16646i) {
            bmv.m16741o(obj, m16440K(i), blx.mo15280m());
        } else {
            bmv.m16741o(obj, m16440K(i), blx.mo15284q());
        }
    }

    /* renamed from: F */
    private final int m16435F(int i) {
        return this.f16640c[i];
    }

    /* renamed from: G */
    private final int m16436G(int i) {
        return this.f16640c[i + 1];
    }

    /* renamed from: H */
    private final int m16437H(int i) {
        return this.f16640c[i + 2];
    }

    /* renamed from: I */
    private static int m16438I(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: J */
    private static boolean m16439J(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: K */
    private static long m16440K(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: L */
    private static <T> double m16441L(T t, long j) {
        return ((Double) bmv.m16740n(t, j)).doubleValue();
    }

    /* renamed from: M */
    private static <T> float m16442M(T t, long j) {
        return ((Float) bmv.m16740n(t, j)).floatValue();
    }

    /* renamed from: N */
    private static <T> int m16443N(T t, long j) {
        return ((Integer) bmv.m16740n(t, j)).intValue();
    }

    /* renamed from: O */
    private static <T> long m16444O(T t, long j) {
        return ((Long) bmv.m16740n(t, j)).longValue();
    }

    /* renamed from: P */
    private static <T> boolean m16445P(T t, long j) {
        return ((Boolean) bmv.m16740n(t, j)).booleanValue();
    }

    /* renamed from: Q */
    private final boolean m16446Q(T t, T t2, int i) {
        return m16448S(t, i) == m16448S(t2, i);
    }

    /* renamed from: R */
    private final boolean m16447R(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m16448S(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: S */
    private final boolean m16448S(T t, int i) {
        int H = m16437H(i);
        long j = (long) (1048575 & H);
        if (j != 1048575) {
            return (bmv.m16730d(t, j) & (1 << (H >>> 20))) != 0;
        }
        int G = m16436G(i);
        long K = m16440K(G);
        switch (m16438I(G)) {
            case 0:
                return bmv.m16738l(t, K) != 0.0d;
            case 1:
                return bmv.m16736j(t, K) != 0.0f;
            case 2:
                return bmv.m16732f(t, K) != 0;
            case 3:
                return bmv.m16732f(t, K) != 0;
            case 4:
                return bmv.m16730d(t, K) != 0;
            case 5:
                return bmv.m16732f(t, K) != 0;
            case 6:
                return bmv.m16730d(t, K) != 0;
            case 7:
                return bmv.m16734h(t, K);
            case 8:
                Object n = bmv.m16740n(t, K);
                if (n instanceof String) {
                    return !((String) n).isEmpty();
                }
                if (n instanceof bjq) {
                    return !bjq.f16482b.equals(n);
                }
                throw new IllegalArgumentException();
            case 9:
                return bmv.m16740n(t, K) != null;
            case 10:
                return !bjq.f16482b.equals(bmv.m16740n(t, K));
            case 11:
                return bmv.m16730d(t, K) != 0;
            case 12:
                return bmv.m16730d(t, K) != 0;
            case 13:
                return bmv.m16730d(t, K) != 0;
            case 14:
                return bmv.m16732f(t, K) != 0;
            case 15:
                return bmv.m16730d(t, K) != 0;
            case 16:
                return bmv.m16732f(t, K) != 0;
            case 17:
                return bmv.m16740n(t, K) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: T */
    private final void m16449T(T t, int i) {
        int H = m16437H(i);
        long j = (long) (1048575 & H);
        if (j != 1048575) {
            bmv.m16731e(t, j, (1 << (H >>> 20)) | bmv.m16730d(t, j));
        }
    }

    /* renamed from: U */
    private final boolean m16450U(T t, int i, int i2) {
        return bmv.m16730d(t, (long) (m16437H(i2) & 1048575)) == i;
    }

    /* renamed from: V */
    private final void m16451V(T t, int i, int i2) {
        bmv.m16731e(t, (long) (m16437H(i2) & 1048575), i);
    }

    /* renamed from: W */
    private final int m16452W(int i) {
        if (i < this.f16642e || i > this.f16643f) {
            return -1;
        }
        return m16454Y(i, 0);
    }

    /* renamed from: X */
    private final int m16453X(int i, int i2) {
        if (i < this.f16642e || i > this.f16643f) {
            return -1;
        }
        return m16454Y(i, i2);
    }

    /* renamed from: Y */
    private final int m16454Y(int i, int i2) {
        int length = (this.f16640c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int F = m16435F(i4);
            if (i == F) {
                return i4;
            }
            if (i < F) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: Z */
    private static final <UT, UB> int m16455Z(bmm<UT, UB> bmm, T t) {
        return ((bmn) bmm.mo15505e(t)).mo15511g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0298, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ae, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e1, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0304, code lost:
        if (r0 != r15) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017b, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r19;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cd, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fa, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fd, code lost:
        r2 = r4;
        r28 = r10;
        r20 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16456aa(T r31, byte[] r32, int r33, int r34, com.google.ads.interactivemedia.p039v3.internal.bjg r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f16639b
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0017:
            if (r0 >= r13) goto L_0x032a
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16072d(r0, r12, r3, r11)
            int r3 = r11.f16468a
            r4 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r4 = r3
        L_0x002c:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m16453X(r5, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m16452W(r5)
        L_0x003d:
            r2 = r0
            if (r2 != r10) goto L_0x004b
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = -1
            r20 = 0
            goto L_0x0307
        L_0x004b:
            int[] r0 = r15.f16640c
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m16438I(r1)
            r18 = r9
            long r8 = m16440K(r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0206
            int[] r10 = r15.f16640c
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x008e
            r23 = r1
            r19 = r2
            if (r7 == r13) goto L_0x007f
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r18
        L_0x0081:
            if (r10 == r13) goto L_0x0088
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0094
        L_0x008e:
            r23 = r1
            r19 = r2
            r10 = r18
        L_0x0094:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01e8;
                case 1: goto L_0x01d5;
                case 2: goto L_0x01b7;
                case 3: goto L_0x01b7;
                case 4: goto L_0x01a4;
                case 5: goto L_0x0188;
                case 6: goto L_0x0167;
                case 7: goto L_0x014a;
                case 8: goto L_0x0129;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00e5;
                case 11: goto L_0x01a4;
                case 12: goto L_0x00d4;
                case 13: goto L_0x0167;
                case 14: goto L_0x0188;
                case 15: goto L_0x00bf;
                case 16: goto L_0x00a1;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            goto L_0x01fd
        L_0x00a1:
            if (r3 != 0) goto L_0x00ba
            int r17 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r4, r11)
            long r0 = r11.f16469b
            long r4 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16091c(r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01cd
        L_0x00ba:
            r13 = r19
            r19 = r33
            goto L_0x0124
        L_0x00bf:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0124
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r4, r11)
            int r1 = r11.f16468a
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16090b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01fa
        L_0x00d4:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0124
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r4, r11)
            int r1 = r11.f16468a
            r10.putInt(r14, r8, r1)
            goto L_0x01fa
        L_0x00e5:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0124
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16080l(r12, r4, r11)
            java.lang.Object r1 = r11.f16470c
            r10.putObject(r14, r8, r1)
            goto L_0x01fa
        L_0x00f7:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0122
            com.google.ads.interactivemedia.v3.internal.bly r0 = r15.m16473z(r13)
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16081m(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0118
            java.lang.Object r1 = r11.f16470c
            r10.putObject(r14, r8, r1)
            goto L_0x017b
        L_0x0118:
            java.lang.Object r3 = r11.f16470c
            java.lang.Object r1 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x017b
        L_0x0122:
            r2 = r34
        L_0x0124:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01fd
        L_0x0129:
            r2 = r34
            r13 = r19
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r0) goto L_0x01fd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0140
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16078j(r12, r4, r11)
            goto L_0x0144
        L_0x0140:
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16079k(r12, r4, r11)
        L_0x0144:
            java.lang.Object r1 = r11.f16470c
            r10.putObject(r14, r8, r1)
            goto L_0x017b
        L_0x014a:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fd
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r4, r11)
            long r3 = r11.f16469b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r5 = 0
        L_0x0163:
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16735i(r14, r8, r5)
            goto L_0x017b
        L_0x0167:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x01fd
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16074f(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x017b:
            r6 = r6 | r21
            r9 = r10
            r1 = r19
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x0017
        L_0x0188:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x01fd
            long r22 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16075g(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01fa
        L_0x01a4:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fd
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r4, r11)
            int r1 = r11.f16468a
            r10.putInt(r14, r8, r1)
            goto L_0x01fa
        L_0x01b7:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x01fd
            int r17 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r4, r11)
            long r4 = r11.f16469b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01cd:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x024a
        L_0x01d5:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x01fd
            float r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16077i(r12, r4)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16737k(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01fa
        L_0x01e8:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x01fd
            double r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16076h(r12, r4)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16739m(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01fa:
            r6 = r6 | r21
            goto L_0x0248
        L_0x01fd:
            r2 = r4
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x0307
        L_0x0206:
            r19 = r33
            r23 = r1
            r13 = r2
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x025e
            r1 = 2
            if (r3 != r1) goto L_0x0251
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.ads.interactivemedia.v3.internal.bkq r0 = (com.google.ads.interactivemedia.p039v3.internal.bkq) r0
            boolean r1 = r0.mo15173a()
            if (r1 != 0) goto L_0x0234
            int r1 = r0.size()
            if (r1 != 0) goto L_0x022c
            r1 = 10
            goto L_0x022d
        L_0x022c:
            int r1 = r1 + r1
        L_0x022d:
            com.google.ads.interactivemedia.v3.internal.bkq r0 = r0.mo15190e(r1)
            r10.putObject(r14, r8, r0)
        L_0x0234:
            r5 = r0
            com.google.ads.interactivemedia.v3.internal.bly r0 = r15.m16473z(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16085q(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0248:
            r9 = r10
            r2 = r13
        L_0x024a:
            r1 = r19
            r10 = -1
            r13 = r34
            goto L_0x0017
        L_0x0251:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02e4
        L_0x025e:
            r1 = 49
            if (r0 > r1) goto L_0x02b0
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m16470w(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02ae
        L_0x029a:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x0325
        L_0x02ae:
            r2 = r0
            goto L_0x02e5
        L_0x02b0:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02ea
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02e4
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            int r0 = r0.m16471x(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02ae
            goto L_0x029a
        L_0x02e4:
            r2 = r15
        L_0x02e5:
            r6 = r24
            r7 = r25
            goto L_0x0307
        L_0x02ea:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.m16472y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02ae
            goto L_0x029a
        L_0x0307:
            com.google.ads.interactivemedia.v3.internal.bmn r4 = m16459h(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16086r(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
        L_0x0325:
            r9 = r28
            r10 = -1
            goto L_0x0017
        L_0x032a:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x033d
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x033d:
            r1 = r34
            if (r0 != r1) goto L_0x0342
            return
        L_0x0342:
            com.google.ads.interactivemedia.v3.internal.bkt r0 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16354g()
            goto L_0x0348
        L_0x0347:
            throw r0
        L_0x0348:
            goto L_0x0347
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16456aa(java.lang.Object, byte[], int, int, com.google.ads.interactivemedia.v3.internal.bjg):void");
    }

    /* renamed from: ab */
    private static final void m16457ab(int i, Object obj, bne bne) throws IOException {
        if (obj instanceof String) {
            bne.mo15344m(i, (String) obj);
        } else {
            bne.mo15345n(i, (bjq) obj);
        }
    }

    /* renamed from: ac */
    private static final <UT, UB> void m16458ac(bmm<UT, UB> bmm, T t, bne bne) throws IOException {
        ((bmn) bmm.mo15505e(t)).mo15508e(bne);
    }

    /* renamed from: h */
    static bmn m16459h(Object obj) {
        bkl bkl = (bkl) obj;
        bmn bmn = bkl.f16594c;
        if (bmn != bmn.m16671a()) {
            return bmn;
        }
        bmn b = bmn.m16672b();
        bkl.f16594c = b;
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.ads.interactivemedia.p039v3.internal.blp<T> m16460m(com.google.ads.interactivemedia.p039v3.internal.blw r34, com.google.ads.interactivemedia.p039v3.internal.blr r35, com.google.ads.interactivemedia.p039v3.internal.blb r36, com.google.ads.interactivemedia.p039v3.internal.bmm<?, ?> r37, com.google.ads.interactivemedia.p039v3.internal.bmw r38, com.google.ads.interactivemedia.p039v3.internal.bli r39) {
        /*
            int r0 = r34.mo15446c()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo15462d()
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
            int[] r6 = f16638a
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
            sun.misc.Unsafe r15 = f16639b
            java.lang.Object[] r17 = r34.mo15463e()
            com.google.ads.interactivemedia.v3.internal.bln r18 = r34.mo15445b()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r22 = r14 + r9
            r21 = r14
            r23 = r22
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
            java.lang.reflect.Field r12 = m16462o(r1, r12)
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
            java.lang.reflect.Field r7 = m16462o(r1, r7)
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
            java.lang.reflect.Field r8 = m16462o(r1, r8)
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
            int r12 = r21 + 1
            r13[r21] = r9
            int r21 = r9 / 3
            int r21 = r21 + r21
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r21] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r21 = r21 + 1
            r27 = r17[r27]
            r11[r21] = r27
            r21 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r21 = r12
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
            java.lang.reflect.Field r11 = m16462o(r1, r11)
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
            com.google.ads.interactivemedia.v3.internal.blp r0 = new com.google.ads.interactivemedia.v3.internal.blp
            r4 = r0
            com.google.ads.interactivemedia.v3.internal.bln r9 = r34.mo15445b()
            r11 = 0
            r1 = r29
            r20 = 0
            r21 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r22
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16460m(com.google.ads.interactivemedia.v3.internal.blw, com.google.ads.interactivemedia.v3.internal.blr, com.google.ads.interactivemedia.v3.internal.blb, com.google.ads.interactivemedia.v3.internal.bmm, com.google.ads.interactivemedia.v3.internal.bmw, com.google.ads.interactivemedia.v3.internal.bli):com.google.ads.interactivemedia.v3.internal.blp");
    }

    /* renamed from: n */
    static <T> blp<T> m16461n(blk blk, blr blr, blb blb, bmm<?, ?> bmm, bmw bmw, bli bli) {
        if (blk instanceof blw) {
            return m16460m((blw) blk, blr, blb, bmm, bmw, bli);
        }
        bmj bmj = (bmj) blk;
        throw null;
    }

    /* renamed from: o */
    private static Field m16462o(Class<?> cls, String str) {
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

    /* renamed from: p */
    private final void m16463p(T t, T t2, int i) {
        long K = m16440K(m16436G(i));
        if (m16448S(t2, i)) {
            Object n = bmv.m16740n(t, K);
            Object n2 = bmv.m16740n(t2, K);
            if (n != null && n2 != null) {
                bmv.m16741o(t, K, bkr.m16345h(n, n2));
                m16449T(t, i);
            } else if (n2 != null) {
                bmv.m16741o(t, K, n2);
                m16449T(t, i);
            }
        }
    }

    /* renamed from: q */
    private final void m16464q(T t, T t2, int i) {
        int G = m16436G(i);
        int F = m16435F(i);
        long K = m16440K(G);
        if (m16450U(t2, F, i)) {
            Object n = m16450U(t, F, i) ? bmv.m16740n(t, K) : null;
            Object n2 = bmv.m16740n(t2, K);
            if (n != null && n2 != null) {
                bmv.m16741o(t, K, bkr.m16345h(n, n2));
                m16451V(t, F, i);
            } else if (n2 != null) {
                bmv.m16741o(t, K, n2);
                m16451V(t, F, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a9, code lost:
        r4 = r4 + ((r8 + r9) + r7);
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m16465r(T r14) {
        /*
            r13 = this;
            sun.misc.Unsafe r0 = f16639b
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r13.f16640c
            int r7 = r7.length
            if (r3 >= r7) goto L_0x046b
            int r7 = r13.m16436G(r3)
            int r8 = r13.m16435F(r3)
            int r9 = m16438I(r7)
            r10 = 17
            if (r9 > r10) goto L_0x0037
            int[] r10 = r13.f16640c
            int r11 = r3 + 2
            r10 = r10[r11]
            r11 = r10 & r1
            r12 = 1
            int r10 = r10 >>> 20
            int r10 = r12 << r10
            if (r11 == r6) goto L_0x0038
            long r5 = (long) r11
            int r5 = r0.getInt(r14, r5)
            r6 = r11
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            long r11 = m16440K(r7)
            switch(r9) {
                case 0: goto L_0x045d;
                case 1: goto L_0x0453;
                case 2: goto L_0x0445;
                case 3: goto L_0x0437;
                case 4: goto L_0x0429;
                case 5: goto L_0x041f;
                case 6: goto L_0x0415;
                case 7: goto L_0x040b;
                case 8: goto L_0x03ef;
                case 9: goto L_0x03de;
                case 10: goto L_0x03cf;
                case 11: goto L_0x03c2;
                case 12: goto L_0x03b5;
                case 13: goto L_0x03ac;
                case 14: goto L_0x03a3;
                case 15: goto L_0x0396;
                case 16: goto L_0x0389;
                case 17: goto L_0x0376;
                case 18: goto L_0x0369;
                case 19: goto L_0x035e;
                case 20: goto L_0x0353;
                case 21: goto L_0x0348;
                case 22: goto L_0x033d;
                case 23: goto L_0x0332;
                case 24: goto L_0x0327;
                case 25: goto L_0x031c;
                case 26: goto L_0x0311;
                case 27: goto L_0x0302;
                case 28: goto L_0x02f6;
                case 29: goto L_0x02ea;
                case 30: goto L_0x02de;
                case 31: goto L_0x02d2;
                case 32: goto L_0x02c6;
                case 33: goto L_0x02ba;
                case 34: goto L_0x02ae;
                case 35: goto L_0x0295;
                case 36: goto L_0x0280;
                case 37: goto L_0x026b;
                case 38: goto L_0x0256;
                case 39: goto L_0x0241;
                case 40: goto L_0x022c;
                case 41: goto L_0x0216;
                case 42: goto L_0x0200;
                case 43: goto L_0x01ea;
                case 44: goto L_0x01d4;
                case 45: goto L_0x01be;
                case 46: goto L_0x01a8;
                case 47: goto L_0x0192;
                case 48: goto L_0x017c;
                case 49: goto L_0x016c;
                case 50: goto L_0x015f;
                case 51: goto L_0x0153;
                case 52: goto L_0x0147;
                case 53: goto L_0x0137;
                case 54: goto L_0x0127;
                case 55: goto L_0x0117;
                case 56: goto L_0x010b;
                case 57: goto L_0x00ff;
                case 58: goto L_0x00f3;
                case 59: goto L_0x00d5;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00af;
                case 62: goto L_0x009f;
                case 63: goto L_0x008f;
                case 64: goto L_0x0083;
                case 65: goto L_0x0077;
                case 66: goto L_0x0067;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0467
        L_0x0041:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bln r7 = (com.google.ads.interactivemedia.p039v3.internal.bln) r7
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16194Y(r8, r7, r9)
            goto L_0x0373
        L_0x0057:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            long r9 = m16444O(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16176D(r8, r9)
            goto L_0x0373
        L_0x0067:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = m16443N(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16173A(r8, r7)
            goto L_0x0373
        L_0x0077:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16196aA(r8)
            goto L_0x0373
        L_0x0083:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16202az(r8)
            goto L_0x0373
        L_0x008f:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = m16443N(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16177E(r8, r7)
            goto L_0x0373
        L_0x009f:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = m16443N(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16205z(r8, r7)
            goto L_0x0373
        L_0x00af:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bjq r7 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r8, r7)
            goto L_0x0373
        L_0x00c1:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16576E(r8, r7, r9)
            goto L_0x0373
        L_0x00d5:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            boolean r9 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.bjq
            if (r9 == 0) goto L_0x00eb
            com.google.ads.interactivemedia.v3.internal.bjq r7 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r8, r7)
            goto L_0x0373
        L_0x00eb:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16178F(r8, r7)
            goto L_0x0373
        L_0x00f3:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16197au(r8)
            goto L_0x0373
        L_0x00ff:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16199aw(r8)
            goto L_0x0373
        L_0x010b:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16200ax(r8)
            goto L_0x0373
        L_0x0117:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = m16443N(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16204y(r8, r7)
            goto L_0x0373
        L_0x0127:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            long r9 = m16444O(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16175C(r8, r9)
            goto L_0x0373
        L_0x0137:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            long r9 = m16444O(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16174B(r8, r9)
            goto L_0x0373
        L_0x0147:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16201ay(r8)
            goto L_0x0373
        L_0x0153:
            boolean r7 = r13.m16450U(r14, r8, r3)
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16198av(r8)
            goto L_0x0373
        L_0x015f:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.lang.Object r8 = r13.m16430A(r3)
            com.google.ads.interactivemedia.p039v3.internal.bli.m16407d(r7, r8)
            goto L_0x0467
        L_0x016c:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16579H(r8, r7, r9)
            goto L_0x0373
        L_0x017c:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16621v(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0192:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16625z(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x01a8:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x01be:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x01d4:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16622w(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x01ea:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16624y(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0200:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16574C(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0216:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x022c:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0241:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16623x(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0256:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16620u(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x026b:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16619t(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0280:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
            goto L_0x02a9
        L_0x0295:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r7)
            if (r7 <= 0) goto L_0x0467
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r8)
            int r9 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r7)
        L_0x02a9:
            int r8 = r8 + r9
            int r8 = r8 + r7
            int r4 = r4 + r8
            goto L_0x0467
        L_0x02ae:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16595X(r8, r7)
            goto L_0x0373
        L_0x02ba:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16594W(r8, r7)
            goto L_0x0373
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r8, r7)
            goto L_0x0373
        L_0x02d2:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r8, r7)
            goto L_0x0373
        L_0x02de:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16589R(r8, r7)
            goto L_0x0373
        L_0x02ea:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16596Y(r8, r7)
            goto L_0x0373
        L_0x02f6:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16578G(r8, r7)
            goto L_0x0373
        L_0x0302:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16577F(r8, r7, r9)
            goto L_0x0373
        L_0x0311:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16575D(r8, r7)
            goto L_0x0373
        L_0x031c:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16588Q(r8, r7)
            goto L_0x0373
        L_0x0327:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r8, r7)
            goto L_0x0373
        L_0x0332:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r8, r7)
            goto L_0x0373
        L_0x033d:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16592U(r8, r7)
            goto L_0x0373
        L_0x0348:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16597Z(r8, r7)
            goto L_0x0373
        L_0x0353:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16593V(r8, r7)
            goto L_0x0373
        L_0x035e:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r8, r7)
            goto L_0x0373
        L_0x0369:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r8, r7)
        L_0x0373:
            int r4 = r4 + r7
            goto L_0x0467
        L_0x0376:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bln r7 = (com.google.ads.interactivemedia.p039v3.internal.bln) r7
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16194Y(r8, r7, r9)
            goto L_0x0373
        L_0x0389:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            long r9 = r0.getLong(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16176D(r8, r9)
            goto L_0x0373
        L_0x0396:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16173A(r8, r7)
            goto L_0x0373
        L_0x03a3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16196aA(r8)
            goto L_0x0373
        L_0x03ac:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16202az(r8)
            goto L_0x0373
        L_0x03b5:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16177E(r8, r7)
            goto L_0x0373
        L_0x03c2:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16205z(r8, r7)
            goto L_0x0373
        L_0x03cf:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bjq r7 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r8, r7)
            goto L_0x0373
        L_0x03de:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.ads.interactivemedia.v3.internal.bly r9 = r13.m16473z(r3)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bma.m16576E(r8, r7, r9)
            goto L_0x0373
        L_0x03ef:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            java.lang.Object r7 = r0.getObject(r14, r11)
            boolean r9 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.bjq
            if (r9 == 0) goto L_0x0403
            com.google.ads.interactivemedia.v3.internal.bjq r7 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r8, r7)
            goto L_0x0373
        L_0x0403:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16178F(r8, r7)
            goto L_0x0373
        L_0x040b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16197au(r8)
            goto L_0x0373
        L_0x0415:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16199aw(r8)
            goto L_0x0373
        L_0x041f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16200ax(r8)
            goto L_0x0373
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16204y(r8, r7)
            goto L_0x0373
        L_0x0437:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            long r9 = r0.getLong(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16175C(r8, r9)
            goto L_0x0373
        L_0x0445:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            long r9 = r0.getLong(r14, r11)
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16174B(r8, r9)
            goto L_0x0373
        L_0x0453:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16201ay(r8)
            goto L_0x0373
        L_0x045d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0467
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16198av(r8)
            goto L_0x0373
        L_0x0467:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x046b:
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r0 = r13.f16653p
            int r0 = m16455Z(r0, r14)
            int r4 = r4 + r0
            boolean r0 = r13.f16645h
            if (r0 != 0) goto L_0x0477
            return r4
        L_0x0477:
            com.google.ads.interactivemedia.p039v3.internal.bmw.m16761j(r14)
            r14 = 0
            goto L_0x047d
        L_0x047c:
            throw r14
        L_0x047d:
            goto L_0x047c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16465r(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        r2 = r2 + ((r4 + r5) + r3);
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m16466s(T r10) {
        /*
            r9 = this;
            sun.misc.Unsafe r0 = f16639b
            r1 = 0
            r2 = 0
        L_0x0004:
            int[] r3 = r9.f16640c
            int r3 = r3.length
            if (r1 >= r3) goto L_0x045d
            int r3 = r9.m16436G(r1)
            int r4 = m16438I(r3)
            int r5 = r9.m16435F(r1)
            long r6 = m16440K(r3)
            com.google.ads.interactivemedia.v3.internal.bkg r3 = com.google.ads.interactivemedia.p039v3.internal.bkg.DOUBLE_LIST_PACKED
            int r3 = r3.mo15375a()
            if (r4 < r3) goto L_0x002f
            com.google.ads.interactivemedia.v3.internal.bkg r3 = com.google.ads.interactivemedia.p039v3.internal.bkg.SINT64_LIST_PACKED
            int r3 = r3.mo15375a()
            if (r4 > r3) goto L_0x002f
            int[] r3 = r9.f16640c
            int r8 = r1 + 2
            r3 = r3[r8]
        L_0x002f:
            switch(r4) {
                case 0: goto L_0x044d;
                case 1: goto L_0x0441;
                case 2: goto L_0x0431;
                case 3: goto L_0x0421;
                case 4: goto L_0x0411;
                case 5: goto L_0x0405;
                case 6: goto L_0x03f9;
                case 7: goto L_0x03ed;
                case 8: goto L_0x03cf;
                case 9: goto L_0x03bb;
                case 10: goto L_0x03aa;
                case 11: goto L_0x039b;
                case 12: goto L_0x038c;
                case 13: goto L_0x0381;
                case 14: goto L_0x0376;
                case 15: goto L_0x0367;
                case 16: goto L_0x0358;
                case 17: goto L_0x0343;
                case 18: goto L_0x0338;
                case 19: goto L_0x032f;
                case 20: goto L_0x0326;
                case 21: goto L_0x031d;
                case 22: goto L_0x0314;
                case 23: goto L_0x030b;
                case 24: goto L_0x0302;
                case 25: goto L_0x02f9;
                case 26: goto L_0x02f0;
                case 27: goto L_0x02e3;
                case 28: goto L_0x02da;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02c7;
                case 31: goto L_0x02bd;
                case 32: goto L_0x02b3;
                case 33: goto L_0x02a9;
                case 34: goto L_0x029f;
                case 35: goto L_0x0286;
                case 36: goto L_0x0271;
                case 37: goto L_0x025c;
                case 38: goto L_0x0247;
                case 39: goto L_0x0232;
                case 40: goto L_0x021d;
                case 41: goto L_0x0207;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01db;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01af;
                case 46: goto L_0x0199;
                case 47: goto L_0x0183;
                case 48: goto L_0x016d;
                case 49: goto L_0x015f;
                case 50: goto L_0x0152;
                case 51: goto L_0x0146;
                case 52: goto L_0x013a;
                case 53: goto L_0x012a;
                case 54: goto L_0x011a;
                case 55: goto L_0x010a;
                case 56: goto L_0x00fe;
                case 57: goto L_0x00f2;
                case 58: goto L_0x00e6;
                case 59: goto L_0x00c8;
                case 60: goto L_0x00b4;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0092;
                case 63: goto L_0x0082;
                case 64: goto L_0x0076;
                case 65: goto L_0x006a;
                case 66: goto L_0x005a;
                case 67: goto L_0x004a;
                case 68: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0459
        L_0x0034:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bln r3 = (com.google.ads.interactivemedia.p039v3.internal.bln) r3
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16194Y(r5, r3, r4)
            goto L_0x0340
        L_0x004a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = m16444O(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16176D(r5, r3)
            goto L_0x0340
        L_0x005a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = m16443N(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16173A(r5, r3)
            goto L_0x0340
        L_0x006a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16196aA(r5)
            goto L_0x0340
        L_0x0076:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16202az(r5)
            goto L_0x0340
        L_0x0082:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = m16443N(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16177E(r5, r3)
            goto L_0x0340
        L_0x0092:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = m16443N(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16205z(r5, r3)
            goto L_0x0340
        L_0x00a2:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bjq r3 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r5, r3)
            goto L_0x0340
        L_0x00b4:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16576E(r5, r3, r4)
            goto L_0x0340
        L_0x00c8:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            boolean r4 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.bjq
            if (r4 == 0) goto L_0x00de
            com.google.ads.interactivemedia.v3.internal.bjq r3 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r5, r3)
            goto L_0x0340
        L_0x00de:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16178F(r5, r3)
            goto L_0x0340
        L_0x00e6:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16197au(r5)
            goto L_0x0340
        L_0x00f2:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16199aw(r5)
            goto L_0x0340
        L_0x00fe:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16200ax(r5)
            goto L_0x0340
        L_0x010a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = m16443N(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16204y(r5, r3)
            goto L_0x0340
        L_0x011a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = m16444O(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16175C(r5, r3)
            goto L_0x0340
        L_0x012a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = m16444O(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16174B(r5, r3)
            goto L_0x0340
        L_0x013a:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16201ay(r5)
            goto L_0x0340
        L_0x0146:
            boolean r3 = r9.m16450U(r10, r5, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16198av(r5)
            goto L_0x0340
        L_0x0152:
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            java.lang.Object r4 = r9.m16430A(r1)
            com.google.ads.interactivemedia.p039v3.internal.bli.m16407d(r3, r4)
            goto L_0x0459
        L_0x015f:
            java.util.List r3 = m16467t(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16579H(r5, r3, r4)
            goto L_0x0340
        L_0x016d:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16621v(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0183:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16625z(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0199:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x01af:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x01c5:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16622w(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x01db:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16624y(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x01f1:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16574C(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0207:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x021d:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0232:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16623x(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0247:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16620u(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x025c:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16619t(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0271:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16572A(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
            goto L_0x029a
        L_0x0286:
            java.lang.Object r3 = r0.getObject(r10, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16573B(r3)
            if (r3 <= 0) goto L_0x0459
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16181I(r5)
            int r5 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16183K(r3)
        L_0x029a:
            int r4 = r4 + r5
            int r4 = r4 + r3
            int r2 = r2 + r4
            goto L_0x0459
        L_0x029f:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16595X(r5, r3)
            goto L_0x0340
        L_0x02a9:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16594W(r5, r3)
            goto L_0x0340
        L_0x02b3:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r5, r3)
            goto L_0x0340
        L_0x02bd:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r5, r3)
            goto L_0x0340
        L_0x02c7:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16589R(r5, r3)
            goto L_0x0340
        L_0x02d1:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16596Y(r5, r3)
            goto L_0x0340
        L_0x02da:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16578G(r5, r3)
            goto L_0x0340
        L_0x02e3:
            java.util.List r3 = m16467t(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16577F(r5, r3, r4)
            goto L_0x0340
        L_0x02f0:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16575D(r5, r3)
            goto L_0x0340
        L_0x02f9:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16588Q(r5, r3)
            goto L_0x0340
        L_0x0302:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r5, r3)
            goto L_0x0340
        L_0x030b:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r5, r3)
            goto L_0x0340
        L_0x0314:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16592U(r5, r3)
            goto L_0x0340
        L_0x031d:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16597Z(r5, r3)
            goto L_0x0340
        L_0x0326:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16593V(r5, r3)
            goto L_0x0340
        L_0x032f:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16590S(r5, r3)
            goto L_0x0340
        L_0x0338:
            java.util.List r3 = m16467t(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16591T(r5, r3)
        L_0x0340:
            int r2 = r2 + r3
            goto L_0x0459
        L_0x0343:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bln r3 = (com.google.ads.interactivemedia.p039v3.internal.bln) r3
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16194Y(r5, r3, r4)
            goto L_0x0340
        L_0x0358:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16176D(r5, r3)
            goto L_0x0340
        L_0x0367:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16173A(r5, r3)
            goto L_0x0340
        L_0x0376:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16196aA(r5)
            goto L_0x0340
        L_0x0381:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16202az(r5)
            goto L_0x0340
        L_0x038c:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16177E(r5, r3)
            goto L_0x0340
        L_0x039b:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16205z(r5, r3)
            goto L_0x0340
        L_0x03aa:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bjq r3 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r5, r3)
            goto L_0x0340
        L_0x03bb:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            com.google.ads.interactivemedia.v3.internal.bly r4 = r9.m16473z(r1)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16576E(r5, r3, r4)
            goto L_0x0340
        L_0x03cf:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r10, r6)
            boolean r4 = r3 instanceof com.google.ads.interactivemedia.p039v3.internal.bjq
            if (r4 == 0) goto L_0x03e5
            com.google.ads.interactivemedia.v3.internal.bjq r3 = (com.google.ads.interactivemedia.p039v3.internal.bjq) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16179G(r5, r3)
            goto L_0x0340
        L_0x03e5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16178F(r5, r3)
            goto L_0x0340
        L_0x03ed:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16197au(r5)
            goto L_0x0340
        L_0x03f9:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16199aw(r5)
            goto L_0x0340
        L_0x0405:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16200ax(r5)
            goto L_0x0340
        L_0x0411:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16204y(r5, r3)
            goto L_0x0340
        L_0x0421:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16175C(r5, r3)
            goto L_0x0340
        L_0x0431:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r10, r6)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16174B(r5, r3)
            goto L_0x0340
        L_0x0441:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16201ay(r5)
            goto L_0x0340
        L_0x044d:
            boolean r3 = r9.m16448S(r10, r1)
            if (r3 == 0) goto L_0x0459
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bjw.m16198av(r5)
            goto L_0x0340
        L_0x0459:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x045d:
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r0 = r9.f16653p
            int r10 = m16455Z(r0, r10)
            int r2 = r2 + r10
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16466s(java.lang.Object):int");
    }

    /* renamed from: t */
    private static List<?> m16467t(Object obj, long j) {
        return (List) bmv.m16740n(obj, j);
    }

    /* renamed from: u */
    private final void m16468u(T t, bne bne) throws IOException {
        int i;
        T t2 = t;
        bne bne2 = bne;
        if (!this.f16645h) {
            int length = this.f16640c.length;
            Unsafe unsafe = f16639b;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int G = m16436G(i3);
                int F = m16435F(i3);
                int I = m16438I(G);
                if (I <= 17) {
                    int i6 = this.f16640c[i3 + 2];
                    int i7 = i6 & i2;
                    if (i7 != i5) {
                        i4 = unsafe.getInt(t2, (long) i7);
                        i5 = i7;
                    }
                    i = 1 << (i6 >>> 20);
                } else {
                    i = 0;
                }
                long K = m16440K(G);
                switch (I) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            bne2.mo15337f(F, bmv.m16738l(t2, K));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            bne2.mo15336e(F, bmv.m16736j(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            bne2.mo15334c(F, unsafe.getLong(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            bne2.mo15339h(F, unsafe.getLong(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            bne2.mo15340i(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            bne2.mo15341j(F, unsafe.getLong(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            bne2.mo15342k(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            bne2.mo15343l(F, bmv.m16734h(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m16457ab(F, unsafe.getObject(t2, K), bne2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            bne2.mo15349r(F, unsafe.getObject(t2, K), m16473z(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            bne2.mo15345n(F, (bjq) unsafe.getObject(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            bne2.mo15346o(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            bne2.mo15338g(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            bne2.mo15333b(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            bne2.mo15335d(F, unsafe.getLong(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            bne2.mo15347p(F, unsafe.getInt(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            bne2.mo15348q(F, unsafe.getLong(t2, K));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            bne2.mo15350s(F, unsafe.getObject(t2, K), m16473z(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        bma.m16601b(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 19:
                        bma.m16602c(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 20:
                        bma.m16603d(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 21:
                        bma.m16604e(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 22:
                        bma.m16608i(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 23:
                        bma.m16606g(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 24:
                        bma.m16611l(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 25:
                        bma.m16614o(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        continue;
                    case 26:
                        bma.m16615p(m16435F(i3), (List) unsafe.getObject(t2, K), bne2);
                        break;
                    case 27:
                        bma.m16617r(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, m16473z(i3));
                        break;
                    case 28:
                        bma.m16616q(m16435F(i3), (List) unsafe.getObject(t2, K), bne2);
                        break;
                    case 29:
                        bma.m16609j(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 30:
                        bma.m16613n(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 31:
                        bma.m16612m(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 32:
                        bma.m16607h(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 33:
                        bma.m16610k(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 34:
                        bma.m16605f(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, false);
                        break;
                    case 35:
                        bma.m16601b(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 36:
                        bma.m16602c(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 37:
                        bma.m16603d(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 38:
                        bma.m16604e(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 39:
                        bma.m16608i(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 40:
                        bma.m16606g(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 41:
                        bma.m16611l(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 42:
                        bma.m16614o(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 43:
                        bma.m16609j(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 44:
                        bma.m16613n(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 45:
                        bma.m16612m(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 46:
                        bma.m16607h(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 47:
                        bma.m16610k(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 48:
                        bma.m16605f(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, true);
                        break;
                    case 49:
                        bma.m16618s(m16435F(i3), (List) unsafe.getObject(t2, K), bne2, m16473z(i3));
                        break;
                    case 50:
                        m16469v(bne2, F, unsafe.getObject(t2, K), i3);
                        break;
                    case 51:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15337f(F, m16441L(t2, K));
                            break;
                        }
                        break;
                    case 52:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15336e(F, m16442M(t2, K));
                            break;
                        }
                        break;
                    case 53:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15334c(F, m16444O(t2, K));
                            break;
                        }
                        break;
                    case 54:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15339h(F, m16444O(t2, K));
                            break;
                        }
                        break;
                    case 55:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15340i(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 56:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15341j(F, m16444O(t2, K));
                            break;
                        }
                        break;
                    case 57:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15342k(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 58:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15343l(F, m16445P(t2, K));
                            break;
                        }
                        break;
                    case 59:
                        if (m16450U(t2, F, i3)) {
                            m16457ab(F, unsafe.getObject(t2, K), bne2);
                            break;
                        }
                        break;
                    case 60:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15349r(F, unsafe.getObject(t2, K), m16473z(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15345n(F, (bjq) unsafe.getObject(t2, K));
                            break;
                        }
                        break;
                    case 62:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15346o(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 63:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15338g(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 64:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15333b(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 65:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15335d(F, m16444O(t2, K));
                            break;
                        }
                        break;
                    case 66:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15347p(F, m16443N(t2, K));
                            break;
                        }
                        break;
                    case 67:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15348q(F, m16444O(t2, K));
                            break;
                        }
                        break;
                    case 68:
                        if (m16450U(t2, F, i3)) {
                            bne2.mo15350s(F, unsafe.getObject(t2, K), m16473z(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            m16458ac(this.f16653p, t2, bne2);
            return;
        }
        bmw.m16761j(t);
        throw null;
    }

    /* renamed from: v */
    private final <K, V> void m16469v(bne bne, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            bne.mo15332L(i, bli.m16405b(m16430A(i2)), bli.m16404a(obj));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0437 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: w */
    private final int m16470w(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.ads.interactivemedia.p039v3.internal.bjg r29) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = f16639b
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.ads.interactivemedia.v3.internal.bkq r12 = (com.google.ads.interactivemedia.p039v3.internal.bkq) r12
            boolean r13 = r12.mo15173a()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.ads.interactivemedia.v3.internal.bkq r12 = r12.mo15190e(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d5;
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
                case 35: goto L_0x03d5;
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
            if (r6 != r1) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bly r1 = r15.m16473z(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16082n(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f16470c
            r12.add(r8)
            goto L_0x0415
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r1, r7)
            long r4 = r7.f16469b
            long r4 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16091c(r4)
            r12.mo15425f(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0438
        L_0x007b:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r4, r7)
            long r8 = r7.f16469b
            long r8 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16091c(r8)
            r12.mo15425f(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r4, r7)
            long r8 = r7.f16469b
            long r8 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16091c(r8)
            r12.mo15425f(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.ads.interactivemedia.v3.internal.bkm r12 = (com.google.ads.interactivemedia.p039v3.internal.bkm) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r4 = r7.f16468a
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16090b(r4)
            r12.mo15399g(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0438
        L_0x00ca:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bkm r12 = (com.google.ads.interactivemedia.p039v3.internal.bkm) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r4 = r7.f16468a
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16090b(r4)
            r12.mo15399g(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r4 = r7.f16468a
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16090b(r4)
            r12.mo15399g(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16084p(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0437
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16083o(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.ads.interactivemedia.v3.internal.bkl r1 = (com.google.ads.interactivemedia.p039v3.internal.bkl) r1
            com.google.ads.interactivemedia.v3.internal.bmn r3 = r1.f16594c
            com.google.ads.interactivemedia.v3.internal.bmn r4 = com.google.ads.interactivemedia.p039v3.internal.bmn.m16671a()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.ads.interactivemedia.v3.internal.bko r4 = r15.m16431B(r8)
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r5 = r0.f16653p
            r6 = r21
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bma.m16585N(r6, r12, r4, r3, r5)
            com.google.ads.interactivemedia.v3.internal.bmn r3 = (com.google.ads.interactivemedia.p039v3.internal.bmn) r3
            if (r3 != 0) goto L_0x012f
            goto L_0x027b
        L_0x012f:
            r1.f16594c = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x0437
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r4 = r7.f16468a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.ads.interactivemedia.v3.internal.bjq r4 = com.google.ads.interactivemedia.p039v3.internal.bjq.f16482b
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.ads.interactivemedia.v3.internal.bjq r6 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16050m(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r4 = r7.f16468a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.ads.interactivemedia.v3.internal.bjq r4 = com.google.ads.interactivemedia.p039v3.internal.bjq.f16482b
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.ads.interactivemedia.v3.internal.bjq r6 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16050m(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x017c:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x0187:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x0437
        L_0x0190:
            com.google.ads.interactivemedia.v3.internal.bly r1 = r15.m16473z(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16085q(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x0437
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r6 = r7.f16468a
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.ads.interactivemedia.p039v3.internal.bkr.f16599a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x0437
            int r6 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r8 = r7.f16468a
            if (r2 != r8) goto L_0x0437
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r6, r7)
            int r6 = r7.f16468a
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.ads.interactivemedia.p039v3.internal.bkr.f16599a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x01f5:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x01fa:
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r6 = r7.f16468a
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.ads.interactivemedia.p039v3.internal.bna.m16778b(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.ads.interactivemedia.p039v3.internal.bkr.f16599a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x0437
            int r6 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r8 = r7.f16468a
            if (r2 != r8) goto L_0x0437
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r6, r7)
            int r6 = r7.f16468a
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.ads.interactivemedia.p039v3.internal.bna.m16778b(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.ads.interactivemedia.p039v3.internal.bkr.f16599a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16355h()
            throw r1
        L_0x024b:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x0250:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16355h()
            throw r1
        L_0x0255:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16349b()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.ads.interactivemedia.v3.internal.bji r12 = (com.google.ads.interactivemedia.p039v3.internal.bji) r12
            int r2 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r4 = r7.f16468a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r2, r7)
            long r5 = r7.f16469b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.mo15189d(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0438
        L_0x027e:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bji r12 = (com.google.ads.interactivemedia.p039v3.internal.bji) r12
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r4, r7)
            long r8 = r7.f16469b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.mo15189d(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r8 = r7.f16468a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r6, r7)
            long r8 = r7.f16469b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.mo15189d(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.ads.interactivemedia.v3.internal.bkm r12 = (com.google.ads.interactivemedia.p039v3.internal.bkm) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16074f(r3, r1)
            r12.mo15399g(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0438
        L_0x02cf:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bkm r12 = (com.google.ads.interactivemedia.p039v3.internal.bkm) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16074f(r17, r18)
            r12.mo15399g(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16074f(r3, r4)
            r12.mo15399g(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16075g(r3, r1)
            r12.mo15425f(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0438
        L_0x0310:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            long r8 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16075g(r17, r18)
            r12.mo15425f(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16075g(r3, r4)
            r12.mo15425f(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16084p(r3, r4, r12, r7)
            goto L_0x0438
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x0437
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16083o(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r1, r7)
            long r4 = r7.f16469b
            r12.mo15425f(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0438
        L_0x036c:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.blc r12 = (com.google.ads.interactivemedia.p039v3.internal.blc) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r4, r7)
            long r8 = r7.f16469b
            r12.mo15425f(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r3, r4, r7)
            long r8 = r7.f16469b
            r12.mo15425f(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b4
            com.google.ads.interactivemedia.v3.internal.bkh r12 = (com.google.ads.interactivemedia.p039v3.internal.bkh) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03ab
            float r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16077i(r3, r1)
            r12.mo15377d(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03ab:
            if (r1 != r2) goto L_0x03af
            goto L_0x0438
        L_0x03af:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x03b4:
            if (r6 != r9) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bkh r12 = (com.google.ads.interactivemedia.p039v3.internal.bkh) r12
            float r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16077i(r17, r18)
            r12.mo15377d(r1)
        L_0x03bf:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d4
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x03cc
            goto L_0x03d4
        L_0x03cc:
            float r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16077i(r3, r4)
            r12.mo15377d(r1)
            goto L_0x03bf
        L_0x03d4:
            return r1
        L_0x03d5:
            if (r6 != r14) goto L_0x03f4
            com.google.ads.interactivemedia.v3.internal.bjy r12 = (com.google.ads.interactivemedia.p039v3.internal.bjy) r12
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r2 = r7.f16468a
            int r2 = r2 + r1
        L_0x03e0:
            if (r1 >= r2) goto L_0x03ec
            double r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16076h(r3, r1)
            r12.mo15359d(r4)
            int r1 = r1 + 8
            goto L_0x03e0
        L_0x03ec:
            if (r1 != r2) goto L_0x03ef
            goto L_0x0438
        L_0x03ef:
            com.google.ads.interactivemedia.v3.internal.bkt r1 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            throw r1
        L_0x03f4:
            if (r6 != r13) goto L_0x0437
            com.google.ads.interactivemedia.v3.internal.bjy r12 = (com.google.ads.interactivemedia.p039v3.internal.bjy) r12
            double r8 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16076h(r17, r18)
            r12.mo15359d(r8)
        L_0x03ff:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0414
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r1, r7)
            int r6 = r7.f16468a
            if (r2 == r6) goto L_0x040c
            goto L_0x0414
        L_0x040c:
            double r8 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16076h(r3, r4)
            r12.mo15359d(r8)
            goto L_0x03ff
        L_0x0414:
            return r1
        L_0x0415:
            if (r4 >= r5) goto L_0x0436
            int r8 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r3, r4, r7)
            int r9 = r7.f16468a
            if (r2 == r9) goto L_0x0420
            goto L_0x0436
        L_0x0420:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16082n(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f16470c
            r12.add(r8)
            goto L_0x0415
        L_0x0436:
            return r4
        L_0x0437:
            r1 = r4
        L_0x0438:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16470w(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.ads.interactivemedia.v3.internal.bjg):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m16471x(T r4, byte[] r5, int r6, int r7, int r8, long r9, com.google.ads.interactivemedia.p039v3.internal.bjg r11) throws java.io.IOException {
        /*
            r3 = this;
            sun.misc.Unsafe r0 = f16639b
            java.lang.Object r8 = r3.m16430A(r8)
            java.lang.Object r1 = r0.getObject(r4, r9)
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.bli.m16408e(r1)
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bli.m16410g()
            com.google.ads.interactivemedia.p039v3.internal.bli.m16409f(r2, r1)
            r0.putObject(r4, r9, r2)
            r1 = r2
        L_0x001b:
            com.google.ads.interactivemedia.v3.internal.blg r4 = com.google.ads.interactivemedia.p039v3.internal.bli.m16405b(r8)
            java.util.Map r8 = com.google.ads.interactivemedia.p039v3.internal.bli.m16406c(r1)
            int r6 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r5, r6, r11)
            int r9 = r11.f16468a
            if (r9 < 0) goto L_0x005b
            int r10 = r7 - r6
            if (r9 > r10) goto L_0x005b
            int r9 = r9 + r6
            K r4 = r4.f16631b
        L_0x0032:
            r4 = 0
            if (r6 >= r9) goto L_0x0050
            int r10 = r6 + 1
            byte r6 = r5[r6]
            if (r6 >= 0) goto L_0x0041
            int r10 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16072d(r6, r5, r10, r11)
            int r6 = r11.f16468a
        L_0x0041:
            int r0 = r6 >>> 3
            r1 = 1
            if (r0 == r1) goto L_0x004f
            r1 = 2
            if (r0 == r1) goto L_0x004e
            int r6 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16087s(r6, r5, r10, r7, r11)
            goto L_0x0032
        L_0x004e:
            throw r4
        L_0x004f:
            throw r4
        L_0x0050:
            if (r6 != r9) goto L_0x0056
            r8.put(r4, r4)
            return r9
        L_0x0056:
            com.google.ads.interactivemedia.v3.internal.bkt r4 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16354g()
            throw r4
        L_0x005b:
            com.google.ads.interactivemedia.v3.internal.bkt r4 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16348a()
            goto L_0x0061
        L_0x0060:
            throw r4
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.m16471x(java.lang.Object, byte[], int, int, int, long, com.google.ads.interactivemedia.v3.internal.bjg):int");
    }

    /* renamed from: y */
    private final int m16472y(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, bjg bjg) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        bjg bjg2 = bjg;
        Unsafe unsafe = f16639b;
        long j3 = (long) (this.f16640c[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(bjr.m16076h(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(bjr.m16077i(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int e = bjr.m16073e(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, Long.valueOf(bjg2.f16469b));
                    unsafe.putInt(t2, j3, i11);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int c = bjr.m16071c(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bjg2.f16468a));
                    unsafe.putInt(t2, j3, i11);
                    return c;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(bjr.m16075g(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(bjr.m16074f(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int e2 = bjr.m16073e(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(bjg2.f16469b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return e2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int c2 = bjr.m16071c(bArr2, i9, bjg2);
                    int i14 = bjg2.f16468a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || bna.m16778b(bArr2, c2, c2 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, c2, i14, bkr.f16599a));
                        c2 += i14;
                    } else {
                        throw bkt.m16355h();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return c2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int m = bjr.m16081m(m16473z(i13), bArr2, i9, i2, bjg2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, bjg2.f16470c);
                    } else {
                        unsafe.putObject(t2, j2, bkr.m16345h(object, bjg2.f16470c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int l = bjr.m16080l(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, bjg2.f16470c);
                    unsafe.putInt(t2, j3, i11);
                    return l;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int c3 = bjr.m16071c(bArr2, i9, bjg2);
                    int i15 = bjg2.f16468a;
                    bko B = m16431B(i13);
                    if (B == null || B.mo15404a(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m16459h(t).mo15514i(i10, Long.valueOf((long) i15));
                    }
                    return c3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int c4 = bjr.m16071c(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bjs.m16090b(bjg2.f16468a)));
                    unsafe.putInt(t2, j3, i11);
                    return c4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int e3 = bjr.m16073e(bArr2, i9, bjg2);
                    unsafe.putObject(t2, j2, Long.valueOf(bjs.m16091c(bjg2.f16469b)));
                    unsafe.putInt(t2, j3, i11);
                    return e3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = bjr.m16082n(m16473z(i13), bArr, i, i2, (i10 & -8) | 4, bjg);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, bjg2.f16470c);
                    } else {
                        unsafe.putObject(t2, j2, bkr.m16345h(object2, bjg2.f16470c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* renamed from: z */
    private final bly m16473z(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        bly bly = (bly) this.f16641d[i3];
        if (bly != null) {
            return bly;
        }
        bly b = blu.m16503a().mo15458b((Class) this.f16641d[i3 + 1]);
        this.f16641d[i3] = b;
        return b;
    }

    /* renamed from: a */
    public final T mo15447a() {
        return blr.m16496a(this.f16644g);
    }

    /* renamed from: b */
    public final boolean mo15448b(T t, T t2) {
        boolean z;
        int length = this.f16640c.length;
        for (int i = 0; i < length; i += 3) {
            int G = m16436G(i);
            long K = m16440K(G);
            switch (m16438I(G)) {
                case 0:
                    if (m16446Q(t, t2, i) && Double.doubleToLongBits(bmv.m16738l(t, K)) == Double.doubleToLongBits(bmv.m16738l(t2, K))) {
                        continue;
                    }
                case 1:
                    if (m16446Q(t, t2, i) && Float.floatToIntBits(bmv.m16736j(t, K)) == Float.floatToIntBits(bmv.m16736j(t2, K))) {
                        continue;
                    }
                case 2:
                    if (m16446Q(t, t2, i) && bmv.m16732f(t, K) == bmv.m16732f(t2, K)) {
                        continue;
                    }
                case 3:
                    if (m16446Q(t, t2, i) && bmv.m16732f(t, K) == bmv.m16732f(t2, K)) {
                        continue;
                    }
                case 4:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 5:
                    if (m16446Q(t, t2, i) && bmv.m16732f(t, K) == bmv.m16732f(t2, K)) {
                        continue;
                    }
                case 6:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 7:
                    if (m16446Q(t, t2, i) && bmv.m16734h(t, K) == bmv.m16734h(t2, K)) {
                        continue;
                    }
                case 8:
                    if (m16446Q(t, t2, i) && bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K))) {
                        continue;
                    }
                case 9:
                    if (m16446Q(t, t2, i) && bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K))) {
                        continue;
                    }
                case 10:
                    if (m16446Q(t, t2, i) && bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K))) {
                        continue;
                    }
                case 11:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 12:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 13:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 14:
                    if (m16446Q(t, t2, i) && bmv.m16732f(t, K) == bmv.m16732f(t2, K)) {
                        continue;
                    }
                case 15:
                    if (m16446Q(t, t2, i) && bmv.m16730d(t, K) == bmv.m16730d(t2, K)) {
                        continue;
                    }
                case 16:
                    if (m16446Q(t, t2, i) && bmv.m16732f(t, K) == bmv.m16732f(t2, K)) {
                        continue;
                    }
                case 17:
                    if (m16446Q(t, t2, i) && bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K))) {
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
                    z = bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K));
                    break;
                case 50:
                    z = bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K));
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
                    long H = (long) (m16437H(i) & 1048575);
                    if (bmv.m16730d(t, H) == bmv.m16730d(t2, H) && bma.m16583L(bmv.m16740n(t, K), bmv.m16740n(t2, K))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f16653p.mo15505e(t).equals(this.f16653p.mo15505e(t2))) {
            return false;
        }
        if (!this.f16645h) {
            return true;
        }
        bmw.m16761j(t);
        bmw.m16761j(t2);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15449c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f16640c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m16436G(r1)
            int r4 = r8.m16435F(r1)
            long r5 = m16440K(r3)
            int r3 = m16438I(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m16444O(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m16444O(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m16445P(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16341d(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m16444O(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m16443N(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m16444O(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m16444O(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m16442M(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m16450U(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m16441L(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16734h(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16341d(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16730d(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16732f(r9, r5)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16736j(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16738l(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16340c(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r0 = r8.f16653p
            java.lang.Object r0 = r0.mo15505e(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f16645h
            if (r0 != 0) goto L_0x023c
            return r2
        L_0x023c:
            com.google.ads.interactivemedia.p039v3.internal.bmw.m16761j(r9)
            r9 = 0
            goto L_0x0242
        L_0x0241:
            throw r9
        L_0x0242:
            goto L_0x0241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.mo15449c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final void mo15450d(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f16640c.length; i += 3) {
            int G = m16436G(i);
            long K = m16440K(G);
            int F = m16435F(i);
            switch (m16438I(G)) {
                case 0:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16739m(t, K, bmv.m16738l(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 1:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16737k(t, K, bmv.m16736j(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 2:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16733g(t, K, bmv.m16732f(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 3:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16733g(t, K, bmv.m16732f(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 4:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 5:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16733g(t, K, bmv.m16732f(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 6:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 7:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16735i(t, K, bmv.m16734h(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 8:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16741o(t, K, bmv.m16740n(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 9:
                    m16463p(t, t2, i);
                    break;
                case 10:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16741o(t, K, bmv.m16740n(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 11:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 12:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 13:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 14:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16733g(t, K, bmv.m16732f(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 15:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16731e(t, K, bmv.m16730d(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 16:
                    if (!m16448S(t2, i)) {
                        break;
                    } else {
                        bmv.m16733g(t, K, bmv.m16732f(t2, K));
                        m16449T(t, i);
                        break;
                    }
                case 17:
                    m16463p(t, t2, i);
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
                    this.f16652o.mo15421c(t, t2, K);
                    break;
                case 50:
                    bma.m16587P(this.f16655r, t, t2, K);
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
                    if (!m16450U(t2, F, i)) {
                        break;
                    } else {
                        bmv.m16741o(t, K, bmv.m16740n(t2, K));
                        m16451V(t, F, i);
                        break;
                    }
                case 60:
                    m16464q(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m16450U(t2, F, i)) {
                        break;
                    } else {
                        bmv.m16741o(t, K, bmv.m16740n(t2, K));
                        m16451V(t, F, i);
                        break;
                    }
                case 68:
                    m16464q(t, t2, i);
                    break;
            }
        }
        bma.m16584M(this.f16653p, t, t2);
        if (this.f16645h) {
            bma.m16599aa(this.f16656s, t2);
        }
    }

    /* renamed from: e */
    public final int mo15451e(T t) {
        return this.f16647j ? m16466s(t) : m16465r(t);
    }

    /* renamed from: f */
    public final void mo15452f(T t, bne bne) throws IOException {
        if (!this.f16647j) {
            m16468u(t, bne);
        } else if (!this.f16645h) {
            int length = this.f16640c.length;
            for (int i = 0; i < length; i += 3) {
                int G = m16436G(i);
                int F = m16435F(i);
                switch (m16438I(G)) {
                    case 0:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15337f(F, bmv.m16738l(t, m16440K(G)));
                            break;
                        }
                    case 1:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15336e(F, bmv.m16736j(t, m16440K(G)));
                            break;
                        }
                    case 2:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15334c(F, bmv.m16732f(t, m16440K(G)));
                            break;
                        }
                    case 3:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15339h(F, bmv.m16732f(t, m16440K(G)));
                            break;
                        }
                    case 4:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15340i(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 5:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15341j(F, bmv.m16732f(t, m16440K(G)));
                            break;
                        }
                    case 6:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15342k(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 7:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15343l(F, bmv.m16734h(t, m16440K(G)));
                            break;
                        }
                    case 8:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            m16457ab(F, bmv.m16740n(t, m16440K(G)), bne);
                            break;
                        }
                    case 9:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15349r(F, bmv.m16740n(t, m16440K(G)), m16473z(i));
                            break;
                        }
                    case 10:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15345n(F, (bjq) bmv.m16740n(t, m16440K(G)));
                            break;
                        }
                    case 11:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15346o(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 12:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15338g(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 13:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15333b(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 14:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15335d(F, bmv.m16732f(t, m16440K(G)));
                            break;
                        }
                    case 15:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15347p(F, bmv.m16730d(t, m16440K(G)));
                            break;
                        }
                    case 16:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15348q(F, bmv.m16732f(t, m16440K(G)));
                            break;
                        }
                    case 17:
                        if (!m16448S(t, i)) {
                            break;
                        } else {
                            bne.mo15350s(F, bmv.m16740n(t, m16440K(G)), m16473z(i));
                            break;
                        }
                    case 18:
                        bma.m16601b(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 19:
                        bma.m16602c(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 20:
                        bma.m16603d(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 21:
                        bma.m16604e(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 22:
                        bma.m16608i(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 23:
                        bma.m16606g(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 24:
                        bma.m16611l(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 25:
                        bma.m16614o(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 26:
                        bma.m16615p(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne);
                        break;
                    case 27:
                        bma.m16617r(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, m16473z(i));
                        break;
                    case 28:
                        bma.m16616q(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne);
                        break;
                    case 29:
                        bma.m16609j(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 30:
                        bma.m16613n(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 31:
                        bma.m16612m(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 32:
                        bma.m16607h(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 33:
                        bma.m16610k(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 34:
                        bma.m16605f(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, false);
                        break;
                    case 35:
                        bma.m16601b(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 36:
                        bma.m16602c(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 37:
                        bma.m16603d(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 38:
                        bma.m16604e(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 39:
                        bma.m16608i(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 40:
                        bma.m16606g(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 41:
                        bma.m16611l(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 42:
                        bma.m16614o(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 43:
                        bma.m16609j(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 44:
                        bma.m16613n(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 45:
                        bma.m16612m(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 46:
                        bma.m16607h(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 47:
                        bma.m16610k(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 48:
                        bma.m16605f(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, true);
                        break;
                    case 49:
                        bma.m16618s(m16435F(i), (List) bmv.m16740n(t, m16440K(G)), bne, m16473z(i));
                        break;
                    case 50:
                        m16469v(bne, F, bmv.m16740n(t, m16440K(G)), i);
                        break;
                    case 51:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15337f(F, m16441L(t, m16440K(G)));
                            break;
                        }
                    case 52:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15336e(F, m16442M(t, m16440K(G)));
                            break;
                        }
                    case 53:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15334c(F, m16444O(t, m16440K(G)));
                            break;
                        }
                    case 54:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15339h(F, m16444O(t, m16440K(G)));
                            break;
                        }
                    case 55:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15340i(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 56:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15341j(F, m16444O(t, m16440K(G)));
                            break;
                        }
                    case 57:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15342k(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 58:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15343l(F, m16445P(t, m16440K(G)));
                            break;
                        }
                    case 59:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            m16457ab(F, bmv.m16740n(t, m16440K(G)), bne);
                            break;
                        }
                    case 60:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15349r(F, bmv.m16740n(t, m16440K(G)), m16473z(i));
                            break;
                        }
                    case 61:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15345n(F, (bjq) bmv.m16740n(t, m16440K(G)));
                            break;
                        }
                    case 62:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15346o(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 63:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15338g(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 64:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15333b(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 65:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15335d(F, m16444O(t, m16440K(G)));
                            break;
                        }
                    case 66:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15347p(F, m16443N(t, m16440K(G)));
                            break;
                        }
                    case 67:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15348q(F, m16444O(t, m16440K(G)));
                            break;
                        }
                    case 68:
                        if (!m16450U(t, F, i)) {
                            break;
                        } else {
                            bne.mo15350s(F, bmv.m16740n(t, m16440K(G)), m16473z(i));
                            break;
                        }
                }
            }
            m16458ac(this.f16653p, t, bne);
        } else {
            bmw.m16761j(t);
            throw null;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: g */
    public final void mo15453g(T r12, com.google.ads.interactivemedia.p039v3.internal.blx r13, com.google.ads.interactivemedia.p039v3.internal.bka r14) throws java.io.IOException {
        /*
            r11 = this;
            java.util.Objects.requireNonNull(r14)
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r0 = r11.f16653p
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0008:
            int r4 = r13.mo15269b()     // Catch:{ all -> 0x006a }
            int r5 = r11.m16452W(r4)     // Catch:{ all -> 0x006a }
            if (r5 >= 0) goto L_0x006d
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x002e
            int r13 = r11.f16650m
        L_0x0019:
            int r14 = r11.f16651n
            if (r13 >= r14) goto L_0x0028
            int[] r14 = r11.f16649l
            r14 = r14[r13]
            java.lang.Object r2 = r11.m16432C(r12, r14, r2, r0)
            int r13 = r13 + 1
            goto L_0x0019
        L_0x0028:
            if (r2 == 0) goto L_0x060e
            r0.mo15503c(r12, r2)
            return
        L_0x002e:
            boolean r5 = r11.f16645h     // Catch:{ all -> 0x006a }
            if (r5 != 0) goto L_0x0034
            r4 = r1
            goto L_0x003a
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.bln r5 = r11.f16644g     // Catch:{ all -> 0x006a }
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.bmw.m16760i(r14, r5, r4)     // Catch:{ all -> 0x006a }
        L_0x003a:
            if (r4 == 0) goto L_0x0047
            if (r3 != 0) goto L_0x0042
            com.google.ads.interactivemedia.v3.internal.bke r3 = com.google.ads.interactivemedia.p039v3.internal.bmw.m16762k(r12)     // Catch:{ all -> 0x006a }
        L_0x0042:
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bmw.m16764m()     // Catch:{ all -> 0x006a }
            goto L_0x0008
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r0.mo15504d(r12)     // Catch:{ all -> 0x006a }
        L_0x004d:
            boolean r4 = r0.mo15501a(r2, r13)     // Catch:{ all -> 0x006a }
            if (r4 != 0) goto L_0x0008
            int r13 = r11.f16650m
        L_0x0055:
            int r14 = r11.f16651n
            if (r13 >= r14) goto L_0x0064
            int[] r14 = r11.f16649l
            r14 = r14[r13]
            java.lang.Object r2 = r11.m16432C(r12, r14, r2, r0)
            int r13 = r13 + 1
            goto L_0x0055
        L_0x0064:
            if (r2 == 0) goto L_0x060e
            r0.mo15503c(r12, r2)
            return
        L_0x006a:
            r13 = move-exception
            goto L_0x060f
        L_0x006d:
            int r6 = r11.m16436G(r5)     // Catch:{ all -> 0x006a }
            int r7 = m16438I(r6)     // Catch:{ bks -> 0x05eb }
            switch(r7) {
                case 0: goto L_0x05be;
                case 1: goto L_0x05ae;
                case 2: goto L_0x059e;
                case 3: goto L_0x058e;
                case 4: goto L_0x057e;
                case 5: goto L_0x056e;
                case 6: goto L_0x055e;
                case 7: goto L_0x054e;
                case 8: goto L_0x0546;
                case 9: goto L_0x050f;
                case 10: goto L_0x04ff;
                case 11: goto L_0x04ef;
                case 12: goto L_0x04cc;
                case 13: goto L_0x04bc;
                case 14: goto L_0x04ac;
                case 15: goto L_0x049c;
                case 16: goto L_0x048c;
                case 17: goto L_0x0455;
                case 18: goto L_0x0446;
                case 19: goto L_0x0437;
                case 20: goto L_0x0428;
                case 21: goto L_0x0419;
                case 22: goto L_0x040a;
                case 23: goto L_0x03fb;
                case 24: goto L_0x03ec;
                case 25: goto L_0x03dd;
                case 26: goto L_0x03b9;
                case 27: goto L_0x03a6;
                case 28: goto L_0x0397;
                case 29: goto L_0x0388;
                case 30: goto L_0x0371;
                case 31: goto L_0x0362;
                case 32: goto L_0x0353;
                case 33: goto L_0x0344;
                case 34: goto L_0x0335;
                case 35: goto L_0x0326;
                case 36: goto L_0x0317;
                case 37: goto L_0x0308;
                case 38: goto L_0x02f9;
                case 39: goto L_0x02ea;
                case 40: goto L_0x02db;
                case 41: goto L_0x02cc;
                case 42: goto L_0x02bd;
                case 43: goto L_0x02ae;
                case 44: goto L_0x0297;
                case 45: goto L_0x0288;
                case 46: goto L_0x0279;
                case 47: goto L_0x026a;
                case 48: goto L_0x025b;
                case 49: goto L_0x0248;
                case 50: goto L_0x0210;
                case 51: goto L_0x01fc;
                case 52: goto L_0x01e8;
                case 53: goto L_0x01d4;
                case 54: goto L_0x01c0;
                case 55: goto L_0x01ac;
                case 56: goto L_0x0198;
                case 57: goto L_0x0184;
                case 58: goto L_0x0170;
                case 59: goto L_0x0168;
                case 60: goto L_0x012f;
                case 61: goto L_0x011f;
                case 62: goto L_0x010b;
                case 63: goto L_0x00e4;
                case 64: goto L_0x00d0;
                case 65: goto L_0x00bc;
                case 66: goto L_0x00a8;
                case 67: goto L_0x0094;
                case 68: goto L_0x0080;
                default: goto L_0x0078;
            }     // Catch:{ bks -> 0x05eb }
        L_0x0078:
            if (r2 != 0) goto L_0x05ce
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bmn.m16672b()     // Catch:{ bks -> 0x05eb }
            goto L_0x05ce
        L_0x0080:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r8 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r8 = r13.mo15283p(r8, r14)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0094:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15290w()     // Catch:{ bks -> 0x05eb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x00a8:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r8 = r13.mo15289v()     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x00bc:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15288u()     // Catch:{ bks -> 0x05eb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x00d0:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r8 = r13.mo15287t()     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x00e4:
            int r7 = r13.mo15286s()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bko r8 = r11.m16431B(r5)     // Catch:{ bks -> 0x05eb }
            if (r8 == 0) goto L_0x00fb
            boolean r8 = r8.mo15404a(r7)     // Catch:{ bks -> 0x05eb }
            if (r8 == 0) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bma.m16586O(r4, r7, r2, r0)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x00fb:
            long r8 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r8, r6)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x010b:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r8 = r13.mo15285r()     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x011f:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bjq r8 = r13.mo15284q()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x012f:
            boolean r7 = r11.m16450U(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            if (r7 == 0) goto L_0x0151
            long r7 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r7 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r12, r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r8 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r8 = r13.mo15282o(r8, r14)     // Catch:{ bks -> 0x05eb }
            long r9 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r6 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r7, r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r9, r6)     // Catch:{ bks -> 0x05eb }
            goto L_0x0163
        L_0x0151:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r8 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r8 = r13.mo15282o(r8, r14)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
        L_0x0163:
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0168:
            r11.m16434E(r12, r6, r13)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0170:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            boolean r8 = r13.mo15279l()     // Catch:{ bks -> 0x05eb }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0184:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r8 = r13.mo15278k()     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0198:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15277j()     // Catch:{ bks -> 0x05eb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x01ac:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r8 = r13.mo15276i()     // Catch:{ bks -> 0x05eb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x01c0:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15274g()     // Catch:{ bks -> 0x05eb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x01d4:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15275h()     // Catch:{ bks -> 0x05eb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x01e8:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            float r8 = r13.mo15273f()     // Catch:{ bks -> 0x05eb }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x01fc:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            double r8 = r13.mo15272e()     // Catch:{ bks -> 0x05eb }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16451V(r12, r4, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0210:
            java.lang.Object r4 = r11.m16430A(r5)     // Catch:{ bks -> 0x05eb }
            int r5 = r11.m16436G(r5)     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r7 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r12, r5)     // Catch:{ bks -> 0x05eb }
            if (r7 != 0) goto L_0x022a
            java.lang.Object r7 = com.google.ads.interactivemedia.p039v3.internal.bli.m16410g()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r5, r7)     // Catch:{ bks -> 0x05eb }
            goto L_0x023b
        L_0x022a:
            boolean r8 = com.google.ads.interactivemedia.p039v3.internal.bli.m16408e(r7)     // Catch:{ bks -> 0x05eb }
            if (r8 == 0) goto L_0x023b
            java.lang.Object r8 = com.google.ads.interactivemedia.p039v3.internal.bli.m16410g()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bli.m16409f(r8, r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r5, r8)     // Catch:{ bks -> 0x05eb }
            r7 = r8
        L_0x023b:
            java.util.Map r5 = com.google.ads.interactivemedia.p039v3.internal.bli.m16406c(r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.blg r4 = com.google.ads.interactivemedia.p039v3.internal.bli.m16405b(r4)     // Catch:{ bks -> 0x05eb }
            r13.mo15268R(r5, r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0248:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r4 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.blb r5 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            java.util.List r5 = r5.mo15419a(r12, r6)     // Catch:{ bks -> 0x05eb }
            r13.mo15260J(r5, r4, r14)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x025b:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15267Q(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x026a:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15266P(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0279:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15265O(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0288:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15264N(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0297:
            com.google.ads.interactivemedia.v3.internal.blb r7 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r8 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r6 = r7.mo15419a(r12, r8)     // Catch:{ bks -> 0x05eb }
            r13.mo15263M(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bko r5 = r11.m16431B(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bma.m16585N(r4, r6, r5, r2, r0)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02ae:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15262L(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02bd:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15255E(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02cc:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15254D(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02db:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15253C(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02ea:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15252B(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x02f9:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15293z(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0308:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15251A(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0317:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15292y(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0326:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15291x(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0335:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15267Q(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0344:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15266P(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0353:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15265O(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0362:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15264N(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0371:
            com.google.ads.interactivemedia.v3.internal.blb r7 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r8 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r6 = r7.mo15419a(r12, r8)     // Catch:{ bks -> 0x05eb }
            r13.mo15263M(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bko r5 = r11.m16431B(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bma.m16585N(r4, r6, r5, r2, r0)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0388:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15262L(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0397:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15261K(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03a6:
            com.google.ads.interactivemedia.v3.internal.bly r4 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.blb r5 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r5 = r5.mo15419a(r12, r6)     // Catch:{ bks -> 0x05eb }
            r13.mo15259I(r5, r4, r14)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03b9:
            boolean r4 = m16439J(r6)     // Catch:{ bks -> 0x05eb }
            if (r4 == 0) goto L_0x03ce
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15257G(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03ce:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15256F(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03dd:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15255E(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03ec:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15254D(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x03fb:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15253C(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x040a:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15252B(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0419:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15293z(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0428:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15251A(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0437:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15292y(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0446:
            com.google.ads.interactivemedia.v3.internal.blb r4 = r11.f16652o     // Catch:{ bks -> 0x05eb }
            long r5 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.util.List r4 = r4.mo15419a(r12, r5)     // Catch:{ bks -> 0x05eb }
            r13.mo15291x(r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0455:
            boolean r4 = r11.m16448S(r12, r5)     // Catch:{ bks -> 0x05eb }
            if (r4 == 0) goto L_0x0478
            long r7 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r12, r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r5 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r5 = r13.mo15283p(r5, r14)     // Catch:{ bks -> 0x05eb }
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r4, r5)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0478:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r4 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = r13.mo15283p(r4, r14)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x048c:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15290w()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16733g(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x049c:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r4 = r13.mo15289v()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04ac:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15288u()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16733g(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04bc:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r4 = r13.mo15287t()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04cc:
            int r7 = r13.mo15286s()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bko r8 = r11.m16431B(r5)     // Catch:{ bks -> 0x05eb }
            if (r8 == 0) goto L_0x04e3
            boolean r8 = r8.mo15404a(r7)     // Catch:{ bks -> 0x05eb }
            if (r8 == 0) goto L_0x04dd
            goto L_0x04e3
        L_0x04dd:
            java.lang.Object r2 = com.google.ads.interactivemedia.p039v3.internal.bma.m16586O(r4, r7, r2, r0)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04e3:
            long r8 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r8, r7)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04ef:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r4 = r13.mo15285r()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x04ff:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bjq r4 = r13.mo15284q()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x050f:
            boolean r4 = r11.m16448S(r12, r5)     // Catch:{ bks -> 0x05eb }
            if (r4 == 0) goto L_0x0532
            long r7 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.bmv.m16740n(r12, r7)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r5 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r5 = r13.mo15282o(r5, r14)     // Catch:{ bks -> 0x05eb }
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r4, r5)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0532:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.v3.internal.bly r4 = r11.m16473z(r5)     // Catch:{ bks -> 0x05eb }
            java.lang.Object r4 = r13.mo15282o(r4, r14)     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16741o(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x0546:
            r11.m16434E(r12, r6, r13)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x054e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            boolean r4 = r13.mo15279l()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16735i(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x055e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r4 = r13.mo15278k()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x056e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15277j()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16733g(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x057e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            int r4 = r13.mo15276i()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16731e(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x058e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15274g()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16733g(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x059e:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            long r8 = r13.mo15275h()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16733g(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x05ae:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            float r4 = r13.mo15273f()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16737k(r12, r6, r4)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x05be:
            long r6 = m16440K(r6)     // Catch:{ bks -> 0x05eb }
            double r8 = r13.mo15272e()     // Catch:{ bks -> 0x05eb }
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16739m(r12, r6, r8)     // Catch:{ bks -> 0x05eb }
            r11.m16449T(r12, r5)     // Catch:{ bks -> 0x05eb }
            goto L_0x0008
        L_0x05ce:
            boolean r4 = r0.mo15501a(r2, r13)     // Catch:{ bks -> 0x05eb }
            if (r4 != 0) goto L_0x0008
            int r13 = r11.f16650m
        L_0x05d6:
            int r14 = r11.f16651n
            if (r13 >= r14) goto L_0x05e5
            int[] r14 = r11.f16649l
            r14 = r14[r13]
            java.lang.Object r2 = r11.m16432C(r12, r14, r2, r0)
            int r13 = r13 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r2 == 0) goto L_0x060e
            r0.mo15503c(r12, r2)
            return
        L_0x05eb:
            if (r2 != 0) goto L_0x05f2
            java.lang.Object r2 = r0.mo15504d(r12)     // Catch:{ all -> 0x006a }
        L_0x05f2:
            boolean r4 = r0.mo15501a(r2, r13)     // Catch:{ all -> 0x006a }
            if (r4 != 0) goto L_0x0008
            int r13 = r11.f16650m
        L_0x05fa:
            int r14 = r11.f16651n
            if (r13 >= r14) goto L_0x0609
            int[] r14 = r11.f16649l
            r14 = r14[r13]
            java.lang.Object r2 = r11.m16432C(r12, r14, r2, r0)
            int r13 = r13 + 1
            goto L_0x05fa
        L_0x0609:
            if (r2 == 0) goto L_0x060e
            r0.mo15503c(r12, r2)
        L_0x060e:
            return
        L_0x060f:
            int r14 = r11.f16650m
        L_0x0611:
            int r1 = r11.f16651n
            if (r14 >= r1) goto L_0x0620
            int[] r1 = r11.f16649l
            r1 = r1[r14]
            java.lang.Object r2 = r11.m16432C(r12, r1, r2, r0)
            int r14 = r14 + 1
            goto L_0x0611
        L_0x0620:
            if (r2 == 0) goto L_0x0625
            r0.mo15503c(r12, r2)
        L_0x0625:
            goto L_0x0627
        L_0x0626:
            throw r13
        L_0x0627:
            goto L_0x0626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.mo15453g(java.lang.Object, com.google.ads.interactivemedia.v3.internal.blx, com.google.ads.interactivemedia.v3.internal.bka):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030f, code lost:
        if (r0 != r15) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x032b, code lost:
        r8 = r32;
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0359, code lost:
        if (r0 != r15) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x037b, code lost:
        if (r0 != r15) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ed, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0221, code lost:
        r5 = r6 | r24;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x024f, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0251, code lost:
        r3 = r8;
        r1 = r11;
        r2 = r21;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026d, code lost:
        r7 = r34;
        r19 = r6;
        r18 = r8;
        r28 = r10;
        r8 = r11;
        r23 = r21;
        r6 = r27;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03c3  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15454i(T r30, byte[] r31, int r32, int r33, int r34, com.google.ads.interactivemedia.p039v3.internal.bjg r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f16639b
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x03ea
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16072d(r0, r12, r1, r9)
            int r1 = r9.f16468a
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
            int r2 = r15.m16453X(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m16452W(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r23 = r0
            r2 = r1
            r8 = r4
            r19 = r5
            r28 = r10
            r7 = r11
            r18 = 0
        L_0x004c:
            r24 = -1
            goto L_0x037e
        L_0x0050:
            int[] r3 = r15.f16640c
            int r20 = r2 + 1
            r3 = r3[r20]
            int r8 = m16438I(r3)
            r21 = r0
            r20 = r1
            long r0 = m16440K(r3)
            r22 = r0
            r0 = 17
            if (r8 > r0) goto L_0x027c
            int[] r0 = r15.f16640c
            int r24 = r2 + 2
            r0 = r0[r24]
            int r24 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r24
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0089
            r18 = r2
            if (r6 == r11) goto L_0x0081
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0081:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r27 = r0
            goto L_0x008d
        L_0x0089:
            r18 = r2
            r27 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r8) {
                case 0: goto L_0x023a;
                case 1: goto L_0x0225;
                case 2: goto L_0x0205;
                case 3: goto L_0x0205;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01b9;
                case 7: goto L_0x019a;
                case 8: goto L_0x0179;
                case 9: goto L_0x014b;
                case 10: goto L_0x0134;
                case 11: goto L_0x01f0;
                case 12: goto L_0x0102;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01cf;
                case 15: goto L_0x00e8;
                case 16: goto L_0x00bd;
                default: goto L_0x0092;
            }
        L_0x0092:
            r11 = r4
            r8 = r18
            r2 = r20
            r4 = r22
            r0 = 3
            r18 = -1
            if (r7 != r0) goto L_0x026d
            com.google.ads.interactivemedia.v3.internal.bly r0 = r15.m16473z(r8)
            int r1 = r21 << 3
            r7 = r1 | 4
            r1 = r31
            r3 = r33
            r12 = r4
            r4 = r7
            r5 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16082n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0259
            java.lang.Object r1 = r9.f16470c
            r10.putObject(r14, r12, r1)
            goto L_0x0266
        L_0x00bd:
            if (r7 != 0) goto L_0x00df
            r1 = r20
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r1, r9)
            long r0 = r9.f16469b
            long r25 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16091c(r0)
            r8 = r21
            r2 = r22
            r0 = r10
            r1 = r30
            r5 = r18
            r18 = -1
            r11 = r4
            r8 = r5
            r4 = r25
            r0.putLong(r1, r2, r4)
            goto L_0x0221
        L_0x00df:
            r11 = r4
            r8 = r18
            r18 = -1
            r2 = r20
            goto L_0x026d
        L_0x00e8:
            r11 = r4
            r8 = r18
            r1 = r20
            r2 = r22
            r18 = -1
            if (r7 != 0) goto L_0x01ed
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r1, r9)
            int r1 = r9.f16468a
            int r1 = com.google.ads.interactivemedia.p039v3.internal.bjs.m16090b(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x024f
        L_0x0102:
            r11 = r4
            r8 = r18
            r1 = r20
            r2 = r22
            r18 = -1
            if (r7 != 0) goto L_0x01ed
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r1, r9)
            int r1 = r9.f16468a
            com.google.ads.interactivemedia.v3.internal.bko r4 = r15.m16431B(r8)
            if (r4 == 0) goto L_0x012f
            boolean r4 = r4.mo15404a(r1)
            if (r4 == 0) goto L_0x0120
            goto L_0x012f
        L_0x0120:
            com.google.ads.interactivemedia.v3.internal.bmn r2 = m16459h(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo15514i(r11, r1)
            r5 = r6
            goto L_0x0251
        L_0x012f:
            r10.putInt(r14, r2, r1)
            goto L_0x024f
        L_0x0134:
            r11 = r4
            r8 = r18
            r1 = r20
            r2 = r22
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01ed
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16080l(r12, r1, r9)
            java.lang.Object r1 = r9.f16470c
            r10.putObject(r14, r2, r1)
            goto L_0x024f
        L_0x014b:
            r11 = r4
            r8 = r18
            r1 = r20
            r2 = r22
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01ed
            com.google.ads.interactivemedia.v3.internal.bly r0 = r15.m16473z(r8)
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16081m(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x016a
            java.lang.Object r1 = r9.f16470c
            r10.putObject(r14, r2, r1)
            goto L_0x024f
        L_0x016a:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f16470c
            java.lang.Object r1 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x024f
        L_0x0179:
            r11 = r4
            r8 = r18
            r1 = r20
            r4 = r22
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01ed
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x018f
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16078j(r12, r1, r9)
            goto L_0x0193
        L_0x018f:
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16079k(r12, r1, r9)
        L_0x0193:
            java.lang.Object r1 = r9.f16470c
            r10.putObject(r14, r4, r1)
            goto L_0x024f
        L_0x019a:
            r11 = r4
            r8 = r18
            r1 = r20
            r4 = r22
            r18 = -1
            if (r7 != 0) goto L_0x01ed
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r1, r9)
            long r1 = r9.f16469b
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16735i(r14, r4, r1)
            goto L_0x024f
        L_0x01b9:
            r11 = r4
            r8 = r18
            r1 = r20
            r4 = r22
            r18 = -1
            if (r7 != r0) goto L_0x01ed
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16074f(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
            goto L_0x024f
        L_0x01cf:
            r11 = r4
            r8 = r18
            r1 = r20
            r4 = r22
            r0 = 1
            r18 = -1
            if (r7 != r0) goto L_0x01ed
            long r19 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16075g(r12, r1)
            r0 = r10
            r7 = r1
            r1 = r30
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x024f
        L_0x01ed:
            r2 = r1
            goto L_0x026d
        L_0x01f0:
            r11 = r4
            r8 = r18
            r2 = r20
            r4 = r22
            r18 = -1
            if (r7 != 0) goto L_0x026d
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16071c(r12, r2, r9)
            int r1 = r9.f16468a
            r10.putInt(r14, r4, r1)
            goto L_0x024f
        L_0x0205:
            r11 = r4
            r8 = r18
            r2 = r20
            r4 = r22
            r18 = -1
            if (r7 != 0) goto L_0x026d
            int r7 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16073e(r12, r2, r9)
            long r2 = r9.f16469b
            r0 = r10
            r1 = r30
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x0221:
            r5 = r6 | r24
            r0 = r7
            goto L_0x0251
        L_0x0225:
            r11 = r4
            r8 = r18
            r2 = r20
            r4 = r22
            r18 = -1
            if (r7 != r0) goto L_0x026d
            float r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16077i(r12, r2)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16737k(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x024f
        L_0x023a:
            r11 = r4
            r8 = r18
            r2 = r20
            r4 = r22
            r0 = 1
            r18 = -1
            if (r7 != r0) goto L_0x026d
            double r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16076h(r12, r2)
            com.google.ads.interactivemedia.p039v3.internal.bmv.m16739m(r14, r4, r0)
            int r0 = r2 + 8
        L_0x024f:
            r5 = r6 | r24
        L_0x0251:
            r3 = r8
            r1 = r11
            r2 = r21
            r6 = r27
            goto L_0x02cc
        L_0x0259:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f16470c
            java.lang.Object r1 = com.google.ads.interactivemedia.p039v3.internal.bkr.m16345h(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x0266:
            r5 = r6 | r24
            r12 = r31
            r13 = r33
            goto L_0x0251
        L_0x026d:
            r7 = r34
            r19 = r6
            r18 = r8
            r28 = r10
            r8 = r11
            r23 = r21
            r6 = r27
            goto L_0x004c
        L_0x027c:
            r11 = r4
            r1 = r8
            r4 = r21
            r12 = r22
            r18 = -1
            r8 = r2
            r2 = r20
            r0 = 27
            if (r1 != r0) goto L_0x02e1
            r0 = 2
            if (r7 != r0) goto L_0x02d0
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.ads.interactivemedia.v3.internal.bkq r0 = (com.google.ads.interactivemedia.p039v3.internal.bkq) r0
            boolean r1 = r0.mo15173a()
            if (r1 != 0) goto L_0x02ab
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02a3
            r1 = 10
            goto L_0x02a4
        L_0x02a3:
            int r1 = r1 + r1
        L_0x02a4:
            com.google.ads.interactivemedia.v3.internal.bkq r0 = r0.mo15190e(r1)
            r10.putObject(r14, r12, r0)
        L_0x02ab:
            r7 = r0
            com.google.ads.interactivemedia.v3.internal.bly r0 = r15.m16473z(r8)
            r1 = r11
            r3 = r2
            r2 = r31
            r12 = r4
            r4 = r33
            r19 = r5
            r5 = r7
            r27 = r6
            r6 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16085q(r0, r1, r2, r3, r4, r5, r6)
            r13 = r33
            r3 = r8
            r2 = r12
            r5 = r19
            r6 = r27
            r12 = r31
        L_0x02cc:
            r11 = r34
            goto L_0x0019
        L_0x02d0:
            r19 = r5
            r27 = r6
            r15 = r2
            r23 = r4
            r18 = r8
            r28 = r10
            r32 = r11
            r24 = -1
            goto L_0x035c
        L_0x02e1:
            r19 = r5
            r27 = r6
            r5 = r2
            r6 = r4
            r0 = 49
            if (r1 > r0) goto L_0x0331
            long r3 = (long) r3
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r21 = r3
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r11
            r23 = r6
            r18 = r8
            r24 = -1
            r28 = r10
            r9 = r21
            r32 = r11
            r11 = r20
            r14 = r35
            int r0 = r0.m16470w(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x032b
        L_0x0311:
            r15 = r29
            r14 = r30
            r12 = r31
            r1 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r3 = r18
            r5 = r19
            r2 = r23
            r6 = r27
            r10 = r28
            goto L_0x0019
        L_0x032b:
            r8 = r32
            r7 = r34
            r2 = r0
            goto L_0x0361
        L_0x0331:
            r20 = r1
            r15 = r5
            r23 = r6
            r18 = r8
            r28 = r10
            r32 = r11
            r24 = -1
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x0364
            r0 = 2
            if (r7 != r0) goto L_0x035c
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r12
            r8 = r35
            int r0 = r0.m16471x(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x032b
            goto L_0x0311
        L_0x035c:
            r8 = r32
            r7 = r34
            r2 = r15
        L_0x0361:
            r6 = r27
            goto L_0x037e
        L_0x0364:
            r0 = r29
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r15
            r4 = r33
            r5 = r32
            r6 = r23
            r10 = r12
            r12 = r18
            r13 = r35
            int r0 = r0.m16472y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x032b
            goto L_0x0311
        L_0x037e:
            if (r8 != r7) goto L_0x038c
            if (r7 == 0) goto L_0x038c
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r19
            goto L_0x03f3
        L_0x038c:
            r9 = r29
            boolean r0 = r9.f16645h
            if (r0 == 0) goto L_0x03c3
            r10 = r35
            com.google.ads.interactivemedia.v3.internal.bka r0 = r10.f16471d
            com.google.ads.interactivemedia.v3.internal.bka r1 = com.google.ads.interactivemedia.p039v3.internal.bka.m16275a()
            if (r0 == r1) goto L_0x03c0
            com.google.ads.interactivemedia.v3.internal.bln r0 = r9.f16644g
            com.google.ads.interactivemedia.v3.internal.bka r1 = r10.f16471d
            r11 = r23
            com.google.ads.interactivemedia.v3.internal.avr r0 = r1.mo15366b(r0, r11)
            if (r0 != 0) goto L_0x03ba
            com.google.ads.interactivemedia.v3.internal.bmn r4 = m16459h(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16086r(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x03d8
        L_0x03ba:
            r12 = r30
            r0 = r12
            com.google.ads.interactivemedia.v3.internal.bkk r0 = (com.google.ads.interactivemedia.p039v3.internal.bkk) r0
            throw r17
        L_0x03c0:
            r12 = r30
            goto L_0x03c7
        L_0x03c3:
            r12 = r30
            r10 = r35
        L_0x03c7:
            r11 = r23
            com.google.ads.interactivemedia.v3.internal.bmn r4 = m16459h(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.ads.interactivemedia.p039v3.internal.bjr.m16086r(r0, r1, r2, r3, r4, r5)
        L_0x03d8:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r18
            r5 = r19
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x0019
        L_0x03ea:
            r19 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x03f3:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x03fe
            long r2 = (long) r6
            r4 = r28
            r4.putInt(r12, r2, r5)
        L_0x03fe:
            int r2 = r9.f16650m
            r3 = r17
        L_0x0402:
            int r4 = r9.f16651n
            if (r2 >= r4) goto L_0x0415
            int[] r4 = r9.f16649l
            r4 = r4[r2]
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r5 = r9.f16653p
            java.lang.Object r3 = r9.m16432C(r12, r4, r3, r5)
            com.google.ads.interactivemedia.v3.internal.bmn r3 = (com.google.ads.interactivemedia.p039v3.internal.bmn) r3
            int r2 = r2 + 1
            goto L_0x0402
        L_0x0415:
            if (r3 == 0) goto L_0x041c
            com.google.ads.interactivemedia.v3.internal.bmm<?, ?> r2 = r9.f16653p
            r2.mo15503c(r12, r3)
        L_0x041c:
            if (r7 != 0) goto L_0x0428
            r2 = r33
            if (r0 != r2) goto L_0x0423
            goto L_0x042e
        L_0x0423:
            com.google.ads.interactivemedia.v3.internal.bkt r0 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16354g()
            throw r0
        L_0x0428:
            r2 = r33
            if (r0 > r2) goto L_0x042f
            if (r1 != r7) goto L_0x042f
        L_0x042e:
            return r0
        L_0x042f:
            com.google.ads.interactivemedia.v3.internal.bkt r0 = com.google.ads.interactivemedia.p039v3.internal.bkt.m16354g()
            goto L_0x0435
        L_0x0434:
            throw r0
        L_0x0435:
            goto L_0x0434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.blp.mo15454i(java.lang.Object, byte[], int, int, int, com.google.ads.interactivemedia.v3.internal.bjg):int");
    }

    /* renamed from: j */
    public final void mo15455j(T t, byte[] bArr, int i, int i2, bjg bjg) throws IOException {
        if (this.f16647j) {
            m16456aa(t, bArr, i, i2, bjg);
        } else {
            mo15454i(t, bArr, i, i2, 0, bjg);
        }
    }

    /* renamed from: k */
    public final void mo15456k(T t) {
        int i;
        int i2 = this.f16650m;
        while (true) {
            i = this.f16651n;
            if (i2 >= i) {
                break;
            }
            long K = m16440K(m16436G(this.f16649l[i2]));
            Object n = bmv.m16740n(t, K);
            if (n != null) {
                bli.m16411h(n);
                bmv.m16741o(t, K, n);
            }
            i2++;
        }
        int length = this.f16649l.length;
        while (i < length) {
            this.f16652o.mo15420b(t, (long) this.f16649l[i]);
            i++;
        }
        this.f16653p.mo15502b(t);
        if (this.f16645h) {
            this.f16656s.mo15550h(t);
        }
    }

    /* renamed from: l */
    public final boolean mo15457l(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f16650m) {
            int i6 = this.f16649l[i5];
            int F = m16435F(i6);
            int G = m16436G(i6);
            int i7 = this.f16640c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f16639b.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & G) != 0 && !m16447R(t, i6, i2, i, i9)) {
                return false;
            }
            int I = m16438I(G);
            if (I != 9 && I != 17) {
                if (I != 27) {
                    if (I == 60 || I == 68) {
                        if (m16450U(t2, F, i6) && !m16433D(t2, G, m16473z(i6))) {
                            return false;
                        }
                    } else if (I != 49) {
                        if (I == 50 && !bli.m16404a(bmv.m16740n(t2, m16440K(G))).isEmpty()) {
                            bnb bnb = bli.m16405b(m16430A(i6)).f16632c;
                            throw null;
                        }
                    }
                }
                List list = (List) bmv.m16740n(t2, m16440K(G));
                if (!list.isEmpty()) {
                    bly z = m16473z(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!z.mo15457l(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m16447R(t, i6, i2, i, i9) && !m16433D(t2, G, m16473z(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f16645h) {
            return true;
        }
        bmw.m16761j(t);
        throw null;
    }
}
