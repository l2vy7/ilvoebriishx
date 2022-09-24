package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hl */
/* compiled from: IMASDK */
public final class C4046hl extends C4068ig {

    /* renamed from: h */
    private static volatile Long f17392h;

    /* renamed from: i */
    private static final Object f17393i = new Object();

    public C4046hl(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "2jgw5zKbHso9qSu2FHWgkwMGYpWraOZgKzMlINCc6R3raSWmpy2CL0CBKMif8Xd3", "xwe9uWAuGPfe//9yVRExw0dL2o3Hs2ICdfgY11WBl0c=", kVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        if (f17392h == null) {
            synchronized (f17393i) {
                if (f17392h == null) {
                    f17392h = (Long) this.f17424e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17423d) {
            this.f17423d.mo16076k(f17392h.longValue());
        }
    }
}
