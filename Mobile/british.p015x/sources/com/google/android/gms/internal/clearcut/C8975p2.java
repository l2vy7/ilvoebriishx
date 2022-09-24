package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.p2 */
final class C8975p2<T> implements C8870c3<T> {

    /* renamed from: s */
    private static final Unsafe f44700s = C8859b4.m41586z();

    /* renamed from: a */
    private final int[] f44701a;

    /* renamed from: b */
    private final Object[] f44702b;

    /* renamed from: c */
    private final int f44703c;

    /* renamed from: d */
    private final int f44704d;

    /* renamed from: e */
    private final int f44705e;

    /* renamed from: f */
    private final C8942l2 f44706f;

    /* renamed from: g */
    private final boolean f44707g;

    /* renamed from: h */
    private final boolean f44708h;

    /* renamed from: i */
    private final boolean f44709i;

    /* renamed from: j */
    private final boolean f44710j;

    /* renamed from: k */
    private final int[] f44711k;

    /* renamed from: l */
    private final int[] f44712l;

    /* renamed from: m */
    private final int[] f44713m;

    /* renamed from: n */
    private final C8996s2 f44714n;

    /* renamed from: o */
    private final C9016v1 f44715o;

    /* renamed from: p */
    private final C9011u3<?, ?> f44716p;

    /* renamed from: q */
    private final C8994s0<?> f44717q;

    /* renamed from: r */
    private final C8904g2 f44718r;

    private C8975p2(int[] iArr, Object[] objArr, int i, int i2, int i3, C8942l2 l2Var, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, C8996s2 s2Var, C9016v1 v1Var, C9011u3<?, ?> u3Var, C8994s0<?> s0Var, C8904g2 g2Var) {
        C8942l2 l2Var2 = l2Var;
        C8994s0<?> s0Var2 = s0Var;
        this.f44701a = iArr;
        this.f44702b = objArr;
        this.f44703c = i;
        this.f44704d = i2;
        this.f44705e = i3;
        this.f44708h = l2Var2 instanceof C8891f1;
        this.f44709i = z;
        this.f44707g = s0Var2 != null && s0Var2.mo37143g(l2Var);
        this.f44710j = false;
        this.f44711k = iArr2;
        this.f44712l = iArr3;
        this.f44713m = iArr4;
        this.f44714n = s2Var;
        this.f44715o = v1Var;
        this.f44716p = u3Var;
        this.f44717q = s0Var2;
        this.f44706f = l2Var2;
        this.f44718r = g2Var;
    }

