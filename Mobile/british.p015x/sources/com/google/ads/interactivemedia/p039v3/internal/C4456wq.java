package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wq */
/* compiled from: IMASDK */
public final class C4456wq implements C4470xd {

    /* renamed from: a */
    private final C4455wp f19470a;

    /* renamed from: b */
    private final alw f19471b = new alw(32);

    /* renamed from: c */
    private int f19472c;

    /* renamed from: d */
    private int f19473d;

    /* renamed from: e */
    private boolean f19474e;

    /* renamed from: f */
    private boolean f19475f;

    public C4456wq(C4455wp wpVar) {
        this.f19470a = wpVar;
    }

    /* renamed from: a */
    public final void mo16748a(amk amk, C4309re reVar, C4469xc xcVar) {
        this.f19470a.mo16746a(amk, reVar, xcVar);
        this.f19475f = true;
    }

    /* renamed from: b */
    public final void mo16749b() {
        this.f19475f = true;
    }

    /* renamed from: c */
    public final void mo16750c(alw alw, int i) {
        int i2 = i & 1;
        int h = i2 != 0 ? alw.mo13950h() + alw.mo13957o() : -1;
        if (this.f19475f) {
            if (i2 != 0) {
                this.f19475f = false;
                alw.mo13951i(h);
                this.f19473d = 0;
            } else {
                return;
            }
        }
        while (alw.mo13947e() > 0) {
            int i3 = this.f19473d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int o = alw.mo13957o();
                    alw.mo13951i(alw.mo13950h() - 1);
                    if (o == 255) {
                        this.f19475f = true;
                        return;
                    }
                }
                int min = Math.min(alw.mo13947e(), 3 - this.f19473d);
                alw.mo13956n(this.f19471b.mo13952j(), this.f19473d, min);
                int i4 = this.f19473d + min;
                this.f19473d = i4;
                if (i4 == 3) {
                    this.f19471b.mo13951i(0);
                    this.f19471b.mo13949g(3);
                    this.f19471b.mo13954l(1);
                    int o2 = this.f19471b.mo13957o();
                    int o3 = this.f19471b.mo13957o();
                    this.f19474e = (o2 & 128) != 0;
                    this.f19472c = (((o2 & 15) << 8) | o3) + 3;
                    int k = this.f19471b.mo13953k();
                    int i5 = this.f19472c;
                    if (k < i5) {
                        int k2 = this.f19471b.mo13953k();
                        this.f19471b.mo13946d(Math.min(4098, Math.max(i5, k2 + k2)));
                    }
                }
            } else {
                int min2 = Math.min(alw.mo13947e(), this.f19472c - this.f19473d);
                alw.mo13956n(this.f19471b.mo13952j(), this.f19473d, min2);
                int i6 = this.f19473d + min2;
                this.f19473d = i6;
                int i7 = this.f19472c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f19474e) {
                        this.f19471b.mo13949g(i7);
                    } else if (amm.m14224an(this.f19471b.mo13952j(), this.f19472c) != 0) {
                        this.f19475f = true;
                        return;
                    } else {
                        this.f19471b.mo13949g(this.f19472c - 4);
                    }
                    this.f19471b.mo13951i(0);
                    this.f19470a.mo16747b(this.f19471b);
                    this.f19473d = 0;
                }
            }
        }
    }
}
