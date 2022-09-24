package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.ads.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6831e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdsMediaSource f27518b;

    /* renamed from: c */
    public final /* synthetic */ AdsMediaSource.ComponentListener f27519c;

    public /* synthetic */ C6831e(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener) {
        this.f27518b = adsMediaSource;
        this.f27519c = componentListener;
    }

    public final void run() {
        this.f27518b.lambda$releaseSourceInternal$1(this.f27519c);
    }
}
