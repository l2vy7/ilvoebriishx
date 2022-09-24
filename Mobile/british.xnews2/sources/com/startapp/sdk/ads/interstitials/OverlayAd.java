package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.C11978j3;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class OverlayAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public OverlayAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C11978j3(this.f22229a, this, adPreferences, adEventListener).mo46157c();
    }
}
