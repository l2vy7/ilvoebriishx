package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azz */
/* compiled from: IMASDK */
public final class azz extends axd<bai> {
    azz() {
        super(bai.class, new azx(axh.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m15321l(bal bal) throws GeneralSecurityException {
        if (bal.mo14793a() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (bal.mo14793a() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m15322m(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bai.m15354e(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bai bai = (bai) bln;
        bea.m15757b(bai.mo14788a());
        m15322m(bai.mo14789c().mo15201c());
        m15321l(bai.mo14790d());
    }

    /* renamed from: i */
    public final axb<baj, bai> mo14742i() {
        return new azy(baj.class);
    }
}
