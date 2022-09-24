package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sp */
/* compiled from: IMASDK */
public final class C4347sp implements C4306rb {

    /* renamed from: a */
    private final alw f18632a = new alw(12);

    /* renamed from: b */
    private C4309re f18633b;

    /* renamed from: c */
    private int f18634c;

    /* renamed from: d */
    private int f18635d;

    /* renamed from: e */
    private int f18636e;

    /* renamed from: f */
    private long f18637f = -1;

    /* renamed from: g */
    private C4538zr f18638g;

    /* renamed from: h */
    private C4307rc f18639h;

    /* renamed from: i */
    private C4350ss f18640i;

    /* renamed from: j */
    private C4394ui f18641j;

    /* renamed from: a */
    private final void m18879a() {
        m18880b(new C4506ym[0]);
        C4309re reVar = this.f18633b;
        aup.m14890u(reVar);
        reVar.mo13363bb();
        this.f18633b.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
        this.f18634c = 6;
    }

    /* renamed from: b */
    private final void m18880b(C4506ym... ymVarArr) {
        C4309re reVar = this.f18633b;
        aup.m14890u(reVar);
        C4327rw ba = reVar.mo13362ba(1024, 4);
        C4119kd kdVar = new C4119kd();
        kdVar.mo16112X(new C4507yn(ymVarArr));
        ba.mo13403a(kdVar.mo16115a());
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        rcVar.mo16600g(this.f18632a.mo13952j(), 0, 12);
        if (this.f18632a.mo13958p() == 65496 && this.f18632a.mo13958p() == 65505) {
            this.f18632a.mo13954l(2);
            if (this.f18632a.mo13963u() == 1165519206 && this.f18632a.mo13958p() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18633b = reVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13691f(com.google.ads.interactivemedia.p038v3.internal.C4307rc r24, com.google.ads.interactivemedia.p038v3.internal.C4321rq r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f18634c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x0185
            if (r3 == r6) goto L_0x0169
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
            com.google.ads.interactivemedia.v3.internal.ss r3 = r0.f18640i
            if (r3 == 0) goto L_0x002c
            com.google.ads.interactivemedia.v3.internal.rc r3 = r0.f18639h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f18639h = r1
            com.google.ads.interactivemedia.v3.internal.ss r3 = new com.google.ads.interactivemedia.v3.internal.ss
            long r4 = r0.f18637f
            r3.<init>(r1, r4)
            r0.f18640i = r3
        L_0x0037:
            com.google.ads.interactivemedia.v3.internal.ui r1 = r0.f18641j
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r1)
            com.google.ads.interactivemedia.v3.internal.ss r3 = r0.f18640i
            int r1 = r1.mo13691f(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f18533a
            long r5 = r0.f18637f
            long r3 = r3 + r5
            r2.f18533a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.mo16605l()
            long r7 = r0.f18637f
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18632a
            byte[] r2 = r2.mo13952j()
            boolean r2 = r1.mo16599f(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.m18879a()
            goto L_0x00a8
        L_0x0066:
            r24.mo16603j()
            com.google.ads.interactivemedia.v3.internal.ui r2 = r0.f18641j
            if (r2 != 0) goto L_0x0074
            com.google.ads.interactivemedia.v3.internal.ui r2 = new com.google.ads.interactivemedia.v3.internal.ui
            r2.<init>()
            r0.f18641j = r2
        L_0x0074:
            com.google.ads.interactivemedia.v3.internal.ss r2 = new com.google.ads.interactivemedia.v3.internal.ss
            long r3 = r0.f18637f
            r2.<init>(r1, r3)
            r0.f18640i = r2
            com.google.ads.interactivemedia.v3.internal.ui r1 = r0.f18641j
            boolean r1 = r1.mo13689d(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.ads.interactivemedia.v3.internal.ui r1 = r0.f18641j
            com.google.ads.interactivemedia.v3.internal.su r2 = new com.google.ads.interactivemedia.v3.internal.su
            long r3 = r0.f18637f
            com.google.ads.interactivemedia.v3.internal.re r7 = r0.f18633b
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r7)
            r2.<init>(r3, r7)
            r1.mo13690e(r2)
            com.google.ads.interactivemedia.v3.internal.ym[] r1 = new com.google.ads.interactivemedia.p038v3.internal.C4506ym[r6]
            com.google.ads.interactivemedia.v3.internal.zr r2 = r0.f18638g
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r1[r9] = r2
            r0.m18880b(r1)
            r0.f18634c = r5
            goto L_0x00a8
        L_0x00a5:
            r23.m18879a()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.f18533a = r7
            return r6
        L_0x00ac:
            int r2 = r0.f18635d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0160
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            int r3 = r0.f18636e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo13952j()
            int r4 = r0.f18636e
            r1.mo16596c(r3, r9, r4)
            com.google.ads.interactivemedia.v3.internal.zr r3 = r0.f18638g
            if (r3 != 0) goto L_0x0165
            java.lang.String r3 = r2.mo13940I()
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0165
            java.lang.String r2 = r2.mo13940I()
            if (r2 == 0) goto L_0x0165
            long r3 = r24.mo16606m()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e4
        L_0x00e1:
            r1 = 0
            goto L_0x0157
        L_0x00e4:
            com.google.ads.interactivemedia.v3.internal.sr r2 = com.google.ads.interactivemedia.p038v3.internal.C4353sv.m18896a(r2)
            if (r2 != 0) goto L_0x00eb
            goto L_0x00e1
        L_0x00eb:
            java.util.List<com.google.ads.interactivemedia.v3.internal.sq> r6 = r2.f18646b
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f4
            goto L_0x00e1
        L_0x00f4:
            java.util.List<com.google.ads.interactivemedia.v3.internal.sq> r5 = r2.f18646b
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0102:
            if (r5 < 0) goto L_0x013d
            java.util.List<com.google.ads.interactivemedia.v3.internal.sq> r10 = r2.f18646b
            java.lang.Object r10 = r10.get(r5)
            com.google.ads.interactivemedia.v3.internal.sq r10 = (com.google.ads.interactivemedia.p038v3.internal.C4348sq) r10
            java.lang.String r15 = r10.f18642a
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x011d
            long r9 = r10.f18644c
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0121
        L_0x011d:
            long r9 = r10.f18643b
            long r9 = r3 - r9
        L_0x0121:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0132
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0132
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0133
        L_0x0132:
            r6 = r1
        L_0x0133:
            if (r5 != 0) goto L_0x0136
            r13 = r9
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r11 = r3
        L_0x0139:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0102
        L_0x013d:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e1
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e1
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e1
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x014e
            goto L_0x00e1
        L_0x014e:
            com.google.ads.interactivemedia.v3.internal.zr r1 = new com.google.ads.interactivemedia.v3.internal.zr
            long r2 = r2.f18645a
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x0157:
            r0.f18638g = r1
            if (r1 == 0) goto L_0x0165
            long r1 = r1.f19776d
            r0.f18637f = r1
            goto L_0x0165
        L_0x0160:
            int r2 = r0.f18636e
            r1.mo16597d(r2)
        L_0x0165:
            r2 = 0
            r0.f18634c = r2
            return r2
        L_0x0169:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18632a
            r3.mo13943a(r5)
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18632a
            byte[] r3 = r3.mo13952j()
            r1.mo16596c(r3, r2, r5)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f18632a
            int r1 = r1.mo13958p()
            int r1 = r1 + -2
            r0.f18636e = r1
            r0.f18634c = r5
            return r2
        L_0x0185:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18632a
            r3.mo13943a(r5)
            com.google.ads.interactivemedia.v3.internal.alw r3 = r0.f18632a
            byte[] r3 = r3.mo13952j()
            r1.mo16596c(r3, r2, r5)
            com.google.ads.interactivemedia.v3.internal.alw r1 = r0.f18632a
            int r1 = r1.mo13958p()
            r0.f18635d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01ae
            long r1 = r0.f18637f
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01aa
            r0.f18634c = r4
            goto L_0x01bf
        L_0x01aa:
            r23.m18879a()
            goto L_0x01bf
        L_0x01ae:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01b8
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01bf
        L_0x01b8:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01bf
            r0.f18634c = r6
        L_0x01bf:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4347sp.mo13691f(com.google.ads.interactivemedia.v3.internal.rc, com.google.ads.interactivemedia.v3.internal.rq):int");
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        if (j == 0) {
            this.f18634c = 0;
        } else if (this.f18634c == 5) {
            C4394ui uiVar = this.f18641j;
            aup.m14890u(uiVar);
            uiVar.mo13692g(j, j2);
        }
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
