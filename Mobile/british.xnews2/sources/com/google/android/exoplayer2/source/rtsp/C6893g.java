package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;

/* renamed from: com.google.android.exoplayer2.source.rtsp.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6893g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtspMessageChannel.Receiver f27586b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f27587c;

    /* renamed from: d */
    public final /* synthetic */ int f27588d;

    public /* synthetic */ C6893g(RtspMessageChannel.Receiver receiver, byte[] bArr, int i) {
        this.f27586b = receiver;
        this.f27587c = bArr;
        this.f27588d = i;
    }

    public final void run() {
        this.f27586b.lambda$handleInterleavedBinaryData$1(this.f27587c, this.f27588d);
    }
}
