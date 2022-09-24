package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6780n implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27478a;

    /* renamed from: b */
    public final /* synthetic */ TrackSelectionArray f27479b;

    public /* synthetic */ C6780n(PlaybackInfo playbackInfo, TrackSelectionArray trackSelectionArray) {
        this.f27478a = playbackInfo;
        this.f27479b = trackSelectionArray;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onTracksChanged(this.f27478a.trackGroups, this.f27479b);
    }
}
