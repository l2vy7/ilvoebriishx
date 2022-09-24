package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qm3 implements um3<KeyPairGenerator> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33718a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
