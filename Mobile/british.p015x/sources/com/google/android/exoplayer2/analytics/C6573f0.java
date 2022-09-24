package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6573f0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27238a;

    /* renamed from: b */
    public final /* synthetic */ MediaLoadData f27239b;

    public /* synthetic */ C6573f0(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        this.f27238a = eventTime;
        this.f27239b = mediaLoadData;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDownstreamFormatChanged(this.f27238a, this.f27239b);
    }
}
