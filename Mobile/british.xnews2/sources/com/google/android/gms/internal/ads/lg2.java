package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lg2 implements yi2<Bundle> {

    /* renamed from: a */
    private final String f35028a;

    /* renamed from: b */
    private final boolean f35029b;

    /* renamed from: c */
    private final boolean f35030c;

    public lg2(String str, boolean z, boolean z2) {
        this.f35028a = str;
        this.f35029b = z;
        this.f35030c = z2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f35028a.isEmpty()) {
            bundle.putString("inspector_extras", this.f35028a);
        }
        bundle.putInt("test_mode", this.f35029b ? 1 : 0);
        bundle.putInt("linked_device", this.f35030c ? 1 : 0);
    }
}
