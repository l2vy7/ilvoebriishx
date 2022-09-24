package p186z5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.android.gms.common.images.C7364a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: z5.a */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public class C11141a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f50133a;

    /* renamed from: b */
    private final Object f50134b;
    /* access modifiers changed from: private */
    @GuardedBy("cameraLock")

    /* renamed from: c */
    public Camera f50135c;

    /* renamed from: d */
    private int f50136d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f50137e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7364a f50138f;

    /* renamed from: g */
    private float f50139g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f50140h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f50141i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f50142j;

    /* renamed from: k */
    private String f50143k;

    /* renamed from: l */
    private boolean f50144l;

    /* renamed from: m */
    private Thread f50145m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C11143b f50146n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<byte[], ByteBuffer> f50147o;

    /* renamed from: z5.a$d */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    static class C6470d {

        /* renamed from: a */
        private C7364a f26554a;

        /* renamed from: b */
        private C7364a f26555b;

        public C6470d(Camera.Size size, @Nullable Camera.Size size2) {
            this.f26554a = new C7364a(size.width, size.height);
            if (size2 != null) {
                this.f26555b = new C7364a(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public final C7364a mo24301a() {
            return this.f26554a;
        }

        @Nullable
        /* renamed from: b */
        public final C7364a mo24302b() {
            return this.f26555b;
        }
    }

    /* renamed from: z5.a$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C11142a {

        /* renamed from: a */
        private final C11145b<?> f50148a;

        /* renamed from: b */
        private C11141a f50149b;

        public C11142a(Context context, C11145b<?> bVar) {
            C11141a aVar = new C11141a();
            this.f50149b = aVar;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar != null) {
                this.f50148a = bVar;
                Context unused = aVar.f50133a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        /* renamed from: a */
        public C11141a mo43439a() {
            C11141a aVar = this.f50149b;
            aVar.getClass();
            C11143b unused = aVar.f50146n = new C11143b(this.f50148a);
            return this.f50149b;
        }

        /* renamed from: b */
        public C11142a mo43440b(boolean z) {
            boolean unused = this.f50149b.f50142j = z;
            return this;
        }

        /* renamed from: c */
        public C11142a mo43441c(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.f50149b.f50140h = i;
            int unused2 = this.f50149b.f50141i = i2;
            return this;
        }
    }

    /* renamed from: z5.a$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private class C11143b implements Runnable {

        /* renamed from: b */
        private C11145b<?> f50150b;

        /* renamed from: c */
        private long f50151c = SystemClock.elapsedRealtime();

        /* renamed from: d */
        private final Object f50152d = new Object();

        /* renamed from: e */
        private boolean f50153e = true;

        /* renamed from: f */
        private long f50154f;

        /* renamed from: g */
        private int f50155g = 0;

        /* renamed from: h */
        private ByteBuffer f50156h;

        C11143b(C11145b<?> bVar) {
            this.f50150b = bVar;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"Assert"})
        /* renamed from: a */
        public final void mo43442a() {
            this.f50150b.mo24324d();
            this.f50150b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo43443b(boolean z) {
            synchronized (this.f50152d) {
                this.f50153e = z;
                this.f50152d.notifyAll();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo43444c(byte[] bArr, Camera camera) {
            synchronized (this.f50152d) {
                ByteBuffer byteBuffer = this.f50156h;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.f50156h = null;
                }
                if (!C11141a.this.f50147o.containsKey(bArr)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.f50154f = SystemClock.elapsedRealtime() - this.f50151c;
                this.f50155g++;
                this.f50156h = (ByteBuffer) C11141a.this.f50147o.get(bArr);
                this.f50152d.notifyAll();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r6.f50150b.mo43447c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            p186z5.C11141a.m49723j(r6.f50157i).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x001f A[Catch:{ InterruptedException -> 0x0011 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x001d A[SYNTHETIC] */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f50152d
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f50153e     // Catch:{ all -> 0x009a }
                if (r1 == 0) goto L_0x001b
                java.nio.ByteBuffer r2 = r6.f50156h     // Catch:{ all -> 0x009a }
                if (r2 != 0) goto L_0x001b
                java.lang.Object r1 = r6.f50152d     // Catch:{ InterruptedException -> 0x0011 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                java.lang.String r2 = "CameraSource"
                java.lang.String r3 = "Frame processing loop terminated."
                android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x009a }
                monitor-exit(r0)     // Catch:{ all -> 0x009a }
                return
            L_0x001b:
                if (r1 != 0) goto L_0x001f
                monitor-exit(r0)     // Catch:{ all -> 0x009a }
                return
            L_0x001f:
                z5.c$a r1 = new z5.c$a     // Catch:{ all -> 0x009a }
                r1.<init>()     // Catch:{ all -> 0x009a }
                java.nio.ByteBuffer r2 = r6.f50156h     // Catch:{ all -> 0x009a }
                z5.a r3 = p186z5.C11141a.this     // Catch:{ all -> 0x009a }
                com.google.android.gms.common.images.a r3 = r3.f50138f     // Catch:{ all -> 0x009a }
                int r3 = r3.mo30006b()     // Catch:{ all -> 0x009a }
                z5.a r4 = p186z5.C11141a.this     // Catch:{ all -> 0x009a }
                com.google.android.gms.common.images.a r4 = r4.f50138f     // Catch:{ all -> 0x009a }
                int r4 = r4.mo30005a()     // Catch:{ all -> 0x009a }
                r5 = 17
                z5.c$a r1 = r1.mo24308c(r2, r3, r4, r5)     // Catch:{ all -> 0x009a }
                int r2 = r6.f50155g     // Catch:{ all -> 0x009a }
                z5.c$a r1 = r1.mo24307b(r2)     // Catch:{ all -> 0x009a }
                long r2 = r6.f50154f     // Catch:{ all -> 0x009a }
                z5.c$a r1 = r1.mo24310e(r2)     // Catch:{ all -> 0x009a }
                z5.a r2 = p186z5.C11141a.this     // Catch:{ all -> 0x009a }
                int r2 = r2.f50137e     // Catch:{ all -> 0x009a }
                z5.c$a r1 = r1.mo24309d(r2)     // Catch:{ all -> 0x009a }
                z5.c r1 = r1.mo24306a()     // Catch:{ all -> 0x009a }
                java.nio.ByteBuffer r2 = r6.f50156h     // Catch:{ all -> 0x009a }
                r3 = 0
                r6.f50156h = r3     // Catch:{ all -> 0x009a }
                monitor-exit(r0)     // Catch:{ all -> 0x009a }
                z5.b<?> r0 = r6.f50150b     // Catch:{ Exception -> 0x0075 }
                r0.mo43447c(r1)     // Catch:{ Exception -> 0x0075 }
                z5.a r0 = p186z5.C11141a.this
                android.hardware.Camera r0 = r0.f50135c
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x0073:
                r0 = move-exception
                goto L_0x008c
            L_0x0075:
                r0 = move-exception
                java.lang.String r1 = "CameraSource"
                java.lang.String r3 = "Exception thrown from receiver."
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0073 }
                z5.a r0 = p186z5.C11141a.this
                android.hardware.Camera r0 = r0.f50135c
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x008c:
                z5.a r1 = p186z5.C11141a.this
                android.hardware.Camera r1 = r1.f50135c
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x009a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x009a }
                goto L_0x009e
            L_0x009d:
                throw r1
            L_0x009e:
                goto L_0x009d
            */
            throw new UnsupportedOperationException("Method not decompiled: p186z5.C11141a.C11143b.run():void");
        }
    }

    /* renamed from: z5.a$c */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    private class C11144c implements Camera.PreviewCallback {
        private C11144c() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            C11141a.this.f50146n.mo43444c(bArr, camera);
        }
    }

    private C11141a() {
        this.f50134b = new Object();
        this.f50136d = 0;
        this.f50139g = 30.0f;
        this.f50140h = 1024;
        this.f50141i = 768;
        this.f50142j = false;
        this.f50147o = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    private final byte[] m49721h(C7364a aVar) {
        double a = (double) ((long) (aVar.mo30005a() * aVar.mo30006b() * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(a);
        byte[] bArr = new byte[(((int) Math.ceil(a / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f50147o.put(bArr, wrap);
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ef  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.hardware.Camera m49724k() throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f50136d
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x000b:
            int r5 = android.hardware.Camera.getNumberOfCameras()
            r6 = -1
            if (r4 >= r5) goto L_0x001d
            android.hardware.Camera.getCameraInfo(r4, r2)
            int r5 = r2.facing
            if (r5 != r1) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x001d:
            r4 = -1
        L_0x001e:
            if (r4 == r6) goto L_0x0234
            android.hardware.Camera r1 = android.hardware.Camera.open(r4)
            int r2 = r0.f50140h
            int r5 = r0.f50141i
            android.hardware.Camera$Parameters r6 = r1.getParameters()
            java.util.List r7 = r6.getSupportedPreviewSizes()
            java.util.List r6 = r6.getSupportedPictureSizes()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x003d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007d
            java.lang.Object r10 = r9.next()
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10
            int r11 = r10.width
            float r11 = (float) r11
            int r12 = r10.height
            float r12 = (float) r12
            float r11 = r11 / r12
            java.util.Iterator r12 = r6.iterator()
        L_0x0054:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x003d
            java.lang.Object r13 = r12.next()
            android.hardware.Camera$Size r13 = (android.hardware.Camera.Size) r13
            int r14 = r13.width
            float r14 = (float) r14
            int r15 = r13.height
            float r15 = (float) r15
            float r14 = r14 / r15
            float r14 = r11 - r14
            float r14 = java.lang.Math.abs(r14)
            r15 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0054
            z5.a$d r11 = new z5.a$d
            r11.<init>(r10, r13)
            r8.add(r11)
            goto L_0x003d
        L_0x007d:
            int r6 = r8.size()
            java.lang.String r9 = "CameraSource"
            r10 = 0
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = "No preview sizes have a corresponding same-aspect-ratio picture size"
            android.util.Log.w(r9, r6)
            java.util.Iterator r6 = r7.iterator()
        L_0x008f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = r6.next()
            android.hardware.Camera$Size r7 = (android.hardware.Camera.Size) r7
            z5.a$d r11 = new z5.a$d
            r11.<init>(r7, r10)
            r8.add(r11)
            goto L_0x008f
        L_0x00a4:
            int r6 = r8.size()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r12 = r10
            r11 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b0:
            if (r11 >= r6) goto L_0x00d8
            java.lang.Object r14 = r8.get(r11)
            int r11 = r11 + 1
            z5.a$d r14 = (p186z5.C11141a.C6470d) r14
            com.google.android.gms.common.images.a r15 = r14.mo24301a()
            int r16 = r15.mo30006b()
            int r16 = r16 - r2
            int r16 = java.lang.Math.abs(r16)
            int r15 = r15.mo30005a()
            int r15 = r15 - r5
            int r15 = java.lang.Math.abs(r15)
            int r15 = r16 + r15
            if (r15 >= r13) goto L_0x00b0
            r12 = r14
            r13 = r15
            goto L_0x00b0
        L_0x00d8:
            if (r12 == 0) goto L_0x022c
            com.google.android.gms.common.images.a r2 = r12.mo24302b()
            com.google.android.gms.common.images.a r5 = r12.mo24301a()
            r0.f50138f = r5
            float r5 = r0.f50139g
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            android.hardware.Camera$Parameters r6 = r1.getParameters()
            java.util.List r6 = r6.getSupportedPreviewFpsRange()
            java.util.Iterator r6 = r6.iterator()
            r8 = r10
        L_0x00f8:
            boolean r11 = r6.hasNext()
            r12 = 1
            if (r11 == 0) goto L_0x011b
            java.lang.Object r11 = r6.next()
            int[] r11 = (int[]) r11
            r13 = r11[r3]
            int r13 = r5 - r13
            r12 = r11[r12]
            int r12 = r5 - r12
            int r13 = java.lang.Math.abs(r13)
            int r12 = java.lang.Math.abs(r12)
            int r13 = r13 + r12
            if (r13 >= r7) goto L_0x00f8
            r8 = r11
            r7 = r13
            goto L_0x00f8
        L_0x011b:
            if (r8 == 0) goto L_0x0224
            android.hardware.Camera$Parameters r5 = r1.getParameters()
            if (r2 == 0) goto L_0x012e
            int r6 = r2.mo30006b()
            int r2 = r2.mo30005a()
            r5.setPictureSize(r6, r2)
        L_0x012e:
            com.google.android.gms.common.images.a r2 = r0.f50138f
            int r2 = r2.mo30006b()
            com.google.android.gms.common.images.a r6 = r0.f50138f
            int r6 = r6.mo30005a()
            r5.setPreviewSize(r2, r6)
            r2 = r8[r3]
            r6 = r8[r12]
            r5.setPreviewFpsRange(r2, r6)
            r2 = 17
            r5.setPreviewFormat(r2)
            android.content.Context r2 = r0.f50133a
            java.lang.String r6 = "window"
            java.lang.Object r2 = r2.getSystemService(r6)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            if (r2 == 0) goto L_0x0185
            if (r2 == r12) goto L_0x0182
            r6 = 2
            if (r2 == r6) goto L_0x017f
            r6 = 3
            if (r2 == r6) goto L_0x017c
            r6 = 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Bad rotation value: "
            r7.append(r6)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            android.util.Log.e(r9, r2)
            goto L_0x0185
        L_0x017c:
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x0186
        L_0x017f:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0186
        L_0x0182:
            r2 = 90
            goto L_0x0186
        L_0x0185:
            r2 = 0
        L_0x0186:
            android.hardware.Camera$CameraInfo r6 = new android.hardware.Camera$CameraInfo
            r6.<init>()
            android.hardware.Camera.getCameraInfo(r4, r6)
            int r4 = r6.facing
            if (r4 != r12) goto L_0x019c
            int r4 = r6.orientation
            int r4 = r4 + r2
            int r4 = r4 % 360
            int r2 = 360 - r4
            int r2 = r2 % 360
            goto L_0x01a4
        L_0x019c:
            int r4 = r6.orientation
            int r4 = r4 - r2
            int r4 = r4 + 360
            int r4 = r4 % 360
            r2 = r4
        L_0x01a4:
            int r6 = r4 / 90
            r0.f50137e = r6
            r1.setDisplayOrientation(r2)
            r5.setRotation(r4)
            java.lang.String r2 = r0.f50143k
            if (r2 == 0) goto L_0x01d5
            java.util.List r2 = r5.getSupportedFocusModes()
            java.lang.String r4 = r0.f50143k
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x01c4
            java.lang.String r2 = r0.f50143k
            r5.setFocusMode(r2)
            goto L_0x01d5
        L_0x01c4:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r4 = r0.f50143k
            r2[r3] = r4
            java.lang.String r3 = "FocusMode %s is not supported on this device."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.util.Log.w(r9, r2)
            r0.f50143k = r10
        L_0x01d5:
            java.lang.String r2 = r0.f50143k
            if (r2 != 0) goto L_0x01f4
            boolean r2 = r0.f50142j
            if (r2 == 0) goto L_0x01f4
            java.util.List r2 = r5.getSupportedFocusModes()
            java.lang.String r3 = "continuous-video"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01ef
            r5.setFocusMode(r3)
            r0.f50143k = r3
            goto L_0x01f4
        L_0x01ef:
            java.lang.String r2 = "Camera auto focus is not supported on this device."
            android.util.Log.i(r9, r2)
        L_0x01f4:
            r1.setParameters(r5)
            z5.a$c r2 = new z5.a$c
            r2.<init>()
            r1.setPreviewCallbackWithBuffer(r2)
            com.google.android.gms.common.images.a r2 = r0.f50138f
            byte[] r2 = r0.m49721h(r2)
            r1.addCallbackBuffer(r2)
            com.google.android.gms.common.images.a r2 = r0.f50138f
            byte[] r2 = r0.m49721h(r2)
            r1.addCallbackBuffer(r2)
            com.google.android.gms.common.images.a r2 = r0.f50138f
            byte[] r2 = r0.m49721h(r2)
            r1.addCallbackBuffer(r2)
            com.google.android.gms.common.images.a r2 = r0.f50138f
            byte[] r2 = r0.m49721h(r2)
            r1.addCallbackBuffer(r2)
            return r1
        L_0x0224:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not find suitable preview frames per second range."
            r1.<init>(r2)
            throw r1
        L_0x022c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not find suitable preview size."
            r1.<init>(r2)
            throw r1
        L_0x0234:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not find requested camera."
            r1.<init>(r2)
            goto L_0x023d
        L_0x023c:
            throw r1
        L_0x023d:
            goto L_0x023c
        */
        throw new UnsupportedOperationException("Method not decompiled: p186z5.C11141a.m49724k():android.hardware.Camera");
    }

    /* renamed from: a */
    public void mo43436a() {
        synchronized (this.f50134b) {
            mo43438c();
            this.f50146n.mo43442a();
        }
    }

    /* renamed from: b */
    public C11141a mo43437b(SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.f50134b) {
            if (this.f50135c != null) {
                return this;
            }
            Camera k = m49724k();
            this.f50135c = k;
            k.setPreviewDisplay(surfaceHolder);
            this.f50135c.startPreview();
            this.f50145m = new Thread(this.f50146n);
            this.f50146n.mo43443b(true);
            this.f50145m.start();
            this.f50144l = false;
            return this;
        }
    }

    /* renamed from: c */
    public void mo43438c() {
        synchronized (this.f50134b) {
            this.f50146n.mo43443b(false);
            Thread thread = this.f50145m;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.f50145m = null;
            }
            Camera camera = this.f50135c;
            if (camera != null) {
                camera.stopPreview();
                this.f50135c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                try {
                    if (this.f50144l) {
                        this.f50135c.setPreviewTexture((SurfaceTexture) null);
                    } else {
                        this.f50135c.setPreviewDisplay((SurfaceHolder) null);
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                    Log.e("CameraSource", sb.toString());
                }
                this.f50135c.release();
                this.f50135c = null;
            }
            this.f50147o.clear();
        }
    }
}
