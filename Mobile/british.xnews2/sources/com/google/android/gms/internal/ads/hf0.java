package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class hf0 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationRewardedAdCallback, MediationNativeAdCallback {

    /* renamed from: a */
    final zc0 f32718a;

    hf0(zc0 zc0) {
        this.f32718a = zc0;
    }

    public final void onAdClosed() {
        try {
            this.f32718a.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(AdError adError) {
        try {
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 86 + String.valueOf(domain).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(code);
            sb.append(". Error Message = ");
            sb.append(message);
            sb.append(" Error Domain = ");
            sb.append(domain);
            co0.zzj(sb.toString());
            this.f32718a.mo34065N(adError.zza());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.f32718a.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.f32718a.zzp();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.f32718a.mo34067Q4(new sk0(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.f32718a.zzv();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.f32718a.mo34076r();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.f32718a.zzx();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.f32718a.mo34070d();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.f32718a.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.f32718a.zzm();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        String str2;
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Mediated ad failed to show: ".concat(valueOf);
            } else {
                str2 = new String("Mediated ad failed to show: ");
            }
            co0.zzj(str2);
            this.f32718a.mo34064B(str);
        } catch (RemoteException unused) {
        }
    }
}
