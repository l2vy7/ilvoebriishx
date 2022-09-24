package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public class AbstractAdListener implements InterstitialAdExtendedListener, RewardedVideoAdExtendedListener, RewardedInterstitialAdExtendedListener {
    public void onAdClicked(C3371Ad ad) {
    }

    public void onAdLoaded(C3371Ad ad) {
    }

    public void onError(C3371Ad ad, AdError adError) {
    }

    public void onInterstitialActivityDestroyed() {
    }

    public void onInterstitialDismissed(C3371Ad ad) {
    }

    public void onInterstitialDisplayed(C3371Ad ad) {
    }

    public void onLoggingImpression(C3371Ad ad) {
    }

    public void onRewardedAdCompleted() {
    }

    public void onRewardedAdServerFailed() {
    }

    public void onRewardedAdServerSucceeded() {
    }

    public void onRewardedInterstitialActivityDestroyed() {
    }

    public void onRewardedInterstitialClosed() {
    }

    public void onRewardedInterstitialCompleted() {
    }

    public void onRewardedVideoActivityDestroyed() {
    }

    public void onRewardedVideoClosed() {
    }

    public void onRewardedVideoCompleted() {
    }
}
