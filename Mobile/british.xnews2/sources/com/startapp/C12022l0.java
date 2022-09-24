package com.startapp;

import android.content.Context;
import com.startapp.C12146q9;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.l0 */
/* compiled from: Sta */
public class C12022l0 extends GetAdRequest {

    /* renamed from: S0 */
    public boolean f53239S0;

    /* renamed from: T0 */
    public int f53240T0;

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        super.mo45384a(g8Var);
        g8Var.mo45382a("fixedSize", (Object) Boolean.valueOf(this.f53239S0), false, true);
        g8Var.mo45382a("bnrt", (Object) Integer.valueOf(this.f53240T0), false, true);
    }

    /* renamed from: f */
    public void mo45515f(Context context) {
        String str;
        C12146q9 s = ComponentLocator.m23305a(context).mo21232s();
        AdPreferences.Placement placement = this.f54611h0;
        int i = this.f53240T0;
        s.getClass();
        if (placement == null) {
            str = null;
        } else {
            str = s.f54069a.get(new C12146q9.C12147a(placement, i));
        }
        this.f54625v0 = str;
    }
}
