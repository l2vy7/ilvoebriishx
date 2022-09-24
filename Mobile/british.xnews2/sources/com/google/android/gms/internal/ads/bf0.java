package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class bf0 implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {

    /* renamed from: a */
    final /* synthetic */ ne0 f29992a;

    /* renamed from: b */
    final /* synthetic */ zc0 f29993b;

    bf0(ef0 ef0, ne0 ne0, zc0 zc0) {
        this.f29992a = ne0;
        this.f29993b = zc0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f29992a.mo33323m(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        if (unifiedNativeAdMapper == null) {
            co0.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f29992a.mo33322b("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                co0.zzh("", e);
                return null;
            }
        } else {
            try {
                this.f29992a.mo33321V4(new de0(unifiedNativeAdMapper));
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            return new hf0(this.f29993b);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
