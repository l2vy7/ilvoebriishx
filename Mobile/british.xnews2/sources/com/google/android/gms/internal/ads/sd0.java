package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class sd0 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    final /* synthetic */ zc0 f38950a;

    /* renamed from: b */
    final /* synthetic */ td0 f38951b;

    sd0(td0 td0, zc0 zc0) {
        this.f38951b = td0;
        this.f38950a = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f38951b.f39387b.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(message).length() + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            co0.zze(sb.toString());
            this.f38950a.mo34071e5(adError.zza());
            this.f38950a.mo34068T0(adError.getCode(), adError.getMessage());
            this.f38950a.mo34073k(adError.getCode());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f38951b.f39394i = (MediationRewardedAd) obj;
            this.f38950a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return new rk0(this.f38950a);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.f38951b.f39387b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            co0.zze(sb.toString());
            this.f38950a.mo34068T0(0, str);
            this.f38950a.mo34073k(0);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
