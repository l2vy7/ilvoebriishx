package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ie3 extends vc3<zh3> {
    ie3() {
        super(zh3.class, new ge3(gc3.class));
    }

    /* renamed from: k */
    public static void m33208k(boolean z) throws GeneralSecurityException {
        if (m33210m()) {
            od3.m35643m(new ie3(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ sc3 m33209l(int i, int i2) {
        bi3 F = ci3.m31034F();
        F.mo30679y(i);
        return new sc3((ci3) F.mo32424p(), i2);
    }

    /* renamed from: m */
    private static boolean m33210m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final tc3<ci3, zh3> mo30893a() {
        return new he3(this, ci3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return zh3.m40347I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        zh3 zh3 = (zh3) uq3;
        gn3.m32591b(zh3.mo36061E(), 0);
        gn3.m32590a(zh3.mo36062J().mo30457q());
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 3;
    }
}
