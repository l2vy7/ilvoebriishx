package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oq */
/* compiled from: IMASDK */
final class C4240oq extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f18212a;

    /* renamed from: b */
    final /* synthetic */ C4249oz f18213b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4240oq(C4249oz ozVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f18213b = ozVar;
        this.f18212a = audioTrack;
    }

    public final void run() {
        try {
            this.f18212a.flush();
            this.f18212a.release();
        } finally {
            this.f18213b.f18269g.open();
        }
    }
}
