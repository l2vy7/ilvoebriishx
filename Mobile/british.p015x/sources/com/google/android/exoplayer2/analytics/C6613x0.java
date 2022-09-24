package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.x0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6613x0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27328a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27329b;

    public /* synthetic */ C6613x0(AnalyticsListener.EventTime eventTime, boolean z) {
        this.f27328a = eventTime;
        this.f27329b = z;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onShuffleModeChanged(this.f27328a, this.f27329b);
    }
}
