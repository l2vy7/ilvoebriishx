package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6598q implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27295a;

    /* renamed from: b */
    public final /* synthetic */ MediaItem f27296b;

    /* renamed from: c */
    public final /* synthetic */ int f27297c;

    public /* synthetic */ C6598q(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        this.f27295a = eventTime;
        this.f27296b = mediaItem;
        this.f27297c = i;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onMediaItemTransition(this.f27295a, this.f27296b, this.f27297c);
    }
}
