package com.google.ads.interactivemedia.p038v3.internal;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akx */
/* compiled from: IMASDK */
public final class akx implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    private static final int[] f15182a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f15183b;

    /* renamed from: c */
    private final int[] f15184c = new int[1];

    /* renamed from: d */
    private EGLDisplay f15185d;

    /* renamed from: e */
    private EGLContext f15186e;

    /* renamed from: f */
    private EGLSurface f15187f;

    /* renamed from: g */
    private SurfaceTexture f15188g;

    public akx(Handler handler) {
        this.f15183b = handler;
    }

    /* renamed from: a */
    public final void mo13863a(int i) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        String str;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.f15185d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f15182a, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new akw(amm.m14188E("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]));
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f15185d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.f15186e = eglCreateContext;
                    EGLDisplay eGLDisplay = this.f15185d;
                    if (i == 1) {
                        eGLSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i == 2) {
                            iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                        } else {
                            iArr = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
                        if (eGLSurface == null) {
                            throw new akw("eglCreatePbufferSurface failed");
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f15187f = eGLSurface;
                        GLES20.glGenTextures(1, this.f15184c, 0);
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError != 0) {
                                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                                if (valueOf.length() != 0) {
                                    str = "glError ".concat(valueOf);
                                } else {
                                    str = new String("glError ");
                                }
                                Log.e("GlUtil", str);
                            } else {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15184c[0]);
                                this.f15188g = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            }
                        }
                    } else {
                        throw new akw("eglMakeCurrent failed");
                    }
                } else {
                    throw new akw("eglCreateContext failed");
                }
            } else {
                throw new akw("eglInitialize failed");
            }
        } else {
            throw new akw("eglGetDisplay failed");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo13864b() {
        this.f15183b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f15188g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f15184c, 0);
            }
            EGLDisplay eGLDisplay = this.f15185d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f15185d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f15187f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f15185d, this.f15187f);
            }
            EGLContext eGLContext = this.f15186e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f15185d, eGLContext);
            }
            if (amm.f15298a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f15185d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f15185d);
            }
            this.f15185d = null;
            this.f15186e = null;
            this.f15187f = null;
            this.f15188g = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f15185d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f15185d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f15187f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f15185d, this.f15187f);
            }
            EGLContext eGLContext2 = this.f15186e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f15185d, eGLContext2);
            }
            if (amm.f15298a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f15185d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f15185d);
            }
            this.f15185d = null;
            this.f15186e = null;
            this.f15187f = null;
            this.f15188g = null;
            throw th;
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo13865c() {
        SurfaceTexture surfaceTexture = this.f15188g;
        aup.m14890u(surfaceTexture);
        return surfaceTexture;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15183b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f15188g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
