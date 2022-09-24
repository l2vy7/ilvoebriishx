package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6586k implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27268a;

    /* renamed from: b */
    public final /* synthetic */ long f27269b;

    public /* synthetic */ C6586k(AnalyticsListener.EventTime eventTime, long j) {
        this.f27268a = eventTime;
        this.f27269b = j;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioPositionAdvancing(this.f27268a, this.f27269b);
    }
}
