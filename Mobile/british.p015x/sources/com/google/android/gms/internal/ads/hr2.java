package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hr2 {

    /* renamed from: a */
    private final C6483e f32813a;

    /* renamed from: b */
    private final Object f32814b = new Object();

    /* renamed from: c */
    private volatile long f32815c = 0;
    @GuardedBy("lock")

    /* renamed from: d */
    private volatile int f32816d = 1;

    public hr2(C6483e eVar) {
        this.f32813a = eVar;
    }

    /* renamed from: e */
    private final void m32923e() {
        long currentTimeMillis = this.f32813a.currentTimeMillis();
        synchronized (this.f32814b) {
            if (this.f32816d == 3) {
                if (this.f32815c + ((Long) C8311wv.m39277c().mo18570b(p00.f37206s4)).longValue() <= currentTimeMillis) {
                    this.f32816d = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32924f(int r5, int r6) {
        /*
            r4 = this;
            r4.m32923e()
            a5.e r0 = r4.f32813a
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r4.f32814b
            monitor-enter(r2)
            int r3 = r4.f32816d     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f32816d = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f32816d     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f32815c = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hr2.m32924f(int, int):void");
    }

    /* renamed from: a */
    public final void mo32437a() {
        m32924f(2, 3);
    }

    /* renamed from: b */
    public final void mo32438b(boolean z) {
        if (z) {
            m32924f(1, 2);
        } else {
            m32924f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean mo32439c() {
        boolean z;
        synchronized (this.f32814b) {
            m32923e();
            z = this.f32816d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo32440d() {
        boolean z;
        synchronized (this.f32814b) {
            m32923e();
            z = this.f32816d == 2;
        }
        return z;
    }
}
