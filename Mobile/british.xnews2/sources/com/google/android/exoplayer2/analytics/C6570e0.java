package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6570e0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27231a;

    /* renamed from: b */
    public final /* synthetic */ MediaLoadData f27232b;

    public /* synthetic */ C6570e0(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        this.f27231a = eventTime;
        this.f27232b = mediaLoadData;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onUpstreamDiscarded(this.f27231a, this.f27232b);
    }
}
