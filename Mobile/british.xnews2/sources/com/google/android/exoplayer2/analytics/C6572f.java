package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6572f implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27235a;

    /* renamed from: b */
    public final /* synthetic */ int f27236b;

    /* renamed from: c */
    public final /* synthetic */ int f27237c;

    public /* synthetic */ C6572f(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f27235a = eventTime;
        this.f27236b = i;
        this.f27237c = i2;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onSurfaceSizeChanged(this.f27235a, this.f27236b, this.f27237c);
    }
}
