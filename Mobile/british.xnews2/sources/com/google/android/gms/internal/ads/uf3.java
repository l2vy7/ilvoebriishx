package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class uf3 {
    /* renamed from: a */
    public static void m38320a(aj3 aj3) throws GeneralSecurityException {
        km3.m33990e(m38322c(aj3.mo30394J().mo32900K()));
        m38321b(aj3.mo30394J().mo32901L());
        if (aj3.mo30395M() != 2) {
            od3.m35633c(aj3.mo30393E().mo35194I());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m38321b(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(nj3.m35191a(i))));
    }

    /* renamed from: c */
    public static int m38322c(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(lj3.m34485a(i))));
    }

    /* renamed from: d */
    public static int m38323d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(qi3.m36477a(i))));
            }
        }
        return i3;
    }
}
