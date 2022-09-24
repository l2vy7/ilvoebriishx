package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ef3 extends vc3<fi3> {
    ef3() {
        super(fi3.class, new cf3(jc3.class));
    }

    /* renamed from: a */
    public final tc3<ii3, fi3> mo30893a() {
        return new df3(this, ii3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return fi3.m32181I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        fi3 fi3 = (fi3) uq3;
        gn3.m32591b(fi3.mo31874E(), 0);
        if (fi3.mo31875J().mo30457q() != 64) {
            int q = fi3.mo31875J().mo30457q();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(q);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
