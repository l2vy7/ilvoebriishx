package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ExoFlags;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.analytics.a1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6559a1 implements ListenerSet.IterationFinishedEvent {

    /* renamed from: a */
    public final /* synthetic */ AnalyticsCollector f27207a;

    /* renamed from: b */
    public final /* synthetic */ Player f27208b;

    public /* synthetic */ C6559a1(AnalyticsCollector analyticsCollector, Player player) {
        this.f27207a = analyticsCollector;
        this.f27208b = player;
    }

    public final void invoke(Object obj, ExoFlags exoFlags) {
        this.f27207a.lambda$setPlayer$1(this.f27208b, (AnalyticsListener) obj, exoFlags);
    }
}
