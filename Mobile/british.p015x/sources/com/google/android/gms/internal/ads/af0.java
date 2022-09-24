package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class af0 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {

    /* renamed from: a */
    final /* synthetic */ ke0 f29623a;

    /* renamed from: b */
    final /* synthetic */ zc0 f29624b;

    /* renamed from: c */
    final /* synthetic */ ef0 f29625c;

    af0(ef0 ef0, ke0 ke0, zc0 zc0) {
        this.f29625c = ef0;
        this.f29623a = ke0;
        this.f29624b = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f29623a.mo31492m(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
        if (mediationInterstitialAd == null) {
            co0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f29623a.mo31491b("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                co0.zzh("", e);
                return null;
            }
        } else {
            try {
                this.f29625c.f31344c = mediationInterstitialAd;
                this.f29623a.zzg();
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            return new hf0(this.f29624b);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
