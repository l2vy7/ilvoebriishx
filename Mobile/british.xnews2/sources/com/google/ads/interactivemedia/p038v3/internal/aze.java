package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aze */
/* compiled from: IMASDK */
final class aze extends axb<bbf, bbe> {

    /* renamed from: a */
    final /* synthetic */ azf f15922a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aze(azf azf, Class cls) {
        super(cls);
        this.f15922a = azf;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14729b(bln bln) throws GeneralSecurityException {
        bbf bbf = (bbf) bln;
        if (bbf.mo14835a() != 64) {
            int a = bbf.mo14835a();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(a);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bln mo14730c(bjq bjq) throws bkt {
        return bbf.m15475c(bjq, bka.m16275a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo14731d(bln bln) throws GeneralSecurityException {
        bbd e = bbe.m15468e();
        e.mo14831a(bjq.m16051n(bdz.m15753a(((bbf) bln).mo14835a())));
        e.mo14832b();
        return (bbe) e.mo15385ae();
    }
}
