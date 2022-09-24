package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ip0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ MediaPlayer f33391b;

    /* renamed from: c */
    final /* synthetic */ qp0 f33392c;

    ip0(qp0 qp0, MediaPlayer mediaPlayer) {
        this.f33392c = qp0;
        this.f33391b = mediaPlayer;
    }

    public final void run() {
        qp0.m36583J(this.f33392c, this.f33391b);
        if (this.f33392c.f38237s != null) {
            this.f33392c.f38237s.zzf();
        }
    }
}
