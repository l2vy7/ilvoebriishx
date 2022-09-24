package com.google.android.gms.ads.rewarded;

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
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.lk0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class RewardedAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @RecentlyNonNull RewardedAdLoadCallback rewardedAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adRequest, "AdRequest cannot be null.");
        C4604n.m20099l(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        new lk0(context, str).mo18521a(adRequest.zza(), rewardedAdLoadCallback);
    }

    @RecentlyNonNull
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

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @RecentlyNonNull RewardedAdLoadCallback rewardedAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        C4604n.m20099l(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        new lk0(context, str).mo18521a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
