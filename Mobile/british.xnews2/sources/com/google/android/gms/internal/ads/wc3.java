package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wc3 {

    /* renamed from: a */
    private final lk3 f40753a;

    private wc3(lk3 lk3) {
        this.f40753a = lk3;
    }

    /* renamed from: a */
    static final wc3 m39119a(lk3 lk3) throws GeneralSecurityException {
        if (lk3 != null && lk3.mo33348E() > 0) {
            return new wc3(lk3);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public final <P> P mo35608b(Class<P> cls) throws GeneralSecurityException {
        String str;
        Class<?> e = od3.m35635e(cls);
        if (e == null) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "No wrapper found for ".concat(name);
            } else {
                str = new String("No wrapper found for ");
            }
            throw new GeneralSecurityException(str);
        }
        pd3.m36062b(this.f40753a);
        ed3<P> c = ed3.m31789c(e);
        for (kk3 next : this.f40753a.mo33350J()) {
            if (next.mo33107J() == 3) {
                bd3<P> a = c.mo31547a(od3.m35636f(next.mo33105F(), e), next);
                if (next.mo33104E() == this.f40753a.mo33349F()) {
                    c.mo31550e(a);
                }
            }
        }
        return od3.m35639i(c, cls);
    }

    public final String toString() {
        return pd3.m36061a(this.f40753a).toString();
    }
}
