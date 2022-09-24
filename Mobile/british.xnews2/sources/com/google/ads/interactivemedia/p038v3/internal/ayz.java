package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayz */
/* compiled from: IMASDK */
public final class ayz extends axd<bcu> {
    ayz() {
        super(bcu.class, new ayx(aws.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bcu.m15678d(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bcu bcu = (bcu) bln;
        bea.m15757b(bcu.mo14929a());
        if (bcu.mo14930c().mo15201c() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: i */
    public final axb<bcv, bcu> mo14742i() {
        return new ayy(this, bcv.class);
    }
}
