package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.j2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7816j2 implements C8071q2 {

    /* renamed from: a */
    private final tp2 f33699a;

    /* renamed from: b */
    private final uq2 f33700b;

    /* renamed from: c */
    private final String f33701c;

    /* renamed from: d */
    private String f33702d;

    /* renamed from: e */
    private ad4 f33703e;

    /* renamed from: f */
    private int f33704f = 0;

    /* renamed from: g */
    private int f33705g = 0;

    /* renamed from: h */
    private boolean f33706h = false;

    /* renamed from: i */
    private boolean f33707i = false;

    /* renamed from: j */
    private long f33708j;

    /* renamed from: k */
    private C8281w f33709k;

    /* renamed from: l */
    private int f33710l;

    /* renamed from: m */
    private long f33711m = C6540C.TIME_UNSET;

    public C7816j2(String str) {
        tp2 tp2 = new tp2(new byte[16], 16);
        this.f33699a = tp2;
        this.f33700b = new uq2(tp2.f39483a);
        this.f33701c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18072a(com.google.android.gms.internal.ads.uq2 r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.ad4 r0 = r10.f33703e
            com.google.android.gms.internal.ads.nu1.m20743b(r0)
        L_0x0005:
            int r0 = r11.mo35239i()
            if (r0 <= 0) goto L_0x012a
            int r0 = r10.f33704f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00d8
            if (r0 == r3) goto L_0x004c
            int r0 = r11.mo35239i()
            int r1 = r10.f33710l
            int r3 = r10.f33705g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.ad4 r1 = r10.f33703e
            com.google.android.gms.internal.ads.yc4.m39857b(r1, r11, r0)
            int r1 = r10.f33705g
            int r1 = r1 + r0
            r10.f33705g = r1
            int r7 = r10.f33710l
            if (r1 != r7) goto L_0x0005
            long r4 = r10.f33711m
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.ad4 r3 = r10.f33703e
            r6 = 1
            r8 = 0
            r9 = 0
            r3.mo30358e(r4, r6, r7, r8, r9)
            long r0 = r10.f33711m
            long r3 = r10.f33708j
            long r0 = r0 + r3
            r10.f33711m = r0
        L_0x0049:
            r10.f33704f = r2
            goto L_0x0005
        L_0x004c:
            com.google.android.gms.internal.ads.uq2 r0 = r10.f33700b
            byte[] r0 = r0.mo35238h()
            int r3 = r11.mo35239i()
            int r4 = r10.f33705g
            r5 = 16
            int r4 = 16 - r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r10.f33705g
            r11.mo35232b(r0, r4, r3)
            int r0 = r10.f33705g
            int r0 = r0 + r3
            r10.f33705g = r0
            if (r0 != r5) goto L_0x0005
            com.google.android.gms.internal.ads.tp2 r0 = r10.f33699a
            r0.mo35013h(r2)
            com.google.android.gms.internal.ads.tp2 r0 = r10.f33699a
            com.google.android.gms.internal.ads.cb4 r0 = com.google.android.gms.internal.ads.db4.m31345a(r0)
            com.google.android.gms.internal.ads.w r3 = r10.f33709k
            java.lang.String r4 = "audio/ac4"
            if (r3 == 0) goto L_0x008f
            int r6 = r3.f40632y
            if (r6 != r1) goto L_0x008f
            int r6 = r0.f30320a
            int r7 = r3.f40633z
            if (r6 != r7) goto L_0x008f
            java.lang.String r3 = r3.f40619l
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b4
        L_0x008f:
            com.google.android.gms.internal.ads.ge4 r3 = new com.google.android.gms.internal.ads.ge4
            r3.<init>()
            java.lang.String r6 = r10.f33702d
            r3.mo32081h(r6)
            r3.mo32093s(r4)
            r3.mo32076e0(r1)
            int r4 = r0.f30320a
            r3.mo32094t(r4)
            java.lang.String r4 = r10.f33701c
            r3.mo32085k(r4)
            com.google.android.gms.internal.ads.w r3 = r3.mo32099y()
            r10.f33709k = r3
            com.google.android.gms.internal.ads.ad4 r4 = r10.f33703e
            r4.mo30354a(r3)
        L_0x00b4:
            int r3 = r0.f30321b
            r10.f33710l = r3
            int r0 = r0.f30322c
            long r3 = (long) r0
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r6
            com.google.android.gms.internal.ads.w r0 = r10.f33709k
            int r0 = r0.f40633z
            long r6 = (long) r0
            long r3 = r3 / r6
            r10.f33708j = r3
            com.google.android.gms.internal.ads.uq2 r0 = r10.f33700b
            r0.mo35236f(r2)
            com.google.android.gms.internal.ads.ad4 r0 = r10.f33703e
            com.google.android.gms.internal.ads.uq2 r2 = r10.f33700b
            com.google.android.gms.internal.ads.yc4.m39857b(r0, r2, r5)
            r10.f33704f = r1
            goto L_0x0005
        L_0x00d8:
            int r0 = r11.mo35239i()
            if (r0 <= 0) goto L_0x0005
            boolean r0 = r10.f33706h
            r4 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00f0
            int r0 = r11.mo35249s()
            if (r0 != r4) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            r10.f33706h = r0
            goto L_0x00d8
        L_0x00f0:
            int r0 = r11.mo35249s()
            if (r0 != r4) goto L_0x00f8
            r4 = 1
            goto L_0x00f9
        L_0x00f8:
            r4 = 0
        L_0x00f9:
            r10.f33706h = r4
            r4 = 64
            r5 = 65
            if (r0 == r4) goto L_0x0104
            if (r0 != r5) goto L_0x00d8
            goto L_0x0108
        L_0x0104:
            if (r0 == r5) goto L_0x0108
            r0 = 0
            goto L_0x0109
        L_0x0108:
            r0 = 1
        L_0x0109:
            r10.f33707i = r0
            r10.f33704f = r3
            com.google.android.gms.internal.ads.uq2 r0 = r10.f33700b
            byte[] r0 = r0.mo35238h()
            r6 = -84
            r0[r2] = r6
            com.google.android.gms.internal.ads.uq2 r0 = r10.f33700b
            byte[] r0 = r0.mo35238h()
            boolean r2 = r10.f33707i
            if (r3 == r2) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r4 = 65
        L_0x0124:
            r0[r3] = r4
            r10.f33705g = r1
            goto L_0x0005
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7816j2.mo18072a(com.google.android.gms.internal.ads.uq2):void");
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f33702d = e4Var.mo31470b();
        this.f33703e = yb4.mo18211m(e4Var.mo31469a(), 1);
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f33711m = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f33704f = 0;
        this.f33705g = 0;
        this.f33706h = false;
        this.f33707i = false;
        this.f33711m = C6540C.TIME_UNSET;
    }
}
