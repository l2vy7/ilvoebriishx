package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6610w implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27323a;

    public /* synthetic */ C6610w(AnalyticsListener.EventTime eventTime) {
        this.f27323a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onSeekProcessed(this.f27323a);
    }
}
