package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.r0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6601r0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27304a;

    /* renamed from: b */
    public final /* synthetic */ String f27305b;

    /* renamed from: c */
    public final /* synthetic */ long f27306c;

    /* renamed from: d */
    public final /* synthetic */ long f27307d;

    public /* synthetic */ C6601r0(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        this.f27304a = eventTime;
        this.f27305b = str;
        this.f27306c = j;
        this.f27307d = j2;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onAudioDecoderInitialized$6(this.f27304a, this.f27305b, this.f27306c, this.f27307d, (AnalyticsListener) obj);
    }
}
