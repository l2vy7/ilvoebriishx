package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.d0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4610d0 implements vb4 {

    /* renamed from: q */
    public static final cc4 f20177q = C7523b0.f29843b;

    /* renamed from: r */
    private static final qe4 f20178r = C7558c0.f30192a;

    /* renamed from: a */
    private final uq2 f20179a;

    /* renamed from: b */
    private final qc4 f20180b;

    /* renamed from: c */
    private final mc4 f20181c;

    /* renamed from: d */
    private final oc4 f20182d;

    /* renamed from: e */
    private final ad4 f20183e;

    /* renamed from: f */
    private yb4 f20184f;

    /* renamed from: g */
    private ad4 f20185g;

    /* renamed from: h */
    private ad4 f20186h;

    /* renamed from: i */
    private int f20187i;

    /* renamed from: j */
    private zzdd f20188j;

    /* renamed from: k */
    private long f20189k;

    /* renamed from: l */
    private long f20190l;

    /* renamed from: m */
    private long f20191m;

    /* renamed from: n */
    private int f20192n;

    /* renamed from: o */
    private C7666f0 f20193o;

    /* renamed from: p */
    private boolean f20194p;

    public C4610d0() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0163  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20259e(com.google.android.gms.internal.ads.wb4 r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f20187i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m20264k(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.f0 r2 = r0.f20193o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.uq2 r14 = new com.google.android.gms.internal.ads.uq2
            com.google.android.gms.internal.ads.qc4 r2 = r0.f20180b
            int r2 = r2.f37976c
            r14.<init>((int) r2)
            byte[] r2 = r14.mo35238h()
            com.google.android.gms.internal.ads.qc4 r9 = r0.f20180b
            int r9 = r9.f37976c
            r10 = r1
            com.google.android.gms.internal.ads.qb4 r10 = (com.google.android.gms.internal.ads.qb4) r10
            r10.mo33311e(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.qc4 r2 = r0.f20180b
            int r9 = r2.f37974a
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.f37978e
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.f37978e
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.mo35242l()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.mo35236f(r2)
            int r9 = r14.mo35243m()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.mo35242l()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.mo35236f(r10)
            int r9 = r14.mo35243m()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.zzc()
            long r11 = r17.zze()
            com.google.android.gms.internal.ads.qc4 r13 = r0.f20180b
            com.google.android.gms.internal.ads.g0 r2 = com.google.android.gms.internal.ads.C7703g0.m32310a(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.qc4 r9 = r0.f20180b
            int r9 = r9.f37976c
            r10 = r1
            com.google.android.gms.internal.ads.qb4 r10 = (com.google.android.gms.internal.ads.qb4) r10
            r10.mo34305k(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.zzj()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.zzc()
            long r12 = r17.zze()
            com.google.android.gms.internal.ads.qc4 r8 = r0.f20180b
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.h0 r8 = com.google.android.gms.internal.ads.C7739h0.m32757a(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.mc4 r9 = r0.f20181c
            boolean r9 = r9.mo33527a()
            if (r9 != 0) goto L_0x00f3
            r17.zzj()
            r9 = r1
            com.google.android.gms.internal.ads.qb4 r9 = (com.google.android.gms.internal.ads.qb4) r9
            int r2 = r2 + 141
            r9.mo34304j(r2, r4)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20179a
            byte[] r2 = r2.mo35238h()
            r10 = 3
            r9.mo33311e(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20179a
            r2.mo35236f(r4)
            com.google.android.gms.internal.ads.mc4 r2 = r0.f20181c
            com.google.android.gms.internal.ads.uq2 r9 = r0.f20179a
            int r9 = r9.mo35251u()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.f35496a = r10
            r2.f35497b = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.qc4 r2 = r0.f20180b
            int r2 = r2.f37976c
            r9 = r1
            com.google.android.gms.internal.ads.qb4 r9 = (com.google.android.gms.internal.ads.qb4) r9
            r9.mo34305k(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.zzh()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.f0 r2 = r0.m20261h(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.zzdd r7 = r0.f20188j
            long r8 = r17.zze()
            if (r7 == 0) goto L_0x0158
            int r10 = r7.mo36273a()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x0158
            com.google.android.gms.internal.ads.zzdc r12 = r7.mo36274b(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzzy
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzzy r12 = (com.google.android.gms.internal.ads.zzzy) r12
            int r10 = r7.mo36273a()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x014f
            com.google.android.gms.internal.ads.zzdc r13 = r7.mo36274b(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.zzaac
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzaac r13 = (com.google.android.gms.internal.ads.zzaac) r13
            java.lang.String r14 = r13.f43118b
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014c
            java.lang.String r7 = r13.f42848d
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.xy3.m39691c(r10)
            goto L_0x0150
        L_0x014c:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x014f:
            r10 = r5
        L_0x0150:
            com.google.android.gms.internal.ads.a0 r7 = com.google.android.gms.internal.ads.C7487a0.m30188a(r8, r12, r10)
            goto L_0x0159
        L_0x0155:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0158:
            r7 = 0
        L_0x0159:
            boolean r8 = r0.f20194p
            if (r8 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.e0 r2 = new com.google.android.gms.internal.ads.e0
            r2.<init>()
            goto L_0x0174
        L_0x0163:
            if (r7 == 0) goto L_0x0167
            r2 = r7
            goto L_0x016a
        L_0x0167:
            if (r2 != 0) goto L_0x016a
            r2 = 0
        L_0x016a:
            if (r2 == 0) goto L_0x0170
            r2.zzh()
            goto L_0x0174
        L_0x0170:
            com.google.android.gms.internal.ads.f0 r2 = r0.m20261h(r1, r4)
        L_0x0174:
            r0.f20193o = r2
            com.google.android.gms.internal.ads.yb4 r7 = r0.f20184f
            r7.mo18210l(r2)
            com.google.android.gms.internal.ads.ad4 r2 = r0.f20186h
            com.google.android.gms.internal.ads.ge4 r7 = new com.google.android.gms.internal.ads.ge4
            r7.<init>()
            com.google.android.gms.internal.ads.qc4 r8 = r0.f20180b
            java.lang.String r8 = r8.f37975b
            r7.mo32093s(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo32086l(r8)
            com.google.android.gms.internal.ads.qc4 r8 = r0.f20180b
            int r8 = r8.f37978e
            r7.mo32076e0(r8)
            com.google.android.gms.internal.ads.qc4 r8 = r0.f20180b
            int r8 = r8.f37977d
            r7.mo32094t(r8)
            com.google.android.gms.internal.ads.mc4 r8 = r0.f20181c
            int r8 = r8.f35496a
            r7.mo32071c(r8)
            com.google.android.gms.internal.ads.mc4 r8 = r0.f20181c
            int r8 = r8.f35497b
            r7.mo32073d(r8)
            com.google.android.gms.internal.ads.zzdd r8 = r0.f20188j
            r7.mo32087m(r8)
            com.google.android.gms.internal.ads.w r7 = r7.mo32099y()
            r2.mo30354a(r7)
            long r7 = r17.zze()
            r0.f20191m = r7
            goto L_0x01d7
        L_0x01bd:
            long r7 = r0.f20191m
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01d7
            long r7 = r17.zze()
            long r9 = r0.f20191m
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d7
            r2 = r1
            com.google.android.gms.internal.ads.qb4 r2 = (com.google.android.gms.internal.ads.qb4) r2
            long r9 = r9 - r7
            int r7 = (int) r9
            r2.mo34305k(r7, r4)
        L_0x01d7:
            int r2 = r0.f20192n
            if (r2 != 0) goto L_0x023b
            r17.zzj()
            boolean r2 = r16.m20263j(r17)
            if (r2 == 0) goto L_0x01e5
            goto L_0x024d
        L_0x01e5:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20179a
            r2.mo35236f(r4)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20179a
            int r2 = r2.mo35243m()
            int r7 = r0.f20187i
            long r7 = (long) r7
            boolean r7 = m20262i(r2, r7)
            if (r7 == 0) goto L_0x0232
            int r7 = com.google.android.gms.internal.ads.rc4.m37022b(r2)
            if (r7 != r3) goto L_0x0200
            goto L_0x0232
        L_0x0200:
            com.google.android.gms.internal.ads.qc4 r7 = r0.f20180b
            r7.mo34320a(r2)
            long r7 = r0.f20189k
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0217
            com.google.android.gms.internal.ads.f0 r2 = r0.f20193o
            long r5 = r17.zze()
            long r5 = r2.mo30270e(r5)
            r0.f20189k = r5
        L_0x0217:
            com.google.android.gms.internal.ads.qc4 r2 = r0.f20180b
            int r5 = r2.f37976c
            r0.f20192n = r5
            com.google.android.gms.internal.ads.f0 r6 = r0.f20193o
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.C8388z
            if (r7 != 0) goto L_0x0225
            r2 = r5
            goto L_0x023b
        L_0x0225:
            com.google.android.gms.internal.ads.z r6 = (com.google.android.gms.internal.ads.C8388z) r6
            long r3 = r0.f20190l
            int r1 = r2.f37980g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m20260g(r3)
            r1 = 0
            throw r1
        L_0x0232:
            com.google.android.gms.internal.ads.qb4 r1 = (com.google.android.gms.internal.ads.qb4) r1
            r5 = 1
            r1.mo34305k(r5, r4)
            r0.f20187i = r4
            goto L_0x024c
        L_0x023b:
            r5 = 1
            com.google.android.gms.internal.ads.ad4 r6 = r0.f20186h
            int r1 = r6.mo30355b(r1, r2, r5)
            if (r1 != r3) goto L_0x0245
            goto L_0x024d
        L_0x0245:
            int r2 = r0.f20192n
            int r2 = r2 - r1
            r0.f20192n = r2
            if (r2 <= 0) goto L_0x024e
        L_0x024c:
            r3 = 0
        L_0x024d:
            return r3
        L_0x024e:
            com.google.android.gms.internal.ads.ad4 r5 = r0.f20186h
            long r1 = r0.f20190l
            long r6 = r0.m20260g(r1)
            r8 = 1
            com.google.android.gms.internal.ads.qc4 r1 = r0.f20180b
            int r9 = r1.f37976c
            r10 = 0
            r11 = 0
            r5.mo30358e(r6, r8, r9, r10, r11)
            long r1 = r0.f20190l
            com.google.android.gms.internal.ads.qc4 r3 = r0.f20180b
            int r3 = r3.f37980g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f20190l = r1
            r0.f20192n = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4610d0.m20259e(com.google.android.gms.internal.ads.wb4):int");
    }

    /* renamed from: g */
    private final long m20260g(long j) {
        return this.f20189k + ((j * 1000000) / ((long) this.f20180b.f37977d));
    }

    /* renamed from: h */
    private final C7666f0 m20261h(wb4 wb4, boolean z) throws IOException {
        ((qb4) wb4).mo33311e(this.f20179a.mo35238h(), 0, 4, false);
        this.f20179a.mo35236f(0);
        this.f20180b.mo34320a(this.f20179a.mo35243m());
        return new C8352y(wb4.zzc(), wb4.zze(), this.f20180b, false);
    }

    /* renamed from: i */
    private static boolean m20262i(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: j */
    private final boolean m20263j(wb4 wb4) throws IOException {
        C7666f0 f0Var = this.f20193o;
        if (f0Var != null) {
            long zzb = f0Var.zzb();
            if (zzb != -1 && wb4.zzd() > zzb - 4) {
                return true;
            }
        }
        try {
            return !wb4.mo33311e(this.f20179a.mo35238h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m20264k(wb4 wb4, boolean z) throws IOException {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        wb4.zzj();
        if (wb4.zze() == 0) {
            zzdd a = this.f20182d.mo33867a(wb4, (qe4) null);
            this.f20188j = a;
            if (a != null) {
                this.f20181c.mo33528b(a);
            }
            i = (int) wb4.zzd();
            if (!z) {
                ((qb4) wb4).mo34305k(i, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m20263j(wb4)) {
                this.f20179a.mo35236f(0);
                int m = this.f20179a.mo35243m();
                if ((i2 == 0 || m20262i(m, (long) i2)) && (b = rc4.m37022b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f20180b.mo34320a(m);
                        i2 = m;
                    }
                    ((qb4) wb4).mo34304j(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            wb4.zzj();
                            ((qb4) wb4).mo34304j(i + i6, false);
                        } else {
                            ((qb4) wb4).mo34305k(1, false);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C7811iy.m33482a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((qb4) wb4).mo34305k(i + i5, false);
        } else {
            wb4.zzj();
        }
        this.f20187i = i2;
        return true;
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return m20264k(wb4, true);
    }

    /* renamed from: b */
    public final void mo18188b() {
        this.f20194p = true;
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        nu1.m20743b(this.f20185g);
        int i = d13.f20195a;
        int e = m20259e(wb4);
        if (e == -1 && (this.f20193o instanceof C8388z)) {
            if (this.f20193o.zze() != m20260g(this.f20190l)) {
                C8388z zVar = (C8388z) this.f20193o;
                throw null;
            }
        }
        return e;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f20184f = yb4;
        ad4 m = yb4.mo18211m(0, 1);
        this.f20185g = m;
        this.f20186h = m;
        this.f20184f.zzB();
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f20187i = 0;
        this.f20189k = C6540C.TIME_UNSET;
        this.f20190l = 0;
        this.f20192n = 0;
        C7666f0 f0Var = this.f20193o;
        if (f0Var instanceof C8388z) {
            C8388z zVar = (C8388z) f0Var;
            throw null;
        }
    }

    public C4610d0(int i) {
        this.f20179a = new uq2(10);
        this.f20180b = new qc4();
        this.f20181c = new mc4();
        this.f20189k = C6540C.TIME_UNSET;
        this.f20182d = new oc4();
        ub4 ub4 = new ub4();
        this.f20183e = ub4;
        this.f20186h = ub4;
    }
}
