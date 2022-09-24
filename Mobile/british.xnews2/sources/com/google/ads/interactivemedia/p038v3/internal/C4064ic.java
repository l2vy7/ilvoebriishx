package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ic */
/* compiled from: IMASDK */
public final class C4064ic extends C4068ig {
    public C4064ic(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "ve98w3uvwL+WbIhcx9tIAXYisv3RoRLLGwxFdq305Znx3OEzhYuRa3SMbNvxvcZ5", "COyKgr9nLwjtPmD4ZyUGB47tHeKQEqJ+6+4+oYNfjv8=", kVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        this.f17423d.mo16060R(C3830ab.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f17424e.invoke((Object) null, new Object[]{this.f17420a.mo15893a()})).booleanValue();
        synchronized (this.f17423d) {
            if (booleanValue) {
                this.f17423d.mo16060R(C3830ab.ENUM_TRUE);
            } else {
                this.f17423d.mo16060R(C3830ab.ENUM_FALSE);
            }
        }
    }
}
