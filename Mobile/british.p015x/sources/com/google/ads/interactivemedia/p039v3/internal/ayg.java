package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayg */
/* compiled from: IMASDK */
public final class ayg extends axd<bau> {
    ayg() {
        super(bau.class, new aye(aws.class));
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bau.m15418e(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bau bau = (bau) bln;
        bea.m15757b(bau.mo14814a());
        bea.m15756a(bau.mo14816d().mo15201c());
        if (bau.mo14815c().mo14819a() != 12 && bau.mo14815c().mo14819a() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: i */
    public final axb<bav, bau> mo14742i() {
        return new ayf(this, bav.class);
    }
}
