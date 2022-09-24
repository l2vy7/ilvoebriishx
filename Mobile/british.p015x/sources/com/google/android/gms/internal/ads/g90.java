package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class g90 implements InitializationStatus {

    /* renamed from: a */
    private final Map<String, AdapterStatus> f32189a;

    public g90(Map<String, AdapterStatus> map) {
        this.f32189a = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.f32189a;
    }
}
