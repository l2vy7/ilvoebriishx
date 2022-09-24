package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aym */
/* compiled from: IMASDK */
public final class aym extends axd<bbb> {
    aym() {
        super(bbb.class, new ayk(aws.class));
    }

    /* renamed from: j */
    public static void m15220j() throws GeneralSecurityException {
        if (m15221k()) {
            axt.m15155m(new aym());
        }
    }

    /* renamed from: k */
    private static boolean m15221k() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final String mo14735b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: c */
    public final bbz mo14736c() {
        return bbz.SYMMETRIC;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bln mo14737d(bjq bjq) throws bkt {
        return bbb.m15453d(bjq, bka.m16275a());
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14738e(bln bln) throws GeneralSecurityException {
        bbb bbb = (bbb) bln;
        bea.m15757b(bbb.mo14828a());
        bea.m15756a(bbb.mo14829c().mo15201c());
    }

    /* renamed from: i */
    public final axb<bbc, bbb> mo14742i() {
        return new ayl(this, bbc.class);
    }
}
