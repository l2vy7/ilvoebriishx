package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kn */
/* compiled from: IMASDK */
public final class C4129kn {

    /* renamed from: a */
    public final String f17728a;

    /* renamed from: b */
    public final C4128km f17729b;

    /* renamed from: c */
    public final C4127kl f17730c;

    /* renamed from: d */
    public final C4131kp f17731d;

    /* renamed from: e */
    public final C4125kj f17732e;

    /* synthetic */ C4129kn(String str, C4125kj kjVar, C4128km kmVar, C4127kl klVar, C4131kp kpVar) {
        this.f17728a = str;
        this.f17729b = kmVar;
        this.f17730c = klVar;
        this.f17731d = kpVar;
        this.f17732e = kjVar;
    }

    /* renamed from: a */
    public final C4124ki mo16153a() {
        return new C4124ki(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4129kn)) {
            return false;
        }
        C4129kn knVar = (C4129kn) obj;
        return amm.m14233c(this.f17728a, knVar.f17728a) && this.f17732e.equals(knVar.f17732e) && amm.m14233c(this.f17729b, knVar.f17729b) && amm.m14233c(this.f17730c, knVar.f17730c) && amm.m14233c(this.f17731d, knVar.f17731d);
    }

    public final int hashCode() {
        int hashCode = this.f17728a.hashCode() * 31;
        C4128km kmVar = this.f17729b;
        return (((((hashCode + (kmVar != null ? kmVar.hashCode() : 0)) * 31) + this.f17730c.hashCode()) * 31) + this.f17732e.hashCode()) * 31;
    }
}
