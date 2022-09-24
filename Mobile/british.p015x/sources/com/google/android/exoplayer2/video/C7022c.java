package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7022c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27682b;

    /* renamed from: c */
    public final /* synthetic */ int f27683c;

    /* renamed from: d */
    public final /* synthetic */ long f27684d;

    public /* synthetic */ C7022c(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f27682b = eventDispatcher;
        this.f27683c = i;
        this.f27684d = j;
    }

    public final void run() {
        this.f27682b.lambda$droppedFrames$3(this.f27683c, this.f27684d);
    }
}
