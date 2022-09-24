package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6612x implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27326a;

    /* renamed from: b */
    public final /* synthetic */ DecoderCounters f27327b;

    public /* synthetic */ C6612x(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f27326a = eventTime;
        this.f27327b = decoderCounters;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onAudioDisabled$11(this.f27326a, this.f27327b, (AnalyticsListener) obj);
    }
}
