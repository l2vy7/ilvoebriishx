package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.p3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8036p3 implements vb4 {

    /* renamed from: l */
    public static final cc4 f37303l = C7965n3.f35879b;

    /* renamed from: a */
    private final ay2 f37304a = new ay2(0);

    /* renamed from: b */
    private final SparseArray<C8001o3> f37305b = new SparseArray<>();

    /* renamed from: c */
    private final uq2 f37306c = new uq2(4096);

    /* renamed from: d */
    private final C7927m3 f37307d = new C7927m3();

    /* renamed from: e */
    private boolean f37308e;

    /* renamed from: f */
    private boolean f37309f;

    /* renamed from: g */
    private boolean f37310g;

    /* renamed from: h */
    private long f37311h;

    /* renamed from: i */
    private C7890l3 f37312i;

    /* renamed from: j */
    private yb4 f37313j;

    /* renamed from: k */
    private boolean f37314k;

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        byte[] bArr = new byte[14];
        qb4 qb4 = (qb4) wb4;
        qb4.mo33311e(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qb4.mo34304j(bArr[13] & 7, false);
        qb4.mo33311e(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r13, com.google.android.gms.internal.ads.tc4 r14) throws java.io.IOException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.yb4 r0 = r12.f37313j
            com.google.android.gms.internal.ads.nu1.m20743b(r0)
            long r7 = r13.zzc()
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.m3 r0 = r12.f37307d
            boolean r0 = r0.mo33464e()
            if (r0 == 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            com.google.android.gms.internal.ads.m3 r0 = r12.f37307d
            int r13 = r0.mo33461a(r13, r14)
            return r13
        L_0x001f:
            boolean r0 = r12.f37314k
            r11 = 1
            if (r0 != 0) goto L_0x0066
            r12.f37314k = r11
            com.google.android.gms.internal.ads.m3 r0 = r12.f37307d
            long r0 = r0.mo33462b()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.l3 r0 = new com.google.android.gms.internal.ads.l3
            com.google.android.gms.internal.ads.m3 r1 = r12.f37307d
            com.google.android.gms.internal.ads.ay2 r2 = r1.mo33463d()
            com.google.android.gms.internal.ads.m3 r1 = r12.f37307d
            long r3 = r1.mo33462b()
            r1 = r0
            r5 = r7
            r1.<init>(r2, r3, r5)
            r12.f37312i = r0
            com.google.android.gms.internal.ads.yb4 r1 = r12.f37313j
            com.google.android.gms.internal.ads.wc4 r0 = r0.mo33521b()
            r1.mo18210l(r0)
            goto L_0x0066
        L_0x0054:
            com.google.android.gms.internal.ads.yb4 r0 = r12.f37313j
            com.google.android.gms.internal.ads.vc4 r1 = new com.google.android.gms.internal.ads.vc4
            com.google.android.gms.internal.ads.m3 r2 = r12.f37307d
            long r2 = r2.mo33462b()
            r4 = 0
            r1.<init>(r2, r4)
            r0.mo18210l(r1)
        L_0x0066:
            com.google.android.gms.internal.ads.l3 r0 = r12.f37312i
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.mo33524e()
            if (r0 != 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            com.google.android.gms.internal.ads.l3 r0 = r12.f37312i
            int r13 = r0.mo33520a(r13, r14)
            return r13
        L_0x0078:
            r13.zzj()
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x0085
            long r0 = r13.zzd()
            long r7 = r7 - r0
            goto L_0x0086
        L_0x0085:
            r7 = r9
        L_0x0086:
            r14 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r0 = 4
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            return r14
        L_0x0093:
            com.google.android.gms.internal.ads.uq2 r0 = r12.f37306c
            byte[] r0 = r0.mo35238h()
            r1 = 4
            r2 = 0
            boolean r0 = r13.mo33311e(r0, r2, r1, r11)
            if (r0 != 0) goto L_0x00a2
            return r14
        L_0x00a2:
            com.google.android.gms.internal.ads.uq2 r0 = r12.f37306c
            r0.mo35236f(r2)
            com.google.android.gms.internal.ads.uq2 r0 = r12.f37306c
            int r0 = r0.mo35243m()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L_0x00b2
            return r14
        L_0x00b2:
            r14 = 442(0x1ba, float:6.2E-43)
            if (r0 != r14) goto L_0x00d8
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            byte[] r14 = r14.mo35238h()
            com.google.android.gms.internal.ads.qb4 r13 = (com.google.android.gms.internal.ads.qb4) r13
            r0 = 10
            r13.mo33311e(r14, r2, r0, r2)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            r0 = 9
            r14.mo35236f(r0)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            int r14 = r14.mo35249s()
            r14 = r14 & 7
            int r14 = r14 + 14
            r13.mo34305k(r14, r2)
            return r2
        L_0x00d8:
            r14 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r3 = 6
            if (r0 != r14) goto L_0x00f9
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            byte[] r14 = r14.mo35238h()
            com.google.android.gms.internal.ads.qb4 r13 = (com.google.android.gms.internal.ads.qb4) r13
            r13.mo33311e(r14, r2, r1, r2)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            r14.mo35236f(r2)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            int r14 = r14.mo35253w()
            int r14 = r14 + r3
            r13.mo34305k(r14, r2)
            return r2
        L_0x00f9:
            int r14 = r0 >> 8
            if (r14 == r11) goto L_0x0103
            com.google.android.gms.internal.ads.qb4 r13 = (com.google.android.gms.internal.ads.qb4) r13
            r13.mo34305k(r11, r2)
            return r2
        L_0x0103:
            r14 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.google.android.gms.internal.ads.o3> r0 = r12.f37305b
            java.lang.Object r0 = r0.get(r14)
            com.google.android.gms.internal.ads.o3 r0 = (com.google.android.gms.internal.ads.C8001o3) r0
            boolean r4 = r12.f37308e
            if (r4 != 0) goto L_0x018a
            if (r0 != 0) goto L_0x016b
            r4 = 189(0xbd, float:2.65E-43)
            r5 = 0
            if (r14 != r4) goto L_0x0127
            com.google.android.gms.internal.ads.g2 r4 = new com.google.android.gms.internal.ads.g2
            r4.<init>(r5)
            r12.f37309f = r11
            long r5 = r13.zze()
            r12.f37311h = r5
        L_0x0125:
            r5 = r4
            goto L_0x014f
        L_0x0127:
            r4 = r14 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r4 != r6) goto L_0x013b
            com.google.android.gms.internal.ads.f3 r4 = new com.google.android.gms.internal.ads.f3
            r4.<init>(r5)
            r12.f37309f = r11
            long r5 = r13.zze()
            r12.f37311h = r5
            goto L_0x0125
        L_0x013b:
            r4 = r14 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r4 != r6) goto L_0x014f
            com.google.android.gms.internal.ads.s2 r4 = new com.google.android.gms.internal.ads.s2
            r4.<init>(r5)
            r12.f37310g = r11
            long r5 = r13.zze()
            r12.f37311h = r5
            goto L_0x0125
        L_0x014f:
            if (r5 == 0) goto L_0x016b
            com.google.android.gms.internal.ads.e4 r0 = new com.google.android.gms.internal.ads.e4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r4, r14, r6)
            com.google.android.gms.internal.ads.yb4 r4 = r12.f37313j
            r5.mo18073b(r4, r0)
            com.google.android.gms.internal.ads.o3 r0 = new com.google.android.gms.internal.ads.o3
            com.google.android.gms.internal.ads.ay2 r4 = r12.f37304a
            r0.<init>(r5, r4)
            android.util.SparseArray<com.google.android.gms.internal.ads.o3> r4 = r12.f37305b
            r4.put(r14, r0)
        L_0x016b:
            boolean r14 = r12.f37309f
            r4 = 1048576(0x100000, double:5.180654E-318)
            if (r14 == 0) goto L_0x017b
            boolean r14 = r12.f37310g
            if (r14 == 0) goto L_0x017b
            long r4 = r12.f37311h
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r6
        L_0x017b:
            long r6 = r13.zze()
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x018a
            r12.f37308e = r11
            com.google.android.gms.internal.ads.yb4 r14 = r12.f37313j
            r14.zzB()
        L_0x018a:
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            byte[] r14 = r14.mo35238h()
            com.google.android.gms.internal.ads.qb4 r13 = (com.google.android.gms.internal.ads.qb4) r13
            r13.mo33311e(r14, r2, r1, r2)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            r14.mo35236f(r2)
            com.google.android.gms.internal.ads.uq2 r14 = r12.f37306c
            int r14 = r14.mo35253w()
            int r14 = r14 + r3
            if (r0 != 0) goto L_0x01a7
            r13.mo34305k(r14, r2)
            goto L_0x01c8
        L_0x01a7:
            com.google.android.gms.internal.ads.uq2 r1 = r12.f37306c
            r1.mo35233c(r14)
            com.google.android.gms.internal.ads.uq2 r1 = r12.f37306c
            byte[] r1 = r1.mo35238h()
            r13.mo33310d(r1, r2, r14, r2)
            com.google.android.gms.internal.ads.uq2 r13 = r12.f37306c
            r13.mo35236f(r3)
            com.google.android.gms.internal.ads.uq2 r13 = r12.f37306c
            r0.mo33830a(r13)
            com.google.android.gms.internal.ads.uq2 r13 = r12.f37306c
            int r14 = r13.mo35240j()
            r13.mo35235e(r14)
        L_0x01c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8036p3.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f37313j = yb4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r4 != r6) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:12:0x0030->B:14:0x0038, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18191f(long r4, long r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ay2 r4 = r3.f37304a
            long r4 = r4.mo30576e()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.ay2 r4 = r3.f37304a
            long r4 = r4.mo30574c()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.ay2 r4 = r3.f37304a
            r4.mo30577f(r6)
        L_0x0028:
            com.google.android.gms.internal.ads.l3 r4 = r3.f37312i
            r5 = 0
            if (r4 == 0) goto L_0x0030
            r4.mo33523d(r6)
        L_0x0030:
            android.util.SparseArray<com.google.android.gms.internal.ads.o3> r4 = r3.f37305b
            int r4 = r4.size()
            if (r5 >= r4) goto L_0x0046
            android.util.SparseArray<com.google.android.gms.internal.ads.o3> r4 = r3.f37305b
            java.lang.Object r4 = r4.valueAt(r5)
            com.google.android.gms.internal.ads.o3 r4 = (com.google.android.gms.internal.ads.C8001o3) r4
            r4.mo33831b()
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8036p3.mo18191f(long, long):void");
    }
}
