package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.common.collect.C4766t;

/* renamed from: com.google.android.exoplayer2.source.rtsp.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6892f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtspMessageChannel.Receiver f27584b;

    /* renamed from: c */
    public final /* synthetic */ C4766t f27585c;

    public /* synthetic */ C6892f(RtspMessageChannel.Receiver receiver, C4766t tVar) {
        this.f27584b = receiver;
        this.f27585c = tVar;
    }

    public final void run() {
        this.f27584b.lambda$handleRtspMessage$0(this.f27585c);
    }
}
