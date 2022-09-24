package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azl */
/* compiled from: IMASDK */
public final class azl extends axn<bbo, bbq> {
    azl() {
        super(bbo.class, new azj(aww.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bbo.m15510e(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bbo bbo = (bbo) bln;
        if (bbo.mo14851d().mo15201c() != 0) {
            bea.m15757b(bbo.mo14849a());
            azu.m15308a(bbo.mo14850c().mo14857c());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: i */
    public final axb<bbl, bbo> mo14742i() {
        return new azk(this, bbl.class);
    }
}
