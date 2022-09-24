package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.baa */
/* compiled from: IMASDK */
final class baa extends axc<axh, bbv> {
    baa(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14733b(Object obj) throws GeneralSecurityException {
        bbv bbv = (bbv) obj;
        bbt a = bbv.mo14869c().mo14873a();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bbv.mo14870d().mo15216q(), "HMAC");
        int c = bbv.mo14869c().mo14874c();
        bbt bbt = bbt.UNKNOWN_HASH;
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            return new bdx(new bdw("HMACSHA1", secretKeySpec), c);
        }
        if (ordinal == 2) {
            return new bdx(new bdw("HMACSHA384", secretKeySpec), c);
        }
        if (ordinal == 3) {
            return new bdx(new bdw("HMACSHA256", secretKeySpec), c);
        }
        if (ordinal == 4) {
            return new bdx(new bdw("HMACSHA512", secretKeySpec), c);
        }
        if (ordinal == 5) {
            return new bdx(new bdw("HMACSHA224", secretKeySpec), c);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
