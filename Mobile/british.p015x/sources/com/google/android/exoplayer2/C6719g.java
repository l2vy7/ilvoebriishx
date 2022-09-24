package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6719g implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27434a;

    public /* synthetic */ C6719g(PlaybackInfo playbackInfo) {
        this.f27434a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ExoPlayerImpl.lambda$updatePlaybackInfo$14(this.f27434a, (Player.EventListener) obj);
    }
}
