package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rl3 extends ThreadLocal<Cipher> {
    rl3() {
    }

    /* renamed from: a */
    protected static final Cipher m37120a() {
        try {
            return mm3.f35566e.mo33568a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m37120a();
    }
}
