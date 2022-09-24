package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

/* renamed from: com.google.android.exoplayer2.audio.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6630d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f27341b;

    /* renamed from: c */
    public final /* synthetic */ int f27342c;

    /* renamed from: d */
    public final /* synthetic */ long f27343d;

    /* renamed from: e */
    public final /* synthetic */ long f27344e;

    public /* synthetic */ C6630d(AudioRendererEventListener.EventDispatcher eventDispatcher, int i, long j, long j2) {
        this.f27341b = eventDispatcher;
        this.f27342c = i;
        this.f27343d = j;
        this.f27344e = j2;
    }

    public final void run() {
        this.f27341b.lambda$underrun$4(this.f27342c, this.f27343d, this.f27344e);
    }
}
