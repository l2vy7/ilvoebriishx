package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vz */
/* compiled from: IMASDK */
final class C4438vz {

    /* renamed from: a */
    private boolean f19303a;

    /* renamed from: b */
    private boolean f19304b;

    /* renamed from: c */
    private alp f19305c;

    /* renamed from: d */
    private int f19306d;

    /* renamed from: e */
    private int f19307e;

    /* renamed from: f */
    private int f19308f;

    /* renamed from: g */
    private int f19309g;

    /* renamed from: h */
    private boolean f19310h;

    /* renamed from: i */
    private boolean f19311i;

    /* renamed from: j */
    private boolean f19312j;

    /* renamed from: k */
    private boolean f19313k;

    /* renamed from: l */
    private int f19314l;

    /* renamed from: m */
    private int f19315m;

    /* renamed from: n */
    private int f19316n;

    /* renamed from: o */
    private int f19317o;

    /* renamed from: p */
    private int f19318p;

    private C4438vz() {
    }

    /* synthetic */ C4438vz(byte[] bArr) {
    }

    /* renamed from: e */
    static /* synthetic */ boolean m19307e(C4438vz vzVar, C4438vz vzVar2) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (!vzVar.f19303a) {
            return false;
        }
        if (!vzVar2.f19303a) {
            return true;
        }
        alp alp = vzVar.f19305c;
        aup.m14889t(alp);
        alp alp2 = vzVar2.f19305c;
        aup.m14889t(alp2);
        if (vzVar.f19308f == vzVar2.f19308f && vzVar.f19309g == vzVar2.f19309g && vzVar.f19310h == vzVar2.f19310h && ((!vzVar.f19311i || !vzVar2.f19311i || vzVar.f19312j == vzVar2.f19312j) && (((i = vzVar.f19306d) == (i2 = vzVar2.f19306d) || (i != 0 && i2 != 0)) && ((i3 = alp.f15230k) != 0 ? !(i3 == 1 && alp2.f15230k == 1 && (vzVar.f19317o != vzVar2.f19317o || vzVar.f19318p != vzVar2.f19318p)) : alp2.f15230k != 0 || (vzVar.f19315m == vzVar2.f19315m && vzVar.f19316n == vzVar2.f19316n)) && (z = vzVar.f19313k) == vzVar2.f19313k && (!z || vzVar.f19314l == vzVar2.f19314l)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo16724a() {
        this.f19304b = false;
        this.f19303a = false;
    }

    /* renamed from: b */
    public final void mo16725b(int i) {
        this.f19307e = i;
        this.f19304b = true;
    }

    /* renamed from: c */
    public final void mo16726c(alp alp, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.f19305c = alp;
        this.f19306d = i;
        this.f19307e = i2;
        this.f19308f = i3;
        this.f19309g = i4;
        this.f19310h = z;
        this.f19311i = z2;
        this.f19312j = z3;
        this.f19313k = z4;
        this.f19314l = i5;
        this.f19315m = i6;
        this.f19316n = i7;
        this.f19317o = i8;
        this.f19318p = i9;
        this.f19303a = true;
        this.f19304b = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r4.f19307e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16727d() {
        /*
            r4 = this;
            boolean r0 = r4.f19304b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            int r0 = r4.f19307e
            r3 = 7
            if (r0 == r3) goto L_0x0011
            r3 = 2
            if (r0 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            return r1
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4438vz.mo16727d():boolean");
    }
}
