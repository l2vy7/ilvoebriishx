package com.google.ads.interactivemedia.p039v3.internal;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iq */
/* compiled from: IMASDK */
final class C4078iq implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C4080is f17439a;

    /* renamed from: b */
    private final Handler f17440b;

    public C4078iq(C4080is isVar, Handler handler) {
        this.f17439a = isVar;
        this.f17440b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f17440b.post(new C4077ip(this, i));
    }
}
