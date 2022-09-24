package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;

/* renamed from: com.google.android.exoplayer2.audio.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6633g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27350b;

    /* renamed from: c */
    public final /* synthetic */ DecoderCounters f27351c;

    public /* synthetic */ C6633g(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f27350b = eventDispatcher;
        this.f27351c = decoderCounters;
    }

    public final void run() {
        this.f27350b.lambda$disabled$6(this.f27351c);
    }
}
