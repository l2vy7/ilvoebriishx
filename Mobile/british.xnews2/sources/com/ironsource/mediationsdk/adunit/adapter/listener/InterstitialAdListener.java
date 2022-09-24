package com.ironsource.mediationsdk.adunit.adapter.listener;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface InterstitialAdListener extends AdapterAdInteractionListener {
    /* synthetic */ void onAdClicked();

    /* synthetic */ void onAdClosed();

    /* synthetic */ void onAdEnded();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    /* synthetic */ void onAdLoadSuccess();

    /* synthetic */ void onAdOpened();

    /* synthetic */ void onAdShowFailed(int i, String str);

    /* synthetic */ void onAdShowSuccess();

    /* synthetic */ void onAdStarted();

    /* synthetic */ void onAdVisible();
}
