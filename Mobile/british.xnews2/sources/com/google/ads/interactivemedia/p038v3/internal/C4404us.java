package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.us */
/* compiled from: IMASDK */
final class C4404us implements C4411uz {

    /* renamed from: a */
    private final C4410uy f19086a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f19087b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f19088c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4416vd f19089d;

    /* renamed from: e */
    private int f19090e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f19091f;

    /* renamed from: g */
    private long f19092g;

    /* renamed from: h */
    private long f19093h;

    /* renamed from: i */
    private long f19094i;

    /* renamed from: j */
    private long f19095j;

    /* renamed from: k */
    private long f19096k;

    /* renamed from: l */
    private long f19097l;

    public C4404us(C4416vd vdVar, long j, long j2, long j3, long j4, boolean z) {
        aup.m14885p(j >= 0 && j2 > j);
        this.f19089d = vdVar;
        this.f19087b = j;
        this.f19088c = j2;
        if (j3 == j2 - j || z) {
            this.f19091f = j4;
            this.f19090e = 4;
        } else {
            this.f19090e = 0;
        }
        this.f19086a = new C4410uy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16685a(com.google.ads.interactivemedia.p038v3.internal.C4307rc r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f19090e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00f6
            if (r2 == r3) goto L_0x0109
            r3 = 2
            r8 = 3
            r9 = -1
            if (r2 == r3) goto L_0x0015
            if (r2 == r8) goto L_0x00bd
            return r9
        L_0x0015:
            long r2 = r0.f19094i
            long r11 = r0.f19095j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0021
        L_0x001d:
            r2 = r9
            r11 = r2
            goto L_0x00b5
        L_0x0021:
            long r2 = r24.mo16605l()
            com.google.ads.interactivemedia.v3.internal.uy r11 = r0.f19086a
            long r12 = r0.f19095j
            boolean r11 = r11.mo16699c(r1, r12)
            if (r11 != 0) goto L_0x0040
            long r11 = r0.f19094i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0038
            r2 = r9
            goto L_0x00b5
        L_0x0038:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0040:
            com.google.ads.interactivemedia.v3.internal.uy r11 = r0.f19086a
            r11.mo16700d(r1, r4)
            r24.mo16603j()
            long r11 = r0.f19093h
            com.google.ads.interactivemedia.v3.internal.uy r13 = r0.f19086a
            long r14 = r13.f19117c
            long r11 = r11 - r14
            int r6 = r13.f19119e
            int r7 = r13.f19120f
            int r6 = r6 + r7
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x0062
            r18 = 72000(0x11940, double:3.55727E-319)
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            goto L_0x001d
        L_0x0062:
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x006b
            r0.f19095j = r2
            r0.f19097l = r14
            goto L_0x0079
        L_0x006b:
            long r2 = r24.mo16605l()
            long r13 = (long) r6
            long r2 = r2 + r13
            r0.f19094i = r2
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            long r2 = r2.f19117c
            r0.f19096k = r2
        L_0x0079:
            long r2 = r0.f19095j
            long r13 = r0.f19094i
            long r2 = r2 - r13
            r18 = 100000(0x186a0, double:4.94066E-319)
            int r7 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x008a
            r0.f19095j = r13
            r2 = r9
            r11 = r13
            goto L_0x00b5
        L_0x008a:
            long r2 = (long) r6
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 > 0) goto L_0x0092
            r6 = 2
            goto L_0x0094
        L_0x0092:
            r6 = 1
        L_0x0094:
            long r13 = r24.mo16605l()
            long r4 = r0.f19095j
            long r8 = r0.f19094i
            long r2 = r2 * r6
            long r13 = r13 - r2
            long r2 = r4 - r8
            long r11 = r11 * r2
            long r2 = r0.f19097l
            long r6 = r0.f19096k
            long r2 = r2 - r6
            long r11 = r11 / r2
            long r17 = r13 + r11
            r2 = -1
            long r21 = r4 + r2
            r19 = r8
            long r11 = com.google.ads.interactivemedia.p038v3.internal.amm.m14192I(r17, r19, r21)
        L_0x00b5:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ba
            return r11
        L_0x00ba:
            r2 = 3
            r0.f19090e = r2
        L_0x00bd:
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            r2.mo16698b(r1)
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            r3 = 0
            r2.mo16700d(r1, r3)
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            long r3 = r2.f19117c
            long r5 = r0.f19093h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00df
            r24.mo16603j()
            r1 = 4
            r0.f19090e = r1
            long r1 = r0.f19096k
            r3 = 2
            long r1 = r1 + r3
            long r1 = -r1
            return r1
        L_0x00df:
            r3 = 2
            int r5 = r2.f19119e
            int r2 = r2.f19120f
            int r5 = r5 + r2
            r1.mo16597d(r5)
            long r5 = r24.mo16605l()
            r0.f19094i = r5
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            long r5 = r2.f19117c
            r0.f19096k = r5
            goto L_0x00bd
        L_0x00f6:
            long r4 = r24.mo16605l()
            r0.f19092g = r4
            r0.f19090e = r3
            long r2 = r0.f19088c
            r6 = -65307(0xffffffffffff00e5, double:NaN)
            long r2 = r2 + r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0109
            return r2
        L_0x0109:
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            r2.mo16697a()
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            boolean r2 = r2.mo16698b(r1)
            if (r2 == 0) goto L_0x014a
        L_0x0116:
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            r3 = 0
            r2.mo16700d(r1, r3)
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            int r4 = r2.f19119e
            int r2 = r2.f19120f
            int r4 = r4 + r2
            r1.mo16597d(r4)
            com.google.ads.interactivemedia.v3.internal.uy r2 = r0.f19086a
            int r4 = r2.f19116b
            r5 = 4
            r4 = r4 & r5
            if (r4 == r5) goto L_0x013e
            boolean r2 = r2.mo16698b(r1)
            if (r2 == 0) goto L_0x013e
            long r4 = r24.mo16605l()
            long r6 = r0.f19088c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0116
        L_0x013e:
            com.google.ads.interactivemedia.v3.internal.uy r1 = r0.f19086a
            long r1 = r1.f19117c
            r0.f19091f = r1
            r1 = 4
            r0.f19090e = r1
            long r1 = r0.f19092g
            return r1
        L_0x014a:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            goto L_0x0151
        L_0x0150:
            throw r1
        L_0x0151:
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4404us.mo16685a(com.google.ads.interactivemedia.v3.internal.rc):long");
    }

    /* renamed from: b */
    public final void mo16686b(long j) {
        this.f19093h = amm.m14192I(j, 0, this.f19091f - 1);
        this.f19090e = 2;
        this.f19094i = this.f19087b;
        this.f19095j = this.f19088c;
        this.f19096k = 0;
        this.f19097l = this.f19091f;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4324rt mo16687c() {
        if (this.f19091f != 0) {
            return new C4403ur(this);
        }
        return null;
    }
}
