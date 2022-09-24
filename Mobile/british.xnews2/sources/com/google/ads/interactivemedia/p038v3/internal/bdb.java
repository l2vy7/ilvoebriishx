package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdb */
/* compiled from: IMASDK */
final class bdb extends ThreadLocal<Cipher> {
    bdb() {
    }

    /* renamed from: a */
    protected static final Cipher m15703a() {
        try {
            return bdo.f16176a.mo14949a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m15703a();
    }
}
