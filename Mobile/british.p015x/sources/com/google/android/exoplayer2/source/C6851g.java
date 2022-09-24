package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* renamed from: com.google.android.exoplayer2.source.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6851g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27539b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener f27540c;

    /* renamed from: d */
    public final /* synthetic */ LoadEventInfo f27541d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f27542e;

    public /* synthetic */ C6851g(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27539b = eventDispatcher;
        this.f27540c = mediaSourceEventListener;
        this.f27541d = loadEventInfo;
        this.f27542e = mediaLoadData;
    }

    public final void run() {
        this.f27539b.lambda$loadCompleted$1(this.f27540c, this.f27541d, this.f27542e);
    }
}
