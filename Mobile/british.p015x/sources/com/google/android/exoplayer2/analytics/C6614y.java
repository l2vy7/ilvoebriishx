package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6614y implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27330a;

    /* renamed from: b */
    public final /* synthetic */ DecoderCounters f27331b;

    public /* synthetic */ C6614y(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f27330a = eventTime;
        this.f27331b = decoderCounters;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onVideoDisabled$23(this.f27330a, this.f27331b, (AnalyticsListener) obj);
    }
}
