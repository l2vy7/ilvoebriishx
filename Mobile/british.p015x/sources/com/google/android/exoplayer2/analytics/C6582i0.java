package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;

/* renamed from: com.google.android.exoplayer2.analytics.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6582i0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27259a;

    /* renamed from: b */
    public final /* synthetic */ VideoSize f27260b;

    public /* synthetic */ C6582i0(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.f27259a = eventTime;
        this.f27260b = videoSize;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onVideoSizeChanged$24(this.f27259a, this.f27260b, (AnalyticsListener) obj);
    }
}
