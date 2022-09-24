package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.g0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6576g0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f27245a;

    /* renamed from: b */
    public final /* synthetic */ TrackGroupArray f27246b;

    /* renamed from: c */
    public final /* synthetic */ TrackSelectionArray f27247c;

    public /* synthetic */ C6576g0(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        this.f27245a = eventTime;
        this.f27246b = trackGroupArray;
        this.f27247c = trackSelectionArray;
    }

    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onTracksChanged(this.f27245a, this.f27246b, this.f27247c);
    }
}
