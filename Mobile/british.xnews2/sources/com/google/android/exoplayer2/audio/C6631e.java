package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6631e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27345b;

    /* renamed from: c */
    public final /* synthetic */ long f27346c;

    public /* synthetic */ C6631e(AudioRendererEventListener.EventDispatcher eventDispatcher, long j) {
        this.f27345b = eventDispatcher;
        this.f27346c = j;
    }

    public final void run() {
        this.f27345b.lambda$positionAdvancing$3(this.f27346c);
    }
}
