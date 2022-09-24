package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.u0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6607u0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27317a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27318b;

    public /* synthetic */ C6607u0(AnalyticsListener.EventTime eventTime, boolean z) {
        this.f27317a = eventTime;
        this.f27318b = z;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onIsLoadingChanged$39(this.f27317a, this.f27318b, (AnalyticsListener) obj);
    }
}
