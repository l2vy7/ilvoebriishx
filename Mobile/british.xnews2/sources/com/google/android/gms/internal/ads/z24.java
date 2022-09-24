package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z24 extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f42289a = new Object();

    /* renamed from: b */
    private final HandlerThread f42290b;

    /* renamed from: c */
    private Handler f42291c;

    /* renamed from: d */
    private final e34 f42292d;

    /* renamed from: e */
    private final e34 f42293e;

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f42294f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f42295g;

    /* renamed from: h */
    private MediaFormat f42296h;

    /* renamed from: i */
    private MediaFormat f42297i;

    /* renamed from: j */
    private MediaCodec.CodecException f42298j;

    /* renamed from: k */
    private long f42299k;

    /* renamed from: l */
    private boolean f42300l;

    /* renamed from: m */
    private IllegalStateException f42301m;

    z24(HandlerThread handlerThread) {
        this.f42290b = handlerThread;
        this.f42292d = new e34();
        this.f42293e = new e34();
        this.f42294f = new ArrayDeque<>();
        this.f42295g = new ArrayDeque<>();
    }

    /* renamed from: h */
    private final void m40129h(MediaFormat mediaFormat) {
        this.f42293e.mo31466b(-2);
        this.f42295g.add(mediaFormat);
    }

    /* renamed from: i */
    private final void m40130i() {
        if (!this.f42295g.isEmpty()) {
            this.f42297i = this.f42295g.getLast();
        }
        this.f42292d.mo31467c();
        this.f42293e.mo31467c();
        this.f42294f.clear();
        this.f42295g.clear();
        this.f42298j = null;
    }

    /* renamed from: j */
    private final void m40131j() {
        IllegalStateException illegalStateException = this.f42301m;
        if (illegalStateException != null) {
            this.f42301m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: k */
    private final void m40132k() {
        MediaCodec.CodecException codecException = this.f42298j;
        if (codecException != null) {
            this.f42298j = null;
            throw codecException;
        }
    }

    /* renamed from: l */
    private final void m40133l(IllegalStateException illegalStateException) {
        synchronized (this.f42289a) {
            this.f42301m = illegalStateException;
        }
    }

    /* renamed from: m */
    private final boolean m40134m() {
        return this.f42299k > 0 || this.f42300l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35998a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f42289a
            monitor-enter(r0)
            boolean r1 = r3.m40134m()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x000c:
            r3.m40131j()     // Catch:{ all -> 0x0023 }
            r3.m40132k()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.e34 r1 = r3.f42292d     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.mo31468d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.e34 r1 = r3.f42292d     // Catch:{ all -> 0x0023 }
            int r2 = r1.mo31465a()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z24.mo35998a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35999b(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f42289a
            monitor-enter(r0)
            boolean r1 = r9.m40134m()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x000c:
            r9.m40131j()     // Catch:{ all -> 0x004e }
            r9.m40132k()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.e34 r1 = r9.f42293e     // Catch:{ all -> 0x004e }
            boolean r1 = r1.mo31468d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            com.google.android.gms.internal.ads.e34 r1 = r9.f42293e     // Catch:{ all -> 0x004e }
            int r1 = r1.mo31465a()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.f42296h     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.nu1.m20743b(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f42294f     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f42295g     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.f42296h = r10     // Catch:{ all -> 0x004e }
            r1 = -2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z24.mo35999b(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: c */
    public final MediaFormat mo36000c() {
        MediaFormat mediaFormat;
        synchronized (this.f42289a) {
            mediaFormat = this.f42296h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final void mo36001d(Runnable runnable) {
        synchronized (this.f42289a) {
            this.f42299k++;
            Handler handler = this.f42291c;
            int i = d13.f20195a;
            handler.post(new y24(this, runnable));
        }
    }

    /* renamed from: e */
    public final void mo36002e(MediaCodec mediaCodec) {
        nu1.m20747f(this.f42291c == null);
        this.f42290b.start();
        Handler handler = new Handler(this.f42290b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f42291c = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo36003f(Runnable runnable) {
        synchronized (this.f42289a) {
            if (!this.f42300l) {
                long j = this.f42299k - 1;
                this.f42299k = j;
                if (j <= 0) {
                    if (j < 0) {
                        m40133l(new IllegalStateException());
                    } else {
                        m40130i();
                        try {
                            ((p24) runnable).f37302b.start();
                        } catch (IllegalStateException e) {
                            m40133l(e);
                        } catch (Exception e2) {
                            m40133l(new IllegalStateException(e2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo36004g() {
        synchronized (this.f42289a) {
            this.f42300l = true;
            this.f42290b.quit();
            m40130i();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f42289a) {
            this.f42298j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f42289a) {
            this.f42292d.mo31466b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f42289a) {
            MediaFormat mediaFormat = this.f42297i;
            if (mediaFormat != null) {
                m40129h(mediaFormat);
                this.f42297i = null;
            }
            this.f42293e.mo31466b(i);
            this.f42294f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f42289a) {
            m40129h(mediaFormat);
            this.f42297i = null;
        }
    }
}
