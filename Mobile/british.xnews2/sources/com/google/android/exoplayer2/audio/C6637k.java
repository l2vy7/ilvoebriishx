package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6637k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27358b;

    /* renamed from: c */
    public final /* synthetic */ String f27359c;

    public /* synthetic */ C6637k(AudioRendererEventListener.EventDispatcher eventDispatcher, String str) {
        this.f27358b = eventDispatcher;
        this.f27359c = str;
    }

    public final void run() {
        this.f27358b.lambda$decoderReleased$5(this.f27359c);
    }
}
