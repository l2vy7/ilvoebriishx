package com.google.ads.mediation.customevent;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C4547a;
import p137q3.C5941b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventInterstitial {
    /* synthetic */ void destroy();

    void requestInterstitialAd(@RecentlyNonNull C5941b bVar, @RecentlyNonNull Activity activity, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull C4547a aVar, @RecentlyNonNull Object obj);

    void showInterstitial();
}
