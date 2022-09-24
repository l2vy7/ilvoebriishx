package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6635i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27354b;

    /* renamed from: c */
    public final /* synthetic */ Exception f27355c;

    public /* synthetic */ C6635i(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc) {
        this.f27354b = eventDispatcher;
        this.f27355c = exc;
    }

    public final void run() {
        this.f27354b.lambda$audioCodecError$9(this.f27355c);
    }
}
