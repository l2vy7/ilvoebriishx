package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.n0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6593n0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27282a;

    /* renamed from: b */
    public final /* synthetic */ Object f27283b;

    /* renamed from: c */
    public final /* synthetic */ long f27284c;

    public /* synthetic */ C6593n0(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.f27282a = eventTime;
        this.f27283b = obj;
        this.f27284c = j;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onRenderedFirstFrame(this.f27282a, this.f27283b, this.f27284c);
    }
}
