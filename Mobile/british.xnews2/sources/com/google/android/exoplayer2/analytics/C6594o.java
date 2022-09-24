package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6594o implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27285a;

    /* renamed from: b */
    public final /* synthetic */ Format f27286b;

    /* renamed from: c */
    public final /* synthetic */ DecoderReuseEvaluation f27287c;

    public /* synthetic */ C6594o(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.f27285a = eventTime;
        this.f27286b = format;
        this.f27287c = decoderReuseEvaluation;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onAudioInputFormatChanged$7(this.f27285a, this.f27286b, this.f27287c, (AnalyticsListener) obj);
    }
}
