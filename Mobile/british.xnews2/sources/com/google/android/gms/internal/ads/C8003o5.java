package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.o5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8003o5 extends Thread {

    /* renamed from: b */
    private final BlockingQueue<C8215u5<?>> f36277b;

    /* renamed from: c */
    private final C7967n5 f36278c;

    /* renamed from: d */
    private final C7634e5 f36279d;

    /* renamed from: e */
    private volatile boolean f36280e = false;

    /* renamed from: f */
    private final C7892l5 f36281f;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.n5, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.u5<?>>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.n5, com.google.android.gms.internal.ads.e5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.e5, com.google.android.gms.internal.ads.l5] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8003o5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C8215u5<?>> r2, com.google.android.gms.internal.ads.C7967n5 r3, com.google.android.gms.internal.ads.C7634e5 r4, com.google.android.gms.internal.ads.C7892l5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f36280e = r5
            r0.f36277b = r1
            r0.f36278c = r2
            r0.f36279d = r3
            r0.f36281f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8003o5.<init>(java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.n5, com.google.android.gms.internal.ads.e5, com.google.android.gms.internal.ads.l5, byte[]):void");
    }

    /* renamed from: b */
    private void m35565b() throws InterruptedException {
        C8215u5 take = this.f36277b.take();
        SystemClock.elapsedRealtime();
        take.mo35107k(3);
        try {
            take.zzm("network-queue-take");
            take.zzw();
            TrafficStats.setThreadStatsTag(take.zzc());
            C8074q5 zza = this.f36278c.zza(take);
            take.zzm("network-http-complete");
            if (!zza.f37866e || !take.zzv()) {
                C7492a6 a = take.mo28553a(zza);
                take.zzm("network-parse-complete");
                if (a.f29537b != null) {
                    this.f36279d.mo31473a(take.zzj(), a.f29537b);
                    take.zzm("network-cache-written");
                }
                take.zzq();
                this.f36281f.mo33281b(take, a, (Runnable) null);
                take.mo35106j(a);
                take.mo35107k(4);
                return;
            }
            take.mo35104d("not-modified");
            take.mo35105i();
        } catch (C7635e6 e) {
            SystemClock.elapsedRealtime();
            this.f36281f.mo33280a(take, e);
            take.mo35105i();
        } catch (Exception e2) {
            C7745h6.m32820c(e2, "Unhandled exception %s", e2.toString());
            C7635e6 e6Var = new C7635e6((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.f36281f.mo33280a(take, e6Var);
            take.mo35105i();
        } finally {
            take.mo35107k(4);
        }
    }

    /* renamed from: a */
    public final void mo33835a() {
        this.f36280e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m35565b();
            } catch (InterruptedException unused) {
                if (this.f36280e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C7745h6.m32819b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
