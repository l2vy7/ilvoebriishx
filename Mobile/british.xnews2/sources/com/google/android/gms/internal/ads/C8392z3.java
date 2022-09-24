package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8392z3 implements vb4 {

    /* renamed from: q */
    public static final cc4 f42302q = C8284w3.f40685b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<ay2> f42303a;

    /* renamed from: b */
    private final uq2 f42304b;

    /* renamed from: c */
    private final SparseIntArray f42305c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7596d4 f42306d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray<C7670f4> f42307e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseBooleanArray f42308f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f42309g;

    /* renamed from: h */
    private final C8250v3 f42310h;

    /* renamed from: i */
    private C8213u3 f42311i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public yb4 f42312j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f42313k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f42314l;

    /* renamed from: m */
    private boolean f42315m;

    /* renamed from: n */
    private boolean f42316n;

    /* renamed from: o */
    private int f42317o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f42318p;

    public C8392z3(int i) {
        this(1, 0, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        byte[] h = this.f42304b.mo35238h();
        qb4 qb4 = (qb4) wb4;
        qb4.mo33311e(h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (h[(i2 * TsExtractor.TS_PACKET_SIZE) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            qb4.mo34305k(i, false);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ae, code lost:
        if (r2 == false) goto L_0x01b0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r19, com.google.android.gms.internal.ads.tc4 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.zzc()
            boolean r3 = r0.f42314l
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x00a8
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.v3 r3 = r0.f42310h
            boolean r3 = r3.mo35354d()
            if (r3 == 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            com.google.android.gms.internal.ads.v3 r3 = r0.f42310h
            int r4 = r0.f42318p
            int r1 = r3.mo35351a(r1, r2, r4)
            return r1
        L_0x0028:
            boolean r3 = r0.f42315m
            r7 = 0
            if (r3 != 0) goto L_0x007d
            r0.f42315m = r15
            com.google.android.gms.internal.ads.v3 r3 = r0.f42310h
            long r3 = r3.mo35352b()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.u3 r9 = new com.google.android.gms.internal.ads.u3
            com.google.android.gms.internal.ads.v3 r3 = r0.f42310h
            com.google.android.gms.internal.ads.ay2 r4 = r3.mo35353c()
            com.google.android.gms.internal.ads.v3 r3 = r0.f42310h
            long r5 = r3.mo35352b()
            int r3 = r0.f42318p
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.f42311i = r15
            com.google.android.gms.internal.ads.yb4 r3 = r0.f42312j
            com.google.android.gms.internal.ads.wc4 r4 = r15.mo33521b()
            r3.mo18210l(r4)
            goto L_0x007e
        L_0x006b:
            r13 = r7
            com.google.android.gms.internal.ads.yb4 r3 = r0.f42312j
            com.google.android.gms.internal.ads.vc4 r4 = new com.google.android.gms.internal.ads.vc4
            com.google.android.gms.internal.ads.v3 r5 = r0.f42310h
            long r5 = r5.mo35352b()
            r4.<init>(r5, r13)
            r3.mo18210l(r4)
            goto L_0x007e
        L_0x007d:
            r13 = r7
        L_0x007e:
            boolean r3 = r0.f42316n
            if (r3 == 0) goto L_0x0095
            r3 = 0
            r0.f42316n = r3
            r0.mo18191f(r13, r13)
            long r4 = r19.zze()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r2.f39386a = r13
            r1 = 1
            return r1
        L_0x0095:
            r3 = 0
        L_0x0096:
            com.google.android.gms.internal.ads.u3 r4 = r0.f42311i
            if (r4 == 0) goto L_0x00a9
            boolean r4 = r4.mo33524e()
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            com.google.android.gms.internal.ads.u3 r3 = r0.f42311i
            int r1 = r3.mo33520a(r1, r2)
            return r1
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f42304b
            byte[] r2 = r2.mo35238h()
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            int r4 = r4.mo35241k()
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 < r5) goto L_0x00bc
            goto L_0x00d2
        L_0x00bc:
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            int r4 = r4.mo35239i()
            if (r4 <= 0) goto L_0x00cd
            com.google.android.gms.internal.ads.uq2 r6 = r0.f42304b
            int r6 = r6.mo35241k()
            java.lang.System.arraycopy(r2, r6, r2, r3, r4)
        L_0x00cd:
            com.google.android.gms.internal.ads.uq2 r6 = r0.f42304b
            r6.mo35234d(r2, r4)
        L_0x00d2:
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            int r4 = r4.mo35239i()
            r6 = -1
            if (r4 >= r5) goto L_0x00f1
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            int r4 = r4.mo35242l()
            int r7 = 9400 - r4
            int r7 = r1.mo30477b(r2, r4, r7)
            if (r7 != r6) goto L_0x00ea
            return r6
        L_0x00ea:
            com.google.android.gms.internal.ads.uq2 r6 = r0.f42304b
            int r4 = r4 + r7
            r6.mo35235e(r4)
            goto L_0x00d2
        L_0x00f1:
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            int r1 = r1.mo35241k()
            com.google.android.gms.internal.ads.uq2 r2 = r0.f42304b
            int r2 = r2.mo35242l()
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            byte[] r4 = r4.mo35238h()
            int r4 = com.google.android.gms.internal.ads.C7707g4.m32350a(r4, r1, r2)
            com.google.android.gms.internal.ads.uq2 r5 = r0.f42304b
            r5.mo35236f(r4)
            int r5 = r4 + 188
            if (r5 <= r2) goto L_0x0117
            int r2 = r0.f42317o
            int r4 = r4 - r1
            int r2 = r2 + r4
            r0.f42317o = r2
            goto L_0x0119
        L_0x0117:
            r0.f42317o = r3
        L_0x0119:
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            int r1 = r1.mo35242l()
            if (r5 <= r1) goto L_0x0122
            return r3
        L_0x0122:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f42304b
            int r2 = r2.mo35243m()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0133
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            r1.mo35236f(r5)
            return r3
        L_0x0133:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x013a
            r10 = 1
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            int r4 = r2 >> 8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = r2 & 32
            r8 = r2 & 16
            if (r8 == 0) goto L_0x014e
            android.util.SparseArray<com.google.android.gms.internal.ads.f4> r8 = r0.f42307e
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.f4 r8 = (com.google.android.gms.internal.ads.C7670f4) r8
            goto L_0x014f
        L_0x014e:
            r8 = 0
        L_0x014f:
            if (r8 != 0) goto L_0x0157
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            r1.mo35236f(r5)
            return r3
        L_0x0157:
            r2 = r2 & 15
            android.util.SparseIntArray r9 = r0.f42305c
            int r13 = r2 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.f42305c
            r13.put(r4, r2)
            if (r9 != r2) goto L_0x016e
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            r1.mo35236f(r5)
            return r3
        L_0x016e:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r2 == r9) goto L_0x0177
            r8.zzc()
        L_0x0177:
            if (r7 == 0) goto L_0x0193
            com.google.android.gms.internal.ads.uq2 r2 = r0.f42304b
            int r2 = r2.mo35249s()
            com.google.android.gms.internal.ads.uq2 r7 = r0.f42304b
            int r7 = r7.mo35249s()
            r7 = r7 & 64
            if (r7 == 0) goto L_0x018b
            r7 = 2
            goto L_0x018c
        L_0x018b:
            r7 = 0
        L_0x018c:
            r10 = r10 | r7
            com.google.android.gms.internal.ads.uq2 r7 = r0.f42304b
            int r2 = r2 + r6
            r7.mo35237g(r2)
        L_0x0193:
            boolean r2 = r0.f42314l
            if (r2 != 0) goto L_0x019f
            android.util.SparseBooleanArray r6 = r0.f42309g
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x01b0
        L_0x019f:
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            r4.mo35235e(r5)
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            r8.mo31720a(r4, r10)
            com.google.android.gms.internal.ads.uq2 r4 = r0.f42304b
            r4.mo35235e(r1)
            if (r2 != 0) goto L_0x01bd
        L_0x01b0:
            boolean r1 = r0.f42314l
            if (r1 == 0) goto L_0x01bd
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01bd
            r1 = 1
            r0.f42316n = r1
        L_0x01bd:
            com.google.android.gms.internal.ads.uq2 r1 = r0.f42304b
            r1.mo35236f(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8392z3.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f42312j = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        C8213u3 u3Var;
        int size = this.f42303a.size();
        for (int i = 0; i < size; i++) {
            ay2 ay2 = this.f42303a.get(i);
            if (ay2.mo30576e() != C6540C.TIME_UNSET) {
                long c = ay2.mo30574c();
                if (c != C6540C.TIME_UNSET) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            ay2.mo30577f(j2);
        }
        if (!(j2 == 0 || (u3Var = this.f42311i) == null)) {
            u3Var.mo33523d(j2);
        }
        this.f42304b.mo35233c(0);
        this.f42305c.clear();
        for (int i2 = 0; i2 < this.f42307e.size(); i2++) {
            this.f42307e.valueAt(i2).zzc();
        }
        this.f42317o = 0;
    }

    public C8392z3(int i, int i2, int i3) {
        ay2 ay2 = new ay2(0);
        this.f42306d = new C7964n2(0);
        this.f42303a = Collections.singletonList(ay2);
        this.f42304b = new uq2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f42308f = sparseBooleanArray;
        this.f42309g = new SparseBooleanArray();
        SparseArray<C7670f4> sparseArray = new SparseArray<>();
        this.f42307e = sparseArray;
        this.f42305c = new SparseIntArray();
        this.f42310h = new C8250v3(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.f42312j = yb4.f41780c0;
        this.f42318p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f42307e.put(sparseArray2.keyAt(i4), (C7670f4) sparseArray2.valueAt(i4));
        }
        this.f42307e.put(0, new C8108r3(new C8320x3(this)));
    }
}
