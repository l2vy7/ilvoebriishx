package com.google.android.exoplayer2;

import com.google.android.exoplayer2.ExoPlayerImplInternal;

/* renamed from: com.google.android.exoplayer2.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6929u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ExoPlayerImpl f27618b;

    /* renamed from: c */
    public final /* synthetic */ ExoPlayerImplInternal.PlaybackInfoUpdate f27619c;

    public /* synthetic */ C6929u(ExoPlayerImpl exoPlayerImpl, ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f27618b = exoPlayerImpl;
        this.f27619c = playbackInfoUpdate;
    }

    public final void run() {
        this.f27618b.lambda$new$1(this.f27619c);
    }
}
