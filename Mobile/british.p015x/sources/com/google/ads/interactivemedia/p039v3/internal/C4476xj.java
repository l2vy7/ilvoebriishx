package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xj */
/* compiled from: IMASDK */
public final class C4476xj implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19561a = 0;

    /* renamed from: b */
    private C4309re f19562b;

    /* renamed from: c */
    private C4327rw f19563c;

    /* renamed from: d */
    private C4474xh f19564d;

    /* renamed from: e */
    private int f19565e = -1;

    /* renamed from: f */
    private long f19566f = -1;

    static {
        int i = C4472xf.f19538b;
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return C4479xm.m19463a(rcVar) != null;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19562b = reVar;
        this.f19563c = reVar.mo13362ba(0, 1);
        reVar.mo13363bb();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r15 != 65534) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13691f(com.google.ads.interactivemedia.p039v3.internal.C4307rc r14, com.google.ads.interactivemedia.p039v3.internal.C4321rq r15) throws java.io.IOException {
        /*
            r13 = this;
            com.google.ads.interactivemedia.v3.internal.rw r15 = r13.f19563c
            com.google.ads.interactivemedia.p039v3.internal.aup.m14889t(r15)
            int r15 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            com.google.ads.interactivemedia.v3.internal.xh r15 = r13.f19564d
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x009a
            com.google.ads.interactivemedia.v3.internal.xk r5 = com.google.ads.interactivemedia.p039v3.internal.C4479xm.m19463a(r14)
            if (r5 == 0) goto L_0x0092
            int r15 = r5.f19567a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.google.ads.interactivemedia.v3.internal.xg r15 = new com.google.ads.interactivemedia.v3.internal.xg
            com.google.ads.interactivemedia.v3.internal.re r2 = r13.f19562b
            com.google.ads.interactivemedia.v3.internal.rw r3 = r13.f19563c
            r15.<init>(r2, r3, r5)
            r13.f19564d = r15
            goto L_0x009a
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.xi r15 = new com.google.ads.interactivemedia.v3.internal.xi
            com.google.ads.interactivemedia.v3.internal.re r3 = r13.f19562b
            com.google.ads.interactivemedia.v3.internal.rw r4 = r13.f19563c
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f19564d = r15
            goto L_0x009a
        L_0x0039:
            r2 = 7
            if (r15 != r2) goto L_0x004c
            com.google.ads.interactivemedia.v3.internal.xi r15 = new com.google.ads.interactivemedia.v3.internal.xi
            com.google.ads.interactivemedia.v3.internal.re r3 = r13.f19562b
            com.google.ads.interactivemedia.v3.internal.rw r4 = r13.f19563c
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f19564d = r15
            goto L_0x009a
        L_0x004c:
            int r2 = r5.f19571e
            if (r15 == r0) goto L_0x0061
            r3 = 3
            if (r15 == r3) goto L_0x005a
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x0061
        L_0x0058:
            r7 = 0
            goto L_0x0066
        L_0x005a:
            r15 = 32
            if (r2 != r15) goto L_0x0058
            r15 = 4
            r7 = 4
            goto L_0x0066
        L_0x0061:
            int r15 = com.google.ads.interactivemedia.p039v3.internal.amm.m14206W(r2)
            r7 = r15
        L_0x0066:
            if (r7 == 0) goto L_0x0077
            com.google.ads.interactivemedia.v3.internal.xi r15 = new com.google.ads.interactivemedia.v3.internal.xi
            com.google.ads.interactivemedia.v3.internal.re r3 = r13.f19562b
            com.google.ads.interactivemedia.v3.internal.rw r4 = r13.f19563c
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f19564d = r15
            goto L_0x009a
        L_0x0077:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            int r15 = r5.f19567a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unsupported WAV format type: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x0092:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x009a:
            int r15 = r13.f19565e
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x016c
            com.google.ads.interactivemedia.p039v3.internal.aup.m14890u(r14)
            r14.mo16603j()
            com.google.ads.interactivemedia.v3.internal.alw r15 = new com.google.ads.interactivemedia.v3.internal.alw
            r5 = 8
            r15.<init>((int) r5)
            com.google.ads.interactivemedia.v3.internal.xl r6 = com.google.ads.interactivemedia.p039v3.internal.C4478xl.m19462a(r14, r15)
        L_0x00b2:
            int r7 = r6.f19573a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x010f
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00db
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00db
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 39
            r10.<init>(r11)
            java.lang.String r11 = "Ignoring unknown WAV chunk: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00db:
            long r9 = r6.f19574b
            r11 = 8
            long r9 = r9 + r11
            int r6 = r6.f19573a
            if (r6 != r8) goto L_0x00e6
            r9 = 12
        L_0x00e6:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00f6
            int r6 = (int) r9
            r14.mo16597d(r6)
            com.google.ads.interactivemedia.v3.internal.xl r6 = com.google.ads.interactivemedia.p039v3.internal.C4478xl.m19462a(r14, r15)
            goto L_0x00b2
        L_0x00f6:
            com.google.ads.interactivemedia.v3.internal.lb r14 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 51
            r15.<init>(r0)
            java.lang.String r0 = "Chunk is too large (~2GB+) to skip; id: "
            r15.append(r0)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x010f:
            r14.mo16597d(r5)
            long r7 = r14.mo16605l()
            long r5 = r6.f19574b
            long r5 = r5 + r7
            long r10 = r14.mo16606m()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0144
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0144
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r12 = 69
            r15.<init>(r12)
            java.lang.String r12 = "Data exceeds input length: "
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = ", "
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r9, r15)
            r5 = r10
        L_0x0144:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f19565e = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f19566f = r5
            com.google.ads.interactivemedia.v3.internal.xh r15 = r13.f19564d
            int r7 = r13.f19565e
            r15.mo16769b(r7, r5)
            goto L_0x017b
        L_0x016c:
            long r5 = r14.mo16605l()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x017b
            int r15 = r13.f19565e
            r14.mo16597d(r15)
        L_0x017b:
            long r5 = r13.f19566f
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r0)
            long r2 = r13.f19566f
            long r5 = r14.mo16605l()
            com.google.ads.interactivemedia.v3.internal.xh r15 = r13.f19564d
            long r2 = r2 - r5
            boolean r14 = r15.mo16770c(r14, r2)
            if (r14 == 0) goto L_0x0196
            return r4
        L_0x0196:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4476xj.mo13691f(com.google.ads.interactivemedia.v3.internal.rc, com.google.ads.interactivemedia.v3.internal.rq):int");
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        C4474xh xhVar = this.f19564d;
        if (xhVar != null) {
            xhVar.mo16768a(j2);
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
