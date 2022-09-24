package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7029j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27699b;

    /* renamed from: c */
    public final /* synthetic */ Object f27700c;

    /* renamed from: d */
    public final /* synthetic */ long f27701d;

    public /* synthetic */ C7029j(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, long j) {
        this.f27699b = eventDispatcher;
        this.f27700c = obj;
        this.f27701d = j;
    }

    public final void run() {
        this.f27699b.lambda$renderedFirstFrame$6(this.f27700c, this.f27701d);
    }
}
