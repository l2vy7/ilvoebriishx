package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azu */
/* compiled from: IMASDK */
final class azu {
    /* renamed from: a */
    public static void m15308a(bbm bbm) throws GeneralSecurityException {
        bdt.m15738e(m15310c(bbm.mo14843a().mo14860a()));
        m15309b(bbm.mo14843a().mo14861c());
        if (bbm.mo14845d() != bbj.UNKNOWN_FORMAT) {
            axt.m15153k(bbm.mo14844c().mo14841a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m15309b(bbt bbt) throws NoSuchAlgorithmException {
        bbj bbj = bbj.UNKNOWN_FORMAT;
        bbs bbs = bbs.UNKNOWN_CURVE;
        bbt bbt2 = bbt.UNKNOWN_HASH;
        int ordinal = bbt.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha384";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        if (ordinal == 5) {
            return "HmacSha224";
        }
        String valueOf = String.valueOf(bbt);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: c */
    public static int m15310c(bbs bbs) throws GeneralSecurityException {
        bbj bbj = bbj.UNKNOWN_FORMAT;
        bbs bbs2 = bbs.UNKNOWN_CURVE;
        bbt bbt = bbt.UNKNOWN_HASH;
        int ordinal = bbs.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(bbs);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m15311d(bbj bbj) throws GeneralSecurityException {
        bbj bbj2 = bbj.UNKNOWN_FORMAT;
        bbs bbs = bbs.UNKNOWN_CURVE;
        bbt bbt = bbt.UNKNOWN_HASH;
        int ordinal = bbj.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(bbj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }
}
