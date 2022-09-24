package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class d50 extends C8152sd implements f50 {
    d50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: Z3 */
    public final void mo30311Z3(p50 p50) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, p50);
        mo34695f3(1, x);
    }
}
