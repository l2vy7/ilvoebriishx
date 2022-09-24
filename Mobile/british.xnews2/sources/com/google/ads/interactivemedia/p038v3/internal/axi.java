package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;

@Deprecated
/* renamed from: com.google.ads.interactivemedia.v3.internal.axi */
/* compiled from: IMASDK */
public final class axi {
    @Deprecated
    /* renamed from: a */
    public static final axe m15110a(byte[] bArr) throws GeneralSecurityException {
        try {
            bcf e = bcf.m15614e(bArr, bka.m16275a());
            for (bce next : e.mo14905c()) {
                if (next.mo14900c().mo14889d() == bbz.UNKNOWN_KEYMATERIAL || next.mo14900c().mo14889d() == bbz.SYMMETRIC || next.mo14900c().mo14889d() == bbz.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return axe.m15104a(e);
        } catch (bkt unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
