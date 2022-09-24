package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ui */
/* compiled from: IMASDK */
public final class C4394ui implements C4306rb, C4324rt {

    /* renamed from: a */
    public static final /* synthetic */ int f19017a = 0;

    /* renamed from: b */
    private final alw f19018b;

    /* renamed from: c */
    private final alw f19019c;

    /* renamed from: d */
    private final alw f19020d;

    /* renamed from: e */
    private final alw f19021e;

    /* renamed from: f */
    private final ArrayDeque<C4373to> f19022f;

    /* renamed from: g */
    private final List<C4506ym> f19023g;

    /* renamed from: h */
    private int f19024h;

    /* renamed from: i */
    private int f19025i;

    /* renamed from: j */
    private long f19026j;

    /* renamed from: k */
    private int f19027k;

    /* renamed from: l */
    private alw f19028l;

    /* renamed from: m */
    private int f19029m;

    /* renamed from: n */
    private int f19030n;

    /* renamed from: o */
    private int f19031o;

    /* renamed from: p */
    private int f19032p;

    /* renamed from: q */
    private C4309re f19033q;

    /* renamed from: r */
    private C4393uh[] f19034r;

    /* renamed from: s */
    private long[][] f19035s;

    /* renamed from: t */
    private int f19036t;

    /* renamed from: u */
    private long f19037u;

    /* renamed from: v */
    private int f19038v;

    static {
        int i = C4392ug.f19012b;
    }

    public C4394ui() {
        this((byte[]) null);
    }

    /* renamed from: i */
    private final void m19118i() {
        this.f19024h = 0;
        this.f19027k = 0;
    }

