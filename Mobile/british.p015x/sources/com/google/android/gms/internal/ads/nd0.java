package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class nd0 implements MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    final /* synthetic */ zc0 f35978a;

    /* renamed from: b */
    final /* synthetic */ Adapter f35979b;

    /* renamed from: c */
    final /* synthetic */ td0 f35980c;

    nd0(td0 td0, zc0 zc0, Adapter adapter) {
        this.f35980c = td0;
        this.f35978a = zc0;
        this.f35979b = adapter;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f35979b.getClass().getCanonicalName();
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
            this.f35978a.mo34071e5(adError.zza());
            this.f35978a.mo34068T0(adError.getCode(), adError.getMessage());
            this.f35978a.mo34073k(adError.getCode());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.f35980c.f39395j = (MediationInterscrollerAd) obj;
            this.f35978a.zzo();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
        return new kd0(this.f35978a);
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
