package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* renamed from: com.google.android.exoplayer2.source.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6870l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27568b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27569c;

    /* renamed from: d */
    public final /* synthetic */ MediaSource.MediaPeriodId f27570d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f27571e;

    public /* synthetic */ C6870l(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        this.f27568b = eventDispatcher;
        this.f27569c = mediaSourceEventListener;
        this.f27570d = mediaPeriodId;
        this.f27571e = mediaLoadData;
    }

    public final void run() {
        this.f27568b.lambda$upstreamDiscarded$4(this.f27569c, this.f27570d, this.f27571e);
    }
}
