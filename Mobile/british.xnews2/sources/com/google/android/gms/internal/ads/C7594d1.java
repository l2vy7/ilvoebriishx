package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7594d1 implements vb4, wc4 {

    /* renamed from: x */
    public static final cc4 f30534x = C7488a1.f29489b;

    /* renamed from: a */
    private final uq2 f30535a = new uq2(kh2.f34333a);

    /* renamed from: b */
    private final uq2 f30536b = new uq2(4);

    /* renamed from: c */
    private final uq2 f30537c = new uq2();

    /* renamed from: d */
    private final uq2 f30538d = new uq2(16);

    /* renamed from: e */
    private final ArrayDeque<C7777i0> f30539e = new ArrayDeque<>();

    /* renamed from: f */
    private final C7704g1 f30540f = new C7704g1();

    /* renamed from: g */
    private final List<zzdc> f30541g = new ArrayList();

    /* renamed from: h */
    private int f30542h = 0;

    /* renamed from: i */
    private int f30543i;

    /* renamed from: j */
    private long f30544j;

    /* renamed from: k */
    private int f30545k;

    /* renamed from: l */
    private uq2 f30546l;

    /* renamed from: m */
    private int f30547m = -1;

    /* renamed from: n */
    private int f30548n;

    /* renamed from: o */
    private int f30549o;

    /* renamed from: p */
    private int f30550p;

    /* renamed from: q */
    private yb4 f30551q;

    /* renamed from: r */
    private C7559c1[] f30552r;

    /* renamed from: s */
    private long[][] f30553s;

    /* renamed from: t */
    private int f30554t;

    /* renamed from: u */
    private long f30555u;

    /* renamed from: v */
    private int f30556v;

    /* renamed from: w */
    private zzaak f30557w;

    public C7594d1(int i) {
    }

    /* renamed from: g */
    private static int m31176g(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: h */
    private static int m31177h(C7888l1 l1Var, long j) {
        int a = l1Var.mo33225a(j);
        return a == -1 ? l1Var.mo33226b(j) : a;
    }

    /* renamed from: i */
    private static long m31178i(C7888l1 l1Var, long j, long j2) {
        int h = m31177h(l1Var, j);
        if (h == -1) {
            return j2;
        }
        return Math.min(l1Var.f34777c[h], j2);
    }

    /* renamed from: j */
    private final void m31179j() {
        this.f30542h = 0;
        this.f30545k = 0;
    }

    /* renamed from: k */
    private final void m31180k(long j) throws C7811iy {
        C7594d1 d1Var;
        zzdd zzdd;
        zzdd zzdd2;
        long j2;
        int i;
        List<C7888l1> list;
        C7594d1 d1Var2;
        zzdd zzdd3;
        char c;
        int i2;
        C7594d1 d1Var3 = this;
        while (!d1Var3.f30539e.isEmpty() && d1Var3.f30539e.peek().f33005b == j) {
            C7777i0 pop = d1Var3.f30539e.pop();
            if (pop.f34088a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = d1Var3.f30556v == 1;
                mc4 mc4 = new mc4();
                C7814j0 d = pop.mo32508d(Atom.TYPE_udta);
                if (d != null) {
                    Pair<zzdd, zzdd> a = C8105r0.m36830a(d);
                    zzdd zzdd4 = (zzdd) a.first;
                    zzdd zzdd5 = (zzdd) a.second;
                    if (zzdd4 != null) {
                        mc4.mo33528b(zzdd4);
                    }
                    zzdd2 = zzdd5;
                    zzdd = zzdd4;
                } else {
                    zzdd2 = null;
                    zzdd = null;
                }
                C7777i0 c2 = pop.mo32507c(Atom.TYPE_meta);
                zzdd b = c2 != null ? C8105r0.m36831b(c2) : null;
                List<C7888l1> c3 = C8105r0.m36832c(pop, mc4, C6540C.TIME_UNSET, (zzs) null, false, z, C7524b1.f29860a);
                yb4 yb4 = d1Var3.f30551q;
                Objects.requireNonNull(yb4);
                int size = c3.size();
                long j3 = C6540C.TIME_UNSET;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    C7888l1 l1Var = c3.get(i3);
                    if (l1Var.f34776b == 0) {
                        d1Var2 = d1Var3;
                        list = c3;
                        i = size;
                    } else {
                        C7778i1 i1Var = l1Var.f34775a;
                        ArrayList arrayList2 = arrayList;
                        long j5 = i1Var.f33020e;
                        if (j5 == j3) {
                            j5 = l1Var.f34782h;
                        }
                        long max = Math.max(j4, j5);
                        C7559c1 c1Var = new C7559c1(i1Var, l1Var, yb4.mo18211m(i3, i1Var.f33017b));
                        int i5 = l1Var.f34779e;
                        list = c3;
                        ge4 b2 = i1Var.f33021f.mo35521b();
                        b2.mo32086l(i5 + 30);
                        i = size;
                        if (i1Var.f33017b == 2 && j5 > 0 && (i2 = l1Var.f34776b) > 1) {
                            b2.mo32075e(((float) i2) / (((float) j5) / 1000000.0f));
                        }
                        int i6 = i1Var.f33017b;
                        int i7 = C8389z0.f42249b;
                        if (i6 == 1 && mc4.mo33527a()) {
                            b2.mo32071c(mc4.f35496a);
                            b2.mo32073d(mc4.f35497b);
                        }
                        int i8 = i1Var.f33017b;
                        zzdd[] zzddArr = new zzdd[2];
                        zzddArr[0] = zzdd2;
                        d1Var2 = this;
                        if (d1Var2.f30541g.isEmpty()) {
                            c = 1;
                            zzdd3 = null;
                        } else {
                            zzdd3 = new zzdd((List<? extends zzdc>) d1Var2.f30541g);
                            c = 1;
                        }
                        zzddArr[c] = zzdd3;
                        long j6 = max;
                        zzdd zzdd6 = new zzdd(new zzdc[0]);
                        if (i8 == 1) {
                            if (zzdd != null) {
                                zzdd6 = zzdd;
                            }
                        } else if (i8 == 2 && b != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= b.mo36273a()) {
                                    break;
                                }
                                zzdc b3 = b.mo36274b(i9);
                                if (b3 instanceof zzaah) {
                                    zzaah zzaah = (zzaah) b3;
                                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(zzaah.f42851b)) {
                                        zzdd6 = new zzdd(zzaah);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzdd6 = zzdd6.mo36277e(zzddArr[i10]);
                        }
                        if (zzdd6.mo36273a() > 0) {
                            b2.mo32087m(zzdd6);
                        }
                        c1Var.f30198c.mo30354a(b2.mo32099y());
                        if (i1Var.f33017b == 2) {
                            if (i4 == -1) {
                                i4 = arrayList2.size();
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(c1Var);
                        j4 = j6;
                    }
                    i3++;
                    d1Var3 = d1Var2;
                    c3 = list;
                    size = i;
                    j3 = C6540C.TIME_UNSET;
                }
                d1Var = d1Var3;
                d1Var.f30554t = i4;
                d1Var.f30555u = j4;
                C7559c1[] c1VarArr = (C7559c1[]) arrayList.toArray(new C7559c1[0]);
                d1Var.f30552r = c1VarArr;
                int length = c1VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < c1VarArr.length; i11++) {
                    jArr[i11] = new long[c1VarArr[i11].f30197b.f34776b];
                    jArr2[i11] = c1VarArr[i11].f30197b.f34780f[0];
                }
                int i12 = 0;
                while (i12 < c1VarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < c1VarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    C7888l1 l1Var2 = c1VarArr[i13].f30197b;
                    j2 += (long) l1Var2.f34778d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = l1Var2.f34780f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                d1Var.f30553s = jArr;
                yb4.zzB();
                yb4.mo18210l(d1Var);
                d1Var.f30539e.clear();
                d1Var.f30542h = 2;
            } else {
                d1Var = d1Var3;
                if (!d1Var.f30539e.isEmpty()) {
                    d1Var.f30539e.peek().mo32509e(pop);
                }
            }
            d1Var3 = d1Var;
        }
        if (d1Var3.f30542h != 2) {
            m31179j();
        }
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return C7740h1.m32776b(wb4, false);
    }

    /* renamed from: b */
    public final uc4 mo30269b(long j) {
        long j2;
        long j3;
        int b;
        C7559c1[] c1VarArr = this.f30552r;
        Objects.requireNonNull(c1VarArr);
        if (c1VarArr.length == 0) {
            xc4 xc4 = xc4.f41130c;
            return new uc4(xc4, xc4);
        }
        int i = this.f30554t;
        long j4 = -1;
        if (i != -1) {
            C7888l1 l1Var = c1VarArr[i].f30197b;
            int h = m31177h(l1Var, j);
            if (h == -1) {
                xc4 xc42 = xc4.f41130c;
                return new uc4(xc42, xc42);
            }
            long j5 = l1Var.f34780f[h];
            j2 = l1Var.f34777c[h];
            if (j5 >= j || h >= l1Var.f34776b - 1 || (b = l1Var.mo33226b(j)) == -1 || b == h) {
                j3 = -9223372036854775807L;
            } else {
                j3 = l1Var.f34780f[b];
                j4 = l1Var.f34777c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C7559c1[] c1VarArr2 = this.f30552r;
            if (i2 >= c1VarArr2.length) {
                break;
            }
            if (i2 != this.f30554t) {
                C7888l1 l1Var2 = c1VarArr2[i2].f30197b;
                long i3 = m31178i(l1Var2, j, j2);
                if (j3 != C6540C.TIME_UNSET) {
                    j4 = m31178i(l1Var2, j3, j4);
                }
                j2 = i3;
            }
            i2++;
        }
        xc4 xc43 = new xc4(j, j2);
        if (j3 == C6540C.TIME_UNSET) {
            return new uc4(xc43, xc43);
        }
        return new uc4(xc43, new xc4(j3, j4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x0089 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r33, com.google.android.gms.internal.ads.tc4 r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f30542h
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0234
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01b8
            long r16 = r33.zze()
            int r3 = r0.f30547m
            if (r3 != r8) goto L_0x00a4
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r20 = r18
            r22 = r20
            r25 = r22
            r3 = 0
            r5 = -1
            r9 = 1
            r24 = 1
            r27 = -1
        L_0x0032:
            com.google.android.gms.internal.ads.c1[] r4 = r0.f30552r
            java.lang.Object r4 = com.google.android.gms.internal.ads.d13.m20300c(r4)
            com.google.android.gms.internal.ads.c1[] r4 = (com.google.android.gms.internal.ads.C7559c1[]) r4
            int r4 = r4.length
            if (r3 >= r4) goto L_0x008c
            com.google.android.gms.internal.ads.c1[] r4 = r0.f30552r
            r4 = r4[r3]
            int r15 = r4.f30199d
            com.google.android.gms.internal.ads.l1 r4 = r4.f30197b
            int r12 = r4.f34776b
            if (r15 != r12) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            long[] r4 = r4.f34777c
            r28 = r4[r15]
            long[][] r4 = r0.f30553s
            java.lang.Object r4 = com.google.android.gms.internal.ads.d13.m20300c(r4)
            long[][] r4 = (long[][]) r4
            r4 = r4[r3]
            r30 = r4[r15]
            long r28 = r28 - r16
            int r4 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0067
            int r4 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            if (r4 != 0) goto L_0x006e
            if (r24 != 0) goto L_0x0076
            r12 = 0
            goto L_0x0070
        L_0x006e:
            r12 = r24
        L_0x0070:
            if (r4 != r12) goto L_0x007e
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x007e
        L_0x0076:
            r5 = r3
            r24 = r4
            r22 = r28
            r25 = r30
            goto L_0x0080
        L_0x007e:
            r24 = r12
        L_0x0080:
            int r12 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            r27 = r3
            r9 = r4
            r20 = r30
        L_0x0089:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x008c:
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x009e
            if (r9 == 0) goto L_0x009e
            r3 = 10485760(0xa00000, double:5.180654E-317)
            long r20 = r20 + r3
            int r3 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r5 = r27
        L_0x009e:
            r0.f30547m = r5
            if (r5 != r8) goto L_0x00a4
            goto L_0x01b7
        L_0x00a4:
            com.google.android.gms.internal.ads.c1[] r3 = r0.f30552r
            java.lang.Object r3 = com.google.android.gms.internal.ads.d13.m20300c(r3)
            com.google.android.gms.internal.ads.c1[] r3 = (com.google.android.gms.internal.ads.C7559c1[]) r3
            int r4 = r0.f30547m
            r3 = r3[r4]
            com.google.android.gms.internal.ads.ad4 r4 = r3.f30198c
            int r5 = r3.f30199d
            com.google.android.gms.internal.ads.l1 r9 = r3.f30197b
            long[] r12 = r9.f34777c
            r11 = r12[r5]
            int[] r9 = r9.f34778d
            r9 = r9[r5]
            long r16 = r11 - r16
            int r15 = r0.f30548n
            r19 = r9
            long r8 = (long) r15
            long r16 = r16 + r8
            int r8 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x01b4
            int r6 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00d1
            goto L_0x01b4
        L_0x00d1:
            com.google.android.gms.internal.ads.i1 r2 = r3.f30196a
            int r2 = r2.f33022g
            if (r2 != r10) goto L_0x00e0
            r6 = 8
            long r16 = r16 + r6
            int r9 = r19 + -8
            r6 = r16
            goto L_0x00e4
        L_0x00e0:
            r6 = r16
            r9 = r19
        L_0x00e4:
            int r2 = (int) r6
            r1.mo33309c(r2)
            com.google.android.gms.internal.ads.i1 r2 = r3.f30196a
            int r6 = r2.f33025j
            if (r6 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.uq2 r2 = r0.f30536b
            byte[] r2 = r2.mo35238h()
            r6 = 0
            r2[r6] = r6
            r2[r10] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.i1 r6 = r3.f30196a
            int r6 = r6.f33025j
            int r7 = 4 - r6
        L_0x0102:
            int r8 = r0.f30549o
            if (r8 >= r9) goto L_0x018e
            int r8 = r0.f30550p
            if (r8 != 0) goto L_0x013c
            r1.mo33312f(r2, r7, r6)
            int r8 = r0.f30548n
            int r8 = r8 + r6
            r0.f30548n = r8
            com.google.android.gms.internal.ads.uq2 r8 = r0.f30536b
            r11 = 0
            r8.mo35236f(r11)
            com.google.android.gms.internal.ads.uq2 r8 = r0.f30536b
            int r8 = r8.mo35243m()
            if (r8 < 0) goto L_0x0134
            r0.f30550p = r8
            com.google.android.gms.internal.ads.uq2 r8 = r0.f30535a
            r8.mo35236f(r11)
            com.google.android.gms.internal.ads.uq2 r8 = r0.f30535a
            r12 = 4
            com.google.android.gms.internal.ads.yc4.m39857b(r4, r8, r12)
            int r8 = r0.f30549o
            int r8 = r8 + r12
            r0.f30549o = r8
            int r9 = r9 + r7
            goto L_0x0102
        L_0x0134:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33482a(r1, r2)
            throw r1
        L_0x013c:
            r11 = 0
            int r8 = com.google.android.gms.internal.ads.yc4.m39856a(r4, r1, r8, r11)
            int r11 = r0.f30548n
            int r11 = r11 + r8
            r0.f30548n = r11
            int r11 = r0.f30549o
            int r11 = r11 + r8
            r0.f30549o = r11
            int r11 = r0.f30550p
            int r11 = r11 - r8
            r0.f30550p = r11
            goto L_0x0102
        L_0x0151:
            com.google.android.gms.internal.ads.w r2 = r2.f33021f
            java.lang.String r2 = r2.f40619l
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0173
            int r2 = r0.f30549o
            if (r2 != 0) goto L_0x0171
            com.google.android.gms.internal.ads.uq2 r2 = r0.f30537c
            com.google.android.gms.internal.ads.db4.m31346b(r9, r2)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f30537c
            r6 = 7
            com.google.android.gms.internal.ads.yc4.m39857b(r4, r2, r6)
            int r2 = r0.f30549o
            int r2 = r2 + r6
            r0.f30549o = r2
        L_0x0171:
            int r9 = r9 + 7
        L_0x0173:
            int r2 = r0.f30549o
            if (r2 >= r9) goto L_0x018e
            int r2 = r9 - r2
            r6 = 0
            int r2 = com.google.android.gms.internal.ads.yc4.m39856a(r4, r1, r2, r6)
            int r6 = r0.f30548n
            int r6 = r6 + r2
            r0.f30548n = r6
            int r6 = r0.f30549o
            int r6 = r6 + r2
            r0.f30549o = r6
            int r6 = r0.f30550p
            int r6 = r6 - r2
            r0.f30550p = r6
            goto L_0x0173
        L_0x018e:
            r22 = r9
            com.google.android.gms.internal.ads.l1 r1 = r3.f30197b
            long[] r2 = r1.f34780f
            r19 = r2[r5]
            int[] r1 = r1.f34781g
            r21 = r1[r5]
            r23 = 0
            r24 = 0
            r18 = r4
            r18.mo30358e(r19, r21, r22, r23, r24)
            int r1 = r3.f30199d
            int r1 = r1 + r10
            r3.f30199d = r1
            r1 = -1
            r0.f30547m = r1
            r1 = 0
            r0.f30548n = r1
            r0.f30549o = r1
            r0.f30550p = r1
            r8 = 0
            goto L_0x01b7
        L_0x01b4:
            r2.f39386a = r11
            r8 = 1
        L_0x01b7:
            return r8
        L_0x01b8:
            long r3 = r0.f30544j
            int r6 = r0.f30545k
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r33.zze()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.uq2 r8 = r0.f30546l
            if (r8 == 0) goto L_0x0217
            byte[] r11 = r8.mo35238h()
            int r12 = r0.f30545k
            int r4 = (int) r3
            r1.mo33312f(r11, r12, r4)
            int r3 = r0.f30543i
            if (r3 != r5) goto L_0x01fc
            r8.mo35236f(r9)
            int r3 = r8.mo35243m()
            int r3 = m31176g(r3)
            if (r3 == 0) goto L_0x01e3
            goto L_0x01f9
        L_0x01e3:
            r3 = 4
            r8.mo35237g(r3)
        L_0x01e7:
            int r3 = r8.mo35239i()
            if (r3 <= 0) goto L_0x01f8
            int r3 = r8.mo35243m()
            int r3 = m31176g(r3)
            if (r3 == 0) goto L_0x01e7
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            r0.f30556v = r3
            goto L_0x021f
        L_0x01fc:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r3 = r0.f30539e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x021f
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r3 = r0.f30539e
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.i0 r3 = (com.google.android.gms.internal.ads.C7777i0) r3
            com.google.android.gms.internal.ads.j0 r4 = new com.google.android.gms.internal.ads.j0
            int r5 = r0.f30543i
            r4.<init>(r5, r8)
            r3.mo32510f(r4)
            goto L_0x021f
        L_0x0217:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0221
            int r4 = (int) r3
            r1.mo33309c(r4)
        L_0x021f:
            r11 = 0
            goto L_0x0229
        L_0x0221:
            long r8 = r33.zze()
            long r8 = r8 + r3
            r2.f39386a = r8
            r11 = 1
        L_0x0229:
            r0.m31180k(r6)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f30542h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            return r10
        L_0x0234:
            int r3 = r0.f30545k
            if (r3 != 0) goto L_0x025e
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            byte[] r3 = r3.mo35238h()
            r4 = 0
            boolean r3 = r1.mo33310d(r3, r4, r9, r10)
            if (r3 != 0) goto L_0x0247
            r3 = -1
            return r3
        L_0x0247:
            r0.f30545k = r9
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            r3.mo35236f(r4)
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            long r3 = r3.mo35223A()
            r0.f30544j = r3
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            int r3 = r3.mo35243m()
            r0.f30543i = r3
        L_0x025e:
            long r3 = r0.f30544j
            r11 = 1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x027d
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            byte[] r3 = r3.mo35238h()
            r1.mo33312f(r3, r9, r9)
            int r3 = r0.f30545k
            int r3 = r3 + r9
            r0.f30545k = r3
            com.google.android.gms.internal.ads.uq2 r3 = r0.f30538d
            long r3 = r3.mo35224B()
            r0.f30544j = r3
            goto L_0x02a6
        L_0x027d:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x02a6
            long r3 = r33.zzc()
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0297
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r8 = r0.f30539e
            java.lang.Object r8 = r8.peek()
            com.google.android.gms.internal.ads.i0 r8 = (com.google.android.gms.internal.ads.C7777i0) r8
            if (r8 == 0) goto L_0x0297
            long r3 = r8.f33005b
        L_0x0297:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x02a6
            long r6 = r33.zze()
            long r3 = r3 - r6
            int r6 = r0.f30545k
            long r6 = (long) r6
            long r3 = r3 + r6
            r0.f30544j = r3
        L_0x02a6:
            long r3 = r0.f30544j
            int r6 = r0.f30545k
            long r7 = (long) r6
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x03df
            int r3 = r0.f30543i
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r4) goto L_0x038d
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r4) goto L_0x038d
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r4) goto L_0x038d
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r4) goto L_0x038d
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r4) goto L_0x038d
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r4) goto L_0x038d
            if (r3 != r7) goto L_0x02d6
            goto L_0x038d
        L_0x02d6:
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r4) goto L_0x035a
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r4) goto L_0x035a
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r4) goto L_0x035a
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r4) goto L_0x035a
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r4) goto L_0x035a
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r4) goto L_0x035a
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r4) goto L_0x035a
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r4) goto L_0x035a
            if (r3 == r5) goto L_0x035a
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r3 == r4) goto L_0x035a
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r3 == r4) goto L_0x035a
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r3 != r4) goto L_0x032e
            goto L_0x035a
        L_0x032e:
            long r3 = r33.zze()
            int r5 = r0.f30545k
            long r5 = (long) r5
            long r14 = r3 - r5
            int r3 = r0.f30543i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0353
            com.google.android.gms.internal.ads.zzaak r3 = new com.google.android.gms.internal.ads.zzaak
            r12 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = r14 + r5
            long r7 = r0.f30544j
            long r20 = r7 - r5
            r11 = r3
            r11.<init>(r12, r14, r16, r18, r20)
            r0.f30557w = r3
        L_0x0353:
            r3 = 0
            r0.f30546l = r3
            r0.f30542h = r10
            goto L_0x0006
        L_0x035a:
            if (r6 != r9) goto L_0x035e
            r3 = 1
            goto L_0x035f
        L_0x035e:
            r3 = 0
        L_0x035f:
            com.google.android.gms.internal.ads.nu1.m20747f(r3)
            long r3 = r0.f30544j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x036d
            r3 = 1
            goto L_0x036e
        L_0x036d:
            r3 = 0
        L_0x036e:
            com.google.android.gms.internal.ads.nu1.m20747f(r3)
            com.google.android.gms.internal.ads.uq2 r3 = new com.google.android.gms.internal.ads.uq2
            long r4 = r0.f30544j
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.uq2 r4 = r0.f30538d
            byte[] r4 = r4.mo35238h()
            byte[] r5 = r3.mo35238h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.f30546l = r3
            r0.f30542h = r10
            goto L_0x0006
        L_0x038d:
            long r3 = r33.zze()
            long r5 = r0.f30544j
            int r8 = r0.f30545k
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03c0
            int r5 = r0.f30543i
            if (r5 != r7) goto L_0x03c0
            com.google.android.gms.internal.ads.uq2 r5 = r0.f30537c
            r5.mo35233c(r9)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f30537c
            byte[] r5 = r5.mo35238h()
            r6 = 0
            r1.mo33313g(r5, r6, r9)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f30537c
            com.google.android.gms.internal.ads.C8105r0.m36833d(r5)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f30537c
            int r5 = r5.mo35241k()
            r1.mo33309c(r5)
            r33.zzj()
        L_0x03c0:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r5 = r0.f30539e
            com.google.android.gms.internal.ads.i0 r6 = new com.google.android.gms.internal.ads.i0
            int r7 = r0.f30543i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f30544j
            int r7 = r0.f30545k
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03da
            r0.m31180k(r3)
            goto L_0x0006
        L_0x03da:
            r32.m31179j()
            goto L_0x0006
        L_0x03df:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.iy r1 = com.google.android.gms.internal.ads.C7811iy.m33484c(r1)
            goto L_0x03e7
        L_0x03e6:
            throw r1
        L_0x03e7:
            goto L_0x03e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7594d1.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f30551q = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f30539e.clear();
        this.f30545k = 0;
        this.f30547m = -1;
        this.f30548n = 0;
        this.f30549o = 0;
        this.f30550p = 0;
        if (j == 0) {
            m31179j();
            return;
        }
        C7559c1[] c1VarArr = this.f30552r;
        if (c1VarArr != null) {
            for (C7559c1 c1Var : c1VarArr) {
                C7888l1 l1Var = c1Var.f30197b;
                int a = l1Var.mo33225a(j2);
                if (a == -1) {
                    a = l1Var.mo33226b(j2);
                }
                c1Var.f30199d = a;
            }
        }
    }

    public final long zze() {
        return this.f30555u;
    }

    public final boolean zzh() {
        return true;
    }
}
