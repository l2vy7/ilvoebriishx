package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.vc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8259vc extends C7827jd {

    /* renamed from: i */
    private static volatile String f40381i;

    /* renamed from: j */
    private static final Object f40382j = new Object();

    public C8259vc(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2) {
        super(zbVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", d8Var, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        this.f33848e.mo31136C0("E");
        if (f40381i == null) {
            synchronized (f40382j) {
                if (f40381i == null) {
                    f40381i = (String) this.f33849f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f33848e) {
            this.f33848e.mo31136C0(f40381i);
        }
    }
}
