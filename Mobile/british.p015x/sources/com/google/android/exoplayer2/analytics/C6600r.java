package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6600r implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27302a;

    /* renamed from: b */
    public final /* synthetic */ MediaMetadata f27303b;

    public /* synthetic */ C6600r(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        this.f27302a = eventTime;
        this.f27303b = mediaMetadata;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onMediaMetadataChanged(this.f27302a, this.f27303b);
    }
}
