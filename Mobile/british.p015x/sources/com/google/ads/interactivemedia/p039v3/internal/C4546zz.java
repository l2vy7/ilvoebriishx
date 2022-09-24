package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zz */
/* compiled from: IMASDK */
public final class C4546zz implements abn {

    /* renamed from: a */
    private final C4311rg f19791a;

    /* renamed from: b */
    private C4306rb f19792b;

    /* renamed from: c */
    private C4307rc f19793c;

    public C4546zz(C4311rg rgVar) {
        this.f19791a = rgVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.mo16605l() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.mo16605l() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r0 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13347a(com.google.ads.interactivemedia.p039v3.internal.ajd r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.ads.interactivemedia.p039v3.internal.C4309re r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.qy r6 = new com.google.ads.interactivemedia.v3.internal.qy
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f19793c = r6
            com.google.ads.interactivemedia.v3.internal.rb r8 = r7.f19792b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.ads.interactivemedia.v3.internal.rg r8 = r7.f19791a
            com.google.ads.interactivemedia.v3.internal.rb[] r8 = r8.mo15844b(r9, r10)
            int r9 = r8.length
            r10 = 0
            r13 = 1
            if (r9 != r13) goto L_0x0020
            r8 = r8[r10]
            r7.f19792b = r8
            goto L_0x0074
        L_0x0020:
            r14 = 0
        L_0x0021:
            if (r14 >= r9) goto L_0x0070
            r0 = r8[r14]
            boolean r1 = r0.mo13689d(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r1 == 0) goto L_0x0034
            r7.f19792b = r0     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r13)
            r6.mo16603j()
            goto L_0x0070
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.rb r0 = r7.f19792b
            if (r0 != 0) goto L_0x0066
            long r0 = r6.mo16605l()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0041:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.rb r9 = r7.f19792b
            if (r9 != 0) goto L_0x004e
            long r14 = r6.mo16605l()
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x004f
        L_0x004e:
            r10 = 1
        L_0x004f:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r10)
            r6.mo16603j()
            throw r8
        L_0x0056:
            com.google.ads.interactivemedia.v3.internal.rb r0 = r7.f19792b
            if (r0 != 0) goto L_0x0066
            long r0 = r6.mo16605l()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 0
            goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r0)
            r6.mo16603j()
            int r14 = r14 + 1
            goto L_0x0021
        L_0x0070:
            com.google.ads.interactivemedia.v3.internal.rb r9 = r7.f19792b
            if (r9 == 0) goto L_0x007a
        L_0x0074:
            com.google.ads.interactivemedia.v3.internal.rb r8 = r7.f19792b
            r8.mo13690e(r15)
            return
        L_0x007a:
            com.google.ads.interactivemedia.v3.internal.acr r9 = new com.google.ads.interactivemedia.v3.internal.acr
            java.lang.String r8 = com.google.ads.interactivemedia.p039v3.internal.amm.m14201R(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 58
            r11.<init>(r10)
            java.lang.String r10 = "None of the available extractors ("
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            goto L_0x00a5
        L_0x00a4:
            throw r9
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4546zz.mo13347a(com.google.ads.interactivemedia.v3.internal.ajd, android.net.Uri, java.util.Map, long, long, com.google.ads.interactivemedia.v3.internal.re):void");
    }

    /* renamed from: b */
    public final void mo13348b() {
        if (this.f19792b != null) {
            this.f19792b = null;
        }
        this.f19793c = null;
    }

    /* renamed from: c */
    public final void mo13349c() {
        C4306rb rbVar = this.f19792b;
        if (rbVar instanceof C4369tk) {
            ((C4369tk) rbVar).mo16656a();
        }
    }

    /* renamed from: d */
    public final long mo13350d() {
        C4307rc rcVar = this.f19793c;
        if (rcVar != null) {
            return rcVar.mo16605l();
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo13351e(long j, long j2) {
        C4306rb rbVar = this.f19792b;
        aup.m14890u(rbVar);
        rbVar.mo13692g(j, j2);
    }

    /* renamed from: f */
    public final int mo13352f(C4321rq rqVar) throws IOException {
        C4306rb rbVar = this.f19792b;
        aup.m14890u(rbVar);
        C4307rc rcVar = this.f19793c;
        aup.m14890u(rcVar);
        return rbVar.mo13691f(rcVar, rqVar);
    }
}
