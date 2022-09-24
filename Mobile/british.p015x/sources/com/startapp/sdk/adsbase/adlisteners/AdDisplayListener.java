package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.C5041Ad;

/* compiled from: Sta */
public interface AdDisplayListener {
    void adClicked(C5041Ad ad);

    void adDisplayed(C5041Ad ad);

    void adHidden(C5041Ad ad);

    void adNotDisplayed(C5041Ad ad);
}
