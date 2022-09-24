package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ke3 extends tc3<oi3, li3> {

    /* renamed from: b */
    final /* synthetic */ le3 f34280b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ke3(le3 le3, Class cls) {
        super(cls);
        this.f34280b = le3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return oi3.m35709H(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        oi3 oi3 = (oi3) uq3;
        ki3 F = li3.m34474F();
        F.mo33095B(0);
        F.mo33096y(eo3.m31873L(en3.m31869a(32)));
        return (li3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<oi3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new sc3(oi3.m35708F(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new sc3(oi3.m35708F(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        oi3 oi3 = (oi3) uq3;
    }
}
