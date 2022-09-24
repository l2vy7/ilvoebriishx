package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayp */
/* compiled from: IMASDK */
public final class ayp extends axd<bbh> {
    ayp() {
        super(bbh.class, new ayn(aws.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bbh.m15481d(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bbh bbh = (bbh) bln;
        bea.m15757b(bbh.mo14838a());
        if (bbh.mo14839c().mo15201c() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: i */
    public final axb<bbi, bbh> mo14742i() {
        return new ayo(this, bbi.class);
    }
}
