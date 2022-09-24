package com.google.ads.interactivemedia.p039v3.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azj */
/* compiled from: IMASDK */
final class azj extends axc<aww, bbo> {
    azj(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14733b(Object obj) throws GeneralSecurityException {
        bbo bbo = (bbo) obj;
        bbm c = bbo.mo14850c().mo14857c();
        bbr a = c.mo14843a();
        int c2 = azu.m15310c(a.mo14860a());
        byte[] q = bbo.mo14851d().mo15216q();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, q), bdt.m15738e(c2));
        new azv(c.mo14844c().mo14841a());
        a.mo14862d().mo15216q();
        azu.m15309b(a.mo14861c());
        azu.m15311d(c.mo14845d());
        return new bdj((ECPrivateKey) bdo.f16180e.mo14949a("EC").generatePrivate(eCPrivateKeySpec));
    }
}
