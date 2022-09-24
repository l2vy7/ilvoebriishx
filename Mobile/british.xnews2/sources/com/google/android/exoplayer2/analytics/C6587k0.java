package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.k0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6587k0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27270a;

    /* renamed from: b */
    public final /* synthetic */ Exception f27271b;

    public /* synthetic */ C6587k0(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.f27270a = eventTime;
        this.f27271b = exc;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioSinkError(this.f27270a, this.f27271b);
    }
}
