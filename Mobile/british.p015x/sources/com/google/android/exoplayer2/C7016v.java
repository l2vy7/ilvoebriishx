package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: com.google.android.exoplayer2.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7016v implements ListenerSet.Event {

    /* renamed from: a */
    public final /* synthetic */ int f27678a;

    /* renamed from: b */
    public final /* synthetic */ Player.PositionInfo f27679b;

    /* renamed from: c */
    public final /* synthetic */ Player.PositionInfo f27680c;

    public /* synthetic */ C7016v(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        this.f27678a = i;
        this.f27679b = positionInfo;
        this.f27680c = positionInfo2;
    }

    public final void invoke(Object obj) {
        ExoPlayerImpl.lambda$updatePlaybackInfo$8(this.f27678a, this.f27679b, this.f27680c, (Player.EventListener) obj);
    }
}
