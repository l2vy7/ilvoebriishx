package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azf */
/* compiled from: IMASDK */
public final class azf extends axd<bbe> {
    azf() {
        super(bbe.class, new azd(awv.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bbe.m15467d(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bbe bbe = (bbe) bln;
        bea.m15757b(bbe.mo14833a());
        if (bbe.mo14834c().mo15201c() != 64) {
            int c = bbe.mo14834c().mo15201c();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(c);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* renamed from: i */
    public final axb<bbf, bbe> mo14742i() {
        return new aze(this, bbf.class);
    }
}
