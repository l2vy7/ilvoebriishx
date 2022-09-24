package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pd3 {

    /* renamed from: a */
    public static final Charset f37600a = Charset.forName(C6540C.UTF8_NAME);

    /* renamed from: a */
    public static qk3 m36061a(lk3 lk3) {
        nk3 E = qk3.m36499E();
        E.mo33710B(lk3.mo33349F());
        for (kk3 next : lk3.mo33350J()) {
            ok3 E2 = pk3.m36118E();
            E2.mo33935B(next.mo33105F().mo30409J());
            E2.mo33937H(next.mo33107J());
            E2.mo33936C(next.mo33108K());
            E2.mo33938y(next.mo33104E());
            E.mo33711y((pk3) E2.mo32424p());
        }
        return (qk3) E.mo32424p();
    }

    /* renamed from: b */
    public static void m36062b(lk3 lk3) throws GeneralSecurityException {
        int F = lk3.mo33349F();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (kk3 next : lk3.mo33350J()) {
            if (next.mo33107J() == 3) {
                if (!next.mo33106I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo33104E())}));
                } else if (next.mo33108K() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo33104E())}));
                } else if (next.mo33107J() != 2) {
                    if (next.mo33104E() == F) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= next.mo33105F().mo30410M() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo33104E())}));
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
