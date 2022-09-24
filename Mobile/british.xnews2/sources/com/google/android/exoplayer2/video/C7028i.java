package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* renamed from: com.google.android.exoplayer2.video.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7028i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f27697b;

    /* renamed from: c */
    public final /* synthetic */ Exception f27698c;

    public /* synthetic */ C7028i(VideoRendererEventListener.EventDispatcher eventDispatcher, Exception exc) {
        this.f27697b = eventDispatcher;
        this.f27698c = exc;
    }

    public final void run() {
        this.f27697b.lambda$videoCodecError$9(this.f27698c);
    }
}
