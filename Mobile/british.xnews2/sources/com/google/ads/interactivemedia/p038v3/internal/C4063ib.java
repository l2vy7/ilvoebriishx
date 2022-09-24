package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ib */
/* compiled from: IMASDK */
public final class C4063ib extends C4068ig {

    /* renamed from: h */
    private static volatile Long f17411h;

    /* renamed from: i */
    private static final Object f17412i = new Object();

    public C4063ib(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "dtSI0aKX7UTEtNqwwKeUCAgkaGFO8NldeUWoEFEF24FGt0zcuIxq/320xj/CPQVD", "aR1qQgZoj5moBo+qhq9c0z5J3aresRgomgvyzjE3nwA=", kVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        if (f17411h == null) {
            synchronized (f17412i) {
                if (f17411h == null) {
                    f17411h = (Long) this.f17424e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17423d) {
            this.f17423d.mo16062T(f17411h.longValue());
        }
    }
}
