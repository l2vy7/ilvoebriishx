package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axq */
/* compiled from: IMASDK */
final class axq implements axs {

    /* renamed from: a */
    final /* synthetic */ axn f15883a;

    /* renamed from: b */
    final /* synthetic */ axd f15884b;

    axq(axn axn, axd axd) {
        this.f15883a = axn;
        this.f15884b = axd;
    }

    /* renamed from: a */
    public final <Q> awy<Q> mo14763a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new axa(this.f15883a, (Class) cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: b */
    public final awy<?> mo14764b() {
        axn axn = this.f15883a;
        return new axa(axn, (Class) axn.mo14741h());
    }

    /* renamed from: c */
    public final Class<?> mo14765c() {
        return this.f15883a.getClass();
    }

    /* renamed from: d */
    public final Set<Class<?>> mo14766d() {
        return this.f15883a.mo14740g();
    }

    /* renamed from: e */
    public final Class<?> mo14767e() {
        return this.f15884b.getClass();
    }
}
