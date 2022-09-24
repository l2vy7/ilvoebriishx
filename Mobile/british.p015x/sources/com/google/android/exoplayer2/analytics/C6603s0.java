package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.s0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6603s0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27310a;

    public /* synthetic */ C6603s0(AnalyticsListener.EventTime eventTime) {
        this.f27310a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmSessionReleased(this.f27310a);
    }
}
