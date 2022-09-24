package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kq2 extends e03 implements cc1, pa1, ma1, db1, ad1, ro2, gi1 {

    /* renamed from: b */
    private final gt2 f34451b;

    /* renamed from: c */
    private final AtomicReference<e03> f34452c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<jk0> f34453d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<fk0> f34454e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<qj0> f34455f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<kk0> f34456g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<lj0> f34457h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C7555by> f34458i = new AtomicReference<>();

    public kq2(gt2 gt2) {
        this.f34451b = gt2;
    }

    /* renamed from: C */
    public final void mo33159C(jk0 jk0) {
        this.f34453d.set(jk0);
    }

    @Deprecated
    /* renamed from: G */
    public final void mo33160G(qj0 qj0) {
        this.f34455f.set(qj0);
    }

    @Deprecated
    /* renamed from: I */
    public final void mo33161I(lj0 lj0) {
        this.f34457h.set(lj0);
    }

    /* renamed from: M */
    public final void mo33162M(kk0 kk0) {
        this.f34456g.set(kk0);
    }

    /* renamed from: N */
    public final void mo18122N(zzbew zzbew) {
        io2.m33342a(this.f34454e, new cq2(zzbew));
        io2.m33342a(this.f34454e, new dq2(zzbew));
    }

    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
        io2.m33342a(this.f34454e, new hq2(kj0));
        io2.m33342a(this.f34456g, new jq2(kj0, str, str2));
        io2.m33342a(this.f34455f, new gq2(kj0));
        io2.m33342a(this.f34457h, new iq2(kj0, str, str2));
    }

    /* renamed from: c */
    public final void mo33163c(ro2 ro2) {
        throw null;
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        int i = zzbew.f42935b;
        io2.m33342a(this.f34453d, new eq2(zzbew));
        io2.m33342a(this.f34453d, new zp2(i));
        io2.m33342a(this.f34455f, new np2(i));
    }

    /* renamed from: g */
    public final void mo18104g(zzbfk zzbfk) {
        io2.m33342a(this.f34458i, new fq2(zzbfk));
    }

    /* renamed from: l */
    public final void mo18124l() {
        io2.m33342a(this.f34452c, bq2.f30074a);
    }

    /* renamed from: n */
    public final void mo33164n(e03 e03) {
        this.f34452c.set(e03);
    }

    /* renamed from: w */
    public final void mo18127w() {
        io2.m33342a(this.f34455f, sp2.f39029a);
    }

    /* renamed from: x */
    public final void mo33165x(C7555by byVar) {
        this.f34458i.set(byVar);
    }

    /* renamed from: z */
    public final void mo33166z(fk0 fk0) {
        this.f34454e.set(fk0);
    }

    public final void zzj() {
        this.f34451b.mo32286a();
        io2.m33342a(this.f34454e, xp2.f41248a);
        io2.m33342a(this.f34455f, op2.f36573a);
    }

    public final void zzm() {
        io2.m33342a(this.f34455f, pp2.f37733a);
    }

    public final void zzn() {
        io2.m33342a(this.f34453d, aq2.f29724a);
        io2.m33342a(this.f34455f, qp2.f38242a);
    }

    public final void zzo() {
        io2.m33342a(this.f34454e, yp2.f41950a);
        io2.m33342a(this.f34455f, rp2.f38752a);
        io2.m33342a(this.f34454e, wp2.f40844a);
    }

    public final void zzq() {
        io2.m33342a(this.f34454e, vp2.f40509a);
    }

    public final void zzr() {
        io2.m33342a(this.f34455f, up2.f39917a);
    }
}
