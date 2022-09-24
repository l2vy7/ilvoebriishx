package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j44 implements b54, a54 {

    /* renamed from: b */
    public final b54 f33768b;

    /* renamed from: c */
    private a54 f33769c;

    /* renamed from: d */
    private i44[] f33770d = new i44[0];

    /* renamed from: e */
    private long f33771e = 0;

    /* renamed from: f */
    long f33772f;

    public j44(b54 b54, boolean z, long j, long j2) {
        this.f33768b = b54;
        this.f33772f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo18199a(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f33771e = r0
            com.google.android.gms.internal.ads.i44[] r0 = r7.f33770d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo32552c()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.b54 r0 = r7.f33768b
            long r0 = r0.mo18199a(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.f33772f
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.android.gms.internal.ads.nu1.m20747f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j44.mo18199a(long):long");
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        return this.f33768b.mo18200b(j);
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
        this.f33768b.mo18201c(j);
    }

    /* renamed from: d */
    public final void mo30309d(b54 b54) {
        a54 a54 = this.f33769c;
        Objects.requireNonNull(a54);
        a54.mo30309d(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r4 > r7) goto L_0x004d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo18203e(com.google.android.gms.internal.ads.e74[] r14, boolean[] r15, com.google.android.gms.internal.ads.r64[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            int r2 = r1.length
            com.google.android.gms.internal.ads.i44[] r3 = new com.google.android.gms.internal.ads.i44[r2]
            r0.f33770d = r3
            com.google.android.gms.internal.ads.r64[] r2 = new com.google.android.gms.internal.ads.r64[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.i44[] r5 = r0.f33770d
            r6 = r1[r4]
            com.google.android.gms.internal.ads.i44 r6 = (com.google.android.gms.internal.ads.i44) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.r64 r11 = r6.f33089a
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.b54 r4 = r0.f33768b
            r5 = r14
            r6 = r15
            r7 = r2
            r8 = r17
            r9 = r18
            long r4 = r4.mo18203e(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f33771e = r6
            r6 = 1
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x004e
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x004d
            long r7 = r0.f33772f
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x004e
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            com.google.android.gms.internal.ads.nu1.m20747f(r6)
        L_0x0051:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0077
            r6 = r2[r3]
            if (r6 != 0) goto L_0x005d
            com.google.android.gms.internal.ads.i44[] r6 = r0.f33770d
            r6[r3] = r11
            goto L_0x006e
        L_0x005d:
            com.google.android.gms.internal.ads.i44[] r7 = r0.f33770d
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.r64 r8 = r8.f33089a
            if (r8 == r6) goto L_0x006e
        L_0x0067:
            com.google.android.gms.internal.ads.i44 r8 = new com.google.android.gms.internal.ads.i44
            r8.<init>(r13, r6)
            r7[r3] = r8
        L_0x006e:
            com.google.android.gms.internal.ads.i44[] r6 = r0.f33770d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j44.mo18203e(com.google.android.gms.internal.ads.e74[], boolean[], com.google.android.gms.internal.ads.r64[], boolean[], long):long");
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32848f(t64 t64) {
        b54 b54 = (b54) t64;
        a54 a54 = this.f33769c;
        Objects.requireNonNull(a54);
        a54.mo32848f(this);
    }

    /* renamed from: g */
    public final long mo18205g(long j, kx3 kx3) {
        if (j == 0) {
            return 0;
        }
        long U = d13.m20290U(kx3.f34734a, 0, j);
        long j2 = kx3.f34735b;
        long j3 = this.f33772f;
        long U2 = d13.m20290U(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(U == kx3.f34734a && U2 == kx3.f34735b)) {
            kx3 = new kx3(U, U2);
        }
        return this.f33768b.mo18205g(j, kx3);
    }

    /* renamed from: h */
    public final void mo32849h(long j, long j2) {
        this.f33772f = j2;
    }

    /* renamed from: i */
    public final void mo18207i(long j, boolean z) {
        this.f33768b.mo18207i(j, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo32850j() {
        return this.f33771e != C6540C.TIME_UNSET;
    }

    /* renamed from: k */
    public final void mo18209k(a54 a54, long j) {
        this.f33769c = a54;
        this.f33768b.mo18209k(this, j);
    }

    public final long zzb() {
        long zzb = this.f33768b.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.f33772f;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzc() {
        long zzc = this.f33768b.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.f33772f;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzd() {
        if (mo32850j()) {
            long j = this.f33771e;
            this.f33771e = C6540C.TIME_UNSET;
            long zzd = zzd();
            return zzd != C6540C.TIME_UNSET ? zzd : j;
        }
        long zzd2 = this.f33768b.zzd();
        if (zzd2 == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        boolean z = false;
        nu1.m20747f(zzd2 >= 0);
        long j2 = this.f33772f;
        if (j2 == Long.MIN_VALUE || zzd2 <= j2) {
            z = true;
        }
        nu1.m20747f(z);
        return zzd2;
    }

    public final cm0 zzf() {
        return this.f33768b.zzf();
    }

    public final void zzj() throws IOException {
        this.f33768b.zzj();
    }

    public final boolean zzo() {
        return this.f33768b.zzo();
    }
}
