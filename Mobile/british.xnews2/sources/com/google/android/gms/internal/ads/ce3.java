package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ce3 extends vc3<jh3> {
    ce3() {
        super(jh3.class, new ae3(gc3.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ sc3 m30978k(int i, int i2, int i3) {
        lh3 F = mh3.m34796F();
        F.mo33338y(i);
        oh3 F2 = ph3.m36076F();
        F2.mo33903y(16);
        F.mo33337B((ph3) F2.mo32424p());
        return new sc3((mh3) F.mo32424p(), i3);
    }

    /* renamed from: a */
    public final tc3<mh3, jh3> mo30893a() {
        return new be3(this, mh3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return jh3.m33613I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        jh3 jh3 = (jh3) uq3;
        gn3.m32591b(jh3.mo32891E(), 0);
        gn3.m32590a(jh3.mo32893K().mo30457q());
        if (jh3.mo32892J().mo34126E() != 12 && jh3.mo32892J().mo34126E() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
