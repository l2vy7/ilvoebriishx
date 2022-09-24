package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t03 implements C7377d.C7378a, C7377d.C7379b {

    /* renamed from: b */
    protected final r13 f39227b;

    /* renamed from: c */
    private final String f39228c;

    /* renamed from: d */
    private final String f39229d;

    /* renamed from: e */
    private final LinkedBlockingQueue<zzfoa> f39230e;

    /* renamed from: f */
    private final HandlerThread f39231f;

    /* renamed from: g */
    private final k03 f39232g;

    /* renamed from: h */
    private final long f39233h = System.currentTimeMillis();

    /* renamed from: i */
    private final int f39234i;

    public t03(Context context, int i, int i2, String str, String str2, String str3, k03 k03) {
        this.f39228c = str;
        this.f39234i = i2;
        this.f39229d = str2;
        this.f39232g = k03;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f39231f = handlerThread;
        handlerThread.start();
        r13 r13 = new r13(context, handlerThread.getLooper(), this, this, 19621000);
        this.f39227b = r13;
        this.f39230e = new LinkedBlockingQueue<>();
        r13.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    static zzfoa m37626a() {
        return new zzfoa((byte[]) null, 1);
    }

    /* renamed from: e */
    private final void m37627e(int i, long j, Exception exc) {
        this.f39232g.mo33005c(i, System.currentTimeMillis() - j, exc);
    }

    /* renamed from: b */
    public final zzfoa mo34841b(int i) {
        zzfoa zzfoa;
        try {
            zzfoa = this.f39230e.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m37627e(AdError.INTERSTITIAL_AD_TIMEOUT, this.f39233h, e);
            zzfoa = null;
        }
        m37627e(3004, this.f39233h, (Exception) null);
        if (zzfoa != null) {
            if (zzfoa.f43057d == 7) {
                k03.m33809g(3);
            } else {
                k03.m33809g(2);
            }
        }
        return zzfoa == null ? m37626a() : zzfoa;
    }

    /* renamed from: c */
    public final void mo34842c() {
        r13 r13 = this.f39227b;
        if (r13 == null) {
            return;
        }
        if (r13.isConnected() || this.f39227b.isConnecting()) {
            this.f39227b.disconnect();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final u13 mo34843d() {
        try {
            return this.f39227b.mo34473e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void onConnected(Bundle bundle) {
        u13 d = mo34843d();
        if (d != null) {
            try {
                zzfoa o6 = d.mo35084o6(new zzfny(1, this.f39234i, this.f39228c, this.f39229d));
                m37627e(5011, this.f39233h, (Exception) null);
                this.f39230e.put(o6);
            } catch (Throwable th) {
                mo34842c();
                this.f39231f.quit();
                throw th;
            }
            mo34842c();
            this.f39231f.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            m37627e(4012, this.f39233h, (Exception) null);
            this.f39230e.put(m37626a());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            m37627e(4011, this.f39233h, (Exception) null);
            this.f39230e.put(m37626a());
        } catch (InterruptedException unused) {
        }
    }
}
