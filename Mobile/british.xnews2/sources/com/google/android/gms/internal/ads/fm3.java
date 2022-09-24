package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fm3 implements kc3 {

    /* renamed from: a */
    private final ECPrivateKey f31810a;

    /* renamed from: b */
    private final hm3 f31811b;

    /* renamed from: c */
    private final String f31812c;

    /* renamed from: d */
    private final byte[] f31813d;

    /* renamed from: e */
    private final em3 f31814e;

    public fm3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, em3 em3) throws GeneralSecurityException {
        this.f31810a = eCPrivateKey;
        this.f31811b = new hm3(eCPrivateKey);
        this.f31813d = bArr;
        this.f31812c = str;
        this.f31814e = em3;
    }
}
