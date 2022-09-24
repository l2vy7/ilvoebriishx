package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface AdapterAdRewardListener extends AdapterAdInteractionListener {
    /* synthetic */ void onAdClicked();

    /* synthetic */ void onAdClosed();

    /* synthetic */ void onAdEnded();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    /* synthetic */ void onAdLoadSuccess();

    /* synthetic */ void onAdOpened();

    void onAdRewarded();

    /* synthetic */ void onAdShowFailed(int i, String str);

    /* synthetic */ void onAdShowSuccess();

    /* synthetic */ void onAdStarted();

    /* synthetic */ void onAdVisible();
}
