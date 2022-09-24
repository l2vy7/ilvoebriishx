package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.C4556f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdMobExtras implements C4556f {

    /* renamed from: a */
    private final Bundle f28025a;

    public AdMobExtras(@RecentlyNonNull Bundle bundle) {
        this.f28025a = bundle != null ? new Bundle(bundle) : null;
    }

    @RecentlyNullable
    public Bundle getExtras() {
        return this.f28025a;
    }
}
