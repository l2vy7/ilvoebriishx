package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bcw */
/* compiled from: IMASDK */
final class bcw extends ThreadLocal<Cipher> {
    bcw() {
    }

    /* renamed from: a */
    protected static final Cipher m15689a() {
        try {
            return bdo.f16176a.mo14949a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m15689a();
    }
}
