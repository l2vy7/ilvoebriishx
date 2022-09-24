package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vd3 extends tc3<xg3, ug3> {

    /* renamed from: b */
    final /* synthetic */ wd3 f40398b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    vd3(wd3 wd3, Class cls) {
        super(cls);
        this.f40398b = wd3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return xg3.m39462H(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        xg3 xg3 = (xg3) uq3;
        new zd3();
        ah3 g = yd3.m39886g(xg3.mo35754I());
        Object c = new cg3().mo30893a().mo30666c(xg3.mo35755J());
        tg3 F = ug3.m38324F();
        F.mo34955y(g);
        F.mo34953B((qj3) c);
        F.mo34954C(0);
        return (ug3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<xg3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", wd3.m39136k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", wd3.m39136k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", wd3.m39136k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", wd3.m39136k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        xg3 xg3 = (xg3) uq3;
        ((yd3) new zd3().mo30893a()).mo30668e(xg3.mo35754I());
        new cg3().mo30893a().mo30668e(xg3.mo35755J());
        gn3.m32590a(xg3.mo35754I().mo31256E());
    }
}
