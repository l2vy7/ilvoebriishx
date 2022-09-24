package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wf */
/* compiled from: IMASDK */
public final class C4445wf implements C4432vt {

    /* renamed from: a */
    private final String f19385a;

    /* renamed from: b */
    private final alw f19386b;

    /* renamed from: c */
    private final alv f19387c;

    /* renamed from: d */
    private C4327rw f19388d;

    /* renamed from: e */
    private String f19389e;

    /* renamed from: f */
    private C4120ke f19390f;

    /* renamed from: g */
    private int f19391g;

    /* renamed from: h */
    private int f19392h;

    /* renamed from: i */
    private int f19393i;

    /* renamed from: j */
    private int f19394j;

    /* renamed from: k */
    private long f19395k;

    /* renamed from: l */
    private boolean f19396l;

    /* renamed from: m */
    private int f19397m;

    /* renamed from: n */
    private int f19398n;

    /* renamed from: o */
    private int f19399o;

    /* renamed from: p */
    private boolean f19400p;

    /* renamed from: q */
    private long f19401q;

    /* renamed from: r */
    private int f19402r;

    /* renamed from: s */
    private long f19403s;

    /* renamed from: t */
    private int f19404t;

    /* renamed from: u */
    private String f19405u;

    public C4445wf(String str) {
        this.f19385a = str;
        alw alw = new alw(1024);
        this.f19386b = alw;
        this.f19387c = new alv(alw.mo13952j());
    }

    /* renamed from: f */
    private final int m19343f(alv alv) throws C4144lb {
        int c = alv.mo13921c();
        C4204nh b = C4205ni.m18266b(alv, true);
        this.f19405u = b.f18067c;
        this.f19402r = b.f18065a;
        this.f19404t = b.f18066b;
        return c - alv.mo13921c();
    }

