package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6560b implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27209a;

    /* renamed from: b */
    public final /* synthetic */ int f27210b;

    public /* synthetic */ C6560b(AnalyticsListener.EventTime eventTime, int i) {
        this.f27209a = eventTime;
        this.f27210b = i;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onDrmSessionAcquired$53(this.f27209a, this.f27210b, (AnalyticsListener) obj);
    }
}
