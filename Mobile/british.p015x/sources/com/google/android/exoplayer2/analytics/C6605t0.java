package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.analytics.t0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6605t0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27313a;

    /* renamed from: b */
    public final /* synthetic */ List f27314b;

    public /* synthetic */ C6605t0(AnalyticsListener.EventTime eventTime, List list) {
        this.f27313a = eventTime;
        this.f27314b = list;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onStaticMetadataChanged(this.f27313a, this.f27314b);
    }
}
