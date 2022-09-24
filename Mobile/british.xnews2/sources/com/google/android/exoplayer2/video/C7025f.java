package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7025f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27691b;

    /* renamed from: c */
    public final /* synthetic */ DecoderCounters f27692c;

    public /* synthetic */ C7025f(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f27691b = eventDispatcher;
        this.f27692c = decoderCounters;
    }

    public final void run() {
        this.f27691b.lambda$disabled$8(this.f27692c);
    }
}
