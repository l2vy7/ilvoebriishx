package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class be3 extends tc3<mh3, jh3> {

    /* renamed from: b */
    final /* synthetic */ ce3 f29985b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    be3(ce3 ce3, Class cls) {
        super(cls);
        this.f29985b = ce3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return mh3.m34798I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        mh3 mh3 = (mh3) uq3;
        ih3 F = jh3.m33611F();
        F.mo32630y(eo3.m31873L(en3.m31869a(mh3.mo33546E())));
        F.mo32628B(mh3.mo33547J());
        F.mo32629C(0);
        return (jh3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<mh3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", ce3.m30978k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", ce3.m30978k(16, 16, 3));
        hashMap.put("AES256_EAX", ce3.m30978k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", ce3.m30978k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        mh3 mh3 = (mh3) uq3;
        gn3.m32590a(mh3.mo33546E());
        if (mh3.mo33547J().mo34126E() != 12 && mh3.mo33547J().mo34126E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
