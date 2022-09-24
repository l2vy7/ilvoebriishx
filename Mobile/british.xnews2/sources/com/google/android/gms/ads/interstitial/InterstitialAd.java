package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.s90;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class InterstitialAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @RecentlyNonNull InterstitialAdLoadCallback interstitialAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adRequest, "AdRequest cannot be null.");
        C4604n.m20099l(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        new s90(context, str).mo18828a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    @RecentlyNullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @RecentlyNullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(@RecentlyNonNull Activity activity);
}
