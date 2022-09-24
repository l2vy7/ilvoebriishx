package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6782o implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ boolean f27481a;

    public /* synthetic */ C6782o(boolean z) {
        this.f27481a = z;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onShuffleModeEnabledChanged(this.f27481a);
    }
}
