package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ew */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7661ew extends C8152sd implements C7772hw {
    C7661ew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* renamed from: S */
    public final void mo31670S(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(2, x);
    }

    public final void zzc() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
