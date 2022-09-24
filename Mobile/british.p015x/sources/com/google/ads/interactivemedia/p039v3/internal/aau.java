package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aau */
/* compiled from: IMASDK */
final class aau extends aap {

    /* renamed from: c */
    public static final Object f13973c = new Object();

    /* renamed from: d */
    private final Object f13974d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f13975e;

    private aau(C4171mb mbVar, Object obj, Object obj2) {
        super(mbVar);
        this.f13974d = obj;
        this.f13975e = obj2;
    }

    /* renamed from: a */
    public static aau m12827a(C4129kn knVar) {
        return new aau(new aav(knVar), C4170ma.f17924a, f13973c);
    }

    /* renamed from: b */
    public static aau m12828b(C4171mb mbVar, Object obj, Object obj2) {
        return new aau(mbVar, obj, obj2);
    }

    /* renamed from: f */
    public final C4170ma mo13288f(int i, C4170ma maVar, long j) {
        this.f13959b.mo13288f(i, maVar, j);
        if (amm.m14233c(maVar.f17926b, this.f13974d)) {
            maVar.f17926b = C4170ma.f17924a;
        }
        return maVar;
    }

    /* renamed from: h */
    public final C4168lz mo13289h(int i, C4168lz lzVar, boolean z) {
        this.f13959b.mo13289h(i, lzVar, z);
        if (amm.m14233c(lzVar.f17913b, this.f13975e) && z) {
            lzVar.f17913b = f13973c;
        }
        return lzVar;
    }

    /* renamed from: i */
    public final int mo13290i(Object obj) {
        Object obj2;
        C4171mb mbVar = this.f13959b;
        if (f13973c.equals(obj) && (obj2 = this.f13975e) != null) {
            obj = obj2;
        }
        return mbVar.mo13290i(obj);
    }

    /* renamed from: j */
    public final Object mo13291j(int i) {
        Object j = this.f13959b.mo13291j(i);
        return amm.m14233c(j, this.f13975e) ? f13973c : j;
    }

    /* renamed from: k */
    public final aau mo13306k(C4171mb mbVar) {
        return new aau(mbVar, this.f13974d, this.f13975e);
    }
}
