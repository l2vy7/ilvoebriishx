package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6807p implements ListenerSet.Event {

    /* renamed from: a */
    public static final /* synthetic */ C6807p f27502a = new C6807p();

    private /* synthetic */ C6807p() {
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlayerError(ExoPlaybackException.createForRenderer(new ExoTimeoutException(1)));
    }
}
