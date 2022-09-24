package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class he3 extends tc3<ci3, zh3> {

    /* renamed from: b */
    final /* synthetic */ ie3 f32715b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    he3(ie3 ie3, Class cls) {
        super(cls);
        this.f32715b = ie3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return ci3.m31036I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        yh3 F = zh3.m40345F();
        F.mo35939y(eo3.m31873L(en3.m31869a(((ci3) uq3).mo30934E())));
        F.mo35938B(0);
        return (zh3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<ci3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ie3.m33209l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ie3.m33209l(16, 3));
        hashMap.put("AES256_GCM_SIV", ie3.m33209l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ie3.m33209l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        gn3.m32590a(((ci3) uq3).mo30934E());
    }
}
