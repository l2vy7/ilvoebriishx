package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axz */
/* compiled from: IMASDK */
final class axz extends axb<bao, ban> {

    /* renamed from: a */
    final /* synthetic */ aya f15895a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    axz(aya aya, Class cls) {
        super(cls);
        this.f15895a = aya;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14729b(bln bln) throws GeneralSecurityException {
        bao bao = (bao) bln;
        new ayd().mo14742i().mo14729b(bao.mo14800a());
        new bac().mo14742i().mo14729b(bao.mo14801c());
        bea.m15756a(bao.mo14800a().mo14809c());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bln mo14730c(bjq bjq) throws bkt {
        return bao.m15386d(bjq, bka.m16275a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo14731d(bln bln) throws GeneralSecurityException {
        bao bao = (bao) bln;
        Object d = new ayd().mo14742i().mo14731d(bao.mo14800a());
        Object d2 = new bac().mo14742i().mo14731d(bao.mo14801c());
        bam f = ban.m15377f();
        f.mo14794a((baq) d);
        f.mo14795b((bbv) d2);
        f.mo14796c(0);
        return (ban) f.mo15385ae();
    }
}
