package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;

/* renamed from: com.google.android.exoplayer2.source.rtsp.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6890d implements RtpDataLoadable.EventListener {

    /* renamed from: a */
    public final /* synthetic */ RtspMediaPeriod.RtpLoadInfo f27583a;

    public /* synthetic */ C6890d(RtspMediaPeriod.RtpLoadInfo rtpLoadInfo) {
        this.f27583a = rtpLoadInfo;
    }

    public final void onTransportReady(String str, RtpDataChannel rtpDataChannel) {
        this.f27583a.lambda$new$0(str, rtpDataChannel);
    }
}
