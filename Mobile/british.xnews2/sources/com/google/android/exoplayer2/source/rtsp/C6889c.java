package com.google.android.exoplayer2.source.rtsp;

/* renamed from: com.google.android.exoplayer2.source.rtsp.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6889c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RtspMediaPeriod f27582b;

    public /* synthetic */ C6889c(RtspMediaPeriod rtspMediaPeriod) {
        this.f27582b = rtspMediaPeriod;
    }

    public final void run() {
        this.f27582b.maybeFinishPrepare();
    }
}
