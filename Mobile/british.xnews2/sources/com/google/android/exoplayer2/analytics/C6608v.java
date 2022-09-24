package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6608v implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27319a;

    /* renamed from: b */
    public final /* synthetic */ DecoderCounters f27320b;

    public /* synthetic */ C6608v(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.f27319a = eventTime;
        this.f27320b = decoderCounters;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onAudioEnabled$5(this.f27319a, this.f27320b, (AnalyticsListener) obj);
    }
}
