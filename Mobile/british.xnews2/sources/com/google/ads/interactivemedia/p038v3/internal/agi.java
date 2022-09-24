package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agi */
/* compiled from: IMASDK */
final class agi implements akb, akf, acj, C4309re, acf {

    /* renamed from: b */
    private static final Set<Integer> f14648b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A */
    private int f14649A;

    /* renamed from: B */
    private boolean f14650B;

    /* renamed from: C */
    private boolean f14651C;

    /* renamed from: D */
    private int f14652D;

    /* renamed from: E */
    private C4120ke f14653E;

    /* renamed from: F */
    private C4120ke f14654F;

    /* renamed from: G */
    private boolean f14655G;

    /* renamed from: H */
    private acq f14656H;

    /* renamed from: I */
    private Set<aco> f14657I;

    /* renamed from: J */
    private int[] f14658J;

    /* renamed from: K */
    private int f14659K;

    /* renamed from: L */
    private boolean f14660L;

    /* renamed from: M */
    private boolean[] f14661M;

    /* renamed from: N */
    private boolean[] f14662N;

    /* renamed from: O */
    private long f14663O;

    /* renamed from: P */
    private long f14664P;

    /* renamed from: Q */
    private boolean f14665Q;

    /* renamed from: R */
    private boolean f14666R;

    /* renamed from: S */
    private boolean f14667S;

    /* renamed from: T */
    private boolean f14668T;

    /* renamed from: U */
    private long f14669U;

    /* renamed from: V */
    private C4276pz f14670V;

    /* renamed from: W */
    private afx f14671W;

    /* renamed from: X */
    private final ajl f14672X;

    /* renamed from: Y */
    private final aup f14673Y;

    /* renamed from: c */
    private final int f14674c;

    /* renamed from: d */
    private final agf f14675d;

    /* renamed from: e */
    private final afv f14676e;

    /* renamed from: f */
    private final C4120ke f14677f;

    /* renamed from: g */
    private final C4286qi f14678g;

    /* renamed from: h */
    private final C4281qd f14679h;

    /* renamed from: i */
    private final aki f14680i = new aki("Loader:HlsSampleStreamWrapper");

    /* renamed from: j */
    private final abj f14681j;

    /* renamed from: k */
    private final int f14682k;

    /* renamed from: l */
    private final afr f14683l = new afr();

    /* renamed from: m */
    private final ArrayList<afx> f14684m;

    /* renamed from: n */
    private final List<afx> f14685n;

    /* renamed from: o */
    private final Runnable f14686o;

    /* renamed from: p */
    private final Runnable f14687p;

    /* renamed from: q */
    private final Handler f14688q;

    /* renamed from: r */
    private final ArrayList<agb> f14689r;

    /* renamed from: s */
    private final Map<String, C4276pz> f14690s;

    /* renamed from: t */
    private ada f14691t;

    /* renamed from: u */
    private agh[] f14692u;

    /* renamed from: v */
    private int[] f14693v = new int[0];

    /* renamed from: w */
    private final Set<Integer> f14694w;

    /* renamed from: x */
    private final SparseIntArray f14695x;

    /* renamed from: y */
    private C4327rw f14696y;

    /* renamed from: z */
    private int f14697z;

    public agi(int i, agf agf, afv afv, Map map, ajl ajl, long j, C4120ke keVar, C4286qi qiVar, C4281qd qdVar, aup aup, abj abj, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long j2 = j;
        this.f14674c = i;
        this.f14675d = agf;
        this.f14676e = afv;
        this.f14690s = map;
        this.f14672X = ajl;
        this.f14677f = keVar;
        this.f14678g = qiVar;
        this.f14679h = qdVar;
        this.f14673Y = aup;
        this.f14681j = abj;
        this.f14682k = i2;
        Set<Integer> set = f14648b;
        this.f14694w = new HashSet(set.size());
        this.f14695x = new SparseIntArray(set.size());
        this.f14692u = new agh[0];
        this.f14662N = new boolean[0];
        this.f14661M = new boolean[0];
        ArrayList<afx> arrayList = new ArrayList<>();
        this.f14684m = arrayList;
        this.f14685n = Collections.unmodifiableList(arrayList);
        this.f14689r = new ArrayList<>();
        this.f14686o = new agc(this, (byte[]) null);
        this.f14687p = new agc(this);
        this.f14688q = amm.m14241k();
        this.f14663O = j2;
        this.f14664P = j2;
    }

