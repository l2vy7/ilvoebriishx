package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7037w implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ ExoPlayerImpl f27713a;

    public /* synthetic */ C7037w(ExoPlayerImpl exoPlayerImpl) {
        this.f27713a = exoPlayerImpl;
    }

    public final void invoke(Object obj) {
        this.f27713a.lambda$updateAvailableCommands$21((Player.EventListener) obj);
    }
}
