package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayj */
/* compiled from: IMASDK */
public final class ayj extends axd<bay> {
    ayj() {
        super(bay.class, new ayh(aws.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bay.m15439d(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bay bay = (bay) bln;
        bea.m15757b(bay.mo14822a());
        bea.m15756a(bay.mo14823c().mo15201c());
    }

    /* renamed from: i */
    public final axb<baz, bay> mo14742i() {
        return new ayi(this, baz.class);
    }
}
