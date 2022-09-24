package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x24 {

    /* renamed from: g */
    private static final ArrayDeque<w24> f41011g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f41012h = new Object();

    /* renamed from: a */
    private final MediaCodec f41013a;

    /* renamed from: b */
    private final HandlerThread f41014b;

    /* renamed from: c */
    private Handler f41015c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f41016d = new AtomicReference<>();

    /* renamed from: e */
    private final rx1 f41017e;

    /* renamed from: f */
    private boolean f41018f;

    public x24(MediaCodec mediaCodec, HandlerThread handlerThread) {
        rx1 rx1 = new rx1(ov1.f36608a);
        this.f41013a = mediaCodec;
        this.f41014b = handlerThread;
        this.f41017e = rx1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.gms.internal.ads.w24} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.gms.internal.ads.w24} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m39340a(com.google.android.gms.internal.ads.x24 r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0044
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f41016d
            r9.set(r0)
            goto L_0x005e
        L_0x001c:
            com.google.android.gms.internal.ads.rx1 r9 = r9.f41017e
            r9.mo34633e()
            goto L_0x005e
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.w24 r1 = (com.google.android.gms.internal.ads.w24) r1
            int r3 = r1.f40679a
            android.media.MediaCodec$CryptoInfo r5 = r1.f40682d
            long r6 = r1.f40683e
            int r8 = r1.f40684f
            java.lang.Object r10 = f41012h     // Catch:{ RuntimeException -> 0x003d }
            monitor-enter(r10)     // Catch:{ RuntimeException -> 0x003d }
            android.media.MediaCodec r2 = r9.f41013a     // Catch:{ all -> 0x003a }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x003a }
            monitor-exit(r10)     // Catch:{ all -> 0x003a }
            goto L_0x005e
        L_0x003a:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ RuntimeException -> 0x003d }
        L_0x003d:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f41016d
            r9.set(r10)
            goto L_0x005e
        L_0x0044:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.w24 r1 = (com.google.android.gms.internal.ads.w24) r1
            int r3 = r1.f40679a
            int r5 = r1.f40681c
            long r6 = r1.f40683e
            int r8 = r1.f40684f
            android.media.MediaCodec r2 = r9.f41013a     // Catch:{ RuntimeException -> 0x0058 }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f41016d
            r9.set(r10)
        L_0x005e:
            if (r1 == 0) goto L_0x006b
            java.util.ArrayDeque<com.google.android.gms.internal.ads.w24> r9 = f41011g
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x0068 }
            monitor-exit(r9)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0068 }
            throw r10
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x24.m39340a(com.google.android.gms.internal.ads.x24, android.os.Message):void");
    }

    /* renamed from: g */
    private static w24 m39341g() {
        ArrayDeque<w24> arrayDeque = f41011g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                w24 w24 = new w24();
                return w24;
            }
            w24 removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: h */
    private final void m39342h() {
        RuntimeException andSet = this.f41016d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: i */
    private static byte[] m39343i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: j */
    private static int[] m39344j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: b */
    public final void mo35710b() {
        if (this.f41018f) {
            try {
                Handler handler = this.f41015c;
                int i = d13.f20195a;
                handler.removeCallbacksAndMessages((Object) null);
                this.f41017e.mo34631c();
                this.f41015c.obtainMessage(2).sendToTarget();
                this.f41017e.mo34629a();
                m39342h();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo35711c(int i, int i2, int i3, long j, int i4) {
        m39342h();
        w24 g = m39341g();
        g.mo35548a(i, 0, i3, j, i4);
        Handler handler = this.f41015c;
        int i5 = d13.f20195a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    /* renamed from: d */
    public final void mo35712d(int i, int i2, o21 o21, long j, int i3) {
        m39342h();
        w24 g = m39341g();
        g.mo35548a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.f40682d;
        cryptoInfo.numSubSamples = o21.f36251f;
        cryptoInfo.numBytesOfClearData = m39344j(o21.f36249d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m39344j(o21.f36250e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = m39343i(o21.f36247b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = m39343i(o21.f36246a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = o21.f36248c;
        if (d13.f20195a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(o21.f36252g, o21.f36253h));
        }
        this.f41015c.obtainMessage(1, g).sendToTarget();
    }

    /* renamed from: e */
    public final void mo35713e() {
        if (this.f41018f) {
            mo35710b();
            this.f41014b.quit();
        }
        this.f41018f = false;
    }

    /* renamed from: f */
    public final void mo35714f() {
        if (!this.f41018f) {
            this.f41014b.start();
            this.f41015c = new v24(this, this.f41014b.getLooper());
            this.f41018f = true;
        }
    }
}
