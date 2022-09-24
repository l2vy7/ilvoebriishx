package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class kd0 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback {

    /* renamed from: a */
    private final zc0 f34254a;

    public kd0(zc0 zc0) {
        this.f34254a = zc0;
    }

    public final void onAdClosed() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClosed.");
        try {
            this.f34254a.zzf();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(AdError adError) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 87 + String.valueOf(domain).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(code);
        sb.append(". Error Message = ");
        sb.append(message);
        sb.append(" Error Domain = ");
        sb.append(domain);
        co0.zzj(sb.toString());
        try {
            this.f34254a.mo34065N(adError.zza());
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f34254a.zzn();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdOpened.");
        try {
            this.f34254a.zzp();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoComplete.");
        try {
            this.f34254a.mo34074n();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoPause.");
        try {
            this.f34254a.mo34076r();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoPlay() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoPlay.");
        try {
            this.f34254a.zzx();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called reportAdClicked.");
        try {
            this.f34254a.zze();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called reportAdImpression.");
        try {
            this.f34254a.zzm();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(String str) {
        String str2;
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdFailedToShow.");
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Mediation ad failed to show: ".concat(valueOf);
        } else {
            str2 = new String("Mediation ad failed to show: ");
        }
        co0.zzj(str2);
        try {
            this.f34254a.mo34064B(str);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
