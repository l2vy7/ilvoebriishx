package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p195h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class x70 extends z70 {

    /* renamed from: b */
    private final OnH5AdsEventListener f41061b;

    public x70(OnH5AdsEventListener onH5AdsEventListener) {
        this.f41061b = onH5AdsEventListener;
    }

    /* renamed from: a */
    public final void mo30322a(String str) {
        this.f41061b.onH5AdsEvent(str);
    }
}
