package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

public interface AdapterAdInteractionListener extends AdapterAdListener {
    /* synthetic */ void onAdClicked();

    void onAdClosed();

    void onAdEnded();

    /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    /* synthetic */ void onAdLoadSuccess();

    void onAdOpened();

    void onAdShowFailed(int i, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}
