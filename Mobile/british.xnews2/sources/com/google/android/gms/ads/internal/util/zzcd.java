package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcd {

    /* renamed from: a */
    private long f27879a;
    @GuardedBy("lock")

    /* renamed from: b */
    private long f27880b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f27881c = new Object();

    public zzcd(long j) {
        this.f27879a = j;
    }

    public final void zza(long j) {
        synchronized (this.f27881c) {
            this.f27879a = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.f27881c) {
            long elapsedRealtime = zzt.zzA().elapsedRealtime();
            if (this.f27880b + this.f27879a > elapsedRealtime) {
                return false;
            }
            this.f27880b = elapsedRealtime;
            return true;
        }
    }
}
