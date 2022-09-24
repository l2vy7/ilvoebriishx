package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ayd */
/* compiled from: IMASDK */
public final class ayd extends axd<baq> {
    ayd() {
        super(baq.class, new ayb(bds.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m15191l(bas bas) throws GeneralSecurityException {
        if (bas.mo14810a() < 12 || bas.mo14810a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return baq.m15394e(bjq, bka.m16275a());
    }

    /* renamed from: i */
    public final axb<bar, baq> mo14742i() {
        return new ayc(this, bar.class);
    }

    /* renamed from: j */
    public final void mo14738e(baq baq) throws GeneralSecurityException {
        bea.m15757b(baq.mo14805a());
        bea.m15756a(baq.mo14807d().mo15201c());
        m15191l(baq.mo14806c());
    }
}
