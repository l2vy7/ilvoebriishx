package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.p0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6597p0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27293a;

    /* renamed from: b */
    public final /* synthetic */ String f27294b;

    public /* synthetic */ C6597p0(AnalyticsListener.EventTime eventTime, String str) {
        this.f27293a = eventTime;
        this.f27294b = str;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onVideoDecoderReleased(this.f27293a, this.f27294b);
    }
}
