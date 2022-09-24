package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class od0 implements InitializationCompleteCallback {

    /* renamed from: a */
    final /* synthetic */ b90 f36386a;

    od0(td0 td0, b90 b90) {
        this.f36386a = b90;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.f36386a.mo30639b(str);
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.f36386a.zzf();
        } catch (RemoteException e) {
            co0.zzh("", e);
        }
    }
}
