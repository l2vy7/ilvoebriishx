package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6723i implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27438a;

    public /* synthetic */ C6723i(PlaybackInfo playbackInfo) {
        this.f27438a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlaybackStateChanged(this.f27438a.playbackState);
    }
}
