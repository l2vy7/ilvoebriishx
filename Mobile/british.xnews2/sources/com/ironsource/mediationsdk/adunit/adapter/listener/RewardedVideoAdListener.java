package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface RewardedVideoAdListener extends AdapterAdRewardListener {
    /* synthetic */ void onAdClicked();

    /* synthetic */ void onAdClosed();

    /* synthetic */ void onAdEnded();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    /* synthetic */ void onAdLoadSuccess();

    /* synthetic */ void onAdOpened();

    /* synthetic */ void onAdRewarded();

    /* synthetic */ void onAdShowFailed(int i, String str);

    /* synthetic */ void onAdShowSuccess();

    /* synthetic */ void onAdStarted();

    /* synthetic */ void onAdVisible();
}
