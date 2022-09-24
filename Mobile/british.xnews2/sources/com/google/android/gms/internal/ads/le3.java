package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class le3 extends vc3<li3> {
    le3() {
        super(li3.class, new je3(gc3.class));
    }

    /* renamed from: a */
    public final tc3<oi3, li3> mo30893a() {
        return new ke3(this, oi3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return li3.m34476I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        li3 li3 = (li3) uq3;
        gn3.m32591b(li3.mo33341E(), 0);
        if (li3.mo33342J().mo30457q() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
