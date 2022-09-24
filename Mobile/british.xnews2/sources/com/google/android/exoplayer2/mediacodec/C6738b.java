package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;

/* renamed from: com.google.android.exoplayer2.mediacodec.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6738b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaCodec f27454b;

    public /* synthetic */ C6738b(MediaCodec mediaCodec) {
        this.f27454b = mediaCodec;
    }

    public final void run() {
        this.f27454b.start();
    }
}
