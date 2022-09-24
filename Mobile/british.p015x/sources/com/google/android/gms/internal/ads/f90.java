package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class f90 implements AdapterStatus {

    /* renamed from: a */
    private final AdapterStatus.State f31673a;

    /* renamed from: b */
    private final String f31674b;

    /* renamed from: c */
    private final int f31675c;

    public f90(AdapterStatus.State state, String str, int i) {
        this.f31673a = state;
        this.f31674b = str;
        this.f31675c = i;
    }

    public final String getDescription() {
        return this.f31674b;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.f31673a;
    }

    public final int getLatency() {
        return this.f31675c;
    }
}
