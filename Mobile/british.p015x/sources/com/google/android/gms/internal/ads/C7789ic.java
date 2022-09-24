package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ic */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7789ic extends C7827jd {

    /* renamed from: i */
    private final Activity f33199i;

    /* renamed from: j */
    private final View f33200j;

    public C7789ic(C8400zb zbVar, String str, String str2, C7600d8 d8Var, int i, int i2, View view, Activity activity) {
        super(zbVar, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", d8Var, i, 62);
        this.f33200j = view;
        this.f33199i = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30349b() throws IllegalAccessException, InvocationTargetException {
        if (this.f33200j != null) {
            boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36953P1)).booleanValue();
            Object[] objArr = (Object[]) this.f33849f.invoke((Object) null, new Object[]{this.f33200j, this.f33199i, Boolean.valueOf(booleanValue)});
            synchronized (this.f33848e) {
                this.f33848e.mo31165h0(((Long) objArr[0]).longValue());
                this.f33848e.mo31167j0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f33848e.mo31166i0((String) objArr[2]);
                }
            }
        }
    }
}
