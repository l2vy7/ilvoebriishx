package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C4553e;
import com.google.ads.mediation.C4556f;
import p130p3.C5904c;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C4556f, SERVER_PARAMETERS extends C4553e> extends C4548b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    /* synthetic */ void destroy();

    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    View getBannerView();

    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(@RecentlyNonNull C4549c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C5904c cVar2, @RecentlyNonNull C4547a aVar, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);
}
