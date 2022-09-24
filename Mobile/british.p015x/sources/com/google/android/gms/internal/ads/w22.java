package com.google.android.gms.internal.ads;

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
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w22 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f40671h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f40672b;

    /* renamed from: c */
    private final int[] f40673c = new int[1];

    /* renamed from: d */
    private EGLDisplay f40674d;

    /* renamed from: e */
    private EGLContext f40675e;

    /* renamed from: f */
    private EGLSurface f40676f;

    /* renamed from: g */
    private SurfaceTexture f40677g;

    public w22(Handler handler, v12 v12) {
        this.f40672b = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture mo35543a() {
        SurfaceTexture surfaceTexture = this.f40677g;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void mo35544b(int i) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        String str;
        String str2;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.f40674d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f40671h, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new u02(d13.m20302d("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]), (tz1) null);
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f40674d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.f40675e = eglCreateContext;
                    EGLDisplay eGLDisplay = this.f40674d;
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
                            throw new u02("eglCreatePbufferSurface failed", (tz1) null);
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f40676f = eGLSurface;
                        GLES20.glGenTextures(1, this.f40673c, 0);
                        int i2 = 0;
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                break;
                            }
                            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                            if (valueOf.length() != 0) {
                                str2 = "glError ".concat(valueOf);
                            } else {
                                str2 = new String("glError ");
                            }
                            Log.e("GlUtil", str2);
                            i2 = glGetError;
                        }
                        if (i2 != 0) {
                            String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
                            if (valueOf2.length() != 0) {
                                str = "glError ".concat(valueOf2);
                            } else {
                                str = new String("glError ");
                            }
                            Log.e("GlUtil", str);
                        }
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f40673c[0]);
                        this.f40677g = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(this);
                        return;
                    }
                    throw new u02("eglMakeCurrent failed", (tz1) null);
                }
                throw new u02("eglCreateContext failed", (tz1) null);
            }
            throw new u02("eglInitialize failed", (tz1) null);
        }
        throw new u02("eglGetDisplay failed", (tz1) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo35545c() {
        this.f40672b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f40677g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f40673c, 0);
            }
            EGLDisplay eGLDisplay = this.f40674d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f40674d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f40676f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f40674d, this.f40676f);
            }
            EGLContext eGLContext = this.f40675e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f40674d, eGLContext);
            }
            if (d13.f20195a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f40674d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f40674d);
            }
            this.f40674d = null;
            this.f40675e = null;
            this.f40676f = null;
            this.f40677g = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f40674d;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f40674d;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f40676f;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f40674d, this.f40676f);
            }
            EGLContext eGLContext2 = this.f40675e;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f40674d, eGLContext2);
            }
            if (d13.f20195a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f40674d;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f40674d);
            }
            this.f40674d = null;
            this.f40675e = null;
            this.f40676f = null;
            this.f40677g = null;
            throw th;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f40672b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f40677g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
