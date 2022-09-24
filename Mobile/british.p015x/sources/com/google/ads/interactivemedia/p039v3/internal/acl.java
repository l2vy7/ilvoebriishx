package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acl */
/* compiled from: IMASDK */
public final class acl extends C4171mb {

    /* renamed from: b */
    private static final Object f14170b = new Object();

    /* renamed from: c */
    private final long f14171c;

    /* renamed from: d */
    private final long f14172d;

    /* renamed from: e */
    private final long f14173e;

    /* renamed from: f */
    private final long f14174f;

    /* renamed from: g */
    private final long f14175g;

    /* renamed from: h */
    private final long f14176h;

    /* renamed from: i */
    private final boolean f14177i;

    /* renamed from: j */
    private final boolean f14178j;

    /* renamed from: k */
    private final Object f14179k;

    /* renamed from: l */
    private final C4129kn f14180l;

    /* renamed from: m */
    private final C4127kl f14181m;

    static {
        C4124ki kiVar = new C4124ki();
        kiVar.mo16141c("SinglePeriodTimeline");
        kiVar.mo16144f(Uri.EMPTY);
        kiVar.mo16139a();
    }

    public acl(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj, C4129kn knVar, C4127kl klVar) {
        this.f14171c = j;
        this.f14172d = j2;
        this.f14173e = j3;
        this.f14174f = j4;
        this.f14175g = j5;
        this.f14176h = j6;
        this.f14177i = z;
        this.f14178j = z2;
        this.f14179k = obj;
        this.f14180l = knVar;
        this.f14181m = klVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 > r5) goto L_0x001f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p039v3.internal.C4170ma mo13288f(int r24, com.google.ads.interactivemedia.p039v3.internal.C4170ma r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.google.ads.interactivemedia.p039v3.internal.aup.m14891v(r2, r1)
            long r1 = r0.f14176h
            boolean r14 = r0.f14178j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x0029
            r5 = 0
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0029
            long r5 = r0.f14174f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0022
        L_0x001f:
            r16 = r3
            goto L_0x002b
        L_0x0022:
            long r1 = r1 + r26
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0029
            goto L_0x001f
        L_0x0029:
            r16 = r1
        L_0x002b:
            java.lang.Object r4 = com.google.ads.interactivemedia.p039v3.internal.C4170ma.f17924a
            com.google.ads.interactivemedia.v3.internal.kn r5 = r0.f14180l
            java.lang.Object r6 = r0.f14179k
            long r7 = r0.f14171c
            long r9 = r0.f14172d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.f14177i
            com.google.ads.interactivemedia.v3.internal.kl r15 = r0.f14181m
            long r1 = r0.f14174f
            r18 = r1
            r20 = 0
            long r1 = r0.f14175g
            r21 = r1
            r3 = r25
            r3.mo16327c(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acl.mo13288f(int, com.google.ads.interactivemedia.v3.internal.ma, long):com.google.ads.interactivemedia.v3.internal.ma");
    }

    /* renamed from: h */
    public final C4168lz mo13289h(int i, C4168lz lzVar, boolean z) {
        aup.m14891v(i, 1);
        return lzVar.mo16324i((Object) null, z ? f14170b : null, this.f14173e, -this.f14175g);
    }

    /* renamed from: i */
    public final int mo13290i(Object obj) {
        return f14170b.equals(obj) ? 0 : -1;
    }

    /* renamed from: j */
    public final Object mo13291j(int i) {
        aup.m14891v(i, 1);
        return f14170b;
    }

    /* renamed from: t */
    public final int mo13271t() {
        return 1;
    }

    /* renamed from: u */
    public final int mo13272u() {
        return 1;
    }
}
