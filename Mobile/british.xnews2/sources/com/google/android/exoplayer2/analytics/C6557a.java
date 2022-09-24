package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6557a implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27203a;

    public /* synthetic */ C6557a(AnalyticsListener.EventTime eventTime) {
        this.f27203a = eventTime;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysLoaded(this.f27203a);
    }
}
