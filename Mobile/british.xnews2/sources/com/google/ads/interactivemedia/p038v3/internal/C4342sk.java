package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sk */
/* compiled from: IMASDK */
public final class C4342sk implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18605a = 0;

    /* renamed from: b */
    private final alw f18606b = new alw(4);

    /* renamed from: c */
    private final alw f18607c = new alw(9);

    /* renamed from: d */
    private final alw f18608d = new alw(11);

    /* renamed from: e */
    private final alw f18609e = new alw();

    /* renamed from: f */
    private final C4343sl f18610f = new C4343sl();

    /* renamed from: g */
    private C4309re f18611g;

    /* renamed from: h */
    private int f18612h = 1;

    /* renamed from: i */
    private boolean f18613i;

    /* renamed from: j */
    private long f18614j;

    /* renamed from: k */
    private int f18615k;

    /* renamed from: l */
    private int f18616l;

    /* renamed from: m */
    private int f18617m;

    /* renamed from: n */
    private long f18618n;

    /* renamed from: o */
    private boolean f18619o;

    /* renamed from: p */
    private C4340si f18620p;

    /* renamed from: q */
    private C4346so f18621q;

    static {
        int i = C4341sj.f18604b;
    }

    /* renamed from: a */
    private final alw m18858a(C4307rc rcVar) throws IOException {
        if (this.f18617m > this.f18609e.mo13953k()) {
            alw alw = this.f18609e;
            int k = alw.mo13953k();
            alw.mo13945c(new byte[Math.max(k + k, this.f18617m)], 0);
        } else {
            this.f18609e.mo13951i(0);
        }
        this.f18609e.mo13949g(this.f18617m);
        rcVar.mo16596c(this.f18609e.mo13952j(), 0, this.f18617m);
        return this.f18609e;
    }

    /* renamed from: b */
    private final void m18859b() {
        if (!this.f18619o) {
            this.f18611g.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
            this.f18619o = true;
        }
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        rcVar.mo16600g(this.f18606b.mo13952j(), 0, 3);
        this.f18606b.mo13951i(0);
        if (this.f18606b.mo13961s() != 4607062) {
            return false;
        }
        rcVar.mo16600g(this.f18606b.mo13952j(), 0, 2);
        this.f18606b.mo13951i(0);
        if ((this.f18606b.mo13958p() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        rcVar.mo16600g(this.f18606b.mo13952j(), 0, 4);
        this.f18606b.mo13951i(0);
        int w = this.f18606b.mo13965w();
        rcVar.mo16603j();
        rcVar.mo16602i(w);
        rcVar.mo16600g(this.f18606b.mo13952j(), 0, 4);
        this.f18606b.mo13951i(0);
        if (this.f18606b.mo13965w() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18611g = reVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0009 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13691f(com.google.ads.interactivemedia.p038v3.internal.C4307rc r17, com.google.ads.interactivemedia.p038v3.internal.C4321rq r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.ads.interactivemedia.v3.internal.re r2 = r0.f18611g
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r2)
        L_0x0009:
            int r2 = r0.f18612h
            r3 = 8
            r4 = -1
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x011c
            r10 = 3
            if (r2 == r6) goto L_0x0111
            if (r2 == r10) goto L_0x00c9
            if (r2 != r7) goto L_0x00c3
            boolean r2 = r0.f18613i
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r14 = r0.f18614j
            long r10 = r0.f18618n
            long r14 = r14 + r10
            goto L_0x003b
        L_0x002c:
            com.google.ads.interactivemedia.v3.internal.sl r2 = r0.f18610f
            long r10 = r2.mo16634c()
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            r14 = 0
            goto L_0x003b
        L_0x0039:
            long r14 = r0.f18618n
        L_0x003b:
            int r2 = r0.f18616l
            if (r2 != r3) goto L_0x0052
            com.google.ads.interactivemedia.v3.internal.si r3 = r0.f18620p
            if (r3 == 0) goto L_0x0052
            r16.m18859b()
            com.google.ads.interactivemedia.v3.internal.si r2 = r0.f18620p
            com.google.ads.interactivemedia.v3.internal.alw r3 = r16.m18858a(r17)
            boolean r2 = r2.mo16637f(r3, r14)
        L_0x0050:
            r3 = 1
            goto L_0x00a2
        L_0x0052:
            if (r2 != r5) goto L_0x0066
            com.google.ads.interactivemedia.v3.internal.so r3 = r0.f18621q
            if (r3 == 0) goto L_0x0066
            r16.m18859b()
            com.google.ads.interactivemedia.v3.internal.so r2 = r0.f18621q
            com.google.ads.interactivemedia.v3.internal.alw r3 = r16.m18858a(r17)
            boolean r2 = r2.mo16637f(r3, r14)
            goto L_0x0050
        L_0x0066:
            r3 = 18
            if (r2 != r3) goto L_0x009b
            boolean r2 = r0.f18619o
            if (r2 != 0) goto L_0x009b
            com.google.ads.interactivemedia.v3.internal.sl r2 = r0.f18610f
            com.google.ads.interactivemedia.v3.internal.alw r3 = r16.m18858a(r17)
            boolean r2 = r2.mo16637f(r3, r14)
            com.google.ads.interactivemedia.v3.internal.sl r3 = r0.f18610f
            long r3 = r3.mo16634c()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            com.google.ads.interactivemedia.v3.internal.re r5 = r0.f18611g
            com.google.ads.interactivemedia.v3.internal.rp r10 = new com.google.ads.interactivemedia.v3.internal.rp
            com.google.ads.interactivemedia.v3.internal.sl r11 = r0.f18610f
            long[] r11 = r11.mo16636e()
            com.google.ads.interactivemedia.v3.internal.sl r14 = r0.f18610f
            long[] r14 = r14.mo16635d()
            r10.<init>(r11, r14, r3)
            r5.mo13364bc(r10)
            r0.f18619o = r9
            goto L_0x0050
        L_0x009b:
            int r2 = r0.f18617m
            r1.mo16597d(r2)
            r2 = 0
            r3 = 0
        L_0x00a2:
            boolean r4 = r0.f18613i
            if (r4 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            r0.f18613i = r9
            com.google.ads.interactivemedia.v3.internal.sl r2 = r0.f18610f
            long r4 = r2.mo16634c()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b8
            long r4 = r0.f18618n
            long r10 = -r4
            goto L_0x00ba
        L_0x00b8:
            r10 = 0
        L_0x00ba:
            r0.f18614j = r10
        L_0x00bc:
            r0.f18615k = r7
            r0.f18612h = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c9:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            byte[] r2 = r2.mo13952j()
            r3 = 11
            boolean r2 = r1.mo16595b(r2, r8, r3, r9)
            if (r2 != 0) goto L_0x00d8
            return r4
        L_0x00d8:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            r2.mo13951i(r8)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            int r2 = r2.mo13957o()
            r0.f18616l = r2
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            int r2 = r2.mo13961s()
            r0.f18617m = r2
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            int r2 = r2.mo13961s()
            long r2 = (long) r2
            r0.f18618n = r2
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            int r2 = r2.mo13957o()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f18618n
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f18618n = r2
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18608d
            r2.mo13954l(r10)
            r0.f18612h = r7
            goto L_0x0009
        L_0x0111:
            int r2 = r0.f18615k
            r1.mo16597d(r2)
            r0.f18615k = r8
            r0.f18612h = r10
            goto L_0x0009
        L_0x011c:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18607c
            byte[] r2 = r2.mo13952j()
            boolean r2 = r1.mo16595b(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0129
            return r4
        L_0x0129:
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18607c
            r2.mo13951i(r8)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18607c
            r2.mo13954l(r7)
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18607c
            int r2 = r2.mo13957o()
            r4 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x014f
            com.google.ads.interactivemedia.v3.internal.si r2 = r0.f18620p
            if (r2 != 0) goto L_0x014f
            com.google.ads.interactivemedia.v3.internal.si r2 = new com.google.ads.interactivemedia.v3.internal.si
            com.google.ads.interactivemedia.v3.internal.re r7 = r0.f18611g
            com.google.ads.interactivemedia.v3.internal.rw r3 = r7.mo13362ba(r3, r9)
            r2.<init>(r3)
            r0.f18620p = r2
        L_0x014f:
            if (r4 == 0) goto L_0x0162
            com.google.ads.interactivemedia.v3.internal.so r2 = r0.f18621q
            if (r2 != 0) goto L_0x0162
            com.google.ads.interactivemedia.v3.internal.so r2 = new com.google.ads.interactivemedia.v3.internal.so
            com.google.ads.interactivemedia.v3.internal.re r3 = r0.f18611g
            com.google.ads.interactivemedia.v3.internal.rw r3 = r3.mo13362ba(r5, r6)
            r2.<init>(r3)
            r0.f18621q = r2
        L_0x0162:
            com.google.ads.interactivemedia.v3.internal.re r2 = r0.f18611g
            r2.mo13363bb()
            com.google.ads.interactivemedia.v3.internal.alw r2 = r0.f18607c
            int r2 = r2.mo13965w()
            int r2 = r2 + -5
            r0.f18615k = r2
            r0.f18612h = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4342sk.mo13691f(com.google.ads.interactivemedia.v3.internal.rc, com.google.ads.interactivemedia.v3.internal.rq):int");
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        if (j == 0) {
            this.f18612h = 1;
            this.f18613i = false;
        } else {
            this.f18612h = 3;
        }
        this.f18615k = 0;
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
