package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bac */
/* compiled from: IMASDK */
public final class bac extends axd<bbv> {
    public bac() {
        super(bbv.class, new baa(axh.class));
    }

    /* renamed from: k */
    public static final void m15338k(bbv bbv) throws GeneralSecurityException {
        bea.m15757b(bbv.mo14868a());
        if (bbv.mo14870d().mo15201c() >= 16) {
            m15339l(bbv.mo14869c());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m15339l(bbx bbx) throws GeneralSecurityException {
        if (bbx.mo14874c() >= 10) {
            bbt bbt = bbt.UNKNOWN_HASH;
            int ordinal = bbx.mo14873a().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (bbx.mo14874c() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (bbx.mo14874c() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (bbx.mo14874c() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (bbx.mo14874c() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (bbx.mo14874c() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bbv.m15548e(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        m15338k((bbv) bln);
    }

    /* renamed from: i */
    public final axb<bbw, bbv> mo14742i() {
        return new bab(this, bbw.class);
    }
}
