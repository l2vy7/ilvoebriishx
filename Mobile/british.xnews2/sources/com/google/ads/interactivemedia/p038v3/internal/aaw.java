package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaw */
/* compiled from: IMASDK */
public final class aaw extends aaf<Void> {

    /* renamed from: a */
    private final abd f13977a;

    /* renamed from: b */
    private final boolean f13978b;

    /* renamed from: c */
    private final C4170ma f13979c;

    /* renamed from: d */
    private final C4168lz f13980d;

    /* renamed from: e */
    private aau f13981e;

    /* renamed from: f */
    private aat f13982f;

    /* renamed from: g */
    private boolean f13983g;

    /* renamed from: h */
    private boolean f13984h;

    /* renamed from: i */
    private boolean f13985i;

    public aaw(abd abd, boolean z) {
        this.f13977a = abd;
        boolean z2 = false;
        if (z && abd.mo13284s()) {
            z2 = true;
        }
        this.f13978b = z2;
        this.f13979c = new C4170ma();
        this.f13980d = new C4168lz();
        C4171mb r = abd.mo13283r();
        if (r != null) {
            this.f13981e = aau.m12828b(r, (Object) null, (Object) null);
            this.f13985i = true;
            return;
        }
        this.f13981e = aau.m12827a(abd.mo13273U());
    }

    /* renamed from: E */
    private final Object m12841E(Object obj) {
        return (this.f13981e.f13975e == null || !obj.equals(aau.f13973c)) ? obj : this.f13981e.f13975e;
    }

