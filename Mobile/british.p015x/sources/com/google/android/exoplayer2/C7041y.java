package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7041y implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ MediaItem f27717a;

    /* renamed from: b */
    public final /* synthetic */ int f27718b;

    public /* synthetic */ C7041y(MediaItem mediaItem, int i) {
        this.f27717a = mediaItem;
        this.f27718b = i;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onMediaItemTransition(this.f27717a, this.f27718b);
    }
}
