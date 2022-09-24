package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ye3 extends ThreadLocal<Cipher> {
    ye3() {
    }

    /* renamed from: a */
    protected static final Cipher m39895a() {
        try {
            return mm3.f35566e.mo33568a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m39895a();
    }
}
