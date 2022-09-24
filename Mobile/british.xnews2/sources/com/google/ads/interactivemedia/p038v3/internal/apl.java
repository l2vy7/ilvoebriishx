package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apl */
/* compiled from: IMASDK */
final class apl implements C7377d.C7378a, C7377d.C7379b {

    /* renamed from: a */
    protected final apo f15529a;

    /* renamed from: b */
    private final String f15530b;

    /* renamed from: c */
    private final String f15531c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C4385u> f15532d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private final HandlerThread f15533e;

    public apl(Context context, String str, String str2) {
        this.f15530b = str;
        this.f15531c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f15533e = handlerThread;
        handlerThread.start();
        apo apo = new apo(context, handlerThread.getLooper(), this, this);
        this.f15529a = apo;
        apo.checkAvailabilityAndConnect();
    }

    /* renamed from: d */
    static C4385u m14501d() {
        C4115k g = C4385u.m19061g();
        g.mo16044B(32768);
        return (C4385u) g.mo15385ae();
    }

    /* renamed from: a */
    public final C4385u mo14183a() {
        C4385u uVar;
        try {
            uVar = this.f15532d.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            uVar = null;
        }
        return uVar == null ? m14501d() : uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final apt mo14184b() {
        try {
            return this.f15529a.mo14189a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo14185c() {
        apo apo = this.f15529a;
        if (apo == null) {
            return;
        }
        if (apo.isConnected() || this.f15529a.isConnecting()) {
            this.f15529a.disconnect();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo14185c();
        r3.f15533e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f15532d.put(m14501d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.apt r4 = r3.mo14184b()
            if (r4 == 0) goto L_0x0039
            com.google.ads.interactivemedia.v3.internal.app r0 = new com.google.ads.interactivemedia.v3.internal.app     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f15530b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f15531c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.ads.interactivemedia.v3.internal.apq r4 = r4.mo14195e(r0)     // Catch:{ all -> 0x0025 }
            com.google.ads.interactivemedia.v3.internal.u r4 = r4.mo14191a()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.ads.interactivemedia.v3.internal.u> r0 = r3.f15532d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo14185c()
            android.os.HandlerThread r4 = r3.f15533e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.ads.interactivemedia.v3.internal.u> r4 = r3.f15532d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.ads.interactivemedia.v3.internal.u r0 = m14501d()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo14185c()
            android.os.HandlerThread r0 = r3.f15533e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.apl.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f15532d.put(m14501d());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.f15532d.put(m14501d());
        } catch (InterruptedException unused) {
        }
    }
}
