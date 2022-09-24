package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7023d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27685b;

    /* renamed from: c */
    public final /* synthetic */ long f27686c;

    /* renamed from: d */
    public final /* synthetic */ int f27687d;

    public /* synthetic */ C7023d(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f27685b = eventDispatcher;
        this.f27686c = j;
        this.f27687d = i;
    }

    public final void run() {
        this.f27685b.lambda$reportVideoFrameProcessingOffset$4(this.f27686c, this.f27687d);
    }
}
