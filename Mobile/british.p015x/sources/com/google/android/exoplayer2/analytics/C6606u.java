package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6606u implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27315a;

    /* renamed from: b */
    public final /* synthetic */ DecoderCounters f27316b;

    public /* synthetic */ C6606u(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f27315a = eventTime;
        this.f27316b = decoderCounters;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onVideoEnabled$18(this.f27315a, this.f27316b, (AnalyticsListener) obj);
    }
}
