package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;

/* renamed from: com.google.android.exoplayer2.video.spherical.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7035c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SphericalGLSurfaceView f27711b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceTexture f27712c;

    public /* synthetic */ C7035c(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        this.f27711b = sphericalGLSurfaceView;
        this.f27712c = surfaceTexture;
    }

    public final void run() {
        this.f27711b.lambda$onSurfaceTextureAvailable$1(this.f27712c);
    }
}
