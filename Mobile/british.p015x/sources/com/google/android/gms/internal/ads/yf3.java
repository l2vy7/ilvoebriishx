package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yf3 extends tc3<ng3, kg3> {
    yf3(zf3 zf3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return ng3.m35150I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        ng3 ng3 = (ng3) uq3;
        jg3 F = kg3.m33939F();
        F.mo32887C(0);
        F.mo32888y(eo3.m31873L(en3.m31869a(ng3.mo33696E())));
        F.mo32886B(ng3.mo33697J());
        return (kg3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<ng3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        mg3 F = ng3.m35148F();
        F.mo33541y(32);
        pg3 F2 = qg3.m36465F();
        F2.mo34121y(16);
        F.mo33540B((qg3) F2.mo32424p());
        hashMap.put("AES_CMAC", new sc3((ng3) F.mo32424p(), 1));
        mg3 F3 = ng3.m35148F();
        F3.mo33541y(32);
        pg3 F4 = qg3.m36465F();
        F4.mo34121y(16);
        F3.mo33540B((qg3) F4.mo32424p());
        hashMap.put("AES256_CMAC", new sc3((ng3) F3.mo32424p(), 1));
        mg3 F5 = ng3.m35148F();
        F5.mo33541y(32);
        pg3 F6 = qg3.m36465F();
        F6.mo34121y(16);
        F5.mo33540B((qg3) F6.mo32424p());
        hashMap.put("AES256_CMAC_RAW", new sc3((ng3) F5.mo32424p(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        ng3 ng3 = (ng3) uq3;
        zf3.m40332m(ng3.mo33697J());
        zf3.m40333n(ng3.mo33696E());
    }
}
