package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6589l0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27273a;

    /* renamed from: b */
    public final /* synthetic */ Exception f27274b;

    public /* synthetic */ C6589l0(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.f27273a = eventTime;
        this.f27274b = exc;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmSessionManagerError(this.f27273a, this.f27274b);
    }
}
