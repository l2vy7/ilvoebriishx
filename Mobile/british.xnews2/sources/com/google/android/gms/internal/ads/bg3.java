package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bg3 extends tc3<tj3, qj3> {

    /* renamed from: b */
    final /* synthetic */ cg3 f30000b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bg3(cg3 cg3, Class cls) {
        super(cls);
        this.f30000b = cg3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return tj3.m37873J(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        tj3 tj3 = (tj3) uq3;
        pj3 F = qj3.m36484F();
        F.mo34140C(0);
        F.mo34139B(tj3.mo34967K());
        F.mo34141y(eo3.m31873L(en3.m31869a(tj3.mo34966E())));
        return (qj3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<tj3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", cg3.m31013m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", cg3.m31013m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", cg3.m31013m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", cg3.m31013m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", cg3.m31013m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", cg3.m31013m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", cg3.m31013m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", cg3.m31013m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", cg3.m31013m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", cg3.m31013m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        tj3 tj3 = (tj3) uq3;
        if (tj3.mo34966E() >= 16) {
            cg3.m31014n(tj3.mo34967K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
