package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7031l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27704b;

    /* renamed from: c */
    public final /* synthetic */ String f27705c;

    /* renamed from: d */
    public final /* synthetic */ long f27706d;

    /* renamed from: e */
    public final /* synthetic */ long f27707e;

    public /* synthetic */ C7031l(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f27704b = eventDispatcher;
        this.f27705c = str;
        this.f27706d = j;
        this.f27707e = j2;
    }

    public final void run() {
        this.f27704b.lambda$decoderInitialized$1(this.f27705c, this.f27706d, this.f27707e);
    }
}
