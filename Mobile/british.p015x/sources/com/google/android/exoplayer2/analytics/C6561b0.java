package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6561b0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27211a;

    /* renamed from: b */
    public final /* synthetic */ LoadEventInfo f27212b;

    /* renamed from: c */
    public final /* synthetic */ MediaLoadData f27213c;

    public /* synthetic */ C6561b0(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27211a = eventTime;
        this.f27212b = loadEventInfo;
        this.f27213c = mediaLoadData;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadStarted(this.f27211a, this.f27212b, this.f27213c);
    }
}
