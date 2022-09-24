package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* renamed from: com.google.android.exoplayer2.source.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6867i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27555b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27556c;

    /* renamed from: d */
    public final /* synthetic */ LoadEventInfo f27557d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f27558e;

    public /* synthetic */ C6867i(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27555b = eventDispatcher;
        this.f27556c = mediaSourceEventListener;
        this.f27557d = loadEventInfo;
        this.f27558e = mediaLoadData;
    }

    public final void run() {
        this.f27555b.lambda$loadCanceled$2(this.f27556c, this.f27557d, this.f27558e);
    }
}
