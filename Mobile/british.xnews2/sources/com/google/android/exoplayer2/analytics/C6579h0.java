package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6579h0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27254a;

    public /* synthetic */ C6579h0(AnalyticsListener.EventTime eventTime) {
        this.f27254a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlayerReleased(this.f27254a);
    }
}
