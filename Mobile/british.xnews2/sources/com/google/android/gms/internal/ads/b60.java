package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class b60 extends l50 {

    /* renamed from: b */
    private final UnifiedNativeAd.UnconfirmedClickListener f29909b;

    public b60(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f29909b = unconfirmedClickListener;
    }

    /* renamed from: c */
    public final void mo30621c(String str) {
        this.f29909b.onUnconfirmedClickReceived(str);
    }

    public final void zze() {
        this.f29909b.onUnconfirmedClickCancelled();
    }
}
