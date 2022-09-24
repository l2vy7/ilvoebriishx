package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6585j0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27266a;

    /* renamed from: b */
    public final /* synthetic */ Exception f27267b;

    public /* synthetic */ C6585j0(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.f27266a = eventTime;
        this.f27267b = exc;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onVideoCodecError(this.f27266a, this.f27267b);
    }
}
