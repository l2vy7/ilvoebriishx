package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hx */
/* compiled from: IMASDK */
public final class C4058hx extends C4068ig {

    /* renamed from: h */
    private final boolean f17402h;

    public C4058hx(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "YGljdmTqVecnIT/TcNBW8EyCW98CifULQ4UQ5x4xY9d0w3w6sROgLyygqbyghtw3", "UuCnFh6ovoijq9XZ+A2Y7XU13mSANZwBIMCWkOnrp4k=", kVar, i, 61);
        this.f17402h = hcVar.mo15902j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f17424e.invoke((Object) null, new Object[]{this.f17420a.mo15893a(), Boolean.valueOf(this.f17402h)})).longValue();
        synchronized (this.f17423d) {
            this.f17423d.mo16046D(longValue);
        }
    }
}
