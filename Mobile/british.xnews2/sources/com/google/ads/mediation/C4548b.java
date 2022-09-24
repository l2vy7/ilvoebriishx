package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C4553e;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface C4548b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C4553e> {
    void destroy();

    @RecentlyNonNull
    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    Class<SERVER_PARAMETERS> getServerParametersType();
}
