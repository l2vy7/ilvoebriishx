package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class df0 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    final /* synthetic */ qe0 f30730a;

    /* renamed from: b */
    final /* synthetic */ zc0 f30731b;

    /* renamed from: c */
    final /* synthetic */ ef0 f30732c;

    df0(ef0 ef0, qe0 qe0, zc0 zc0) {
        this.f30732c = ef0;
        this.f30730a = qe0;
        this.f30731b = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f30730a.mo33887m(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
            co0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f30730a.mo33886b("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                co0.zzh("", e);
                return null;
            }
        } else {
            try {
                this.f30732c.f31345d = mediationRewardedAd;
                this.f30730a.zzg();
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            return new hf0(this.f30731b);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
