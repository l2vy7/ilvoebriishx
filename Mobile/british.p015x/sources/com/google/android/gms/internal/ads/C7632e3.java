package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.e3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7632e3 implements C8071q2 {

    /* renamed from: a */
    private final String f31181a;

    /* renamed from: b */
    private final uq2 f31182b;

    /* renamed from: c */
    private final tp2 f31183c;

    /* renamed from: d */
    private ad4 f31184d;

    /* renamed from: e */
    private String f31185e;

    /* renamed from: f */
    private C8281w f31186f;

    /* renamed from: g */
    private int f31187g;

    /* renamed from: h */
    private int f31188h;

    /* renamed from: i */
    private int f31189i;

    /* renamed from: j */
    private int f31190j;

    /* renamed from: k */
    private long f31191k = C6540C.TIME_UNSET;

    /* renamed from: l */
    private boolean f31192l;

    /* renamed from: m */
    private int f31193m;

    /* renamed from: n */
    private int f31194n;

    /* renamed from: o */
    private int f31195o;

    /* renamed from: p */
    private boolean f31196p;

    /* renamed from: q */
    private long f31197q;

    /* renamed from: r */
    private int f31198r;

    /* renamed from: s */
    private long f31199s;

    /* renamed from: t */
    private int f31200t;

    /* renamed from: u */
    private String f31201u;

    public C7632e3(String str) {
        this.f31181a = str;
        uq2 uq2 = new uq2(1024);
        this.f31182b = uq2;
        byte[] h = uq2.mo35238h();
        this.f31183c = new tp2(h, h.length);
    }

    /* renamed from: d */
    private final int m31683d(tp2 tp2) throws C7811iy {
        int a = tp2.mo35006a();
        wa4 b = xa4.m39419b(tp2, true);
        this.f31201u = b.f40748c;
        this.f31198r = b.f40746a;
        this.f31200t = b.f40747b;
        return a - tp2.mo35006a();
    }

    /* renamed from: e */
    private static long m31684e(tp2 tp2) {
        return (long) tp2.mo35008c((tp2.mo35008c(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.f31192l == false) goto L_0x01b9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18072a(com.google.android.gms.internal.ads.uq2 r15) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.ad4 r0 = r14.f31184d
            com.google.android.gms.internal.ads.nu1.m20743b(r0)
        L_0x0005:
            int r0 = r15.mo35239i()
            if (r0 <= 0) goto L_0x021c
            int r0 = r14.f31187g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x0212
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01fc
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ce
            int r0 = r15.mo35239i()
            int r3 = r14.f31189i
            int r6 = r14.f31188h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.tp2 r3 = r14.f31183c
            byte[] r3 = r3.f39483a
            int r6 = r14.f31188h
            r15.mo35232b(r3, r6, r0)
            int r3 = r14.f31188h
            int r3 = r3 + r0
            r14.f31188h = r3
            int r0 = r14.f31189i
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.tp2 r0 = r14.f31183c
            r0.mo35013h(r4)
            com.google.android.gms.internal.ads.tp2 r0 = r14.f31183c
            boolean r3 = r0.mo35017l()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.f31192l = r2
            int r3 = r0.mo35008c(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.mo35008c(r2)
            r7 = 1
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = 0
        L_0x0058:
            r14.f31193m = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            m31684e(r0)
            r7 = 1
        L_0x0062:
            boolean r3 = r0.mo35017l()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.mo35008c(r3)
            r14.f31194n = r8
            r8 = 4
            int r9 = r0.mo35008c(r8)
            int r10 = r0.mo35008c(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.mo35007b()
            int r10 = r14.m31683d(r0)
            r0.mo35013h(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.mo35011f(r9, r4, r10)
            com.google.android.gms.internal.ads.ge4 r10 = new com.google.android.gms.internal.ads.ge4
            r10.<init>()
            java.lang.String r11 = r14.f31185e
            r10.mo32081h(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.mo32093s(r11)
            java.lang.String r11 = r14.f31201u
            r10.mo32078f0(r11)
            int r11 = r14.f31200t
            r10.mo32076e0(r11)
            int r11 = r14.f31198r
            r10.mo32094t(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.mo32083i(r9)
            java.lang.String r9 = r14.f31181a
            r10.mo32085k(r9)
            com.google.android.gms.internal.ads.w r9 = r10.mo32099y()
            com.google.android.gms.internal.ads.w r10 = r14.f31186f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.f31186f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f40633z
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f31199s = r10
            com.google.android.gms.internal.ads.ad4 r10 = r14.f31184d
            r10.mo30354a(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = m31684e(r0)
            int r10 = (int) r9
            int r9 = r14.m31683d(r0)
            int r10 = r10 - r9
            r0.mo35015j(r10)
        L_0x00e5:
            int r9 = r0.mo35008c(r1)
            r14.f31195o = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.mo35015j(r2)
            goto L_0x0113
        L_0x0106:
            r0.mo35015j(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.mo35015j(r1)
            goto L_0x0113
        L_0x0110:
            r0.mo35015j(r5)
        L_0x0113:
            boolean r1 = r0.mo35017l()
            r14.f31196p = r1
            r8 = 0
            r14.f31197q = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.mo35017l()
            long r2 = r14.f31197q
            long r2 = r2 << r5
            int r7 = r0.mo35008c(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f31197q = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = m31684e(r0)
            r14.f31197q = r1
        L_0x0139:
            boolean r1 = r0.mo35017l()
            if (r1 == 0) goto L_0x0157
            r0.mo35015j(r5)
            goto L_0x0157
        L_0x0143:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.f31192l
            if (r1 != 0) goto L_0x0157
            goto L_0x01b9
        L_0x0157:
            int r1 = r14.f31193m
            if (r1 != 0) goto L_0x01c9
            int r1 = r14.f31194n
            if (r1 != 0) goto L_0x01c4
            int r1 = r14.f31195o
            if (r1 != 0) goto L_0x01bf
            r1 = 0
        L_0x0164:
            int r2 = r0.mo35008c(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bd
            int r1 = r0.mo35007b()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.uq2 r2 = r14.f31182b
            int r1 = r1 >> 3
            r2.mo35236f(r1)
            goto L_0x018e
        L_0x017e:
            com.google.android.gms.internal.ads.uq2 r1 = r14.f31182b
            byte[] r1 = r1.mo35238h()
            int r2 = r10 * 8
            r0.mo35011f(r1, r4, r2)
            com.google.android.gms.internal.ads.uq2 r1 = r14.f31182b
            r1.mo35236f(r4)
        L_0x018e:
            com.google.android.gms.internal.ads.ad4 r1 = r14.f31184d
            com.google.android.gms.internal.ads.uq2 r2 = r14.f31182b
            com.google.android.gms.internal.ads.yc4.m39857b(r1, r2, r10)
            long r7 = r14.f31191k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.ad4 r6 = r14.f31184d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo30358e(r7, r9, r10, r11, r12)
            long r1 = r14.f31191k
            long r5 = r14.f31199s
            long r1 = r1 + r5
            r14.f31191k = r1
        L_0x01af:
            boolean r1 = r14.f31196p
            if (r1 == 0) goto L_0x01b9
            long r1 = r14.f31197q
            int r2 = (int) r1
            r0.mo35015j(r2)
        L_0x01b9:
            r14.f31187g = r4
            goto L_0x0005
        L_0x01bd:
            r1 = r10
            goto L_0x0164
        L_0x01bf:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x01c4:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x01c9:
            com.google.android.gms.internal.ads.iy r15 = com.google.android.gms.internal.ads.C7811iy.m33482a(r6, r6)
            throw r15
        L_0x01ce:
            int r0 = r14.f31190j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.mo35249s()
            r0 = r0 | r2
            r14.f31189i = r0
            com.google.android.gms.internal.ads.uq2 r2 = r14.f31182b
            byte[] r2 = r2.mo35238h()
            int r2 = r2.length
            if (r0 <= r2) goto L_0x01f6
            int r0 = r14.f31189i
            com.google.android.gms.internal.ads.uq2 r2 = r14.f31182b
            r2.mo35233c(r0)
            com.google.android.gms.internal.ads.tp2 r0 = r14.f31183c
            com.google.android.gms.internal.ads.uq2 r2 = r14.f31182b
            byte[] r2 = r2.mo35238h()
            int r3 = r2.length
            r0.mo35012g(r2, r3)
        L_0x01f6:
            r14.f31188h = r4
            r14.f31187g = r1
            goto L_0x0005
        L_0x01fc:
            int r0 = r15.mo35249s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x020c
            r14.f31190j = r0
            r14.f31187g = r3
            goto L_0x0005
        L_0x020c:
            if (r0 == r1) goto L_0x0005
            r14.f31187g = r4
            goto L_0x0005
        L_0x0212:
            int r0 = r15.mo35249s()
            if (r0 != r1) goto L_0x0005
            r14.f31187g = r2
            goto L_0x0005
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7632e3.mo18072a(com.google.android.gms.internal.ads.uq2):void");
    }

    /* renamed from: b */
    public final void mo18073b(yb4 yb4, C7633e4 e4Var) {
        e4Var.mo31471c();
        this.f31184d = yb4.mo18211m(e4Var.mo31469a(), 1);
        this.f31185e = e4Var.mo31470b();
    }

    /* renamed from: c */
    public final void mo18074c(long j, int i) {
        if (j != C6540C.TIME_UNSET) {
            this.f31191k = j;
        }
    }

    public final void zzc() {
    }

    public final void zze() {
        this.f31187g = 0;
        this.f31191k = C6540C.TIME_UNSET;
        this.f31192l = false;
    }
}
