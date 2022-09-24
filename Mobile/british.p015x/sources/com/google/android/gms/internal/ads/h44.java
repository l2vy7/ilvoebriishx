package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h44 implements u54 {

    /* renamed from: a */
    private final cc4 f32612a;

    /* renamed from: b */
    private vb4 f32613b;

    /* renamed from: c */
    private wb4 f32614c;

    public h44(cc4 cc4) {
        this.f32612a = cc4;
    }

    /* renamed from: a */
    public final void mo32348a(long j, long j2) {
        vb4 vb4 = this.f32613b;
        Objects.requireNonNull(vb4);
        vb4.mo18191f(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.zze() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.zze() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32349b(com.google.android.gms.internal.ads.wb1 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.gms.internal.ads.yb4 r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.qb4 r6 = new com.google.android.gms.internal.ads.qb4
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f32614c = r6
            com.google.android.gms.internal.ads.vb4 r8 = r7.f32613b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.cc4 r8 = r7.f32612a
            com.google.android.gms.internal.ads.vb4[] r8 = r8.mo30283a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f32613b = r8
            goto L_0x0074
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.mo18187a(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r2 == 0) goto L_0x0034
            r7.f32613b = r1     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.android.gms.internal.ads.nu1.m20747f(r14)
            r6.zzj()
            goto L_0x0070
        L_0x0034:
            com.google.android.gms.internal.ads.vb4 r1 = r7.f32613b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.zze()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0041:
            r8 = move-exception
            com.google.android.gms.internal.ads.vb4 r9 = r7.f32613b
            if (r9 != 0) goto L_0x004e
            long r9 = r6.zze()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            com.google.android.gms.internal.ads.nu1.m20747f(r13)
            r6.zzj()
            throw r8
        L_0x0056:
            com.google.android.gms.internal.ads.vb4 r1 = r7.f32613b
            if (r1 != 0) goto L_0x0066
            long r1 = r6.zze()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            com.google.android.gms.internal.ads.nu1.m20747f(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0070:
            com.google.android.gms.internal.ads.vb4 r10 = r7.f32613b
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            com.google.android.gms.internal.ads.vb4 r8 = r7.f32613b
            r8.mo18190d(r15)
            return
        L_0x007a:
            com.google.android.gms.internal.ads.x64 r10 = new com.google.android.gms.internal.ads.x64
            java.lang.String r8 = com.google.android.gms.internal.ads.d13.m20306f(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            goto L_0x00a1
        L_0x00a0:
            throw r10
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h44.mo32349b(com.google.android.gms.internal.ads.wb1, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.yb4):void");
    }

    /* renamed from: c */
    public final int mo32350c(tc4 tc4) throws IOException {
        vb4 vb4 = this.f32613b;
        Objects.requireNonNull(vb4);
        wb4 wb4 = this.f32614c;
        Objects.requireNonNull(wb4);
        return vb4.mo18189c(wb4, tc4);
    }

    public final long zzb() {
        wb4 wb4 = this.f32614c;
        if (wb4 != null) {
            return wb4.zze();
        }
        return -1;
    }

    public final void zzc() {
        vb4 vb4 = this.f32613b;
        if (vb4 instanceof C4610d0) {
            ((C4610d0) vb4).mo18188b();
        }
    }

    public final void zze() {
        if (this.f32613b != null) {
            this.f32613b = null;
        }
        this.f32614c = null;
    }
}
