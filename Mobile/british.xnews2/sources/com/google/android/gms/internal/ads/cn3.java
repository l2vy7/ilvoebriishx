package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cn3 implements zc3 {

    /* renamed from: a */
    private final hg3 f30438a;

    /* renamed from: b */
    private final int f30439b;

    public cn3(hg3 hg3, int i) throws GeneralSecurityException {
        this.f30438a = hg3;
        this.f30439b = i;
        if (i >= 10) {
            hg3.mo30737a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo30971a(byte[] bArr) throws GeneralSecurityException {
        return this.f30438a.mo30737a(bArr, this.f30439b);
    }
}
