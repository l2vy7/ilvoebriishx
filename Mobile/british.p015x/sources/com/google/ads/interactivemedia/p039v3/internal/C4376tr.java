package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tr */
/* compiled from: IMASDK */
final class C4376tr {

    /* renamed from: a */
    public final int f18837a;

    /* renamed from: b */
    public int f18838b;

    /* renamed from: c */
    public int f18839c;

    /* renamed from: d */
    public long f18840d;

    /* renamed from: e */
    private final boolean f18841e;

    /* renamed from: f */
    private final alw f18842f;

    /* renamed from: g */
    private final alw f18843g;

    /* renamed from: h */
    private int f18844h;

    /* renamed from: i */
    private int f18845i;

    public C4376tr(alw alw, alw alw2, boolean z) {
        this.f18843g = alw;
        this.f18842f = alw2;
        this.f18841e = z;
        alw2.mo13951i(12);
        this.f18837a = alw2.mo13934C();
        alw.mo13951i(12);
        this.f18845i = alw.mo13934C();
        aup.m14888s(alw.mo13965w() != 1 ? false : true, "first_chunk must be 1");
        this.f18838b = -1;
    }

    /* renamed from: a */
    public final boolean mo16662a() {
        long j;
        int i = this.f18838b + 1;
        this.f18838b = i;
        if (i == this.f18837a) {
            return false;
        }
        if (this.f18841e) {
            j = this.f18842f.mo13936E();
        } else {
            j = this.f18842f.mo13963u();
        }
        this.f18840d = j;
        if (this.f18838b == this.f18844h) {
            this.f18839c = this.f18843g.mo13934C();
            this.f18843g.mo13954l(4);
            int i2 = -1;
            int i3 = this.f18845i - 1;
            this.f18845i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f18843g.mo13934C();
            }
            this.f18844h = i2;
        }
        return true;
    }
}
