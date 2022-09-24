package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.f1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6574f1 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27240a;

    /* renamed from: b */
    public final /* synthetic */ int f27241b;

    public /* synthetic */ C6574f1(AnalyticsListener.EventTime eventTime, int i) {
        this.f27240a = eventTime;
        this.f27241b = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f27240a, this.f27241b);
    }
}
