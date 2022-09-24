package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7999o1 implements C8248v1 {

    /* renamed from: a */
    private final C8211u1 f36219a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f36220b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f36221c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4607b2 f36222d;

    /* renamed from: e */
    private int f36223e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f36224f;

    /* renamed from: g */
    private long f36225g;

    /* renamed from: h */
    private long f36226h;

    /* renamed from: i */
    private long f36227i;

    /* renamed from: j */
    private long f36228j;

    /* renamed from: k */
    private long f36229k;

    /* renamed from: l */
    private long f36230l;

    public C7999o1(C4607b2 b2Var, long j, long j2, long j3, long j4, boolean z) {
        nu1.m20745d(j >= 0 && j2 > j);
        this.f36222d = b2Var;
        this.f36220b = j;
        this.f36221c = j2;
        if (j3 == j2 - j || z) {
            this.f36224f = j4;
            this.f36223e = 4;
        } else {
            this.f36223e = 0;
        }
        this.f36219a = new C8211u1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30290a(com.google.android.gms.internal.ads.wb4 r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f36223e
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00fe
            if (r2 == r3) goto L_0x0111
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0018
            if (r2 == r10) goto L_0x0015
            return r6
        L_0x0015:
            r2 = r6
            goto L_0x00bf
        L_0x0018:
            long r2 = r0.f36227i
            long r11 = r0.f36228j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0024
        L_0x0020:
            r2 = r6
            r11 = r2
            goto L_0x00b8
        L_0x0024:
            long r2 = r24.zze()
            com.google.android.gms.internal.ads.u1 r11 = r0.f36219a
            long r12 = r0.f36228j
            boolean r11 = r11.mo35081c(r1, r12)
            if (r11 != 0) goto L_0x0043
            long r11 = r0.f36227i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003b
            r2 = r6
            goto L_0x00b8
        L_0x003b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0043:
            com.google.android.gms.internal.ads.u1 r11 = r0.f36219a
            r11.mo35080b(r1, r5)
            r24.zzj()
            long r11 = r0.f36226h
            com.google.android.gms.internal.ads.u1 r13 = r0.f36219a
            long r14 = r13.f39709b
            long r11 = r11 - r14
            int r8 = r13.f39711d
            int r9 = r13.f39712e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x0065
            r18 = 72000(0x11940, double:3.55727E-319)
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x0065
            goto L_0x0020
        L_0x0065:
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x006e
            r0.f36228j = r2
            r0.f36230l = r14
            goto L_0x007c
        L_0x006e:
            long r2 = r24.zze()
            long r13 = (long) r8
            long r2 = r2 + r13
            r0.f36227i = r2
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            long r2 = r2.f39709b
            r0.f36229k = r2
        L_0x007c:
            long r2 = r0.f36228j
            long r13 = r0.f36227i
            long r2 = r2 - r13
            r18 = 100000(0x186a0, double:4.94066E-319)
            int r9 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x008d
            r0.f36228j = r13
            r2 = r6
            r11 = r13
            goto L_0x00b8
        L_0x008d:
            long r2 = (long) r8
            int r8 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x0095
            r8 = 2
            goto L_0x0097
        L_0x0095:
            r8 = 1
        L_0x0097:
            long r13 = r24.zze()
            long r4 = r0.f36228j
            long r6 = r0.f36227i
            long r2 = r2 * r8
            long r13 = r13 - r2
            long r2 = r4 - r6
            long r11 = r11 * r2
            long r2 = r0.f36230l
            long r8 = r0.f36229k
            long r2 = r2 - r8
            long r11 = r11 / r2
            long r17 = r13 + r11
            r2 = -1
            long r21 = r4 + r2
            r19 = r6
            long r11 = com.google.android.gms.internal.ads.d13.m20290U(r17, r19, r21)
        L_0x00b8:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00bd
            return r11
        L_0x00bd:
            r0.f36223e = r10
        L_0x00bf:
            com.google.android.gms.internal.ads.u1 r4 = r0.f36219a
            r4.mo35081c(r1, r2)
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            r3 = 0
            r2.mo35080b(r1, r3)
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            long r3 = r2.f39709b
            long r5 = r0.f36226h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e1
            r24.zzj()
            r1 = 4
            r0.f36223e = r1
            long r1 = r0.f36229k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00e1:
            r4 = 2
            int r3 = r2.f39711d
            int r2 = r2.f39712e
            r6 = r1
            com.google.android.gms.internal.ads.qb4 r6 = (com.google.android.gms.internal.ads.qb4) r6
            int r3 = r3 + r2
            r2 = 0
            r6.mo34305k(r3, r2)
            long r2 = r24.zze()
            r0.f36227i = r2
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            long r2 = r2.f39709b
            r0.f36229k = r2
            r2 = -1
            goto L_0x00bf
        L_0x00fe:
            long r4 = r24.zze()
            r0.f36225g = r4
            r0.f36223e = r3
            long r6 = r0.f36221c
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0111
            return r6
        L_0x0111:
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            r2.mo35079a()
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            r4 = -1
            boolean r2 = r2.mo35081c(r1, r4)
            if (r2 == 0) goto L_0x0174
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            r4 = 0
            r2.mo35080b(r1, r4)
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            int r5 = r2.f39711d
            int r2 = r2.f39712e
            r6 = r1
            com.google.android.gms.internal.ads.qb4 r6 = (com.google.android.gms.internal.ads.qb4) r6
            int r5 = r5 + r2
            r6.mo34305k(r5, r4)
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            long r4 = r2.f39709b
        L_0x0137:
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            int r6 = r2.f39708a
            r7 = 4
            r6 = r6 & r7
            if (r6 == r7) goto L_0x016c
            r6 = -1
            boolean r2 = r2.mo35081c(r1, r6)
            if (r2 == 0) goto L_0x016c
            long r8 = r24.zze()
            long r10 = r0.f36221c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x016c
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            boolean r2 = r2.mo35080b(r1, r3)
            if (r2 == 0) goto L_0x016c
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            int r8 = r2.f39711d
            int r2 = r2.f39712e
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.zb4.m21286e(r1, r8)
            if (r2 != 0) goto L_0x0167
            goto L_0x016c
        L_0x0167:
            com.google.android.gms.internal.ads.u1 r2 = r0.f36219a
            long r4 = r2.f39709b
            goto L_0x0137
        L_0x016c:
            r0.f36224f = r4
            r1 = 4
            r0.f36223e = r1
            long r1 = r0.f36225g
            return r1
        L_0x0174:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            goto L_0x017b
        L_0x017a:
            throw r1
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7999o1.mo30290a(com.google.android.gms.internal.ads.wb4):long");
    }

    /* renamed from: b */
    public final void mo30291b(long j) {
        this.f36226h = d13.m20290U(j, 0, this.f36224f - 1);
        this.f36223e = 2;
        this.f36227i = this.f36220b;
        this.f36228j = this.f36221c;
        this.f36229k = 0;
        this.f36230l = this.f36224f;
    }

    public final /* bridge */ /* synthetic */ wc4 zze() {
        if (this.f36224f != 0) {
            return new C7963n1(this, (C7925m1) null);
        }
        return null;
    }
}
