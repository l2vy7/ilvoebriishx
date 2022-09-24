package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jg0 extends l50 {

    /* renamed from: b */
    private final NativeAd.UnconfirmedClickListener f33877b;

    public jg0(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f33877b = unconfirmedClickListener;
    }

    /* renamed from: c */
    public final void mo30621c(String str) {
        this.f33877b.onUnconfirmedClickReceived(str);
    }

    public final void zze() {
        this.f33877b.onUnconfirmedClickCancelled();
    }
}
