package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6584j implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27262a;

    /* renamed from: b */
    public final /* synthetic */ int f27263b;

    /* renamed from: c */
    public final /* synthetic */ Player.PositionInfo f27264c;

    /* renamed from: d */
    public final /* synthetic */ Player.PositionInfo f27265d;

    public /* synthetic */ C6584j(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        this.f27262a = eventTime;
        this.f27263b = i;
        this.f27264c = positionInfo;
        this.f27265d = positionInfo2;
    }

    public final void invoke(Object obj) {
        AnalyticsCollector.lambda$onPositionDiscontinuity$48(this.f27262a, this.f27263b, this.f27264c, this.f27265d, (AnalyticsListener) obj);
    }
}
