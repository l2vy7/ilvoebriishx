package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7039x implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ ExoPlayerImpl f27715a;

    public /* synthetic */ C7039x(ExoPlayerImpl exoPlayerImpl) {
        this.f27715a = exoPlayerImpl;
    }

    public final void invoke(Object obj) {
        this.f27715a.lambda$onMetadata$6((Player.EventListener) obj);
    }
}
