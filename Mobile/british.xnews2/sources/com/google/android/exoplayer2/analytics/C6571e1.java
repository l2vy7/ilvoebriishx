package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.e1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6571e1 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27233a;

    /* renamed from: b */
    public final /* synthetic */ float f27234b;

    public /* synthetic */ C6571e1(AnalyticsListener.EventTime eventTime, float f) {
        this.f27233a = eventTime;
        this.f27234b = f;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onVolumeChanged(this.f27233a, this.f27234b);
    }
}
