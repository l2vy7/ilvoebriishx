package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* renamed from: com.google.android.exoplayer2.source.ads.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6832f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdsMediaSource.AdPrepareListener f27520b;

    /* renamed from: c */
    public final /* synthetic */ MediaSource.MediaPeriodId f27521c;

    public /* synthetic */ C6832f(AdsMediaSource.AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId) {
        this.f27520b = adPrepareListener;
        this.f27521c = mediaPeriodId;
    }

    public final void run() {
        this.f27520b.lambda$onPrepareComplete$0(this.f27521c);
    }
}
