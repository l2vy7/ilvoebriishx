package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q14 {

    /* renamed from: a */
    private final Handler f37833a = new Handler();

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f37834b;

    /* renamed from: c */
    final /* synthetic */ r14 f37835c;

    public q14(r14 r14) {
        this.f37835c = r14;
        this.f37834b = new p14(this, r14);
    }

    /* renamed from: a */
    public final void mo34230a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new o14(this.f37833a), this.f37834b);
    }

    /* renamed from: b */
    public final void mo34231b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f37834b);
        this.f37833a.removeCallbacksAndMessages((Object) null);
    }
}
