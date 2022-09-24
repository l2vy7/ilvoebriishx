package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.v0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6609v0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27321a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27322b;

    public /* synthetic */ C6609v0(AnalyticsListener.EventTime eventTime, boolean z) {
        this.f27321a = eventTime;
        this.f27322b = z;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onIsPlayingChanged(this.f27321a, this.f27322b);
    }
}
