package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6729l implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27444a;

    /* renamed from: b */
    public final /* synthetic */ int f27445b;

    public /* synthetic */ C6729l(PlaybackInfo playbackInfo, int i) {
        this.f27444a = playbackInfo;
        this.f27445b = i;
    }

    public final void invoke(Object obj) {
        ExoPlayerImpl.lambda$updatePlaybackInfo$7(this.f27444a, this.f27445b, (Player.EventListener) obj);
    }
}
