package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8122rh {

    /* renamed from: a */
    public final int f38677a;

    /* renamed from: b */
    public int f38678b;

    /* renamed from: c */
    public int f38679c;

    /* renamed from: d */
    public long f38680d;

    /* renamed from: e */
    private final boolean f38681e;

    /* renamed from: f */
    private final C7544bm f38682f;

    /* renamed from: g */
    private final C7544bm f38683g;

    /* renamed from: h */
    private int f38684h;

    /* renamed from: i */
    private int f38685i;

    public C8122rh(C7544bm bmVar, C7544bm bmVar2, boolean z) {
        this.f38683g = bmVar;
        this.f38682f = bmVar2;
        this.f38681e = z;
        bmVar2.mo30725v(12);
        this.f38677a = bmVar2.mo30712i();
        bmVar.mo30725v(12);
        this.f38685i = bmVar.mo30712i();
        C8195tl.m37901f(bmVar.mo30708e() != 1 ? false : true, "first_chunk must be 1");
        this.f38678b = -1;
    }

    /* renamed from: a */
    public final boolean mo34542a() {
        long j;
        int i = this.f38678b + 1;
        this.f38678b = i;
        if (i == this.f38677a) {
            return false;
        }
        if (this.f38681e) {
            j = this.f38682f.mo30717n();
        } else {
            j = this.f38682f.mo30716m();
        }
        this.f38680d = j;
        if (this.f38678b == this.f38684h) {
            this.f38679c = this.f38683g.mo30712i();
            this.f38683g.mo30726w(4);
            int i2 = -1;
            int i3 = this.f38685i - 1;
            this.f38685i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f38683g.mo30712i();
            }
            this.f38684h = i2;
        }
        return true;
    }
}
