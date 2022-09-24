package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* renamed from: com.google.android.exoplayer2.source.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6869k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27565b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27566c;

    /* renamed from: d */
    public final /* synthetic */ MediaLoadData f27567d;

    public /* synthetic */ C6869k(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
        this.f27565b = eventDispatcher;
        this.f27566c = mediaSourceEventListener;
        this.f27567d = mediaLoadData;
    }

    public final void run() {
        this.f27565b.lambda$downstreamFormatChanged$5(this.f27566c, this.f27567d);
    }
}
