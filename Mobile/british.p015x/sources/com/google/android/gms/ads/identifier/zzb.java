package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class zzb extends Thread {

    /* renamed from: b */
    private final WeakReference<AdvertisingIdClient> f27776b;

    /* renamed from: c */
    private final long f27777c;

    /* renamed from: d */
    final CountDownLatch f27778d = new CountDownLatch(1);

    /* renamed from: e */
    boolean f27779e = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        this.f27776b = new WeakReference<>(advertisingIdClient);
        this.f27777c = j;
        start();
    }

    /* renamed from: a */
    private final void m28789a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f27776b.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f27779e = true;
        }
    }

    public final void run() {
        try {
            if (!this.f27778d.await(this.f27777c, TimeUnit.MILLISECONDS)) {
                m28789a();
            }
        } catch (InterruptedException unused) {
            m28789a();
        }
    }
}
