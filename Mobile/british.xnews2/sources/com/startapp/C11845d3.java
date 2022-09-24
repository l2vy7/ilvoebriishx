package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.d3 */
/* compiled from: Sta */
public class C11845d3 extends C12173s0 {

    /* renamed from: i */
    public int f52727i = 0;

    public C11845d3(Context context, Banner3DAd banner3DAd, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, banner3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.f52727i = i;
    }

    /* renamed from: a */
    public void mo45236a(C5041Ad ad) {
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        C12022l0 l0Var = new C12022l0();
        mo46155a((GetAdRequest) l0Var);
        l0Var.f54619p0 = BannerMetaData.f54159b.mo45773a().mo45777a();
        l0Var.f54628y0 = this.f52727i;
        l0Var.f53239S0 = ((Banner3DAd) this.f54533b).mo45837i();
        l0Var.mo45515f(this.f54532a);
        return l0Var;
    }
}
