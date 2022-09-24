package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class hk0 extends C8152sd implements jk0 {
    hk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: l */
    public final void mo31425l(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(2, x);
    }

    /* renamed from: m */
    public final void mo31426m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }

    public final void zzg() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
