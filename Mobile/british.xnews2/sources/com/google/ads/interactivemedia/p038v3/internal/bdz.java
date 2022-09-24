package com.google.ads.interactivemedia.p038v3.internal;

import java.security.SecureRandom;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdz */
/* compiled from: IMASDK */
public final class bdz {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f16198a = new bdy();

    /* renamed from: a */
    public static byte[] m15753a(int i) {
        byte[] bArr = new byte[i];
        f16198a.get().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: b */
    static /* synthetic */ SecureRandom m15754b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
