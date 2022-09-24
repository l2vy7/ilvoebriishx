package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zf3 extends vc3<kg3> {
    zf3() {
        super(kg3.class, new xf3(zc3.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m40332m(qg3 qg3) throws GeneralSecurityException {
        if (qg3.mo34342E() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (qg3.mo34342E() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m40333n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final tc3<ng3, kg3> mo30893a() {
        return new yf3(this, ng3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return kg3.m33941I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        kg3 kg3 = (kg3) uq3;
        gn3.m32591b(kg3.mo33083E(), 0);
        m40333n(kg3.mo33085K().mo30457q());
        m40332m(kg3.mo33084J());
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
