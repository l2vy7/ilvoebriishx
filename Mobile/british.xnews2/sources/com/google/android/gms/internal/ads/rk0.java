package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class rk0 implements MediationRewardedAdCallback {

    /* renamed from: a */
    private final zc0 f38697a;

    public rk0(zc0 zc0) {
        this.f38697a = zc0;
    }

    public final void onAdClosed() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClosed.");
        try {
            this.f38697a.zzf();
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
            this.f38697a.mo34065N(adError.zza());
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdOpened.");
        try {
            this.f38697a.zzp();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onUserEarnedReward.");
        try {
            this.f38697a.mo34067Q4(new sk0(rewardItem));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoComplete.");
        try {
            this.f38697a.mo34074n();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStart() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoStart.");
        try {
            this.f38697a.mo34070d();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdClicked() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called reportAdClicked.");
        try {
            this.f38697a.zze();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called reportAdImpression.");
        try {
            this.f38697a.zzm();
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
            this.f38697a.mo34064B(str);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
