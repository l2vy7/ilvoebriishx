package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jf0 implements zzo {

    /* renamed from: b */
    final /* synthetic */ zzcaf f33862b;

    jf0(zzcaf zzcaf) {
        this.f33862b = zzcaf;
    }

    public final void zzb() {
        co0.zze("Opening AdMobCustomTabsAdapter overlay.");
        this.f33862b.f43019b.onAdOpened(this.f33862b);
    }

    public final void zzbK() {
        co0.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbS() {
        co0.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbz() {
        co0.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        co0.zze("AdMobCustomTabsAdapter overlay is closed.");
        this.f33862b.f43019b.onAdClosed(this.f33862b);
    }
}
