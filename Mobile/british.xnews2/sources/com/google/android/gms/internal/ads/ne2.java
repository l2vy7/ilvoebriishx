package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ne2 implements yi2<Bundle> {

    /* renamed from: a */
    private final String f35994a;

    /* renamed from: b */
    private final int f35995b;

    public ne2(String str, int i) {
        this.f35994a = str;
        this.f35995b = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f35994a) && this.f35995b != -1) {
            Bundle a = ms2.m34887a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", this.f35994a);
            a.putInt("pvid_s", this.f35995b);
        }
    }
}
