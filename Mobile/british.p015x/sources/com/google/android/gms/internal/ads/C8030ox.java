package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* renamed from: com.google.android.gms.internal.ads.ox */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8030ox extends C7958mx {

    /* renamed from: b */
    private final MuteThisAdListener f36616b;

    public C8030ox(MuteThisAdListener muteThisAdListener) {
        this.f36616b = muteThisAdListener;
    }

    public final void zze() {
        this.f36616b.onAdMuted();
    }
}