    /* renamed from: F */
    private final void m12842F(long j) {
        aat aat = this.f13982f;
        int i = this.f13981e.mo13290i(aat.f13966a.f13998a);
        if (i != -1) {
            long j2 = this.f13981e.mo16330A(i, this.f13980d).f17915d;
            if (j2 != C6540C.TIME_UNSET && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            aat.mo13301q(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ abb mo13251A(Object obj, abb abb) {
        Void voidR = (Void) obj;
        Object obj2 = abb.f13998a;
        if (this.f13981e.f13975e != null && this.f13981e.f13975e.equals(obj2)) {
            obj2 = aau.f13973c;
        }
        return abb.mo13315c(obj2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo13252B(java.lang.Object r11, com.google.ads.interactivemedia.p038v3.internal.C4171mb r12) {
        /*
            r10 = this;
            r0 = r11
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r10.f13984h
            r6 = 0
            if (r0 == 0) goto L_0x001d
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            com.google.ads.interactivemedia.v3.internal.aau r0 = r0.mo13306k(r12)
            r10.f13981e = r0
            com.google.ads.interactivemedia.v3.internal.aat r0 = r10.f13982f
            if (r0 == 0) goto L_0x00a9
            long r0 = r0.mo13302r()
            r10.m12842F(r0)
            goto L_0x00a9
        L_0x001d:
            boolean r0 = r12.mo16333v()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r10.f13985i
            if (r0 == 0) goto L_0x002e
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            com.google.ads.interactivemedia.v3.internal.aau r0 = r0.mo13306k(r12)
            goto L_0x0036
        L_0x002e:
            java.lang.Object r0 = com.google.ads.interactivemedia.p038v3.internal.C4170ma.f17924a
            java.lang.Object r1 = com.google.ads.interactivemedia.p038v3.internal.aau.f13973c
            com.google.ads.interactivemedia.v3.internal.aau r0 = com.google.ads.interactivemedia.p038v3.internal.aau.m12828b(r12, r0, r1)
        L_0x0036:
            r10.f13981e = r0
            goto L_0x00a9
        L_0x003a:
            com.google.ads.interactivemedia.v3.internal.ma r0 = r10.f13979c
            r1 = 0
            r12.mo16334w(r1, r0)
            com.google.ads.interactivemedia.v3.internal.ma r0 = r10.f13979c
            long r2 = r0.f17937m
            java.lang.Object r7 = r0.f17926b
            com.google.ads.interactivemedia.v3.internal.aat r0 = r10.f13982f
            if (r0 == 0) goto L_0x0070
            long r4 = r0.mo13300o()
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            com.google.ads.interactivemedia.v3.internal.aat r8 = r10.f13982f
            com.google.ads.interactivemedia.v3.internal.abb r8 = r8.f13966a
            java.lang.Object r8 = r8.f13998a
            com.google.ads.interactivemedia.v3.internal.lz r9 = r10.f13980d
            r0.mo15925g(r8, r9)
            com.google.ads.interactivemedia.v3.internal.lz r0 = r10.f13980d
            long r8 = r0.f17916e
            long r8 = r8 + r4
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            com.google.ads.interactivemedia.v3.internal.ma r4 = r10.f13979c
            com.google.ads.interactivemedia.v3.internal.ma r0 = r0.mo16334w(r1, r4)
            long r0 = r0.f17937m
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0070
            r4 = r8
            goto L_0x0071
        L_0x0070:
            r4 = r2
        L_0x0071:
            com.google.ads.interactivemedia.v3.internal.ma r1 = r10.f13979c
            com.google.ads.interactivemedia.v3.internal.lz r2 = r10.f13980d
            r3 = 0
            r0 = r12
            android.util.Pair r0 = r0.mo16336y(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r10.f13985i
            if (r0 == 0) goto L_0x0090
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            com.google.ads.interactivemedia.v3.internal.aau r0 = r0.mo13306k(r12)
            goto L_0x0094
        L_0x0090:
            com.google.ads.interactivemedia.v3.internal.aau r0 = com.google.ads.interactivemedia.p038v3.internal.aau.m12828b(r12, r7, r1)
        L_0x0094:
            r10.f13981e = r0
            com.google.ads.interactivemedia.v3.internal.aat r0 = r10.f13982f
            if (r0 == 0) goto L_0x00a9
            r10.m12842F(r2)
            com.google.ads.interactivemedia.v3.internal.abb r0 = r0.f13966a
            java.lang.Object r1 = r0.f13998a
            java.lang.Object r1 = r10.m12841E(r1)
            com.google.ads.interactivemedia.v3.internal.abb r6 = r0.mo13315c(r1)
        L_0x00a9:
            r0 = 1
            r10.f13985i = r0
            r10.f13984h = r0
            com.google.ads.interactivemedia.v3.internal.aau r0 = r10.f13981e
            r10.mo16937e(r0)
            if (r6 == 0) goto L_0x00bd
            com.google.ads.interactivemedia.v3.internal.aat r0 = r10.f13982f
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r0)
            r0.mo13304t(r6)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.aaw.mo13252B(java.lang.Object, com.google.ads.interactivemedia.v3.internal.mb):void");
    }

    /* renamed from: C */
    public final C4171mb mo13307C() {
        return this.f13981e;
    }

    /* renamed from: D */
    public final aat mo13275W(abb abb, ajl ajl, long j) {
        aat aat = new aat(abb, ajl, j);
        aat.mo13303s(this.f13977a);
        if (this.f13984h) {
            aat.mo13304t(abb.mo13315c(m12841E(abb.f13998a)));
        } else {
            this.f13982f = aat;
            if (!this.f13983g) {
                this.f13983g = true;
                mo13258v(null, this.f13977a);
            }
        }
        return aat;
    }

    /* renamed from: U */
    public final C4129kn mo13273U() {
        return this.f13977a.mo13273U();
    }

    /* renamed from: V */
    public final void mo13274V(aaz aaz) {
        ((aat) aaz).mo13305u();
        if (aaz == this.f13982f) {
            this.f13982f = null;
        }
    }

    /* renamed from: a */
    public final void mo13254a(akp akp) {
        super.mo13254a(akp);
        if (!this.f13978b) {
            this.f13983g = true;
            mo13258v(null, this.f13977a);
        }
    }

    /* renamed from: d */
    public final void mo13256d() {
        this.f13984h = false;
        this.f13983g = false;
        super.mo13256d();
    }

    /* renamed from: u */
    public final void mo13257u() {
    }
}
