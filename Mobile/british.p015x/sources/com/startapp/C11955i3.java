package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.i3 */
/* compiled from: Sta */
public class C11955i3 extends C12173s0 {
    public C11955i3(Context context, OfferWall3DAd offerWall3DAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWall3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    /* renamed from: a */
    public void mo45236a(C5041Ad ad) {
        OfferWall3DAd offerWall3DAd = (OfferWall3DAd) ad;
        List<AdDetails> g = offerWall3DAd.mo46103g();
        C12178s5 a = C12342t5.f54758b.mo46637a(offerWall3DAd.mo45939h());
        a.getClass();
        a.f54141b = new ArrayList();
        a.f54142c = "";
        if (g != null) {
            for (AdDetails a2 : g) {
                a.mo45747a(a2);
            }
        }
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
