package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pg2 implements yi2<Bundle> {

    /* renamed from: a */
    public final Bundle f37634a;

    public pg2(Bundle bundle) {
        this.f37634a = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = ms2.m34887a(bundle, "device");
        a.putBundle("android_mem_info", this.f37634a);
        bundle.putBundle("device", a);
    }
}
