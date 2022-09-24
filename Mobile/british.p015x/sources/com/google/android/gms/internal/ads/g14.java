package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class g14 extends Thread {

    /* renamed from: b */
    final /* synthetic */ AudioTrack f32098b;

    /* renamed from: c */
    final /* synthetic */ r14 f32099c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g14(r14 r14, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f32099c = r14;
        this.f32098b = audioTrack;
    }

    public final void run() {
        try {
            this.f32098b.flush();
            this.f32098b.release();
        } finally {
            this.f32099c.f38480e.open();
        }
    }
}
