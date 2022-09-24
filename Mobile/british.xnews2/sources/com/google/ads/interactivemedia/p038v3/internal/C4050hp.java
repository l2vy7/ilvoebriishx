package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hp */
/* compiled from: IMASDK */
public final class C4050hp extends C4068ig {

    /* renamed from: h */
    private static volatile Long f17397h;

    /* renamed from: i */
    private static final Object f17398i = new Object();

    public C4050hp(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "3kDC/5zdzriiTlLT98JAXh+tBEcp8Zs9D/7C5pBfnPMFpbO41uhjttSiwgYBtCds", "XaEk5xUvARugMaH/yLgQFFyBRau1nqpoJU7dPEEG4NA=", kVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        if (f17397h == null) {
            synchronized (f17398i) {
                if (f17397h == null) {
                    f17397h = (Long) this.f17424e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17423d) {
            this.f17423d.mo16086u(f17397h.longValue());
        }
    }
}
