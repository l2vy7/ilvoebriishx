package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class rd0 implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {

    /* renamed from: a */
    final /* synthetic */ zc0 f38631a;

    /* renamed from: b */
    final /* synthetic */ td0 f38632b;

    rd0(td0 td0, zc0 zc0) {
        this.f38632b = td0;
        this.f38631a = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f38632b.f39387b.getClass().getCanonicalName();
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
            this.f38631a.mo34071e5(adError.zza());
            this.f38631a.mo34068T0(adError.getCode(), adError.getMessage());
            this.f38631a.mo34073k(adError.getCode());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f38632b.f39393h = (UnifiedNativeAdMapper) obj;
            this.f38631a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return new kd0(this.f38631a);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
