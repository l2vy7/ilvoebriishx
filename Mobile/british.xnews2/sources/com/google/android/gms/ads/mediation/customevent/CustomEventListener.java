package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(@RecentlyNonNull AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
