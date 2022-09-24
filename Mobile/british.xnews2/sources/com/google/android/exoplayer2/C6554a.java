package com.google.android.exoplayer2;

import com.google.android.exoplayer2.AudioFocusManager;

/* renamed from: com.google.android.exoplayer2.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6554a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AudioFocusManager.AudioFocusListener f27199b;

    /* renamed from: c */
    public final /* synthetic */ int f27200c;

    public /* synthetic */ C6554a(AudioFocusManager.AudioFocusListener audioFocusListener, int i) {
        this.f27199b = audioFocusListener;
        this.f27200c = i;
    }

    public final void run() {
        this.f27199b.lambda$onAudioFocusChange$0(this.f27200c);
    }
}
