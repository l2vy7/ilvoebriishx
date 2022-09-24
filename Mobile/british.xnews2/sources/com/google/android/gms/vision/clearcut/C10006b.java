package com.google.android.gms.vision.clearcut;

import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.vision.clearcut.b */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C10006b {

    /* renamed from: a */
    private final long f47091a = Math.round(30000.0d);

    /* renamed from: b */
    private final Object f47092b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private long f47093c = Long.MIN_VALUE;

    public C10006b(double d) {
    }

    /* renamed from: a */
    public final boolean mo39501a() {
        synchronized (this.f47092b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f47093c + this.f47091a > currentTimeMillis) {
                return false;
            }
            this.f47093c = currentTimeMillis;
            return true;
        }
    }
}
