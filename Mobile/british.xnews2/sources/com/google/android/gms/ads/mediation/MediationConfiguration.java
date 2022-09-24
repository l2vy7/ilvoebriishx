package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediationConfiguration {

    /* renamed from: a */
    private final AdFormat f28002a;

    /* renamed from: b */
    private final Bundle f28003b;

    public MediationConfiguration(@RecentlyNonNull AdFormat adFormat, @RecentlyNonNull Bundle bundle) {
        this.f28002a = adFormat;
        this.f28003b = bundle;
    }

    @RecentlyNonNull
    public AdFormat getFormat() {
        return this.f28002a;
    }

    @RecentlyNonNull
    public Bundle getServerParameters() {
        return this.f28003b;
    }
}
