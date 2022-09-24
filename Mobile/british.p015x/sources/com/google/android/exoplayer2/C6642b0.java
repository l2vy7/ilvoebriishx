package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6642b0 implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ PlaybackInfo f27366a;

    public /* synthetic */ C6642b0(PlaybackInfo playbackInfo) {
        this.f27366a = playbackInfo;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onStaticMetadataChanged(this.f27366a.staticMetadata);
    }
}
