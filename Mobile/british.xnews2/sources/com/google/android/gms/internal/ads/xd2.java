package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xd2 implements yi2<Bundle> {

    /* renamed from: a */
    private final Bundle f41145a;

    /* synthetic */ xd2(Bundle bundle, wd2 wd2) {
        this.f41145a = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f41145a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f41145a);
        }
    }
}
