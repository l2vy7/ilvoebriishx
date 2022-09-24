package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.o0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6595o0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27288a;

    /* renamed from: b */
    public final /* synthetic */ String f27289b;

    public /* synthetic */ C6595o0(AnalyticsListener.EventTime eventTime, String str) {
        this.f27288a = eventTime;
        this.f27289b = str;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioDecoderReleased(this.f27288a, this.f27289b);
    }
}
