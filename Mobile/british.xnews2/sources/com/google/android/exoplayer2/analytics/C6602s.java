package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6602s implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27308a;

    /* renamed from: b */
    public final /* synthetic */ PlaybackParameters f27309b;

    public /* synthetic */ C6602s(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        this.f27308a = eventTime;
        this.f27309b = playbackParameters;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlaybackParametersChanged(this.f27308a, this.f27309b);
    }
}
