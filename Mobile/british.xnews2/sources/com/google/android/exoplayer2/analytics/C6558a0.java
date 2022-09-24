package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6558a0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27204a;

    /* renamed from: b */
    public final /* synthetic */ LoadEventInfo f27205b;

    /* renamed from: c */
    public final /* synthetic */ MediaLoadData f27206c;

    public /* synthetic */ C6558a0(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27204a = eventTime;
        this.f27205b = loadEventInfo;
        this.f27206c = mediaLoadData;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadCompleted(this.f27204a, this.f27205b, this.f27206c);
    }
}
