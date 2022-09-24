package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vj */
/* compiled from: IMASDK */
public final class C4422vj implements C4432vt {

    /* renamed from: a */
    private final alv f19170a;

    /* renamed from: b */
    private final alw f19171b;

    /* renamed from: c */
    private final String f19172c;

    /* renamed from: d */
    private String f19173d;

    /* renamed from: e */
    private C4327rw f19174e;

    /* renamed from: f */
    private int f19175f;

    /* renamed from: g */
    private int f19176g;

    /* renamed from: h */
    private boolean f19177h;

    /* renamed from: i */
    private long f19178i;

    /* renamed from: j */
    private C4120ke f19179j;

    /* renamed from: k */
    private int f19180k;

    /* renamed from: l */
    private long f19181l;

    public C4422vj() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo16707a() {
        this.f19175f = 0;
        this.f19176g = 0;
        this.f19177h = false;
    }

    /* renamed from: b */
    public final void mo16708b(C4309re reVar, C4469xc xcVar) {
        xcVar.mo16763a();
        this.f19173d = xcVar.mo16765c();
        this.f19174e = reVar.mo13362ba(xcVar.mo16764b(), 1);
    }

    /* renamed from: c */
    public final void mo16709c(long j, int i) {
        this.f19181l = j;
    }

    /* renamed from: d */
    public final void mo16710d(alw alw) {
        aup.m14889t(this.f19174e);
        while (alw.mo13947e() > 0) {
            int i = this.f19175f;
            if (i == 0) {
                while (true) {
                    if (alw.mo13947e() <= 0) {
                        break;
                    } else if (!this.f19177h) {
                        this.f19177h = alw.mo13957o() == 11;
                    } else {
                        int o = alw.mo13957o();
                        if (o == 119) {
                            this.f19177h = false;
                            this.f19175f = 1;
                            this.f19171b.mo13952j()[0] = 11;
                            this.f19171b.mo13952j()[1] = 119;
                            this.f19176g = 2;
                            break;
                        }
                        this.f19177h = o == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(alw.mo13947e(), this.f19180k - this.f19176g);
                this.f19174e.mo13406d(alw, min);
                int i2 = this.f19176g + min;
                this.f19176g = i2;
                int i3 = this.f19180k;
                if (i2 == i3) {
                    this.f19174e.mo13404b(this.f19181l, 1, i3, 0, (C4326rv) null);
                    this.f19181l += this.f19178i;
                    this.f19175f = 0;
                }
            } else {
                byte[] j = this.f19171b.mo13952j();
                int min2 = Math.min(alw.mo13947e(), 128 - this.f19176g);
                alw.mo13956n(j, this.f19176g, min2);
                int i4 = this.f19176g + min2;
                this.f19176g = i4;
                if (i4 == 128) {
                    this.f19170a.mo13923e(0);
                    C4206nj c = C4207nk.m18272c(this.f19170a);
                    C4120ke keVar = this.f19179j;
                    if (keVar == null || c.f18073c != keVar.f17694y || c.f18072b != keVar.f17695z || !amm.m14233c(c.f18071a, keVar.f17681l)) {
                        C4119kd kdVar = new C4119kd();
                        kdVar.mo16107S(this.f19173d);
                        kdVar.mo16120ae(c.f18071a);
                        kdVar.mo16096H(c.f18073c);
                        kdVar.mo16121af(c.f18072b);
                        kdVar.mo16110V(this.f19172c);
                        C4120ke a = kdVar.mo16115a();
                        this.f19179j = a;
                        this.f19174e.mo13403a(a);
                    }
                    this.f19180k = c.f18074d;
                    this.f19178i = (((long) c.f18075e) * 1000000) / ((long) this.f19179j.f17695z);
                    this.f19171b.mo13951i(0);
                    this.f19174e.mo13406d(this.f19171b, 128);
                    this.f19175f = 2;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16711e() {
    }

    public C4422vj(String str) {
        alv alv = new alv(new byte[128]);
        this.f19170a = alv;
        this.f19171b = new alw(alv.f15245a);
        this.f19175f = 0;
        this.f19172c = str;
    }
}
