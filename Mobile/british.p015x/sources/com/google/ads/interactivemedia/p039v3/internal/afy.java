package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afy */
/* compiled from: IMASDK */
public final class afy implements aaz, agf, ahk {

    /* renamed from: a */
    private final afw f14591a;

    /* renamed from: b */
    private final aho f14592b;

    /* renamed from: c */
    private final akp f14593c;

    /* renamed from: d */
    private final C4286qi f14594d;

    /* renamed from: e */
    private final C4281qd f14595e;

    /* renamed from: f */
    private final abj f14596f;

    /* renamed from: g */
    private final IdentityHashMap<ach, Integer> f14597g = new IdentityHashMap<>();

    /* renamed from: h */
    private final agn f14598h = new agn();

    /* renamed from: i */
    private final int f14599i;

    /* renamed from: j */
    private aay f14600j;

    /* renamed from: k */
    private int f14601k;

    /* renamed from: l */
    private acq f14602l;

    /* renamed from: m */
    private agi[] f14603m = new agi[0];

    /* renamed from: n */
    private agi[] f14604n = new agi[0];

    /* renamed from: o */
    private int f14605o;

    /* renamed from: p */
    private acj f14606p = C4396uk.m19135d(new acj[0]);

    /* renamed from: q */
    private final afm f14607q;

    /* renamed from: r */
    private final ajl f14608r;

    /* renamed from: s */
    private final C4396uk f14609s;

    /* renamed from: t */
    private final aup f14610t;

    public afy(afw afw, aho aho, afm afm, akp akp, C4286qi qiVar, C4281qd qdVar, aup aup, abj abj, ajl ajl, C4396uk ukVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14591a = afw;
        this.f14592b = aho;
        this.f14607q = afm;
        this.f14593c = akp;
        this.f14594d = qiVar;
        this.f14595e = qdVar;
        this.f14610t = aup;
        this.f14596f = abj;
        this.f14608r = ajl;
        this.f14609s = ukVar;
        this.f14599i = i;
    }

