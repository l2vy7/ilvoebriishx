package com.ironsource.adapters.facebook;

import com.facebook.ads.AdError;
import com.facebook.ads.C3371Ad;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;

public class FacebookRewardedVideoAdListener implements RewardedVideoAdExtendedListener {
    private WeakReference<FacebookAdapter> mAdapter;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    FacebookRewardedVideoAdListener(FacebookAdapter facebookAdapter, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mAdapter = new WeakReference<>(facebookAdapter);
        this.mPlacementId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    public void onAdClicked(C3371Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    public void onAdLoaded(C3371Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(true);
        ((FacebookAdapter) this.mAdapter.get()).mRvAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
    }

    public void onError(C3371Ad ad, AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.error("mPlacementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        ((FacebookAdapter) this.mAdapter.get()).mRvAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
        try {
            IronSourceError ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Empty error string");
            if (adError != null) {
                IronSourceError ironSourceError2 = new IronSourceError(adError.getErrorCode() == 1001 ? IronSourceError.ERROR_RV_LOAD_NO_FILL : adError.getErrorCode(), adError.getErrorMessage());
                ironLog.error("error = " + ironSourceError2.getErrorCode() + ", " + ironSourceError2.getErrorMessage());
                ironSourceError = ironSourceError2;
            }
            if (((FacebookAdapter) this.mAdapter.get()).mRewardedVideoPlacementIdShowCalled.get(this.mPlacementId).booleanValue()) {
                ironLog.error("onRewardedVideoAdShowFailed");
                this.mListener.onRewardedVideoAdShowFailed(ironSourceError);
                return;
            }
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            this.mListener.onRewardedVideoLoadFailed(ironSourceError);
        } catch (Throwable unused) {
        }
    }

    public void onLoggingImpression(C3371Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        ((FacebookAdapter) this.mAdapter.get()).mDidCallClosed = false;
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }

    public void onRewardedVideoActivityDestroyed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else if (!((FacebookAdapter) this.mAdapter.get()).mDidCallClosed) {
            this.mListener.onRewardedVideoAdClosed();
        }
    }

    public void onRewardedVideoClosed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        ((FacebookAdapter) this.mAdapter.get()).mDidCallClosed = true;
        this.mListener.onRewardedVideoAdClosed();
    }

    public void onRewardedVideoCompleted() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("mPlacementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdRewarded();
    }
}
