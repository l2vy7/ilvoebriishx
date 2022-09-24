package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ta0 implements wo0 {

    /* renamed from: a */
    final /* synthetic */ cb0 f39360a;

    /* renamed from: b */
    final /* synthetic */ db0 f39361b;

    ta0(db0 db0, cb0 cb0) {
        this.f39361b = db0;
        this.f39360a = cb0;
    }

    public final void zza() {
        synchronized (this.f39361b.f20262a) {
            this.f39361b.f20269h = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.f39360a.mo30874g();
        }
    }
}
