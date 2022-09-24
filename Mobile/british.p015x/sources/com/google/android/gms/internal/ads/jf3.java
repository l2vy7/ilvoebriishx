package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jf3 extends tc3<xi3, dj3> {

    /* renamed from: b */
    final /* synthetic */ kf3 f33868b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jf3(kf3 kf3, Class cls) {
        super(cls);
        this.f33868b = kf3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return xi3.m39482H(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        xi3 xi3 = (xi3) uq3;
        KeyPair b = km3.m33987b(km3.m33990e(uf3.m38322c(xi3.mo35759I().mo30394J().mo32900K())));
        ECPoint w = ((ECPublicKey) b.getPublic()).getW();
        fj3 H = gj3.m32551H();
        H.mo31879B(0);
        H.mo31882y(xi3.mo35759I());
        H.mo31880C(eo3.m31873L(w.getAffineX().toByteArray()));
        H.mo31881H(eo3.m31873L(w.getAffineY().toByteArray()));
        cj3 F = dj3.m31420F();
        F.mo30940C(0);
        F.mo30939B((gj3) H.mo32424p());
        F.mo30941y(eo3.m31873L(((ECPrivateKey) b.getPrivate()).getS().toByteArray()));
        return (dj3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<xi3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", kf3.m33930l(4, 5, 3, rc3.m37020a("AES128_GCM"), kf3.f34287d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", kf3.m33930l(4, 5, 3, rc3.m37020a("AES128_GCM"), kf3.f34287d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", kf3.m33930l(4, 5, 4, rc3.m37020a("AES128_GCM"), kf3.f34287d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", kf3.m33930l(4, 5, 4, rc3.m37020a("AES128_GCM"), kf3.f34287d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", kf3.m33930l(4, 5, 4, rc3.m37020a("AES128_GCM"), kf3.f34287d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", kf3.m33930l(4, 5, 3, rc3.m37020a("AES128_CTR_HMAC_SHA256"), kf3.f34287d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", kf3.m33930l(4, 5, 3, rc3.m37020a("AES128_CTR_HMAC_SHA256"), kf3.f34287d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", kf3.m33930l(4, 5, 4, rc3.m37020a("AES128_CTR_HMAC_SHA256"), kf3.f34287d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", kf3.m33930l(4, 5, 4, rc3.m37020a("AES128_CTR_HMAC_SHA256"), kf3.f34287d, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        uf3.m38320a(((xi3) uq3).mo35759I());
    }
}
