package com.google.ads.mediation;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C4553e;
import com.google.ads.mediation.C4556f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C4556f, SERVER_PARAMETERS extends C4553e> extends C4548b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    /* synthetic */ void destroy();

    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(@RecentlyNonNull C4552d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C4547a aVar, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
