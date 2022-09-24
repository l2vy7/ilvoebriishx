package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C3371Ad ad);

    void onInterstitialDisplayed(C3371Ad ad);
}
