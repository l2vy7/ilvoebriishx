package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6636j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27356b;

    /* renamed from: c */
    public final /* synthetic */ Exception f27357c;

    public /* synthetic */ C6636j(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc) {
        this.f27356b = eventDispatcher;
        this.f27357c = exc;
    }

    public final void run() {
        this.f27356b.lambda$audioSinkError$8(this.f27357c);
    }
}