    /* renamed from: j */
    private final void m19119j(long j) throws C4144lb {
        C4507yn ynVar;
        C4507yn ynVar2;
        long j2;
        C4318rn rnVar;
        int i;
        List<C4402uq> list;
        C4507yn ynVar3;
        int i2;
        while (!this.f19022f.isEmpty() && this.f19022f.peek().f18832a == j) {
            C4373to pop = this.f19022f.pop();
            if (pop.f18836d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.f19038v == 1;
                C4318rn rnVar2 = new C4318rn();
                C4374tp c = pop.mo16659c(Atom.TYPE_udta);
                if (c != null) {
                    Pair<C4507yn, C4507yn> a = C4382tx.m19019a(c);
                    C4507yn ynVar4 = (C4507yn) a.first;
                    C4507yn ynVar5 = (C4507yn) a.second;
                    if (ynVar4 != null) {
                        rnVar2.mo16616b(ynVar4);
                    }
                    ynVar2 = ynVar5;
                    ynVar = ynVar4;
                } else {
                    ynVar2 = null;
                    ynVar = null;
                }
                C4373to d = pop.mo16660d(Atom.TYPE_meta);
                C4507yn b = d != null ? C4382tx.m19020b(d) : null;
                List<C4402uq> d2 = C4382tx.m19022d(pop, rnVar2, C6540C.TIME_UNSET, (C4276pz) null, z, C4391uf.f19009a);
                C4309re reVar = this.f19033q;
                aup.m14890u(reVar);
                int size = d2.size();
                int i3 = -1;
                int i4 = 0;
                long j3 = C6540C.TIME_UNSET;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    C4402uq uqVar = d2.get(i4);
                    if (uqVar.f19078b == 0) {
                        list = d2;
                        i = size;
                        rnVar = rnVar2;
                    } else {
                        C4399un unVar = uqVar.f19077a;
                        int i5 = i3;
                        long j4 = unVar.f19047e;
                        if (j4 == C6540C.TIME_UNSET) {
                            j4 = uqVar.f19084h;
                        }
                        long max = Math.max(j3, j4);
                        list = d2;
                        i = size;
                        C4393uh uhVar = new C4393uh(unVar, uqVar, reVar.mo13362ba(i4, unVar.f19044b));
                        int i6 = uqVar.f19081e;
                        long j5 = max;
                        C4119kd a2 = unVar.f19048f.mo16126a();
                        a2.mo16111W(i6 + 30);
                        if (unVar.f19044b == 2 && j4 > 0 && (i2 = uqVar.f19078b) > 1) {
                            a2.mo16104P(((float) i2) / (((float) j4) / 1000000.0f));
                        }
                        int i7 = unVar.f19044b;
                        int i8 = C4390ue.f19008b;
                        if (i7 == 1 && rnVar2.mo16615a()) {
                            a2.mo16101M(rnVar2.f18526a);
                            a2.mo16102N(rnVar2.f18527b);
                        }
                        int i9 = unVar.f19044b;
                        C4507yn[] ynVarArr = new C4507yn[2];
                        ynVarArr[0] = ynVar2;
                        if (this.f19023g.isEmpty()) {
                            ynVar3 = null;
                        } else {
                            ynVar3 = new C4507yn((List<? extends C4506ym>) this.f19023g);
                        }
                        ynVarArr[1] = ynVar3;
                        rnVar = rnVar2;
                        C4507yn ynVar6 = new C4507yn(new C4506ym[0]);
                        if (i9 == 1) {
                            if (ynVar != null) {
                                ynVar6 = ynVar;
                            }
                        } else if (i9 == 2 && b != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= b.mo16831a()) {
                                    break;
                                }
                                C4506ym b2 = b.mo16832b(i10);
                                if (b2 instanceof C4536zp) {
                                    C4536zp zpVar = (C4536zp) b2;
                                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(zpVar.f19768a)) {
                                        ynVar6 = new C4507yn(zpVar);
                                        break;
                                    }
                                }
                                i10++;
                            }
                        }
                        for (int i11 = 0; i11 < 2; i11++) {
                            ynVar6 = ynVar6.mo16833c(ynVarArr[i11]);
                        }
                        if (ynVar6.mo16831a() > 0) {
                            a2.mo16112X(ynVar6);
                        }
                        uhVar.f19015c.mo13403a(a2.mo16115a());
                        i3 = i5;
                        if (unVar.f19044b == 2) {
                            if (i3 == -1) {
                                i3 = arrayList.size();
                            }
                        }
                        arrayList.add(uhVar);
                        j3 = j5;
                    }
                    i4++;
                    d2 = list;
                    size = i;
                    rnVar2 = rnVar;
                }
                this.f19036t = i3;
                this.f19037u = j3;
                C4393uh[] uhVarArr = (C4393uh[]) arrayList.toArray(new C4393uh[0]);
                this.f19034r = uhVarArr;
                int length = uhVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < uhVarArr.length; i12++) {
                    jArr[i12] = new long[uhVarArr[i12].f19014b.f19078b];
                    jArr2[i12] = uhVarArr[i12].f19014b.f19082f[0];
                }
                int i13 = 0;
                while (i13 < uhVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < uhVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j7 = jArr2[i15];
                            if (j7 <= j6) {
                                i14 = i15;
                                j6 = j7;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j2;
                    C4402uq uqVar2 = uhVarArr[i14].f19014b;
                    j2 += (long) uqVar2.f19080d[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = uqVar2.f19082f[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.f19035s = jArr;
                reVar.mo13363bb();
                reVar.mo13364bc(this);
                this.f19022f.clear();
                this.f19024h = 2;
            } else if (!this.f19022f.isEmpty()) {
                this.f19022f.peek().mo16658b(pop);
            }
        }
        if (this.f19024h != 2) {
            m19118i();
        }
    }

    /* renamed from: k */
    private static long m19120k(C4402uq uqVar, long j, long j2) {
        int l = m19121l(uqVar, j);
        if (l == -1) {
            return j2;
        }
        return Math.min(uqVar.f19079c[l], j2);
    }

    /* renamed from: l */
    private static int m19121l(C4402uq uqVar, long j) {
        int a = uqVar.mo16683a(j);
        return a == -1 ? uqVar.mo16684b(j) : a;
    }

    /* renamed from: m */
    private static int m19122m(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((C4393uh[]) aup.m14890u(this.f19034r)).length == 0) {
            C4325ru ruVar = C4325ru.f18538a;
            return new C4322rr(ruVar, ruVar);
        }
        int i = this.f19036t;
        if (i != -1) {
            C4402uq uqVar = this.f19034r[i].f19014b;
            int l = m19121l(uqVar, j);
            if (l == -1) {
                C4325ru ruVar2 = C4325ru.f18538a;
                return new C4322rr(ruVar2, ruVar2);
            }
            long j6 = uqVar.f19082f[l];
            j2 = uqVar.f19079c[l];
            if (j6 >= j || l >= uqVar.f19078b - 1 || (b = uqVar.mo16684b(j)) == -1 || b == l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = uqVar.f19082f[b];
                j5 = uqVar.f19079c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C4393uh[] uhVarArr = this.f19034r;
            if (i2 >= uhVarArr.length) {
                break;
            }
            if (i2 != this.f19036t) {
                C4402uq uqVar2 = uhVarArr[i2].f19014b;
                long k = m19120k(uqVar2, j, j2);
                if (j4 != C6540C.TIME_UNSET) {
                    j3 = m19120k(uqVar2, j4, j3);
                }
                j2 = k;
            }
            i2++;
        }
        C4325ru ruVar3 = new C4325ru(j, j2);
        if (j4 == C6540C.TIME_UNSET) {
            return new C4322rr(ruVar3, ruVar3);
        }
        return new C4322rr(ruVar3, new C4325ru(j4, j3));
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f19037u;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return C4398um.m19145b(rcVar);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19033q = reVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13691f(com.google.ads.interactivemedia.p038v3.internal.C4307rc r33, com.google.ads.interactivemedia.p038v3.internal.C4321rq r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f19024h
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = 0
            r7 = -1
            r8 = 8
            r9 = 1
            if (r3 == 0) goto L_0x023b
            r12 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r9) goto L_0x01bc
            long r3 = r33.mo16605l()
            int r8 = r0.f19029m
            if (r8 != r7) goto L_0x00ab
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r15
            r21 = r17
            r24 = r21
            r8 = 0
            r19 = -1
            r20 = 1
            r23 = 1
            r26 = -1
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.uh[] r14 = r0.f19034r
            java.lang.Object r14 = com.google.ads.interactivemedia.p038v3.internal.amm.m14236f(r14)
            com.google.ads.interactivemedia.v3.internal.uh[] r14 = (com.google.ads.interactivemedia.p038v3.internal.C4393uh[]) r14
            int r14 = r14.length
            if (r8 >= r14) goto L_0x0090
            com.google.ads.interactivemedia.v3.internal.uh[] r14 = r0.f19034r
            r14 = r14[r8]
            int r11 = r14.f19016d
            com.google.ads.interactivemedia.v3.internal.uq r14 = r14.f19014b
            int r10 = r14.f19078b
            if (r11 != r10) goto L_0x004c
            goto L_0x008d
        L_0x004c:
            long[] r10 = r14.f19079c
            r28 = r10[r11]
            long[][] r10 = r0.f19035s
            java.lang.Object r10 = com.google.ads.interactivemedia.p038v3.internal.amm.m14236f(r10)
            long[][] r10 = (long[][]) r10
            r10 = r10[r8]
            r30 = r10[r11]
            long r28 = r28 - r3
            int r10 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x0069
            int r10 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r10 = 0
            goto L_0x006a
        L_0x0069:
            r10 = 1
        L_0x006a:
            if (r10 != 0) goto L_0x0070
            if (r23 != 0) goto L_0x0078
            r11 = 0
            goto L_0x0072
        L_0x0070:
            r11 = r23
        L_0x0072:
            if (r10 != r11) goto L_0x0081
            int r14 = (r28 > r21 ? 1 : (r28 == r21 ? 0 : -1))
            if (r14 >= 0) goto L_0x0081
        L_0x0078:
            r19 = r8
            r23 = r10
            r21 = r28
            r24 = r30
            goto L_0x0083
        L_0x0081:
            r23 = r11
        L_0x0083:
            int r11 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r11 >= 0) goto L_0x008d
            r26 = r8
            r20 = r10
            r17 = r30
        L_0x008d:
            int r8 = r8 + 1
            goto L_0x0034
        L_0x0090:
            int r8 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r8 == 0) goto L_0x00a3
            if (r20 == 0) goto L_0x00a3
            r10 = 10485760(0xa00000, double:5.180654E-317)
            long r17 = r17 + r10
            int r8 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r8 = r26
            goto L_0x00a5
        L_0x00a3:
            r8 = r19
        L_0x00a5:
            r0.f19029m = r8
            if (r8 != r7) goto L_0x00ab
            goto L_0x01bb
        L_0x00ab:
            com.google.ads.interactivemedia.v3.internal.uh[] r8 = r0.f19034r
            java.lang.Object r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14236f(r8)
            com.google.ads.interactivemedia.v3.internal.uh[] r8 = (com.google.ads.interactivemedia.p038v3.internal.C4393uh[]) r8
            int r10 = r0.f19029m
            r8 = r8[r10]
            com.google.ads.interactivemedia.v3.internal.rw r14 = r8.f19015c
            int r10 = r8.f19016d
            com.google.ads.interactivemedia.v3.internal.uq r11 = r8.f19014b
            long[] r15 = r11.f19079c
            r22 = r8
            r7 = r15[r10]
            int[] r11 = r11.f19080d
            r11 = r11[r10]
            long r3 = r7 - r3
            int r15 = r0.f19030n
            r16 = r10
            long r9 = (long) r15
            long r3 = r3 + r9
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x01b8
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x00d9
            goto L_0x01b8
        L_0x00d9:
            r5 = r22
            com.google.ads.interactivemedia.v3.internal.un r2 = r5.f19013a
            int r2 = r2.f19049g
            r6 = 1
            if (r2 != r6) goto L_0x00e7
            r6 = 8
            long r3 = r3 + r6
            int r11 = r11 + -8
        L_0x00e7:
            int r2 = (int) r3
            r1.mo16597d(r2)
            com.google.ads.interactivemedia.v3.internal.un r2 = r5.f19013a
            int r3 = r2.f19052j
            if (r3 == 0) goto L_0x0155
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19019c
            byte[] r2 = r2.mo13952j()
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r4 = 2
            r2[r4] = r3
            com.google.ads.interactivemedia.v3.internal.un r3 = r5.f19013a
            int r3 = r3.f19052j
            int r4 = 4 - r3
        L_0x0106:
            int r6 = r0.f19031o
            if (r6 >= r11) goto L_0x0192
            int r6 = r0.f19032p
            if (r6 != 0) goto L_0x0140
            r1.mo16596c(r2, r4, r3)
            int r6 = r0.f19030n
            int r6 = r6 + r3
            r0.f19030n = r6
            com.google.ads.interactivemedia.v3.internal.alw r6 = r0.f19019c
            r7 = 0
            r6.mo13951i(r7)
            com.google.ads.interactivemedia.v3.internal.alw r6 = r0.f19019c
            int r6 = r6.mo13965w()
            if (r6 < 0) goto L_0x0138
            r0.f19032p = r6
            com.google.ads.interactivemedia.v3.internal.alw r6 = r0.f19018b
            r6.mo13951i(r7)
            com.google.ads.interactivemedia.v3.internal.alw r6 = r0.f19018b
            r7 = 4
            r14.mo13406d(r6, r7)
            int r6 = r0.f19031o
            int r6 = r6 + r7
            r0.f19031o = r6
            int r11 = r11 + r4
            goto L_0x0106
        L_0x0138:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0140:
            r7 = 0
            int r6 = r14.mo13405c(r1, r6, r7)
            int r7 = r0.f19030n
            int r7 = r7 + r6
            r0.f19030n = r7
            int r7 = r0.f19031o
            int r7 = r7 + r6
            r0.f19031o = r7
            int r7 = r0.f19032p
            int r7 = r7 - r6
            r0.f19032p = r7
            goto L_0x0106
        L_0x0155:
            com.google.ads.interactivemedia.v3.internal.ke r2 = r2.f19048f
            java.lang.String r2 = r2.f17681l
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0177
            int r2 = r0.f19031o
            if (r2 != 0) goto L_0x0175
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19020d
            com.google.ads.interactivemedia.p038v3.internal.C4209nm.m18277b(r11, r2)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f19020d
            r3 = 7
            r14.mo13406d(r2, r3)
            int r2 = r0.f19031o
            int r2 = r2 + r3
            r0.f19031o = r2
        L_0x0175:
            int r11 = r11 + 7
        L_0x0177:
            int r2 = r0.f19031o
            if (r2 >= r11) goto L_0x0192
            int r2 = r11 - r2
            r3 = 0
            int r2 = r14.mo13405c(r1, r2, r3)
            int r3 = r0.f19030n
            int r3 = r3 + r2
            r0.f19030n = r3
            int r3 = r0.f19031o
            int r3 = r3 + r2
            r0.f19031o = r3
            int r3 = r0.f19032p
            int r3 = r3 - r2
            r0.f19032p = r3
            goto L_0x0177
        L_0x0192:
            r18 = r11
            com.google.ads.interactivemedia.v3.internal.uq r1 = r5.f19014b
            long[] r2 = r1.f19082f
            r3 = r2[r16]
            int[] r1 = r1.f19083g
            r17 = r1[r16]
            r19 = 0
            r20 = 0
            r15 = r3
            r14.mo13404b(r15, r17, r18, r19, r20)
            int r1 = r5.f19016d
            r2 = 1
            int r1 = r1 + r2
            r5.f19016d = r1
            r1 = -1
            r0.f19029m = r1
            r1 = 0
            r0.f19030n = r1
            r0.f19031o = r1
            r0.f19032p = r1
            r7 = 0
            goto L_0x01bb
        L_0x01b8:
            r2.f18533a = r7
            r7 = 1
        L_0x01bb:
            return r7
        L_0x01bc:
            long r5 = r0.f19026j
            int r3 = r0.f19027k
            long r9 = (long) r3
            long r5 = r5 - r9
            long r9 = r33.mo16605l()
            long r9 = r9 + r5
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19028l
            if (r3 == 0) goto L_0x021b
            byte[] r7 = r3.mo13952j()
            int r11 = r0.f19027k
            int r6 = (int) r5
            r1.mo16596c(r7, r11, r6)
            int r5 = r0.f19025i
            if (r5 != r4) goto L_0x0200
            r3.mo13951i(r8)
            int r4 = r3.mo13965w()
            int r4 = m19122m(r4)
            if (r4 == 0) goto L_0x01e7
            goto L_0x01fd
        L_0x01e7:
            r4 = 4
            r3.mo13954l(r4)
        L_0x01eb:
            int r4 = r3.mo13947e()
            if (r4 <= 0) goto L_0x01fc
            int r4 = r3.mo13965w()
            int r4 = m19122m(r4)
            if (r4 == 0) goto L_0x01eb
            goto L_0x01fd
        L_0x01fc:
            r4 = 0
        L_0x01fd:
            r0.f19038v = r4
            goto L_0x0223
        L_0x0200:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r4 = r0.f19022f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0223
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r4 = r0.f19022f
            java.lang.Object r4 = r4.peek()
            com.google.ads.interactivemedia.v3.internal.to r4 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r4
            com.google.ads.interactivemedia.v3.internal.tp r5 = new com.google.ads.interactivemedia.v3.internal.tp
            int r6 = r0.f19025i
            r5.<init>(r6, r3)
            r4.mo16657a(r5)
            goto L_0x0223
        L_0x021b:
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0226
            int r3 = (int) r5
            r1.mo16597d(r3)
        L_0x0223:
            r27 = 0
            goto L_0x022f
        L_0x0226:
            long r3 = r33.mo16605l()
            long r3 = r3 + r5
            r2.f18533a = r3
            r27 = 1
        L_0x022f:
            r0.m19119j(r9)
            if (r27 == 0) goto L_0x0006
            int r3 = r0.f19024h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x023b:
            r3 = 1
            int r7 = r0.f19027k
            if (r7 != 0) goto L_0x0266
            com.google.ads.interactivemedia.v3.internal.alw r7 = r0.f19021e
            byte[] r7 = r7.mo13952j()
            r9 = 0
            boolean r7 = r1.mo16595b(r7, r9, r8, r3)
            if (r7 != 0) goto L_0x024f
            r3 = -1
            return r3
        L_0x024f:
            r0.f19027k = r8
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19021e
            r3.mo13951i(r9)
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19021e
            long r9 = r3.mo13963u()
            r0.f19026j = r9
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19021e
            int r3 = r3.mo13965w()
            r0.f19025i = r3
        L_0x0266:
            long r9 = r0.f19026j
            r11 = 1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0285
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19021e
            byte[] r3 = r3.mo13952j()
            r1.mo16596c(r3, r8, r8)
            int r3 = r0.f19027k
            int r3 = r3 + r8
            r0.f19027k = r3
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19021e
            long r5 = r3.mo13936E()
            r0.f19026j = r5
            goto L_0x02ae
        L_0x0285:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02ae
            long r5 = r33.mo16606m()
            r9 = -1
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x029f
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r3 = r0.f19022f
            java.lang.Object r3 = r3.peek()
            com.google.ads.interactivemedia.v3.internal.to r3 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r3
            if (r3 == 0) goto L_0x029f
            long r5 = r3.f18832a
        L_0x029f:
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x02ae
            long r9 = r33.mo16605l()
            long r5 = r5 - r9
            int r3 = r0.f19027k
            long r9 = (long) r3
            long r5 = r5 + r9
            r0.f19026j = r5
        L_0x02ae:
            long r5 = r0.f19026j
            int r3 = r0.f19027k
            long r9 = (long) r3
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x03e6
            int r5 = r0.f19025i
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0394
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0394
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0394
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0394
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0394
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0394
            if (r5 != r7) goto L_0x02de
            goto L_0x0394
        L_0x02de:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0360
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0360
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x0360
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0360
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0360
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0360
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0360
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0360
            if (r5 == r4) goto L_0x0360
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0360
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0360
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0336
            goto L_0x0360
        L_0x0336:
            long r3 = r33.mo16605l()
            int r5 = r0.f19027k
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.f19025i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0358
            com.google.ads.interactivemedia.v3.internal.zr r7 = new com.google.ads.interactivemedia.v3.internal.zr
            r8 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r14 = r10 + r5
            long r3 = r0.f19026j
            long r16 = r3 - r5
            r7.<init>(r8, r10, r12, r14, r16)
        L_0x0358:
            r3 = 0
            r0.f19028l = r3
            r3 = 1
            r0.f19024h = r3
            goto L_0x0006
        L_0x0360:
            if (r3 != r8) goto L_0x0364
            r3 = 1
            goto L_0x0365
        L_0x0364:
            r3 = 0
        L_0x0365:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r3)
            long r3 = r0.f19026j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0373
            r3 = 1
            goto L_0x0374
        L_0x0373:
            r3 = 0
        L_0x0374:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r3)
            com.google.ads.interactivemedia.v3.internal.alw r3 = new com.google.ads.interactivemedia.v3.internal.alw
            long r4 = r0.f19026j
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.ads.interactivemedia.v3.internal.alw r4 = r0.f19021e
            byte[] r4 = r4.mo13952j()
            byte[] r5 = r3.mo13952j()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r8)
            r0.f19028l = r3
            r3 = 1
            r0.f19024h = r3
            goto L_0x0006
        L_0x0394:
            long r3 = r33.mo16605l()
            long r5 = r0.f19026j
            int r9 = r0.f19027k
            long r9 = (long) r9
            long r3 = r3 + r5
            long r3 = r3 - r9
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x03c7
            int r5 = r0.f19025i
            if (r5 != r7) goto L_0x03c7
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19020d
            r5.mo13943a(r8)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19020d
            byte[] r5 = r5.mo13952j()
            r6 = 0
            r1.mo16600g(r5, r6, r8)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19020d
            com.google.ads.interactivemedia.p038v3.internal.C4382tx.m19021c(r5)
            com.google.ads.interactivemedia.v3.internal.alw r5 = r0.f19020d
            int r5 = r5.mo13950h()
            r1.mo16597d(r5)
            r33.mo16603j()
        L_0x03c7:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.to> r5 = r0.f19022f
            com.google.ads.interactivemedia.v3.internal.to r6 = new com.google.ads.interactivemedia.v3.internal.to
            int r7 = r0.f19025i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f19026j
            int r7 = r0.f19027k
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03e1
            r0.m19119j(r3)
            goto L_0x0006
        L_0x03e1:
            r32.m19118i()
            goto L_0x0006
        L_0x03e6:
            com.google.ads.interactivemedia.v3.internal.lb r1 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            goto L_0x03ef
        L_0x03ee:
            throw r1
        L_0x03ef:
            goto L_0x03ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4394ui.mo13691f(com.google.ads.interactivemedia.v3.internal.rc, com.google.ads.interactivemedia.v3.internal.rq):int");
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f19022f.clear();
        this.f19027k = 0;
        this.f19029m = -1;
        this.f19030n = 0;
        this.f19031o = 0;
        this.f19032p = 0;
        if (j == 0) {
            m19118i();
            return;
        }
        C4393uh[] uhVarArr = this.f19034r;
        if (uhVarArr != null) {
            for (C4393uh uhVar : uhVarArr) {
                C4402uq uqVar = uhVar.f19014b;
                int a = uqVar.mo16683a(j2);
                if (a == -1) {
                    a = uqVar.mo16684b(j2);
                }
                uhVar.f19016d = a;
            }
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }

    public C4394ui(byte[] bArr) {
        this.f19024h = 0;
        new C4397ul();
        this.f19023g = new ArrayList();
        this.f19021e = new alw(16);
        this.f19022f = new ArrayDeque<>();
        this.f19018b = new alw(alq.f15233a);
        this.f19019c = new alw(4);
        this.f19020d = new alw();
        this.f19029m = -1;
    }
}
