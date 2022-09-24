package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aei */
/* compiled from: IMASDK */
public final class aei implements adp {

    /* renamed from: a */
    protected final aeg[] f14394a;

    /* renamed from: b */
    private final akj f14395b;

    /* renamed from: c */
    private final int[] f14396c;

    /* renamed from: d */
    private final int f14397d;

    /* renamed from: e */
    private final ajg f14398e;

    /* renamed from: f */
    private final long f14399f;

    /* renamed from: g */
    private final aem f14400g;

    /* renamed from: h */
    private aih f14401h;

    /* renamed from: i */
    private aep f14402i;

    /* renamed from: j */
    private int f14403j;

    /* renamed from: k */
    private IOException f14404k;

    /* renamed from: l */
    private boolean f14405l;

    public aei(akj akj, aep aep, int i, int[] iArr, aih aih, int i2, ajg ajg, long j, boolean z, List<C4120ke> list, aem aem) {
        C4389ud udVar;
        aih aih2 = aih;
        int i3 = i2;
        aem aem2 = aem;
        this.f14395b = akj;
        this.f14402i = aep;
        this.f14396c = iArr;
        this.f14401h = aih2;
        this.f14397d = i3;
        this.f14398e = ajg;
        this.f14403j = i;
        this.f14399f = j;
        this.f14400g = aem2;
        long e = aep.mo13568e(i);
        ArrayList<aez> k = m13322k();
        this.f14394a = new aeg[aih.mo13738k()];
        int i4 = 0;
        while (i4 < this.f14394a.length) {
            aez aez = k.get(aih2.mo13740m(i4));
            aeg[] aegArr = this.f14394a;
            C4120ke keVar = aez.f14486b;
            String str = keVar.f17680k;
            acz acz = null;
            if (aln.m14033c(str)) {
                if (MimeTypes.APPLICATION_RAWCC.equals(str)) {
                    udVar = new C4419vg(keVar);
                } else {
                    boolean z2 = z;
                    List<C4120ke> list2 = list;
                    int i5 = i4;
                    aegArr[i5] = new aeg(e, aez, acz, 0, aez.mo13587l());
                    i4 = i5 + 1;
                }
            } else if (aln.m14045o(str)) {
                udVar = new C4362td(1);
            } else {
                udVar = new C4389ud(true != z ? 0 : 4, (amk) null, list, aem2);
                acz = new acz(udVar, i3, keVar);
                int i52 = i4;
                aegArr[i52] = new aeg(e, aez, acz, 0, aez.mo13587l());
                i4 = i52 + 1;
            }
            boolean z3 = z;
            List<C4120ke> list3 = list;
            acz = new acz(udVar, i3, keVar);
            int i522 = i4;
            aegArr[i522] = new aeg(e, aez, acz, 0, aez.mo13587l());
            i4 = i522 + 1;
        }
    }

    /* renamed from: k */
    private final ArrayList<aez> m13322k() {
        List<aeo> list = this.f14402i.mo13566c(this.f14403j).f14471c;
        ArrayList<aez> arrayList = new ArrayList<>();
        for (int i : this.f14396c) {
            arrayList.addAll(list.get(i).f14433c);
        }
        return arrayList;
    }

