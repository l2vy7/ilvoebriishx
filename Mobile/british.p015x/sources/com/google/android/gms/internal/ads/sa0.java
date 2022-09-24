package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sa0 implements yo0<x90> {

    /* renamed from: a */
    final /* synthetic */ cb0 f38930a;

    /* renamed from: b */
    final /* synthetic */ db0 f38931b;

    sa0(db0 db0, cb0 cb0) {
        this.f38931b = db0;
        this.f38930a = cb0;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        x90 x90 = (x90) obj;
        synchronized (this.f38931b.f20262a) {
            this.f38931b.f20269h = 0;
            if (!(this.f38931b.f20268g == null || this.f38930a == this.f38931b.f20268g)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.f38931b.f20268g.mo30874g();
            }
            this.f38931b.f20268g = this.f38930a;
        }
    }
}
