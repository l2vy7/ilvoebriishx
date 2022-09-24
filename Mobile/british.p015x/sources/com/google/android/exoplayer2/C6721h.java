package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6721h implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27436a;

    public /* synthetic */ C6721h(PlaybackInfo playbackInfo) {
        this.f27436a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlayerStateChanged(this.f27436a.playWhenReady, this.f27436a.playbackState);
    }
}
