package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6592n implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27280a;

    /* renamed from: b */
    public final /* synthetic */ ExoPlaybackException f27281b;

    public /* synthetic */ C6592n(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        this.f27280a = eventTime;
        this.f27281b = exoPlaybackException;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlayerError(this.f27280a, this.f27281b);
    }
}
