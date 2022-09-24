package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.vk0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class RewardedInterstitialAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @RecentlyNonNull RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adRequest, "AdRequest cannot be null.");
        C4604n.m20099l(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        new vk0(context, str).mo18899a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    @RecentlyNullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @RecentlyNullable
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @RecentlyNullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(@RecentlyNonNull ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @RecentlyNonNull RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        C4604n.m20099l(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        new vk0(context, str).mo18899a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }
}
