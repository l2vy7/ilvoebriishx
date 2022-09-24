package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class RtbSignalData {

    /* renamed from: a */
    private final Context f28039a;

    /* renamed from: b */
    private final List<MediationConfiguration> f28040b;

    /* renamed from: c */
    private final Bundle f28041c;

    /* renamed from: d */
    private final AdSize f28042d;

    public RtbSignalData(@RecentlyNonNull Context context, @RecentlyNonNull List<MediationConfiguration> list, @RecentlyNonNull Bundle bundle, AdSize adSize) {
        this.f28039a = context;
        this.f28040b = list;
        this.f28041c = bundle;
        this.f28042d = adSize;
    }

    @RecentlyNullable
    public AdSize getAdSize() {
        return this.f28042d;
    }

    @Deprecated
    @RecentlyNullable
    public MediationConfiguration getConfiguration() {
        List<MediationConfiguration> list = this.f28040b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f28040b.get(0);
    }

    @RecentlyNonNull
    public List<MediationConfiguration> getConfigurations() {
        return this.f28040b;
    }

    @RecentlyNonNull
    public Context getContext() {
        return this.f28039a;
    }

    @RecentlyNonNull
    public Bundle getNetworkExtras() {
        return this.f28041c;
    }
}
