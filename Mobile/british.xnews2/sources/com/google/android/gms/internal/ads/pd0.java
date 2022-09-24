package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class pd0 implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    final /* synthetic */ zc0 f37588a;

    /* renamed from: b */
    final /* synthetic */ td0 f37589b;

    pd0(td0 td0, zc0 zc0) {
        this.f37589b = td0;
        this.f37588a = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f37589b.f39387b.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(message).length() + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            co0.zze(sb.toString());
            this.f37588a.mo34071e5(adError.zza());
            this.f37588a.mo34068T0(adError.getCode(), adError.getMessage());
            this.f37588a.mo34073k(adError.getCode());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f37589b.f39391f = ((MediationBannerAd) obj).getView();
            this.f37588a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return new kd0(this.f37588a);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
