package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vd */
/* compiled from: IMASDK */
abstract class C4416vd {

    /* renamed from: a */
    private final C4409ux f19134a = new C4409ux();

    /* renamed from: b */
    private C4327rw f19135b;

    /* renamed from: c */
    private C4309re f19136c;

    /* renamed from: d */
    private C4411uz f19137d;

    /* renamed from: e */
    private long f19138e;

    /* renamed from: f */
    private long f19139f;

    /* renamed from: g */
    private long f19140g;

    /* renamed from: h */
    private int f19141h;

    /* renamed from: i */
    private int f19142i;

    /* renamed from: j */
    private C4414vb f19143j = new C4414vb();

    /* renamed from: k */
    private long f19144k;

    /* renamed from: l */
    private boolean f19145l;

    /* renamed from: m */
    private boolean f19146m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16689a(boolean z) {
        int i;
        if (z) {
            this.f19143j = new C4414vb();
            this.f19139f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f19141h = i;
        this.f19138e = -1;
        this.f19140g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo16690b(alw alw);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo16691c(alw alw, long j, C4414vb vbVar) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo16701e(C4309re reVar, C4327rw rwVar) {
        this.f19136c = reVar;
        this.f19135b = rwVar;
        mo16689a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo16702f(long j, long j2) {
        this.f19134a.mo16692a();
        if (j == 0) {
            mo16689a(!this.f19145l);
        } else if (this.f19141h != 0) {
            long i = mo16705i(j2);
            this.f19138e = i;
            C4411uz uzVar = this.f19137d;
            int i2 = amm.f15298a;
            uzVar.mo16686b(i);
            this.f19141h = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo16703g(C4307rc rcVar, C4321rq rqVar) throws IOException {
        C4307rc rcVar2 = rcVar;
        aup.m14889t(this.f19135b);
        int i = amm.f15298a;
        int i2 = this.f19141h;
        if (i2 == 0) {
            while (this.f19134a.mo16693b(rcVar2)) {
                this.f19144k = rcVar.mo16605l() - this.f19139f;
                if (mo16691c(this.f19134a.mo16695d(), this.f19139f, this.f19143j)) {
                    this.f19139f = rcVar.mo16605l();
                } else {
                    C4120ke keVar = this.f19143j.f19132a;
                    this.f19142i = keVar.f17695z;
                    if (!this.f19146m) {
                        this.f19135b.mo13403a(keVar);
                        this.f19146m = true;
                    }
                    C4411uz uzVar = this.f19143j.f19133b;
                    if (uzVar != null) {
                        this.f19137d = uzVar;
                    } else if (rcVar.mo16606m() == -1) {
                        this.f19137d = new C4415vc((byte[]) null);
                    } else {
                        C4410uy c = this.f19134a.mo16694c();
                        this.f19137d = new C4404us(this, this.f19139f, rcVar.mo16606m(), (long) (c.f19119e + c.f19120f), c.f19117c, (c.f19116b & 4) != 0);
                    }
                    this.f19141h = 2;
                    this.f19134a.mo16696e();
                    return 0;
                }
            }
            this.f19141h = 3;
            return -1;
        } else if (i2 == 1) {
            rcVar2.mo16597d((int) this.f19139f);
            this.f19141h = 2;
            return 0;
        } else if (i2 == 2) {
            long a = this.f19137d.mo16685a(rcVar2);
            if (a >= 0) {
                rqVar.f18533a = a;
                return 1;
            }
            if (a < -1) {
                mo16706j(-(a + 2));
            }
            if (!this.f19145l) {
                C4324rt c2 = this.f19137d.mo16687c();
                aup.m14889t(c2);
                this.f19136c.mo13364bc(c2);
                this.f19145l = true;
            }
            if (this.f19144k > 0 || this.f19134a.mo16693b(rcVar2)) {
                this.f19144k = 0;
                alw d = this.f19134a.mo16695d();
                long b = mo16690b(d);
                if (b >= 0) {
                    long j = this.f19140g;
                    if (j + b >= this.f19138e) {
                        long h = mo16704h(j);
                        this.f19135b.mo13406d(d, d.mo13948f());
                        this.f19135b.mo13404b(h, 1, d.mo13948f(), 0, (C4326rv) null);
                        this.f19138e = -1;
                    }
                }
                this.f19140g += b;
                return 0;
            }
            this.f19141h = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo16704h(long j) {
        return (j * 1000000) / ((long) this.f19142i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final long mo16705i(long j) {
        return (((long) this.f19142i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo16706j(long j) {
        this.f19140g = j;
    }
}
