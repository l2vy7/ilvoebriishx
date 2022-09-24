package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6725j implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27440a;

    public /* synthetic */ C6725j(PlaybackInfo playbackInfo) {
        this.f27440a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlaybackParametersChanged(this.f27440a.playbackParameters);
    }
}
