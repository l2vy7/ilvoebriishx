package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6599q0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27298a;

    /* renamed from: b */
    public final /* synthetic */ String f27299b;

    /* renamed from: c */
    public final /* synthetic */ long f27300c;

    /* renamed from: d */
    public final /* synthetic */ long f27301d;

    public /* synthetic */ C6599q0(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        this.f27298a = eventTime;
        this.f27299b = str;
        this.f27300c = j;
        this.f27301d = j2;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onVideoDecoderInitialized$19(this.f27298a, this.f27299b, this.f27300c, this.f27301d, (AnalyticsListener) obj);
    }
}
