package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class if3 extends uc3<kc3, dj3> {
    if3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30362b(Object obj) throws GeneralSecurityException {
        dj3 dj3 = (dj3) obj;
        aj3 F = dj3.mo31267J().mo32151F();
        jj3 J = F.mo30394J();
        int c = uf3.m38322c(J.mo32900K());
        byte[] f = dj3.mo31268K().mo31616f();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, f), km3.m33990e(c));
        return new fm3((ECPrivateKey) mm3.f35572k.mo33568a("EC").generatePrivate(eCPrivateKeySpec), J.mo32899I().mo31616f(), uf3.m38321b(J.mo32901L()), uf3.m38323d(F.mo30395M()), new vf3(F.mo30393E().mo35194I()));
    }
}
