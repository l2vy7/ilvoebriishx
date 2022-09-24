package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.m4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7928m4 implements vb4 {

    /* renamed from: f */
    public static final cc4 f35385f = C7781i4.f33084b;

    /* renamed from: a */
    private yb4 f35386a;

    /* renamed from: b */
    private ad4 f35387b;

    /* renamed from: c */
    private C7854k4 f35388c;

    /* renamed from: d */
    private int f35389d = -1;

    /* renamed from: e */
    private long f35390e = -1;

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return C8037p4.m35949a(wb4) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r15 != 65534) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r14, com.google.android.gms.internal.ads.tc4 r15) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.ad4 r15 = r13.f35387b
            com.google.android.gms.internal.ads.nu1.m20743b(r15)
            int r15 = com.google.android.gms.internal.ads.d13.f20195a
            com.google.android.gms.internal.ads.k4 r15 = r13.f35388c
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x0099
            com.google.android.gms.internal.ads.n4 r5 = com.google.android.gms.internal.ads.C8037p4.m35949a(r14)
            if (r5 == 0) goto L_0x0091
            int r15 = r5.f35892a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.google.android.gms.internal.ads.j4 r15 = new com.google.android.gms.internal.ads.j4
            com.google.android.gms.internal.ads.yb4 r2 = r13.f35386a
            com.google.android.gms.internal.ads.ad4 r3 = r13.f35387b
            r15.<init>(r2, r3, r5)
            r13.f35388c = r15
            goto L_0x0099
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0039
            com.google.android.gms.internal.ads.l4 r15 = new com.google.android.gms.internal.ads.l4
            com.google.android.gms.internal.ads.yb4 r3 = r13.f35386a
            com.google.android.gms.internal.ads.ad4 r4 = r13.f35387b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f35388c = r15
            goto L_0x0099
        L_0x0039:
            r2 = 7
            if (r15 != r2) goto L_0x004c
            com.google.android.gms.internal.ads.l4 r15 = new com.google.android.gms.internal.ads.l4
            com.google.android.gms.internal.ads.yb4 r3 = r13.f35386a
            com.google.android.gms.internal.ads.ad4 r4 = r13.f35387b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f35388c = r15
            goto L_0x0099
        L_0x004c:
            int r2 = r5.f35896e
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
            int r15 = com.google.android.gms.internal.ads.d13.m20287R(r2)
            r7 = r15
        L_0x0066:
            if (r7 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.l4 r15 = new com.google.android.gms.internal.ads.l4
            com.google.android.gms.internal.ads.yb4 r3 = r13.f35386a
            com.google.android.gms.internal.ads.ad4 r4 = r13.f35387b
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f35388c = r15
            goto L_0x0099
        L_0x0077:
            int r14 = r5.f35892a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 40
            r15.<init>(r0)
            java.lang.String r0 = "Unsupported WAV format type: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.google.android.gms.internal.ads.iy r14 = com.google.android.gms.internal.ads.C7811iy.m33484c(r14)
            throw r14
        L_0x0091:
            r14 = 0
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            com.google.android.gms.internal.ads.iy r14 = com.google.android.gms.internal.ads.C7811iy.m33482a(r15, r14)
            throw r14
        L_0x0099:
            int r15 = r13.f35389d
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x016d
            r14.zzj()
            com.google.android.gms.internal.ads.uq2 r15 = new com.google.android.gms.internal.ads.uq2
            r5 = 8
            r15.<init>((int) r5)
            com.google.android.gms.internal.ads.o4 r6 = com.google.android.gms.internal.ads.C8002o4.m35561a(r14, r15)
        L_0x00ae:
            int r7 = r6.f36268a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x010d
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00d7
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00d7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 39
            r10.<init>(r11)
            java.lang.String r11 = "Ignoring unknown WAV chunk: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00d7:
            long r9 = r6.f36269b
            r11 = 8
            long r9 = r9 + r11
            int r6 = r6.f36268a
            if (r6 != r8) goto L_0x00e2
            r9 = 12
        L_0x00e2:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00f5
            r6 = r14
            com.google.android.gms.internal.ads.qb4 r6 = (com.google.android.gms.internal.ads.qb4) r6
            int r7 = (int) r9
            r6.mo34305k(r7, r1)
            com.google.android.gms.internal.ads.o4 r6 = com.google.android.gms.internal.ads.C8002o4.m35561a(r14, r15)
            goto L_0x00ae
        L_0x00f5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = 51
            r14.<init>(r15)
            java.lang.String r15 = "Chunk is too large (~2GB+) to skip; id: "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.iy r14 = com.google.android.gms.internal.ads.C7811iy.m33484c(r14)
            throw r14
        L_0x010d:
            r15 = r14
            com.google.android.gms.internal.ads.qb4 r15 = (com.google.android.gms.internal.ads.qb4) r15
            r15.mo34305k(r5, r1)
            long r7 = r14.zze()
            long r5 = r6.f36269b
            long r5 = r5 + r7
            long r10 = r14.zzc()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0145
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0145
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
        L_0x0145:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f35389d = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f35390e = r5
            com.google.android.gms.internal.ads.k4 r15 = r13.f35388c
            int r7 = r13.f35389d
            r15.zza(r7, r5)
            goto L_0x017f
        L_0x016d:
            long r5 = r14.zze()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x017f
            int r15 = r13.f35389d
            r5 = r14
            com.google.android.gms.internal.ads.qb4 r5 = (com.google.android.gms.internal.ads.qb4) r5
            r5.mo34305k(r15, r1)
        L_0x017f:
            long r5 = r13.f35390e
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            com.google.android.gms.internal.ads.nu1.m20747f(r0)
            long r2 = r13.f35390e
            long r5 = r14.zze()
            com.google.android.gms.internal.ads.k4 r15 = r13.f35388c
            long r2 = r2 - r5
            boolean r14 = r15.mo32830b(r14, r2)
            if (r14 == 0) goto L_0x019a
            return r4
        L_0x019a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7928m4.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f35386a = yb4;
        this.f35387b = yb4.mo18211m(0, 1);
        yb4.zzB();
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        C7854k4 k4Var = this.f35388c;
        if (k4Var != null) {
            k4Var.mo32829a(j2);
        }
    }
}
