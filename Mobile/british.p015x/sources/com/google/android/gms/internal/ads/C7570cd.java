package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.cd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7570cd extends C7827jd {

    /* renamed from: i */
    private final C7715gc f30337i;

    /* renamed from: j */
    private long f30338j;

    public C7570cd(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, C7715gc gcVar) {
        super(zbVar, "e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", d8Var, i, 53);
        this.f30337i = gcVar;
        if (gcVar != null) {
            this.f30338j = gcVar.mo32051a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (this.f30337i != null) {
            this.f33848e.mo31147P(((Long) this.f33849f.invoke((Object) null, new Object[]{Long.valueOf(this.f30338j)})).longValue());
        }
    }
}
