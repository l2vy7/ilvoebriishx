package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.g5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7708g5 extends Thread {

    /* renamed from: h */
    private static final boolean f32141h = C7745h6.f32629b;

    /* renamed from: b */
    private final BlockingQueue<C8215u5<?>> f32142b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C8215u5<?>> f32143c;

    /* renamed from: d */
    private final C7634e5 f32144d;

    /* renamed from: e */
    private volatile boolean f32145e = false;

    /* renamed from: f */
    private final C7783i6 f32146f;

    /* renamed from: g */
    private final C7892l5 f32147g;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.u5<?>>, com.google.android.gms.internal.ads.e5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.e5, com.google.android.gms.internal.ads.l5] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7708g5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C8215u5<?>> r2, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C8215u5<?>> r3, com.google.android.gms.internal.ads.C7634e5 r4, com.google.android.gms.internal.ads.C7892l5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f32145e = r5
            r0.f32142b = r1
            r0.f32143c = r2
            r0.f32144d = r3
            r0.f32147g = r4
            com.google.android.gms.internal.ads.i6 r1 = new com.google.android.gms.internal.ads.i6
            r3 = 0
            r1.<init>(r0, r2, r4, r3)
            r0.f32146f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7708g5.<init>(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.e5, com.google.android.gms.internal.ads.l5, byte[]):void");
    }

    /* renamed from: c */
    private void m32359c() throws InterruptedException {
        C8215u5 take = this.f32142b.take();
        take.zzm("cache-queue-take");
        take.mo35107k(1);
        try {
            take.zzw();
            C7597d5 zza = this.f32144d.zza(take.zzj());
            if (zza == null) {
                take.zzm("cache-miss");
                if (!this.f32146f.mo32559b(take)) {
                    this.f32143c.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza.mo31115a(currentTimeMillis)) {
                take.zzm("cache-hit-expired");
                take.zze(zza);
                if (!this.f32146f.mo32559b(take)) {
                    this.f32143c.put(take);
                }
                take.mo35107k(2);
                return;
            }
            take.zzm("cache-hit");
            C7492a6 a = take.mo28553a(new C8074q5(zza.f30636a, zza.f30642g));
            take.zzm("cache-hit-parsed");
            if (!a.mo30310c()) {
                take.zzm("cache-parsing-failed");
                this.f32144d.mo31474b(take.zzj(), true);
                take.zze((C7597d5) null);
                if (!this.f32146f.mo32559b(take)) {
                    this.f32143c.put(take);
                }
                take.mo35107k(2);
                return;
            }
            if (zza.f30641f < currentTimeMillis) {
                take.zzm("cache-hit-refresh-needed");
                take.zze(zza);
                a.f29539d = true;
                if (!this.f32146f.mo32559b(take)) {
                    this.f32147g.mo33281b(take, a, new C7671f5(this, take));
                } else {
                    this.f32147g.mo33281b(take, a, (Runnable) null);
                }
            } else {
                this.f32147g.mo33281b(take, a, (Runnable) null);
            }
            take.mo35107k(2);
        } finally {
            take.mo35107k(2);
        }
    }

    /* renamed from: b */
    public final void mo32007b() {
        this.f32145e = true;
        interrupt();
    }

    public final void run() {
        if (f32141h) {
            C7745h6.m32821d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f32144d.zzb();
        while (true) {
            try {
                m32359c();
            } catch (InterruptedException unused) {
                if (this.f32145e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C7745h6.m32819b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
