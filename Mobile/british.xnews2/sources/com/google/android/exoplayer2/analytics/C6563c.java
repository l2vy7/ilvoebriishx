package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6563c implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27215a;

    /* renamed from: b */
    public final /* synthetic */ int f27216b;

    public /* synthetic */ C6563c(AnalyticsListener.EventTime eventTime, int i) {
        this.f27215a = eventTime;
        this.f27216b = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f27215a, this.f27216b);
    }
}
