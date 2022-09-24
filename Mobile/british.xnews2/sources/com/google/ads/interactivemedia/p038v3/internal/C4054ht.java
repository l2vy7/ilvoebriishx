package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ht */
/* compiled from: IMASDK */
public final class C4054ht extends C4068ig {

    /* renamed from: h */
    private static volatile String f17399h;

    /* renamed from: i */
    private static final Object f17400i = new Object();

    public C4054ht(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "ZhDCYxrCMcgSZPuGcM9wAQ/lryfELH/hwoSWjI7UgCmBL/U4jm1j8231unJQcN7G", "Tx6BN+D/YHy1QRF0a4sTUKKvc/7PTkfUYoCdGLIghAs=", kVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        this.f17423d.mo16090y("E");
        if (f17399h == null) {
            synchronized (f17400i) {
                if (f17399h == null) {
                    f17399h = (String) this.f17424e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17423d) {
            this.f17423d.mo16090y(f17399h);
        }
    }
}
