package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6581i implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27255a;

    /* renamed from: b */
    public final /* synthetic */ int f27256b;

    /* renamed from: c */
    public final /* synthetic */ long f27257c;

    /* renamed from: d */
    public final /* synthetic */ long f27258d;

    public /* synthetic */ C6581i(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.f27255a = eventTime;
        this.f27256b = i;
        this.f27257c = j;
        this.f27258d = j2;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioUnderrun(this.f27255a, this.f27256b, this.f27257c, this.f27258d);
    }
}
