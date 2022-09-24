package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azk */
/* compiled from: IMASDK */
final class azk extends axb<bbl, bbo> {

    /* renamed from: a */
    final /* synthetic */ azl f15925a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    azk(azl azl, Class cls) {
        super(cls);
        this.f15925a = azl;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14729b(bln bln) throws GeneralSecurityException {
        azu.m15308a(((bbl) bln).mo14842a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bln mo14730c(bjq bjq) throws bkt {
        return bbl.m15497c(bjq, bka.m16275a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo14731d(bln bln) throws GeneralSecurityException {
        bbl bbl = (bbl) bln;
        KeyPair d = bdt.m15737d(bdt.m15738e(azu.m15310c(bbl.mo14842a().mo14843a().mo14860a())));
        ECPoint w = ((ECPublicKey) d.getPublic()).getW();
        bbp g = bbq.m15525g();
        g.mo14853b();
        g.mo14852a(bbl.mo14842a());
        g.mo14854c(bjq.m16051n(w.getAffineX().toByteArray()));
        g.mo14855d(bjq.m16051n(w.getAffineY().toByteArray()));
        bbn f = bbo.m15511f();
        f.mo14848c();
        f.mo14847b((bbq) g.mo15385ae());
        f.mo14846a(bjq.m16051n(((ECPrivateKey) d.getPrivate()).getS().toByteArray()));
        return (bbo) f.mo15385ae();
    }
}
