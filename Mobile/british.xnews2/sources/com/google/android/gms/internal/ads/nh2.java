package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nh2 implements yi2<Bundle> {

    /* renamed from: a */
    private final Bundle f36017a;

    public nh2(Bundle bundle) {
        this.f36017a = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f36017a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
