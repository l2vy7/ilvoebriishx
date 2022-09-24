package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xg */
/* compiled from: IMASDK */
final class C4473xg implements C4474xh {

    /* renamed from: a */
    private static final int[] f19539a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: b */
    private static final int[] f19540b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: c */
    private final C4309re f19541c;

    /* renamed from: d */
    private final C4327rw f19542d;

    /* renamed from: e */
    private final C4477xk f19543e;

    /* renamed from: f */
    private final int f19544f;

    /* renamed from: g */
    private final byte[] f19545g;

    /* renamed from: h */
    private final alw f19546h;

    /* renamed from: i */
    private final int f19547i;

    /* renamed from: j */
    private final C4120ke f19548j;

    /* renamed from: k */
    private int f19549k;

    /* renamed from: l */
    private long f19550l;

    /* renamed from: m */
    private int f19551m;

    /* renamed from: n */
    private long f19552n;

    public C4473xg(C4309re reVar, C4327rw rwVar, C4477xk xkVar) throws C4144lb {
        this.f19541c = reVar;
        this.f19542d = rwVar;
        this.f19543e = xkVar;
        int max = Math.max(1, xkVar.f19569c / 10);
        this.f19547i = max;
        alw alw = new alw(xkVar.f19572f);
        alw.mo13959q();
        int q = alw.mo13959q();
        this.f19544f = q;
        int i = xkVar.f19568b;
        int i2 = (((xkVar.f19570d - (i * 4)) * 8) / (xkVar.f19571e * i)) + 1;
        if (q == i2) {
            int F = amm.m14189F(max, q);
            this.f19545g = new byte[(xkVar.f19570d * F)];
            this.f19546h = new alw(F * m19447g(q, i));
            int i3 = ((xkVar.f19569c * xkVar.f19570d) * 8) / q;
            C4119kd kdVar = new C4119kd();
            kdVar.mo16120ae(MimeTypes.AUDIO_RAW);
            kdVar.mo16095G(i3);
            kdVar.mo16114Z(i3);
            kdVar.mo16111W(m19447g(max, i));
            kdVar.mo16096H(xkVar.f19568b);
            kdVar.mo16121af(xkVar.f19569c);
            kdVar.mo16113Y(2);
            this.f19548j = kdVar.mo16115a();
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(q);
        throw new C4144lb(sb.toString());
    }

    /* renamed from: d */
    private final void m19444d(int i) {
        long j = this.f19550l;
        long M = amm.m14196M(this.f19552n, 1000000, (long) this.f19543e.f19569c);
        int f = m19446f(i);
        this.f19542d.mo13404b(j + M, 1, f, this.f19551m - f, (C4326rv) null);
        this.f19552n += (long) i;
        this.f19551m -= f;
    }

    /* renamed from: e */
    private final int m19445e(int i) {
        int i2 = this.f19543e.f19568b;
        return i / (i2 + i2);
    }

    /* renamed from: f */
    private final int m19446f(int i) {
        return m19447g(i, this.f19543e.f19568b);
    }

    /* renamed from: g */
    private static int m19447g(int i, int i2) {
        return (i + i) * i2;
    }

    /* renamed from: a */
    public final void mo16768a(long j) {
        this.f19549k = 0;
        this.f19550l = j;
        this.f19551m = 0;
        this.f19552n = 0;
    }

    /* renamed from: b */
    public final void mo16769b(int i, long j) {
        this.f19541c.mo13364bc(new C4480xn(this.f19543e, this.f19544f, (long) i, j));
        this.f19542d.mo13403a(this.f19548j);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: c */
    public final boolean mo16770c(com.google.ads.interactivemedia.p038v3.internal.C4307rc r20, long r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f19547i
            int r4 = r0.f19551m
            int r4 = r0.m19445e(r4)
            int r3 = r3 - r4
            int r4 = r0.f19544f
            int r3 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r3, r4)
            com.google.ads.interactivemedia.v3.internal.xk r4 = r0.f19543e
            int r4 = r4.f19570d
            int r3 = r3 * r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0044
            int r7 = r0.f19549k
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f19545g
            int r10 = r0.f19549k
            int r8 = (int) r7
            r7 = r20
            int r8 = r7.mo13294a(r9, r10, r8)
            r9 = -1
            if (r8 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f19549k
            int r9 = r9 + r8
            r0.f19549k = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f19549k
            com.google.ads.interactivemedia.v3.internal.xk r2 = r0.f19543e
            int r2 = r2.f19570d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014e
            byte[] r2 = r0.f19545g
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19546h
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0117
            r8 = 0
        L_0x0055:
            com.google.ads.interactivemedia.v3.internal.xk r9 = r0.f19543e
            int r9 = r9.f19568b
            if (r8 >= r9) goto L_0x010f
            byte[] r9 = r3.mo13952j()
            com.google.ads.interactivemedia.v3.internal.xk r10 = r0.f19543e
            int r11 = r10.f19570d
            int r10 = r10.f19568b
            int r12 = r7 * r11
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r11 = r11 / r10
            int r11 = r11 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f19540b
            r16 = r16[r12]
            int r4 = r0.f19544f
            int r4 = r4 * r7
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r4 = r4 + r4
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r9[r4] = r15
            int r15 = r4 + 1
            int r5 = r14 >> 8
            byte r5 = (byte) r5
            r9[r15] = r5
            r5 = 0
        L_0x00a3:
            int r15 = r11 + r11
            if (r5 >= r15) goto L_0x0107
            int r15 = r5 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r5 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r5 % 2
            if (r18 != 0) goto L_0x00bf
            r15 = r15 & 15
            goto L_0x00c1
        L_0x00bf:
            int r15 = r15 >> 4
        L_0x00c1:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d4
            int r2 = -r2
        L_0x00d4:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r11
            r11 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.ads.interactivemedia.p038v3.internal.amm.m14191H(r14, r2, r11)
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r4] = r2
            int r2 = r4 + 1
            int r11 = r14 >> 8
            byte r11 = (byte) r11
            r9[r2] = r11
            int[] r2 = f19539a
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r11 = 0
            int r12 = com.google.ads.interactivemedia.p038v3.internal.amm.m14191H(r12, r11, r2)
            int[] r11 = f19540b
            r11 = r11[r12]
            int r5 = r5 + 1
            r2 = r16
            r16 = r11
            r11 = r21
            goto L_0x00a3
        L_0x0107:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x010f:
            r16 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0052
        L_0x0117:
            int r2 = r0.f19544f
            int r2 = r2 * r1
            int r2 = r0.m19446f(r2)
            r4 = 0
            r3.mo13951i(r4)
            r3.mo13949g(r2)
            int r2 = r0.f19549k
            com.google.ads.interactivemedia.v3.internal.xk r3 = r0.f19543e
            int r3 = r3.f19570d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f19549k = r2
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f19546h
            int r1 = r1.mo13948f()
            com.google.ads.interactivemedia.v3.internal.rw r2 = r0.f19542d
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f19546h
            r2.mo13406d(r3, r1)
            int r2 = r0.f19551m
            int r2 = r2 + r1
            r0.f19551m = r2
            int r1 = r0.m19445e(r2)
            int r2 = r0.f19547i
            if (r1 < r2) goto L_0x014e
            r0.m19444d(r2)
        L_0x014e:
            if (r6 == 0) goto L_0x015b
            int r1 = r0.f19551m
            int r1 = r0.m19445e(r1)
            if (r1 <= 0) goto L_0x015b
            r0.m19444d(r1)
        L_0x015b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4473xg.mo16770c(com.google.ads.interactivemedia.v3.internal.rc, long):boolean");
    }
}
