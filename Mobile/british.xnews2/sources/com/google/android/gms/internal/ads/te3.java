package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class te3 extends tc3<dl3, al3> {

    /* renamed from: b */
    final /* synthetic */ ue3 f39409b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    te3(ue3 ue3, Class cls) {
        super(cls);
        this.f39409b = ue3;
    }

    /* renamed from: a */
    public final /* synthetic */ uq3 mo30665a(eo3 eo3) throws wp3 {
        return dl3.m31468I(eo3, wo3.m39219a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30666c(uq3 uq3) throws GeneralSecurityException {
        zk3 F = al3.m30385F();
        F.mo36073y((dl3) uq3);
        F.mo36072B(0);
        return (al3) F.mo32424p();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo30668e(uq3 uq3) throws GeneralSecurityException {
        dl3 dl3 = (dl3) uq3;
        if (dl3.mo31291J().isEmpty() || !dl3.mo31292K()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
