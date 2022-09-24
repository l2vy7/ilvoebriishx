package com.google.android.gms.ads.admanager;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.s90;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @RecentlyNonNull AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "AdUnitId cannot be null.");
        C4604n.m20099l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        C4604n.m20099l(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        new s90(context, str).mo18828a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    @RecentlyNullable
    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
