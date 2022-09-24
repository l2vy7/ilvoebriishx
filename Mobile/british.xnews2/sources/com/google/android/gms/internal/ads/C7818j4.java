package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.android.gms.internal.ads.j4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7818j4 implements C7854k4 {

    /* renamed from: m */
    private static final int[] f33747m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f33748n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final yb4 f33749a;

    /* renamed from: b */
    private final ad4 f33750b;

    /* renamed from: c */
    private final C7966n4 f33751c;

    /* renamed from: d */
    private final int f33752d;

    /* renamed from: e */
    private final byte[] f33753e;

    /* renamed from: f */
    private final uq2 f33754f;

    /* renamed from: g */
    private final int f33755g;

    /* renamed from: h */
    private final C8281w f33756h;

    /* renamed from: i */
    private int f33757i;

    /* renamed from: j */
    private long f33758j;

    /* renamed from: k */
    private int f33759k;

    /* renamed from: l */
    private long f33760l;

    public C7818j4(yb4 yb4, ad4 ad4, C7966n4 n4Var) throws C7811iy {
        this.f33749a = yb4;
        this.f33750b = ad4;
        this.f33751c = n4Var;
        int max = Math.max(1, n4Var.f35894c / 10);
        this.f33755g = max;
        uq2 uq2 = new uq2(n4Var.f35897f);
        uq2.mo35247q();
        int q = uq2.mo35247q();
        this.f33752d = q;
        int i = n4Var.f35893b;
        int i2 = (((n4Var.f35895d - (i * 4)) * 8) / (n4Var.f35896e * i)) + 1;
        if (q == i2) {
            int K = d13.m20280K(max, q);
            this.f33753e = new byte[(n4Var.f35895d * K)];
            this.f33754f = new uq2(K * (q + q) * i);
            int i3 = ((n4Var.f35894c * n4Var.f35895d) * 8) / q;
            ge4 ge4 = new ge4();
            ge4.mo32093s(MimeTypes.AUDIO_RAW);
            ge4.mo32074d0(i3);
            ge4.mo32089o(i3);
            ge4.mo32086l((max + max) * i);
            ge4.mo32076e0(n4Var.f35893b);
            ge4.mo32094t(n4Var.f35894c);
            ge4.mo32088n(2);
            this.f33756h = ge4.mo32099y();
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(q);
        throw C7811iy.m33482a(sb.toString(), (Throwable) null);
    }

    /* renamed from: c */
    private final int m33527c(int i) {
        int i2 = this.f33751c.f35893b;
        return i / (i2 + i2);
    }

    /* renamed from: d */
    private final int m33528d(int i) {
        return (i + i) * this.f33751c.f35893b;
    }

    /* renamed from: e */
    private final void m33529e(int i) {
        long j = this.f33758j;
        long Z = d13.m20295Z(this.f33760l, 1000000, (long) this.f33751c.f35894c);
        int d = m33528d(i);
        this.f33750b.mo30358e(j + Z, 1, d, this.f33759k - d, (zc4) null);
        this.f33760l += (long) i;
        this.f33759k -= d;
    }

    /* renamed from: a */
    public final void mo32829a(long j) {
        this.f33757i = 0;
        this.f33758j = j;
        this.f33759k = 0;
        this.f33760l = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: b */
    public final boolean mo32830b(com.google.android.gms.internal.ads.wb4 r20, long r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f33755g
            int r4 = r0.f33759k
            int r4 = r0.m33527c(r4)
            int r3 = r3 - r4
            int r4 = r0.f33752d
            int r3 = com.google.android.gms.internal.ads.d13.m20280K(r3, r4)
            com.google.android.gms.internal.ads.n4 r4 = r0.f33751c
            int r4 = r4.f35895d
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
            int r7 = r0.f33757i
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f33753e
            int r10 = r0.f33757i
            int r8 = (int) r7
            r7 = r20
            int r8 = r7.mo30477b(r9, r10, r8)
            r9 = -1
            if (r8 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f33757i
            int r9 = r9 + r8
            r0.f33757i = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f33757i
            com.google.android.gms.internal.ads.n4 r2 = r0.f33751c
            int r2 = r2.f35895d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014e
            byte[] r2 = r0.f33753e
            com.google.android.gms.internal.ads.uq2 r3 = r0.f33754f
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0117
            r8 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.n4 r9 = r0.f33751c
            int r9 = r9.f35893b
            if (r8 >= r9) goto L_0x010f
            byte[] r9 = r3.mo35238h()
            com.google.android.gms.internal.ads.n4 r10 = r0.f33751c
            int r11 = r10.f35895d
            int r10 = r10.f35893b
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
            int[] r16 = f33748n
            r16 = r16[r12]
            int r4 = r0.f33752d
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
            int r14 = com.google.android.gms.internal.ads.d13.m20281L(r14, r2, r11)
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r4] = r2
            int r2 = r4 + 1
            int r11 = r14 >> 8
            byte r11 = (byte) r11
            r9[r2] = r11
            int[] r2 = f33747m
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r11 = 0
            int r12 = com.google.android.gms.internal.ads.d13.m20281L(r12, r11, r2)
            int[] r11 = f33748n
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
            int r2 = r0.f33752d
            int r2 = r2 * r1
            int r2 = r0.m33528d(r2)
            r4 = 0
            r3.mo35236f(r4)
            r3.mo35235e(r2)
            int r2 = r0.f33757i
            com.google.android.gms.internal.ads.n4 r3 = r0.f33751c
            int r3 = r3.f35895d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f33757i = r2
            com.google.android.gms.internal.ads.uq2 r1 = r0.f33754f
            int r1 = r1.mo35242l()
            com.google.android.gms.internal.ads.ad4 r2 = r0.f33750b
            com.google.android.gms.internal.ads.uq2 r3 = r0.f33754f
            com.google.android.gms.internal.ads.yc4.m39857b(r2, r3, r1)
            int r2 = r0.f33759k
            int r2 = r2 + r1
            r0.f33759k = r2
            int r1 = r0.m33527c(r2)
            int r2 = r0.f33755g
            if (r1 < r2) goto L_0x014e
            r0.m33529e(r2)
        L_0x014e:
            if (r6 == 0) goto L_0x015b
            int r1 = r0.f33759k
            int r1 = r0.m33527c(r1)
            if (r1 <= 0) goto L_0x015b
            r0.m33529e(r1)
        L_0x015b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7818j4.mo32830b(com.google.android.gms.internal.ads.wb4, long):boolean");
    }

    public final void zza(int i, long j) {
        this.f33749a.mo18210l(new C8073q4(this.f33751c, this.f33752d, (long) i, j));
        this.f33750b.mo30354a(this.f33756h);
    }
}
