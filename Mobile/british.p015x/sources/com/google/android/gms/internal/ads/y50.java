package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class y50 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AdManagerAdView f41693b;

    /* renamed from: c */
    final /* synthetic */ C8136rw f41694c;

    /* renamed from: d */
    final /* synthetic */ z50 f41695d;

    y50(z50 z50, AdManagerAdView adManagerAdView, C8136rw rwVar) {
        this.f41695d = z50;
        this.f41693b = adManagerAdView;
        this.f41694c = rwVar;
    }

    public final void run() {
        if (this.f41693b.zza(this.f41694c)) {
            this.f41695d.f42325b.onAdManagerAdViewLoaded(this.f41693b);
        } else {
            co0.zzj("Could not bind.");
        }
    }
}
