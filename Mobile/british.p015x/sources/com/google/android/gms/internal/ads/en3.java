package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class en3 {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f31436a = new dn3();

    /* renamed from: a */
    public static byte[] m31869a(int i) {
        byte[] bArr = new byte[i];
        f31436a.get().nextBytes(bArr);
        return bArr;
    }
}
