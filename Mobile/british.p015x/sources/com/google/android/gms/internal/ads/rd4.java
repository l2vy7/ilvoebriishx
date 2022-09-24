package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rd4 implements vb4 {

    /* renamed from: q */
    public static final cc4 f20684q = qd4.f37993b;

    /* renamed from: a */
    private final uq2 f20685a = new uq2(4);

    /* renamed from: b */
    private final uq2 f20686b = new uq2(9);

    /* renamed from: c */
    private final uq2 f20687c = new uq2(11);

    /* renamed from: d */
    private final uq2 f20688d = new uq2();

    /* renamed from: e */
    private final sd4 f20689e = new sd4();

    /* renamed from: f */
    private yb4 f20690f;

    /* renamed from: g */
    private int f20691g = 1;

    /* renamed from: h */
    private boolean f20692h;

    /* renamed from: i */
    private long f20693i;

    /* renamed from: j */
    private int f20694j;

    /* renamed from: k */
    private int f20695k;

    /* renamed from: l */
    private int f20696l;

    /* renamed from: m */
    private long f20697m;

    /* renamed from: n */
    private boolean f20698n;

    /* renamed from: o */
    private pd4 f20699o;

    /* renamed from: p */
    private vd4 f20700p;

    /* renamed from: b */
    private final uq2 m20896b(wb4 wb4) throws IOException {
        if (this.f20696l > this.f20688d.mo35240j()) {
            uq2 uq2 = this.f20688d;
            int j = uq2.mo35240j();
            uq2.mo35234d(new byte[Math.max(j + j, this.f20696l)], 0);
        } else {
            this.f20688d.mo35236f(0);
        }
        this.f20688d.mo35235e(this.f20696l);
        ((qb4) wb4).mo33310d(this.f20688d.mo35238h(), 0, this.f20696l, false);
        return this.f20688d;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: e */
    private final void m20897e() {
        if (!this.f20698n) {
            this.f20690f.mo18210l(new vc4(C6540C.TIME_UNSET, 0));
            this.f20698n = true;
        }
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        qb4 qb4 = (qb4) wb4;
        qb4.mo33311e(this.f20685a.mo35238h(), 0, 3, false);
        this.f20685a.mo35236f(0);
        if (this.f20685a.mo35251u() != 4607062) {
            return false;
        }
        qb4.mo33311e(this.f20685a.mo35238h(), 0, 2, false);
        this.f20685a.mo35236f(0);
        if ((this.f20685a.mo35253w() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        qb4.mo33311e(this.f20685a.mo35238h(), 0, 4, false);
        this.f20685a.mo35236f(0);
        int m = this.f20685a.mo35243m();
        wb4.zzj();
        qb4 qb42 = (qb4) wb4;
        qb42.mo34304j(m, false);
        qb42.mo33311e(this.f20685a.mo35238h(), 0, 4, false);
        this.f20685a.mo35236f(0);
        if (this.f20685a.mo35243m() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r17, com.google.android.gms.internal.ads.tc4 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.yb4 r2 = r0.f20690f
            com.google.android.gms.internal.ads.nu1.m20743b(r2)
        L_0x0009:
            int r2 = r0.f20691g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0123
            r10 = 3
            if (r2 == r6) goto L_0x0115
            if (r2 == r10) goto L_0x00cd
            if (r2 != r7) goto L_0x00c7
            boolean r2 = r0.f20692h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f20693i
            long r14 = r0.f20697m
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.sd4 r2 = r0.f20689e
            long r2 = r2.mo34698d()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f20697m
        L_0x003b:
            int r14 = r0.f20695k
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.pd4 r14 = r0.f20699o
            if (r14 == 0) goto L_0x0053
            r16.m20897e()
            com.google.android.gms.internal.ads.pd4 r4 = r0.f20699o
            com.google.android.gms.internal.ads.uq2 r5 = r16.m20896b(r17)
            boolean r2 = r4.mo35169c(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a6
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.vd4 r4 = r0.f20700p
            if (r4 == 0) goto L_0x009c
            r16.m20897e()
            com.google.android.gms.internal.ads.vd4 r4 = r0.f20700p
            com.google.android.gms.internal.ads.uq2 r5 = r16.m20896b(r17)
            boolean r2 = r4.mo35169c(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x009c
            boolean r4 = r0.f20698n
            if (r4 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.sd4 r4 = r0.f20689e
            com.google.android.gms.internal.ads.uq2 r5 = r16.m20896b(r17)
            boolean r2 = r4.mo35169c(r5, r2)
            com.google.android.gms.internal.ads.sd4 r3 = r0.f20689e
            long r3 = r3.mo34698d()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.yb4 r5 = r0.f20690f
            com.google.android.gms.internal.ads.pc4 r14 = new com.google.android.gms.internal.ads.pc4
            com.google.android.gms.internal.ads.sd4 r15 = r0.f20689e
            long[] r15 = r15.mo34699e()
            com.google.android.gms.internal.ads.sd4 r10 = r0.f20689e
            long[] r10 = r10.mo34700f()
            r14.<init>(r15, r10, r3)
            r5.mo18210l(r14)
            r0.f20698n = r9
            goto L_0x0050
        L_0x009c:
            int r2 = r0.f20696l
            r3 = r1
            com.google.android.gms.internal.ads.qb4 r3 = (com.google.android.gms.internal.ads.qb4) r3
            r3.mo34305k(r2, r8)
            r2 = 0
            r3 = 0
        L_0x00a6:
            boolean r4 = r0.f20692h
            if (r4 != 0) goto L_0x00c0
            if (r2 == 0) goto L_0x00c0
            r0.f20692h = r9
            com.google.android.gms.internal.ads.sd4 r2 = r0.f20689e
            long r4 = r2.mo34698d()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            long r4 = r0.f20697m
            long r10 = -r4
            goto L_0x00be
        L_0x00bc:
            r10 = 0
        L_0x00be:
            r0.f20693i = r10
        L_0x00c0:
            r0.f20694j = r7
            r0.f20691g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00cd:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            byte[] r2 = r2.mo35238h()
            r4 = 11
            boolean r2 = r1.mo33310d(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00dc
            return r3
        L_0x00dc:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            r2.mo35236f(r8)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            int r2 = r2.mo35249s()
            r0.f20695k = r2
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            int r2 = r2.mo35251u()
            r0.f20696l = r2
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            int r2 = r2.mo35251u()
            long r2 = (long) r2
            r0.f20697m = r2
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            int r2 = r2.mo35249s()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f20697m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f20697m = r2
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20687c
            r2.mo35237g(r10)
            r0.f20691g = r7
            goto L_0x0009
        L_0x0115:
            int r2 = r0.f20694j
            r3 = r1
            com.google.android.gms.internal.ads.qb4 r3 = (com.google.android.gms.internal.ads.qb4) r3
            r3.mo34305k(r2, r8)
            r0.f20694j = r8
            r0.f20691g = r10
            goto L_0x0009
        L_0x0123:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20686b
            byte[] r2 = r2.mo35238h()
            boolean r2 = r1.mo33310d(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0130
            return r3
        L_0x0130:
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20686b
            r2.mo35236f(r8)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20686b
            r2.mo35237g(r7)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20686b
            int r2 = r2.mo35249s()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0156
            com.google.android.gms.internal.ads.pd4 r2 = r0.f20699o
            if (r2 != 0) goto L_0x0156
            com.google.android.gms.internal.ads.pd4 r2 = new com.google.android.gms.internal.ads.pd4
            com.google.android.gms.internal.ads.yb4 r7 = r0.f20690f
            com.google.android.gms.internal.ads.ad4 r4 = r7.mo18211m(r4, r9)
            r2.<init>(r4)
            r0.f20699o = r2
        L_0x0156:
            if (r3 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.vd4 r2 = r0.f20700p
            if (r2 != 0) goto L_0x0169
            com.google.android.gms.internal.ads.vd4 r2 = new com.google.android.gms.internal.ads.vd4
            com.google.android.gms.internal.ads.yb4 r3 = r0.f20690f
            com.google.android.gms.internal.ads.ad4 r3 = r3.mo18211m(r5, r6)
            r2.<init>(r3)
            r0.f20700p = r2
        L_0x0169:
            com.google.android.gms.internal.ads.yb4 r2 = r0.f20690f
            r2.zzB()
            com.google.android.gms.internal.ads.uq2 r2 = r0.f20686b
            int r2 = r2.mo35243m()
            int r2 = r2 + -5
            r0.f20694j = r2
            r0.f20691g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rd4.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f20690f = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        if (j == 0) {
            this.f20691g = 1;
            this.f20692h = false;
        } else {
            this.f20691g = 3;
        }
        this.f20694j = 0;
    }
}
