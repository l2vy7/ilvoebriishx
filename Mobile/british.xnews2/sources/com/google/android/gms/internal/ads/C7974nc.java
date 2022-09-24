package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.nc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7974nc extends C7827jd {

    /* renamed from: i */
    private static volatile Long f35971i;

    /* renamed from: j */
    private static final Object f35972j = new Object();

    public C7974nc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", d8Var, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (f35971i == null) {
            synchronized (f35972j) {
                if (f35971i == null) {
                    f35971i = (Long) this.f33849f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f33848e) {
            this.f33848e.mo31175r0(f35971i.longValue());
        }
    }
}
