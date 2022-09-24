package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adx */
/* compiled from: IMASDK */
public final class adx implements abl {

    /* renamed from: a */
    private final ajf f14340a;

    /* renamed from: b */
    private C4287qj f14341b = new C4273pw();

    /* renamed from: c */
    private long f14342c = C6540C.TIME_UNSET;

    /* renamed from: d */
    private long f14343d = 30000;

    /* renamed from: e */
    private List<C4543zw> f14344e = Collections.emptyList();

    /* renamed from: f */
    private final aef f14345f;

    /* renamed from: g */
    private C4396uk f14346g = new C4396uk();

    /* renamed from: h */
    private aup f14347h = new aup();

    public adx(aef aef, ajf ajf) {
        aup.m14890u(aef);
        this.f14345f = aef;
        this.f14340a = ajf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r5 != false) goto L_0x0071;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p038v3.internal.aec mo13516a(android.net.Uri r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.ads.interactivemedia.v3.internal.ki r1 = new com.google.ads.interactivemedia.v3.internal.ki
            r1.<init>()
            r2 = r19
            r1.mo16144f(r2)
            java.lang.String r2 = "application/dash+xml"
            r1.mo16142d(r2)
            com.google.ads.interactivemedia.v3.internal.kn r1 = r1.mo16139a()
            com.google.ads.interactivemedia.v3.internal.km r2 = r1.f17729b
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            com.google.ads.interactivemedia.v3.internal.aer r2 = new com.google.ads.interactivemedia.v3.internal.aer
            r2.<init>()
            com.google.ads.interactivemedia.v3.internal.km r3 = r1.f17729b
            java.util.List<com.google.ads.interactivemedia.v3.internal.zw> r3 = r3.f17724e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002c
            java.util.List<com.google.ads.interactivemedia.v3.internal.zw> r3 = r0.f14344e
            goto L_0x0030
        L_0x002c:
            com.google.ads.interactivemedia.v3.internal.km r3 = r1.f17729b
            java.util.List<com.google.ads.interactivemedia.v3.internal.zw> r3 = r3.f17724e
        L_0x0030:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x003d
            com.google.ads.interactivemedia.v3.internal.zu r4 = new com.google.ads.interactivemedia.v3.internal.zu
            r4.<init>(r2, r3)
            r8 = r4
            goto L_0x003e
        L_0x003d:
            r8 = r2
        L_0x003e:
            com.google.ads.interactivemedia.v3.internal.km r2 = r1.f17729b
            java.lang.Object r4 = r2.f17727h
            java.util.List<com.google.ads.interactivemedia.v3.internal.zw> r2 = r2.f17724e
            boolean r2 = r2.isEmpty()
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0054
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            com.google.ads.interactivemedia.v3.internal.kl r6 = r1.f17730c
            long r6 = r6.f17715a
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0069
            long r6 = r0.f14342c
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0069
            r5 = 1
        L_0x0069:
            if (r2 != 0) goto L_0x0070
            if (r5 == 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r6 = r1
            goto L_0x0086
        L_0x0070:
            r4 = r5
        L_0x0071:
            com.google.ads.interactivemedia.v3.internal.ki r1 = r1.mo16153a()
            if (r2 == 0) goto L_0x007a
            r1.mo16143e(r3)
        L_0x007a:
            if (r4 == 0) goto L_0x0081
            long r2 = r0.f14342c
            r1.mo16140b(r2)
        L_0x0081:
            com.google.ads.interactivemedia.v3.internal.kn r1 = r1.mo16139a()
            goto L_0x006e
        L_0x0086:
            com.google.ads.interactivemedia.v3.internal.aec r1 = new com.google.ads.interactivemedia.v3.internal.aec
            com.google.ads.interactivemedia.v3.internal.ajf r7 = r0.f14340a
            com.google.ads.interactivemedia.v3.internal.aef r9 = r0.f14345f
            com.google.ads.interactivemedia.v3.internal.uk r10 = r0.f14346g
            com.google.ads.interactivemedia.v3.internal.qj r2 = r0.f14341b
            com.google.ads.interactivemedia.v3.internal.qi r11 = r2.mo16529a(r6)
            com.google.ads.interactivemedia.v3.internal.aup r12 = r0.f14347h
            long r13 = r0.f14343d
            r15 = 0
            r16 = 0
            r17 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.adx.mo13516a(android.net.Uri):com.google.ads.interactivemedia.v3.internal.aec");
    }
}
