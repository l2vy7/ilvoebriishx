package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;

/* renamed from: com.google.android.exoplayer2.video.spherical.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7033a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b */
    public final /* synthetic */ SceneRenderer f27709b;

    public /* synthetic */ C7033a(SceneRenderer sceneRenderer) {
        this.f27709b = sceneRenderer;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f27709b.lambda$init$0(surfaceTexture);
    }
}