    /* renamed from: K */
    private final void m13558K(int i) {
        aup.m14887r(!this.f14680i.mo13844f());
        loop0:
        while (true) {
            if (i >= this.f14684m.size()) {
                i = -1;
                break;
            }
            int i2 = i;
            while (true) {
                if (i2 >= this.f14684m.size()) {
                    afx afx = this.f14684m.get(i);
                    int i3 = 0;
                    while (i3 < this.f14692u.length) {
                        if (this.f14692u[i3].mo13420r() <= afx.mo13633d(i3)) {
                            i3++;
                        }
                    }
                    break loop0;
                } else if (this.f14684m.get(i2).f14579n) {
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        if (i != -1) {
            long j = m13562O().f14245j;
            afx afx2 = this.f14684m.get(i);
            ArrayList<afx> arrayList = this.f14684m;
            amm.m14235e(arrayList, i, arrayList.size());
            for (int i4 = 0; i4 < this.f14692u.length; i4++) {
                this.f14692u[i4].mo13416n(afx2.mo13633d(i4));
            }
            if (this.f14684m.isEmpty()) {
                this.f14664P = this.f14663O;
            } else {
                ((afx) art.m14630a(this.f14684m)).mo13634e();
            }
            this.f14667S = false;
            this.f14681j.mo13338l(this.f14697z, afx2.f14244i, j);
        }
    }

    /* renamed from: L */
    private final void m13559L() {
        for (agh i : this.f14692u) {
            i.mo13411i(this.f14665Q);
        }
        this.f14665Q = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13658F() {
        /*
            r14 = this;
            boolean r0 = r14.f14655G
            if (r0 != 0) goto L_0x016a
            int[] r0 = r14.f14658J
            if (r0 != 0) goto L_0x016a
            boolean r0 = r14.f14650B
            if (r0 != 0) goto L_0x000e
            goto L_0x016a
        L_0x000e:
            com.google.ads.interactivemedia.v3.internal.agh[] r0 = r14.f14692u
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0013:
            if (r3 >= r1) goto L_0x0021
            r4 = r0[r3]
            com.google.ads.interactivemedia.v3.internal.ke r4 = r4.mo13422t()
            if (r4 != 0) goto L_0x001e
            return
        L_0x001e:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            com.google.ads.interactivemedia.v3.internal.acq r0 = r14.f14656H
            r1 = 3
            r3 = -1
            if (r0 == 0) goto L_0x0099
            int r0 = r0.f14193b
            int[] r4 = new int[r0]
            r14.f14658J = r4
            java.util.Arrays.fill(r4, r3)
            r3 = 0
        L_0x0031:
            if (r3 >= r0) goto L_0x0084
            r4 = 0
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.agh[] r5 = r14.f14692u
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0081
            r5 = r5[r4]
            com.google.ads.interactivemedia.v3.internal.ke r5 = r5.mo13422t()
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r5)
            com.google.ads.interactivemedia.v3.internal.acq r6 = r14.f14656H
            com.google.ads.interactivemedia.v3.internal.aco r6 = r6.mo13453a(r3)
            com.google.ads.interactivemedia.v3.internal.ke r6 = r6.mo13445a(r2)
            java.lang.String r7 = r5.f17681l
            java.lang.String r8 = r6.f17681l
            int r9 = com.google.ads.interactivemedia.p038v3.internal.aln.m14042l(r7)
            if (r9 == r1) goto L_0x005d
            int r5 = com.google.ads.interactivemedia.p038v3.internal.aln.m14042l(r8)
            if (r9 != r5) goto L_0x007e
            goto L_0x0079
        L_0x005d:
            boolean r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14233c(r7, r8)
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = "application/cea-608"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0073
            java.lang.String r8 = "application/cea-708"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0079
        L_0x0073:
            int r5 = r5.f17667D
            int r6 = r6.f17667D
            if (r5 != r6) goto L_0x007e
        L_0x0079:
            int[] r5 = r14.f14658J
            r5[r3] = r4
            goto L_0x0081
        L_0x007e:
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0084:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.agb> r0 = r14.f14689r
            int r1 = r0.size()
        L_0x008a:
            if (r2 >= r1) goto L_0x0098
            java.lang.Object r3 = r0.get(r2)
            com.google.ads.interactivemedia.v3.internal.agb r3 = (com.google.ads.interactivemedia.p038v3.internal.agb) r3
            r3.mo13647a()
            int r2 = r2 + 1
            goto L_0x008a
        L_0x0098:
            return
        L_0x0099:
            com.google.ads.interactivemedia.v3.internal.agh[] r0 = r14.f14692u
            int r0 = r0.length
            r4 = 7
            r5 = 0
            r6 = 7
            r7 = -1
        L_0x00a0:
            r8 = 2
            r9 = 1
            if (r5 >= r0) goto L_0x00dc
            com.google.ads.interactivemedia.v3.internal.agh[] r10 = r14.f14692u
            r10 = r10[r5]
            com.google.ads.interactivemedia.v3.internal.ke r10 = r10.mo13422t()
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r10)
            java.lang.String r10 = r10.f17681l
            boolean r11 = com.google.ads.interactivemedia.p038v3.internal.aln.m14032b(r10)
            if (r11 == 0) goto L_0x00b8
            goto L_0x00c9
        L_0x00b8:
            boolean r8 = com.google.ads.interactivemedia.p038v3.internal.aln.m14031a(r10)
            if (r8 == 0) goto L_0x00c0
            r8 = 1
            goto L_0x00c9
        L_0x00c0:
            boolean r8 = com.google.ads.interactivemedia.p038v3.internal.aln.m14033c(r10)
            if (r8 == 0) goto L_0x00c8
            r8 = 3
            goto L_0x00c9
        L_0x00c8:
            r8 = 7
        L_0x00c9:
            int r9 = m13566S(r8)
            int r10 = m13566S(r6)
            if (r9 <= r10) goto L_0x00d6
            r7 = r5
            r6 = r8
            goto L_0x00d9
        L_0x00d6:
            if (r8 != r6) goto L_0x00d9
            r7 = -1
        L_0x00d9:
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00dc:
            com.google.ads.interactivemedia.v3.internal.afv r1 = r14.f14676e
            com.google.ads.interactivemedia.v3.internal.aco r1 = r1.mo13619b()
            int r4 = r1.f14188a
            r14.f14659K = r3
            int[] r3 = new int[r0]
            r14.f14658J = r3
            r3 = 0
        L_0x00eb:
            if (r3 >= r0) goto L_0x00f4
            int[] r5 = r14.f14658J
            r5[r3] = r3
            int r3 = r3 + 1
            goto L_0x00eb
        L_0x00f4:
            com.google.ads.interactivemedia.v3.internal.aco[] r3 = new com.google.ads.interactivemedia.p038v3.internal.aco[r0]
            r5 = 0
        L_0x00f7:
            if (r5 >= r0) goto L_0x014e
            com.google.ads.interactivemedia.v3.internal.agh[] r10 = r14.f14692u
            r10 = r10[r5]
            com.google.ads.interactivemedia.v3.internal.ke r10 = r10.mo13422t()
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r10)
            if (r5 != r7) goto L_0x012f
            com.google.ads.interactivemedia.v3.internal.ke[] r11 = new com.google.ads.interactivemedia.p038v3.internal.C4120ke[r4]
            if (r4 != r9) goto L_0x0115
            com.google.ads.interactivemedia.v3.internal.ke r12 = r1.mo13445a(r2)
            com.google.ads.interactivemedia.v3.internal.ke r10 = r10.mo16127b(r12)
            r11[r2] = r10
            goto L_0x0125
        L_0x0115:
            r12 = 0
        L_0x0116:
            if (r12 >= r4) goto L_0x0125
            com.google.ads.interactivemedia.v3.internal.ke r13 = r1.mo13445a(r12)
            com.google.ads.interactivemedia.v3.internal.ke r13 = m13567T(r13, r10, r9)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0116
        L_0x0125:
            com.google.ads.interactivemedia.v3.internal.aco r10 = new com.google.ads.interactivemedia.v3.internal.aco
            r10.<init>((com.google.ads.interactivemedia.p038v3.internal.C4120ke[]) r11)
            r3[r5] = r10
            r14.f14659K = r5
            goto L_0x014b
        L_0x012f:
            r11 = 0
            if (r6 != r8) goto L_0x013c
            java.lang.String r12 = r10.f17681l
            boolean r12 = com.google.ads.interactivemedia.p038v3.internal.aln.m14031a(r12)
            if (r12 == 0) goto L_0x013c
            com.google.ads.interactivemedia.v3.internal.ke r11 = r14.f14677f
        L_0x013c:
            com.google.ads.interactivemedia.v3.internal.aco r12 = new com.google.ads.interactivemedia.v3.internal.aco
            com.google.ads.interactivemedia.v3.internal.ke[] r13 = new com.google.ads.interactivemedia.p038v3.internal.C4120ke[r9]
            com.google.ads.interactivemedia.v3.internal.ke r10 = m13567T(r11, r10, r2)
            r13[r2] = r10
            r12.<init>((com.google.ads.interactivemedia.p038v3.internal.C4120ke[]) r13)
            r3[r5] = r12
        L_0x014b:
            int r5 = r5 + 1
            goto L_0x00f7
        L_0x014e:
            com.google.ads.interactivemedia.v3.internal.acq r0 = r14.m13561N(r3)
            r14.f14656H = r0
            java.util.Set<com.google.ads.interactivemedia.v3.internal.aco> r0 = r14.f14657I
            if (r0 != 0) goto L_0x0159
            r2 = 1
        L_0x0159:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r2)
            java.util.Set r0 = java.util.Collections.emptySet()
            r14.f14657I = r0
            r14.m13564Q()
            com.google.ads.interactivemedia.v3.internal.agf r0 = r14.f14675d
            r0.mo13638o()
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.agi.mo13658F():void");
    }

    /* renamed from: N */
    private final acq m13561N(aco[] acoArr) {
        for (int i = 0; i < acoArr.length; i++) {
            aco aco = acoArr[i];
            C4120ke[] keVarArr = new C4120ke[aco.f14188a];
            for (int i2 = 0; i2 < aco.f14188a; i2++) {
                C4120ke a = aco.mo13445a(i2);
                keVarArr[i2] = a.mo16128c(this.f14678g.mo16575b(a));
            }
            acoArr[i] = new aco(keVarArr);
        }
        return new acq(acoArr);
    }

    /* renamed from: O */
    private final afx m13562O() {
        ArrayList<afx> arrayList = this.f14684m;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: P */
    private final boolean m13563P() {
        return this.f14664P != C6540C.TIME_UNSET;
    }

    /* renamed from: Q */
    private final void m13564Q() {
        this.f14651C = true;
    }

    /* renamed from: R */
    private final void m13565R() {
        aup.m14887r(this.f14651C);
        aup.m14890u(this.f14656H);
        aup.m14890u(this.f14657I);
    }

    /* renamed from: S */
    private static int m13566S(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: T */
    private static C4120ke m13567T(C4120ke keVar, C4120ke keVar2, boolean z) {
        String str;
        String str2;
        if (keVar == null) {
            return keVar2;
        }
        int l = aln.m14042l(keVar2.f17681l);
        if (amm.m14202S(keVar.f17678i, l) == 1) {
            str2 = amm.m14203T(keVar.f17678i, l);
            str = aln.m14040j(str2);
        } else {
            str2 = aln.m14037g(keVar.f17678i, keVar2.f17681l);
            str = keVar2.f17681l;
        }
        C4119kd a = keVar2.mo16126a();
        a.mo16107S(keVar.f17670a);
        a.mo16109U(keVar.f17671b);
        a.mo16110V(keVar.f17672c);
        a.mo16122ag(keVar.f17673d);
        a.mo16118ac(keVar.f17674e);
        a.mo16095G(z ? keVar.f17675f : -1);
        a.mo16114Z(z ? keVar.f17676g : -1);
        a.mo16097I(str2);
        a.mo16125aj(keVar.f17686q);
        a.mo16105Q(keVar.f17687r);
        if (str != null) {
            a.mo16120ae(str);
        }
        int i = keVar.f17694y;
        if (i != -1) {
            a.mo16096H(i);
        }
        C4507yn ynVar = keVar.f17679j;
        if (ynVar != null) {
            C4507yn ynVar2 = keVar2.f17679j;
            if (ynVar2 != null) {
                ynVar = ynVar2.mo16833c(ynVar);
            }
            a.mo16112X(ynVar);
        }
        return a.mo16115a();
    }

    /* renamed from: U */
    private static C4305ra m13568U(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new C4305ra();
    }

    /* renamed from: A */
    public final int mo13653A(int i, C4121kf kfVar, C4269ps psVar, int i2) {
        C4120ke keVar;
        if (m13563P()) {
            return -3;
        }
        int i3 = 0;
        if (!this.f14684m.isEmpty()) {
            int i4 = 0;
            loop0:
            while (i4 < this.f14684m.size() - 1) {
                int i5 = this.f14684m.get(i4).f14576a;
                int length = this.f14692u.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (this.f14661M[i6] && this.f14692u[i6].mo13421s() == i5) {
                        break loop0;
                    }
                }
                i4++;
            }
            amm.m14235e(this.f14684m, 0, i4);
            afx afx = this.f14684m.get(0);
            C4120ke keVar2 = afx.f14241f;
            if (!keVar2.equals(this.f14654F)) {
                this.f14681j.mo13341o(this.f14674c, keVar2, afx.f14242g, afx.f14244i);
            }
            this.f14654F = keVar2;
        }
        if (!this.f14684m.isEmpty() && !this.f14684m.get(0).mo13635k()) {
            return -3;
        }
        int z = this.f14692u[i].mo13428z(kfVar, psVar, i2, this.f14667S);
        if (z == -5) {
            C4120ke keVar3 = kfVar.f17697b;
            aup.m14890u(keVar3);
            if (i == this.f14649A) {
                int s = this.f14692u[i].mo13421s();
                while (i3 < this.f14684m.size() && this.f14684m.get(i3).f14576a != s) {
                    i3++;
                }
                if (i3 < this.f14684m.size()) {
                    keVar = this.f14684m.get(i3).f14241f;
                } else {
                    keVar = this.f14653E;
                    aup.m14890u(keVar);
                }
                keVar3 = keVar3.mo16127b(keVar);
            }
            kfVar.f17697b = keVar3;
        }
        return z;
    }

    /* renamed from: B */
    public final int mo13654B(int i, long j) {
        int i2 = 0;
        if (m13563P()) {
            return 0;
        }
        agh agh = this.f14692u[i];
        int C = agh.mo13393C(j, this.f14667S);
        int r = agh.mo13420r();
        while (true) {
            if (i2 >= this.f14684m.size()) {
                break;
            }
            afx afx = this.f14684m.get(i2);
            int d = this.f14684m.get(i2).mo13633d(i);
            if (r + C <= d) {
                break;
            } else if (!afx.mo13635k()) {
                C = d - r;
                break;
            } else {
                i2++;
            }
        }
        agh.mo13394D(C);
        return C;
    }

    /* renamed from: C */
    public final void mo13655C() {
        this.f14694w.clear();
    }

    /* renamed from: D */
    public final void mo13656D(long j) {
        if (this.f14669U != j) {
            this.f14669U = j;
            for (agh G : this.f14692u) {
                G.mo13397G(j);
            }
        }
    }

    /* renamed from: E */
    public final void mo13657E(C4276pz pzVar) {
        if (!amm.m14233c(this.f14670V, pzVar)) {
            this.f14670V = pzVar;
            int i = 0;
            while (true) {
                agh[] aghArr = this.f14692u;
                if (i < aghArr.length) {
                    if (this.f14662N[i]) {
                        aghArr[i].mo13652P(pzVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ void mo13659G() {
        this.f14650B = true;
        mo13658F();
    }

    /* renamed from: H */
    public final void mo13660H(long j) {
        if (this.f14650B && !m13563P()) {
            int length = this.f14692u.length;
            for (int i = 0; i < length; i++) {
                this.f14692u[i].mo13402N(j, this.f14661M[i]);
            }
        }
    }

    /* renamed from: I */
    public final void mo13361I() {
        this.f14688q.post(this.f14686o);
    }

    /* renamed from: J */
    public final void mo13661J(aco[] acoArr, int... iArr) {
        this.f14656H = m13561N(acoArr);
        this.f14657I = new HashSet();
        for (int a : iArr) {
            this.f14657I.add(this.f14656H.mo13453a(a));
        }
        this.f14659K = 0;
        this.f14688q.post(agd.m13542a(this.f14675d));
        m13564Q();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.google.ads.interactivemedia.v3.internal.ra] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* renamed from: ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p038v3.internal.C4327rw mo13362ba(int r12, int r13) {
        /*
            r11 = this;
            java.util.Set<java.lang.Integer> r0 = f14648b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r2 = r0.contains(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003b
            boolean r0 = r0.contains(r1)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14885p(r0)
            android.util.SparseIntArray r0 = r11.f14695x
            r2 = -1
            int r0 = r0.get(r13, r2)
            if (r0 != r2) goto L_0x001f
            goto L_0x004d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r11.f14694w
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L_0x002b
            int[] r1 = r11.f14693v
            r1[r0] = r12
        L_0x002b:
            int[] r1 = r11.f14693v
            r1 = r1[r0]
            if (r1 != r12) goto L_0x0036
            com.google.ads.interactivemedia.v3.internal.agh[] r1 = r11.f14692u
            r3 = r1[r0]
            goto L_0x004d
        L_0x0036:
            com.google.ads.interactivemedia.v3.internal.ra r3 = m13568U(r12, r13)
            goto L_0x004d
        L_0x003b:
            r0 = 0
        L_0x003c:
            com.google.ads.interactivemedia.v3.internal.agh[] r1 = r11.f14692u
            int r2 = r1.length
            if (r0 >= r2) goto L_0x004d
            int[] r2 = r11.f14693v
            r2 = r2[r0]
            if (r2 != r12) goto L_0x004a
            r3 = r1[r0]
            goto L_0x004d
        L_0x004a:
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004d:
            if (r3 != 0) goto L_0x00dc
            boolean r0 = r11.f14668T
            if (r0 != 0) goto L_0x00d7
            com.google.ads.interactivemedia.v3.internal.agh[] r0 = r11.f14692u
            int r0 = r0.length
            r1 = 2
            r2 = 1
            if (r13 == r2) goto L_0x005f
            if (r13 != r1) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r1 = r13
            goto L_0x0061
        L_0x005f:
            r1 = r13
        L_0x0060:
            r4 = 1
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.agh r3 = new com.google.ads.interactivemedia.v3.internal.agh
            com.google.ads.interactivemedia.v3.internal.ajl r6 = r11.f14672X
            android.os.Handler r2 = r11.f14688q
            android.os.Looper r7 = r2.getLooper()
            com.google.ads.interactivemedia.v3.internal.qi r8 = r11.f14678g
            com.google.ads.interactivemedia.v3.internal.qd r9 = r11.f14679h
            java.util.Map<java.lang.String, com.google.ads.interactivemedia.v3.internal.pz> r10 = r11.f14690s
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x007c
            com.google.ads.interactivemedia.v3.internal.pz r2 = r11.f14670V
            r3.mo13652P(r2)
        L_0x007c:
            long r5 = r11.f14669U
            r3.mo13397G(r5)
            com.google.ads.interactivemedia.v3.internal.afx r2 = r11.f14671W
            if (r2 == 0) goto L_0x0088
            r3.mo13651O(r2)
        L_0x0088:
            r3.mo13398H(r11)
            int r2 = r0 + 1
            int[] r5 = r11.f14693v
            int[] r5 = java.util.Arrays.copyOf(r5, r2)
            r11.f14693v = r5
            r5[r0] = r12
            com.google.ads.interactivemedia.v3.internal.agh[] r12 = r11.f14692u
            java.lang.Object[] r12 = com.google.ads.interactivemedia.p038v3.internal.amm.m14239i(r12, r3)
            com.google.ads.interactivemedia.v3.internal.agh[] r12 = (com.google.ads.interactivemedia.p038v3.internal.agh[]) r12
            r11.f14692u = r12
            boolean[] r12 = r11.f14662N
            boolean[] r12 = java.util.Arrays.copyOf(r12, r2)
            r11.f14662N = r12
            r12[r0] = r4
            boolean r12 = r11.f14660L
            r12 = r12 | r4
            r11.f14660L = r12
            java.util.Set<java.lang.Integer> r12 = r11.f14694w
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r12.add(r4)
            android.util.SparseIntArray r12 = r11.f14695x
            r12.append(r1, r0)
            int r12 = m13566S(r1)
            int r4 = r11.f14697z
            int r4 = m13566S(r4)
            if (r12 <= r4) goto L_0x00ce
            r11.f14649A = r0
            r11.f14697z = r1
        L_0x00ce:
            boolean[] r12 = r11.f14661M
            boolean[] r12 = java.util.Arrays.copyOf(r12, r2)
            r11.f14661M = r12
            goto L_0x00dc
        L_0x00d7:
            com.google.ads.interactivemedia.v3.internal.ra r12 = m13568U(r12, r13)
            return r12
        L_0x00dc:
            r12 = 5
            if (r13 != r12) goto L_0x00ef
            com.google.ads.interactivemedia.v3.internal.rw r12 = r11.f14696y
            if (r12 != 0) goto L_0x00ec
            com.google.ads.interactivemedia.v3.internal.agg r12 = new com.google.ads.interactivemedia.v3.internal.agg
            int r13 = r11.f14682k
            r12.<init>(r3, r13)
            r11.f14696y = r12
        L_0x00ec:
            com.google.ads.interactivemedia.v3.internal.rw r12 = r11.f14696y
            return r12
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.agi.mo13362ba(int, int):com.google.ads.interactivemedia.v3.internal.rw");
    }

    /* renamed from: bb */
    public final void mo13363bb() {
        this.f14668T = true;
        this.f14688q.post(this.f14687p);
    }

    /* renamed from: bc */
    public final void mo13364bc(C4324rt rtVar) {
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        if (!this.f14680i.mo13841c() && !m13563P()) {
            if (this.f14680i.mo13844f()) {
                aup.m14890u(this.f14691t);
                this.f14676e.mo13631n(j, this.f14691t, this.f14685n);
                return;
            }
            int size = this.f14685n.size();
            while (size > 0) {
                int i = size - 1;
                if (this.f14676e.mo13624g(this.f14685n.get(i)) != 2) {
                    break;
                }
                size = i;
            }
            if (size < this.f14685n.size()) {
                m13558K(size);
            }
            int m = this.f14676e.mo13630m(j, this.f14685n);
            if (m < this.f14684m.size()) {
                m13558K(m);
            }
        }
    }

    /* renamed from: d */
    public final void mo13662d() {
        if (!this.f14651C) {
            mo13240m(this.f14663O);
        }
    }

    /* renamed from: f */
    public final void mo13663f() throws IOException {
        mo13675z();
        if (this.f14667S && !this.f14651C) {
            throw new C4144lb("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: g */
    public final long mo13234g() {
        if (this.f14667S) {
            return Long.MIN_VALUE;
        }
        if (m13563P()) {
            return this.f14664P;
        }
        long j = this.f14663O;
        afx O = m13562O();
        if (!O.mo13503j()) {
            if (this.f14684m.size() > 1) {
                ArrayList<afx> arrayList = this.f14684m;
                O = arrayList.get(arrayList.size() - 2);
            } else {
                O = null;
            }
        }
        if (O != null) {
            j = Math.max(j, O.f14245j);
        }
        if (this.f14650B) {
            for (agh u : this.f14692u) {
                j = Math.max(j, u.mo13423u());
            }
        }
        return j;
    }

    /* renamed from: h */
    public final acq mo13664h() {
        m13565R();
        return this.f14656H;
    }

    /* renamed from: i */
    public final int mo13665i(int i) {
        m13565R();
        aup.m14890u(this.f14658J);
        int i2 = this.f14658J[i];
        if (i2 != -1) {
            boolean[] zArr = this.f14661M;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.f14657I.contains(this.f14656H.mo13453a(i))) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: j */
    public final void mo13666j(int i) {
        m13565R();
        aup.m14890u(this.f14658J);
        int i2 = this.f14658J[i];
        aup.m14887r(this.f14661M[i2]);
        this.f14661M[i2] = false;
    }

    /* renamed from: k */
    public final long mo13238k() {
        if (m13563P()) {
            return this.f14664P;
        }
        if (this.f14667S) {
            return Long.MIN_VALUE;
        }
        return m13562O().f14245j;
    }

    /* renamed from: l */
    public final void mo13366l() {
        for (agh g : this.f14692u) {
            g.mo13409g();
        }
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        long j2;
        List<afx> list;
        if (this.f14667S || this.f14680i.mo13844f() || this.f14680i.mo13841c()) {
            return false;
        }
        if (m13563P()) {
            list = Collections.emptyList();
            j2 = this.f14664P;
            for (agh j3 : this.f14692u) {
                j3.mo13412j(this.f14664P);
            }
        } else {
            list = this.f14685n;
            afx O = m13562O();
            if (O.mo13503j()) {
                j2 = O.f14245j;
            } else {
                j2 = Math.max(this.f14663O, O.f14244i);
            }
        }
        List<afx> list2 = list;
        this.f14676e.mo13625h(j, j2, list2, this.f14651C || !list2.isEmpty(), this.f14683l);
        afr afr = this.f14683l;
        boolean z = afr.f14535b;
        ada ada = afr.f14534a;
        Uri uri = afr.f14536c;
        afr.mo13613a();
        if (z) {
            this.f14664P = C6540C.TIME_UNSET;
            this.f14667S = true;
            return true;
        } else if (ada == null) {
            if (uri != null) {
                this.f14675d.mo13639q(uri);
            }
            return false;
        } else {
            if (ada instanceof afx) {
                afx afx = (afx) ada;
                this.f14671W = afx;
                this.f14653E = afx.f14241f;
                this.f14664P = C6540C.TIME_UNSET;
                this.f14684m.add(afx);
                atv s = atz.m14815s();
                for (agh m : this.f14692u) {
                    s.mo14514d(Integer.valueOf(m.mo13415m()));
                }
                afx.mo13632a(this, s.mo14513c());
                for (agh agh : this.f14692u) {
                    agh.mo13651O(afx);
                    if (afx.f14579n) {
                        agh.mo13414l();
                    }
                }
            }
            this.f14691t = ada;
            this.f14680i.mo13843e(ada, this, aup.m14894y(ada.f14240e));
            this.f14681j.mo13345s(new aas(ada.f14239d), ada.f14240e, this.f14674c, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
            return true;
        }
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f14680i.mo13844f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
        if (r14.mo13744q() != r0.f14676e.mo13619b().mo13446b(r1.f14241f)) goto L_0x0118;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0121  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13667o(com.google.ads.interactivemedia.p038v3.internal.aih[] r20, boolean[] r21, com.google.ads.interactivemedia.p038v3.internal.ach[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r24
            r19.m13565R()
            int r5 = r0.f14652D
            r6 = 0
            r7 = 0
        L_0x000f:
            int r8 = r1.length
            r9 = 0
            if (r7 >= r8) goto L_0x002f
            r8 = r2[r7]
            com.google.ads.interactivemedia.v3.internal.agb r8 = (com.google.ads.interactivemedia.p038v3.internal.agb) r8
            if (r8 == 0) goto L_0x002c
            r10 = r1[r7]
            if (r10 == 0) goto L_0x0021
            boolean r10 = r21[r7]
            if (r10 != 0) goto L_0x002c
        L_0x0021:
            int r10 = r0.f14652D
            int r10 = r10 + -1
            r0.f14652D = r10
            r8.mo13648f()
            r2[r7] = r9
        L_0x002c:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x002f:
            r7 = 1
            if (r26 != 0) goto L_0x0042
            boolean r8 = r0.f14666R
            if (r8 == 0) goto L_0x0039
            if (r5 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0039:
            long r10 = r0.f14663O
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r5 = 0
            goto L_0x0043
        L_0x0042:
            r5 = 1
        L_0x0043:
            com.google.ads.interactivemedia.v3.internal.afv r8 = r0.f14676e
            com.google.ads.interactivemedia.v3.internal.aih r8 = r8.mo13621d()
            r14 = r8
            r10 = 0
        L_0x004b:
            int r11 = r1.length
            if (r10 >= r11) goto L_0x009c
            r11 = r1[r10]
            if (r11 != 0) goto L_0x0053
            goto L_0x0099
        L_0x0053:
            com.google.ads.interactivemedia.v3.internal.acq r12 = r0.f14656H
            com.google.ads.interactivemedia.v3.internal.aco r13 = r11.mo13737j()
            int r12 = r12.mo13454b(r13)
            int r13 = r0.f14659K
            if (r12 != r13) goto L_0x0067
            com.google.ads.interactivemedia.v3.internal.afv r13 = r0.f14676e
            r13.mo13620c(r11)
            r14 = r11
        L_0x0067:
            r11 = r2[r10]
            if (r11 != 0) goto L_0x0099
            int r11 = r0.f14652D
            int r11 = r11 + r7
            r0.f14652D = r11
            com.google.ads.interactivemedia.v3.internal.agb r11 = new com.google.ads.interactivemedia.v3.internal.agb
            r11.<init>(r0, r12)
            r2[r10] = r11
            r23[r10] = r7
            int[] r13 = r0.f14658J
            if (r13 == 0) goto L_0x0099
            r11.mo13647a()
            if (r5 != 0) goto L_0x0099
            com.google.ads.interactivemedia.v3.internal.agh[] r5 = r0.f14692u
            int[] r11 = r0.f14658J
            r11 = r11[r12]
            r5 = r5[r11]
            boolean r11 = r5.mo13392B(r3, r7)
            if (r11 != 0) goto L_0x0098
            int r5 = r5.mo13420r()
            if (r5 == 0) goto L_0x0098
            r5 = 1
            goto L_0x0099
        L_0x0098:
            r5 = 0
        L_0x0099:
            int r10 = r10 + 1
            goto L_0x004b
        L_0x009c:
            int r1 = r0.f14652D
            if (r1 != 0) goto L_0x00d2
            com.google.ads.interactivemedia.v3.internal.afv r1 = r0.f14676e
            r1.mo13622e()
            r0.f14654F = r9
            r0.f14665Q = r7
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.afx> r1 = r0.f14684m
            r1.clear()
            com.google.ads.interactivemedia.v3.internal.aki r1 = r0.f14680i
            boolean r1 = r1.mo13844f()
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r0.f14650B
            if (r1 == 0) goto L_0x00c8
            com.google.ads.interactivemedia.v3.internal.agh[] r1 = r0.f14692u
            int r3 = r1.length
            r4 = 0
        L_0x00be:
            if (r4 >= r3) goto L_0x00c8
            r8 = r1[r4]
            r8.mo13396F()
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00c8:
            com.google.ads.interactivemedia.v3.internal.aki r1 = r0.f14680i
            r1.mo13845g()
            goto L_0x0131
        L_0x00ce:
            r19.m13559L()
            goto L_0x0131
        L_0x00d2:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.afx> r1 = r0.f14684m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x011d
            boolean r1 = com.google.ads.interactivemedia.p038v3.internal.amm.m14233c(r14, r8)
            if (r1 != 0) goto L_0x011d
            boolean r1 = r0.f14666R
            if (r1 != 0) goto L_0x0118
            r8 = 0
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00eb
            long r8 = -r3
        L_0x00eb:
            r12 = r8
            com.google.ads.interactivemedia.v3.internal.afx r1 = r19.m13562O()
            com.google.ads.interactivemedia.v3.internal.afv r8 = r0.f14676e
            com.google.ads.interactivemedia.v3.internal.adn[] r17 = r8.mo13629l(r1, r3)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.ads.interactivemedia.v3.internal.afx> r10 = r0.f14685n
            r11 = r14
            r18 = r14
            r14 = r8
            r16 = r10
            r11.mo13617d(r12, r14, r16, r17)
            com.google.ads.interactivemedia.v3.internal.afv r8 = r0.f14676e
            com.google.ads.interactivemedia.v3.internal.aco r8 = r8.mo13619b()
            com.google.ads.interactivemedia.v3.internal.ke r1 = r1.f14241f
            int r1 = r8.mo13446b(r1)
            int r8 = r18.mo13744q()
            if (r8 == r1) goto L_0x011d
        L_0x0118:
            r0.f14665Q = r7
            r1 = 1
            r5 = 1
            goto L_0x011f
        L_0x011d:
            r1 = r26
        L_0x011f:
            if (r5 == 0) goto L_0x0131
            r0.mo13668p(r3, r1)
            r1 = 0
        L_0x0125:
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0131
            r3 = r2[r1]
            if (r3 == 0) goto L_0x012e
            r23[r1] = r7
        L_0x012e:
            int r1 = r1 + 1
            goto L_0x0125
        L_0x0131:
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.agb> r1 = r0.f14689r
            r1.clear()
            int r1 = r2.length
        L_0x0137:
            if (r6 >= r1) goto L_0x0147
            r3 = r2[r6]
            if (r3 == 0) goto L_0x0144
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.agb> r4 = r0.f14689r
            com.google.ads.interactivemedia.v3.internal.agb r3 = (com.google.ads.interactivemedia.p038v3.internal.agb) r3
            r4.add(r3)
        L_0x0144:
            int r6 = r6 + 1
            goto L_0x0137
        L_0x0147:
            r0.f14666R = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.agi.mo13667o(com.google.ads.interactivemedia.v3.internal.aih[], boolean[], com.google.ads.interactivemedia.v3.internal.ach[], boolean[], long, boolean):boolean");
    }

    /* renamed from: p */
    public final boolean mo13668p(long j, boolean z) {
        this.f14663O = j;
        if (m13563P()) {
            this.f14664P = j;
            return true;
        }
        if (this.f14650B && !z) {
            int length = this.f14692u.length;
            int i = 0;
            while (i < length) {
                if (this.f14692u[i].mo13392B(j, false) || (!this.f14662N[i] && this.f14660L)) {
                    i++;
                }
            }
            return false;
        }
        this.f14664P = j;
        this.f14667S = false;
        this.f14684m.clear();
        if (this.f14680i.mo13844f()) {
            if (this.f14650B) {
                for (agh F : this.f14692u) {
                    F.mo13396F();
                }
            }
            this.f14680i.mo13845g();
        } else {
            this.f14680i.mo13842d();
            m13559L();
        }
        return true;
    }

    /* renamed from: q */
    public final void mo13669q() {
        if (!this.f14684m.isEmpty()) {
            afx afx = (afx) art.m14630a(this.f14684m);
            int g = this.f14676e.mo13624g(afx);
            if (g == 1) {
                afx.mo13636l();
            } else if (g == 2 && !this.f14667S && this.f14680i.mo13844f()) {
                this.f14680i.mo13845g();
            }
        }
    }

    /* renamed from: r */
    public final void mo13670r() {
        if (this.f14651C) {
            for (agh o : this.f14692u) {
                o.mo13417o();
            }
        }
        this.f14680i.mo13847i(this);
        this.f14688q.removeCallbacksAndMessages((Object) null);
        this.f14655G = true;
        this.f14689r.clear();
    }

    /* renamed from: s */
    public final void mo13671s(boolean z) {
        this.f14676e.mo13623f(z);
    }

    /* renamed from: t */
    public final boolean mo13672t(Uri uri, long j) {
        return this.f14676e.mo13628k(uri, j);
    }

    /* renamed from: u */
    public final boolean mo13673u(int i) {
        return !m13563P() && this.f14692u[i].mo13427y(this.f14667S);
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ akc mo13373v(ake ake, long j, long j2, IOException iOException, int i) {
        akc akc;
        int i2;
        IOException iOException2 = iOException;
        ada ada = (ada) ake;
        boolean z = ada instanceof afx;
        if (z && !((afx) ada).mo13635k() && (iOException2 instanceof ajx) && ((i2 = ((ajx) iOException2).f15123a) == 410 || i2 == 404)) {
            return aki.f15145a;
        }
        long f = ada.mo13482f();
        ada.mo13483g();
        ada.mo13484h();
        aas aas = new aas();
        new aax(ada.f14240e, this.f14674c, ada.f14241f, ada.f14242g, C4083iv.m17451a(ada.f14244i), C4083iv.m17451a(ada.f14245j));
        aka aka = new aka(iOException2, i);
        long x = aup.m14893x(aka);
        boolean z2 = false;
        boolean j3 = x != C6540C.TIME_UNSET ? this.f14676e.mo13627j(ada, x) : false;
        if (j3) {
            if (z && f == 0) {
                ArrayList<afx> arrayList = this.f14684m;
                if (arrayList.remove(arrayList.size() - 1) == ada) {
                    z2 = true;
                }
                aup.m14887r(z2);
                if (this.f14684m.isEmpty()) {
                    this.f14664P = this.f14663O;
                } else {
                    ((afx) art.m14630a(this.f14684m)).mo13634e();
                }
            }
            akc = aki.f15146b;
        } else {
            long z3 = aup.m14895z(aka);
            akc = z3 != C6540C.TIME_UNSET ? aki.m13929b(false, z3) : aki.f15147c;
        }
        akc akc2 = akc;
        boolean z4 = !akc2.mo13834a();
        this.f14681j.mo13344r(aas, ada.f14240e, this.f14674c, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j, iOException, z4);
        if (z4) {
            this.f14691t = null;
        }
        if (j3) {
            if (!this.f14651C) {
                mo13240m(this.f14663O);
            } else {
                this.f14675d.mo13239l(this);
            }
        }
        return akc2;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        ada ada = (ada) ake;
        this.f14691t = null;
        long j3 = ada.f14238c;
        ada.mo13483g();
        ada.mo13484h();
        ada.mo13482f();
        this.f14681j.mo13342p(new aas(), ada.f14240e, this.f14674c, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
        if (!z) {
            if (m13563P() || this.f14652D == 0) {
                m13559L();
            }
            if (this.f14652D > 0) {
                this.f14675d.mo13239l(this);
            }
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        ada ada = (ada) ake;
        this.f14691t = null;
        this.f14676e.mo13626i(ada);
        long j3 = ada.f14238c;
        ada.mo13483g();
        ada.mo13484h();
        ada.mo13482f();
        this.f14681j.mo13343q(new aas(), ada.f14240e, this.f14674c, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
        if (!this.f14651C) {
            mo13240m(this.f14663O);
        } else {
            this.f14675d.mo13239l(this);
        }
    }

    /* renamed from: y */
    public final void mo13674y(int i) throws IOException {
        mo13675z();
        this.f14692u[i].mo13418p();
    }

    /* renamed from: z */
    public final void mo13675z() throws IOException {
        this.f14680i.mo13518a();
        this.f14676e.mo13618a();
    }
}
