package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class df3 extends tc3<ii3, fi3> {

    /* renamed from: b */
    final /* synthetic */ ef3 f30736b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    df3(ef3 ef3, Class cls) {
        super(cls);
        this.f30736b = ef3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return ii3.m33225I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        ei3 F = fi3.m32179F();
        F.mo31581y(eo3.m31873L(en3.m31869a(((ii3) uq3).mo32634E())));
        F.mo31580B(0);
        return (fi3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<ii3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hi3 F = ii3.m33223F();
        F.mo32391y(64);
        hashMap.put("AES256_SIV", new sc3((ii3) F.mo32424p(), 1));
        hi3 F2 = ii3.m33223F();
        F2.mo32391y(64);
        hashMap.put("AES256_SIV_RAW", new sc3((ii3) F2.mo32424p(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        ii3 ii3 = (ii3) uq3;
        if (ii3.mo32634E() != 64) {
            int E = ii3.mo32634E();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(E);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }
}
