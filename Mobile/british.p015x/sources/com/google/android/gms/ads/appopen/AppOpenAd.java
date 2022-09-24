package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C7912lp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface AppOpenAdOrientation {
    }

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @AppOpenAdOrientation int i, @RecentlyNonNull AppOpenAdLoadCallback appOpenAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "adUnitId cannot be null.");
        C4604n.m20099l(adRequest, "AdRequest cannot be null.");
        new C7912lp(context, str, adRequest.zza(), i, appOpenAdLoadCallback).mo33369a();
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

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation int i, @RecentlyNonNull AppOpenAdLoadCallback appOpenAdLoadCallback) {
        C4604n.m20099l(context, "Context cannot be null.");
        C4604n.m20099l(str, "adUnitId cannot be null.");
        C4604n.m20099l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        new C7912lp(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).mo33369a();
    }
}
