package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ze0 implements MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    final /* synthetic */ he0 f42442a;

    /* renamed from: b */
    final /* synthetic */ zc0 f42443b;

    ze0(ef0 ef0, he0 he0, zc0 zc0) {
        this.f42442a = he0;
        this.f42443b = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f42442a.mo31121m(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd == null) {
            co0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f42442a.mo31120b("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                co0.zzh("", e);
                return null;
            }
        } else {
            try {
                this.f42442a.mo31122r3(new ud0(mediationInterscrollerAd));
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            return new hf0(this.f42443b);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