    /* renamed from: l */
    private final long m13323l(long j) {
        aep aep = this.f14402i;
        long j2 = aep.f14437a;
        if (j2 == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        return j - C4083iv.m17452b(j2 + aep.mo13566c(this.f14403j).f14470b);
    }

    /* renamed from: m */
    private static final long m13324m(aeg aeg, adl adl, long j, long j2, long j3) {
        if (adl != null) {
            return adl.mo13502i();
        }
        return amm.m14192I(aeg.mo13547h(j), j2, j3);
    }

    /* renamed from: a */
    public final long mo13494a(long j, C4159lq lqVar) {
        for (aeg aeg : this.f14394a) {
            if (aeg.f14390c != null) {
                long h = aeg.mo13547h(j);
                long f = aeg.mo13545f(h);
                int e = aeg.mo13544e();
                return lqVar.mo16267a(j, f, (f >= j || (e != -1 && h >= (aeg.mo13542c() + ((long) e)) + -1)) ? f : aeg.mo13545f(h + 1));
            }
        }
        return j;
    }

    /* renamed from: b */
    public final void mo13495b() throws IOException {
        IOException iOException = this.f14404k;
        if (iOException == null) {
            this.f14395b.mo13518a();
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public final int mo13496c(long j, List<? extends adl> list) {
        if (this.f14404k != null || this.f14401h.mo13738k() < 2) {
            return list.size();
        }
        return this.f14401h.mo13734h(j, list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.ads.interactivemedia.v3.internal.ado} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: com.google.ads.interactivemedia.v3.internal.adi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.google.ads.interactivemedia.v3.internal.ado} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: com.google.ads.interactivemedia.v3.internal.ado} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13497d(long r47, long r49, java.util.List<? extends com.google.ads.interactivemedia.p039v3.internal.adl> r51, com.google.ads.interactivemedia.p039v3.internal.add r52) {
        /*
            r46 = this;
            r0 = r46
            r9 = r52
            java.io.IOException r1 = r0.f14404k
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            long r10 = r49 - r47
            com.google.ads.interactivemedia.v3.internal.aep r1 = r0.f14402i
            long r1 = r1.f14437a
            long r1 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r1)
            com.google.ads.interactivemedia.v3.internal.aep r3 = r0.f14402i
            int r4 = r0.f14403j
            com.google.ads.interactivemedia.v3.internal.aeu r3 = r3.mo13566c(r4)
            long r3 = r3.f14470b
            long r3 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r3)
            long r1 = r1 + r3
            long r1 = r1 + r49
            com.google.ads.interactivemedia.v3.internal.aem r3 = r0.f14400g
            if (r3 == 0) goto L_0x0032
            com.google.ads.interactivemedia.v3.internal.aen r3 = r3.f14416a
            boolean r1 = r3.mo13560d(r1)
            if (r1 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            long r1 = r0.f14399f
            long r1 = com.google.ads.interactivemedia.p039v3.internal.amm.m14218ah(r1)
            long r12 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17452b(r1)
            long r14 = r0.m13323l(r12)
            boolean r1 = r51.isEmpty()
            r16 = 0
            if (r1 == 0) goto L_0x004d
            r7 = r51
            r17 = r16
            goto L_0x005d
        L_0x004d:
            int r1 = r51.size()
            int r1 = r1 + -1
            r7 = r51
            java.lang.Object r1 = r7.get(r1)
            com.google.ads.interactivemedia.v3.internal.adl r1 = (com.google.ads.interactivemedia.p039v3.internal.adl) r1
            r17 = r1
        L_0x005d:
            com.google.ads.interactivemedia.v3.internal.aih r1 = r0.f14401h
            int r8 = r1.mo13738k()
            com.google.ads.interactivemedia.v3.internal.adn[] r5 = new com.google.ads.interactivemedia.p039v3.internal.adn[r8]
            r6 = 0
            r3 = 0
        L_0x0067:
            if (r3 >= r8) goto L_0x00be
            com.google.ads.interactivemedia.v3.internal.aeg[] r1 = r0.f14394a
            r4 = r1[r3]
            com.google.ads.interactivemedia.v3.internal.aed r1 = r4.f14390c
            if (r1 != 0) goto L_0x007e
            com.google.ads.interactivemedia.v3.internal.adn r1 = com.google.ads.interactivemedia.p039v3.internal.adn.f14290a
            r5[r3] = r1
            r24 = r3
            r27 = r8
            r25 = r14
            r14 = 0
            r15 = r5
            goto L_0x00b3
        L_0x007e:
            long r18 = r4.mo13543d(r12)
            long r22 = r4.mo13549j(r12)
            r1 = r4
            r2 = r17
            r24 = r3
            r20 = r4
            r3 = r49
            r25 = r14
            r14 = 0
            r15 = r5
            r5 = r18
            r27 = r8
            r7 = r22
            long r1 = m13324m(r1, r2, r3, r5, r7)
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a6
            com.google.ads.interactivemedia.v3.internal.adn r1 = com.google.ads.interactivemedia.p039v3.internal.adn.f14290a
            r15[r24] = r1
            goto L_0x00b3
        L_0x00a6:
            com.google.ads.interactivemedia.v3.internal.aeh r3 = new com.google.ads.interactivemedia.v3.internal.aeh
            r18 = r3
            r19 = r20
            r20 = r1
            r18.<init>(r19, r20, r22)
            r15[r24] = r3
        L_0x00b3:
            int r3 = r24 + 1
            r7 = r51
            r5 = r15
            r14 = r25
            r8 = r27
            r6 = 0
            goto L_0x0067
        L_0x00be:
            r25 = r14
            r14 = 0
            r15 = r5
            com.google.ads.interactivemedia.v3.internal.aep r1 = r0.f14402i
            boolean r1 = r1.f14440d
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x00d0
            r5 = r18
            goto L_0x00f1
        L_0x00d0:
            com.google.ads.interactivemedia.v3.internal.aeg[] r1 = r0.f14394a
            r1 = r1[r14]
            long r1 = r1.mo13549j(r12)
            com.google.ads.interactivemedia.v3.internal.aeg[] r3 = r0.f14394a
            r3 = r3[r14]
            long r1 = r3.mo13546g(r1)
            r3 = 0
            long r5 = r0.m13323l(r12)
            long r1 = java.lang.Math.min(r5, r1)
            long r1 = r1 - r47
            long r1 = java.lang.Math.max(r3, r1)
            r5 = r1
        L_0x00f1:
            com.google.ads.interactivemedia.v3.internal.aih r2 = r0.f14401h
            r3 = r10
            r7 = r51
            r8 = r15
            r2.mo13617d(r3, r5, r7, r8)
            com.google.ads.interactivemedia.v3.internal.aeg[] r1 = r0.f14394a
            com.google.ads.interactivemedia.v3.internal.aih r2 = r0.f14401h
            int r2 = r2.mo13614a()
            r10 = r1[r2]
            com.google.ads.interactivemedia.v3.internal.adc r1 = r10.f14388a
            if (r1 == 0) goto L_0x0155
            com.google.ads.interactivemedia.v3.internal.aez r2 = r10.f14389b
            com.google.ads.interactivemedia.v3.internal.ke[] r1 = r1.mo13475e()
            if (r1 != 0) goto L_0x0115
            com.google.ads.interactivemedia.v3.internal.aew r1 = r2.mo13589n()
            goto L_0x0117
        L_0x0115:
            r1 = r16
        L_0x0117:
            com.google.ads.interactivemedia.v3.internal.aed r3 = r10.f14390c
            if (r3 != 0) goto L_0x011f
            com.google.ads.interactivemedia.v3.internal.aew r16 = r2.mo13586k()
        L_0x011f:
            r2 = r16
            if (r1 != 0) goto L_0x0125
            if (r2 == 0) goto L_0x0155
        L_0x0125:
            com.google.ads.interactivemedia.v3.internal.ajg r4 = r0.f14398e
            com.google.ads.interactivemedia.v3.internal.aih r3 = r0.f14401h
            com.google.ads.interactivemedia.v3.internal.ke r6 = r3.mo13743p()
            com.google.ads.interactivemedia.v3.internal.aih r3 = r0.f14401h
            int r7 = r3.mo13615b()
            com.google.ads.interactivemedia.v3.internal.aih r3 = r0.f14401h
            r3.mo13616c()
            com.google.ads.interactivemedia.v3.internal.aez r3 = r10.f14389b
            if (r1 == 0) goto L_0x0145
            java.lang.String r5 = r3.f14487c
            com.google.ads.interactivemedia.v3.internal.aew r2 = r1.mo13582c(r2, r5)
            if (r2 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r1 = r2
        L_0x0146:
            com.google.ads.interactivemedia.v3.internal.ajk r5 = com.google.ads.interactivemedia.p039v3.internal.age.m13543a(r3, r1, r14)
            com.google.ads.interactivemedia.v3.internal.adk r1 = new com.google.ads.interactivemedia.v3.internal.adk
            com.google.ads.interactivemedia.v3.internal.adc r8 = r10.f14388a
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f14247a = r1
            return
        L_0x0155:
            long r15 = r10.f14391d
            r11 = 1
            int r1 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x0160
            r7 = 1
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            int r1 = r10.mo13544e()
            if (r1 != 0) goto L_0x016a
            r9.f14248b = r7
            return
        L_0x016a:
            long r20 = r10.mo13543d(r12)
            long r12 = r10.mo13549j(r12)
            r1 = r10
            r2 = r17
            r3 = r49
            r5 = r20
            r14 = r7
            r7 = r12
            long r1 = m13324m(r1, r2, r3, r5, r7)
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x018b
            com.google.ads.interactivemedia.v3.internal.zy r1 = new com.google.ads.interactivemedia.v3.internal.zy
            r1.<init>()
            r0.f14404k = r1
            return
        L_0x018b:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x0285
            boolean r3 = r0.f14405l
            if (r3 == 0) goto L_0x0197
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0285
        L_0x0197:
            if (r14 == 0) goto L_0x01a5
            long r3 = r10.mo13545f(r1)
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a2
            goto L_0x01a5
        L_0x01a2:
            r9.f14248b = r11
            return
        L_0x01a5:
            long r12 = r12 - r1
            r3 = 1
            long r12 = r12 + r3
            long r3 = java.lang.Math.min(r3, r12)
            int r4 = (int) r3
            r5 = -1
            int r3 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x01c4
        L_0x01b4:
            if (r4 <= r11) goto L_0x01c4
            long r7 = (long) r4
            long r7 = r7 + r1
            long r7 = r7 + r5
            long r7 = r10.mo13545f(r7)
            int r3 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r3 < 0) goto L_0x01c4
            int r4 = r4 + -1
            goto L_0x01b4
        L_0x01c4:
            boolean r3 = r51.isEmpty()
            if (r11 == r3) goto L_0x01cd
            r36 = r18
            goto L_0x01cf
        L_0x01cd:
            r36 = r49
        L_0x01cf:
            com.google.ads.interactivemedia.v3.internal.ajg r3 = r0.f14398e
            int r7 = r0.f14397d
            com.google.ads.interactivemedia.v3.internal.aih r8 = r0.f14401h
            com.google.ads.interactivemedia.v3.internal.ke r8 = r8.mo13743p()
            com.google.ads.interactivemedia.v3.internal.aih r12 = r0.f14401h
            int r31 = r12.mo13615b()
            com.google.ads.interactivemedia.v3.internal.aih r12 = r0.f14401h
            r12.mo13616c()
            com.google.ads.interactivemedia.v3.internal.aez r12 = r10.f14389b
            long r32 = r10.mo13545f(r1)
            com.google.ads.interactivemedia.v3.internal.aew r13 = r10.mo13548i(r1)
            java.lang.String r14 = r12.f14487c
            com.google.ads.interactivemedia.v3.internal.adc r15 = r10.f14388a
            r16 = 8
            if (r15 != 0) goto L_0x021e
            long r34 = r10.mo13546g(r1)
            r4 = r25
            boolean r4 = r10.mo13550k(r1, r4)
            if (r11 == r4) goto L_0x0205
            r6 = 8
            goto L_0x0206
        L_0x0205:
            r6 = 0
        L_0x0206:
            com.google.ads.interactivemedia.v3.internal.ajk r29 = com.google.ads.interactivemedia.p039v3.internal.age.m13543a(r12, r13, r6)
            com.google.ads.interactivemedia.v3.internal.ado r4 = new com.google.ads.interactivemedia.v3.internal.ado
            r27 = r4
            r28 = r3
            r30 = r8
            r36 = r1
            r38 = r7
            r39 = r8
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r39)
            r1 = r9
            goto L_0x0282
        L_0x021e:
            r7 = r12
            r11 = r25
            r5 = 1
            r15 = 1
        L_0x0223:
            r48 = r8
            if (r5 >= r4) goto L_0x023e
            long r8 = (long) r5
            long r8 = r8 + r1
            com.google.ads.interactivemedia.v3.internal.aew r6 = r10.mo13548i(r8)
            com.google.ads.interactivemedia.v3.internal.aew r6 = r13.mo13582c(r6, r14)
            if (r6 != 0) goto L_0x0234
            goto L_0x023e
        L_0x0234:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r8 = r48
            r9 = r52
            r13 = r6
            goto L_0x0223
        L_0x023e:
            long r4 = (long) r15
            long r4 = r4 + r1
            r8 = -1
            long r4 = r4 + r8
            long r34 = r10.mo13546g(r4)
            long r8 = r10.f14391d
            int r6 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0256
            int r6 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r6 > 0) goto L_0x0256
            r38 = r8
            goto L_0x0258
        L_0x0256:
            r38 = r18
        L_0x0258:
            boolean r4 = r10.mo13550k(r4, r11)
            r5 = 1
            if (r5 == r4) goto L_0x0262
            r6 = 8
            goto L_0x0263
        L_0x0262:
            r6 = 0
        L_0x0263:
            com.google.ads.interactivemedia.v3.internal.ajk r29 = com.google.ads.interactivemedia.p039v3.internal.age.m13543a(r7, r13, r6)
            long r4 = r7.f14488d
            com.google.ads.interactivemedia.v3.internal.adi r6 = new com.google.ads.interactivemedia.v3.internal.adi
            r27 = r6
            long r4 = -r4
            r43 = r4
            com.google.ads.interactivemedia.v3.internal.adc r4 = r10.f14388a
            r45 = r4
            r28 = r3
            r30 = r48
            r40 = r1
            r42 = r15
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r40, r42, r43, r45)
            r1 = r52
            r4 = r6
        L_0x0282:
            r1.f14247a = r4
            return
        L_0x0285:
            r1 = r9
            r1.f14248b = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aei.mo13497d(long, long, java.util.List, com.google.ads.interactivemedia.v3.internal.add):void");
    }

    /* renamed from: e */
    public final void mo13498e(ada ada) {
        C4300qw d;
        if (ada instanceof adk) {
            int n = this.f14401h.mo13741n(((adk) ada).f14241f);
            aeg aeg = this.f14394a[n];
            if (aeg.f14390c == null && (d = aeg.f14388a.mo13474d()) != null) {
                this.f14394a[n] = aeg.mo13541b(new aee(d, aeg.f14389b.f14488d));
            }
        }
        aem aem = this.f14400g;
        if (aem != null) {
            aem.mo13554g(ada);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r8 = r6.f14394a[r6.f14401h.mo13741n(r7.f14241f)];
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13499f(com.google.ads.interactivemedia.p039v3.internal.ada r7, boolean r8, java.lang.Exception r9, long r10) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.ads.interactivemedia.v3.internal.aem r8 = r6.f14400g
            r1 = 1
            if (r8 == 0) goto L_0x0011
            boolean r8 = r8.mo13555h(r7)
            if (r8 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            return r1
        L_0x0011:
            com.google.ads.interactivemedia.v3.internal.aep r8 = r6.f14402i
            boolean r8 = r8.f14440d
            if (r8 != 0) goto L_0x0054
            boolean r8 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.adl
            if (r8 == 0) goto L_0x0054
            boolean r8 = r9 instanceof com.google.ads.interactivemedia.p039v3.internal.ajx
            if (r8 == 0) goto L_0x0054
            com.google.ads.interactivemedia.v3.internal.ajx r9 = (com.google.ads.interactivemedia.p039v3.internal.ajx) r9
            int r8 = r9.f15123a
            r9 = 404(0x194, float:5.66E-43)
            if (r8 != r9) goto L_0x0054
            com.google.ads.interactivemedia.v3.internal.aeg[] r8 = r6.f14394a
            com.google.ads.interactivemedia.v3.internal.aih r9 = r6.f14401h
            com.google.ads.interactivemedia.v3.internal.ke r2 = r7.f14241f
            int r9 = r9.mo13741n(r2)
            r8 = r8[r9]
            int r9 = r8.mo13544e()
            r2 = -1
            if (r9 == r2) goto L_0x0054
            if (r9 == 0) goto L_0x0054
            long r2 = r8.mo13542c()
            r8 = r7
            com.google.ads.interactivemedia.v3.internal.adl r8 = (com.google.ads.interactivemedia.p039v3.internal.adl) r8
            long r4 = r8.mo13502i()
            long r8 = (long) r9
            long r2 = r2 + r8
            r8 = -1
            long r2 = r2 + r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            r6.f14405l = r1
            return r1
        L_0x0054:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x006c
            com.google.ads.interactivemedia.v3.internal.aih r8 = r6.f14401h
            com.google.ads.interactivemedia.v3.internal.ke r7 = r7.f14241f
            int r7 = r8.mo13741n(r7)
            boolean r7 = r8.mo13745r(r7, r10)
            if (r7 == 0) goto L_0x006c
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aei.mo13499f(com.google.ads.interactivemedia.v3.internal.ada, boolean, java.lang.Exception, long):boolean");
    }

    /* renamed from: g */
    public final void mo13500g() {
        for (aeg aeg : this.f14394a) {
            adc adc = aeg.f14388a;
            if (adc != null) {
                adc.mo13476f();
            }
        }
    }

    /* renamed from: h */
    public final void mo13501h(long j, ada ada, List<? extends adl> list) {
        if (this.f14404k == null) {
            this.f14401h.mo13747t();
        }
    }

    /* renamed from: i */
    public final void mo13509i(aep aep, int i) {
        try {
            this.f14402i = aep;
            this.f14403j = i;
            long e = aep.mo13568e(i);
            ArrayList<aez> k = m13322k();
            for (int i2 = 0; i2 < this.f14394a.length; i2++) {
                aeg[] aegArr = this.f14394a;
                aegArr[i2] = aegArr[i2].mo13540a(e, k.get(this.f14401h.mo13740m(i2)));
            }
        } catch (C4545zy e2) {
            this.f14404k = e2;
        }
    }

    /* renamed from: j */
    public final void mo13510j(aih aih) {
        this.f14401h = aih;
    }
}
