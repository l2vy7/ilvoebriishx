package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6590m implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27275a;

    /* renamed from: b */
    public final /* synthetic */ long f27276b;

    /* renamed from: c */
    public final /* synthetic */ int f27277c;

    public /* synthetic */ C6590m(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f27275a = eventTime;
        this.f27276b = j;
        this.f27277c = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.f27275a, this.f27276b, this.f27277c);
    }
}
