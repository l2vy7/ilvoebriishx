package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6731m implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27449a;

    /* renamed from: b */
    public final /* synthetic */ int f27450b;

    public /* synthetic */ C6731m(PlaybackInfo playbackInfo, int i) {
        this.f27449a = playbackInfo;
        this.f27450b = i;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onPlayWhenReadyChanged(this.f27449a.playWhenReady, this.f27450b);
    }
}
