package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdp */
/* compiled from: IMASDK */
public final class bdp implements bdq<KeyAgreement> {

    /* renamed from: a */
    private final /* synthetic */ int f16185a = 0;

    public bdp() {
    }

    public bdp(byte[] bArr) {
    }

    public bdp(char[] cArr) {
    }

    public bdp(float[] fArr) {
    }

    public bdp(int[] iArr) {
    }

    public bdp(short[] sArr) {
    }

    public bdp(boolean[] zArr) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14950a(String str, Provider provider) throws GeneralSecurityException {
        int i = this.f16185a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (provider == null) {
                                    return Signature.getInstance(str);
                                }
                                return Signature.getInstance(str, provider);
                            } else if (provider == null) {
                                return MessageDigest.getInstance(str);
                            } else {
                                return MessageDigest.getInstance(str, provider);
                            }
                        } else if (provider == null) {
                            return Mac.getInstance(str);
                        } else {
                            return Mac.getInstance(str, provider);
                        }
                    } else if (provider == null) {
                        return KeyPairGenerator.getInstance(str);
                    } else {
                        return KeyPairGenerator.getInstance(str, provider);
                    }
                } else if (provider == null) {
                    return KeyFactory.getInstance(str);
                } else {
                    return KeyFactory.getInstance(str, provider);
                }
            } else if (provider == null) {
                return Cipher.getInstance(str);
            } else {
                return Cipher.getInstance(str, provider);
            }
        } else if (provider == null) {
            return KeyAgreement.getInstance(str);
        } else {
            return KeyAgreement.getInstance(str, provider);
        }
    }
}
