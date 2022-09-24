package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.C12006k3;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class ReturnAd extends VideoEnabledAd {
    private static final long serialVersionUID = 1;

    public ReturnAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_RETURN);
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C12006k3(this.f22229a, this, adPreferences, adEventListener).mo46157c();
    }

    /* renamed from: e */
    public long mo20845e() {
        return CacheMetaData.f22345a.mo21039a().mo21030e();
    }
}
