package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class cf0 implements SignalCallbacks {

    /* renamed from: a */
    final /* synthetic */ we0 f30350a;

    cf0(ef0 ef0, we0 we0) {
        this.f30350a = we0;
    }

    public final void onFailure(AdError adError) {
        try {
            this.f30350a.mo30649b6(adError.zza());
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.f30350a.mo30648b(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f30350a.mo30650c(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
