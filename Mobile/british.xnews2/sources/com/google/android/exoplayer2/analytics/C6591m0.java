package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.m0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6591m0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27278a;

    /* renamed from: b */
    public final /* synthetic */ Exception f27279b;

    public /* synthetic */ C6591m0(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.f27278a = eventTime;
        this.f27279b = exc;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioCodecError(this.f27278a, this.f27279b);
    }
}
