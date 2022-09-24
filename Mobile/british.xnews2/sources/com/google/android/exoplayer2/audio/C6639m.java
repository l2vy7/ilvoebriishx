package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6639m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27364b;

    /* renamed from: c */
    public final /* synthetic */ boolean f27365c;

    public /* synthetic */ C6639m(AudioRendererEventListener.EventDispatcher eventDispatcher, boolean z) {
        this.f27364b = eventDispatcher;
        this.f27365c = z;
    }

    public final void run() {
        this.f27364b.lambda$skipSilenceEnabledChanged$7(this.f27365c);
    }
}
