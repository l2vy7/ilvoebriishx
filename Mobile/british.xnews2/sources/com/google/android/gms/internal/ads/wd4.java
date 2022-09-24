package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wd4 implements vb4 {

    /* renamed from: a */
    private final uq2 f40757a = new uq2(6);

    /* renamed from: b */
    private yb4 f40758b;

    /* renamed from: c */
    private int f40759c;

    /* renamed from: d */
    private int f40760d;

    /* renamed from: e */
    private int f40761e;

    /* renamed from: f */
    private long f40762f = -1;

    /* renamed from: g */
    private zzaak f40763g;

    /* renamed from: h */
    private wb4 f40764h;

    /* renamed from: i */
    private zd4 f40765i;

    /* renamed from: j */
    private C7594d1 f40766j;

    /* renamed from: b */
    private final int m39143b(wb4 wb4) throws IOException {
        this.f40757a.mo35233c(2);
        ((qb4) wb4).mo33311e(this.f40757a.mo35238h(), 0, 2, false);
        return this.f40757a.mo35253w();
    }

    /* renamed from: e */
    private final void m39144e() {
        m39145g(new zzdc[0]);
        yb4 yb4 = this.f40758b;
        Objects.requireNonNull(yb4);
        yb4.zzB();
        this.f40758b.mo18210l(new vc4(C6540C.TIME_UNSET, 0));
        this.f40759c = 6;
    }

    /* renamed from: g */
    private final void m39145g(zzdc... zzdcArr) {
        yb4 yb4 = this.f40758b;
        Objects.requireNonNull(yb4);
        ad4 m = yb4.mo18211m(1024, 4);
        ge4 ge4 = new ge4();
        ge4.mo32082h0(MimeTypes.IMAGE_JPEG);
        ge4.mo32087m(new zzdd(zzdcArr));
        m.mo30354a(ge4.mo32099y());
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        if (m39143b(wb4) != 65496) {
            return false;
        }
        int b = m39143b(wb4);
        this.f40760d = b;
        if (b == 65504) {
            this.f40757a.mo35233c(2);
            qb4 qb4 = (qb4) wb4;
            qb4.mo33311e(this.f40757a.mo35238h(), 0, 2, false);
            qb4.mo34304j(this.f40757a.mo35253w() - 2, false);
            b = m39143b(wb4);
            this.f40760d = b;
        }
        if (b == 65505) {
            qb4 qb42 = (qb4) wb4;
            qb42.mo34304j(2, false);
            this.f40757a.mo35233c(6);
            qb42.mo33311e(this.f40757a.mo35238h(), 0, 6, false);
            if (this.f40757a.mo35223A() == 1165519206 && this.f40757a.mo35253w() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18189c(com.google.android.gms.internal.ads.wb4 r24, com.google.android.gms.internal.ads.tc4 r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f40759c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x016f
            r10 = -1
            if (r3 == r5) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zd4 r3 = r0.f40765i
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.wb4 r3 = r0.f40764h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f40764h = r1
            com.google.android.gms.internal.ads.zd4 r3 = new com.google.android.gms.internal.ads.zd4
            long r4 = r0.f40762f
            r3.<init>(r1, r4)
            r0.f40765i = r3
        L_0x0037:
            com.google.android.gms.internal.ads.d1 r1 = r0.f40766j
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zd4 r3 = r0.f40765i
            int r1 = r1.mo18189c(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f39386a
            long r5 = r0.f40762f
            long r3 = r3 + r5
            r2.f39386a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.zze()
            long r7 = r0.f40762f
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.uq2 r2 = r0.f40757a
            byte[] r2 = r2.mo35238h()
            boolean r2 = r1.mo33311e(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.m39144e()
            goto L_0x00a8
        L_0x0066:
            r24.zzj()
            com.google.android.gms.internal.ads.d1 r2 = r0.f40766j
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.d1 r2 = new com.google.android.gms.internal.ads.d1
            r2.<init>(r9)
            r0.f40766j = r2
        L_0x0074:
            com.google.android.gms.internal.ads.zd4 r2 = new com.google.android.gms.internal.ads.zd4
            long r3 = r0.f40762f
            r2.<init>(r1, r3)
            r0.f40765i = r2
            com.google.android.gms.internal.ads.d1 r1 = r0.f40766j
            boolean r1 = r1.mo18187a(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.d1 r1 = r0.f40766j
            com.google.android.gms.internal.ads.be4 r2 = new com.google.android.gms.internal.ads.be4
            long r3 = r0.f40762f
            com.google.android.gms.internal.ads.yb4 r7 = r0.f40758b
            java.util.Objects.requireNonNull(r7)
            r2.<init>(r3, r7)
            r1.mo18190d(r2)
            com.google.android.gms.internal.ads.zzdc[] r1 = new com.google.android.gms.internal.ads.zzdc[r6]
            com.google.android.gms.internal.ads.zzaak r2 = r0.f40763g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m39145g(r1)
            r0.f40759c = r5
            goto L_0x00a8
        L_0x00a5:
            r23.m39144e()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.f39386a = r7
            return r6
        L_0x00ac:
            int r2 = r0.f40760d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            int r3 = r0.f40761e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo35238h()
            int r4 = r0.f40761e
            r6 = r1
            com.google.android.gms.internal.ads.qb4 r6 = (com.google.android.gms.internal.ads.qb4) r6
            r6.mo33310d(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzaak r3 = r0.f40763g
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.mo35226D(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.mo35226D(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.zzc()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.yd4 r2 = com.google.android.gms.internal.ads.ce4.m30984a(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List<com.google.android.gms.internal.ads.xd4> r6 = r2.f41792b
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List<com.google.android.gms.internal.ads.xd4> r5 = r2.f41792b
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0105:
            if (r5 < 0) goto L_0x0140
            java.util.List<com.google.android.gms.internal.ads.xd4> r10 = r2.f41792b
            java.lang.Object r10 = r10.get(r5)
            com.google.android.gms.internal.ads.xd4 r10 = (com.google.android.gms.internal.ads.xd4) r10
            java.lang.String r15 = r10.f41146a
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x0120
            long r9 = r10.f41149d
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0124
        L_0x0120:
            long r9 = r10.f41148c
            long r9 = r3 - r9
        L_0x0124:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0135
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0135
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0136
        L_0x0135:
            r6 = r1
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r13 = r9
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            r11 = r3
        L_0x013c:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0105
        L_0x0140:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            goto L_0x00e4
        L_0x0151:
            com.google.android.gms.internal.ads.zzaak r1 = new com.google.android.gms.internal.ads.zzaak
            long r2 = r2.f41791a
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x015a:
            r0.f40763g = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.f42858e
            r0.f40762f = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.f40761e
            com.google.android.gms.internal.ads.qb4 r1 = (com.google.android.gms.internal.ads.qb4) r1
            r3 = 0
            r1.mo34305k(r2, r3)
        L_0x016c:
            r0.f40759c = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.uq2 r2 = r0.f40757a
            r2.mo35233c(r5)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f40757a
            byte[] r2 = r2.mo35238h()
            com.google.android.gms.internal.ads.qb4 r1 = (com.google.android.gms.internal.ads.qb4) r1
            r1.mo33310d(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f40757a
            int r1 = r1.mo35253w()
            int r1 = r1 + -2
            r0.f40761e = r1
            r0.f40759c = r5
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.uq2 r2 = r0.f40757a
            r2.mo35233c(r5)
            com.google.android.gms.internal.ads.uq2 r2 = r0.f40757a
            byte[] r2 = r2.mo35238h()
            com.google.android.gms.internal.ads.qb4 r1 = (com.google.android.gms.internal.ads.qb4) r1
            r1.mo33310d(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.uq2 r1 = r0.f40757a
            int r1 = r1.mo35253w()
            r0.f40760d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.f40762f
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.f40759c = r4
            goto L_0x01c9
        L_0x01b4:
            r23.m39144e()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.f40759c = r6
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wd4.mo18189c(com.google.android.gms.internal.ads.wb4, com.google.android.gms.internal.ads.tc4):int");
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f40758b = yb4;
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        if (j == 0) {
            this.f40759c = 0;
            this.f40766j = null;
        } else if (this.f40759c == 5) {
            C7594d1 d1Var = this.f40766j;
            Objects.requireNonNull(d1Var);
            d1Var.mo18191f(j, j2);
        }
    }
}
