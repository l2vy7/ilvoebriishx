package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axo */
/* compiled from: IMASDK */
final class axo implements axs {

    /* renamed from: a */
    final /* synthetic */ awy f15881a;

    axo(awy awy) {
        this.f15881a = awy;
    }

    /* renamed from: a */
    public final <Q> awy<Q> mo14763a(Class<Q> cls) throws GeneralSecurityException {
        if (this.f15881a.mo14724e().equals(cls)) {
            return this.f15881a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    /* renamed from: b */
    public final awy<?> mo14764b() {
        return this.f15881a;
    }

    /* renamed from: c */
    public final Class<?> mo14765c() {
        return this.f15881a.getClass();
    }

    /* renamed from: d */
    public final Set<Class<?>> mo14766d() {
        return Collections.singleton(this.f15881a.mo14724e());
    }

    /* renamed from: e */
    public final Class<?> mo14767e() {
        return null;
    }
}
