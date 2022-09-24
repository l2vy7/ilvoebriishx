package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ExoFlags;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6904t implements ListenerSet.IterationFinishedEvent {

    /* renamed from: a */
    public final /* synthetic */ Player f27601a;

    public /* synthetic */ C6904t(Player player) {
        this.f27601a = player;
    }

    public final void invoke(Object obj, ExoFlags exoFlags) {
        ((Player.EventListener) obj).onEvents(this.f27601a, new Player.Events(exoFlags));
    }
}
