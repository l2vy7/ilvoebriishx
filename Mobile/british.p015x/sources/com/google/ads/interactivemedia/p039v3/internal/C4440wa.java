package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wa */
/* compiled from: IMASDK */
final class C4440wa {

    /* renamed from: a */
    private final C4327rw f19319a;

    /* renamed from: b */
    private final boolean f19320b;

    /* renamed from: c */
    private final boolean f19321c;

    /* renamed from: d */
    private final SparseArray<alp> f19322d = new SparseArray<>();

    /* renamed from: e */
    private final SparseArray<alo> f19323e = new SparseArray<>();

    /* renamed from: f */
    private final alx f19324f;

    /* renamed from: g */
    private byte[] f19325g;

    /* renamed from: h */
    private int f19326h;

    /* renamed from: i */
    private int f19327i;

    /* renamed from: j */
    private long f19328j;

    /* renamed from: k */
    private boolean f19329k;

    /* renamed from: l */
    private long f19330l;

    /* renamed from: m */
    private C4438vz f19331m = new C4438vz((byte[]) null);

    /* renamed from: n */
    private C4438vz f19332n = new C4438vz((byte[]) null);

    /* renamed from: o */
    private boolean f19333o;

    /* renamed from: p */
    private long f19334p;

    /* renamed from: q */
    private long f19335q;

    /* renamed from: r */
    private boolean f19336r;

    public C4440wa(C4327rw rwVar, boolean z, boolean z2) {
        this.f19319a = rwVar;
        this.f19320b = z;
        this.f19321c = z2;
        byte[] bArr = new byte[128];
        this.f19325g = bArr;
        this.f19324f = new alx(bArr, 0, 0);
        mo16733d();
    }

    /* renamed from: a */
    public final boolean mo16730a() {
        return this.f19321c;
    }

    /* renamed from: b */
    public final void mo16731b(alp alp) {
        this.f19322d.append(alp.f15223d, alp);
    }

    /* renamed from: c */
    public final void mo16732c(alo alo) {
        this.f19323e.append(alo.f15217a, alo);
    }

    /* renamed from: d */
    public final void mo16733d() {
        this.f19329k = false;
        this.f19333o = false;
        this.f19332n.mo16724a();
    }

