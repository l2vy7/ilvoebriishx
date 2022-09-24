package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axp */
/* compiled from: IMASDK */
final class axp implements axs {

    /* renamed from: a */
    final /* synthetic */ axd f15882a;

    axp(axd axd) {
        this.f15882a = axd;
    }

    /* renamed from: a */
    public final <Q> awy<Q> mo14763a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new axa(this.f15882a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public final awy<?> mo14764b() {
        axd axd = this.f15882a;
        return new axa(axd, axd.mo14741h());
    }

    /* renamed from: c */
    public final Class<?> mo14765c() {
        return this.f15882a.getClass();
    }

    /* renamed from: d */
    public final Set<Class<?>> mo14766d() {
        return this.f15882a.mo14740g();
    }

    /* renamed from: e */
    public final Class<?> mo14767e() {
        return null;
    }
}
