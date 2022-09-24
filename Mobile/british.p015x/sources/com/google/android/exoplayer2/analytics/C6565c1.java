package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.c1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6565c1 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27220a;

    public /* synthetic */ C6565c1(AnalyticsListener.EventTime eventTime) {
        this.f27220a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysRemoved(this.f27220a);
    }
}
