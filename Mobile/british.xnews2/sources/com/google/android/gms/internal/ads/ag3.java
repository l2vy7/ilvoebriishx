package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ag3 extends uc3<zc3, qj3> {
    ag3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30362b(Object obj) throws GeneralSecurityException {
        qj3 qj3 = (qj3) obj;
        int K = qj3.mo34350K().mo35765K();
        SecretKeySpec secretKeySpec = new SecretKeySpec(qj3.mo34351L().mo31616f(), "HMAC");
        int E = qj3.mo34350K().mo35764E();
        int i = K - 2;
        if (i == 1) {
            return new cn3(new bn3("HMACSHA1", secretKeySpec), E);
        }
        if (i == 2) {
            return new cn3(new bn3("HMACSHA384", secretKeySpec), E);
        }
        if (i == 3) {
            return new cn3(new bn3("HMACSHA256", secretKeySpec), E);
        }
        if (i == 4) {
            return new cn3(new bn3("HMACSHA512", secretKeySpec), E);
        }
        if (i == 5) {
            return new cn3(new bn3("HMACSHA224", secretKeySpec), E);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
