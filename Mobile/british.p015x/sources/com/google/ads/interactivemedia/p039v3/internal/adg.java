package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Looper;
import com.google.ads.interactivemedia.p039v3.internal.adh;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adg */
/* compiled from: IMASDK */
public final class adg<T extends adh> implements ach, acj, akb, akf {

    /* renamed from: a */
    public final int f14254a;

    /* renamed from: b */
    boolean f14255b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int[] f14256c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4120ke[] f14257d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean[] f14258e;

    /* renamed from: f */
    private final T f14259f;

    /* renamed from: g */
    private final aci<adg<T>> f14260g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final abj f14261h;

    /* renamed from: i */
    private final aki f14262i = new aki("ChunkSampleStream");

    /* renamed from: j */
    private final add f14263j = new add();

    /* renamed from: k */
    private final ArrayList<acu> f14264k;

    /* renamed from: l */
    private final List<acu> f14265l;

    /* renamed from: m */
    private final acg f14266m;

    /* renamed from: n */
    private final acg[] f14267n;

    /* renamed from: o */
    private final acw f14268o;

    /* renamed from: p */
    private ada f14269p;

    /* renamed from: q */
    private C4120ke f14270q;

    /* renamed from: r */
    private adf<T> f14271r;

    /* renamed from: s */
    private long f14272s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f14273t;

    /* renamed from: u */
    private int f14274u;

    /* renamed from: v */
    private acu f14275v;

    /* renamed from: w */
    private final aup f14276w;

    public adg(int i, int[] iArr, C4120ke[] keVarArr, adh adh, aci aci, ajl ajl, long j, C4286qi qiVar, C4281qd qdVar, aup aup, abj abj, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14254a = i;
        this.f14256c = iArr;
        this.f14257d = keVarArr;
        this.f14259f = adh;
        this.f14260g = aci;
        this.f14261h = abj;
        this.f14276w = aup;
        ArrayList<acu> arrayList = new ArrayList<>();
        this.f14264k = arrayList;
        this.f14265l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f14267n = new acg[length];
        this.f14258e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        acg[] acgArr = new acg[i2];
        Looper myLooper = Looper.myLooper();
        aup.m14890u(myLooper);
        acg M = acg.m13018M(ajl, myLooper, qiVar, qdVar);
        this.f14266m = M;
        int i3 = 0;
        iArr2[0] = i;
        acgArr[0] = M;
        while (i3 < length) {
            acg L = acg.m13017L(ajl);
            this.f14267n[i3] = L;
            int i4 = i3 + 1;
            acgArr[i4] = L;
            iArr2[i4] = this.f14256c[i3];
            i3 = i4;
        }
        this.f14268o = new acw(iArr2, acgArr);
        this.f14272s = j;
        this.f14273t = j;
    }

