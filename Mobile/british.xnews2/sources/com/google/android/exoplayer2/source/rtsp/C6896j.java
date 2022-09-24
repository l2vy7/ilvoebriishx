package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.rtsp.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6896j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtspMessageChannel.Sender f27593b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f27594c;

    /* renamed from: d */
    public final /* synthetic */ List f27595d;

    public /* synthetic */ C6896j(RtspMessageChannel.Sender sender, byte[] bArr, List list) {
        this.f27593b = sender;
        this.f27594c = bArr;
        this.f27595d = list;
    }

    public final void run() {
        this.f27593b.lambda$send$1(this.f27594c, this.f27595d);
    }
}
