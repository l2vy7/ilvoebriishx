package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6638l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27360b;

    /* renamed from: c */
    public final /* synthetic */ String f27361c;

    /* renamed from: d */
    public final /* synthetic */ long f27362d;

    /* renamed from: e */
    public final /* synthetic */ long f27363e;

    public /* synthetic */ C6638l(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f27360b = eventDispatcher;
        this.f27361c = str;
        this.f27362d = j;
        this.f27363e = j2;
    }

    public final void run() {
        this.f27360b.lambda$decoderInitialized$1(this.f27361c, this.f27362d, this.f27363e);
    }
}
