package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.ads.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6830d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdsMediaSource f27516b;

    /* renamed from: c */
    public final /* synthetic */ AdsMediaSource.ComponentListener f27517c;

    public /* synthetic */ C6830d(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener) {
        this.f27516b = adsMediaSource;
        this.f27517c = componentListener;
    }

    public final void run() {
        this.f27516b.lambda$prepareSourceInternal$0(this.f27517c);
    }
}
