package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6569e implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27229a;

    /* renamed from: b */
    public final /* synthetic */ int f27230b;

    public /* synthetic */ C6569e(AnalyticsListener.EventTime eventTime, int i) {
        this.f27229a = eventTime;
        this.f27230b = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onRepeatModeChanged(this.f27229a, this.f27230b);
    }
}
