package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n22 implements kd1, cc1, pa1, od1 {

    /* renamed from: b */
    private final mw2 f35875b;

    /* renamed from: c */
    private final nw2 f35876c;

    /* renamed from: d */
    private final rn0 f35877d;

    public n22(mw2 mw2, nw2 nw2, rn0 rn0) {
        this.f35875b = mw2;
        this.f35876c = nw2;
        this.f35877d = rn0;
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
        this.f35875b.mo33608h(ur2, this.f35877d);
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        mw2 mw2 = this.f35875b;
        mw2.mo33603a("action", "ftl");
        mw2.mo33603a("ftl", String.valueOf(zzbew.f42935b));
        mw2.mo33603a("ed", zzbew.f42937d);
        this.f35876c.mo31048a(this.f35875b);
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
        this.f35875b.mo33609i(zzcdq.f21150b);
    }

    /* renamed from: l */
    public final void mo30511l(boolean z) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            this.f35875b.mo33603a("scar", "true");
        }
    }

    public final void zzn() {
        nw2 nw2 = this.f35876c;
        mw2 mw2 = this.f35875b;
        mw2.mo33603a("action", "loaded");
        nw2.mo31048a(mw2);
    }
}