    /* renamed from: A */
    private final boolean m42181A(T t, int i, int i2, int i3) {
        return this.f44709i ? m42216y(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: B */
    private static boolean m42182B(Object obj, int i, C8870c3 c3Var) {
        return c3Var.mo36862e(C8859b4.m41552M(obj, (long) (i & 1048575)));
    }

    /* renamed from: C */
    private final C8870c3 m42183C(int i) {
        int i2 = (i / 4) << 1;
        C8870c3 c3Var = (C8870c3) this.f44702b[i2];
        if (c3Var != null) {
            return c3Var;
        }
        C8870c3 b = C9031x2.m42488a().mo37226b((Class) this.f44702b[i2 + 1]);
        this.f44702b[i2] = b;
        return b;
    }

    /* renamed from: D */
    private final Object m42184D(int i) {
        return this.f44702b[(i / 4) << 1];
    }

    /* renamed from: E */
    private final C8927j1<?> m42185E(int i) {
        return (C8927j1) this.f44702b[((i / 4) << 1) + 1];
    }

    /* renamed from: F */
    private final int m42186F(int i) {
        return this.f44701a[i + 1];
    }

    /* renamed from: G */
    private final int m42187G(int i) {
        return this.f44701a[i + 2];
    }

    /* renamed from: H */
    private final int m42188H(int i) {
        int i2 = this.f44703c;
        if (i >= i2) {
            int i3 = this.f44705e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f44701a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f44704d) {
                int i5 = i3 - i2;
                int length = (this.f44701a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f44701a[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: I */
    private final void m42189I(T t, int i) {
        if (!this.f44709i) {
            int G = m42187G(i);
            long j = (long) (G & 1048575);
            C8859b4.m41567g(t, j, C8859b4.m41547H(t, j) | (1 << (G >>> 20)));
        }
    }

    /* renamed from: J */
    private final void m42190J(T t, int i, int i2) {
        C8859b4.m41567g(t, (long) (m42187G(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42191K(T r19, com.google.android.gms.internal.clearcut.C8977p4 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f44707g
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.s0<?> r3 = r0.f44717q
            com.google.android.gms.internal.clearcut.w0 r3 = r3.mo37138b(r1)
            boolean r5 = r3.mo37207b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo37211e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f44701a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f44700s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x0492
            int r12 = r0.m42186F(r10)
            int[] r13 = r0.f44701a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f44709i
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007c
            com.google.android.gms.internal.clearcut.s0<?> r9 = r0.f44717q
            int r9 = r9.mo37137a(r5)
            if (r9 > r14) goto L_0x007c
            com.google.android.gms.internal.clearcut.s0<?> r9 = r0.f44717q
            r9.mo37139c(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x007a:
            r5 = 0
            goto L_0x005e
        L_0x007c:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0483;
                case 1: goto L_0x0477;
                case 2: goto L_0x046b;
                case 3: goto L_0x045f;
                case 4: goto L_0x0453;
                case 5: goto L_0x0447;
                case 6: goto L_0x043b;
                case 7: goto L_0x042f;
                case 8: goto L_0x0423;
                case 9: goto L_0x0412;
                case 10: goto L_0x0403;
                case 11: goto L_0x03f6;
                case 12: goto L_0x03e9;
                case 13: goto L_0x03dc;
                case 14: goto L_0x03cf;
                case 15: goto L_0x03c2;
                case 16: goto L_0x03b5;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0394;
                case 19: goto L_0x0384;
                case 20: goto L_0x0374;
                case 21: goto L_0x0364;
                case 22: goto L_0x0354;
                case 23: goto L_0x0344;
                case 24: goto L_0x0334;
                case 25: goto L_0x0324;
                case 26: goto L_0x0315;
                case 27: goto L_0x0302;
                case 28: goto L_0x02f3;
                case 29: goto L_0x02e3;
                case 30: goto L_0x02d3;
                case 31: goto L_0x02c3;
                case 32: goto L_0x02b3;
                case 33: goto L_0x02a3;
                case 34: goto L_0x0293;
                case 35: goto L_0x0283;
                case 36: goto L_0x0273;
                case 37: goto L_0x0263;
                case 38: goto L_0x0253;
                case 39: goto L_0x0243;
                case 40: goto L_0x0233;
                case 41: goto L_0x0223;
                case 42: goto L_0x0213;
                case 43: goto L_0x0203;
                case 44: goto L_0x01f3;
                case 45: goto L_0x01e3;
                case 46: goto L_0x01d3;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01b3;
                case 49: goto L_0x01a0;
                case 50: goto L_0x0197;
                case 51: goto L_0x0188;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x011f;
                case 59: goto L_0x0110;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ed;
                case 62: goto L_0x00df;
                case 63: goto L_0x00d1;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b5;
                case 66: goto L_0x00a7;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r13 = 0
            goto L_0x048e
        L_0x0087:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r12)
            r2.mo37064L(r14, r4, r9)
            goto L_0x0084
        L_0x0099:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m42198R(r1, r9)
            r2.mo37072f(r14, r9)
            goto L_0x0084
        L_0x00a7:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37067O(r14, r4)
            goto L_0x0084
        L_0x00b5:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m42198R(r1, r9)
            r2.mo37070c(r14, r9)
            goto L_0x0084
        L_0x00c3:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37091y(r14, r4)
            goto L_0x0084
        L_0x00d1:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37059G(r14, r4)
            goto L_0x0084
        L_0x00df:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37066N(r14, r4)
            goto L_0x0084
        L_0x00ed:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.a0 r4 = (com.google.android.gms.internal.clearcut.C8847a0) r4
            r2.mo37060H(r14, r4)
            goto L_0x0084
        L_0x00fd:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r12)
            r2.mo37062J(r14, r4, r9)
            goto L_0x0084
        L_0x0110:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            m42212u(r14, r4, r2)
            goto L_0x0084
        L_0x011f:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            boolean r4 = m42199S(r1, r9)
            r2.mo37055C(r14, r4)
            goto L_0x0084
        L_0x012e:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37061I(r14, r4)
            goto L_0x0084
        L_0x013d:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m42198R(r1, r9)
            r2.mo37075i(r14, r9)
            goto L_0x0084
        L_0x014c:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m42197Q(r1, r9)
            r2.mo37057E(r14, r4)
            goto L_0x0084
        L_0x015b:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m42198R(r1, r9)
            r2.zza(r14, r9)
            goto L_0x0084
        L_0x016a:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m42198R(r1, r9)
            r2.mo37068a(r14, r9)
            goto L_0x0084
        L_0x0179:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            float r4 = m42196P(r1, r9)
            r2.mo37083q(r14, r4)
            goto L_0x0084
        L_0x0188:
            boolean r4 = r0.m42217z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            double r9 = m42195O(r1, r9)
            r2.mo37082p(r14, r9)
            goto L_0x0084
        L_0x0197:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.m42214w(r2, r14, r4, r12)
            goto L_0x0084
        L_0x01a0:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.c3 r10 = r0.m42183C(r12)
            com.google.android.gms.internal.clearcut.C8887e3.m41728l(r4, r9, r2, r10)
            goto L_0x0084
        L_0x01b3:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01c3:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01d3:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01e3:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01f3:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0203:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0213:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0223:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0233:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0243:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0253:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0263:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0273:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0283:
            r13 = 1
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0293:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02a3:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02b3:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02c3:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02d3:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02e3:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02f3:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41727k(r4, r9, r2)
            goto L_0x0084
        L_0x0302:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.c3 r10 = r0.m42183C(r12)
            com.google.android.gms.internal.clearcut.C8887e3.m41720e(r4, r9, r2, r10)
            goto L_0x0084
        L_0x0315:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41718d(r4, r9, r2)
            goto L_0x0084
        L_0x0324:
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0334:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0344:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0354:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0364:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0374:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0384:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0394:
            r13 = 0
            int[] r4 = r0.f44701a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r4, r9, r2, r13)
            goto L_0x048e
        L_0x03a4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r12)
            r2.mo37064L(r14, r4, r9)
            goto L_0x048e
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo37072f(r14, r9)
            goto L_0x048e
        L_0x03c2:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37067O(r14, r4)
            goto L_0x048e
        L_0x03cf:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo37070c(r14, r9)
            goto L_0x048e
        L_0x03dc:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37091y(r14, r4)
            goto L_0x048e
        L_0x03e9:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37059G(r14, r4)
            goto L_0x048e
        L_0x03f6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37066N(r14, r4)
            goto L_0x048e
        L_0x0403:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.a0 r4 = (com.google.android.gms.internal.clearcut.C8847a0) r4
            r2.mo37060H(r14, r4)
            goto L_0x048e
        L_0x0412:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r12)
            r2.mo37062J(r14, r4, r9)
            goto L_0x048e
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            m42212u(r14, r4, r2)
            goto L_0x048e
        L_0x042f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            boolean r4 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r1, r9)
            r2.mo37055C(r14, r4)
            goto L_0x048e
        L_0x043b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37061I(r14, r4)
            goto L_0x048e
        L_0x0447:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo37075i(r14, r9)
            goto L_0x048e
        L_0x0453:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo37057E(r14, r4)
            goto L_0x048e
        L_0x045f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.zza(r14, r9)
            goto L_0x048e
        L_0x046b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo37068a(r14, r9)
            goto L_0x048e
        L_0x0477:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            float r4 = com.google.android.gms.internal.clearcut.C8859b4.m41550K(r1, r9)
            r2.mo37083q(r14, r4)
            goto L_0x048e
        L_0x0483:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            double r9 = com.google.android.gms.internal.clearcut.C8859b4.m41551L(r1, r9)
            r2.mo37082p(r14, r9)
        L_0x048e:
            int r10 = r12 + 4
            goto L_0x002b
        L_0x0492:
            if (r5 == 0) goto L_0x04a9
            com.google.android.gms.internal.clearcut.s0<?> r4 = r0.f44717q
            r4.mo37139c(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0492
        L_0x04a7:
            r5 = 0
            goto L_0x0492
        L_0x04a9:
            com.google.android.gms.internal.clearcut.u3<?, ?> r3 = r0.f44716p
            m42213v(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.m42191K(java.lang.Object, com.google.android.gms.internal.clearcut.p4):void");
    }

    /* renamed from: L */
    private final void m42192L(T t, T t2, int i) {
        int F = m42186F(i);
        int i2 = this.f44701a[i];
        long j = (long) (F & 1048575);
        if (m42217z(t2, i2, i)) {
            Object M = C8859b4.m41552M(t, j);
            Object M2 = C8859b4.m41552M(t2, j);
            if (M != null && M2 != null) {
                C8859b4.m41569i(t, j, C8910h1.m41835d(M, M2));
                m42190J(t, i2, i);
            } else if (M2 != null) {
                C8859b4.m41569i(t, j, M2);
                m42190J(t, i2, i);
            }
        }
    }

    /* renamed from: M */
    private final boolean m42193M(T t, T t2, int i) {
        return m42216y(t, i) == m42216y(t2, i);
    }

    /* renamed from: N */
    private static <E> List<E> m42194N(Object obj, long j) {
        return (List) C8859b4.m41552M(obj, j);
    }

    /* renamed from: O */
    private static <T> double m42195O(T t, long j) {
        return ((Double) C8859b4.m41552M(t, j)).doubleValue();
    }

    /* renamed from: P */
    private static <T> float m42196P(T t, long j) {
        return ((Float) C8859b4.m41552M(t, j)).floatValue();
    }

    /* renamed from: Q */
    private static <T> int m42197Q(T t, long j) {
        return ((Integer) C8859b4.m41552M(t, j)).intValue();
    }

    /* renamed from: R */
    private static <T> long m42198R(T t, long j) {
        return ((Long) C8859b4.m41552M(t, j)).longValue();
    }

    /* renamed from: S */
    private static <T> boolean m42199S(T t, long j) {
        return ((Boolean) C8859b4.m41552M(t, j)).booleanValue();
    }

    /* renamed from: T */
    private static C9018v3 m42200T(Object obj) {
        C8891f1 f1Var = (C8891f1) obj;
        C9018v3 v3Var = f1Var.zzjp;
        if (v3Var != C9018v3.m42416h()) {
            return v3Var;
        }
        C9018v3 i = C9018v3.m42417i();
        f1Var.zzjp = i;
        return i;
    }

    /* renamed from: d */
    private static int m42201d(int i, byte[] bArr, int i2, int i3, Object obj, C9021w wVar) throws IOException {
        return C9014v.m42395c(i, bArr, i2, i3, m42200T(obj), wVar);
    }

    /* renamed from: k */
    private static int m42202k(C8870c3<?> c3Var, int i, byte[] bArr, int i2, int i3, C8934k1<?> k1Var, C9021w wVar) throws IOException {
        int m = m42204m(c3Var, bArr, i2, i3, wVar);
        while (true) {
            k1Var.add(wVar.f44770c);
            if (m >= i3) {
                break;
            }
            int e = C9014v.m42397e(bArr, m, wVar);
            if (i != wVar.f44768a) {
                break;
            }
            m = m42204m(c3Var, bArr, e, i3, wVar);
        }
        return m;
    }

    /* renamed from: l */
    private static int m42203l(C8870c3 c3Var, byte[] bArr, int i, int i2, int i3, C9021w wVar) throws IOException {
        C8975p2 p2Var = (C8975p2) c3Var;
        Object c = p2Var.mo36861c();
        int r = p2Var.m42209r(c, bArr, i, i2, i3, wVar);
        p2Var.mo36866i(c);
        wVar.f44770c = c;
        return r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m42204m(com.google.android.gms.internal.clearcut.C8870c3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.C9021w r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42396d(r8, r7, r0, r10)
            int r8 = r10.f44768a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo36861c()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo36867j(r1, r2, r3, r4, r5)
            r6.mo36866i(r9)
            r10.f44770c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.l1 r6 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.m42204m(com.google.android.gms.internal.clearcut.c3, byte[], int, int, com.google.android.gms.internal.clearcut.w):int");
    }

    /* renamed from: n */
    private static <UT, UB> int m42205n(C9011u3<UT, UB> u3Var, T t) {
        return u3Var.mo37180j(u3Var.mo37181k(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016f, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m42206o(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.C9021w r29) throws java.io.IOException {
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
            sun.misc.Unsafe r12 = f44700s
            int[] r7 = r0.f44701a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0164;
                case 52: goto L_0x0154;
                case 53: goto L_0x0144;
                case 54: goto L_0x0144;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x0120;
                case 58: goto L_0x010a;
                case 59: goto L_0x00de;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0137;
                case 63: goto L_0x0074;
                case 64: goto L_0x0120;
                case 65: goto L_0x012b;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0178
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0178
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.clearcut.c3 r2 = r0.m42183C(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m42203l(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f44770c
            if (r15 != 0) goto L_0x0052
            goto L_0x0150
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8910h1.m41835d(r15, r3)
            goto L_0x0150
        L_0x0058:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r11)
            long r3 = r11.f44769b
            long r3 = com.google.android.gms.internal.clearcut.C8926j0.m41881a(r3)
            goto L_0x014c
        L_0x0066:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r11)
            int r3 = r11.f44768a
            int r3 = com.google.android.gms.internal.clearcut.C8926j0.m41883e(r3)
            goto L_0x013f
        L_0x0074:
            if (r5 != 0) goto L_0x0178
            int r3 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r11)
            int r4 = r11.f44768a
            com.google.android.gms.internal.clearcut.j1 r5 = r0.m42185E(r6)
            if (r5 == 0) goto L_0x0098
            com.google.android.gms.internal.clearcut.i1 r5 = r5.zzb(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            com.google.android.gms.internal.clearcut.v3 r1 = m42200T(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo37195e(r2, r4)
            r2 = r3
            goto L_0x0179
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0174
        L_0x00a2:
            if (r5 != r15) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r11)
            int r4 = r11.f44768a
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.clearcut.a0 r3 = com.google.android.gms.internal.clearcut.C8847a0.f44287c
            goto L_0x0150
        L_0x00b0:
            com.google.android.gms.internal.clearcut.a0 r3 = com.google.android.gms.internal.clearcut.C8847a0.m41490i(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00b7:
            int r2 = r2 + r4
            goto L_0x0174
        L_0x00ba:
            if (r5 != r15) goto L_0x0178
            com.google.android.gms.internal.clearcut.c3 r2 = r0.m42183C(r6)
            r5 = r20
            int r2 = m42204m(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d1
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d2
        L_0x00d1:
            r15 = 0
        L_0x00d2:
            java.lang.Object r3 = r11.f44770c
            if (r15 != 0) goto L_0x00d8
            goto L_0x0150
        L_0x00d8:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8910h1.m41835d(r15, r3)
            goto L_0x0150
        L_0x00de:
            if (r5 != r15) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r11)
            int r4 = r11.f44768a
            if (r4 != 0) goto L_0x00eb
            java.lang.String r3 = ""
            goto L_0x0150
        L_0x00eb:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00ff
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.C8881d4.m41676i(r3, r2, r5)
            if (r5 == 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41913e()
            throw r1
        L_0x00ff:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.C8910h1.f44548a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b7
        L_0x010a:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r11)
            long r3 = r11.f44769b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0150
        L_0x0120:
            if (r5 != r7) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x015e
        L_0x012b:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            long r2 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x016f
        L_0x0137:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r11)
            int r3 = r11.f44768a
        L_0x013f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0150
        L_0x0144:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r11)
            long r3 = r11.f44769b
        L_0x014c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0150:
            r12.putObject(r1, r9, r3)
            goto L_0x0174
        L_0x0154:
            if (r5 != r7) goto L_0x0178
            float r2 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x015e:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0174
        L_0x0164:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            double r2 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x016f:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0174:
            r12.putInt(r1, r13, r8)
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.m42206o(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.w):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022f, code lost:
        if (r7.f44769b != 0) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0231, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0233, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0234, code lost:
        r12.mo37220e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0237, code lost:
        if (r4 >= r5) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0239, code lost:
        r6 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023f, code lost:
        if (r2 != r7.f44768a) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0241, code lost:
        r4 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0249, code lost:
        if (r7.f44769b == 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0137, code lost:
        if (r4 == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r12.add(com.google.android.gms.internal.clearcut.C8847a0.f44287c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013f, code lost:
        r12.add(com.google.android.gms.internal.clearcut.C8847a0.m41490i(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014f, code lost:
        if (r2 != r7.f44768a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7);
        r4 = r7.f44768a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        if (r4 != 0) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d0  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m42207p(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.clearcut.C9021w r29) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = f44700s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.k1 r12 = (com.google.android.gms.internal.clearcut.C8934k1) r12
            boolean r13 = r12.mo36983n()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.clearcut.k1 r12 = r12.mo36878o(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x035a;
                case 19: goto L_0x031c;
                case 20: goto L_0x02e4;
                case 21: goto L_0x02e4;
                case 22: goto L_0x02ca;
                case 23: goto L_0x028b;
                case 24: goto L_0x024c;
                case 25: goto L_0x01fb;
                case 26: goto L_0x0174;
                case 27: goto L_0x015a;
                case 28: goto L_0x012f;
                case 29: goto L_0x02ca;
                case 30: goto L_0x00f7;
                case 31: goto L_0x024c;
                case 32: goto L_0x028b;
                case 33: goto L_0x00b7;
                case 34: goto L_0x0077;
                case 35: goto L_0x035a;
                case 36: goto L_0x031c;
                case 37: goto L_0x02e4;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02ca;
                case 40: goto L_0x028b;
                case 41: goto L_0x024c;
                case 42: goto L_0x01fb;
                case 43: goto L_0x02ca;
                case 44: goto L_0x00f7;
                case 45: goto L_0x024c;
                case 46: goto L_0x028b;
                case 47: goto L_0x00b7;
                case 48: goto L_0x0077;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0398
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x0398
            com.google.android.gms.internal.clearcut.c3 r1 = r15.m42183C(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = m42203l(r21, r22, r23, r24, r25, r26)
        L_0x0057:
            java.lang.Object r8 = r7.f44770c
            r12.add(r8)
            if (r4 >= r5) goto L_0x0398
            int r8 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r9 = r7.f44768a
            if (r2 != r9) goto L_0x0398
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = m42203l(r21, r22, r23, r24, r25, r26)
            goto L_0x0057
        L_0x0077:
            if (r6 != r13) goto L_0x009b
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x0082:
            if (r1 >= r2) goto L_0x0092
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r1, r7)
            long r4 = r7.f44769b
            long r4 = com.google.android.gms.internal.clearcut.C8926j0.m41881a(r4)
            r12.mo37246j(r4)
            goto L_0x0082
        L_0x0092:
            if (r1 != r2) goto L_0x0096
            goto L_0x0399
        L_0x0096:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x009b:
            if (r6 != 0) goto L_0x0398
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
        L_0x009f:
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r7)
            long r8 = r7.f44769b
            long r8 = com.google.android.gms.internal.clearcut.C8926j0.m41881a(r8)
            r12.mo37246j(r8)
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            goto L_0x009f
        L_0x00b7:
            if (r6 != r13) goto L_0x00db
            com.google.android.gms.internal.clearcut.g1 r12 = (com.google.android.gms.internal.clearcut.C8903g1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x00c2:
            if (r1 >= r2) goto L_0x00d2
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r4 = r7.f44768a
            int r4 = com.google.android.gms.internal.clearcut.C8926j0.m41883e(r4)
            r12.mo36951h(r4)
            goto L_0x00c2
        L_0x00d2:
            if (r1 != r2) goto L_0x00d6
            goto L_0x0399
        L_0x00d6:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x00db:
            if (r6 != 0) goto L_0x0398
            com.google.android.gms.internal.clearcut.g1 r12 = (com.google.android.gms.internal.clearcut.C8903g1) r12
        L_0x00df:
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r4 = r7.f44768a
            int r4 = com.google.android.gms.internal.clearcut.C8926j0.m41883e(r4)
            r12.mo36951h(r4)
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            goto L_0x00df
        L_0x00f7:
            if (r6 != r13) goto L_0x00fe
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42398f(r3, r4, r12, r7)
            goto L_0x010f
        L_0x00fe:
            if (r6 != 0) goto L_0x0398
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42394b(r2, r3, r4, r5, r6, r7)
        L_0x010f:
            com.google.android.gms.internal.clearcut.f1 r1 = (com.google.android.gms.internal.clearcut.C8891f1) r1
            com.google.android.gms.internal.clearcut.v3 r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.v3 r4 = com.google.android.gms.internal.clearcut.C9018v3.m42416h()
            if (r3 != r4) goto L_0x011a
            r3 = 0
        L_0x011a:
            com.google.android.gms.internal.clearcut.j1 r4 = r15.m42185E(r8)
            com.google.android.gms.internal.clearcut.u3<?, ?> r5 = r0.f44716p
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8887e3.m41716c(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.clearcut.v3 r3 = (com.google.android.gms.internal.clearcut.C9018v3) r3
            if (r3 == 0) goto L_0x012c
            r1.zzjp = r3
        L_0x012c:
            r1 = r2
            goto L_0x0399
        L_0x012f:
            if (r6 != r13) goto L_0x0398
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r4 = r7.f44768a
            if (r4 != 0) goto L_0x013f
        L_0x0139:
            com.google.android.gms.internal.clearcut.a0 r4 = com.google.android.gms.internal.clearcut.C8847a0.f44287c
            r12.add(r4)
            goto L_0x0147
        L_0x013f:
            com.google.android.gms.internal.clearcut.a0 r6 = com.google.android.gms.internal.clearcut.C8847a0.m41490i(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0147:
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r4 = r7.f44768a
            if (r4 != 0) goto L_0x013f
            goto L_0x0139
        L_0x015a:
            if (r6 != r13) goto L_0x0398
            com.google.android.gms.internal.clearcut.c3 r1 = r15.m42183C(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = m42202k(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0399
        L_0x0174:
            if (r6 != r13) goto L_0x0398
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            if (r6 != 0) goto L_0x01b3
            int r6 = r7.f44768a
            if (r6 != 0) goto L_0x018d
        L_0x0189:
            r12.add(r1)
            goto L_0x0198
        L_0x018d:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C8910h1.f44548a
            r8.<init>(r3, r4, r6, r9)
        L_0x0194:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x0198:
            if (r4 >= r5) goto L_0x0398
            int r6 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r8 = r7.f44768a
            if (r2 != r8) goto L_0x0398
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r6, r7)
            int r6 = r7.f44768a
            if (r6 != 0) goto L_0x01ab
            goto L_0x0189
        L_0x01ab:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C8910h1.f44548a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x0194
        L_0x01b3:
            int r6 = r7.f44768a
            if (r6 != 0) goto L_0x01bb
        L_0x01b7:
            r12.add(r1)
            goto L_0x01ce
        L_0x01bb:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.clearcut.C8881d4.m41676i(r3, r4, r8)
            if (r9 == 0) goto L_0x01f6
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C8910h1.f44548a
            r9.<init>(r3, r4, r6, r10)
        L_0x01ca:
            r12.add(r9)
            r4 = r8
        L_0x01ce:
            if (r4 >= r5) goto L_0x0398
            int r6 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r8 = r7.f44768a
            if (r2 != r8) goto L_0x0398
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r6, r7)
            int r6 = r7.f44768a
            if (r6 != 0) goto L_0x01e1
            goto L_0x01b7
        L_0x01e1:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.clearcut.C8881d4.m41676i(r3, r4, r8)
            if (r9 == 0) goto L_0x01f1
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C8910h1.f44548a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01ca
        L_0x01f1:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41913e()
            throw r1
        L_0x01f6:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41913e()
            throw r1
        L_0x01fb:
            r1 = 0
            if (r6 != r13) goto L_0x0223
            com.google.android.gms.internal.clearcut.x r12 = (com.google.android.gms.internal.clearcut.C9028x) r12
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r4 = r7.f44768a
            int r4 = r4 + r2
        L_0x0207:
            if (r2 >= r4) goto L_0x021a
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r2, r7)
            long r5 = r7.f44769b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0215
            r5 = 1
            goto L_0x0216
        L_0x0215:
            r5 = 0
        L_0x0216:
            r12.mo37220e(r5)
            goto L_0x0207
        L_0x021a:
            if (r2 != r4) goto L_0x021e
            goto L_0x012c
        L_0x021e:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x0223:
            if (r6 != 0) goto L_0x0398
            com.google.android.gms.internal.clearcut.x r12 = (com.google.android.gms.internal.clearcut.C9028x) r12
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r7)
            long r8 = r7.f44769b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0233
        L_0x0231:
            r6 = 1
            goto L_0x0234
        L_0x0233:
            r6 = 0
        L_0x0234:
            r12.mo37220e(r6)
            if (r4 >= r5) goto L_0x0398
            int r6 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r8 = r7.f44768a
            if (r2 != r8) goto L_0x0398
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r6, r7)
            long r8 = r7.f44769b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0233
            goto L_0x0231
        L_0x024c:
            if (r6 != r13) goto L_0x026c
            com.google.android.gms.internal.clearcut.g1 r12 = (com.google.android.gms.internal.clearcut.C8903g1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x0257:
            if (r1 >= r2) goto L_0x0263
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r3, r1)
            r12.mo36951h(r4)
            int r1 = r1 + 4
            goto L_0x0257
        L_0x0263:
            if (r1 != r2) goto L_0x0267
            goto L_0x0399
        L_0x0267:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x026c:
            if (r6 != r9) goto L_0x0398
            com.google.android.gms.internal.clearcut.g1 r12 = (com.google.android.gms.internal.clearcut.C8903g1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r17, r18)
            r12.mo36951h(r1)
        L_0x0277:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r3, r4)
            r12.mo36951h(r1)
            goto L_0x0277
        L_0x028b:
            if (r6 != r13) goto L_0x02ab
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x0296:
            if (r1 >= r2) goto L_0x02a2
            long r4 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r3, r1)
            r12.mo37246j(r4)
            int r1 = r1 + 8
            goto L_0x0296
        L_0x02a2:
            if (r1 != r2) goto L_0x02a6
            goto L_0x0399
        L_0x02a6:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x02ab:
            if (r6 != r14) goto L_0x0398
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
            long r8 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r17, r18)
            r12.mo37246j(r8)
        L_0x02b6:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            long r8 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r3, r4)
            r12.mo37246j(r8)
            goto L_0x02b6
        L_0x02ca:
            if (r6 != r13) goto L_0x02d2
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42398f(r3, r4, r12, r7)
            goto L_0x0399
        L_0x02d2:
            if (r6 != 0) goto L_0x0398
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42394b(r20, r21, r22, r23, r24, r25)
            goto L_0x0399
        L_0x02e4:
            if (r6 != r13) goto L_0x0304
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x02ef:
            if (r1 >= r2) goto L_0x02fb
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r1, r7)
            long r4 = r7.f44769b
            r12.mo37246j(r4)
            goto L_0x02ef
        L_0x02fb:
            if (r1 != r2) goto L_0x02ff
            goto L_0x0399
        L_0x02ff:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x0304:
            if (r6 != 0) goto L_0x0398
            com.google.android.gms.internal.clearcut.z1 r12 = (com.google.android.gms.internal.clearcut.C9044z1) r12
        L_0x0308:
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r3, r4, r7)
            long r8 = r7.f44769b
            r12.mo37246j(r8)
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            goto L_0x0308
        L_0x031c:
            if (r6 != r13) goto L_0x033b
            com.google.android.gms.internal.clearcut.d1 r12 = (com.google.android.gms.internal.clearcut.C8878d1) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x0327:
            if (r1 >= r2) goto L_0x0333
            float r4 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r3, r1)
            r12.mo36874e(r4)
            int r1 = r1 + 4
            goto L_0x0327
        L_0x0333:
            if (r1 != r2) goto L_0x0336
            goto L_0x0399
        L_0x0336:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x033b:
            if (r6 != r9) goto L_0x0398
            com.google.android.gms.internal.clearcut.d1 r12 = (com.google.android.gms.internal.clearcut.C8878d1) r12
            float r1 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r17, r18)
            r12.mo36874e(r1)
        L_0x0346:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            float r1 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r3, r4)
            r12.mo36874e(r1)
            goto L_0x0346
        L_0x035a:
            if (r6 != r13) goto L_0x0379
            com.google.android.gms.internal.clearcut.p0 r12 = (com.google.android.gms.internal.clearcut.C8973p0) r12
            int r1 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r4, r7)
            int r2 = r7.f44768a
            int r2 = r2 + r1
        L_0x0365:
            if (r1 >= r2) goto L_0x0371
            double r4 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r3, r1)
            r12.mo37110e(r4)
            int r1 = r1 + 8
            goto L_0x0365
        L_0x0371:
            if (r1 != r2) goto L_0x0374
            goto L_0x0399
        L_0x0374:
            com.google.android.gms.internal.clearcut.l1 r1 = com.google.android.gms.internal.clearcut.C8941l1.m41909a()
            throw r1
        L_0x0379:
            if (r6 != r14) goto L_0x0398
            com.google.android.gms.internal.clearcut.p0 r12 = (com.google.android.gms.internal.clearcut.C8973p0) r12
            double r8 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r17, r18)
            r12.mo37110e(r8)
        L_0x0384:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0399
            int r4 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r3, r1, r7)
            int r6 = r7.f44768a
            if (r2 != r6) goto L_0x0399
            double r8 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r3, r4)
            r12.mo37110e(r8)
            goto L_0x0384
        L_0x0398:
            r1 = r4
        L_0x0399:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.m42207p(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.w):int");
    }

    /* renamed from: q */
    private final <K, V> int m42208q(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, C9021w wVar) throws IOException {
        Unsafe unsafe = f44700s;
        Object D = m42184D(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f44718r.mo36960f(object)) {
            Object c = this.f44718r.mo36957c(D);
            this.f44718r.mo36963i(c, object);
            unsafe.putObject(t, j, c);
            object = c;
        }
        this.f44718r.mo36959e(D);
        this.f44718r.mo36962h(object);
        int e = C9014v.m42397e(bArr, i, wVar);
        int i5 = wVar.f44768a;
        if (i5 < 0 || i5 > i2 - e) {
            throw C8941l1.m41909a();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f0, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0338, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0354, code lost:
        if (r0 == r15) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0356, code lost:
        r9 = r29;
        r8 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r5 = r4;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        r6 = r6 | r20;
        r13 = r30;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013d, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        r10.putObject(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c6, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ed, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0256, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025c, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025e, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025f, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0263, code lost:
        r7 = r29;
        r8 = r31;
        r2 = r5;
        r25 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m42209r(T r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.clearcut.C9021w r32) throws java.io.IOException {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            sun.misc.Unsafe r10 = f44700s
            r16 = 0
            r8 = -1
            r0 = r29
            r1 = 0
            r6 = 0
            r7 = -1
        L_0x0016:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x0395
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42396d(r0, r12, r1, r9)
            int r1 = r9.f44768a
            r4 = r0
            r5 = r1
            goto L_0x002c
        L_0x002a:
            r5 = r0
            r4 = r1
        L_0x002c:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.m42188H(r3)
            if (r1 == r8) goto L_0x035c
            int[] r0 = r15.f44701a
            int r18 = r1 + 1
            r8 = r0[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r29 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r18 = r8
            if (r11 > r5) goto L_0x026c
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r20 = r8 << r5
            r0 = r0 & r17
            r5 = -1
            if (r0 == r7) goto L_0x0067
            if (r7 == r5) goto L_0x0061
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0061:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
        L_0x0067:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0240;
                case 1: goto L_0x022a;
                case 2: goto L_0x0206;
                case 3: goto L_0x0206;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01cd;
                case 6: goto L_0x01b0;
                case 7: goto L_0x0190;
                case 8: goto L_0x016d;
                case 9: goto L_0x0141;
                case 10: goto L_0x0124;
                case 11: goto L_0x01f0;
                case 12: goto L_0x00ef;
                case 13: goto L_0x01b0;
                case 14: goto L_0x01cd;
                case 15: goto L_0x00d7;
                case 16: goto L_0x00b1;
                case 17: goto L_0x0076;
                default: goto L_0x006b;
            }
        L_0x006b:
            r12 = r28
            r9 = r29
            r11 = r32
        L_0x0071:
            r5 = r4
            r29 = r7
            goto L_0x0263
        L_0x0076:
            r0 = 3
            if (r2 != r0) goto L_0x00ac
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.clearcut.c3 r0 = r15.m42183C(r1)
            r1 = r28
            r2 = r4
            r3 = r30
            r4 = r8
            r9 = r29
            r8 = -1
            r5 = r32
            int r0 = m42203l(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            r11 = r32
            if (r1 != 0) goto L_0x0099
            java.lang.Object r1 = r11.f44770c
            goto L_0x00a3
        L_0x0099:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.f44770c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C8910h1.m41835d(r1, r2)
        L_0x00a3:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r20
            r12 = r28
            goto L_0x0121
        L_0x00ac:
            r9 = r29
            r11 = r32
            goto L_0x00d4
        L_0x00b1:
            r9 = r29
            r11 = r32
            r8 = -1
            if (r2 != 0) goto L_0x00d4
            r2 = r12
            r12 = r28
            int r13 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r4, r11)
            long r0 = r11.f44769b
            long r4 = com.google.android.gms.internal.clearcut.C8926j0.m41881a(r0)
            r0 = r10
            r1 = r27
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r30
            goto L_0x025f
        L_0x00d4:
            r12 = r28
            goto L_0x0071
        L_0x00d7:
            r9 = r29
            r11 = r32
            r0 = r12
            r8 = -1
            r12 = r28
            if (r2 != 0) goto L_0x0071
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r4, r11)
            int r3 = r11.f44768a
            int r3 = com.google.android.gms.internal.clearcut.C8926j0.m41883e(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0138
        L_0x00ef:
            r9 = r29
            r11 = r32
            r21 = r12
            r8 = -1
            r12 = r28
            if (r2 != 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r4, r11)
            int r2 = r11.f44768a
            com.google.android.gms.internal.clearcut.j1 r1 = r15.m42185E(r1)
            if (r1 == 0) goto L_0x011a
            com.google.android.gms.internal.clearcut.i1 r1 = r1.zzb(r2)
            if (r1 == 0) goto L_0x010d
            goto L_0x011a
        L_0x010d:
            com.google.android.gms.internal.clearcut.v3 r1 = m42200T(r27)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo37195e(r9, r2)
            goto L_0x0121
        L_0x011a:
            r3 = r21
            r10.putInt(r14, r3, r2)
            r6 = r6 | r20
        L_0x0121:
            r13 = r30
            goto L_0x013d
        L_0x0124:
            r9 = r29
            r11 = r32
            r0 = r12
            r3 = 2
            r8 = -1
            r12 = r28
            if (r2 != r3) goto L_0x0071
            int r2 = com.google.android.gms.internal.clearcut.C9014v.m42405m(r12, r4, r11)
            java.lang.Object r3 = r11.f44770c
            r10.putObject(r14, r0, r3)
        L_0x0138:
            r6 = r6 | r20
            r13 = r30
            r0 = r2
        L_0x013d:
            r1 = r9
            r9 = r11
            goto L_0x025f
        L_0x0141:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0169
            com.google.android.gms.internal.clearcut.c3 r0 = r15.m42183C(r1)
            r5 = r30
            int r0 = m42204m(r0, r12, r4, r5, r11)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x015e
            java.lang.Object r1 = r11.f44770c
            goto L_0x018c
        L_0x015e:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.f44770c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C8910h1.m41835d(r1, r2)
            goto L_0x018c
        L_0x0169:
            r5 = r30
            goto L_0x01ed
        L_0x016d:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 2
            r12 = r28
            if (r2 != r0) goto L_0x01ed
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x0186
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42401i(r12, r4, r11)
            goto L_0x018a
        L_0x0186:
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42402j(r12, r4, r11)
        L_0x018a:
            java.lang.Object r1 = r11.f44770c
        L_0x018c:
            r10.putObject(r14, r7, r1)
            goto L_0x01c6
        L_0x0190:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x01ed
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r4, r11)
            long r1 = r11.f44769b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x01ab
            r1 = 1
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            com.google.android.gms.internal.clearcut.C8859b4.m41570j(r14, r7, r1)
            goto L_0x01c6
        L_0x01b0:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x01ed
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
        L_0x01c6:
            r6 = r6 | r20
            r7 = r29
            r13 = r5
            goto L_0x025c
        L_0x01cd:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x01ed
            long r17 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r12, r4)
            r0 = r10
            r1 = r27
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0256
        L_0x01ed:
            r5 = r4
            goto L_0x0263
        L_0x01f0:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0263
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r5, r11)
            int r1 = r11.f44768a
            r10.putInt(r14, r7, r1)
            goto L_0x0256
        L_0x0206:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0263
            int r17 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r5, r11)
            long r4 = r11.f44769b
            r0 = r10
            r1 = r27
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r7 = r29
            r13 = r30
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x025e
        L_0x022a:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x0263
            float r0 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r12, r5)
            com.google.android.gms.internal.clearcut.C8859b4.m41566f(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x0256
        L_0x0240:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x0263
            double r0 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r12, r5)
            com.google.android.gms.internal.clearcut.C8859b4.m41565e(r14, r7, r0)
            int r0 = r5 + 8
        L_0x0256:
            r6 = r6 | r20
            r7 = r29
            r13 = r30
        L_0x025c:
            r1 = r9
            r9 = r11
        L_0x025e:
            r8 = -1
        L_0x025f:
            r11 = r31
            goto L_0x0016
        L_0x0263:
            r7 = r29
            r8 = r31
            r2 = r5
            r25 = r10
            goto L_0x036e
        L_0x026c:
            r9 = r29
            r5 = r4
            r19 = r7
            r7 = r12
            r12 = r28
            r0 = 27
            if (r11 != r0) goto L_0x02be
            r0 = 2
            if (r2 != r0) goto L_0x02b7
            java.lang.Object r0 = r10.getObject(r14, r7)
            com.google.android.gms.internal.clearcut.k1 r0 = (com.google.android.gms.internal.clearcut.C8934k1) r0
            boolean r2 = r0.mo36983n()
            if (r2 != 0) goto L_0x0299
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0290
            r2 = 10
            goto L_0x0292
        L_0x0290:
            int r2 = r2 << 1
        L_0x0292:
            com.google.android.gms.internal.clearcut.k1 r0 = r0.mo36878o(r2)
            r10.putObject(r14, r7, r0)
        L_0x0299:
            r7 = r0
            com.google.android.gms.internal.clearcut.c3 r0 = r15.m42183C(r1)
            r1 = r9
            r2 = r28
            r3 = r5
            r4 = r30
            r5 = r7
            r20 = r6
            r6 = r32
            int r0 = m42202k(r0, r1, r2, r3, r4, r5, r6)
            r13 = r30
            r11 = r31
            r7 = r19
            r6 = r20
            goto L_0x0390
        L_0x02b7:
            r20 = r6
            r15 = r5
            r29 = r9
            goto L_0x0363
        L_0x02be:
            r20 = r6
            r0 = 49
            if (r11 > r0) goto L_0x030b
            r6 = r18
            long r13 = (long) r6
            r0 = r26
            r18 = r1
            r1 = r27
            r6 = r2
            r2 = r28
            r21 = r3
            r3 = r5
            r4 = r30
            r15 = r5
            r5 = r9
            r22 = r6
            r6 = r21
            r23 = r7
            r7 = r22
            r8 = r18
            r29 = r9
            r25 = r10
            r9 = r13
            r14 = r31
            r12 = r23
            r14 = r32
            int r0 = r0.m42207p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02f4
            goto L_0x0356
        L_0x02f4:
            r15 = r26
            r14 = r27
            r12 = r28
            r1 = r29
            r13 = r30
            r11 = r31
            r9 = r32
            r7 = r19
            r6 = r20
            r10 = r25
            r8 = -1
            goto L_0x0016
        L_0x030b:
            r22 = r2
            r21 = r3
            r15 = r5
            r23 = r7
            r29 = r9
            r25 = r10
            r6 = r18
            r18 = r1
            r0 = 50
            r7 = r22
            if (r11 != r0) goto L_0x033b
            r0 = 2
            if (r7 != r0) goto L_0x0365
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r18
            r6 = r21
            r7 = r23
            r9 = r32
            int r0 = r0.m42208q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x02f4
            goto L_0x0356
        L_0x033b:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r29
            r8 = r6
            r6 = r21
            r9 = r11
            r10 = r23
            r12 = r18
            r13 = r32
            int r0 = r0.m42206o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02f4
        L_0x0356:
            r9 = r29
            r8 = r31
            r2 = r0
            goto L_0x036a
        L_0x035c:
            r15 = r4
            r29 = r5
            r20 = r6
            r19 = r7
        L_0x0363:
            r25 = r10
        L_0x0365:
            r9 = r29
            r8 = r31
            r2 = r15
        L_0x036a:
            r7 = r19
            r6 = r20
        L_0x036e:
            if (r9 != r8) goto L_0x0377
            if (r8 != 0) goto L_0x0373
            goto L_0x0377
        L_0x0373:
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x03a1
        L_0x0377:
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r5 = r32
            int r0 = m42201d(r0, r1, r2, r3, r4, r5)
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r8
            r1 = r9
            r10 = r25
        L_0x0390:
            r8 = -1
            r9 = r32
            goto L_0x0016
        L_0x0395:
            r20 = r6
            r19 = r7
            r25 = r10
            r8 = r11
            r7 = r0
            r9 = r1
            r0 = r19
            r1 = -1
        L_0x03a1:
            if (r0 == r1) goto L_0x03ac
            long r0 = (long) r0
            r10 = r27
            r2 = r25
            r2.putInt(r10, r0, r6)
            goto L_0x03ae
        L_0x03ac:
            r10 = r27
        L_0x03ae:
            r11 = r26
            int[] r12 = r11.f44712l
            if (r12 == 0) goto L_0x03ef
            r0 = 0
            int r13 = r12.length
            r5 = r0
            r14 = 0
        L_0x03b8:
            if (r14 >= r13) goto L_0x03e8
            r1 = r12[r14]
            com.google.android.gms.internal.clearcut.u3<?, ?> r6 = r11.f44716p
            int[] r0 = r11.f44701a
            r2 = r0[r1]
            int r0 = r11.m42186F(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r3)
            if (r0 != 0) goto L_0x03d0
            goto L_0x03e3
        L_0x03d0:
            com.google.android.gms.internal.clearcut.j1 r4 = r11.m42185E(r1)
            if (r4 != 0) goto L_0x03d7
            goto L_0x03e3
        L_0x03d7:
            com.google.android.gms.internal.clearcut.g2 r3 = r11.f44718r
            java.util.Map r3 = r3.mo36962h(r0)
            r0 = r26
            java.lang.Object r5 = r0.m42211t(r1, r2, r3, r4, r5, r6)
        L_0x03e3:
            com.google.android.gms.internal.clearcut.v3 r5 = (com.google.android.gms.internal.clearcut.C9018v3) r5
            int r14 = r14 + 1
            goto L_0x03b8
        L_0x03e8:
            if (r5 == 0) goto L_0x03ef
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r11.f44716p
            r0.mo37178h(r10, r5)
        L_0x03ef:
            r0 = r30
            if (r8 != 0) goto L_0x03fb
            if (r7 != r0) goto L_0x03f6
            goto L_0x03ff
        L_0x03f6:
            com.google.android.gms.internal.clearcut.l1 r0 = com.google.android.gms.internal.clearcut.C8941l1.m41912d()
            throw r0
        L_0x03fb:
            if (r7 > r0) goto L_0x0400
            if (r9 != r8) goto L_0x0400
        L_0x03ff:
            return r7
        L_0x0400:
            com.google.android.gms.internal.clearcut.l1 r0 = com.google.android.gms.internal.clearcut.C8941l1.m41912d()
            goto L_0x0406
        L_0x0405:
            throw r0
        L_0x0406:
            goto L_0x0405
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.m42209r(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.w):int");
    }

    /* renamed from: s */
    static <T> C8975p2<T> m42210s(Class<T> cls, C8928j2 j2Var, C8996s2 s2Var, C9016v1 v1Var, C9011u3<?, ?> u3Var, C8994s0<?> s0Var, C8904g2 g2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C8928j2 j2Var2 = j2Var;
        if (j2Var2 instanceof C9045z2) {
            C9045z2 z2Var = (C9045z2) j2Var2;
            boolean z = z2Var.mo36979a() == C8891f1.C8896e.f44527j;
            if (z2Var.mo37251d() == 0) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int f = z2Var.mo37253f();
                int g = z2Var.mo37254g();
                i3 = z2Var.mo37258k();
                i2 = f;
                i = g;
            }
            int[] iArr = new int[(i3 << 2)];
            Object[] objArr = new Object[(i3 << 1)];
            int[] iArr2 = z2Var.mo37255h() > 0 ? new int[z2Var.mo37255h()] : null;
            int[] iArr3 = z2Var.mo37256i() > 0 ? new int[z2Var.mo37256i()] : null;
            C8850a3 e = z2Var.mo37252e();
            if (e.mo36814a()) {
                int g2 = e.mo36815g();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (g2 >= z2Var.mo37259l() || i7 >= ((g2 - i2) << 2)) {
                        if (e.mo36817k()) {
                            i6 = (int) C8859b4.m41562b(e.mo36818l());
                            i4 = (int) C8859b4.m41562b(e.mo36819m());
                            i5 = 0;
                        } else {
                            i6 = (int) C8859b4.m41562b(e.mo36820n());
                            if (e.mo36821o()) {
                                i4 = (int) C8859b4.m41562b(e.mo36822p());
                                i5 = e.mo36823q();
                            } else {
                                i5 = 0;
                                i4 = 0;
                            }
                        }
                        iArr[i7] = e.mo36815g();
                        int i10 = i7 + 1;
                        iArr[i10] = (e.mo36825s() ? 536870912 : 0) | (e.mo36824r() ? 268435456 : 0) | (e.mo36816h() << 20) | i6;
                        iArr[i7 + 2] = (i5 << 20) | i4;
                        if (e.mo36828v() != null) {
                            int i11 = (i7 / 4) << 1;
                            objArr[i11] = e.mo36828v();
                            if (e.mo36826t() != null) {
                                objArr[i11 + 1] = e.mo36826t();
                            } else if (e.mo36827u() != null) {
                                objArr[i11 + 1] = e.mo36827u();
                            }
                        } else if (e.mo36826t() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo36826t();
                        } else if (e.mo36827u() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo36827u();
                        }
                        int h = e.mo36816h();
                        if (h == C8848a1.MAP.ordinal()) {
                            iArr2[i8] = i7;
                            i8++;
                        } else if (h >= 18 && h <= 49) {
                            iArr3[i9] = iArr[i10] & 1048575;
                            i9++;
                        }
                        if (!e.mo36814a()) {
                            break;
                        }
                        g2 = e.mo36815g();
                    } else {
                        for (int i12 = 0; i12 < 4; i12++) {
                            iArr[i7 + i12] = -1;
                        }
                    }
                    i7 += 4;
                }
            }
            return new C8975p2(iArr, objArr, i2, i, z2Var.mo37259l(), z2Var.mo36981c(), z, false, z2Var.mo37257j(), iArr2, iArr3, s2Var, v1Var, u3Var, s0Var, g2Var);
        }
        ((C8976p3) j2Var2).mo36979a();
        throw new NoSuchMethodError();
    }

    /* renamed from: t */
    private final <K, V, UT, UB> UB m42211t(int i, int i2, Map<K, V> map, C8927j1<?> j1Var, UB ub, C9011u3<UT, UB> u3Var) {
        C8886e2<?, ?> e = this.f44718r.mo36959e(m42184D(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (j1Var.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = u3Var.mo37176f();
                }
                C8890f0 r = C8847a0.m41492r(C8879d2.m41665a(e, next.getKey(), next.getValue()));
                try {
                    C8879d2.m41666b(r.mo36890b(), e, next.getKey(), next.getValue());
                    u3Var.mo37172b(ub, i2, r.mo36889a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: u */
    private static void m42212u(int i, Object obj, C8977p4 p4Var) throws IOException {
        if (obj instanceof String) {
            p4Var.mo37069b(i, (String) obj);
        } else {
            p4Var.mo37060H(i, (C8847a0) obj);
        }
    }

    /* renamed from: v */
    private static <UT, UB> void m42213v(C9011u3<UT, UB> u3Var, T t, C8977p4 p4Var) throws IOException {
        u3Var.mo37173c(u3Var.mo37181k(t), p4Var);
    }

    /* renamed from: w */
    private final <K, V> void m42214w(C8977p4 p4Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            p4Var.mo37065M(i, this.f44718r.mo36959e(m42184D(i2)), this.f44718r.mo36961g(obj));
        }
    }

    /* renamed from: x */
    private final void m42215x(T t, T t2, int i) {
        long F = (long) (m42186F(i) & 1048575);
        if (m42216y(t2, i)) {
            Object M = C8859b4.m41552M(t, F);
            Object M2 = C8859b4.m41552M(t2, F);
            if (M != null && M2 != null) {
                C8859b4.m41569i(t, F, C8910h1.m41835d(M, M2));
                m42189I(t, i);
            } else if (M2 != null) {
                C8859b4.m41569i(t, F, M2);
                m42189I(t, i);
            }
        }
    }

    /* renamed from: y */
    private final boolean m42216y(T t, int i) {
        if (this.f44709i) {
            int F = m42186F(i);
            long j = (long) (F & 1048575);
            switch ((F & 267386880) >>> 20) {
                case 0:
                    return C8859b4.m41551L(t, j) != 0.0d;
                case 1:
                    return C8859b4.m41550K(t, j) != 0.0f;
                case 2:
                    return C8859b4.m41548I(t, j) != 0;
                case 3:
                    return C8859b4.m41548I(t, j) != 0;
                case 4:
                    return C8859b4.m41547H(t, j) != 0;
                case 5:
                    return C8859b4.m41548I(t, j) != 0;
                case 6:
                    return C8859b4.m41547H(t, j) != 0;
                case 7:
                    return C8859b4.m41549J(t, j);
                case 8:
                    Object M = C8859b4.m41552M(t, j);
                    if (M instanceof String) {
                        return !((String) M).isEmpty();
                    }
                    if (M instanceof C8847a0) {
                        return !C8847a0.f44287c.equals(M);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C8859b4.m41552M(t, j) != null;
                case 10:
                    return !C8847a0.f44287c.equals(C8859b4.m41552M(t, j));
                case 11:
                    return C8859b4.m41547H(t, j) != 0;
                case 12:
                    return C8859b4.m41547H(t, j) != 0;
                case 13:
                    return C8859b4.m41547H(t, j) != 0;
                case 14:
                    return C8859b4.m41548I(t, j) != 0;
                case 15:
                    return C8859b4.m41547H(t, j) != 0;
                case 16:
                    return C8859b4.m41548I(t, j) != 0;
                case 17:
                    return C8859b4.m41552M(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int G = m42187G(i);
            return (C8859b4.m41547H(t, (long) (G & 1048575)) & (1 << (G >>> 20))) != 0;
        }
    }

    /* renamed from: z */
    private final boolean m42217z(T t, int i, int i2) {
        return C8859b4.m41547H(t, (long) (m42187G(i2) & 1048575)) == i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.C8887e3.m41741y(com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6), com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.C8887e3.m41741y(com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6), com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.C8887e3.m41741y(com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6), com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.C8887e3.m41741y(com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6), com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41549J(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41549J(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6) == com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.C8887e3.m41741y(com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6), com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)) != false) goto L_0x01a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36859a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f44701a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.m42186F(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
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
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.m42187G(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r4)
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r3 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r3, r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C8887e3.m41741y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r10, r6)
            boolean r5 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r11, r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.m42193M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r9.f44716p
            java.lang.Object r0 = r0.mo37181k(r10)
            com.google.android.gms.internal.clearcut.u3<?, ?> r2 = r9.f44716p
            java.lang.Object r2 = r2.mo37181k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.f44707g
            if (r0 == 0) goto L_0x01d2
            com.google.android.gms.internal.clearcut.s0<?> r0 = r9.f44717q
            com.google.android.gms.internal.clearcut.w0 r10 = r0.mo37138b(r10)
            com.google.android.gms.internal.clearcut.s0<?> r0 = r9.f44717q
            com.google.android.gms.internal.clearcut.w0 r11 = r0.mo37138b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36859a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        com.google.android.gms.internal.clearcut.C8859b4.m41569i(r7, r2, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r8, r2));
        m42190J(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        com.google.android.gms.internal.clearcut.C8859b4.m41569i(r7, r2, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        com.google.android.gms.internal.clearcut.C8859b4.m41567g(r7, r2, com.google.android.gms.internal.clearcut.C8859b4.m41547H(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        com.google.android.gms.internal.clearcut.C8859b4.m41568h(r7, r2, com.google.android.gms.internal.clearcut.C8859b4.m41548I(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        m42189I(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36860b(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f44701a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f3
            int r1 = r6.m42186F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f44701a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00a0;
                case 7: goto L_0x0092;
                case 8: goto L_0x0084;
                case 9: goto L_0x007f;
                case 10: goto L_0x0078;
                case 11: goto L_0x0071;
                case 12: goto L_0x006a;
                case 13: goto L_0x0063;
                case 14: goto L_0x005b;
                case 15: goto L_0x0054;
                case 16: goto L_0x004c;
                case 17: goto L_0x007f;
                case 18: goto L_0x0045;
                case 19: goto L_0x0045;
                case 20: goto L_0x0045;
                case 21: goto L_0x0045;
                case 22: goto L_0x0045;
                case 23: goto L_0x0045;
                case 24: goto L_0x0045;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x0045;
                case 28: goto L_0x0045;
                case 29: goto L_0x0045;
                case 30: goto L_0x0045;
                case 31: goto L_0x0045;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x0045;
                case 35: goto L_0x0045;
                case 36: goto L_0x0045;
                case 37: goto L_0x0045;
                case 38: goto L_0x0045;
                case 39: goto L_0x0045;
                case 40: goto L_0x0045;
                case 41: goto L_0x0045;
                case 42: goto L_0x0045;
                case 43: goto L_0x0045;
                case 44: goto L_0x0045;
                case 45: goto L_0x0045;
                case 46: goto L_0x0045;
                case 47: goto L_0x0045;
                case 48: goto L_0x0045;
                case 49: goto L_0x0045;
                case 50: goto L_0x003e;
                case 51: goto L_0x002c;
                case 52: goto L_0x002c;
                case 53: goto L_0x002c;
                case 54: goto L_0x002c;
                case 55: goto L_0x002c;
                case 56: goto L_0x002c;
                case 57: goto L_0x002c;
                case 58: goto L_0x002c;
                case 59: goto L_0x002c;
                case 60: goto L_0x0027;
                case 61: goto L_0x0020;
                case 62: goto L_0x0020;
                case 63: goto L_0x0020;
                case 64: goto L_0x0020;
                case 65: goto L_0x0020;
                case 66: goto L_0x0020;
                case 67: goto L_0x0020;
                case 68: goto L_0x0027;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00ef
        L_0x0020:
            boolean r1 = r6.m42217z(r8, r4, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0032
        L_0x0027:
            r6.m42192L(r7, r8, r0)
            goto L_0x00ef
        L_0x002c:
            boolean r1 = r6.m42217z(r8, r4, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x0032:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41569i(r7, r2, r1)
            r6.m42190J(r7, r4, r0)
            goto L_0x00ef
        L_0x003e:
            com.google.android.gms.internal.clearcut.g2 r1 = r6.f44718r
            com.google.android.gms.internal.clearcut.C8887e3.m41724h(r1, r7, r8, r2)
            goto L_0x00ef
        L_0x0045:
            com.google.android.gms.internal.clearcut.v1 r1 = r6.f44715o
            r1.mo37191b(r7, r8, r2)
            goto L_0x00ef
        L_0x004c:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x0054:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0070
        L_0x005b:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x0063:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0070
        L_0x006a:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x0070:
            goto L_0x00b4
        L_0x0071:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00b4
        L_0x0078:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x008a
        L_0x007f:
            r6.m42215x(r7, r8, r0)
            goto L_0x00ef
        L_0x0084:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x008a:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41569i(r7, r2, r1)
            goto L_0x00ec
        L_0x0092:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            boolean r1 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41570j(r7, r2, r1)
            goto L_0x00ec
        L_0x00a0:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00b4
        L_0x00a7:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x00ae:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x00b4:
            int r1 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41567g(r7, r2, r1)
            goto L_0x00ec
        L_0x00bc:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x00c3:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x00c9:
            long r4 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41568h(r7, r2, r4)
            goto L_0x00ec
        L_0x00d1:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            float r1 = com.google.android.gms.internal.clearcut.C8859b4.m41550K(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41566f(r7, r2, r1)
            goto L_0x00ec
        L_0x00df:
            boolean r1 = r6.m42216y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            double r4 = com.google.android.gms.internal.clearcut.C8859b4.m41551L(r8, r2)
            com.google.android.gms.internal.clearcut.C8859b4.m41565e(r7, r2, r4)
        L_0x00ec:
            r6.m42189I(r7, r0)
        L_0x00ef:
            int r0 = r0 + 4
            goto L_0x0004
        L_0x00f3:
            boolean r0 = r6.f44709i
            if (r0 != 0) goto L_0x0105
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r6.f44716p
            com.google.android.gms.internal.clearcut.C8887e3.m41725i(r0, r7, r8)
            boolean r0 = r6.f44707g
            if (r0 == 0) goto L_0x0105
            com.google.android.gms.internal.clearcut.s0<?> r0 = r6.f44717q
            com.google.android.gms.internal.clearcut.C8887e3.m41723g(r0, r7, r8)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36860b(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: c */
    public final T mo36861c() {
        return this.f44714n.mo37147a(this.f44706f);
    }

    /* renamed from: e */
    public final boolean mo36862e(T t) {
        int i;
        int i2;
        boolean z;
        T t2 = t;
        int[] iArr = this.f44711k;
        if (!(iArr == null || iArr.length == 0)) {
            int i3 = -1;
            int length = iArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5 = i + 1) {
                int i6 = iArr[i5];
                int H = m42188H(i6);
                int F = m42186F(H);
                if (!this.f44709i) {
                    int i7 = this.f44701a[H + 2];
                    int i8 = i7 & 1048575;
                    i2 = 1 << (i7 >>> 20);
                    if (i8 != i3) {
                        i = i5;
                        i4 = f44700s.getInt(t2, (long) i8);
                        i3 = i8;
                    } else {
                        i = i5;
                    }
                } else {
                    i = i5;
                    i2 = 0;
                }
                if (((268435456 & F) != 0) && !m42181A(t2, H, i4, i2)) {
                    return false;
                }
                int i9 = (267386880 & F) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (m42217z(t2, i6, H) && !m42182B(t2, F, m42183C(H))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 == 50 && !this.f44718r.mo36961g(C8859b4.m41552M(t2, (long) (F & 1048575))).isEmpty()) {
                                this.f44718r.mo36959e(m42184D(H));
                                throw null;
                            }
                        }
                    }
                    List list = (List) C8859b4.m41552M(t2, (long) (F & 1048575));
                    if (!list.isEmpty()) {
                        C8870c3 C = m42183C(H);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!C.mo36862e(list.get(i10))) {
                                z = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        return false;
                    }
                } else if (m42181A(t2, H, i4, i2) && !m42182B(t2, F, m42183C(H))) {
                    return false;
                }
            }
            return !this.f44707g || this.f44717q.mo37138b(t2).mo37210d();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m42197Q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m42198R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8910h1.m41837f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8910h1.m41841j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo36863f(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f44701a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m42186F(r1)
            int[] r4 = r8.f44701a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m42199S(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m42197Q(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m42198R(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m42196P(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m42217z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m42195O(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.clearcut.C8910h1.m41837f(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.clearcut.C8859b4.m41550K(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.clearcut.C8859b4.m41551L(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.clearcut.C8910h1.m41841j(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r8.f44716p
            java.lang.Object r0 = r0.mo37181k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f44707g
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.s0<?> r0 = r8.f44717q
            com.google.android.gms.internal.clearcut.w0 r9 = r0.mo37138b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36863f(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.mo37064L(r9, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r8 & 1048575)), m42183C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.mo37072f(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.mo37067O(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.mo37070c(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.mo37091y(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.mo37059G(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.mo37066N(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.mo37060H(r9, (com.google.android.gms.internal.clearcut.C8847a0) com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.mo37062J(r9, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r8 & 1048575)), m42183C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        m42212u(r9, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.mo37055C(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.mo37061I(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.mo37075i(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.mo37057E(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.zza(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.mo37068a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.mo37083q(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.mo37082p(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0842, code lost:
        r15.mo37064L(r10, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r9 & 1048575)), m42183C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085d, code lost:
        r15.mo37072f(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086e, code lost:
        r15.mo37067O(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x087f, code lost:
        r15.mo37070c(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0890, code lost:
        r15.mo37091y(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a1, code lost:
        r15.mo37059G(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b2, code lost:
        r15.mo37066N(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08bd, code lost:
        r15.mo37060H(r10, (com.google.android.gms.internal.clearcut.C8847a0) com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d0, code lost:
        r15.mo37062J(r10, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r9 & 1048575)), m42183C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e5, code lost:
        m42212u(r10, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fc, code lost:
        r15.mo37055C(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090d, code lost:
        r15.mo37061I(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091d, code lost:
        r15.mo37075i(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092d, code lost:
        r15.mo37057E(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093d, code lost:
        r15.zza(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094d, code lost:
        r15.mo37068a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095d, code lost:
        r15.mo37083q(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096d, code lost:
        r15.mo37082p(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0976  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36864g(T r14, com.google.android.gms.internal.clearcut.C8977p4 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo37088v()
            int r1 = com.google.android.gms.internal.clearcut.C8891f1.C8896e.f44530m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04cf
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r13.f44716p
            m42213v(r0, r14, r15)
            boolean r0 = r13.f44707g
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.clearcut.s0<?> r0 = r13.f44717q
            com.google.android.gms.internal.clearcut.w0 r0 = r0.mo37138b(r14)
            boolean r1 = r0.mo37207b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo37206a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f44701a
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04b7
            int r8 = r13.m42186F(r7)
            int[] r9 = r13.f44701a
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.clearcut.s0<?> r10 = r13.f44717q
            int r10 = r10.mo37137a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.clearcut.s0<?> r10 = r13.f44717q
            r10.mo37139c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                case 3: goto L_0x0474;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x0444;
                case 7: goto L_0x0433;
                case 8: goto L_0x0422;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03b6;
                case 15: goto L_0x03a5;
                case 16: goto L_0x0394;
                case 17: goto L_0x037f;
                case 18: goto L_0x036e;
                case 19: goto L_0x035d;
                case 20: goto L_0x034c;
                case 21: goto L_0x033b;
                case 22: goto L_0x032a;
                case 23: goto L_0x0319;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f7;
                case 26: goto L_0x02e6;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02c0;
                case 29: goto L_0x02af;
                case 30: goto L_0x029e;
                case 31: goto L_0x028d;
                case 32: goto L_0x027c;
                case 33: goto L_0x026b;
                case 34: goto L_0x025a;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c1;
                case 44: goto L_0x01b0;
                case 45: goto L_0x019f;
                case 46: goto L_0x018e;
                case 47: goto L_0x017d;
                case 48: goto L_0x016c;
                case 49: goto L_0x0157;
                case 50: goto L_0x014c;
                case 51: goto L_0x013e;
                case 52: goto L_0x0130;
                case 53: goto L_0x0122;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f8;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00c4;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x007e;
                case 67: goto L_0x0070;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04b3
        L_0x0068:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0385
        L_0x0070:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m42198R(r14, r10)
            goto L_0x03a0
        L_0x007e:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x03b1
        L_0x008c:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m42198R(r14, r10)
            goto L_0x03c2
        L_0x009a:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x03d3
        L_0x00a8:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x03e4
        L_0x00b6:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x03f5
        L_0x00c4:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0400
        L_0x00cc:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0413
        L_0x00d4:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0428
        L_0x00dc:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m42199S(r14, r10)
            goto L_0x043f
        L_0x00ea:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x0450
        L_0x00f8:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m42198R(r14, r10)
            goto L_0x0460
        L_0x0106:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m42197Q(r14, r10)
            goto L_0x0470
        L_0x0114:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m42198R(r14, r10)
            goto L_0x0480
        L_0x0122:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m42198R(r14, r10)
            goto L_0x0490
        L_0x0130:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m42196P(r14, r10)
            goto L_0x04a0
        L_0x013e:
            boolean r10 = r13.m42217z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m42195O(r14, r10)
            goto L_0x04b0
        L_0x014c:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            r13.m42214w(r15, r9, r8, r7)
            goto L_0x04b3
        L_0x0157:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.c3 r10 = r13.m42183C(r7)
            com.google.android.gms.internal.clearcut.C8887e3.m41728l(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x016c:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x017d:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x018e:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x019f:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01b0:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01c1:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01d2:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01e3:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01f4:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0205:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0216:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0227:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0238:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0249:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x025a:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x026b:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x027c:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x028d:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x029e:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02af:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02c0:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41727k(r9, r8, r15)
            goto L_0x04b3
        L_0x02d1:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.c3 r10 = r13.m42183C(r7)
            com.google.android.gms.internal.clearcut.C8887e3.m41720e(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x02e6:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41718d(r9, r8, r15)
            goto L_0x04b3
        L_0x02f7:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0308:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0319:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x032a:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x033b:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x034c:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x035d:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x036e:
            int[] r9 = r13.f44701a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x037f:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0385:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            com.google.android.gms.internal.clearcut.c3 r10 = r13.m42183C(r7)
            r15.mo37064L(r9, r8, r10)
            goto L_0x04b3
        L_0x0394:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r10)
        L_0x03a0:
            r15.mo37072f(r9, r10)
            goto L_0x04b3
        L_0x03a5:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x03b1:
            r15.mo37067O(r9, r8)
            goto L_0x04b3
        L_0x03b6:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r10)
        L_0x03c2:
            r15.mo37070c(r9, r10)
            goto L_0x04b3
        L_0x03c7:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x03d3:
            r15.mo37091y(r9, r8)
            goto L_0x04b3
        L_0x03d8:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x03e4:
            r15.mo37059G(r9, r8)
            goto L_0x04b3
        L_0x03e9:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x03f5:
            r15.mo37066N(r9, r8)
            goto L_0x04b3
        L_0x03fa:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0400:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            com.google.android.gms.internal.clearcut.a0 r8 = (com.google.android.gms.internal.clearcut.C8847a0) r8
            r15.mo37060H(r9, r8)
            goto L_0x04b3
        L_0x040d:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0413:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            com.google.android.gms.internal.clearcut.c3 r10 = r13.m42183C(r7)
            r15.mo37062J(r9, r8, r10)
            goto L_0x04b3
        L_0x0422:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0428:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r10)
            m42212u(r9, r8, r15)
            goto L_0x04b3
        L_0x0433:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r14, r10)
        L_0x043f:
            r15.mo37055C(r9, r8)
            goto L_0x04b3
        L_0x0444:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x0450:
            r15.mo37061I(r9, r8)
            goto L_0x04b3
        L_0x0454:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r10)
        L_0x0460:
            r15.mo37075i(r9, r10)
            goto L_0x04b3
        L_0x0464:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r10)
        L_0x0470:
            r15.mo37057E(r9, r8)
            goto L_0x04b3
        L_0x0474:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r10)
        L_0x0480:
            r15.zza(r9, r10)
            goto L_0x04b3
        L_0x0484:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r10)
        L_0x0490:
            r15.mo37068a(r9, r10)
            goto L_0x04b3
        L_0x0494:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.clearcut.C8859b4.m41550K(r14, r10)
        L_0x04a0:
            r15.mo37083q(r9, r8)
            goto L_0x04b3
        L_0x04a4:
            boolean r10 = r13.m42216y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.clearcut.C8859b4.m41551L(r14, r10)
        L_0x04b0:
            r15.mo37082p(r9, r10)
        L_0x04b3:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04b7:
            if (r1 == 0) goto L_0x04ce
            com.google.android.gms.internal.clearcut.s0<?> r14 = r13.f44717q
            r14.mo37139c(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04cc
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04b7
        L_0x04cc:
            r1 = r3
            goto L_0x04b7
        L_0x04ce:
            return
        L_0x04cf:
            boolean r0 = r13.f44709i
            if (r0 == 0) goto L_0x0990
            boolean r0 = r13.f44707g
            if (r0 == 0) goto L_0x04ee
            com.google.android.gms.internal.clearcut.s0<?> r0 = r13.f44717q
            com.google.android.gms.internal.clearcut.w0 r0 = r0.mo37138b(r14)
            boolean r1 = r0.mo37207b()
            if (r1 != 0) goto L_0x04ee
            java.util.Iterator r0 = r0.mo37211e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f0
        L_0x04ee:
            r0 = r3
            r1 = r0
        L_0x04f0:
            int[] r7 = r13.f44701a
            int r7 = r7.length
            r8 = 0
        L_0x04f4:
            if (r8 >= r7) goto L_0x0974
            int r9 = r13.m42186F(r8)
            int[] r10 = r13.f44701a
            r10 = r10[r8]
        L_0x04fe:
            if (r1 == 0) goto L_0x051c
            com.google.android.gms.internal.clearcut.s0<?> r11 = r13.f44717q
            int r11 = r11.mo37137a(r1)
            if (r11 > r10) goto L_0x051c
            com.google.android.gms.internal.clearcut.s0<?> r11 = r13.f44717q
            r11.mo37139c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x051a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04fe
        L_0x051a:
            r1 = r3
            goto L_0x04fe
        L_0x051c:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0961;
                case 1: goto L_0x0951;
                case 2: goto L_0x0941;
                case 3: goto L_0x0931;
                case 4: goto L_0x0921;
                case 5: goto L_0x0911;
                case 6: goto L_0x0901;
                case 7: goto L_0x08f0;
                case 8: goto L_0x08df;
                case 9: goto L_0x08ca;
                case 10: goto L_0x08b7;
                case 11: goto L_0x08a6;
                case 12: goto L_0x0895;
                case 13: goto L_0x0884;
                case 14: goto L_0x0873;
                case 15: goto L_0x0862;
                case 16: goto L_0x0851;
                case 17: goto L_0x083c;
                case 18: goto L_0x082b;
                case 19: goto L_0x081a;
                case 20: goto L_0x0809;
                case 21: goto L_0x07f8;
                case 22: goto L_0x07e7;
                case 23: goto L_0x07d6;
                case 24: goto L_0x07c5;
                case 25: goto L_0x07b4;
                case 26: goto L_0x07a3;
                case 27: goto L_0x078e;
                case 28: goto L_0x077d;
                case 29: goto L_0x076c;
                case 30: goto L_0x075b;
                case 31: goto L_0x074a;
                case 32: goto L_0x0739;
                case 33: goto L_0x0728;
                case 34: goto L_0x0717;
                case 35: goto L_0x0706;
                case 36: goto L_0x06f5;
                case 37: goto L_0x06e4;
                case 38: goto L_0x06d3;
                case 39: goto L_0x06c2;
                case 40: goto L_0x06b1;
                case 41: goto L_0x06a0;
                case 42: goto L_0x068f;
                case 43: goto L_0x067e;
                case 44: goto L_0x066d;
                case 45: goto L_0x065c;
                case 46: goto L_0x064b;
                case 47: goto L_0x063a;
                case 48: goto L_0x0629;
                case 49: goto L_0x0614;
                case 50: goto L_0x0609;
                case 51: goto L_0x05fb;
                case 52: goto L_0x05ed;
                case 53: goto L_0x05df;
                case 54: goto L_0x05d1;
                case 55: goto L_0x05c3;
                case 56: goto L_0x05b5;
                case 57: goto L_0x05a7;
                case 58: goto L_0x0599;
                case 59: goto L_0x0591;
                case 60: goto L_0x0589;
                case 61: goto L_0x0581;
                case 62: goto L_0x0573;
                case 63: goto L_0x0565;
                case 64: goto L_0x0557;
                case 65: goto L_0x0549;
                case 66: goto L_0x053b;
                case 67: goto L_0x052d;
                case 68: goto L_0x0525;
                default: goto L_0x0523;
            }
        L_0x0523:
            goto L_0x0970
        L_0x0525:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x0842
        L_0x052d:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m42198R(r14, r11)
            goto L_0x085d
        L_0x053b:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x086e
        L_0x0549:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m42198R(r14, r11)
            goto L_0x087f
        L_0x0557:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x0890
        L_0x0565:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x08a1
        L_0x0573:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x08b2
        L_0x0581:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08bd
        L_0x0589:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08d0
        L_0x0591:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08e5
        L_0x0599:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m42199S(r14, r11)
            goto L_0x08fc
        L_0x05a7:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x090d
        L_0x05b5:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m42198R(r14, r11)
            goto L_0x091d
        L_0x05c3:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m42197Q(r14, r11)
            goto L_0x092d
        L_0x05d1:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m42198R(r14, r11)
            goto L_0x093d
        L_0x05df:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m42198R(r14, r11)
            goto L_0x094d
        L_0x05ed:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m42196P(r14, r11)
            goto L_0x095d
        L_0x05fb:
            boolean r11 = r13.m42217z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m42195O(r14, r11)
            goto L_0x096d
        L_0x0609:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            r13.m42214w(r15, r10, r9, r8)
            goto L_0x0970
        L_0x0614:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.c3 r11 = r13.m42183C(r8)
            com.google.android.gms.internal.clearcut.C8887e3.m41728l(r10, r9, r15, r11)
            goto L_0x0970
        L_0x0629:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r10, r9, r15, r4)
            goto L_0x0970
        L_0x063a:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r10, r9, r15, r4)
            goto L_0x0970
        L_0x064b:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r10, r9, r15, r4)
            goto L_0x0970
        L_0x065c:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r10, r9, r15, r4)
            goto L_0x0970
        L_0x066d:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r10, r9, r15, r4)
            goto L_0x0970
        L_0x067e:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r10, r9, r15, r4)
            goto L_0x0970
        L_0x068f:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06a0:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06b1:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06c2:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06d3:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06e4:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06f5:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r10, r9, r15, r4)
            goto L_0x0970
        L_0x0706:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r10, r9, r15, r4)
            goto L_0x0970
        L_0x0717:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41691F(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0728:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41702Q(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0739:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41696K(r10, r9, r15, r5)
            goto L_0x0970
        L_0x074a:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41704S(r10, r9, r15, r5)
            goto L_0x0970
        L_0x075b:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41705T(r10, r9, r15, r5)
            goto L_0x0970
        L_0x076c:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41700O(r10, r9, r15, r5)
            goto L_0x0970
        L_0x077d:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41727k(r10, r9, r15)
            goto L_0x0970
        L_0x078e:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.c3 r11 = r13.m42183C(r8)
            com.google.android.gms.internal.clearcut.C8887e3.m41720e(r10, r9, r15, r11)
            goto L_0x0970
        L_0x07a3:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41718d(r10, r9, r15)
            goto L_0x0970
        L_0x07b4:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41706U(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07c5:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41703R(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07d6:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41693H(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07e7:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41698M(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07f8:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41740x(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0809:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41734r(r10, r9, r15, r5)
            goto L_0x0970
        L_0x081a:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41729m(r10, r9, r15, r5)
            goto L_0x0970
        L_0x082b:
            int[] r10 = r13.f44701a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C8887e3.m41722f(r10, r9, r15, r5)
            goto L_0x0970
        L_0x083c:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x0842:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            com.google.android.gms.internal.clearcut.c3 r11 = r13.m42183C(r8)
            r15.mo37064L(r10, r9, r11)
            goto L_0x0970
        L_0x0851:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r11)
        L_0x085d:
            r15.mo37072f(r10, r11)
            goto L_0x0970
        L_0x0862:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x086e:
            r15.mo37067O(r10, r9)
            goto L_0x0970
        L_0x0873:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r11)
        L_0x087f:
            r15.mo37070c(r10, r11)
            goto L_0x0970
        L_0x0884:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x0890:
            r15.mo37091y(r10, r9)
            goto L_0x0970
        L_0x0895:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x08a1:
            r15.mo37059G(r10, r9)
            goto L_0x0970
        L_0x08a6:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x08b2:
            r15.mo37066N(r10, r9)
            goto L_0x0970
        L_0x08b7:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            com.google.android.gms.internal.clearcut.a0 r9 = (com.google.android.gms.internal.clearcut.C8847a0) r9
            r15.mo37060H(r10, r9)
            goto L_0x0970
        L_0x08ca:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08d0:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            com.google.android.gms.internal.clearcut.c3 r11 = r13.m42183C(r8)
            r15.mo37062J(r10, r9, r11)
            goto L_0x0970
        L_0x08df:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08e5:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r14, r11)
            m42212u(r10, r9, r15)
            goto L_0x0970
        L_0x08f0:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.clearcut.C8859b4.m41549J(r14, r11)
        L_0x08fc:
            r15.mo37055C(r10, r9)
            goto L_0x0970
        L_0x0901:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x090d:
            r15.mo37061I(r10, r9)
            goto L_0x0970
        L_0x0911:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r11)
        L_0x091d:
            r15.mo37075i(r10, r11)
            goto L_0x0970
        L_0x0921:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r14, r11)
        L_0x092d:
            r15.mo37057E(r10, r9)
            goto L_0x0970
        L_0x0931:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r11)
        L_0x093d:
            r15.zza(r10, r11)
            goto L_0x0970
        L_0x0941:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r14, r11)
        L_0x094d:
            r15.mo37068a(r10, r11)
            goto L_0x0970
        L_0x0951:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.clearcut.C8859b4.m41550K(r14, r11)
        L_0x095d:
            r15.mo37083q(r10, r9)
            goto L_0x0970
        L_0x0961:
            boolean r11 = r13.m42216y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.clearcut.C8859b4.m41551L(r14, r11)
        L_0x096d:
            r15.mo37082p(r10, r11)
        L_0x0970:
            int r8 = r8 + 4
            goto L_0x04f4
        L_0x0974:
            if (r1 == 0) goto L_0x098a
            com.google.android.gms.internal.clearcut.s0<?> r2 = r13.f44717q
            r2.mo37139c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0988
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0974
        L_0x0988:
            r1 = r3
            goto L_0x0974
        L_0x098a:
            com.google.android.gms.internal.clearcut.u3<?, ?> r0 = r13.f44716p
            m42213v(r0, r14, r15)
            return
        L_0x0990:
            r13.m42191K(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36864g(java.lang.Object, com.google.android.gms.internal.clearcut.p4):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.C8947m0.m41928B0(r3) + com.google.android.gms.internal.clearcut.C8947m0.m41932D0(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41943P(r3, (com.google.android.gms.internal.clearcut.C8942l2) com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5), m42183C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41957g0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41966r0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41963o0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41971v0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41973w0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41962n0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41941N(r3, (com.google.android.gms.internal.clearcut.C8847a0) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8887e3.m41730n(r3, com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5), m42183C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.C8847a0) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41929C(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41944Q(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41968t0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41960k0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41959j0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41953d0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41947W(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41976z(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.clearcut.C8947m0.m41975y(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0414, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043c, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x045c, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0464, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0474, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C8847a0) != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x047c, code lost:
        if (m42217z(r1, r15, r5) != false) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0514, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0526, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0538, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x054a, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055c, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x056e, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0580, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0592, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a3, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b4, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c5, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d6, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e7, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05f8, code lost:
        if (r0.f44710j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fa, code lost:
        r2.putInt(r1, (long) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fe, code lost:
        r9 = (com.google.android.gms.internal.clearcut.C8947m0.m41928B0(r15) + com.google.android.gms.internal.clearcut.C8947m0.m41932D0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06a9, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06ab, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06b4, code lost:
        if ((r12 & r18) != 0) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b6, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41943P(r15, (com.google.android.gms.internal.clearcut.C8942l2) r2.getObject(r1, r10), m42183C(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06cd, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41957g0(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06da, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41966r0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06e1, code lost:
        if ((r12 & r18) != 0) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e3, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41963o0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06ec, code lost:
        if ((r12 & r18) != 0) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ee, code lost:
        r9 = com.google.android.gms.internal.clearcut.C8947m0.m41971v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f3, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06fd, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41973w0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x070a, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41962n0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0711, code lost:
        if ((r12 & r18) != 0) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0713, code lost:
        r4 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0717, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41941N(r15, (com.google.android.gms.internal.clearcut.C8847a0) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0720, code lost:
        if ((r12 & r18) != 0) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0722, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8887e3.m41730n(r15, r2.getObject(r1, r10), m42183C(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x073a, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C8847a0) != false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.C8847a0) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073d, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41929C(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0747, code lost:
        if ((r12 & r18) != 0) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0749, code lost:
        r4 = com.google.android.gms.internal.clearcut.C8947m0.m41944Q(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0796, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07b8, code lost:
        r5 = r5 + 4;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f44710j != false) goto L_0x020d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo36865h(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f44709i
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f44700s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f44701a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.m42186F(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f44701a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.clearcut.a1 r14 = com.google.android.gms.internal.clearcut.C8848a1.DOUBLE_LIST_PACKED
            int r14 = r14.mo36812d()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.a1 r14 = com.google.android.gms.internal.clearcut.C8848a1.SINT64_LIST_PACKED
            int r14 = r14.mo36812d()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f44701a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m42198R(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m42197Q(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m42197Q(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m42197Q(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.C8847a0
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m42197Q(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m42198R(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.m42217z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m42198R(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.m42217z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            com.google.android.gms.internal.clearcut.g2 r14 = r0.f44718r
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
            java.lang.Object r6 = r0.m42184D(r12)
            int r3 = r14.mo36958d(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m42194N(r1, r5)
            com.google.android.gms.internal.clearcut.c3 r6 = r0.m42183C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41737u(r3, r5, r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41733q(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41695J(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41738v(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41692G(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41701P(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41690E(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41726j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41712a(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f44710j
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41928B0(r3)
            int r6 = com.google.android.gms.internal.clearcut.C8947m0.m41932D0(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41709X(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41715b0(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41710Y(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41713a0(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41736t(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m42194N(r1, r5)
            com.google.android.gms.internal.clearcut.c3 r6 = r0.m42183C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41732p(r3, r5, r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41731o(r3, r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41721e0(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41711Z(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41708W(r3, r5, r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41707V(r3, r5, r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41717c0(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m42194N(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41719d0(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
            com.google.android.gms.internal.clearcut.l2 r5 = (com.google.android.gms.internal.clearcut.C8942l2) r5
            com.google.android.gms.internal.clearcut.c3 r6 = r0.m42183C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41943P(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41957g0(r3, r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r1, r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41966r0(r3, r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41963o0(r3, r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41971v0(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r1, r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41973w0(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41962n0(r3, r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.clearcut.a0 r5 = (com.google.android.gms.internal.clearcut.C8847a0) r5
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41941N(r3, r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
            com.google.android.gms.internal.clearcut.c3 r6 = r0.m42183C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C8887e3.m41730n(r3, r5, r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C8859b4.m41552M(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.C8847a0
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41929C(r3, r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41944Q(r3, r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41968t0(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41960k0(r3, r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C8859b4.m41547H(r1, r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41959j0(r3, r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41953d0(r3, r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.m42216y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C8859b4.m41548I(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41947W(r3, r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41976z(r3, r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.m42216y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.clearcut.C8947m0.m41975y(r3, r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            com.google.android.gms.internal.clearcut.u3<?, ?> r2 = r0.f44716p
            int r1 = m42205n(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f44700s
            r3 = -1
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x03be:
            int[] r13 = r0.f44701a
            int r13 = r13.length
            if (r5 >= r13) goto L_0x07bf
            int r13 = r0.m42186F(r5)
            int[] r14 = r0.f44701a
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03e9
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x03e7
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x03e7:
            r9 = r11
            goto L_0x0408
        L_0x03e9:
            boolean r9 = r0.f44710j
            if (r9 == 0) goto L_0x0405
            com.google.android.gms.internal.clearcut.a1 r9 = com.google.android.gms.internal.clearcut.C8848a1.DOUBLE_LIST_PACKED
            int r9 = r9.mo36812d()
            if (r4 < r9) goto L_0x0405
            com.google.android.gms.internal.clearcut.a1 r9 = com.google.android.gms.internal.clearcut.C8848a1.SINT64_LIST_PACKED
            int r9 = r9.mo36812d()
            if (r4 > r9) goto L_0x0405
            int[] r9 = r0.f44701a
            int r10 = r5 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0406
        L_0x0405:
            r9 = 0
        L_0x0406:
            r18 = 0
        L_0x0408:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x07a9;
                case 1: goto L_0x0799;
                case 2: goto L_0x0787;
                case 3: goto L_0x0777;
                case 4: goto L_0x0767;
                case 5: goto L_0x075b;
                case 6: goto L_0x074f;
                case 7: goto L_0x0745;
                case 8: goto L_0x0730;
                case 9: goto L_0x071e;
                case 10: goto L_0x070f;
                case 11: goto L_0x0702;
                case 12: goto L_0x06f5;
                case 13: goto L_0x06ea;
                case 14: goto L_0x06df;
                case 15: goto L_0x06d2;
                case 16: goto L_0x06c5;
                case 17: goto L_0x06b2;
                case 18: goto L_0x069e;
                case 19: goto L_0x0692;
                case 20: goto L_0x0686;
                case 21: goto L_0x067a;
                case 22: goto L_0x066e;
                case 23: goto L_0x069e;
                case 24: goto L_0x0692;
                case 25: goto L_0x0662;
                case 26: goto L_0x0657;
                case 27: goto L_0x0648;
                case 28: goto L_0x063d;
                case 29: goto L_0x0631;
                case 30: goto L_0x0624;
                case 31: goto L_0x0692;
                case 32: goto L_0x069e;
                case 33: goto L_0x0617;
                case 34: goto L_0x060a;
                case 35: goto L_0x05ea;
                case 36: goto L_0x05d9;
                case 37: goto L_0x05c8;
                case 38: goto L_0x05b7;
                case 39: goto L_0x05a6;
                case 40: goto L_0x0595;
                case 41: goto L_0x0584;
                case 42: goto L_0x0572;
                case 43: goto L_0x0560;
                case 44: goto L_0x054e;
                case 45: goto L_0x053c;
                case 46: goto L_0x052a;
                case 47: goto L_0x0518;
                case 48: goto L_0x0506;
                case 49: goto L_0x04f6;
                case 50: goto L_0x04e6;
                case 51: goto L_0x04d8;
                case 52: goto L_0x04cb;
                case 53: goto L_0x04bb;
                case 54: goto L_0x04ab;
                case 55: goto L_0x049b;
                case 56: goto L_0x048d;
                case 57: goto L_0x0480;
                case 58: goto L_0x0478;
                case 59: goto L_0x0468;
                case 60: goto L_0x0460;
                case 61: goto L_0x0458;
                case 62: goto L_0x044c;
                case 63: goto L_0x0440;
                case 64: goto L_0x0438;
                case 65: goto L_0x0430;
                case 66: goto L_0x0424;
                case 67: goto L_0x0418;
                case 68: goto L_0x0410;
                default: goto L_0x040e;
            }
        L_0x040e:
            goto L_0x06aa
        L_0x0410:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x06b6
        L_0x0418:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            long r9 = m42198R(r1, r10)
            goto L_0x06cd
        L_0x0424:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            int r4 = m42197Q(r1, r10)
            goto L_0x06da
        L_0x0430:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x06e3
        L_0x0438:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x06ee
        L_0x0440:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            int r4 = m42197Q(r1, r10)
            goto L_0x06fd
        L_0x044c:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            int r4 = m42197Q(r1, r10)
            goto L_0x070a
        L_0x0458:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x0713
        L_0x0460:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x0722
        L_0x0468:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.C8847a0
            if (r9 == 0) goto L_0x073d
            goto L_0x073c
        L_0x0478:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            goto L_0x0749
        L_0x0480:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41968t0(r15, r4)
            goto L_0x06f3
        L_0x048d:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41960k0(r15, r9)
            goto L_0x06a9
        L_0x049b:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            int r4 = m42197Q(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41959j0(r15, r4)
            goto L_0x06a9
        L_0x04ab:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            long r9 = m42198R(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41953d0(r15, r9)
            goto L_0x06a9
        L_0x04bb:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            long r9 = m42198R(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41947W(r15, r9)
            goto L_0x06a9
        L_0x04cb:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41976z(r15, r4)
            goto L_0x06f3
        L_0x04d8:
            boolean r4 = r0.m42217z(r1, r15, r5)
            if (r4 == 0) goto L_0x06aa
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41975y(r15, r9)
            goto L_0x06a9
        L_0x04e6:
            com.google.android.gms.internal.clearcut.g2 r4 = r0.f44718r
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.m42184D(r5)
            int r4 = r4.mo36958d(r15, r9, r10)
            goto L_0x06a9
        L_0x04f6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r5)
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41737u(r15, r4, r9)
            goto L_0x06a9
        L_0x0506:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41733q(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0518:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41695J(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x052a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x053c:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x054e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41738v(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0560:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41692G(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0572:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41701P(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0584:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0595:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05a6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41690E(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05b7:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41726j(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05c8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41712a(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05d9:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41697L(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05ea:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41699N(r4)
            if (r4 <= 0) goto L_0x06aa
            boolean r10 = r0.f44710j
            if (r10 == 0) goto L_0x05fe
        L_0x05fa:
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x05fe:
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41928B0(r15)
            int r10 = com.google.android.gms.internal.clearcut.C8947m0.m41932D0(r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x06f3
        L_0x060a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41709X(r15, r4, r9)
            goto L_0x06a9
        L_0x0617:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41715b0(r15, r4, r9)
            goto L_0x06a9
        L_0x0624:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41710Y(r15, r4, r9)
            goto L_0x06a9
        L_0x0631:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41713a0(r15, r4, r9)
            goto L_0x06a9
        L_0x063d:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41736t(r15, r4)
            goto L_0x06a9
        L_0x0648:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r5)
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41732p(r15, r4, r9)
            goto L_0x06a9
        L_0x0657:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41731o(r15, r4)
            goto L_0x06a9
        L_0x0662:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41721e0(r15, r4, r9)
            goto L_0x06a9
        L_0x066e:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41711Z(r15, r4, r9)
            goto L_0x06a9
        L_0x067a:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41708W(r15, r4, r9)
            goto L_0x06a9
        L_0x0686:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41707V(r15, r4, r9)
            goto L_0x06a9
        L_0x0692:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41717c0(r15, r4, r9)
            goto L_0x06a9
        L_0x069e:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41719d0(r15, r4, r9)
        L_0x06a9:
            int r6 = r6 + r4
        L_0x06aa:
            r4 = 0
        L_0x06ab:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07b8
        L_0x06b2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x06b6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.l2 r4 = (com.google.android.gms.internal.clearcut.C8942l2) r4
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r5)
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41943P(r15, r4, r9)
            goto L_0x06a9
        L_0x06c5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            long r9 = r2.getLong(r1, r10)
        L_0x06cd:
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41957g0(r15, r9)
            goto L_0x06a9
        L_0x06d2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            int r4 = r2.getInt(r1, r10)
        L_0x06da:
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41966r0(r15, r4)
            goto L_0x06a9
        L_0x06df:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x06e3:
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41963o0(r15, r9)
            goto L_0x06a9
        L_0x06ea:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x06ee:
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41971v0(r15, r4)
        L_0x06f3:
            int r6 = r6 + r9
            goto L_0x06aa
        L_0x06f5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            int r4 = r2.getInt(r1, r10)
        L_0x06fd:
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41973w0(r15, r4)
            goto L_0x06a9
        L_0x0702:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            int r4 = r2.getInt(r1, r10)
        L_0x070a:
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41962n0(r15, r4)
            goto L_0x06a9
        L_0x070f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x0713:
            java.lang.Object r4 = r2.getObject(r1, r10)
        L_0x0717:
            com.google.android.gms.internal.clearcut.a0 r4 = (com.google.android.gms.internal.clearcut.C8847a0) r4
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41941N(r15, r4)
            goto L_0x06a9
        L_0x071e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x0722:
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.c3 r9 = r0.m42183C(r5)
            int r4 = com.google.android.gms.internal.clearcut.C8887e3.m41730n(r15, r4, r9)
            goto L_0x06a9
        L_0x0730:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.C8847a0
            if (r9 == 0) goto L_0x073d
        L_0x073c:
            goto L_0x0717
        L_0x073d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41929C(r15, r4)
            goto L_0x06a9
        L_0x0745:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
        L_0x0749:
            int r4 = com.google.android.gms.internal.clearcut.C8947m0.m41944Q(r15, r7)
            goto L_0x06a9
        L_0x074f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06aa
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41968t0(r15, r4)
            int r6 = r6 + r9
            goto L_0x06ab
        L_0x075b:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0797
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41960k0(r15, r13)
            goto L_0x0796
        L_0x0767:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0797
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41959j0(r15, r9)
            goto L_0x0796
        L_0x0777:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0797
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41953d0(r15, r9)
            goto L_0x0796
        L_0x0787:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0797
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.C8947m0.m41947W(r15, r9)
        L_0x0796:
            int r6 = r6 + r9
        L_0x0797:
            r9 = 0
            goto L_0x07a6
        L_0x0799:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0797
            r9 = 0
            int r10 = com.google.android.gms.internal.clearcut.C8947m0.m41976z(r15, r9)
            int r6 = r6 + r10
        L_0x07a6:
            r10 = 0
            goto L_0x07b8
        L_0x07a9:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x07a6
            r10 = 0
            int r15 = com.google.android.gms.internal.clearcut.C8947m0.m41975y(r15, r10)
            int r6 = r6 + r15
        L_0x07b8:
            int r5 = r5 + 4
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x03be
        L_0x07bf:
            com.google.android.gms.internal.clearcut.u3<?, ?> r2 = r0.f44716p
            int r2 = m42205n(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f44707g
            if (r2 == 0) goto L_0x07d5
            com.google.android.gms.internal.clearcut.s0<?> r2 = r0.f44717q
            com.google.android.gms.internal.clearcut.w0 r1 = r2.mo37138b(r1)
            int r1 = r1.mo37215l()
            int r6 = r6 + r1
        L_0x07d5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36865h(java.lang.Object):int");
    }

    /* renamed from: i */
    public final void mo36866i(T t) {
        int[] iArr = this.f44712l;
        if (iArr != null) {
            for (int F : iArr) {
                long F2 = (long) (m42186F(F) & 1048575);
                Object M = C8859b4.m41552M(t, F2);
                if (M != null) {
                    C8859b4.m41569i(t, F2, this.f44718r.mo36956b(M));
                }
            }
        }
        int[] iArr2 = this.f44713m;
        if (iArr2 != null) {
            for (int i : iArr2) {
                this.f44715o.mo37190a(t, (long) i);
            }
        }
        this.f44716p.mo37174d(t);
        if (this.f44707g) {
            this.f44717q.mo37142f(t);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.f44770c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r10, r11);
        r1 = r11.f44768a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36867j(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.C9021w r27) throws java.io.IOException {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f44709i
            if (r0 == 0) goto L_0x01ce
            sun.misc.Unsafe r9 = f44700s
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c5
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42396d(r0, r12, r1, r11)
            int r1 = r11.f44768a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.m42188H(r6)
            if (r8 < 0) goto L_0x01a5
            int[] r0 = r15.f44701a
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a5
        L_0x004d:
            if (r7 != 0) goto L_0x01a5
            int r6 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r10, r11)
            long r0 = r11.f44769b
            long r4 = com.google.android.gms.internal.clearcut.C8926j0.m41881a(r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r10, r11)
            int r1 = r11.f44768a
            int r1 = com.google.android.gms.internal.clearcut.C8926j0.m41883e(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a5
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a5
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42405m(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.f44770c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a5
            com.google.android.gms.internal.clearcut.c3 r0 = r15.m42183C(r8)
            int r0 = m42204m(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.f44770c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C8910h1.m41835d(r1, r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42401i(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42402j(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r10, r11)
            long r4 = r11.f44769b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            com.google.android.gms.internal.clearcut.C8859b4.m41570j(r14, r2, r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42400h(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a5
            long r4 = com.google.android.gms.internal.clearcut.C9014v.m42403k(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a5
        L_0x00d0:
            int r0 = com.google.android.gms.internal.clearcut.C9014v.m42397e(r12, r10, r11)
            int r1 = r11.f44768a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a5
            int r6 = com.google.android.gms.internal.clearcut.C9014v.m42399g(r12, r10, r11)
            long r4 = r11.f44769b
        L_0x00e3:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a5
            float r0 = com.google.android.gms.internal.clearcut.C9014v.m42406n(r12, r10)
            com.google.android.gms.internal.clearcut.C8859b4.m41566f(r14, r2, r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a5
            double r0 = com.google.android.gms.internal.clearcut.C9014v.m42404l(r12, r10)
            com.google.android.gms.internal.clearcut.C8859b4.m41565e(r14, r2, r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a5
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.k1 r0 = (com.google.android.gms.internal.clearcut.C8934k1) r0
            boolean r1 = r0.mo36983n()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            com.google.android.gms.internal.clearcut.k1 r0 = r0.mo36878o(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            com.google.android.gms.internal.clearcut.c3 r0 = r15.m42183C(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = m42202k(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0167
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.m42207p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x0167:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018b
            if (r7 != r1) goto L_0x01a8
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            int r0 = r0.m42208q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x018b:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.m42206o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01b7
        L_0x01a3:
            r2 = r0
            goto L_0x01a9
        L_0x01a5:
            r21 = r9
            r15 = r10
        L_0x01a8:
            r2 = r15
        L_0x01a9:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = m42201d(r0, r1, r2, r3, r4, r5)
        L_0x01b7:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c5:
            r4 = r13
            if (r0 != r4) goto L_0x01c9
            return
        L_0x01c9:
            com.google.android.gms.internal.clearcut.l1 r0 = com.google.android.gms.internal.clearcut.C8941l1.m41912d()
            throw r0
        L_0x01ce:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.m42209r(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8975p2.mo36867j(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.w):void");
    }
}
