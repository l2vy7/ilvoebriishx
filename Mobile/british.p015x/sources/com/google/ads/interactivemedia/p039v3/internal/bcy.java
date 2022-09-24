package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcy */
/* compiled from: IMASDK */
final class bcy extends ThreadLocal<Cipher> {
    bcy() {
    }

    /* renamed from: a */
    protected static final Cipher m15691a() {
        try {
            return bdo.f16176a.mo14949a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m15691a();
    }
}
