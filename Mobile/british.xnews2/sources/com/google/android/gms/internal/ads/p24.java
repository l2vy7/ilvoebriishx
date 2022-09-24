package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class p24 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaCodec f37302b;

    public /* synthetic */ p24(MediaCodec mediaCodec) {
        this.f37302b = mediaCodec;
    }

    public final void run() {
        this.f37302b.start();
    }
}
