package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.d1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6568d1 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27228a;

    public /* synthetic */ C6568d1(AnalyticsListener.EventTime eventTime) {
        this.f27228a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onSeekStarted(this.f27228a);
    }
}
