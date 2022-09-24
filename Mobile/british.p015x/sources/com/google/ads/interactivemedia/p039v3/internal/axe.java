package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axe */
/* compiled from: IMASDK */
public final class axe {

    /* renamed from: a */
    private final bcf f15871a;

    private axe(bcf bcf) {
        this.f15871a = bcf;
    }

    /* renamed from: a */
    static final axe m15104a(bcf bcf) throws GeneralSecurityException {
        if (bcf != null && bcf.mo14906d() > 0) {
            return new axe(bcf);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public final <P> P mo14743b(Class<P> cls) throws GeneralSecurityException {
        String str;
        Class<?> j = axt.m15152j(cls);
        if (j == null) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "No wrapper found for ".concat(name);
            } else {
                str = new String("No wrapper found for ");
            }
            throw new GeneralSecurityException(str);
        }
        axu.m15163b(this.f15871a);
        axl<P> b = axl.m15115b(j);
        for (bce next : this.f15871a.mo14905c()) {
            if (next.mo14901d() == bcb.ENABLED) {
                axj<P> d = b.mo14758d(axt.m15150h(next.mo14900c(), j), next);
                if (next.mo14902e() == this.f15871a.mo14904a()) {
                    b.mo14757c(d);
                }
            }
        }
        return axt.m15151i(b, cls);
    }

    public final String toString() {
        return axu.m15162a(this.f15871a).toString();
    }
}
