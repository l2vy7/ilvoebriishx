package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axu */
/* compiled from: IMASDK */
final class axu {
    static {
        Charset.forName(C6540C.UTF8_NAME);
    }

    /* renamed from: a */
    public static bcj m15162a(bcf bcf) {
        bcg a = bcj.m15633a();
        a.mo14908b(bcf.mo14904a());
        for (bce next : bcf.mo14905c()) {
            bch a2 = bci.m15626a();
            a2.mo14912d(next.mo14900c().mo14887a());
            a2.mo14911c(next.mo14901d());
            a2.mo14910b(next.mo14903f());
            a2.mo14909a(next.mo14902e());
            a.mo14907a((bci) a2.mo15385ae());
        }
        return (bcj) a.mo15385ae();
    }

    /* renamed from: b */
    public static void m15163b(bcf bcf) throws GeneralSecurityException {
        int a = bcf.mo14904a();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (bce next : bcf.mo14905c()) {
            if (next.mo14901d() == bcb.ENABLED) {
                if (!next.mo14899a()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo14902e())}));
                } else if (next.mo14903f() == bcr.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo14902e())}));
                } else if (next.mo14901d() != bcb.UNKNOWN_STATUS) {
                    if (next.mo14902e() == a) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= next.mo14900c().mo14889d() == bbz.ASYMMETRIC_PUBLIC;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo14902e())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
