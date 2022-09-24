package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.ads.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6834h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdsMediaSource.ComponentListener f27525b;

    /* renamed from: c */
    public final /* synthetic */ AdPlaybackState f27526c;

    public /* synthetic */ C6834h(AdsMediaSource.ComponentListener componentListener, AdPlaybackState adPlaybackState) {
        this.f27525b = componentListener;
        this.f27526c = adPlaybackState;
    }

    public final void run() {
        this.f27525b.lambda$onAdPlaybackState$0(this.f27526c);
    }
}
