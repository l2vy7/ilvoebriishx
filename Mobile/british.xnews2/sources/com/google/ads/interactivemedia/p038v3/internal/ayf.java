package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayf */
/* compiled from: IMASDK */
final class ayf extends axb<bav, bau> {

    /* renamed from: a */
    final /* synthetic */ ayg f15903a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ayf(ayg ayg, Class cls) {
        super(cls);
        this.f15903a = ayg;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14729b(bln bln) throws GeneralSecurityException {
        bav bav = (bav) bln;
        bea.m15756a(bav.mo14818c());
        if (bav.mo14817a().mo14819a() != 12 && bav.mo14817a().mo14819a() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bln mo14730c(bjq bjq) throws bkt {
        return bav.m15428d(bjq, bka.m16275a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo14731d(bln bln) throws GeneralSecurityException {
        bav bav = (bav) bln;
        bat f = bau.m15419f();
        f.mo14811a(bjq.m16051n(bdz.m15753a(bav.mo14818c())));
        f.mo14812b(bav.mo14817a());
        f.mo14813c();
        return (bau) f.mo15385ae();
    }
}
