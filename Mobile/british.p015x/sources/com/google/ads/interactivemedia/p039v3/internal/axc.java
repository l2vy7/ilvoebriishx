package com.google.ads.interactivemedia.p039v3.internal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axc */
/* compiled from: IMASDK */
public abstract class axc<PrimitiveT, KeyT> {

    /* renamed from: a */
    private final Class<PrimitiveT> f15867a;

    public axc(Class<PrimitiveT> cls) {
        this.f15867a = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class<PrimitiveT> mo14732a() {
        return this.f15867a;
    }

    /* renamed from: b */
    public abstract PrimitiveT mo14733b(KeyT keyt) throws GeneralSecurityException;
}
