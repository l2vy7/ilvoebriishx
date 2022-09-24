package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;

/* renamed from: com.google.android.exoplayer2.audio.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6634h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27352b;

    /* renamed from: c */
    public final /* synthetic */ DecoderCounters f27353c;

    public /* synthetic */ C6634h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f27352b = eventDispatcher;
        this.f27353c = decoderCounters;
    }

    public final void run() {
        this.f27352b.lambda$enabled$0(this.f27353c);
    }
}
