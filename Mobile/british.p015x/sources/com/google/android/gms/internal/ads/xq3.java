package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xq3<T> implements or3<T> {

    /* renamed from: q */
    private static final int[] f41263q = new int[0];

    /* renamed from: r */
    private static final Unsafe f41264r = qs3.m36725q();

    /* renamed from: a */
    private final int[] f41265a;

    /* renamed from: b */
    private final Object[] f41266b;

    /* renamed from: c */
    private final int f41267c;

    /* renamed from: d */
    private final int f41268d;

    /* renamed from: e */
    private final uq3 f41269e;

    /* renamed from: f */
    private final boolean f41270f;

    /* renamed from: g */
    private final boolean f41271g;

    /* renamed from: h */
    private final boolean f41272h;

    /* renamed from: i */
    private final int[] f41273i;

    /* renamed from: j */
    private final int f41274j;

    /* renamed from: k */
    private final int f41275k;

    /* renamed from: l */
    private final iq3 f41276l;

    /* renamed from: m */
    private final gs3<?, ?> f41277m;

    /* renamed from: n */
    private final xo3<?> f41278n;

    /* renamed from: o */
    private final ar3 f41279o;

    /* renamed from: p */
    private final pq3 f41280p;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.ads.uq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.ads.ar3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.ads.pq3} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.xo3<?>, com.google.android.gms.internal.ads.xo3] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.ads.iq3] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.ads.gs3<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private xq3(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.ads.uq3 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.ads.ar3 r17, com.google.android.gms.internal.ads.iq3 r18, com.google.android.gms.internal.ads.gs3<?, ?> r19, com.google.android.gms.internal.ads.xo3<?> r20, com.google.android.gms.internal.ads.pq3 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f41265a = r3
            r3 = r7
            r0.f41266b = r3
            r3 = r8
            r0.f41267c = r3
            r3 = r9
            r0.f41268d = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.kp3
            r0.f41271g = r3
            r3 = r11
            r0.f41272h = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.mo35782h(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.f41270f = r3
            r3 = r13
            r0.f41273i = r3
            r3 = r14
            r0.f41274j = r3
            r3 = r15
            r0.f41275k = r3
            r3 = r16
            r0.f41279o = r3
            r3 = r17
            r0.f41276l = r3
            r3 = r18
            r0.f41277m = r3
            r0.f41278n = r2
            r0.f41269e = r1
            r1 = r20
            r0.f41280p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.ads.uq3, boolean, boolean, int[], int, int, com.google.android.gms.internal.ads.ar3, com.google.android.gms.internal.ads.iq3, com.google.android.gms.internal.ads.gs3, com.google.android.gms.internal.ads.xo3, com.google.android.gms.internal.ads.pq3, byte[]):void");
    }

    /* renamed from: A */
    private final boolean m39535A(T t, int i, int i2) {
        return qs3.m36720l(t, (long) (m39554U(i2) & 1048575)) == i;
    }

    /* renamed from: B */
    private static <T> boolean m39536B(T t, long j) {
        return ((Boolean) qs3.m36724p(t, j)).booleanValue();
    }

    /* renamed from: C */
    private final void m39537C(T t, so3 so3) throws IOException {
        int i;
        T t2 = t;
        so3 so32 = so3;
        if (!this.f41270f) {
            int length = this.f41265a.length;
            Unsafe unsafe = f41264r;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int j = m39557j(i3);
                int i6 = this.f41265a[i3];
                int i7 = m39556i(j);
                if (i7 <= 17) {
                    int i8 = this.f41265a[i3 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i5) {
                        i4 = unsafe.getInt(t2, (long) i9);
                        i5 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j2 = (long) (j & i2);
                switch (i7) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            so32.mo34759q(i6, qs3.m36718j(t2, j2));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            so32.mo34768z(i6, qs3.m36719k(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            so32.mo34737E(i6, unsafe.getLong(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            so32.mo34753j(i6, unsafe.getLong(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            so32.mo34735C(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            so32.mo34766x(i6, unsafe.getLong(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            so32.mo34764v(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            so32.mo34755m(i6, qs3.m36708H(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m39539E(i6, unsafe.getObject(t2, j2), so32);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            so32.mo34739G(i6, unsafe.getObject(t2, j2), m39560m(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            so32.mo34757o(i6, (eo3) unsafe.getObject(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            so32.mo34751h(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            so32.mo34762t(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            so32.mo34740H(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            so32.mo34742J(i6, unsafe.getLong(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            so32.mo34744a(i6, unsafe.getInt(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            so32.mo34746c(i6, unsafe.getLong(t2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            so32.mo34734B(i6, unsafe.getObject(t2, j2), m39560m(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        qr3.m36653l(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 19:
                        qr3.m36657p(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 20:
                        qr3.m36660s(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 21:
                        qr3.m36615B(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 22:
                        qr3.m36659r(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 23:
                        qr3.m36656o(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 24:
                        qr3.m36655n(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 25:
                        qr3.m36651j(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        continue;
                    case 26:
                        qr3.m36666y(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32);
                        break;
                    case 27:
                        qr3.m36661t(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, m39560m(i3));
                        break;
                    case 28:
                        qr3.m36652k(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32);
                        break;
                    case 29:
                        qr3.m36667z(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 30:
                        qr3.m36654m(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 31:
                        qr3.m36662u(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 32:
                        qr3.m36663v(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 33:
                        qr3.m36664w(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 34:
                        qr3.m36665x(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, false);
                        break;
                    case 35:
                        qr3.m36653l(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 36:
                        qr3.m36657p(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 37:
                        qr3.m36660s(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 38:
                        qr3.m36615B(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 39:
                        qr3.m36659r(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 40:
                        qr3.m36656o(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 41:
                        qr3.m36655n(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 42:
                        qr3.m36651j(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 43:
                        qr3.m36667z(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 44:
                        qr3.m36654m(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 45:
                        qr3.m36662u(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 46:
                        qr3.m36663v(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 47:
                        qr3.m36664w(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 48:
                        qr3.m36665x(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, true);
                        break;
                    case 49:
                        qr3.m36658q(this.f41265a[i3], (List) unsafe.getObject(t2, j2), so32, m39560m(i3));
                        break;
                    case 50:
                        m39538D(so32, i6, unsafe.getObject(t2, j2), i3);
                        break;
                    case 51:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34759q(i6, m39543J(t2, j2));
                            break;
                        }
                        break;
                    case 52:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34768z(i6, m39544K(t2, j2));
                            break;
                        }
                        break;
                    case 53:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34737E(i6, m39558k(t2, j2));
                            break;
                        }
                        break;
                    case 54:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34753j(i6, m39558k(t2, j2));
                            break;
                        }
                        break;
                    case 55:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34735C(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 56:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34766x(i6, m39558k(t2, j2));
                            break;
                        }
                        break;
                    case 57:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34764v(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 58:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34755m(i6, m39536B(t2, j2));
                            break;
                        }
                        break;
                    case 59:
                        if (m39535A(t2, i6, i3)) {
                            m39539E(i6, unsafe.getObject(t2, j2), so32);
                            break;
                        }
                        break;
                    case 60:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34739G(i6, unsafe.getObject(t2, j2), m39560m(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34757o(i6, (eo3) unsafe.getObject(t2, j2));
                            break;
                        }
                        break;
                    case 62:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34751h(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 63:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34762t(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 64:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34740H(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 65:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34742J(i6, m39558k(t2, j2));
                            break;
                        }
                        break;
                    case 66:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34744a(i6, m39547N(t2, j2));
                            break;
                        }
                        break;
                    case 67:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34746c(i6, m39558k(t2, j2));
                            break;
                        }
                        break;
                    case 68:
                        if (m39535A(t2, i6, i3)) {
                            so32.mo34734B(i6, unsafe.getObject(t2, j2), m39560m(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            gs3<?, ?> gs3 = this.f41277m;
            gs3.mo32282r(gs3.mo32268d(t2), so32);
            return;
        }
        this.f41278n.mo35775a(t2);
        throw null;
    }

    /* renamed from: D */
    private final <K, V> void m39538D(so3 so3, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            nq3 nq3 = (nq3) m39562o(i2);
            throw null;
        }
    }

    /* renamed from: E */
    private static final void m39539E(int i, Object obj, so3 so3) throws IOException {
        if (obj instanceof String) {
            so3.mo34749f(i, (String) obj);
        } else {
            so3.mo34757o(i, (eo3) obj);
        }
    }

    /* renamed from: G */
    static hs3 m39540G(Object obj) {
        kp3 kp3 = (kp3) obj;
        hs3 hs3 = kp3.zzc;
        if (hs3 != hs3.m32931c()) {
            return hs3;
        }
        hs3 e = hs3.m32933e();
        kp3.zzc = e;
        return e;
    }

    /* renamed from: H */
    static <T> xq3<T> m39541H(Class<T> cls, rq3 rq3, ar3 ar3, iq3 iq3, gs3<?, ?> gs3, xo3<?> xo3, pq3 pq3) {
        if (rq3 instanceof fr3) {
            return m39542I((fr3) rq3, ar3, iq3, gs3, xo3, pq3);
        }
        ds3 ds3 = (ds3) rq3;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.xq3<T> m39542I(com.google.android.gms.internal.ads.fr3 r34, com.google.android.gms.internal.ads.ar3 r35, com.google.android.gms.internal.ads.iq3 r36, com.google.android.gms.internal.ads.gs3<?, ?> r37, com.google.android.gms.internal.ads.xo3<?> r38, com.google.android.gms.internal.ads.pq3 r39) {
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
            java.lang.String r0 = r34.mo31920a()
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
            int[] r6 = f41263q
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
            sun.misc.Unsafe r15 = f41264r
            java.lang.Object[] r17 = r34.mo31921b()
            com.google.android.gms.internal.ads.uq3 r18 = r34.zza()
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
            java.lang.reflect.Field r12 = m39563p(r1, r12)
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
            java.lang.reflect.Field r7 = m39563p(r1, r7)
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
            java.lang.reflect.Field r8 = m39563p(r1, r8)
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
            java.lang.reflect.Field r11 = m39563p(r1, r11)
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
            com.google.android.gms.internal.ads.xq3 r0 = new com.google.android.gms.internal.ads.xq3
            r4 = r0
            com.google.android.gms.internal.ads.uq3 r9 = r34.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.m39542I(com.google.android.gms.internal.ads.fr3, com.google.android.gms.internal.ads.ar3, com.google.android.gms.internal.ads.iq3, com.google.android.gms.internal.ads.gs3, com.google.android.gms.internal.ads.xo3, com.google.android.gms.internal.ads.pq3):com.google.android.gms.internal.ads.xq3");
    }

    /* renamed from: J */
    private static <T> double m39543J(T t, long j) {
        return ((Double) qs3.m36724p(t, j)).doubleValue();
    }

    /* renamed from: K */
    private static <T> float m39544K(T t, long j) {
        return ((Float) qs3.m36724p(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x046b, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b5, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04e0, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e1, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0508, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0515, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0523, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0527, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39545L(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f41264r
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.f41265a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x052b
            int r7 = r14.m39557j(r3)
            int[] r8 = r14.f41265a
            r8 = r8[r3]
            int r9 = m39556i(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.f41265a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0519;
                case 1: goto L_0x050b;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04e3;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04c3;
                case 6: goto L_0x04b8;
                case 7: goto L_0x04ab;
                case 8: goto L_0x0481;
                case 9: goto L_0x046f;
                case 10: goto L_0x0453;
                case 11: goto L_0x043f;
                case 12: goto L_0x042b;
                case 13: goto L_0x041f;
                case 14: goto L_0x0413;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0396;
                case 23: goto L_0x038b;
                case 24: goto L_0x0380;
                case 25: goto L_0x0375;
                case 26: goto L_0x036a;
                case 27: goto L_0x035b;
                case 28: goto L_0x034f;
                case 29: goto L_0x0343;
                case 30: goto L_0x0337;
                case 31: goto L_0x032b;
                case 32: goto L_0x031f;
                case 33: goto L_0x0313;
                case 34: goto L_0x0307;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0527
        L_0x0041:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.uq3 r7 = (com.google.android.gms.internal.ads.uq3) r7
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.ro3.m37156y(r8, r7, r9)
            goto L_0x03cc
        L_0x0057:
            boolean r9 = r14.m39535A(r15, r8, r3)
            if (r9 == 0) goto L_0x0527
            long r9 = m39558k(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
            goto L_0x04e0
        L_0x0071:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m39547N(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x04e0
        L_0x008c:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0523
        L_0x009a:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0515
        L_0x00a8:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m39547N(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37157z(r7)
            goto L_0x04e0
        L_0x00be:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m39547N(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x04e0
        L_0x00d4:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.eo3 r7 = (com.google.android.gms.internal.ads.eo3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = r7.mo30457q()
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x046b
        L_0x00f0:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.qr3.m36630Q(r8, r7, r9)
            goto L_0x03cc
        L_0x0104:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.eo3
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.eo3 r7 = (com.google.android.gms.internal.ads.eo3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = r7.mo30457q()
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x046b
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37149C(r7)
            goto L_0x04e0
        L_0x0132:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x04b5
        L_0x0140:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0515
        L_0x014e:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0523
        L_0x015c:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m39547N(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37157z(r7)
            goto L_0x04e0
        L_0x0172:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m39558k(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            int r8 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
            goto L_0x0508
        L_0x0188:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m39558k(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            int r8 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
            goto L_0x0508
        L_0x019e:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0515
        L_0x01ac:
            boolean r7 = r14.m39535A(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0523
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m39562o(r3)
            com.google.android.gms.internal.ads.pq3.m36170a(r8, r7, r9)
            goto L_0x0527
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.qr3.m36625L(r8, r7, r9)
            goto L_0x03cc
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36635V(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36633T(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36624K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36622I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36620G(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36638Y(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36617D(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36622I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36624K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36627N(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36641a0(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36629P(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36622I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36624K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.ro3.m37150D(r8)
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
        L_0x0304:
            int r8 = r8 + r9
            goto L_0x04e0
        L_0x0307:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36634U(r8, r7, r2)
            goto L_0x03cc
        L_0x0313:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36632S(r8, r7, r2)
            goto L_0x03cc
        L_0x031f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36623J(r8, r7, r2)
            goto L_0x03cc
        L_0x032b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36621H(r8, r7, r2)
            goto L_0x03cc
        L_0x0337:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36619F(r8, r7, r2)
            goto L_0x03cc
        L_0x0343:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36637X(r8, r7, r2)
            goto L_0x03cc
        L_0x034f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36618E(r8, r7)
            goto L_0x03cc
        L_0x035b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.qr3.m36631R(r8, r7, r9)
            goto L_0x03cc
        L_0x036a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36636W(r8, r7)
            goto L_0x03cc
        L_0x0375:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36614A(r8, r7, r2)
            goto L_0x03cc
        L_0x0380:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36621H(r8, r7, r2)
            goto L_0x03cc
        L_0x038b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36623J(r8, r7, r2)
            goto L_0x03cc
        L_0x0396:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36626M(r8, r7, r2)
            goto L_0x03cc
        L_0x03a1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36639Z(r8, r7, r2)
            goto L_0x03cc
        L_0x03ac:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36628O(r8, r7, r2)
            goto L_0x03cc
        L_0x03b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36621H(r8, r7, r2)
            goto L_0x03cc
        L_0x03c2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.qr3.m36623J(r8, r7, r2)
        L_0x03cc:
            int r4 = r4 + r7
            goto L_0x0527
        L_0x03cf:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.uq3 r7 = (com.google.android.gms.internal.ads.uq3) r7
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.ro3.m37156y(r8, r7, r9)
            goto L_0x03cc
        L_0x03e2:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
            goto L_0x04e0
        L_0x03fa:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x04e0
        L_0x0413:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0523
        L_0x041f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0515
        L_0x042b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37157z(r7)
            goto L_0x04e0
        L_0x043f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x04e0
        L_0x0453:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.eo3 r7 = (com.google.android.gms.internal.ads.eo3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = r7.mo30457q()
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
        L_0x046b:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04e1
        L_0x046f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.or3 r9 = r14.m39560m(r3)
            int r7 = com.google.android.gms.internal.ads.qr3.m36630Q(r8, r7, r9)
            goto L_0x03cc
        L_0x0481:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.eo3
            if (r9 == 0) goto L_0x049e
            com.google.android.gms.internal.ads.eo3 r7 = (com.google.android.gms.internal.ads.eo3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = r7.mo30457q()
            int r9 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x046b
        L_0x049e:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37149C(r7)
            goto L_0x04e0
        L_0x04ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
        L_0x04b5:
            int r7 = r7 + r11
            goto L_0x03cc
        L_0x04b8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0515
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            goto L_0x0523
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.ro3.m37151a(r8)
            int r7 = com.google.android.gms.internal.ads.ro3.m37157z(r7)
        L_0x04e0:
            int r8 = r8 + r7
        L_0x04e1:
            int r4 = r4 + r8
            goto L_0x0527
        L_0x04e3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            int r8 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
            goto L_0x0508
        L_0x04f6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
            int r8 = com.google.android.gms.internal.ads.ro3.m37152b(r9)
        L_0x0508:
            int r7 = r7 + r8
            goto L_0x03cc
        L_0x050b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
        L_0x0515:
            int r7 = r7 + 4
            goto L_0x03cc
        L_0x0519:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.ro3.m37151a(r7)
        L_0x0523:
            int r7 = r7 + 8
            goto L_0x03cc
        L_0x0527:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x052b:
            com.google.android.gms.internal.ads.gs3<?, ?> r0 = r14.f41277m
            java.lang.Object r1 = r0.mo32268d(r15)
            int r0 = r0.mo32265a(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f41270f
            if (r0 != 0) goto L_0x053b
            return r4
        L_0x053b:
            com.google.android.gms.internal.ads.xo3<?> r0 = r14.f41278n
            r0.mo35775a(r15)
            r15 = 0
            goto L_0x0543
        L_0x0542:
            throw r15
        L_0x0543:
            goto L_0x0542
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.m39545L(java.lang.Object):int");
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
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39546M(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f41264r
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f41265a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m39557j(r2)
            int r5 = m39556i(r4)
            int[] r6 = r11.f41265a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.ads.dp3 r4 = com.google.android.gms.internal.ads.dp3.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.ads.dp3 r4 = com.google.android.gms.internal.ads.dp3.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f41265a
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
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.uq3 r4 = (com.google.android.gms.internal.ads.uq3) r4
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.ro3.m37156y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m39535A(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m39558k(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m39547N(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m39547N(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37157z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m39547N(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.eo3 r4 = (com.google.android.gms.internal.ads.eo3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = r4.mo30457q()
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.qr3.m36630Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.eo3
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.eo3 r4 = (com.google.android.gms.internal.ads.eo3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = r4.mo30457q()
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37149C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m39547N(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37157z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m39558k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r6)
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m39558k(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r6)
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m39535A(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.lang.Object r5 = r11.m39562o(r2)
            com.google.android.gms.internal.ads.pq3.m36170a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.qr3.m36625L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36635V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36633T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36624K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36622I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36620G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36638Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36617D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36622I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36624K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36627N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36641a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36629P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36622I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36624K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.ro3.m37150D(r6)
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36634U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36632S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36623J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36621H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36619F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36637X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36618E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.qr3.m36631R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36636W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36614A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36621H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36623J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36626M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36639Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36628O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36621H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.qr3.m36623J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.uq3 r4 = (com.google.android.gms.internal.ads.uq3) r4
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.ro3.m37156y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m39571x(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.ads.qs3.m36722n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.qs3.m36720l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.qs3.m36720l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37157z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.qs3.m36720l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.eo3 r4 = (com.google.android.gms.internal.ads.eo3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = r4.mo30457q()
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            com.google.android.gms.internal.ads.or3 r5 = r11.m39560m(r2)
            int r4 = com.google.android.gms.internal.ads.qr3.m36630Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.eo3
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.ads.eo3 r4 = (com.google.android.gms.internal.ads.eo3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = r4.mo30457q()
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37149C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.qs3.m36720l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.ro3.m37151a(r5)
            int r4 = com.google.android.gms.internal.ads.ro3.m37157z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.qs3.m36722n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r6)
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.qs3.m36722n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.ro3.m37151a(r6)
            int r4 = com.google.android.gms.internal.ads.ro3.m37152b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m39571x(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.ro3.m37151a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.ads.gs3<?, ?> r0 = r11.f41277m
            java.lang.Object r12 = r0.mo32268d(r12)
            int r12 = r0.mo32265a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.m39546M(java.lang.Object):int");
    }

    /* renamed from: N */
    private static <T> int m39547N(T t, long j) {
        return ((Integer) qs3.m36724p(t, j)).intValue();
    }

    /* renamed from: O */
    private final <K, V> int m39548O(T t, byte[] bArr, int i, int i2, int i3, long j, on3 on3) throws IOException {
        Unsafe unsafe = f41264r;
        Object o = m39562o(i3);
        Object object = unsafe.getObject(t, j);
        if (pq3.m36171b(object)) {
            oq3 c = oq3.m35797b().mo33983c();
            pq3.m36172c(c, object);
            unsafe.putObject(t, j, c);
        }
        nq3 nq3 = (nq3) o;
        throw null;
    }

    /* renamed from: P */
    private final int m39549P(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, on3 on3) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        on3 on32 = on3;
        Unsafe unsafe = f41264r;
        long j3 = (long) (this.f41265a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(pn3.m36157n(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(pn3.m36145b(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = pn3.m36156m(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, Long.valueOf(on32.f36558b));
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = pn3.m36153j(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, Integer.valueOf(on32.f36557a));
                    unsafe.putInt(t2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(pn3.m36157n(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(pn3.m36145b(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = pn3.m36156m(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, Boolean.valueOf(on32.f36558b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = pn3.m36153j(bArr2, i9, on32);
                    int i14 = on32.f36557a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || vs3.m38947j(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, j5, i14, up3.f39919b));
                        j5 += i14;
                    } else {
                        throw wp3.m39225d();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = pn3.m36147d(m39560m(i13), bArr2, i9, i2, on32);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, on32.f36559c);
                    } else {
                        unsafe.putObject(t2, j2, up3.m38381g(object, on32.f36559c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = pn3.m36144a(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, on32.f36559c);
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = pn3.m36153j(bArr2, i9, on32);
                    int i15 = on32.f36557a;
                    op3 l = m39559l(i13);
                    if (l == null || l.mo30325m(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m39540G(t).mo32449h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = pn3.m36153j(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, Integer.valueOf(mo3.m34837e(on32.f36557a)));
                    unsafe.putInt(t2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = pn3.m36156m(bArr2, i9, on32);
                    unsafe.putObject(t2, j2, Long.valueOf(mo3.m34838f(on32.f36558b)));
                    unsafe.putInt(t2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = pn3.m36146c(m39560m(i13), bArr, i, i2, (i10 & -8) | 4, on3);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, on32.f36559c);
                    } else {
                        unsafe.putObject(t2, j2, up3.m38381g(object2, on32.f36559c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a8, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f1, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0314, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r20;
        r8 = 1048575;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39550Q(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.on3 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f41264r
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x033d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.ads.pn3.m36154k(r0, r12, r3, r11)
            int r3 = r11.f36557a
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
            int r0 = r15.m39553T(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m39552S(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x0317
        L_0x004e:
            int[] r0 = r15.f41265a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m39556i(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0213
            int[] r10 = r15.f41265a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x0090
            r23 = r1
            r20 = r2
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0096
        L_0x0090:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x0096:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01da;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01a9;
                case 5: goto L_0x018d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014c;
                case 8: goto L_0x012b;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e7;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00d6;
                case 13: goto L_0x0169;
                case 14: goto L_0x018d;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00a3;
                default: goto L_0x009a;
            }
        L_0x009a:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x020a
        L_0x00a3:
            if (r3 != 0) goto L_0x00bc
            int r17 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r4, r11)
            long r0 = r11.f36558b
            long r4 = com.google.android.gms.internal.ads.mo3.m34838f(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01d2
        L_0x00bc:
            r13 = r20
            r20 = r33
            goto L_0x0126
        L_0x00c1:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r4, r11)
            int r1 = r11.f36557a
            int r1 = com.google.android.gms.internal.ads.mo3.m34837e(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00d6:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r4, r11)
            int r1 = r11.f36557a
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00e7:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.pn3.m36144a(r12, r4, r11)
            java.lang.Object r1 = r11.f36559c
            r10.putObject(r14, r8, r1)
            goto L_0x0207
        L_0x00f9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0124
            com.google.android.gms.internal.ads.or3 r0 = r15.m39560m(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.ads.pn3.m36147d(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.f36559c
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x011a:
            java.lang.Object r3 = r11.f36559c
            java.lang.Object r1 = com.google.android.gms.internal.ads.up3.m38381g(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x0124:
            r2 = r34
        L_0x0126:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020a
        L_0x012b:
            r2 = r34
            r13 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r0) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0142
            int r0 = com.google.android.gms.internal.ads.pn3.m36150g(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.ads.pn3.m36151h(r12, r4, r11)
        L_0x0146:
            java.lang.Object r1 = r11.f36559c
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x014c:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r4, r11)
            long r3 = r11.f36558b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            com.google.android.gms.internal.ads.qs3.m36732x(r14, r8, r5)
            goto L_0x017d
        L_0x0169:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.pn3.m36145b(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x017d:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x018d:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r22 = com.google.android.gms.internal.ads.pn3.m36157n(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0207
        L_0x01a9:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r4, r11)
            int r1 = r11.f36557a
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x01bc:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r17 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r4, r11)
            long r4 = r11.f36558b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01d2:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0257
        L_0x01da:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.pn3.m36145b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.qs3.m36701A(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0207
        L_0x01f1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r0 = com.google.android.gms.internal.ads.pn3.m36157n(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.qs3.m36734z(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0207:
            r6 = r6 | r21
            goto L_0x0255
        L_0x020a:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x0317
        L_0x0213:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x026e
            r1 = 2
            if (r3 != r1) goto L_0x0261
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.ads.tp3 r0 = (com.google.android.gms.internal.ads.tp3) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0241
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0239
            r1 = 10
            goto L_0x023a
        L_0x0239:
            int r1 = r1 + r1
        L_0x023a:
            com.google.android.gms.internal.ads.tp3 r0 = r0.mo30784s(r1)
            r10.putObject(r14, r8, r0)
        L_0x0241:
            r5 = r0
            com.google.android.gms.internal.ads.or3 r0 = r15.m39560m(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.pn3.m36148e(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0255:
            r9 = r10
            r2 = r13
        L_0x0257:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0261:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02f4
        L_0x026e:
            r1 = 49
            if (r0 > r1) goto L_0x02c0
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
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m39551R(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02be
        L_0x02aa:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x0335
        L_0x02be:
            r2 = r0
            goto L_0x02f5
        L_0x02c0:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02fa
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02f4
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.m39548O(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x02f4:
            r2 = r15
        L_0x02f5:
            r6 = r24
            r7 = r25
            goto L_0x0317
        L_0x02fa:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.m39549P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x0317:
            com.google.android.gms.internal.ads.hs3 r4 = m39540G(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.pn3.m36152i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
        L_0x0335:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x033d:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0350
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0350:
            r1 = r34
            if (r0 != r1) goto L_0x0355
            return r0
        L_0x0355:
            com.google.android.gms.internal.ads.wp3 r0 = com.google.android.gms.internal.ads.wp3.m39228g()
            goto L_0x035b
        L_0x035a:
            throw r0
        L_0x035b:
            goto L_0x035a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.m39550Q(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.on3):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: R */
    private final int m39551R(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.on3 r29) throws java.io.IOException {
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
            sun.misc.Unsafe r11 = f41264r
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.tp3 r12 = (com.google.android.gms.internal.ads.tp3) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.tp3 r12 = r12.mo30784s(r13)
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
            com.google.android.gms.internal.ads.or3 r1 = r15.m39560m(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.pn3.m36146c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f36559c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r1, r7)
            long r4 = r7.f36558b
            long r4 = com.google.android.gms.internal.ads.mo3.m34838f(r4)
            r12.mo32933h(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r4, r7)
            long r8 = r7.f36558b
            long r8 = com.google.android.gms.internal.ads.mo3.m34838f(r8)
            r12.mo32933h(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r4, r7)
            long r8 = r7.f36558b
            long r8 = com.google.android.gms.internal.ads.mo3.m34838f(r8)
            r12.mo32933h(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.ads.lp3 r12 = (com.google.android.gms.internal.ads.lp3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r4 = r7.f36557a
            int r4 = com.google.android.gms.internal.ads.mo3.m34837e(r4)
            r12.mo33382p(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.lp3 r12 = (com.google.android.gms.internal.ads.lp3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r4 = r7.f36557a
            int r4 = com.google.android.gms.internal.ads.mo3.m34837e(r4)
            r12.mo33382p(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r4 = r7.f36557a
            int r4 = com.google.android.gms.internal.ads.mo3.m34837e(r4)
            r12.mo33382p(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.pn3.m36149f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.pn3.m36155l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.ads.kp3 r1 = (com.google.android.gms.internal.ads.kp3) r1
            com.google.android.gms.internal.ads.hs3 r3 = r1.zzc
            com.google.android.gms.internal.ads.hs3 r4 = com.google.android.gms.internal.ads.hs3.m32931c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.ads.op3 r4 = r15.m39559l(r8)
            com.google.android.gms.internal.ads.gs3<?, ?> r5 = r0.f41277m
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.ads.qr3.m36644c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.ads.hs3 r3 = (com.google.android.gms.internal.ads.hs3) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r4 = r7.f36557a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.ads.eo3 r4 = com.google.android.gms.internal.ads.eo3.f31444c
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.ads.eo3 r6 = com.google.android.gms.internal.ads.eo3.m31874M(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r4 = r7.f36557a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.ads.eo3 r4 = com.google.android.gms.internal.ads.eo3.f31444c
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.ads.eo3 r6 = com.google.android.gms.internal.ads.eo3.m31874M(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.ads.or3 r1 = r15.m39560m(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.pn3.m36148e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r6 = r7.f36557a
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.up3.f39919b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r8 = r7.f36557a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r6, r7)
            int r6 = r7.f36557a
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.up3.f39919b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r6 = r7.f36557a
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.vs3.m38947j(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.up3.f39919b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r8 = r7.f36557a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r6, r7)
            int r6 = r7.f36557a
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.vs3.m38947j(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.up3.f39919b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39225d()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39225d()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39227f()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.ads.qn3 r12 = (com.google.android.gms.internal.ads.qn3) r12
            int r2 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r4 = r7.f36557a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r2, r7)
            long r5 = r7.f36558b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.mo34365e(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.qn3 r12 = (com.google.android.gms.internal.ads.qn3) r12
            int r4 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r4, r7)
            long r8 = r7.f36558b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.mo34365e(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r8 = r7.f36557a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r6, r7)
            long r8 = r7.f36558b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.mo34365e(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.ads.lp3 r12 = (com.google.android.gms.internal.ads.lp3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.ads.pn3.m36145b(r3, r1)
            r12.mo33382p(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.lp3 r12 = (com.google.android.gms.internal.ads.lp3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36145b(r17, r18)
            r12.mo33382p(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.ads.pn3.m36145b(r3, r4)
            r12.mo33382p(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.ads.pn3.m36157n(r3, r1)
            r12.mo32933h(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            long r8 = com.google.android.gms.internal.ads.pn3.m36157n(r17, r18)
            r12.mo32933h(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.ads.pn3.m36157n(r3, r4)
            r12.mo32933h(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.ads.pn3.m36149f(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.ads.pn3.m36155l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r1, r7)
            long r4 = r7.f36558b
            r12.mo32933h(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.jq3 r12 = (com.google.android.gms.internal.ads.jq3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r4, r7)
            long r8 = r7.f36558b
            r12.mo32933h(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.ads.pn3.m36156m(r3, r4, r7)
            long r8 = r7.f36558b
            r12.mo32933h(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.ads.ep3 r12 = (com.google.android.gms.internal.ads.ep3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.ads.pn3.m36145b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo31629e(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.ep3 r12 = (com.google.android.gms.internal.ads.ep3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36145b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo31629e(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.ads.pn3.m36145b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo31629e(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.ads.to3 r12 = (com.google.android.gms.internal.ads.to3) r12
            int r1 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r2 = r7.f36557a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.ads.pn3.m36157n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo34998e(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.ads.wp3 r1 = com.google.android.gms.internal.ads.wp3.m39230j()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.to3 r12 = (com.google.android.gms.internal.ads.to3) r12
            long r8 = com.google.android.gms.internal.ads.pn3.m36157n(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo34998e(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r1, r7)
            int r6 = r7.f36557a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.ads.pn3.m36157n(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo34998e(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.ads.pn3.m36153j(r3, r4, r7)
            int r9 = r7.f36557a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.pn3.m36146c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f36559c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.m39551R(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.on3):int");
    }

    /* renamed from: S */
    private final int m39552S(int i) {
        if (i < this.f41267c || i > this.f41268d) {
            return -1;
        }
        return m39555b(i, 0);
    }

    /* renamed from: T */
    private final int m39553T(int i, int i2) {
        if (i < this.f41267c || i > this.f41268d) {
            return -1;
        }
        return m39555b(i, i2);
    }

    /* renamed from: U */
    private final int m39554U(int i) {
        return this.f41265a[i + 2];
    }

    /* renamed from: b */
    private final int m39555b(int i, int i2) {
        int length = (this.f41265a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f41265a[i4];
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

    /* renamed from: i */
    private static int m39556i(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: j */
    private final int m39557j(int i) {
        return this.f41265a[i + 1];
    }

    /* renamed from: k */
    private static <T> long m39558k(T t, long j) {
        return ((Long) qs3.m36724p(t, j)).longValue();
    }

    /* renamed from: l */
    private final op3 m39559l(int i) {
        int i2 = i / 3;
        return (op3) this.f41266b[i2 + i2 + 1];
    }

    /* renamed from: m */
    private final or3 m39560m(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        or3 or3 = (or3) this.f41266b[i3];
        if (or3 != null) {
            return or3;
        }
        or3 b = dr3.m31600a().mo31400b((Class) this.f41266b[i3 + 1]);
        this.f41266b[i3] = b;
        return b;
    }

    /* renamed from: n */
    private final <UT, UB> UB m39561n(Object obj, int i, UB ub, gs3<UT, UB> gs3) {
        int i2 = this.f41265a[i];
        Object p = qs3.m36724p(obj, (long) (m39557j(i) & 1048575));
        if (p == null || m39559l(i) == null) {
            return ub;
        }
        oq3 oq3 = (oq3) p;
        nq3 nq3 = (nq3) m39562o(i);
        throw null;
    }

    /* renamed from: o */
    private final Object m39562o(int i) {
        int i2 = i / 3;
        return this.f41266b[i2 + i2];
    }

    /* renamed from: p */
    private static Field m39563p(Class<?> cls, String str) {
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

    /* renamed from: q */
    private final void m39564q(T t, T t2, int i) {
        long j = (long) (m39557j(i) & 1048575);
        if (m39571x(t2, i)) {
            Object p = qs3.m36724p(t, j);
            Object p2 = qs3.m36724p(t2, j);
            if (p != null && p2 != null) {
                qs3.m36704D(t, j, up3.m38381g(p, p2));
                m39567t(t, i);
            } else if (p2 != null) {
                qs3.m36704D(t, j, p2);
                m39567t(t, i);
            }
        }
    }

    /* renamed from: r */
    private final void m39565r(T t, T t2, int i) {
        int j = m39557j(i);
        int i2 = this.f41265a[i];
        long j2 = (long) (j & 1048575);
        if (m39535A(t2, i2, i)) {
            Object p = m39535A(t, i2, i) ? qs3.m36724p(t, j2) : null;
            Object p2 = qs3.m36724p(t2, j2);
            if (p != null && p2 != null) {
                qs3.m36704D(t, j2, up3.m38381g(p, p2));
                m39568u(t, i2, i);
            } else if (p2 != null) {
                qs3.m36704D(t, j2, p2);
                m39568u(t, i2, i);
            }
        }
    }

    /* renamed from: s */
    private final void m39566s(Object obj, int i, gr3 gr3) throws IOException {
        if (m39570w(i)) {
            qs3.m36704D(obj, (long) (i & 1048575), gr3.mo32237n());
        } else if (this.f41271g) {
            qs3.m36704D(obj, (long) (i & 1048575), gr3.zzt());
        } else {
            qs3.m36704D(obj, (long) (i & 1048575), gr3.zzp());
        }
    }

    /* renamed from: t */
    private final void m39567t(T t, int i) {
        int U = m39554U(i);
        long j = (long) (1048575 & U);
        if (j != 1048575) {
            qs3.m36702B(t, j, (1 << (U >>> 20)) | qs3.m36720l(t, j));
        }
    }

    /* renamed from: u */
    private final void m39568u(T t, int i, int i2) {
        qs3.m36702B(t, (long) (m39554U(i2) & 1048575), i);
    }

    /* renamed from: v */
    private final boolean m39569v(T t, T t2, int i) {
        return m39571x(t, i) == m39571x(t2, i);
    }

    /* renamed from: w */
    private static boolean m39570w(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: x */
    private final boolean m39571x(T t, int i) {
        int U = m39554U(i);
        long j = (long) (U & 1048575);
        if (j != 1048575) {
            return (qs3.m36720l(t, j) & (1 << (U >>> 20))) != 0;
        }
        int j2 = m39557j(i);
        long j3 = (long) (j2 & 1048575);
        switch (m39556i(j2)) {
            case 0:
                return Double.doubleToRawLongBits(qs3.m36718j(t, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(qs3.m36719k(t, j3)) != 0;
            case 2:
                return qs3.m36722n(t, j3) != 0;
            case 3:
                return qs3.m36722n(t, j3) != 0;
            case 4:
                return qs3.m36720l(t, j3) != 0;
            case 5:
                return qs3.m36722n(t, j3) != 0;
            case 6:
                return qs3.m36720l(t, j3) != 0;
            case 7:
                return qs3.m36708H(t, j3);
            case 8:
                Object p = qs3.m36724p(t, j3);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                }
                if (p instanceof eo3) {
                    return !eo3.f31444c.equals(p);
                }
                throw new IllegalArgumentException();
            case 9:
                return qs3.m36724p(t, j3) != null;
            case 10:
                return !eo3.f31444c.equals(qs3.m36724p(t, j3));
            case 11:
                return qs3.m36720l(t, j3) != 0;
            case 12:
                return qs3.m36720l(t, j3) != 0;
            case 13:
                return qs3.m36720l(t, j3) != 0;
            case 14:
                return qs3.m36722n(t, j3) != 0;
            case 15:
                return qs3.m36720l(t, j3) != 0;
            case 16:
                return qs3.m36722n(t, j3) != 0;
            case 17:
                return qs3.m36724p(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: y */
    private final boolean m39572y(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m39571x(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: z */
    private static boolean m39573z(Object obj, int i, or3 or3) {
        return or3.mo33997c(qs3.m36724p(obj, (long) (i & 1048575)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0340, code lost:
        if (r0 != r15) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x035c, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0386, code lost:
        if (r0 != r15) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03aa, code lost:
        if (r0 != r15) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020b, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0246, code lost:
        r5 = r6 | r24;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0283, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0285, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0286, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029d, code lost:
        r18 = r6;
        r19 = r7;
        r26 = r10;
        r8 = r11;
        r23 = r20;
        r6 = r25;
        r7 = r33;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35788F(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.on3 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f41264r
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x041e
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.pn3.m36154k(r0, r12, r1, r9)
            int r1 = r9.f36557a
            goto L_0x002d
        L_0x0028:
            r27 = r1
            r1 = r0
            r0 = r27
        L_0x002d:
            int r7 = r1 >>> 3
            r8 = r1 & 7
            r4 = 3
            if (r7 <= r2) goto L_0x003a
            int r3 = r3 / r4
            int r2 = r15.m39553T(r7, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m39552S(r7)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r2 = r0
            r8 = r1
            r18 = r5
            r23 = r7
            r26 = r10
            r7 = r11
            r17 = -1
            r19 = 0
            goto L_0x03ad
        L_0x0050:
            int[] r3 = r15.f41265a
            int r19 = r2 + 1
            r3 = r3[r19]
            int r4 = m39556i(r3)
            r20 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r3 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r4 > r0) goto L_0x02ac
            int[] r0 = r15.f41265a
            int r24 = r2 + 2
            r0 = r0[r24]
            int r24 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r24
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x008b
            r17 = r2
            if (r6 == r11) goto L_0x0083
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0083:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x008f
        L_0x008b:
            r17 = r2
            r25 = r6
        L_0x008f:
            r6 = r5
            r0 = 5
            switch(r4) {
                case 0: goto L_0x0267;
                case 1: goto L_0x024b;
                case 2: goto L_0x0227;
                case 3: goto L_0x0227;
                case 4: goto L_0x020e;
                case 5: goto L_0x01ea;
                case 6: goto L_0x01d1;
                case 7: goto L_0x01af;
                case 8: goto L_0x018b;
                case 9: goto L_0x015a;
                case 10: goto L_0x0140;
                case 11: goto L_0x020e;
                case 12: goto L_0x010b;
                case 13: goto L_0x01d1;
                case 14: goto L_0x01ea;
                case 15: goto L_0x00ee;
                case 16: goto L_0x00c2;
                default: goto L_0x0094;
            }
        L_0x0094:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 3
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029d
            com.google.android.gms.internal.ads.or3 r0 = r15.m39560m(r7)
            int r1 = r20 << 3
            r8 = r1 | 4
            r1 = r30
            r3 = r32
            r12 = r4
            r4 = r8
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.pn3.m36146c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0289
            java.lang.Object r1 = r9.f36559c
            r10.putObject(r14, r12, r1)
            goto L_0x0296
        L_0x00c2:
            if (r8 != 0) goto L_0x00e2
            r1 = r21
            int r8 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r1, r9)
            long r0 = r9.f36558b
            long r4 = com.google.android.gms.internal.ads.mo3.m34838f(r0)
            r2 = r22
            r0 = r10
            r11 = r20
            r1 = r29
            r20 = r7
            r7 = r17
            r17 = -1
            r0.putLong(r1, r2, r4)
            goto L_0x0246
        L_0x00e2:
            r11 = r20
            r20 = r7
            r7 = r17
            r17 = -1
            r2 = r21
            goto L_0x029d
        L_0x00ee:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020b
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r1, r9)
            int r1 = r9.f36557a
            int r1 = com.google.android.gms.internal.ads.mo3.m34837e(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0283
        L_0x010b:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020b
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r1, r9)
            int r1 = r9.f36557a
            com.google.android.gms.internal.ads.op3 r4 = r15.m39559l(r7)
            if (r4 == 0) goto L_0x013b
            boolean r4 = r4.mo30325m(r1)
            if (r4 == 0) goto L_0x012c
            goto L_0x013b
        L_0x012c:
            com.google.android.gms.internal.ads.hs3 r2 = m39540G(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo32449h(r11, r1)
            r5 = r6
            goto L_0x0285
        L_0x013b:
            r10.putInt(r14, r2, r1)
            goto L_0x0283
        L_0x0140:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020b
            int r0 = com.google.android.gms.internal.ads.pn3.m36144a(r12, r1, r9)
            java.lang.Object r1 = r9.f36559c
            r10.putObject(r14, r2, r1)
            goto L_0x0283
        L_0x015a:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020b
            com.google.android.gms.internal.ads.or3 r0 = r15.m39560m(r7)
            int r0 = com.google.android.gms.internal.ads.pn3.m36147d(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x017c
            java.lang.Object r1 = r9.f36559c
            r10.putObject(r14, r2, r1)
            goto L_0x0283
        L_0x017c:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f36559c
            java.lang.Object r1 = com.google.android.gms.internal.ads.up3.m38381g(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0283
        L_0x018b:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.pn3.m36150g(r12, r1, r9)
            goto L_0x01a8
        L_0x01a4:
            int r0 = com.google.android.gms.internal.ads.pn3.m36151h(r12, r1, r9)
        L_0x01a8:
            java.lang.Object r1 = r9.f36559c
            r10.putObject(r14, r4, r1)
            goto L_0x0283
        L_0x01af:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020b
            int r0 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r1, r9)
            long r1 = r9.f36558b
            r21 = 0
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01cb
            r1 = 1
            goto L_0x01cc
        L_0x01cb:
            r1 = 0
        L_0x01cc:
            com.google.android.gms.internal.ads.qs3.m36732x(r14, r4, r1)
            goto L_0x0283
        L_0x01d1:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020b
            int r0 = com.google.android.gms.internal.ads.pn3.m36145b(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
            goto L_0x0283
        L_0x01ea:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020b
            long r21 = com.google.android.gms.internal.ads.pn3.m36157n(r12, r1)
            r8 = r1
            r0 = r10
            r1 = r29
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0283
        L_0x020b:
            r2 = r1
            goto L_0x029d
        L_0x020e:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x029d
            int r0 = com.google.android.gms.internal.ads.pn3.m36153j(r12, r2, r9)
            int r1 = r9.f36557a
            r10.putInt(r14, r4, r1)
            goto L_0x0283
        L_0x0227:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x029d
            int r8 = com.google.android.gms.internal.ads.pn3.m36156m(r12, r2, r9)
            long r2 = r9.f36558b
            r0 = r10
            r1 = r29
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
        L_0x0246:
            r5 = r6 | r24
            r3 = r7
            r0 = r8
            goto L_0x0286
        L_0x024b:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029d
            int r0 = com.google.android.gms.internal.ads.pn3.m36145b(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.qs3.m36701A(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x0283
        L_0x0267:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029d
            long r0 = com.google.android.gms.internal.ads.pn3.m36157n(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.qs3.m36734z(r14, r4, r0)
            int r0 = r2 + 8
        L_0x0283:
            r5 = r6 | r24
        L_0x0285:
            r3 = r7
        L_0x0286:
            r1 = r11
            goto L_0x02f8
        L_0x0289:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f36559c
            java.lang.Object r1 = com.google.android.gms.internal.ads.up3.m38381g(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x0296:
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x0285
        L_0x029d:
            r18 = r6
            r19 = r7
            r26 = r10
            r8 = r11
            r23 = r20
            r6 = r25
            r7 = r33
            goto L_0x03ad
        L_0x02ac:
            r11 = r20
            r12 = r22
            r17 = -1
            r20 = r7
            r7 = r2
            r2 = r21
            r0 = 27
            if (r4 != r0) goto L_0x030f
            r0 = 2
            if (r8 != r0) goto L_0x0300
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.ads.tp3 r0 = (com.google.android.gms.internal.ads.tp3) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02db
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d3
            r1 = 10
            goto L_0x02d4
        L_0x02d3:
            int r1 = r1 + r1
        L_0x02d4:
            com.google.android.gms.internal.ads.tp3 r0 = r0.mo30784s(r1)
            r10.putObject(r14, r12, r0)
        L_0x02db:
            r8 = r0
            com.google.android.gms.internal.ads.or3 r0 = r15.m39560m(r7)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r18 = r5
            r5 = r8
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.pn3.m36148e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r5 = r18
        L_0x02f8:
            r2 = r20
            r6 = r25
            r11 = r33
            goto L_0x0019
        L_0x0300:
            r18 = r5
            r25 = r6
            r15 = r2
            r19 = r7
            r26 = r10
            r23 = r20
            r20 = r11
            goto L_0x0389
        L_0x030f:
            r18 = r5
            r25 = r6
            r6 = r2
            r0 = 49
            if (r4 > r0) goto L_0x0360
            long r2 = (long) r3
            r0 = r28
            r1 = r29
            r21 = r2
            r2 = r30
            r3 = r6
            r5 = r4
            r4 = r32
            r31 = r5
            r5 = r11
            r15 = r6
            r6 = r20
            r19 = r7
            r23 = r20
            r7 = r8
            r8 = r19
            r26 = r10
            r9 = r21
            r20 = r11
            r11 = r31
            r14 = r34
            int r0 = r0.m39551R(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x035c
        L_0x0342:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r18
            r3 = r19
            r1 = r20
            r2 = r23
            r6 = r25
            r10 = r26
            goto L_0x0019
        L_0x035c:
            r7 = r33
            r2 = r0
            goto L_0x038c
        L_0x0360:
            r31 = r4
            r15 = r6
            r19 = r7
            r26 = r10
            r23 = r20
            r20 = r11
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x0391
            r0 = 2
            if (r8 != r0) goto L_0x0389
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            int r0 = r0.m39548O(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x035c
            goto L_0x0342
        L_0x0389:
            r7 = r33
            r2 = r15
        L_0x038c:
            r8 = r20
            r6 = r25
            goto L_0x03ad
        L_0x0391:
            r0 = r28
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r15
            r4 = r32
            r5 = r20
            r6 = r23
            r7 = r8
            r8 = r10
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.m39549P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x035c
            goto L_0x0342
        L_0x03ad:
            if (r8 != r7) goto L_0x03bf
            if (r7 == 0) goto L_0x03bf
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r18
            r2 = 0
            goto L_0x042b
        L_0x03bf:
            r9 = r28
            boolean r0 = r9.f41270f
            if (r0 == 0) goto L_0x03f7
            r10 = r34
            com.google.android.gms.internal.ads.wo3 r0 = r10.f36560d
            com.google.android.gms.internal.ads.wo3 r1 = com.google.android.gms.internal.ads.wo3.m39219a()
            if (r0 == r1) goto L_0x03f4
            com.google.android.gms.internal.ads.uq3 r0 = r9.f41269e
            com.google.android.gms.internal.ads.wo3 r1 = r10.f36560d
            r11 = r23
            com.google.android.gms.internal.ads.jp3 r0 = r1.mo35651c(r0, r11)
            if (r0 != 0) goto L_0x03ed
            com.google.android.gms.internal.ads.hs3 r4 = m39540G(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.pn3.m36152i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x040c
        L_0x03ed:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.ads.ip3 r0 = (com.google.android.gms.internal.ads.ip3) r0
            r2 = 0
            throw r2
        L_0x03f4:
            r12 = r29
            goto L_0x03fb
        L_0x03f7:
            r12 = r29
            r10 = r34
        L_0x03fb:
            r11 = r23
            com.google.android.gms.internal.ads.hs3 r4 = m39540G(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.pn3.m36152i(r0, r1, r2, r3, r4, r5)
        L_0x040c:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r19
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x041e:
            r18 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x042b:
            if (r6 == r3) goto L_0x0433
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x0433:
            int r3 = r9.f41274j
        L_0x0435:
            int r4 = r9.f41275k
            if (r3 >= r4) goto L_0x0445
            int[] r4 = r9.f41273i
            r4 = r4[r3]
            com.google.android.gms.internal.ads.gs3<?, ?> r5 = r9.f41277m
            r9.m39561n(r12, r4, r2, r5)
            int r3 = r3 + 1
            goto L_0x0435
        L_0x0445:
            if (r7 != 0) goto L_0x0451
            r2 = r32
            if (r0 != r2) goto L_0x044c
            goto L_0x0457
        L_0x044c:
            com.google.android.gms.internal.ads.wp3 r0 = com.google.android.gms.internal.ads.wp3.m39228g()
            throw r0
        L_0x0451:
            r2 = r32
            if (r0 > r2) goto L_0x0458
            if (r1 != r7) goto L_0x0458
        L_0x0457:
            return r0
        L_0x0458:
            com.google.android.gms.internal.ads.wp3 r0 = com.google.android.gms.internal.ads.wp3.m39228g()
            goto L_0x045e
        L_0x045d:
            throw r0
        L_0x045e:
            goto L_0x045d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.mo35788F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.on3):int");
    }

    /* renamed from: a */
    public final void mo33996a(T t) {
        int i;
        int i2 = this.f41274j;
        while (true) {
            i = this.f41275k;
            if (i2 >= i) {
                break;
            }
            long j = (long) (m39557j(this.f41273i[i2]) & 1048575);
            Object p = qs3.m36724p(t, j);
            if (p != null) {
                ((oq3) p).mo33985d();
                qs3.m36704D(t, j, p);
            }
            i2++;
        }
        int length = this.f41273i.length;
        while (i < length) {
            this.f41276l.mo31643b(t, (long) this.f41273i[i]);
            i++;
        }
        this.f41277m.mo32277m(t);
        if (this.f41270f) {
            this.f41278n.mo35779e(t);
        }
    }

    /* renamed from: c */
    public final boolean mo33997c(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f41274j) {
            int i6 = this.f41273i[i5];
            int i7 = this.f41265a[i6];
            int j = m39557j(i6);
            int i8 = this.f41265a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f41264r.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & j) != 0 && !m39572y(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = m39556i(j);
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (m39535A(t2, i7, i6) && !m39573z(t2, j, m39560m(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !((oq3) qs3.m36724p(t2, (long) (j & 1048575))).isEmpty()) {
                            nq3 nq3 = (nq3) m39562o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) qs3.m36724p(t2, (long) (j & 1048575));
                if (!list.isEmpty()) {
                    or3 m = m39560m(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!m.mo33997c(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m39572y(t, i6, i2, i, i10) && !m39573z(t2, j, m39560m(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f41270f) {
            return true;
        }
        this.f41278n.mo35775a(t2);
        throw null;
    }

    /* renamed from: d */
    public final void mo33998d(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f41265a.length; i += 3) {
            int j = m39557j(i);
            long j2 = (long) (1048575 & j);
            int i2 = this.f41265a[i];
            switch (m39556i(j)) {
                case 0:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36734z(t, j2, qs3.m36718j(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 1:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36701A(t, j2, qs3.m36719k(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 2:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36703C(t, j2, qs3.m36722n(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 3:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36703C(t, j2, qs3.m36722n(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 4:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 5:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36703C(t, j2, qs3.m36722n(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 6:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 7:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36732x(t, j2, qs3.m36708H(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 8:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36704D(t, j2, qs3.m36724p(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 9:
                    m39564q(t, t2, i);
                    break;
                case 10:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36704D(t, j2, qs3.m36724p(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 11:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 12:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 13:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 14:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36703C(t, j2, qs3.m36722n(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 15:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36702B(t, j2, qs3.m36720l(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 16:
                    if (!m39571x(t2, i)) {
                        break;
                    } else {
                        qs3.m36703C(t, j2, qs3.m36722n(t2, j2));
                        m39567t(t, i);
                        break;
                    }
                case 17:
                    m39564q(t, t2, i);
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
                    this.f41276l.mo31644c(t, t2, j2);
                    break;
                case 50:
                    qr3.m36650i(this.f41280p, t, t2, j2);
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
                    if (!m39535A(t2, i2, i)) {
                        break;
                    } else {
                        qs3.m36704D(t, j2, qs3.m36724p(t2, j2));
                        m39568u(t, i2, i);
                        break;
                    }
                case 60:
                    m39565r(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m39535A(t2, i2, i)) {
                        break;
                    } else {
                        qs3.m36704D(t, j2, qs3.m36724p(t2, j2));
                        m39568u(t, i2, i);
                        break;
                    }
                case 68:
                    m39565r(t, t2, i);
                    break;
            }
        }
        qr3.m36647f(this.f41277m, t, t2);
        if (this.f41270f) {
            qr3.m36646e(this.f41278n, t, t2);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: e */
    public final void mo33999e(T r13, com.google.android.gms.internal.ads.gr3 r14, com.google.android.gms.internal.ads.wo3 r15) throws java.io.IOException {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r15)
            com.google.android.gms.internal.ads.gs3<?, ?> r7 = r12.f41277m
            com.google.android.gms.internal.ads.xo3<?> r8 = r12.f41278n
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.zzc()     // Catch:{ all -> 0x0079 }
            int r2 = r12.m39552S(r1)     // Catch:{ all -> 0x0079 }
            if (r2 >= 0) goto L_0x007c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0030
            int r14 = r12.f41274j
        L_0x001b:
            int r15 = r12.f41275k
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.f41273i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m39561n(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x05c4
            r7.mo32278n(r13, r10)
            return
        L_0x0030:
            boolean r2 = r12.f41270f     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0036
            r2 = r9
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.ads.uq3 r2 = r12.f41269e     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r8.mo35777c(r15, r2, r1)     // Catch:{ all -> 0x0079 }
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.cp3 r0 = r8.mo35776b(r13)     // Catch:{ all -> 0x0079 }
        L_0x0045:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo35778d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0079 }
            r0 = r11
            goto L_0x000a
        L_0x0052:
            r7.mo32281q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.mo32267c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.mo32280p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f41274j
        L_0x0064:
            int r15 = r12.f41275k
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.f41273i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m39561n(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x05c4
            r7.mo32278n(r13, r10)
            return
        L_0x0079:
            r14 = move-exception
            goto L_0x05c5
        L_0x007c:
            int r3 = r12.m39557j(r2)     // Catch:{ all -> 0x0079 }
            int r4 = m39556i(r3)     // Catch:{ vp3 -> 0x059e }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0388;
                case 27: goto L_0x0376;
                case 28: goto L_0x0368;
                case 29: goto L_0x035a;
                case 30: goto L_0x0345;
                case 31: goto L_0x0337;
                case 32: goto L_0x0329;
                case 33: goto L_0x031b;
                case 34: goto L_0x030d;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02f1;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02d5;
                case 39: goto L_0x02c7;
                case 40: goto L_0x02b9;
                case 41: goto L_0x02ab;
                case 42: goto L_0x029d;
                case 43: goto L_0x028f;
                case 44: goto L_0x027a;
                case 45: goto L_0x026c;
                case 46: goto L_0x025e;
                case 47: goto L_0x0250;
                case 48: goto L_0x0242;
                case 49: goto L_0x0230;
                case 50: goto L_0x01fa;
                case 51: goto L_0x01e8;
                case 52: goto L_0x01d6;
                case 53: goto L_0x01c4;
                case 54: goto L_0x01b2;
                case 55: goto L_0x01a0;
                case 56: goto L_0x018e;
                case 57: goto L_0x017c;
                case 58: goto L_0x016a;
                case 59: goto L_0x0162;
                case 60: goto L_0x0131;
                case 61: goto L_0x0123;
                case 62: goto L_0x0111;
                case 63: goto L_0x00ec;
                case 64: goto L_0x00da;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b6;
                case 67: goto L_0x00a4;
                case 68: goto L_0x0092;
                default: goto L_0x008a;
            }     // Catch:{ vp3 -> 0x059e }
        L_0x008a:
            if (r10 != 0) goto L_0x0581
            java.lang.Object r1 = r7.mo32270f()     // Catch:{ vp3 -> 0x059e }
            goto L_0x0580
        L_0x0092:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r5 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r5 = r14.mo32236m(r5, r15)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzn()     // Catch:{ vp3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x00b6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            int r5 = r14.zzi()     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x00c8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzm()     // Catch:{ vp3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x00da:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            int r5 = r14.zzh()     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x00ec:
            int r4 = r14.zze()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.op3 r6 = r12.m39559l(r2)     // Catch:{ vp3 -> 0x059e }
            if (r6 == 0) goto L_0x0103
            boolean r6 = r6.mo30325m(r4)     // Catch:{ vp3 -> 0x059e }
            if (r6 == 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            java.lang.Object r10 = com.google.android.gms.internal.ads.qr3.m36645d(r1, r4, r10, r7)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0103:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r5, r3)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0111:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            int r5 = r14.zzj()     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0123:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.eo3 r5 = r14.zzp()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0131:
            boolean r4 = r12.m39535A(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            if (r4 == 0) goto L_0x014d
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.qs3.m36724p(r13, r3)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r6 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r6 = r14.mo32233j(r6, r15)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.up3.m38381g(r5, r6)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            goto L_0x015d
        L_0x014d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r5 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r5 = r14.mo32233j(r5, r15)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
        L_0x015d:
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0162:
            r12.m39566s(r13, r3, r14)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x016a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            boolean r5 = r14.mo32231h()     // Catch:{ vp3 -> 0x059e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x017c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            int r5 = r14.zzf()     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x018e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzk()     // Catch:{ vp3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01a0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            int r5 = r14.zzg()     // Catch:{ vp3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzo()     // Catch:{ vp3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01c4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzl()     // Catch:{ vp3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01d6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            float r5 = r14.zzb()     // Catch:{ vp3 -> 0x059e }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01e8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ vp3 -> 0x059e }
            double r5 = r14.zza()     // Catch:{ vp3 -> 0x059e }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39568u(r13, r1, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x01fa:
            java.lang.Object r1 = r12.m39562o(r2)     // Catch:{ vp3 -> 0x059e }
            int r2 = r12.m39557j(r2)     // Catch:{ vp3 -> 0x059e }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r4 = com.google.android.gms.internal.ads.qs3.m36724p(r13, r2)     // Catch:{ vp3 -> 0x059e }
            if (r4 == 0) goto L_0x0220
            boolean r5 = com.google.android.gms.internal.ads.pq3.m36171b(r4)     // Catch:{ vp3 -> 0x059e }
            if (r5 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.oq3 r5 = com.google.android.gms.internal.ads.oq3.m35797b()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.oq3 r5 = r5.mo33983c()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.pq3.m36172c(r5, r4)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r2, r5)     // Catch:{ vp3 -> 0x059e }
            r4 = r5
            goto L_0x022b
        L_0x0220:
            com.google.android.gms.internal.ads.oq3 r4 = com.google.android.gms.internal.ads.oq3.m35797b()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.oq3 r4 = r4.mo33983c()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r2, r4)     // Catch:{ vp3 -> 0x059e }
        L_0x022b:
            com.google.android.gms.internal.ads.oq3 r4 = (com.google.android.gms.internal.ads.oq3) r4     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.nq3 r1 = (com.google.android.gms.internal.ads.nq3) r1     // Catch:{ vp3 -> 0x059e }
            throw r9     // Catch:{ vp3 -> 0x059e }
        L_0x0230:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r1 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.iq3 r2 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            java.util.List r2 = r2.mo31642a(r13, r3)     // Catch:{ vp3 -> 0x059e }
            r14.mo32230g(r2, r1, r15)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0242:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32239p(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0250:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32242s(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x025e:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32234k(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x026c:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32235l(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x027a:
            com.google.android.gms.internal.ads.iq3 r4 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ vp3 -> 0x059e }
            java.util.List r3 = r4.mo31642a(r13, r5)     // Catch:{ vp3 -> 0x059e }
            r14.mo32224a(r3)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.op3 r2 = r12.m39559l(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.qr3.m36644c(r1, r3, r2, r10, r7)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x028f:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32243t(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x029d:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32244u(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02ab:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32238o(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02b9:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32241r(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02c7:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32229f(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02d5:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32226c(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02e3:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32225b(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02f1:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32245v(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x02ff:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32227d(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x030d:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32239p(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x031b:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32242s(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32234k(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0337:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32235l(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0345:
            com.google.android.gms.internal.ads.iq3 r4 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ vp3 -> 0x059e }
            java.util.List r3 = r4.mo31642a(r13, r5)     // Catch:{ vp3 -> 0x059e }
            r14.mo32224a(r3)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.op3 r2 = r12.m39559l(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.qr3.m36644c(r1, r3, r2, r10, r7)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x035a:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32243t(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0368:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32228e(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0376:
            com.google.android.gms.internal.ads.or3 r1 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.iq3 r4 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            java.util.List r2 = r4.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32240q(r2, r1, r15)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0388:
            boolean r1 = m39570w(r3)     // Catch:{ vp3 -> 0x059e }
            if (r1 == 0) goto L_0x03a0
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.no3 r2 = (com.google.android.gms.internal.ads.no3) r2     // Catch:{ vp3 -> 0x059e }
            r3 = 1
            r2.mo33727w(r1, r3)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03a0:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.no3 r2 = (com.google.android.gms.internal.ads.no3) r2     // Catch:{ vp3 -> 0x059e }
            r3 = 0
            r2.mo33727w(r1, r3)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03b2:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32244u(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03c0:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32238o(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03ce:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32241r(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03dc:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32229f(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03ea:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32226c(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x03f8:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32225b(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0406:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32245v(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0414:
            com.google.android.gms.internal.ads.iq3 r1 = r12.f41276l     // Catch:{ vp3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ vp3 -> 0x059e }
            java.util.List r1 = r1.mo31642a(r13, r2)     // Catch:{ vp3 -> 0x059e }
            r14.mo32227d(r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0422:
            boolean r1 = r12.m39571x(r13, r2)     // Catch:{ vp3 -> 0x059e }
            if (r1 == 0) goto L_0x0440
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.qs3.m36724p(r13, r3)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r2 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r2 = r14.mo32236m(r2, r15)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.up3.m38381g(r1, r2)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0440:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r1 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = r14.mo32236m(r1, r15)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzn()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36703C(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            int r1 = r14.zzi()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0471:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzm()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36703C(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            int r1 = r14.zzh()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x048f:
            int r4 = r14.zze()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.op3 r6 = r12.m39559l(r2)     // Catch:{ vp3 -> 0x059e }
            if (r6 == 0) goto L_0x04a6
            boolean r6 = r6.mo30325m(r4)     // Catch:{ vp3 -> 0x059e }
            if (r6 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r10 = com.google.android.gms.internal.ads.qr3.m36645d(r1, r4, r10, r7)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x04a6:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r5, r4)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x04b1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            int r1 = r14.zzj()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x04c0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.eo3 r1 = r14.zzp()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x04cf:
            boolean r1 = r12.m39571x(r13, r2)     // Catch:{ vp3 -> 0x059e }
            if (r1 == 0) goto L_0x04ed
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.qs3.m36724p(r13, r3)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r2 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r2 = r14.mo32233j(r2, r15)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.up3.m38381g(r1, r2)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x04ed:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.or3 r1 = r12.m39560m(r2)     // Catch:{ vp3 -> 0x059e }
            java.lang.Object r1 = r14.mo32233j(r1, r15)     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36704D(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0500:
            r12.m39566s(r13, r3, r14)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0508:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            boolean r1 = r14.mo32231h()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36732x(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0517:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            int r1 = r14.zzf()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0526:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzk()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36703C(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0535:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            int r1 = r14.zzg()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36702B(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0544:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzo()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36703C(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0553:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            long r5 = r14.zzl()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36703C(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0562:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            float r1 = r14.zzb()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36701A(r13, r3, r1)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0571:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ vp3 -> 0x059e }
            double r5 = r14.zza()     // Catch:{ vp3 -> 0x059e }
            com.google.android.gms.internal.ads.qs3.m36734z(r13, r3, r5)     // Catch:{ vp3 -> 0x059e }
            r12.m39567t(r13, r2)     // Catch:{ vp3 -> 0x059e }
            goto L_0x000a
        L_0x0580:
            r10 = r1
        L_0x0581:
            boolean r1 = r7.mo32280p(r10, r14)     // Catch:{ vp3 -> 0x059e }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f41274j
        L_0x0589:
            int r15 = r12.f41275k
            if (r14 >= r15) goto L_0x0598
            int[] r15 = r12.f41273i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m39561n(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0589
        L_0x0598:
            if (r10 == 0) goto L_0x05c4
            r7.mo32278n(r13, r10)
            return
        L_0x059e:
            r7.mo32281q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x05a8
            java.lang.Object r1 = r7.mo32267c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x05a8:
            boolean r1 = r7.mo32280p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f41274j
        L_0x05b0:
            int r15 = r12.f41275k
            if (r14 >= r15) goto L_0x05bf
            int[] r15 = r12.f41273i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m39561n(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b0
        L_0x05bf:
            if (r10 == 0) goto L_0x05c4
            r7.mo32278n(r13, r10)
        L_0x05c4:
            return
        L_0x05c5:
            int r15 = r12.f41274j
        L_0x05c7:
            int r0 = r12.f41275k
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.f41273i
            r0 = r0[r15]
            java.lang.Object r10 = r12.m39561n(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r7.mo32278n(r13, r10)
        L_0x05db:
            goto L_0x05dd
        L_0x05dc:
            throw r14
        L_0x05dd:
            goto L_0x05dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.mo33999e(java.lang.Object, com.google.android.gms.internal.ads.gr3, com.google.android.gms.internal.ads.wo3):void");
    }

    /* renamed from: f */
    public final void mo34000f(T t, so3 so3) throws IOException {
        if (!this.f41272h) {
            m39537C(t, so3);
        } else if (!this.f41270f) {
            int length = this.f41265a.length;
            for (int i = 0; i < length; i += 3) {
                int j = m39557j(i);
                int i2 = this.f41265a[i];
                switch (m39556i(j)) {
                    case 0:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34759q(i2, qs3.m36718j(t, (long) (j & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34768z(i2, qs3.m36719k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34737E(i2, qs3.m36722n(t, (long) (j & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34753j(i2, qs3.m36722n(t, (long) (j & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34735C(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34766x(i2, qs3.m36722n(t, (long) (j & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34764v(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34755m(i2, qs3.m36708H(t, (long) (j & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            m39539E(i2, qs3.m36724p(t, (long) (j & 1048575)), so3);
                            break;
                        }
                    case 9:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34739G(i2, qs3.m36724p(t, (long) (j & 1048575)), m39560m(i));
                            break;
                        }
                    case 10:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34757o(i2, (eo3) qs3.m36724p(t, (long) (j & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34751h(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34762t(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34740H(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34742J(i2, qs3.m36722n(t, (long) (j & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34744a(i2, qs3.m36720l(t, (long) (j & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34746c(i2, qs3.m36722n(t, (long) (j & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m39571x(t, i)) {
                            break;
                        } else {
                            so3.mo34734B(i2, qs3.m36724p(t, (long) (j & 1048575)), m39560m(i));
                            break;
                        }
                    case 18:
                        qr3.m36653l(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 19:
                        qr3.m36657p(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 20:
                        qr3.m36660s(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 21:
                        qr3.m36615B(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 22:
                        qr3.m36659r(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 23:
                        qr3.m36656o(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 24:
                        qr3.m36655n(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 25:
                        qr3.m36651j(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 26:
                        qr3.m36666y(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3);
                        break;
                    case 27:
                        qr3.m36661t(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, m39560m(i));
                        break;
                    case 28:
                        qr3.m36652k(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3);
                        break;
                    case 29:
                        qr3.m36667z(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 30:
                        qr3.m36654m(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 31:
                        qr3.m36662u(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 32:
                        qr3.m36663v(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 33:
                        qr3.m36664w(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 34:
                        qr3.m36665x(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, false);
                        break;
                    case 35:
                        qr3.m36653l(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 36:
                        qr3.m36657p(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 37:
                        qr3.m36660s(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 38:
                        qr3.m36615B(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 39:
                        qr3.m36659r(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 40:
                        qr3.m36656o(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 41:
                        qr3.m36655n(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 42:
                        qr3.m36651j(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 43:
                        qr3.m36667z(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 44:
                        qr3.m36654m(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 45:
                        qr3.m36662u(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 46:
                        qr3.m36663v(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 47:
                        qr3.m36664w(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 48:
                        qr3.m36665x(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, true);
                        break;
                    case 49:
                        qr3.m36658q(this.f41265a[i], (List) qs3.m36724p(t, (long) (j & 1048575)), so3, m39560m(i));
                        break;
                    case 50:
                        m39538D(so3, i2, qs3.m36724p(t, (long) (j & 1048575)), i);
                        break;
                    case 51:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34759q(i2, m39543J(t, (long) (j & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34768z(i2, m39544K(t, (long) (j & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34737E(i2, m39558k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34753j(i2, m39558k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34735C(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34766x(i2, m39558k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34764v(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34755m(i2, m39536B(t, (long) (j & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            m39539E(i2, qs3.m36724p(t, (long) (j & 1048575)), so3);
                            break;
                        }
                    case 60:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34739G(i2, qs3.m36724p(t, (long) (j & 1048575)), m39560m(i));
                            break;
                        }
                    case 61:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34757o(i2, (eo3) qs3.m36724p(t, (long) (j & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34751h(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34762t(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34740H(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34742J(i2, m39558k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34744a(i2, m39547N(t, (long) (j & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34746c(i2, m39558k(t, (long) (j & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m39535A(t, i2, i)) {
                            break;
                        } else {
                            so3.mo34734B(i2, qs3.m36724p(t, (long) (j & 1048575)), m39560m(i));
                            break;
                        }
                }
            }
            gs3<?, ?> gs3 = this.f41277m;
            gs3.mo32282r(gs3.mo32268d(t), so3);
        } else {
            this.f41278n.mo35775a(t);
            throw null;
        }
    }

    /* renamed from: g */
    public final void mo34001g(T t, byte[] bArr, int i, int i2, on3 on3) throws IOException {
        if (this.f41272h) {
            m39550Q(t, bArr, i, i2, on3);
        } else {
            mo35788F(t, bArr, i, i2, 0, on3);
        }
    }

    /* renamed from: h */
    public final boolean mo34002h(T t, T t2) {
        boolean z;
        int length = this.f41265a.length;
        for (int i = 0; i < length; i += 3) {
            int j = m39557j(i);
            long j2 = (long) (j & 1048575);
            switch (m39556i(j)) {
                case 0:
                    if (m39569v(t, t2, i) && Double.doubleToLongBits(qs3.m36718j(t, j2)) == Double.doubleToLongBits(qs3.m36718j(t2, j2))) {
                        continue;
                    }
                case 1:
                    if (m39569v(t, t2, i) && Float.floatToIntBits(qs3.m36719k(t, j2)) == Float.floatToIntBits(qs3.m36719k(t2, j2))) {
                        continue;
                    }
                case 2:
                    if (m39569v(t, t2, i) && qs3.m36722n(t, j2) == qs3.m36722n(t2, j2)) {
                        continue;
                    }
                case 3:
                    if (m39569v(t, t2, i) && qs3.m36722n(t, j2) == qs3.m36722n(t2, j2)) {
                        continue;
                    }
                case 4:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 5:
                    if (m39569v(t, t2, i) && qs3.m36722n(t, j2) == qs3.m36722n(t2, j2)) {
                        continue;
                    }
                case 6:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 7:
                    if (m39569v(t, t2, i) && qs3.m36708H(t, j2) == qs3.m36708H(t2, j2)) {
                        continue;
                    }
                case 8:
                    if (m39569v(t, t2, i) && qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2))) {
                        continue;
                    }
                case 9:
                    if (m39569v(t, t2, i) && qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2))) {
                        continue;
                    }
                case 10:
                    if (m39569v(t, t2, i) && qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2))) {
                        continue;
                    }
                case 11:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 12:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 13:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 14:
                    if (m39569v(t, t2, i) && qs3.m36722n(t, j2) == qs3.m36722n(t2, j2)) {
                        continue;
                    }
                case 15:
                    if (m39569v(t, t2, i) && qs3.m36720l(t, j2) == qs3.m36720l(t2, j2)) {
                        continue;
                    }
                case 16:
                    if (m39569v(t, t2, i) && qs3.m36722n(t, j2) == qs3.m36722n(t2, j2)) {
                        continue;
                    }
                case 17:
                    if (m39569v(t, t2, i) && qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2))) {
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
                    z = qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2));
                    break;
                case 50:
                    z = qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2));
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
                    long U = (long) (m39554U(i) & 1048575);
                    if (qs3.m36720l(t, U) == qs3.m36720l(t2, U) && qr3.m36649h(qs3.m36724p(t, j2), qs3.m36724p(t2, j2))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f41277m.mo32268d(t).equals(this.f41277m.mo32268d(t2))) {
            return false;
        }
        if (!this.f41270f) {
            return true;
        }
        this.f41278n.mo35775a(t);
        this.f41278n.mo35775a(t2);
        throw null;
    }

    public final int zza(T t) {
        return this.f41272h ? m39546M(t) : m39545L(t);
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
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f41265a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m39557j(r1)
            int[] r4 = r8.f41265a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m39556i(r3)
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
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m39558k(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m39558k(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m39536B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38375a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m39558k(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m39547N(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m39558k(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m39558k(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m39544K(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m39535A(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m39543J(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.qs3.m36722n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.qs3.m36722n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.qs3.m36724p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.qs3.m36708H(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38375a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.qs3.m36722n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.qs3.m36720l(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.qs3.m36722n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.qs3.m36722n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.qs3.m36719k(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.qs3.m36718j(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.up3.m38377c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.gs3<?, ?> r0 = r8.f41277m
            java.lang.Object r0 = r0.mo32268d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f41270f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.ads.xo3<?> r0 = r8.f41278n
            r0.mo35775a(r9)
            r9 = 0
            goto L_0x0245
        L_0x0244:
            throw r9
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq3.zzb(java.lang.Object):int");
    }

    public final T zze() {
        return ((kp3) this.f41269e).mo30379D(4, (Object) null, (Object) null);
    }
}
