package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6555a0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27201a;

    public /* synthetic */ C6555a0(PlaybackInfo playbackInfo) {
        this.f27201a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlayerError(this.f27201a.playbackError);
    }
}
