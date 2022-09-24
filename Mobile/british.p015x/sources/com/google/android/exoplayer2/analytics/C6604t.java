package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6604t implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27311a;

    /* renamed from: b */
    public final /* synthetic */ AudioAttributes f27312b;

    public /* synthetic */ C6604t(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        this.f27311a = eventTime;
        this.f27312b = audioAttributes;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioAttributesChanged(this.f27311a, this.f27312b);
    }
}
