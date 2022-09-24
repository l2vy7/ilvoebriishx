package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6575g implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27242a;

    /* renamed from: b */
    public final /* synthetic */ int f27243b;

    /* renamed from: c */
    public final /* synthetic */ long f27244c;

    public /* synthetic */ C6575g(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.f27242a = eventTime;
        this.f27243b = i;
        this.f27244c = j;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDroppedVideoFrames(this.f27242a, this.f27243b, this.f27244c);
    }
}
