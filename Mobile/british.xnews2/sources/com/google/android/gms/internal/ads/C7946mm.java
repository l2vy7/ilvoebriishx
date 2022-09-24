package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.mm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7946mm extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: b */
    private final int[] f35550b = new int[1];

    /* renamed from: c */
    private Handler f35551c;

    /* renamed from: d */
    private SurfaceTexture f35552d;

    /* renamed from: e */
    private Error f35553e;

    /* renamed from: f */
    private RuntimeException f35554f;

    /* renamed from: g */
    private zzaxh f35555g;

    public C7946mm() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final zzaxh mo33558a(boolean z) {
        boolean z2;
        start();
        this.f35551c = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f35551c.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f35555g == null && this.f35554f == null && this.f35553e == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f35554f;
        if (runtimeException == null) {
            Error error = this.f35553e;
            if (error == null) {
                return this.f35555g;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo33559b() {
        this.f35551c.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                C8195tl.m37901f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C8195tl.m37901f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                C8195tl.m37901f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                C8195tl.m37901f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                C8195tl.m37901f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                C8195tl.m37901f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f35550b, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f35550b[0]);
                this.f35552d = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f35555g = new zzaxh(this, this.f35552d, z, (C7984nm) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f35554f = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f35553e = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.f35552d.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f35552d.release();
                this.f35555g = null;
                this.f35552d = null;
                GLES20.glDeleteTextures(1, this.f35550b, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f35551c.sendEmptyMessage(2);
    }
}
