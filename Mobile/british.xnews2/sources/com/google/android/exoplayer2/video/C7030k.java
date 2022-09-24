package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7030k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27702b;

    /* renamed from: c */
    public final /* synthetic */ String f27703c;

    public /* synthetic */ C7030k(VideoRendererEventListener.EventDispatcher eventDispatcher, String str) {
        this.f27702b = eventDispatcher;
        this.f27703c = str;
    }

    public final void run() {
        this.f27702b.lambda$decoderReleased$7(this.f27703c);
    }
}
