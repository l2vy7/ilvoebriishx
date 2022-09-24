package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zd3 extends vc3<ah3> {
    zd3() {
        super(ah3.class, new xd3(wm3.class));
    }

    /* renamed from: l */
    public static final void m40318l(ah3 ah3) throws GeneralSecurityException {
        gn3.m32591b(ah3.mo30380E(), 0);
        gn3.m32590a(ah3.mo30382L().mo30457q());
        m40319m(ah3.mo30381K());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m40319m(gh3 gh3) throws GeneralSecurityException {
        if (gh3.mo32129E() < 12 || gh3.mo32129E() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final tc3<dh3, ah3> mo30893a() {
        return new yd3(this, dh3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return ah3.m30325J(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        m40318l((ah3) uq3);
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
