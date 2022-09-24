package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.ads.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6833g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdsMediaSource.AdPrepareListener f27522b;

    /* renamed from: c */
    public final /* synthetic */ MediaSource.MediaPeriodId f27523c;

    /* renamed from: d */
    public final /* synthetic */ IOException f27524d;

    public /* synthetic */ C6833g(AdsMediaSource.AdPrepareListener adPrepareListener, MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        this.f27522b = adPrepareListener;
        this.f27523c = mediaPeriodId;
        this.f27524d = iOException;
    }

    public final void run() {
        this.f27522b.lambda$onPrepareError$1(this.f27523c, this.f27524d);
    }
}
