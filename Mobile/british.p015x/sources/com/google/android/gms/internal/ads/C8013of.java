package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.of */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8013of extends Thread {

    /* renamed from: b */
    final /* synthetic */ AudioTrack f36454b;

    /* renamed from: c */
    final /* synthetic */ C8368yf f36455c;

    C8013of(C8368yf yfVar, AudioTrack audioTrack) {
        this.f36455c = yfVar;
        this.f36454b = audioTrack;
    }

    public final void run() {
        try {
            this.f36454b.flush();
            this.f36454b.release();
        } finally {
            this.f36455c.f41830e.open();
        }
    }
}
