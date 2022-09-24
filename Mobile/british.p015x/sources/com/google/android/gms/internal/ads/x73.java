package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x73 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: b */
    private final Handler f41068b;

    /* renamed from: c */
    final /* synthetic */ ka3 f41069c;

    public x73(ka3 ka3, Handler handler) {
        this.f41069c = ka3;
        this.f41068b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f41068b.post(new x63(this, i));
    }
}