    /* renamed from: g */
    private static long m19344g(alv alv) {
        return (long) alv.mo13927i((alv.mo13927i(2) + 1) * 8);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19391g = 0;
        this.f19396l = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19388d = reVar.mo13362ba(xcVar.mo16764b(), 1);
        this.f19389e = xcVar.mo16765c();
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19395k = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0155, code lost:
        if (r13.f19396l == false) goto L_0x01b1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16710d(com.google.ads.interactivemedia.p039v3.internal.alw r14) throws com.google.ads.interactivemedia.p039v3.internal.C4144lb {
        /*
            r13 = this;
            com.google.ads.interactivemedia.v3.internal.rw r0 = r13.f19388d
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r0)
        L_0x0005:
            int r0 = r14.mo13947e()
            if (r0 <= 0) goto L_0x0216
            int r0 = r13.f19391g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020c
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f6
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01c9
            int r0 = r14.mo13947e()
            int r3 = r13.f19393i
            int r6 = r13.f19392h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.ads.interactivemedia.v3.internal.alv r3 = r13.f19387c
            byte[] r3 = r3.f15245a
            int r6 = r13.f19392h
            r14.mo13956n(r3, r6, r0)
            int r3 = r13.f19392h
            int r3 = r3 + r0
            r13.f19392h = r3
            int r0 = r13.f19393i
            if (r3 != r0) goto L_0x0005
            com.google.ads.interactivemedia.v3.internal.alv r0 = r13.f19387c
            r0.mo13923e(r4)
            com.google.ads.interactivemedia.v3.internal.alv r0 = r13.f19387c
            boolean r3 = r0.mo13926h()
            if (r3 != 0) goto L_0x0153
            r13.f19396l = r2
            int r3 = r0.mo13927i(r2)
            if (r3 != r2) goto L_0x0055
            int r3 = r0.mo13927i(r2)
            r6 = 1
            goto L_0x0057
        L_0x0055:
            r6 = r3
            r3 = 0
        L_0x0057:
            r13.f19397m = r3
            if (r3 != 0) goto L_0x014d
            if (r6 != r2) goto L_0x0060
            m19344g(r0)
        L_0x0060:
            boolean r3 = r0.mo13926h()
            if (r3 == 0) goto L_0x0147
            r3 = 6
            int r7 = r0.mo13927i(r3)
            r13.f19398n = r7
            r7 = 4
            int r8 = r0.mo13927i(r7)
            int r9 = r0.mo13927i(r1)
            if (r8 != 0) goto L_0x0141
            if (r9 != 0) goto L_0x0141
            if (r6 != 0) goto L_0x00d6
            int r8 = r0.mo13922d()
            int r9 = r13.m19343f(r0)
            r0.mo13923e(r8)
            int r8 = r9 + 7
            int r8 = r8 / r5
            byte[] r8 = new byte[r8]
            r0.mo13931m(r8, r9)
            com.google.ads.interactivemedia.v3.internal.kd r9 = new com.google.ads.interactivemedia.v3.internal.kd
            r9.<init>()
            java.lang.String r10 = r13.f19389e
            r9.mo16107S(r10)
            java.lang.String r10 = "audio/mp4a-latm"
            r9.mo16120ae(r10)
            java.lang.String r10 = r13.f19405u
            r9.mo16097I(r10)
            int r10 = r13.f19404t
            r9.mo16096H(r10)
            int r10 = r13.f19402r
            r9.mo16121af(r10)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.mo16108T(r8)
            java.lang.String r8 = r13.f19385a
            r9.mo16110V(r8)
            com.google.ads.interactivemedia.v3.internal.ke r8 = r9.mo16115a()
            com.google.ads.interactivemedia.v3.internal.ke r9 = r13.f19390f
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00e3
            r13.f19390f = r8
            r9 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r11 = r8.f17695z
            long r11 = (long) r11
            long r9 = r9 / r11
            r13.f19403s = r9
            com.google.ads.interactivemedia.v3.internal.rw r9 = r13.f19388d
            r9.mo13403a(r8)
            goto L_0x00e3
        L_0x00d6:
            long r8 = m19344g(r0)
            int r9 = (int) r8
            int r8 = r13.m19343f(r0)
            int r9 = r9 - r8
            r0.mo13925g(r9)
        L_0x00e3:
            int r8 = r0.mo13927i(r1)
            r13.f19399o = r8
            if (r8 == 0) goto L_0x010e
            if (r8 == r2) goto L_0x0108
            if (r8 == r1) goto L_0x0104
            if (r8 == r7) goto L_0x0104
            r1 = 5
            if (r8 == r1) goto L_0x0104
            if (r8 == r3) goto L_0x0100
            r1 = 7
            if (r8 != r1) goto L_0x00fa
            goto L_0x0100
        L_0x00fa:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x0100:
            r0.mo13925g(r2)
            goto L_0x0111
        L_0x0104:
            r0.mo13925g(r3)
            goto L_0x0111
        L_0x0108:
            r1 = 9
            r0.mo13925g(r1)
            goto L_0x0111
        L_0x010e:
            r0.mo13925g(r5)
        L_0x0111:
            boolean r1 = r0.mo13926h()
            r13.f19400p = r1
            r7 = 0
            r13.f19401q = r7
            if (r1 == 0) goto L_0x0137
            if (r6 == r2) goto L_0x0131
        L_0x011f:
            boolean r1 = r0.mo13926h()
            long r2 = r13.f19401q
            long r2 = r2 << r5
            int r6 = r0.mo13927i(r5)
            long r6 = (long) r6
            long r2 = r2 + r6
            r13.f19401q = r2
            if (r1 != 0) goto L_0x011f
            goto L_0x0137
        L_0x0131:
            long r1 = m19344g(r0)
            r13.f19401q = r1
        L_0x0137:
            boolean r1 = r0.mo13926h()
            if (r1 == 0) goto L_0x0158
            r0.mo13925g(r5)
            goto L_0x0158
        L_0x0141:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x0147:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x014d:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x0153:
            boolean r1 = r13.f19396l
            if (r1 != 0) goto L_0x0158
            goto L_0x01b1
        L_0x0158:
            int r1 = r13.f19397m
            if (r1 != 0) goto L_0x01c3
            int r1 = r13.f19398n
            if (r1 != 0) goto L_0x01bd
            int r1 = r13.f19399o
            if (r1 != 0) goto L_0x01b7
            r1 = 0
        L_0x0165:
            int r2 = r0.mo13927i(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01b5
            int r1 = r0.mo13922d()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017f
            com.google.ads.interactivemedia.v3.internal.alw r2 = r13.f19386b
            int r1 = r1 >> 3
            r2.mo13951i(r1)
            goto L_0x018f
        L_0x017f:
            com.google.ads.interactivemedia.v3.internal.alw r1 = r13.f19386b
            byte[] r1 = r1.mo13952j()
            int r2 = r10 * 8
            r0.mo13931m(r1, r2)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r13.f19386b
            r1.mo13951i(r4)
        L_0x018f:
            com.google.ads.interactivemedia.v3.internal.rw r1 = r13.f19388d
            com.google.ads.interactivemedia.v3.internal.alw r2 = r13.f19386b
            r1.mo13406d(r2, r10)
            com.google.ads.interactivemedia.v3.internal.rw r6 = r13.f19388d
            long r7 = r13.f19395k
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo13404b(r7, r9, r10, r11, r12)
            long r1 = r13.f19395k
            long r5 = r13.f19403s
            long r1 = r1 + r5
            r13.f19395k = r1
            boolean r1 = r13.f19400p
            if (r1 == 0) goto L_0x01b1
            long r1 = r13.f19401q
            int r2 = (int) r1
            r0.mo13925g(r2)
        L_0x01b1:
            r13.f19391g = r4
            goto L_0x0005
        L_0x01b5:
            r1 = r10
            goto L_0x0165
        L_0x01b7:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x01bd:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x01c3:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            r14.<init>()
            throw r14
        L_0x01c9:
            int r0 = r13.f19394j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r14.mo13957o()
            r0 = r0 | r2
            r13.f19393i = r0
            com.google.ads.interactivemedia.v3.internal.alw r2 = r13.f19386b
            byte[] r2 = r2.mo13952j()
            int r2 = r2.length
            if (r0 <= r2) goto L_0x01f0
            int r0 = r13.f19393i
            com.google.ads.interactivemedia.v3.internal.alw r2 = r13.f19386b
            r2.mo13943a(r0)
            com.google.ads.interactivemedia.v3.internal.alv r0 = r13.f19387c
            com.google.ads.interactivemedia.v3.internal.alw r2 = r13.f19386b
            byte[] r2 = r2.mo13952j()
            r0.mo13919a(r2)
        L_0x01f0:
            r13.f19392h = r4
            r13.f19391g = r1
            goto L_0x0005
        L_0x01f6:
            int r0 = r14.mo13957o()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0206
            r13.f19394j = r0
            r13.f19391g = r3
            goto L_0x0005
        L_0x0206:
            if (r0 == r1) goto L_0x0005
            r13.f19391g = r4
            goto L_0x0005
        L_0x020c:
            int r0 = r14.mo13957o()
            if (r0 != r1) goto L_0x0005
            r13.f19391g = r2
            goto L_0x0005
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4445wf.mo16710d(com.google.ads.interactivemedia.v3.internal.alw):void");
    }

    /* renamed from: e */
    public final void mo16711e() {
    }
}
