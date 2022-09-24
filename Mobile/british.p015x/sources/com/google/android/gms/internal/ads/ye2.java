package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ye2 implements yi2<Bundle> {

    /* renamed from: a */
    public final double f41799a;

    /* renamed from: b */
    public final boolean f41800b;

    public ye2(double d, boolean z) {
        this.f41799a = d;
        this.f41800b = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = ms2.m34887a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = ms2.m34887a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f41800b);
        a2.putDouble("battery_level", this.f41799a);
    }
}
