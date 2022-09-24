package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioTrack;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oy */
/* compiled from: IMASDK */
final class C4248oy {

    /* renamed from: a */
    final /* synthetic */ C4249oz f18235a;

    /* renamed from: b */
    private final Handler f18236b = new Handler();

    /* renamed from: c */
    private final AudioTrack.StreamEventCallback f18237c = new C4247ox(this);

    public C4248oy(C4249oz ozVar) {
        this.f18235a = ozVar;
    }

    /* renamed from: a */
    public final void mo16487a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(C4246ow.m18412a(this.f18236b), this.f18237c);
    }

    /* renamed from: b */
    public final void mo16488b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f18237c);
        this.f18236b.removeCallbacksAndMessages((Object) null);
    }
}
