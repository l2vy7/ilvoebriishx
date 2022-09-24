package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.z0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6617z0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27337a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27338b;

    /* renamed from: c */
    public final /* synthetic */ int f27339c;

    public /* synthetic */ C6617z0(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        this.f27337a = eventTime;
        this.f27338b = z;
        this.f27339c = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlayerStateChanged(this.f27337a, this.f27338b, this.f27339c);
    }
}
