package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class we3 extends tc3<ol3, ll3> {

    /* renamed from: b */
    final /* synthetic */ xe3 f40771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    we3(xe3 xe3, Class cls) {
        super(cls);
        this.f40771b = xe3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return ol3.m35758H(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        ol3 ol3 = (ol3) uq3;
        kl3 F = ll3.m34493F();
        F.mo33114B(0);
        F.mo33115y(eo3.m31873L(en3.m31869a(32)));
        return (ll3) F.mo32424p();
    }

    /* renamed from: d */
    public final Map<String, sc3<ol3>> mo30667d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new sc3(ol3.m35757F(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new sc3(ol3.m35757F(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        ol3 ol3 = (ol3) uq3;
    }
}
