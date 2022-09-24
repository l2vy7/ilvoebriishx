package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6564c0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27217a;

    /* renamed from: b */
    public final /* synthetic */ LoadEventInfo f27218b;

    /* renamed from: c */
    public final /* synthetic */ MediaLoadData f27219c;

    public /* synthetic */ C6564c0(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f27217a = eventTime;
        this.f27218b = loadEventInfo;
        this.f27219c = mediaLoadData;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadCanceled(this.f27217a, this.f27218b, this.f27219c);
    }
}
