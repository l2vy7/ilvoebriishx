package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class uc3<PrimitiveT, KeyT> {

    /* renamed from: a */
    private final Class<PrimitiveT> f39823a;

    public uc3(Class<PrimitiveT> cls) {
        this.f39823a = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class<PrimitiveT> mo35164a() {
        return this.f39823a;
    }

    /* renamed from: b */
    public abstract PrimitiveT mo30362b(KeyT keyt) throws GeneralSecurityException;
}
