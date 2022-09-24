package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6809q implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ int f27503a;

    public /* synthetic */ C6809q(int i) {
        this.f27503a = i;
    }

    public final void invoke(Object obj) {
        ((Player.EventListener) obj).onRepeatModeChanged(this.f27503a);
    }
}
