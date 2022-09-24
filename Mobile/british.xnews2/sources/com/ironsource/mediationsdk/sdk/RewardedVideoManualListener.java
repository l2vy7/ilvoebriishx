package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

public interface RewardedVideoManualListener extends RewardedVideoListener {
    /* synthetic */ void onRewardedVideoAdClicked(Placement placement);

    /* synthetic */ void onRewardedVideoAdClosed();

    /* synthetic */ void onRewardedVideoAdEnded();

    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError);

    /* synthetic */ void onRewardedVideoAdOpened();

    void onRewardedVideoAdReady();

    /* synthetic */ void onRewardedVideoAdRewarded(Placement placement);

    /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    /* synthetic */ void onRewardedVideoAdStarted();

    /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z);
}
