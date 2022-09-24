package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* renamed from: com.google.android.exoplayer2.source.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6852h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27543b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27544c;

    /* renamed from: d */
    public final /* synthetic */ LoadEventInfo f27545d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f27546e;

    public /* synthetic */ C6852h(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27543b = eventDispatcher;
        this.f27544c = mediaSourceEventListener;
        this.f27545d = loadEventInfo;
        this.f27546e = mediaLoadData;
    }

    public final void run() {
        this.f27543b.lambda$loadStarted$0(this.f27544c, this.f27545d, this.f27546e);
    }
}
