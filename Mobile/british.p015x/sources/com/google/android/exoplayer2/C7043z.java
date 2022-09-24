package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7043z implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ MediaMetadata f27720a;

    public /* synthetic */ C7043z(MediaMetadata mediaMetadata) {
        this.f27720a = mediaMetadata;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onMediaMetadataChanged(this.f27720a);
    }
}
