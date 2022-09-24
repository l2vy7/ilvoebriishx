package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.g1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6577g1 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27248a;

    /* renamed from: b */
    public final /* synthetic */ int f27249b;

    public /* synthetic */ C6577g1(AnalyticsListener.EventTime eventTime, int i) {
        this.f27248a = eventTime;
        this.f27249b = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlaybackStateChanged(this.f27248a, this.f27249b);
    }
}