    /* renamed from: A */
    private final void m13153A() {
        int B = m13154B(this.f14266m.mo13420r(), this.f14274u - 1);
        while (true) {
            int i = this.f14274u;
            if (i <= B) {
                this.f14274u = i + 1;
                acu acu = this.f14264k.get(i);
                C4120ke keVar = acu.f14241f;
                if (!keVar.equals(this.f14270q)) {
                    this.f14261h.mo13341o(this.f14254a, keVar, acu.f14242g, acu.f14244i);
                }
                this.f14270q = keVar;
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    private final int m13154B(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f14264k.size()) {
                return this.f14264k.size() - 1;
            }
        } while (this.f14264k.get(i2).mo13465d(0) <= i);
        return i2 - 1;
    }

    /* renamed from: C */
    private final acu m13155C() {
        ArrayList<acu> arrayList = this.f14264k;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: D */
    private final acu m13156D(int i) {
        acu acu = this.f14264k.get(i);
        ArrayList<acu> arrayList = this.f14264k;
        amm.m14235e(arrayList, i, arrayList.size());
        this.f14274u = Math.max(this.f14274u, this.f14264k.size());
        int i2 = 0;
        this.f14266m.mo13416n(acu.mo13465d(0));
        while (true) {
            acg[] acgArr = this.f14267n;
            if (i2 >= acgArr.length) {
                return acu;
            }
            int i3 = i2 + 1;
            acgArr[i2].mo13416n(acu.mo13465d(i3));
            i2 = i3;
        }
    }

    /* renamed from: y */
    private final void m13162y() {
        this.f14266m.mo13410h();
        for (acg h : this.f14267n) {
            h.mo13410h();
        }
    }

    /* renamed from: z */
    private final boolean m13163z(int i) {
        acu acu = this.f14264k.get(i);
        if (this.f14266m.mo13420r() > acu.mo13465d(0)) {
            return true;
        }
        int i2 = 0;
        while (true) {
            acg[] acgArr = this.f14267n;
            if (i2 >= acgArr.length) {
                return false;
            }
            int i3 = i2 + 1;
            if (acgArr[i2].mo13420r() > acu.mo13465d(i3)) {
                return true;
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    public final ade mo13487a(long j, int i) {
        for (int i2 = 0; i2 < this.f14267n.length; i2++) {
            if (this.f14256c[i2] == i) {
                aup.m14887r(!this.f14258e[i2]);
                this.f14258e[i2] = true;
                this.f14267n[i2].mo13392B(j, true);
                return new ade(this, this, this.f14267n[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean mo13224b() {
        return !mo13492o() && this.f14266m.mo13427y(this.f14255b);
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        if (!this.f14262i.mo13841c() && !mo13492o()) {
            if (this.f14262i.mo13844f()) {
                ada ada = this.f14269p;
                aup.m14890u(ada);
                if (!(ada instanceof acu) || !m13163z(this.f14264k.size() - 1)) {
                    this.f14259f.mo13501h(j, ada, this.f14265l);
                    return;
                }
                return;
            }
            int c = this.f14259f.mo13496c(j, this.f14265l);
            if (c < this.f14264k.size()) {
                aup.m14887r(!this.f14262i.mo13844f());
                int size = this.f14264k.size();
                while (true) {
                    if (c < size) {
                        if (!m13163z(c)) {
                            break;
                        }
                        c++;
                    } else {
                        c = -1;
                        break;
                    }
                }
                if (c != -1) {
                    long j2 = m13155C().f14245j;
                    acu D = m13156D(c);
                    if (this.f14264k.isEmpty()) {
                        this.f14272s = this.f14273t;
                    }
                    this.f14255b = false;
                    this.f14261h.mo13338l(this.f14254a, D.f14244i, j2);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo13225c() throws IOException {
        this.f14262i.mo13518a();
        this.f14266m.mo13418p();
        if (!this.f14262i.mo13844f()) {
            this.f14259f.mo13495b();
        }
    }

    /* renamed from: d */
    public final int mo13226d(C4121kf kfVar, C4269ps psVar, int i) {
        if (mo13492o()) {
            return -3;
        }
        m13153A();
        return this.f14266m.mo13428z(kfVar, psVar, i, this.f14255b);
    }

    /* renamed from: e */
    public final int mo13227e(long j) {
        if (mo13492o()) {
            return 0;
        }
        int C = this.f14266m.mo13393C(j, this.f14255b);
        this.f14266m.mo13394D(C);
        m13153A();
        return C;
    }

    /* renamed from: f */
    public final T mo13488f() {
        return this.f14259f;
    }

    /* renamed from: g */
    public final long mo13234g() {
        if (this.f14255b) {
            return Long.MIN_VALUE;
        }
        if (mo13492o()) {
            return this.f14272s;
        }
        long j = this.f14273t;
        acu C = m13155C();
        if (!C.mo13503j()) {
            if (this.f14264k.size() > 1) {
                ArrayList<acu> arrayList = this.f14264k;
                C = arrayList.get(arrayList.size() - 2);
            } else {
                C = null;
            }
        }
        if (C != null) {
            j = Math.max(j, C.f14245j);
        }
        return Math.max(j, this.f14266m.mo13423u());
    }

    /* renamed from: h */
    public final long mo13489h(long j, C4159lq lqVar) {
        return this.f14259f.mo13494a(j, lqVar);
    }

    /* renamed from: i */
    public final void mo13490i(long j) {
        acu acu;
        boolean z;
        this.f14273t = j;
        if (!mo13492o()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                acu = null;
                if (i2 >= this.f14264k.size()) {
                    break;
                }
                acu acu2 = this.f14264k.get(i2);
                long j2 = acu2.f14244i;
                if (j2 == j && acu2.f14205a == C6540C.TIME_UNSET) {
                    acu = acu2;
                    break;
                } else if (j2 > j) {
                    break;
                } else {
                    i2++;
                }
            }
            if (acu != null) {
                z = this.f14266m.mo13391A(acu.mo13465d(0));
            } else {
                z = this.f14266m.mo13392B(j, j < mo13238k());
            }
            if (z) {
                this.f14274u = m13154B(this.f14266m.mo13420r(), 0);
                acg[] acgArr = this.f14267n;
                int length = acgArr.length;
                while (i < length) {
                    acgArr[i].mo13392B(j, true);
                    i++;
                }
                return;
            }
            this.f14272s = j;
            this.f14255b = false;
            this.f14264k.clear();
            this.f14274u = 0;
            if (this.f14262i.mo13844f()) {
                this.f14266m.mo13396F();
                acg[] acgArr2 = this.f14267n;
                int length2 = acgArr2.length;
                while (i < length2) {
                    acgArr2[i].mo13396F();
                    i++;
                }
                this.f14262i.mo13845g();
                return;
            }
            this.f14262i.mo13842d();
            m13162y();
            return;
        }
        this.f14272s = j;
    }

    /* renamed from: j */
    public final void mo13491j(adf<T> adf) {
        this.f14271r = adf;
        this.f14266m.mo13417o();
        for (acg o : this.f14267n) {
            o.mo13417o();
        }
        this.f14262i.mo13847i(this);
    }

    /* renamed from: k */
    public final long mo13238k() {
        if (mo13492o()) {
            return this.f14272s;
        }
        if (this.f14255b) {
            return Long.MIN_VALUE;
        }
        return m13155C().f14245j;
    }

    /* renamed from: l */
    public final void mo13366l() {
        this.f14266m.mo13409g();
        for (acg g : this.f14267n) {
            g.mo13409g();
        }
        this.f14259f.mo13500g();
        adf<T> adf = this.f14271r;
        if (adf != null) {
            adf.mo13486j(this);
        }
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        long j2;
        List<acu> list;
        if (this.f14255b || this.f14262i.mo13844f() || this.f14262i.mo13841c()) {
            return false;
        }
        boolean o = mo13492o();
        if (o) {
            list = Collections.emptyList();
            j2 = this.f14272s;
        } else {
            list = this.f14265l;
            j2 = m13155C().f14245j;
        }
        this.f14259f.mo13497d(j, j2, list, this.f14263j);
        add add = this.f14263j;
        boolean z = add.f14248b;
        ada ada = add.f14247a;
        add.f14247a = null;
        add.f14248b = false;
        if (z) {
            this.f14272s = C6540C.TIME_UNSET;
            this.f14255b = true;
            return true;
        } else if (ada == null) {
            return false;
        } else {
            this.f14269p = ada;
            if (ada instanceof acu) {
                acu acu = (acu) ada;
                if (o) {
                    long j3 = acu.f14244i;
                    long j4 = this.f14272s;
                    if (j3 != j4) {
                        this.f14266m.mo13412j(j4);
                        for (acg j5 : this.f14267n) {
                            j5.mo13412j(this.f14272s);
                        }
                    }
                    this.f14272s = C6540C.TIME_UNSET;
                }
                acu.mo13464a(this.f14268o);
                this.f14264k.add(acu);
            } else if (ada instanceof adk) {
                ((adk) ada).mo13506a(this.f14268o);
            }
            this.f14262i.mo13843e(ada, this, aup.m14894y(ada.f14240e));
            this.f14261h.mo13345s(new aas(ada.f14239d), ada.f14240e, this.f14254a, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
            return true;
        }
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f14262i.mo13844f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo13492o() {
        return this.f14272s != C6540C.TIME_UNSET;
    }

    /* renamed from: u */
    public final void mo13493u(long j) {
        if (!mo13492o()) {
            int q = this.f14266m.mo13419q();
            this.f14266m.mo13402N(j, true);
            int q2 = this.f14266m.mo13419q();
            if (q2 > q) {
                long x = this.f14266m.mo13426x();
                int i = 0;
                while (true) {
                    acg[] acgArr = this.f14267n;
                    if (i >= acgArr.length) {
                        break;
                    }
                    acgArr[i].mo13402N(x, this.f14258e[i]);
                    i++;
                }
            }
            int min = Math.min(m13154B(q2, 0), this.f14274u);
            if (min > 0) {
                amm.m14235e(this.f14264k, 0, min);
                this.f14274u -= min;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d8  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.p039v3.internal.akc mo13373v(com.google.ads.interactivemedia.p039v3.internal.ake r26, long r27, long r29, java.io.IOException r31, int r32) {
        /*
            r25 = this;
            r0 = r25
            r7 = r26
            com.google.ads.interactivemedia.v3.internal.ada r7 = (com.google.ads.interactivemedia.p039v3.internal.ada) r7
            long r1 = r7.mo13482f()
            boolean r8 = r7 instanceof com.google.ads.interactivemedia.p039v3.internal.acu
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.acu> r3 = r0.f14264k
            int r3 = r3.size()
            int r9 = r3 + -1
            r10 = 0
            r11 = 1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0027
            if (r8 == 0) goto L_0x0027
            boolean r1 = r0.m13163z(r9)
            if (r1 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r12 = 0
            goto L_0x0028
        L_0x0027:
            r12 = 1
        L_0x0028:
            com.google.ads.interactivemedia.v3.internal.aas r14 = new com.google.ads.interactivemedia.v3.internal.aas
            r7.mo13483g()
            r7.mo13484h()
            r14.<init>()
            com.google.ads.interactivemedia.v3.internal.aax r15 = new com.google.ads.interactivemedia.v3.internal.aax
            int r1 = r7.f14240e
            int r2 = r0.f14254a
            com.google.ads.interactivemedia.v3.internal.ke r3 = r7.f14241f
            int r4 = r7.f14242g
            long r5 = r7.f14244i
            long r20 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r5)
            long r5 = r7.f14245j
            long r22 = com.google.ads.interactivemedia.p039v3.internal.C4083iv.m17451a(r5)
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r15.<init>(r16, r17, r18, r19, r20, r22)
            com.google.ads.interactivemedia.v3.internal.aka r13 = new com.google.ads.interactivemedia.v3.internal.aka
            r15 = r31
            r1 = r32
            r13.<init>(r15, r1)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 == 0) goto L_0x006a
            long r1 = com.google.ads.interactivemedia.p039v3.internal.aup.m14893x(r13)
            r5 = r1
            goto L_0x006c
        L_0x006a:
            r5 = r16
        L_0x006c:
            T r1 = r0.f14259f
            r2 = r7
            r3 = r12
            r4 = r31
            boolean r1 = r1.mo13499f(r2, r3, r4, r5)
            r2 = 0
            if (r1 == 0) goto L_0x009f
            if (r12 == 0) goto L_0x0098
            com.google.ads.interactivemedia.v3.internal.akc r1 = com.google.ads.interactivemedia.p039v3.internal.aki.f15146b
            if (r8 == 0) goto L_0x00a0
            com.google.ads.interactivemedia.v3.internal.acu r3 = r0.m13156D(r9)
            if (r3 != r7) goto L_0x0087
            r3 = 1
            goto L_0x0088
        L_0x0087:
            r3 = 0
        L_0x0088:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r3)
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.acu> r3 = r0.f14264k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00a0
            long r3 = r0.f14273t
            r0.f14272s = r3
            goto L_0x00a0
        L_0x0098:
            java.lang.String r1 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r1, r3)
        L_0x009f:
            r1 = r2
        L_0x00a0:
            if (r1 != 0) goto L_0x00b1
            long r3 = com.google.ads.interactivemedia.p039v3.internal.aup.m14895z(r13)
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x00af
            com.google.ads.interactivemedia.v3.internal.akc r1 = com.google.ads.interactivemedia.p039v3.internal.aki.m13929b(r10, r3)
            goto L_0x00b1
        L_0x00af:
            com.google.ads.interactivemedia.v3.internal.akc r1 = com.google.ads.interactivemedia.p039v3.internal.aki.f15147c
        L_0x00b1:
            boolean r3 = r1.mo13834a()
            r3 = r3 ^ r11
            com.google.ads.interactivemedia.v3.internal.abj r13 = r0.f14261h
            int r4 = r7.f14240e
            int r5 = r0.f14254a
            com.google.ads.interactivemedia.v3.internal.ke r6 = r7.f14241f
            int r8 = r7.f14242g
            long r9 = r7.f14244i
            long r11 = r7.f14245j
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r8
            r19 = r9
            r21 = r11
            r23 = r31
            r24 = r3
            r13.mo13344r(r14, r15, r16, r17, r18, r19, r21, r23, r24)
            if (r3 == 0) goto L_0x00df
            r0.f14269p = r2
            com.google.ads.interactivemedia.v3.internal.aci<com.google.ads.interactivemedia.v3.internal.adg<T>> r2 = r0.f14260g
            r2.mo13239l(r0)
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.adg.mo13373v(com.google.ads.interactivemedia.v3.internal.ake, long, long, java.io.IOException, int):com.google.ads.interactivemedia.v3.internal.akc");
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        ada ada = (ada) ake;
        this.f14269p = null;
        this.f14275v = null;
        long j3 = ada.f14238c;
        ada.mo13483g();
        ada.mo13484h();
        ada.mo13482f();
        this.f14261h.mo13342p(new aas(), ada.f14240e, this.f14254a, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
        if (!z) {
            if (mo13492o()) {
                m13162y();
            } else if (ada instanceof acu) {
                m13156D(this.f14264k.size() - 1);
                if (this.f14264k.isEmpty()) {
                    this.f14272s = this.f14273t;
                }
            }
            this.f14260g.mo13239l(this);
        }
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        ada ada = (ada) ake;
        this.f14269p = null;
        this.f14259f.mo13498e(ada);
        long j3 = ada.f14238c;
        ada.mo13483g();
        ada.mo13484h();
        ada.mo13482f();
        this.f14261h.mo13343q(new aas(), ada.f14240e, this.f14254a, ada.f14241f, ada.f14242g, ada.f14244i, ada.f14245j);
        this.f14260g.mo13239l(this);
    }
}
