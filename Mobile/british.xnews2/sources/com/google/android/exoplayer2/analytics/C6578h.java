package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6578h implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27250a;

    /* renamed from: b */
    public final /* synthetic */ int f27251b;

    /* renamed from: c */
    public final /* synthetic */ long f27252c;

    /* renamed from: d */
    public final /* synthetic */ long f27253d;

    public /* synthetic */ C6578h(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.f27250a = eventTime;
        this.f27251b = i;
        this.f27252c = j;
        this.f27253d = j2;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onBandwidthEstimate(this.f27250a, this.f27251b, this.f27252c, this.f27253d);
    }
}
