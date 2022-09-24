package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wg */
/* compiled from: IMASDK */
public final class C4446wg implements C4432vt {

    /* renamed from: a */
    private final alw f19406a;

    /* renamed from: b */
    private final C4255pe f19407b;

    /* renamed from: c */
    private final String f19408c;

    /* renamed from: d */
    private C4327rw f19409d;

    /* renamed from: e */
    private String f19410e;

    /* renamed from: f */
    private int f19411f;

    /* renamed from: g */
    private int f19412g;

    /* renamed from: h */
    private boolean f19413h;

    /* renamed from: i */
    private boolean f19414i;

    /* renamed from: j */
    private long f19415j;

    /* renamed from: k */
    private int f19416k;

    /* renamed from: l */
    private long f19417l;

    public C4446wg() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19411f = 0;
        this.f19412g = 0;
        this.f19414i = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19410e = xcVar.mo16765c();
        this.f19409d = reVar.mo13362ba(xcVar.mo16764b(), 1);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19417l = j;
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        aup.m14889t(this.f19409d);
        while (alw.mo13947e() > 0) {
            int i = this.f19411f;
            if (i == 0) {
                byte[] j = alw.mo13952j();
                int h = alw.mo13950h();
                int f = alw.mo13948f();
                while (true) {
                    if (h >= f) {
                        alw.mo13951i(f);
                        break;
                    }
                    byte b = j[h];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f19414i && (b & 224) == 224;
                    this.f19414i = z;
                    if (z2) {
                        alw.mo13951i(h + 1);
                        this.f19414i = false;
                        this.f19406a.mo13952j()[1] = j[h];
                        this.f19412g = 2;
                        this.f19411f = 1;
                        break;
                    }
                    h++;
                }
            } else if (i != 1) {
                int min = Math.min(alw.mo13947e(), this.f19416k - this.f19412g);
                this.f19409d.mo13406d(alw, min);
                int i2 = this.f19412g + min;
                this.f19412g = i2;
                int i3 = this.f19416k;
                if (i2 >= i3) {
                    this.f19409d.mo13404b(this.f19417l, 1, i3, 0, (C4326rv) null);
                    this.f19417l += this.f19415j;
                    this.f19412g = 0;
                    this.f19411f = 0;
                }
            } else {
                int min2 = Math.min(alw.mo13947e(), 4 - this.f19412g);
                alw.mo13956n(this.f19406a.mo13952j(), this.f19412g, min2);
                int i4 = this.f19412g + min2;
                this.f19412g = i4;
                if (i4 >= 4) {
                    this.f19406a.mo13951i(0);
                    if (!this.f19407b.mo16493a(this.f19406a.mo13965w())) {
                        this.f19412g = 0;
                        this.f19411f = 1;
                    } else {
                        C4255pe peVar = this.f19407b;
                        this.f19416k = peVar.f18312c;
                        if (!this.f19413h) {
                            this.f19415j = (((long) peVar.f18316g) * 1000000) / ((long) peVar.f18313d);
                            C4119kd kdVar = new C4119kd();
                            kdVar.mo16107S(this.f19410e);
                            kdVar.mo16120ae(this.f19407b.f18311b);
                            kdVar.mo16111W(4096);
                            kdVar.mo16096H(this.f19407b.f18314e);
                            kdVar.mo16121af(this.f19407b.f18313d);
                            kdVar.mo16110V(this.f19408c);
                            this.f19409d.mo13403a(kdVar.mo16115a());
                            this.f19413h = true;
                        }
                        this.f19406a.mo13951i(0);
                        this.f19409d.mo13406d(this.f19406a, 4);
                        this.f19411f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
    }

    public C4446wg(String str) {
        this.f19411f = 0;
        alw alw = new alw(4);
        this.f19406a = alw;
        alw.mo13952j()[0] = -1;
        this.f19407b = new C4255pe();
        this.f19408c = str;
    }
}