    /* renamed from: e */
    public final void mo16734e(long j, int i, long j2) {
        this.f19327i = i;
        this.f19330l = j2;
        this.f19328j = j;
        if (!this.f19320b || i != 1) {
            if (!this.f19321c) {
                return;
            }
            if (!(i == 5 || i == 1 || i == 2)) {
                return;
            }
        }
        C4438vz vzVar = this.f19331m;
        this.f19331m = this.f19332n;
        this.f19332n = vzVar;
        vzVar.mo16724a();
        this.f19326h = 0;
        this.f19329k = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16735f(byte[] r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r0.f19329k
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = r23 - r1
            byte[] r3 = r0.f19325g
            int r4 = r3.length
            int r5 = r0.f19326h
            int r5 = r5 + r2
            if (r4 >= r5) goto L_0x001a
            int r5 = r5 + r5
            byte[] r3 = java.util.Arrays.copyOf(r3, r5)
            r0.f19325g = r3
        L_0x001a:
            byte[] r3 = r0.f19325g
            int r4 = r0.f19326h
            r5 = r21
            java.lang.System.arraycopy(r5, r1, r3, r4, r2)
            int r1 = r0.f19326h
            int r1 = r1 + r2
            r0.f19326h = r1
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            byte[] r3 = r0.f19325g
            r4 = 0
            r2.mo13969a(r3, r4, r1)
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            r2 = 8
            boolean r1 = r1.mo13972d(r2)
            if (r1 != 0) goto L_0x003b
            return
        L_0x003b:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            r1.mo13970b()
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            r2 = 2
            int r7 = r1.mo13974f(r2)
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            r3 = 5
            r1.mo13971c(r3)
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            boolean r1 = r1.mo13975g()
            if (r1 != 0) goto L_0x0056
            return
        L_0x0056:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            r1.mo13976h()
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            boolean r1 = r1.mo13975g()
            if (r1 != 0) goto L_0x0064
            return
        L_0x0064:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            int r8 = r1.mo13976h()
            boolean r1 = r0.f19321c
            if (r1 != 0) goto L_0x0076
            r0.f19329k = r4
            com.google.ads.interactivemedia.v3.internal.vz r1 = r0.f19332n
            r1.mo16725b(r8)
            return
        L_0x0076:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            boolean r1 = r1.mo13975g()
            if (r1 != 0) goto L_0x007f
            return
        L_0x007f:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            int r10 = r1.mo13976h()
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.alo> r1 = r0.f19323e
            int r1 = r1.indexOfKey(r10)
            if (r1 >= 0) goto L_0x0090
            r0.f19329k = r4
            return
        L_0x0090:
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.alo> r1 = r0.f19323e
            java.lang.Object r1 = r1.get(r10)
            com.google.ads.interactivemedia.v3.internal.alo r1 = (com.google.ads.interactivemedia.p039v3.internal.alo) r1
            android.util.SparseArray<com.google.ads.interactivemedia.v3.internal.alp> r5 = r0.f19322d
            int r6 = r1.f15218b
            java.lang.Object r5 = r5.get(r6)
            r6 = r5
            com.google.ads.interactivemedia.v3.internal.alp r6 = (com.google.ads.interactivemedia.p039v3.internal.alp) r6
            boolean r5 = r6.f15227h
            if (r5 == 0) goto L_0x00b5
            com.google.ads.interactivemedia.v3.internal.alx r5 = r0.f19324f
            boolean r5 = r5.mo13972d(r2)
            if (r5 != 0) goto L_0x00b0
            return
        L_0x00b0:
            com.google.ads.interactivemedia.v3.internal.alx r5 = r0.f19324f
            r5.mo13971c(r2)
        L_0x00b5:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r5 = r6.f15229j
            boolean r2 = r2.mo13972d(r5)
            if (r2 != 0) goto L_0x00c0
            return
        L_0x00c0:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r5 = r6.f15229j
            int r9 = r2.mo13974f(r5)
            boolean r2 = r6.f15228i
            r5 = 1
            if (r2 != 0) goto L_0x00f3
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            boolean r2 = r2.mo13972d(r5)
            if (r2 != 0) goto L_0x00d6
            return
        L_0x00d6:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            boolean r2 = r2.mo13973e()
            if (r2 == 0) goto L_0x00f1
            com.google.ads.interactivemedia.v3.internal.alx r11 = r0.f19324f
            boolean r11 = r11.mo13972d(r5)
            if (r11 != 0) goto L_0x00e7
            return
        L_0x00e7:
            com.google.ads.interactivemedia.v3.internal.alx r11 = r0.f19324f
            boolean r11 = r11.mo13973e()
            r13 = r11
            r12 = 1
            r11 = r2
            goto L_0x00f6
        L_0x00f1:
            r11 = r2
            goto L_0x00f4
        L_0x00f3:
            r11 = 0
        L_0x00f4:
            r12 = 0
            r13 = 0
        L_0x00f6:
            int r2 = r0.f19327i
            if (r2 != r3) goto L_0x00fc
            r14 = 1
            goto L_0x00fd
        L_0x00fc:
            r14 = 0
        L_0x00fd:
            if (r14 == 0) goto L_0x0110
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            boolean r2 = r2.mo13975g()
            if (r2 != 0) goto L_0x0108
            return
        L_0x0108:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r2 = r2.mo13976h()
            r15 = r2
            goto L_0x0111
        L_0x0110:
            r15 = 0
        L_0x0111:
            int r2 = r6.f15230k
            if (r2 != 0) goto L_0x0145
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r3 = r6.f15231l
            boolean r2 = r2.mo13972d(r3)
            if (r2 != 0) goto L_0x0120
            return
        L_0x0120:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r3 = r6.f15231l
            int r2 = r2.mo13974f(r3)
            boolean r1 = r1.f15219c
            if (r1 == 0) goto L_0x0142
            if (r11 != 0) goto L_0x0142
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            boolean r1 = r1.mo13975g()
            if (r1 != 0) goto L_0x0137
            return
        L_0x0137:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            int r1 = r1.mo13977i()
            r17 = r1
            r16 = r2
            goto L_0x0183
        L_0x0142:
            r16 = r2
            goto L_0x0181
        L_0x0145:
            if (r2 != r5) goto L_0x017f
            boolean r2 = r6.f15232m
            if (r2 != 0) goto L_0x017f
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            boolean r2 = r2.mo13975g()
            if (r2 != 0) goto L_0x0154
            return
        L_0x0154:
            com.google.ads.interactivemedia.v3.internal.alx r2 = r0.f19324f
            int r2 = r2.mo13977i()
            boolean r1 = r1.f15219c
            if (r1 == 0) goto L_0x0178
            if (r11 != 0) goto L_0x0178
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            boolean r1 = r1.mo13975g()
            if (r1 != 0) goto L_0x0169
            return
        L_0x0169:
            com.google.ads.interactivemedia.v3.internal.alx r1 = r0.f19324f
            int r1 = r1.mo13977i()
            r19 = r1
            r18 = r2
            r16 = 0
            r17 = 0
            goto L_0x0187
        L_0x0178:
            r18 = r2
            r16 = 0
            r17 = 0
            goto L_0x0185
        L_0x017f:
            r16 = 0
        L_0x0181:
            r17 = 0
        L_0x0183:
            r18 = 0
        L_0x0185:
            r19 = 0
        L_0x0187:
            com.google.ads.interactivemedia.v3.internal.vz r5 = r0.f19332n
            r5.mo16726c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.f19329k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4440wa.mo16735f(byte[], int, int):void");
    }

    /* renamed from: g */
    public final boolean mo16736g(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f19327i == 9 || (this.f19321c && C4438vz.m19307e(this.f19332n, this.f19331m))) {
            if (z && this.f19333o) {
                long j2 = this.f19328j;
                boolean z4 = this.f19336r;
                long j3 = this.f19334p;
                this.f19319a.mo13404b(this.f19335q, z4 ? 1 : 0, (int) (j2 - j3), i + ((int) (j - j2)), (C4326rv) null);
            }
            this.f19334p = this.f19328j;
            this.f19335q = this.f19330l;
            this.f19336r = false;
            this.f19333o = true;
        }
        boolean d = this.f19320b ? this.f19332n.mo16727d() : z2;
        boolean z5 = this.f19336r;
        int i2 = this.f19327i;
        if (i2 == 5 || (d && i2 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f19336r = z6;
        return z6;
    }
}
