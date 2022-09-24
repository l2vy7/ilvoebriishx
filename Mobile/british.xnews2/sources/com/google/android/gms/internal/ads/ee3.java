package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ee3 extends tc3<wh3, th3> {

    /* renamed from: b */
    final /* synthetic */ fe3 f31339b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ee3(fe3 fe3, Class cls) {
        super(cls);
        this.f31339b = fe3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return wh3.m39176I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        rh3 F = th3.m37851F();
        F.mo34544y(eo3.m31873L(en3.m31869a(((wh3) uq3).mo35622E())));
        F.mo34543B(0);
        return (th3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<wh3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", fe3.m32142k(16, 1));
        hashMap.put("AES128_GCM_RAW", fe3.m32142k(16, 3));
        hashMap.put("AES256_GCM", fe3.m32142k(32, 1));
        hashMap.put("AES256_GCM_RAW", fe3.m32142k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        gn3.m32590a(((wh3) uq3).mo35622E());
    }
}
