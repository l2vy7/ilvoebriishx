package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7026g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27693b;

    /* renamed from: c */
    public final /* synthetic */ DecoderCounters f27694c;

    public /* synthetic */ C7026g(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f27693b = eventDispatcher;
        this.f27694c = decoderCounters;
    }

    public final void run() {
        this.f27693b.lambda$enabled$0(this.f27694c);
    }
}
