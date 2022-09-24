package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdx */
/* compiled from: IMASDK */
public final class bdx implements axh {

    /* renamed from: a */
    private final bag f16196a;

    /* renamed from: b */
    private final int f16197b;

    public bdx(bag bag, int i) throws GeneralSecurityException {
        this.f16196a = bag;
        this.f16197b = i;
        if (i >= 10) {
            bag.mo14784a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo14747a(byte[] bArr) throws GeneralSecurityException {
        return this.f16196a.mo14784a(bArr, this.f16197b);
    }
}
