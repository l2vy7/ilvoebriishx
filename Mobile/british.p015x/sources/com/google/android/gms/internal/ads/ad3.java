package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ad3 {
    @Deprecated
    /* renamed from: a */
    public static final wc3 m30293a(byte[] bArr) throws GeneralSecurityException {
        try {
            lk3 I = lk3.m34487I(bArr, wo3.m39219a());
            for (kk3 next : I.mo33350J()) {
                if (next.mo33105F().mo30410M() == 2 || next.mo33105F().mo30410M() == 3 || next.mo33105F().mo30410M() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return wc3.m39119a(I);
        } catch (wp3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
