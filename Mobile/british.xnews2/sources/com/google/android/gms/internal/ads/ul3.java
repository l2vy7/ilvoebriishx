package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ul3 extends ThreadLocal<Cipher> {
    ul3() {
    }

    /* renamed from: a */
    protected static final Cipher m38366a() {
        try {
            return mm3.f35566e.mo33568a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m38366a();
    }
}
