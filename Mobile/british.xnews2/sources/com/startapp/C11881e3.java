package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.e3 */
/* compiled from: Sta */
public class C11881e3 extends C12154r0 {

    /* renamed from: m */
    public int f52883m = 0;

    public C11881e3(Context context, HtmlAd htmlAd, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.f52883m = i;
    }

    /* renamed from: a */
    public void mo45316a(boolean z) {
        super.mo45316a(z);
        mo45703c(z);
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        BannerStandardAd bannerStandardAd = (BannerStandardAd) this.f54533b;
        C12022l0 l0Var = new C12022l0();
        mo46155a((GetAdRequest) l0Var);
        l0Var.f54974L = bannerStandardAd.mo20935p();
        l0Var.f54975M = bannerStandardAd.mo20928i();
        l0Var.f54628y0 = this.f52883m;
        l0Var.f54619p0 = BannerMetaData.f54159b.mo45773a().mo45784f();
        l0Var.f53239S0 = bannerStandardAd.mo45853w();
        l0Var.f53240T0 = bannerStandardAd.mo45851u();
        l0Var.mo45515f(this.f54532a);
        return l0Var;
    }
}
