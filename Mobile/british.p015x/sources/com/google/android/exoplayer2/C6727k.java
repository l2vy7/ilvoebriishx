package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6727k implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27442a;

    public /* synthetic */ C6727k(PlaybackInfo playbackInfo) {
        this.f27442a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlaybackSuppressionReasonChanged(this.f27442a.playbackSuppressionReason);
    }
}
