package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class av1 implements kd1, cc1, pa1, od1 {

    /* renamed from: b */
    private final jv1 f29771b;

    /* renamed from: c */
    private final tv1 f29772c;

    public av1(jv1 jv1, tv1 tv1) {
        this.f29771b = jv1;
        this.f29772c = tv1;
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
        this.f29771b.mo32990b(ur2);
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        this.f29771b.mo32989a().put("action", "ftl");
        this.f29771b.mo32989a().put("ftl", String.valueOf(zzbew.f42935b));
        this.f29771b.mo32989a().put("ed", zzbew.f42937d);
        this.f29772c.mo35504b(this.f29771b.mo32989a());
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
        this.f29771b.mo32991c(zzcdq.f21150b);
    }

    /* renamed from: l */
    public final void mo30511l(boolean z) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            this.f29771b.mo32989a().put("scar", "true");
        }
    }

    public final void zzn() {
        this.f29771b.mo32989a().put("action", "loaded");
        this.f29772c.mo35504b(this.f29771b.mo32989a());
    }
}
