package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.y0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6615y0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27332a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27333b;

    /* renamed from: c */
    public final /* synthetic */ int f27334c;

    public /* synthetic */ C6615y0(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        this.f27332a = eventTime;
        this.f27333b = z;
        this.f27334c = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.f27332a, this.f27333b, this.f27334c);
    }
}
