package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.rtsp.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6895i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtspMessageChannel.Sender f27590b;

    /* renamed from: c */
    public final /* synthetic */ List f27591c;

    /* renamed from: d */
    public final /* synthetic */ Exception f27592d;

    public /* synthetic */ C6895i(RtspMessageChannel.Sender sender, List list, Exception exc) {
        this.f27590b = sender;
        this.f27591c = list;
        this.f27592d = exc;
    }

    public final void run() {
        this.f27590b.lambda$send$0(this.f27591c, this.f27592d);
    }
}
