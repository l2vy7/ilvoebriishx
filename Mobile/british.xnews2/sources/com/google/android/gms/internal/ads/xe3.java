package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xe3 extends vc3<ll3> {
    xe3() {
        super(ll3.class, new ve3(gc3.class));
    }

    /* renamed from: a */
    public final tc3<ol3, ll3> mo30893a() {
        return new we3(this, ol3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return ll3.m34495I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        ll3 ll3 = (ll3) uq3;
        gn3.m32591b(ll3.mo33352E(), 0);
        if (ll3.mo33353J().mo30457q() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
