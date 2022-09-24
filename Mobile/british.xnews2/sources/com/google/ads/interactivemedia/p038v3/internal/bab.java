package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bab */
/* compiled from: IMASDK */
final class bab extends axb<bbw, bbv> {

    /* renamed from: a */
    final /* synthetic */ bac f15942a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bab(bac bac, Class cls) {
        super(cls);
        this.f15942a = bac;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14729b(bln bln) throws GeneralSecurityException {
        bbw bbw = (bbw) bln;
        if (bbw.mo14872c() >= 16) {
            bac.m15339l(bbw.mo14871a());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bln mo14730c(bjq bjq) throws bkt {
        return bbw.m15559d(bjq, bka.m16275a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo14731d(bln bln) throws GeneralSecurityException {
        bbw bbw = (bbw) bln;
        bbu f = bbv.m15549f();
        f.mo14867c();
        f.mo14866b(bbw.mo14871a());
        f.mo14865a(bjq.m16051n(bdz.m15753a(bbw.mo14872c())));
        return (bbv) f.mo15385ae();
    }
}