    /* renamed from: t */
    private final agi m13504t(int i, Uri[] uriArr, C4120ke[] keVarArr, C4120ke keVar, List<C4120ke> list, Map<String, C4276pz> map, long j) {
        int i2 = i;
        Map<String, C4276pz> map2 = map;
        long j2 = j;
        afv afv = r16;
        afv afv2 = new afv(this.f14591a, this.f14592b, uriArr, keVarArr, this.f14607q, this.f14593c, this.f14598h, list);
        return new agi(i2, this, afv, map2, this.f14608r, j2, keVar, this.f14594d, this.f14595e, this.f14610t, this.f14596f, this.f14599i, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13228a(com.google.ads.interactivemedia.p039v3.internal.aay r23, long r24) {
        /*
            r22 = this;
            r9 = r22
            r0 = r23
            r9.f14600j = r0
            com.google.ads.interactivemedia.v3.internal.aho r0 = r9.f14592b
            r0.mo13705c(r9)
            com.google.ads.interactivemedia.v3.internal.aho r0 = r9.f14592b
            com.google.ads.interactivemedia.v3.internal.agx r0 = r0.mo13707e()
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r0)
            java.util.Map r10 = java.util.Collections.emptyMap()
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r1 = r0.f14759c
            boolean r1 = r1.isEmpty()
            java.util.List<com.google.ads.interactivemedia.v3.internal.agv> r11 = r0.f14760d
            java.util.List<com.google.ads.interactivemedia.v3.internal.agv> r12 = r0.f14761e
            r13 = 0
            r9.f14601k = r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7 = 1
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00e6
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r1 = r0.f14759c
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x003e:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r6 = r0.f14759c
            int r6 = r6.size()
            r8 = 2
            if (r3 >= r6) goto L_0x0077
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r6 = r0.f14759c
            java.lang.Object r6 = r6.get(r3)
            com.google.ads.interactivemedia.v3.internal.agw r6 = (com.google.ads.interactivemedia.p039v3.internal.agw) r6
            com.google.ads.interactivemedia.v3.internal.ke r6 = r6.f14752b
            int r13 = r6.f17687r
            if (r13 > 0) goto L_0x006f
            java.lang.String r13 = r6.f17678i
            java.lang.String r13 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r13, r8)
            if (r13 == 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            java.lang.String r6 = r6.f17678i
            java.lang.String r6 = com.google.ads.interactivemedia.p039v3.internal.amm.m14203T(r6, r7)
            if (r6 == 0) goto L_0x006b
            r2[r3] = r7
            int r5 = r5 + 1
            goto L_0x0073
        L_0x006b:
            r6 = -1
            r2[r3] = r6
            goto L_0x0073
        L_0x006f:
            r2[r3] = r8
            int r4 = r4 + 1
        L_0x0073:
            int r3 = r3 + 1
            r13 = 0
            goto L_0x003e
        L_0x0077:
            if (r4 <= 0) goto L_0x007c
            r1 = 1
        L_0x007a:
            r3 = 0
            goto L_0x0086
        L_0x007c:
            if (r5 >= r1) goto L_0x0083
            int r1 = r1 - r5
            r4 = r1
            r1 = 0
            r3 = 1
            goto L_0x0086
        L_0x0083:
            r4 = r1
            r1 = 0
            goto L_0x007a
        L_0x0086:
            android.net.Uri[] r5 = new android.net.Uri[r4]
            com.google.ads.interactivemedia.v3.internal.ke[] r6 = new com.google.ads.interactivemedia.p039v3.internal.C4120ke[r4]
            int[] r13 = new int[r4]
            r4 = 0
            r16 = 0
        L_0x008f:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r7 = r0.f14759c
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x00be
            if (r1 == 0) goto L_0x009d
            r7 = r2[r4]
            if (r7 != r8) goto L_0x00ba
        L_0x009d:
            if (r3 == 0) goto L_0x00a4
            r7 = r2[r4]
            r8 = 1
            if (r7 == r8) goto L_0x00ba
        L_0x00a4:
            java.util.List<com.google.ads.interactivemedia.v3.internal.agw> r7 = r0.f14759c
            java.lang.Object r7 = r7.get(r4)
            com.google.ads.interactivemedia.v3.internal.agw r7 = (com.google.ads.interactivemedia.p039v3.internal.agw) r7
            android.net.Uri r8 = r7.f14751a
            r5[r16] = r8
            com.google.ads.interactivemedia.v3.internal.ke r7 = r7.f14752b
            r6[r16] = r7
            int r7 = r16 + 1
            r13[r16] = r4
            r16 = r7
        L_0x00ba:
            int r4 = r4 + 1
            r8 = 2
            goto L_0x008f
        L_0x00be:
            r4 = 0
            r1 = r6[r4]
            java.lang.String r1 = r1.f17678i
            r2 = 2
            com.google.ads.interactivemedia.p039v3.internal.amm.m14202S(r1, r2)
            r7 = 1
            com.google.ads.interactivemedia.p039v3.internal.amm.m14202S(r1, r7)
            r1 = 0
            com.google.ads.interactivemedia.v3.internal.ke r4 = r0.f14762f
            java.util.List<com.google.ads.interactivemedia.v3.internal.ke> r8 = r0.f14763g
            r0 = r22
            r2 = r5
            r3 = r6
            r5 = r8
            r6 = r10
            r16 = r12
            r12 = 1
            r7 = r24
            com.google.ads.interactivemedia.v3.internal.agi r0 = r0.m13504t(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            r15.add(r13)
            goto L_0x00e9
        L_0x00e6:
            r16 = r12
            r12 = 1
        L_0x00e9:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r11.size()
            r13.<init>(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r11.size()
            r7.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r11.size()
            r8.<init>(r0)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
        L_0x010a:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x01ad
            java.lang.Object r0 = r11.get(r5)
            com.google.ads.interactivemedia.v3.internal.agv r0 = (com.google.ads.interactivemedia.p039v3.internal.agv) r0
            java.lang.String r0 = r0.f14750c
            boolean r1 = r6.add(r0)
            if (r1 != 0) goto L_0x0128
            r18 = r5
            r17 = r6
            r19 = r7
            r20 = r8
            goto L_0x01a3
        L_0x0128:
            r13.clear()
            r7.clear()
            r8.clear()
            r1 = 0
        L_0x0132:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x0167
            java.lang.Object r2 = r11.get(r1)
            com.google.ads.interactivemedia.v3.internal.agv r2 = (com.google.ads.interactivemedia.p039v3.internal.agv) r2
            java.lang.String r2 = r2.f14750c
            boolean r2 = com.google.ads.interactivemedia.p039v3.internal.amm.m14233c(r0, r2)
            if (r2 == 0) goto L_0x0164
            java.lang.Object r2 = r11.get(r1)
            com.google.ads.interactivemedia.v3.internal.agv r2 = (com.google.ads.interactivemedia.p039v3.internal.agv) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.add(r3)
            android.net.Uri r3 = r2.f14748a
            r13.add(r3)
            com.google.ads.interactivemedia.v3.internal.ke r3 = r2.f14749b
            r7.add(r3)
            com.google.ads.interactivemedia.v3.internal.ke r2 = r2.f14749b
            java.lang.String r2 = r2.f17678i
            com.google.ads.interactivemedia.p039v3.internal.amm.m14202S(r2, r12)
        L_0x0164:
            int r1 = r1 + 1
            goto L_0x0132
        L_0x0167:
            r1 = 0
            android.net.Uri[] r0 = new android.net.Uri[r1]
            java.lang.Object[] r0 = com.google.ads.interactivemedia.p039v3.internal.amm.m14237g(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            java.lang.Object[] r0 = r13.toArray(r0)
            r2 = r0
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            com.google.ads.interactivemedia.v3.internal.ke[] r0 = new com.google.ads.interactivemedia.p039v3.internal.C4120ke[r1]
            java.lang.Object[] r0 = r7.toArray(r0)
            r3 = r0
            com.google.ads.interactivemedia.v3.internal.ke[] r3 = (com.google.ads.interactivemedia.p039v3.internal.C4120ke[]) r3
            java.util.List r17 = java.util.Collections.emptyList()
            r1 = 1
            r4 = 0
            r0 = r22
            r18 = r5
            r5 = r17
            r17 = r6
            r6 = r10
            r19 = r7
            r20 = r8
            r7 = r24
            com.google.ads.interactivemedia.v3.internal.agi r0 = r0.m13504t(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = com.google.ads.interactivemedia.p039v3.internal.awa.m14989a(r20)
            r15.add(r1)
            r14.add(r0)
        L_0x01a3:
            int r5 = r18 + 1
            r6 = r17
            r7 = r19
            r8 = r20
            goto L_0x010a
        L_0x01ad:
            int r0 = r14.size()
            r9.f14605o = r0
            r11 = 0
        L_0x01b4:
            int r0 = r16.size()
            if (r11 >= r0) goto L_0x0205
            r13 = r16
            java.lang.Object r0 = r13.get(r11)
            r7 = r0
            com.google.ads.interactivemedia.v3.internal.agv r7 = (com.google.ads.interactivemedia.p039v3.internal.agv) r7
            android.net.Uri[] r2 = new android.net.Uri[r12]
            android.net.Uri r0 = r7.f14748a
            r1 = 0
            r2[r1] = r0
            com.google.ads.interactivemedia.v3.internal.ke[] r3 = new com.google.ads.interactivemedia.p039v3.internal.C4120ke[r12]
            com.google.ads.interactivemedia.v3.internal.ke r0 = r7.f14749b
            r3[r1] = r0
            r1 = 3
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r22
            r6 = r10
            r21 = r7
            r7 = r24
            com.google.ads.interactivemedia.v3.internal.agi r0 = r0.m13504t(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = new int[r12]
            r2 = 0
            r1[r2] = r11
            r15.add(r1)
            r14.add(r0)
            com.google.ads.interactivemedia.v3.internal.aco[] r1 = new com.google.ads.interactivemedia.p039v3.internal.aco[r12]
            com.google.ads.interactivemedia.v3.internal.aco r3 = new com.google.ads.interactivemedia.v3.internal.aco
            com.google.ads.interactivemedia.v3.internal.ke[] r4 = new com.google.ads.interactivemedia.p039v3.internal.C4120ke[r12]
            r5 = r21
            com.google.ads.interactivemedia.v3.internal.ke r5 = r5.f14749b
            r4[r2] = r5
            r3.<init>((com.google.ads.interactivemedia.p039v3.internal.C4120ke[]) r4)
            r1[r2] = r3
            int[] r3 = new int[r2]
            r0.mo13661J(r1, r3)
            int r11 = r11 + 1
            goto L_0x01b4
        L_0x0205:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.agi[] r0 = new com.google.ads.interactivemedia.p039v3.internal.agi[r2]
            java.lang.Object[] r0 = r14.toArray(r0)
            com.google.ads.interactivemedia.v3.internal.agi[] r0 = (com.google.ads.interactivemedia.p039v3.internal.agi[]) r0
            r9.f14603m = r0
            int[][] r0 = new int[r2][]
            java.lang.Object[] r0 = r15.toArray(r0)
            int[][] r0 = (int[][]) r0
            com.google.ads.interactivemedia.v3.internal.agi[] r0 = r9.f14603m
            int r1 = r0.length
            r9.f14601k = r1
            r0 = r0[r2]
            r0.mo13671s(r12)
            com.google.ads.interactivemedia.v3.internal.agi[] r0 = r9.f14603m
            int r1 = r0.length
            r13 = 0
        L_0x0226:
            if (r13 >= r1) goto L_0x0230
            r2 = r0[r13]
            r2.mo13662d()
            int r13 = r13 + 1
            goto L_0x0226
        L_0x0230:
            com.google.ads.interactivemedia.v3.internal.agi[] r0 = r9.f14603m
            r9.f14604n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.afy.mo13228a(com.google.ads.interactivemedia.v3.internal.aay, long):void");
    }

    /* renamed from: b */
    public final void mo13229b() throws IOException {
        for (agi f : this.f14603m) {
            f.mo13663f();
        }
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        this.f14606p.mo13230bd(j);
    }

    /* renamed from: c */
    public final acq mo13231c() {
        acq acq = this.f14602l;
        aup.m14890u(acq);
        return acq;
    }

    /* renamed from: d */
    public final long mo13232d(aih[] aihArr, boolean[] zArr, ach[] achArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        int i;
        aih[] aihArr2 = aihArr;
        ach[] achArr2 = achArr;
        int length2 = aihArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = aihArr2.length;
            if (i2 >= length) {
                break;
            }
            ach ach = achArr2[i2];
            if (ach == null) {
                i = -1;
            } else {
                i = this.f14597g.get(ach).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            aih aih = aihArr2[i2];
            if (aih != null) {
                aco j2 = aih.mo13737j();
                int i3 = 0;
                while (true) {
                    agi[] agiArr = this.f14603m;
                    if (i3 >= agiArr.length) {
                        break;
                    } else if (agiArr[i3].mo13664h().mo13454b(j2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f14597g.clear();
        ach[] achArr3 = new ach[length];
        ach[] achArr4 = new ach[length];
        aih[] aihArr3 = new aih[length];
        agi[] agiArr2 = new agi[this.f14603m.length];
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < this.f14603m.length) {
            for (int i6 = 0; i6 < aihArr2.length; i6++) {
                aih aih2 = null;
                achArr4[i6] = iArr[i6] == i5 ? achArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    aih2 = aihArr2[i6];
                }
                aihArr3[i6] = aih2;
            }
            agi agi = this.f14603m[i5];
            agi agi2 = agi;
            int i7 = length;
            int i8 = i5;
            int i9 = i4;
            aih[] aihArr4 = aihArr3;
            agi[] agiArr3 = agiArr2;
            ach[] achArr5 = achArr4;
            boolean o = agi.mo13667o(aihArr3, zArr, achArr4, zArr2, j, z2);
            int i10 = 0;
            boolean z3 = false;
            while (true) {
                z = true;
                if (i10 >= aihArr2.length) {
                    break;
                }
                ach ach2 = achArr5[i10];
                if (iArr2[i10] == i8) {
                    aup.m14890u(ach2);
                    achArr3[i10] = ach2;
                    this.f14597g.put(ach2, Integer.valueOf(i8));
                    z3 = true;
                } else if (iArr[i10] == i8) {
                    if (ach2 != null) {
                        z = false;
                    }
                    aup.m14887r(z);
                }
                i10++;
            }
            if (z3) {
                agiArr3[i9] = agi2;
                i4 = i9 + 1;
                if (i9 == 0) {
                    agi2.mo13671s(true);
                    if (!o) {
                        agi[] agiArr4 = this.f14604n;
                        if (agiArr4.length != 0 && agi2 == agiArr4[0]) {
                        }
                    }
                    this.f14598h.mo13688b();
                    z2 = true;
                } else {
                    if (i8 >= this.f14605o) {
                        z = false;
                    }
                    agi2.mo13671s(z);
                }
            } else {
                i4 = i9;
            }
            i5 = i8 + 1;
            agiArr2 = agiArr3;
            length = i7;
            aihArr3 = aihArr4;
            achArr4 = achArr5;
            achArr2 = achArr;
        }
        System.arraycopy(achArr3, 0, achArr2, 0, length);
        agi[] agiArr5 = (agi[]) amm.m14238h(agiArr2, i4);
        this.f14604n = agiArr5;
        this.f14606p = C4396uk.m19135d(agiArr5);
        return j;
    }

    /* renamed from: f */
    public final long mo13233f() {
        return C6540C.TIME_UNSET;
    }

    /* renamed from: g */
    public final long mo13234g() {
        return this.f14606p.mo13234g();
    }

    /* renamed from: h */
    public final long mo13235h(long j) {
        agi[] agiArr = this.f14604n;
        if (agiArr.length > 0) {
            boolean p = agiArr[0].mo13668p(j, false);
            int i = 1;
            while (true) {
                agi[] agiArr2 = this.f14604n;
                if (i >= agiArr2.length) {
                    break;
                }
                agiArr2[i].mo13668p(j, p);
                i++;
            }
            if (p) {
                this.f14598h.mo13688b();
            }
        }
        return j;
    }

    /* renamed from: i */
    public final long mo13236i(long j, C4159lq lqVar) {
        return j;
    }

    /* renamed from: j */
    public final void mo13637j() {
        this.f14592b.mo13706d(this);
        for (agi r : this.f14603m) {
            r.mo13670r();
        }
        this.f14600j = null;
    }

    /* renamed from: k */
    public final long mo13238k() {
        return this.f14606p.mo13238k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13239l(acj acj) {
        this.f14600j.mo13239l(this);
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        if (this.f14602l != null) {
            return this.f14606p.mo13240m(j);
        }
        for (agi d : this.f14603m) {
            d.mo13662d();
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f14606p.mo13241n();
    }

    /* renamed from: o */
    public final void mo13638o() {
        int i = this.f14601k - 1;
        this.f14601k = i;
        if (i <= 0) {
            int i2 = 0;
            for (agi h : this.f14603m) {
                i2 += h.mo13664h().f14193b;
            }
            aco[] acoArr = new aco[i2];
            int i3 = 0;
            for (agi agi : this.f14603m) {
                int i4 = agi.mo13664h().f14193b;
                int i5 = 0;
                while (i5 < i4) {
                    acoArr[i3] = agi.mo13664h().mo13453a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f14602l = new acq(acoArr);
            this.f14600j.mo13237j(this);
        }
    }

    /* renamed from: p */
    public final void mo13243p(long j) {
        for (agi H : this.f14604n) {
            H.mo13660H(j);
        }
    }

    /* renamed from: q */
    public final void mo13639q(Uri uri) {
        this.f14592b.mo13713k(uri);
    }

    /* renamed from: r */
    public final void mo13640r() {
        for (agi q : this.f14603m) {
            q.mo13669q();
        }
        this.f14600j.mo13239l(this);
    }

    /* renamed from: s */
    public final boolean mo13641s(Uri uri, long j) {
        boolean z = true;
        for (agi t : this.f14603m) {
            z &= t.mo13672t(uri, j);
        }
        this.f14600j.mo13239l(this);
        return true == z;
    }
}
