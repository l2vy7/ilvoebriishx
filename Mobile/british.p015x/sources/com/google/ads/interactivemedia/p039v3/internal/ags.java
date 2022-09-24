package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ags */
/* compiled from: IMASDK */
final class ags implements akb<akl<ahe>> {

    /* renamed from: a */
    final /* synthetic */ agt f14720a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f14721b;

    /* renamed from: c */
    private final aki f14722c = new aki("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: d */
    private final ajg f14723d;

    /* renamed from: e */
    private ahd f14724e;

    /* renamed from: f */
    private long f14725f;

    /* renamed from: g */
    private long f14726g;

    /* renamed from: h */
    private long f14727h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f14728i;

    /* renamed from: j */
    private boolean f14729j;

    /* renamed from: k */
    private IOException f14730k;

    public ags(agt agt, Uri uri) {
        this.f14720a = agt;
        this.f14721b = uri;
        this.f14723d = agt.f14744n.mo13606a();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m13619k(Uri uri) {
        this.f14728i = 0;
        if (!this.f14729j && !this.f14722c.mo13844f() && !this.f14722c.mo13841c()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.f14727h) {
                this.f14729j = true;
                this.f14720a.f14737g.postDelayed(new agr(this, uri), this.f14727h - elapsedRealtime);
                return;
            }
            m13620l(uri);
        }
    }

    /* renamed from: l */
    private final void m13620l(Uri uri) {
        akl akl = new akl(this.f14723d, uri, 4, this.f14720a.f14732b.mo13695b(this.f14720a.f14739i, this.f14724e));
        this.f14722c.mo13843e(akl, this, aup.m14894y(akl.f15153c));
        this.f14720a.f14735e.mo13330d(new aas(akl.f15152b), akl.f15153c);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m13621m(ahd ahd, aas aas) {
        long j;
        Uri uri;
        ahd ahd2 = this.f14724e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f14725f = elapsedRealtime;
        ahd r = agt.m13638r(this.f14720a, ahd2, ahd);
        this.f14724e = r;
        if (r != ahd2) {
            this.f14730k = null;
            this.f14726g = elapsedRealtime;
            agt.m13639s(this.f14720a, this.f14721b, r);
        } else if (!r.f14803j) {
            long j2 = ahd.f14799f;
            int size = ahd.f14806m.size();
            ahd ahd3 = this.f14724e;
            if (j2 + ((long) size) < ahd3.f14799f) {
                this.f14730k = new ahl();
                agt.m13634n(this.f14720a, this.f14721b, C6540C.TIME_UNSET);
            } else {
                double a = (double) C4083iv.m17451a(ahd3.f14801h);
                Double.isNaN(a);
                if (((double) (elapsedRealtime - this.f14726g)) > a * 3.5d) {
                    this.f14730k = new ahm();
                    new aax(4);
                    long x = aup.m14893x(new aka(this.f14730k, 1));
                    agt.m13634n(this.f14720a, this.f14721b, x);
                    if (x != C6540C.TIME_UNSET) {
                        m13622n(x);
                    }
                }
            }
        }
        ahd ahd4 = this.f14724e;
        if (!ahd4.f14810q.f14793e) {
            j = ahd4 != ahd2 ? ahd4.f14801h : ahd4.f14801h / 2;
        } else {
            j = 0;
        }
        this.f14727h = elapsedRealtime + C4083iv.m17451a(j);
        if (this.f14724e.f14802i != C6540C.TIME_UNSET || this.f14721b.equals(this.f14720a.f14740j)) {
            ahd ahd5 = this.f14724e;
            if (!ahd5.f14803j) {
                ahc ahc = ahd5.f14810q;
                if (ahc.f14789a != C6540C.TIME_UNSET || ahc.f14793e) {
                    Uri.Builder buildUpon = this.f14721b.buildUpon();
                    ahd ahd6 = this.f14724e;
                    if (ahd6.f14810q.f14793e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ahd6.f14799f + ((long) ahd6.f14806m.size())));
                        ahd ahd7 = this.f14724e;
                        if (ahd7.f14802i != C6540C.TIME_UNSET) {
                            List<agy> list = ahd7.f14807n;
                            int size2 = list.size();
                            if (!list.isEmpty() && ((agy) art.m14630a(list)).f14767b) {
                                size2--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    ahc ahc2 = this.f14724e.f14810q;
                    if (ahc2.f14789a != C6540C.TIME_UNSET) {
                        buildUpon.appendQueryParameter("_HLS_skip", true != ahc2.f14790b ? "YES" : "v2");
                    }
                    uri = buildUpon.build();
                } else {
                    uri = this.f14721b;
                }
                m13619k(uri);
            }
        }
    }

    /* renamed from: n */
    private final boolean m13622n(long j) {
        this.f14728i = SystemClock.elapsedRealtime() + j;
        return this.f14721b.equals(this.f14720a.f14740j) && !agt.m13641u(this.f14720a);
    }

    /* renamed from: a */
    public final ahd mo13697a() {
        return this.f14724e;
    }

    /* renamed from: b */
    public final boolean mo13698b() {
        int i;
        if (this.f14724e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000, C4083iv.m17451a(this.f14724e.f14809p));
        ahd ahd = this.f14724e;
        if (ahd.f14803j || (i = ahd.f14794a) == 2 || i == 1 || this.f14725f + max > elapsedRealtime) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo13699c() {
        m13619k(this.f14721b);
    }

    /* renamed from: d */
    public final void mo13700d() throws IOException {
        this.f14722c.mo13518a();
        IOException iOException = this.f14730k;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: e */
    public final void mo13701e() {
        this.f14722c.mo13846h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo13702f(Uri uri) {
        this.f14729j = false;
        m13620l(uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.p039v3.internal.akc mo13373v(com.google.ads.interactivemedia.p039v3.internal.ake r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.internal.akl r6 = (com.google.ads.interactivemedia.p039v3.internal.akl) r6
            com.google.ads.interactivemedia.v3.internal.aas r7 = new com.google.ads.interactivemedia.v3.internal.aas
            long r8 = r6.f15151a
            r6.mo13851e()
            r6.mo13852f()
            r6.mo13850d()
            r7.<init>()
            android.net.Uri r8 = r6.mo13851e()
            java.lang.String r9 = "_HLS_msn"
            java.lang.String r8 = r8.getQueryParameter(r9)
            boolean r9 = r11 instanceof com.google.ads.interactivemedia.p039v3.internal.ahf
            r10 = 1
            if (r8 != 0) goto L_0x0024
            if (r9 == 0) goto L_0x003c
            r9 = 1
        L_0x0024:
            boolean r8 = r11 instanceof com.google.ads.interactivemedia.p039v3.internal.ajx
            if (r8 == 0) goto L_0x002e
            r8 = r11
            com.google.ads.interactivemedia.v3.internal.ajx r8 = (com.google.ads.interactivemedia.p039v3.internal.ajx) r8
            int r8 = r8.f15123a
            goto L_0x0031
        L_0x002e:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0031:
            if (r9 != 0) goto L_0x0095
            r9 = 400(0x190, float:5.6E-43)
            if (r8 == r9) goto L_0x0095
            r9 = 503(0x1f7, float:7.05E-43)
            if (r8 != r9) goto L_0x003c
            goto L_0x0095
        L_0x003c:
            com.google.ads.interactivemedia.v3.internal.aax r8 = new com.google.ads.interactivemedia.v3.internal.aax
            int r9 = r6.f15153c
            r8.<init>(r9)
            com.google.ads.interactivemedia.v3.internal.aka r8 = new com.google.ads.interactivemedia.v3.internal.aka
            r8.<init>(r11, r12)
            long r0 = com.google.ads.interactivemedia.p039v3.internal.aup.m14893x(r8)
            com.google.ads.interactivemedia.v3.internal.agt r9 = r5.f14720a
            android.net.Uri r12 = r5.f14721b
            boolean r9 = com.google.ads.interactivemedia.p039v3.internal.agt.m13634n(r9, r12, r0)
            r12 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x0063
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r9 = 0
            goto L_0x0064
        L_0x0063:
            r9 = 1
        L_0x0064:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            boolean r0 = r5.m13622n(r0)
            r9 = r9 | r0
        L_0x006d:
            if (r9 == 0) goto L_0x007f
            long r8 = com.google.ads.interactivemedia.p039v3.internal.aup.m14895z(r8)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x007c
            com.google.ads.interactivemedia.v3.internal.akc r8 = com.google.ads.interactivemedia.p039v3.internal.aki.m13929b(r12, r8)
            goto L_0x0081
        L_0x007c:
            com.google.ads.interactivemedia.v3.internal.akc r8 = com.google.ads.interactivemedia.p039v3.internal.aki.f15147c
            goto L_0x0081
        L_0x007f:
            com.google.ads.interactivemedia.v3.internal.akc r8 = com.google.ads.interactivemedia.p039v3.internal.aki.f15146b
        L_0x0081:
            boolean r9 = r8.mo13834a()
            r9 = r9 ^ r10
            com.google.ads.interactivemedia.v3.internal.agt r10 = r5.f14720a
            com.google.ads.interactivemedia.v3.internal.abj r10 = r10.f14735e
            int r6 = r6.f15153c
            r10.mo13336j(r7, r6, r11, r9)
            if (r9 != 0) goto L_0x0094
            goto L_0x00ad
        L_0x0094:
            return r8
        L_0x0095:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r5.f14727h = r8
            r5.mo13699c()
            com.google.ads.interactivemedia.v3.internal.agt r8 = r5.f14720a
            com.google.ads.interactivemedia.v3.internal.abj r8 = r8.f14735e
            int r9 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            int r6 = r6.f15153c
            r8.mo13336j(r7, r6, r11, r10)
            com.google.ads.interactivemedia.v3.internal.akc r8 = com.google.ads.interactivemedia.p039v3.internal.aki.f15146b
        L_0x00ad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.ags.mo13373v(com.google.ads.interactivemedia.v3.internal.ake, long, long, java.io.IOException, int):com.google.ads.interactivemedia.v3.internal.akc");
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo13374w(ake ake, long j, long j2, boolean z) {
        akl akl = (akl) ake;
        long j3 = akl.f15151a;
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        this.f14720a.f14735e.mo13334h(new aas(), 4);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo13375x(ake ake, long j, long j2) {
        akl akl = (akl) ake;
        ahe ahe = (ahe) akl.mo13849a();
        akl.mo13851e();
        akl.mo13852f();
        akl.mo13850d();
        aas aas = new aas();
        if (ahe instanceof ahd) {
            m13621m((ahd) ahe, aas);
            this.f14720a.f14735e.mo13332f(aas, 4);
            return;
        }
        this.f14730k = new C4144lb("Loaded playlist has unexpected type.");
        this.f14720a.f14735e.mo13336j(aas, 4, this.f14730k, true);
    }
}
