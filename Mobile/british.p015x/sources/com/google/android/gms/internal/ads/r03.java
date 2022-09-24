package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r03 implements C7377d.C7378a, C7377d.C7379b {

    /* renamed from: b */
    protected final r13 f38449b;

    /* renamed from: c */
    private final String f38450c;

    /* renamed from: d */
    private final String f38451d;

    /* renamed from: e */
    private final LinkedBlockingQueue<C8218u8> f38452e = new LinkedBlockingQueue<>();

    /* renamed from: f */
    private final HandlerThread f38453f;

    public r03(Context context, String str, String str2) {
        this.f38450c = str;
        this.f38451d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f38453f = handlerThread;
        handlerThread.start();
        r13 r13 = new r13(context, handlerThread.getLooper(), this, this, 9200000);
        this.f38449b = r13;
        r13.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    static C8218u8 m36843a() {
        C7600d8 f0 = C8218u8.m38216f0();
        f0.mo31138E0(32768);
        return (C8218u8) f0.mo32424p();
    }

    /* renamed from: b */
    public final C8218u8 mo34450b(int i) {
        C8218u8 u8Var;
        try {
            u8Var = this.f38452e.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            u8Var = null;
        }
        return u8Var == null ? m36843a() : u8Var;
    }

    /* renamed from: c */
    public final void mo34451c() {
        r13 r13 = this.f38449b;
        if (r13 == null) {
            return;
        }
        if (r13.isConnected() || this.f38449b.isConnecting()) {
            this.f38449b.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final u13 mo34452d() {
        try {
            return this.f38449b.mo34473e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo34451c();
        r3.f38453f.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f38452e.put(m36843a());
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
            com.google.android.gms.internal.ads.u13 r4 = r3.mo34452d()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzfnp r0 = new com.google.android.gms.internal.ads.zzfnp     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f38450c     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f38451d     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzfnr r4 = r4.mo35083n6(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.u8 r4 = r4.mo36284C0()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.u8> r0 = r3.f38452e     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo34451c()
            android.os.HandlerThread r4 = r3.f38453f
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.u8> r4 = r3.f38452e     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.u8 r0 = m36843a()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo34451c()
            android.os.HandlerThread r0 = r3.f38453f
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r03.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f38452e.put(m36843a());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.f38452e.put(m36843a());
        } catch (InterruptedException unused) {
        }
    }
}
