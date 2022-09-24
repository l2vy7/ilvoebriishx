package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;

/* renamed from: com.google.android.exoplayer2.drm.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6676u implements MediaDrm.OnExpirationUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ FrameworkMediaDrm f27399a;

    /* renamed from: b */
    public final /* synthetic */ ExoMediaDrm.OnExpirationUpdateListener f27400b;

    public /* synthetic */ C6676u(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        this.f27399a = frameworkMediaDrm;
        this.f27400b = onExpirationUpdateListener;
    }

    public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
        this.f27399a.lambda$setOnExpirationUpdateListener$3(this.f27400b, mediaDrm, bArr, j);
    }
}
