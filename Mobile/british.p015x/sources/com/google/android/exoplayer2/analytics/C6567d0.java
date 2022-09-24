package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.analytics.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6567d0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27223a;

    /* renamed from: b */
    public final /* synthetic */ LoadEventInfo f27224b;

    /* renamed from: c */
    public final /* synthetic */ MediaLoadData f27225c;

    /* renamed from: d */
    public final /* synthetic */ IOException f27226d;

    /* renamed from: e */
    public final /* synthetic */ boolean f27227e;

    public /* synthetic */ C6567d0(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f27223a = eventTime;
        this.f27224b = loadEventInfo;
        this.f27225c = mediaLoadData;
        this.f27226d = iOException;
        this.f27227e = z;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError(this.f27223a, this.f27224b, this.f27225c, this.f27226d, this.f27227e);
    }
}
