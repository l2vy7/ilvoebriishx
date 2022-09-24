package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.h3 */
/* compiled from: Sta */
public class C11935h3 extends C12154r0 {
    public C11935h3(Context context, OfferWallAd offerWallAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWallAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, true);
    }

    /* renamed from: a */
    public void mo45316a(boolean z) {
        super.mo45316a(z);
        mo45703c(z);
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        GetAdRequest d = super.mo45237d();
        if (d == null) {
            return null;
        }
        d.f54619p0 = AdsCommonMetaData.f22242h.mo20907t();
        return d;
    }
}
