package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6812s implements ListenerSet.Event {

    /* renamed from: a */
    public static final /* synthetic */ C6812s f27505a = new C6812s();

    private /* synthetic */ C6812s() {
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onSeekProcessed();
    }
}
