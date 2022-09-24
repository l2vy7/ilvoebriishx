package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wn */
/* compiled from: IMASDK */
final class C4453wn {

    /* renamed from: a */
    private final C4432vt f19450a;

    /* renamed from: b */
    private final amk f19451b;

    /* renamed from: c */
    private final alv f19452c = new alv(new byte[64]);

    /* renamed from: d */
    private boolean f19453d;

    /* renamed from: e */
    private boolean f19454e;

    /* renamed from: f */
    private boolean f19455f;

    /* renamed from: g */
    private int f19456g;

    /* renamed from: h */
    private long f19457h;

    public C4453wn(C4432vt vtVar, amk amk) {
        this.f19450a = vtVar;
        this.f19451b = amk;
    }

    /* renamed from: a */
    public final void mo16755a() {
        this.f19455f = false;
        this.f19450a.mo16707a();
    }

    /* renamed from: b */
    public final void mo16756b(alw alw) throws C4144lb {
        alw.mo13956n(this.f19452c.f15245a, 0, 3);
        this.f19452c.mo13923e(0);
        this.f19452c.mo13925g(8);
        this.f19453d = this.f19452c.mo13926h();
        this.f19454e = this.f19452c.mo13926h();
        this.f19452c.mo13925g(6);
        int i = this.f19452c.mo13927i(8);
        this.f19456g = i;
        alw.mo13956n(this.f19452c.f15245a, 0, i);
        this.f19452c.mo13923e(0);
        long j = 0;
        this.f19457h = 0;
        if (this.f19453d) {
            this.f19452c.mo13925g(4);
            int i2 = this.f19452c.mo13927i(3);
            this.f19452c.mo13925g(1);
            int i3 = this.f19452c.mo13927i(15);
            this.f19452c.mo13925g(1);
            long i4 = (((long) i2) << 30) | ((long) (i3 << 15)) | ((long) this.f19452c.mo13927i(15));
            this.f19452c.mo13925g(1);
            if (!this.f19455f && this.f19454e) {
                this.f19452c.mo13925g(4);
                int i5 = this.f19452c.mo13927i(3);
                this.f19452c.mo13925g(1);
                int i6 = this.f19452c.mo13927i(15);
                this.f19452c.mo13925g(1);
                int i7 = this.f19452c.mo13927i(15);
                this.f19452c.mo13925g(1);
                this.f19451b.mo13998f((((long) i5) << 30) | ((long) (i6 << 15)) | ((long) i7));
                this.f19455f = true;
            }
            j = this.f19451b.mo13998f(i4);
            this.f19457h = j;
        }
        this.f19450a.mo16709c(j, 4);
        this.f19450a.mo16710d(alw);
        this.f19450a.mo16711e();
    }
}
