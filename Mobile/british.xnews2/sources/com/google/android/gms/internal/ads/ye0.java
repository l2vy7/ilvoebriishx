package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ye0 implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    final /* synthetic */ he0 f41796a;

    /* renamed from: b */
    final /* synthetic */ zc0 f41797b;

    ye0(ef0 ef0, he0 he0, zc0 zc0) {
        this.f41796a = he0;
        this.f41797b = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f41796a.mo31121m(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd == null) {
            co0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f41796a.mo31120b("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                co0.zzh("", e);
                return null;
            }
        } else {
            try {
                this.f41796a.zzg(C10489b.m48195m6(mediationBannerAd.getView()));
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            return new hf0(this.f41797b);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
