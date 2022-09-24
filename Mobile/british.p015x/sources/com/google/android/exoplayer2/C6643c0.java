package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6643c0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27367a;

    public /* synthetic */ C6643c0(PlaybackInfo playbackInfo) {
        this.f27367a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onIsPlayingChanged(ExoPlayerImpl.isPlaying(this.f27367a));
    }
}
