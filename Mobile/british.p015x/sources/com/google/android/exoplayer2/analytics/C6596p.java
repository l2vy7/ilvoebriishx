package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6596p implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27290a;

    /* renamed from: b */
    public final /* synthetic */ Format f27291b;

    /* renamed from: c */
    public final /* synthetic */ DecoderReuseEvaluation f27292c;

    public /* synthetic */ C6596p(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.f27290a = eventTime;
        this.f27291b = format;
        this.f27292c = decoderReuseEvaluation;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onVideoInputFormatChanged$20(this.f27290a, this.f27291b, this.f27292c, (AnalyticsListener) obj);
    }
}
