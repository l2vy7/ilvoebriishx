package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6566d implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27221a;

    /* renamed from: b */
    public final /* synthetic */ int f27222b;

    public /* synthetic */ C6566d(AnalyticsListener.EventTime eventTime, int i) {
        this.f27221a = eventTime;
        this.f27222b = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onTimelineChanged(this.f27221a, this.f27222b);
    }
}
