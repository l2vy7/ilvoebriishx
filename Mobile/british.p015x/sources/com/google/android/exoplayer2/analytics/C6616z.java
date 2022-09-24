package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6616z implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27335a;

    /* renamed from: b */
    public final /* synthetic */ Metadata f27336b;

    public /* synthetic */ C6616z(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        this.f27335a = eventTime;
        this.f27336b = metadata;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onMetadata(this.f27335a, this.f27336b);
    }
}
