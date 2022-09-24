package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7027h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27695b;

    /* renamed from: c */
    public final /* synthetic */ VideoSize f27696c;

    public /* synthetic */ C7027h(VideoRendererEventListener.EventDispatcher eventDispatcher, VideoSize videoSize) {
        this.f27695b = eventDispatcher;
        this.f27696c = videoSize;
    }

    public final void run() {
        this.f27695b.lambda$videoSizeChanged$5(this.f27696c);
    }
}
