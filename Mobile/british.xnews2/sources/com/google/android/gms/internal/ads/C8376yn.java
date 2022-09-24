package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8376yn implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C8412zn f41930b;

    C8376yn(C8412zn znVar) {
        this.f41930b = znVar;
    }

    public final void run() {
        synchronized (this.f41930b.f42522d) {
            if (!this.f41930b.f42523e || !this.f41930b.f42524f) {
                co0.zze("App is still foreground");
            } else {
                this.f41930b.f42523e = false;
                co0.zze("App went background");
                for (C7510ao zza : this.f41930b.f42525g) {
                    try {
                        zza.zza(false);
                    } catch (Exception e) {
                        co0.zzh("", e);
                    }
                }
            }
        }
    }
}
