package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.w0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6611w0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27324a;

    /* renamed from: b */
    public final /* synthetic */ boolean f27325b;

    public /* synthetic */ C6611w0(AnalyticsListener.EventTime eventTime, boolean z) {
        this.f27324a = eventTime;
        this.f27325b = z;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f27324a, this.f27325b);
    }
}
