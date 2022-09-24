package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6588l implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27272a;

    public /* synthetic */ C6588l(AnalyticsListener.EventTime eventTime) {
        this.f27272a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysRestored(this.f27272a);
    }
}
