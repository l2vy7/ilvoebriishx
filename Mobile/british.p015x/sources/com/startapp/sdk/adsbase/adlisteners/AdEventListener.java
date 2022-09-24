package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.C5041Ad;

/* compiled from: Sta */
public interface AdEventListener {
    void onFailedToReceiveAd(C5041Ad ad);

    void onReceiveAd(C5041Ad ad);
}
