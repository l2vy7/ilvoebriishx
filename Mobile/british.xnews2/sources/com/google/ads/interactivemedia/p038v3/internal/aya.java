package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aya */
/* compiled from: IMASDK */
public final class aya extends axd<ban> {
    aya() {
        super(ban.class, new axy(aws.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return ban.m15376e(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        ban ban = (ban) bln;
        bea.m15757b(ban.mo14797a());
        new ayd().mo14738e(ban.mo14798c());
        new bac();
        bac.m15338k(ban.mo14799d());
    }

    /* renamed from: i */
    public final axb<bao, ban> mo14742i() {
        return new axz(this, bao.class);
    }
}
