package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;

/* renamed from: com.google.android.exoplayer2.drm.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6675t implements MediaDrm.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ FrameworkMediaDrm f27397a;

    /* renamed from: b */
    public final /* synthetic */ ExoMediaDrm.OnEventListener f27398b;

    public /* synthetic */ C6675t(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnEventListener onEventListener) {
        this.f27397a = frameworkMediaDrm;
        this.f27398b = onEventListener;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f27397a.lambda$setOnEventListener$1(this.f27398b, mediaDrm, bArr, i, i2, bArr2);
    }
}
