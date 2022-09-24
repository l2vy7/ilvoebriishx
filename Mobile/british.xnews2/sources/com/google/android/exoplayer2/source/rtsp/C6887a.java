package com.google.android.exoplayer2.source.rtsp;

/* renamed from: com.google.android.exoplayer2.source.rtsp.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6887a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtpDataLoadable f27578b;

    /* renamed from: c */
    public final /* synthetic */ String f27579c;

    /* renamed from: d */
    public final /* synthetic */ RtpDataChannel f27580d;

    public /* synthetic */ C6887a(RtpDataLoadable rtpDataLoadable, String str, RtpDataChannel rtpDataChannel) {
        this.f27578b = rtpDataLoadable;
        this.f27579c = str;
        this.f27580d = rtpDataChannel;
    }

    public final void run() {
        this.f27578b.lambda$load$0(this.f27579c, this.f27580d);
    }
}
