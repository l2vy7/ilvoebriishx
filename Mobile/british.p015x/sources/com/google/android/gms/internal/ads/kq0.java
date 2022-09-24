package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kq0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, iq0 {

    /* renamed from: C */
    private static final float[] f34420C = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f34421A;

    /* renamed from: B */
    private volatile boolean f34422B;

    /* renamed from: b */
    private final jq0 f34423b;

    /* renamed from: c */
    private final float[] f34424c = new float[9];

    /* renamed from: d */
    private final float[] f34425d = new float[9];

    /* renamed from: e */
    private final float[] f34426e = new float[9];

    /* renamed from: f */
    private final float[] f34427f = new float[9];

    /* renamed from: g */
    private final float[] f34428g = new float[9];

    /* renamed from: h */
    private final float[] f34429h = new float[9];

    /* renamed from: i */
    private final float[] f34430i = new float[9];

    /* renamed from: j */
    private float f34431j = Float.NaN;

    /* renamed from: k */
    private float f34432k;

    /* renamed from: l */
    private float f34433l;

    /* renamed from: m */
    private int f34434m;

    /* renamed from: n */
    private int f34435n;

    /* renamed from: o */
    private SurfaceTexture f34436o;

    /* renamed from: p */
    private SurfaceTexture f34437p;

    /* renamed from: q */
    private int f34438q;

    /* renamed from: r */
    private int f34439r;

    /* renamed from: s */
    private int f34440s;

    /* renamed from: t */
    private final FloatBuffer f34441t;

    /* renamed from: u */
    private final CountDownLatch f34442u;

    /* renamed from: v */
    private final Object f34443v;

    /* renamed from: w */
    private EGL10 f34444w;

    /* renamed from: x */
    private EGLDisplay f34445x;

    /* renamed from: y */
    private EGLContext f34446y;

    /* renamed from: z */
    private EGLSurface f34447z;

    public kq0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f34420C;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f34441t = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        jq0 jq0 = new jq0(context);
        this.f34423b = jq0;
        jq0.mo32922a(this);
        this.f34442u = new CountDownLatch(1);
        this.f34443v = new Object();
    }

    /* renamed from: g */
    private static final void m34083g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    /* renamed from: h */
    private static final void m34084h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: i */
    private static final void m34085i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: j */
    private static final void m34086j(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: k */
    private static final int m34087k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m34083g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m34083g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m34083g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m34083g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m34083g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public final SurfaceTexture mo33151a() {
        if (this.f34437p == null) {
            return null;
        }
        try {
            this.f34442u.await();
        } catch (InterruptedException unused) {
        }
        return this.f34436o;
    }

    /* renamed from: b */
    public final void mo33152b(int i, int i2) {
        synchronized (this.f34443v) {
            this.f34435n = i;
            this.f34434m = i2;
            this.f34421A = true;
            this.f34443v.notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo33153c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f34435n = i;
        this.f34434m = i2;
        this.f34437p = surfaceTexture;
    }

    /* renamed from: d */
    public final void mo33154d() {
        synchronized (this.f34443v) {
            this.f34422B = true;
            this.f34437p = null;
            this.f34443v.notifyAll();
        }
    }

    /* renamed from: e */
    public final void mo33155e(float f, float f2) {
        int i = this.f34435n;
        int i2 = this.f34434m;
        float f3 = i > i2 ? (float) i : (float) i2;
        this.f34432k -= (f * 1.7453293f) / f3;
        float f4 = this.f34433l - ((f2 * 1.7453293f) / f3);
        this.f34433l = f4;
        if (f4 < -1.5707964f) {
            this.f34433l = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f34433l = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo33156f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f34447z;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f34444w.eglDestroySurface(this.f34445x, this.f34447z) | this.f34444w.eglMakeCurrent(this.f34445x, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f34447z = null;
        }
        EGLContext eGLContext = this.f34446y;
        if (eGLContext != null) {
            z |= this.f34444w.eglDestroyContext(this.f34445x, eGLContext);
            this.f34446y = null;
        }
        EGLDisplay eGLDisplay = this.f34445x;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.f34444w.eglTerminate(eGLDisplay);
        this.f34445x = null;
        return eglTerminate | z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f34440s++;
        synchronized (this.f34443v) {
            this.f34443v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f34437p
            if (r0 == 0) goto L_0x03a7
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.f34444w = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.f34445x = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x0087
        L_0x0020:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r15.f34444w
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x002b
            goto L_0x001d
        L_0x002b:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f34444w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f34445x
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0045
        L_0x0043:
            r0 = r4
            goto L_0x004b
        L_0x0045:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0043
            r0 = r1[r6]
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x001d
        L_0x004e:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.f34444w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f34445x
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.f34446y = r1
            if (r1 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0066
            goto L_0x001d
        L_0x0066:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f34444w
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f34445x
            android.graphics.SurfaceTexture r8 = r15.f34437p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.f34447z = r0
            if (r0 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0079
            goto L_0x001d
        L_0x0079:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f34444w
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.f34445x
            javax.microedition.khronos.egl.EGLContext r8 = r15.f34446y
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0086
            goto L_0x001d
        L_0x0086:
            r0 = 1
        L_0x0087:
            com.google.android.gms.internal.ads.h00<java.lang.String> r1 = com.google.android.gms.internal.ads.p00.f36992U0
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r7 = r7.mo18570b(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.mo32311l()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00a8
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r1 = r7.mo18570b(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00aa:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = m34087k(r7, r1)
            if (r1 != 0) goto L_0x00b6
        L_0x00b3:
            r8 = 0
            goto L_0x0138
        L_0x00b6:
            com.google.android.gms.internal.ads.h00<java.lang.String> r7 = com.google.android.gms.internal.ads.p00.f37000V0
            com.google.android.gms.internal.ads.n00 r8 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r8 = r8.mo18570b(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo32311l()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.n00 r8 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r7 = r8.mo18570b(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00d9
        L_0x00d7:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00d9:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = m34087k(r8, r7)
            if (r7 != 0) goto L_0x00e3
            goto L_0x00b3
        L_0x00e3:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m34083g(r9)
            if (r8 == 0) goto L_0x0138
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m34083g(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m34083g(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m34083g(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m34083g(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0130
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m34083g(r1)
            goto L_0x00b3
        L_0x0130:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m34083g(r1)
        L_0x0138:
            r15.f34438q = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            m34083g(r1)
            int r1 = r15.f34438q
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.f34441t
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m34083g(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m34083g(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m34083g(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m34083g(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m34083g(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m34083g(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m34083g(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m34083g(r7)
            int r7 = r15.f34438q
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.f34439r = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.f34438q
            if (r0 == 0) goto L_0x036d
            if (r7 != 0) goto L_0x01c3
            goto L_0x036d
        L_0x01c3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f34436o = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.f34442u
            r0.countDown()
            com.google.android.gms.internal.ads.jq0 r0 = r15.f34423b
            r0.mo32923b()
            r15.f34421A = r5     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x01d9:
            boolean r0 = r15.f34422B     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 != 0) goto L_0x0318
        L_0x01dd:
            int r0 = r15.f34440s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 <= 0) goto L_0x01ed
            android.graphics.SurfaceTexture r0 = r15.f34436o     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f34440s     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r0 + -1
            r15.f34440s = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x01dd
        L_0x01ed:
            com.google.android.gms.internal.ads.jq0 r0 = r15.f34423b     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r1 = r15.f34424c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r0.mo32925d(r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L_0x0267
            float r0 = r15.f34431j     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x025c
            float[] r0 = r15.f34424c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r14 = r9[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r13 = r0[r7]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r1]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r12 = r12 * r14
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 + r8
            float r0 = -r0
            r15.f34431j = r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x025c:
            float[] r0 = r15.f34429h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f34431j     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r9 = r15.f34432k     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r8 + r9
            m34086j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x0273
        L_0x0267:
            float[] r0 = r15.f34424c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34085i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f34429h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f34432k     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34086j(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x0273:
            float[] r0 = r15.f34425d     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            m34085i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f34426e     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f34429h     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f34425d     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34084h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f34427f     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f34424c     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f34426e     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34084h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f34428g     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r8 = r15.f34433l     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34085i(r0, r8)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r0 = r15.f34430i     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f34428g     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r9 = r15.f34427f     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            m34084h(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f34439r     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float[] r8 = r15.f34430i     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "drawArrays"
            m34083g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGL10 r0 = r15.f34444w     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f34445x     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            javax.microedition.khronos.egl.EGLSurface r7 = r15.f34447z     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            boolean r0 = r15.f34421A     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            if (r0 == 0) goto L_0x02fe
            int r0 = r15.f34435n     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f34434m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r0 = "viewport"
            m34083g(r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f34438q     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r1 = r15.f34438q     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r7 = r15.f34435n     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r8 = r15.f34434m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x02f1
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            int r0 = r15.f34434m     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 * r9
            int r7 = r15.f34435n     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            goto L_0x02fc
        L_0x02f1:
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fc:
            r15.f34421A = r6     // Catch:{ IllegalStateException -> 0x0347, all -> 0x0328 }
        L_0x02fe:
            java.lang.Object r0 = r15.f34443v     // Catch:{ InterruptedException -> 0x01d9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01d9 }
            boolean r1 = r15.f34422B     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            boolean r1 = r15.f34421A     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            int r1 = r15.f34440s     // Catch:{ all -> 0x0315 }
            if (r1 != 0) goto L_0x0312
            java.lang.Object r1 = r15.f34443v     // Catch:{ all -> 0x0315 }
            r1.wait()     // Catch:{ all -> 0x0315 }
        L_0x0312:
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            goto L_0x01d9
        L_0x0315:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0315 }
            throw r1     // Catch:{ InterruptedException -> 0x01d9 }
        L_0x0318:
            com.google.android.gms.internal.ads.jq0 r0 = r15.f34423b
            r0.mo32924c()
            android.graphics.SurfaceTexture r0 = r15.f34436o
            r0.setOnFrameAvailableListener(r4)
            r15.f34436o = r4
            r15.mo33156f()
            return
        L_0x0328:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.co0.zzh(r1, r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.nn0 r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x035c }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo18592s(r0, r2)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.jq0 r0 = r15.f34423b
            r0.mo32924c()
            android.graphics.SurfaceTexture r0 = r15.f34436o
            r0.setOnFrameAvailableListener(r4)
            r15.f34436o = r4
            r15.mo33156f()
            return
        L_0x0347:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.co0.zzj(r0)     // Catch:{ all -> 0x035c }
            com.google.android.gms.internal.ads.jq0 r0 = r15.f34423b
            r0.mo32924c()
            android.graphics.SurfaceTexture r0 = r15.f34436o
            r0.setOnFrameAvailableListener(r4)
            r15.f34436o = r4
            r15.mo33156f()
            return
        L_0x035c:
            r0 = move-exception
            com.google.android.gms.internal.ads.jq0 r1 = r15.f34423b
            r1.mo32924c()
            android.graphics.SurfaceTexture r1 = r15.f34436o
            r1.setOnFrameAvailableListener(r4)
            r15.f34436o = r4
            r15.mo33156f()
            throw r0
        L_0x036d:
            javax.microedition.khronos.egl.EGL10 r0 = r15.f34444w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "EGL initialization failed: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0388
            java.lang.String r0 = r1.concat(r0)
            goto L_0x038d
        L_0x0388:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x038d:
            com.google.android.gms.internal.ads.co0.zzg(r0)
            com.google.android.gms.internal.ads.nn0 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo18592s(r2, r0)
            r15.mo33156f()
            java.util.concurrent.CountDownLatch r0 = r15.f34442u
            r0.countDown()
            return
        L_0x03a7:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.co0.zzg(r0)
            java.util.concurrent.CountDownLatch r0 = r15.f34442u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kq0.run():void");
    }

    public final void zza() {
        synchronized (this.f34443v) {
            this.f34443v.notifyAll();
        }
    }
}
