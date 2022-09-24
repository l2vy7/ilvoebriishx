package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.fd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7679fd extends C7827jd {

    /* renamed from: i */
    private final View f31702i;

    public C7679fd(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, View view) {
        super(zbVar, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", d8Var, i, 57);
        this.f31702i = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (this.f31702i != null) {
            Boolean bool = (Boolean) C8311wv.m39277c().mo18570b(p00.f37069d2);
            DisplayMetrics displayMetrics = this.f33845b.mo36029b().getResources().getDisplayMetrics();
            C7604dc dcVar = new C7604dc((String) this.f33849f.invoke((Object) null, new Object[]{this.f31702i, displayMetrics, bool}));
            C8147s8 E = C8182t8.m37713E();
            E.mo34680B(dcVar.f30707b.longValue());
            E.mo34681C(dcVar.f30708c.longValue());
            E.mo34682H(dcVar.f30709d.longValue());
            if (bool.booleanValue()) {
                E.mo34683y(dcVar.f30710e.longValue());
            }
            this.f33848e.mo31155X((C8182t8) E.mo32424p());
        }
    }
}
