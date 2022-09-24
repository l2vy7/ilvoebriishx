package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class dk0 extends C8152sd implements fk0 {
    dk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: A4 */
    public final void mo31279A4(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(5, x);
    }

    /* renamed from: D4 */
    public final void mo31280D4(yj0 yj0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, yj0);
        mo34695f3(3, x);
    }

    /* renamed from: p */
    public final void mo31281p(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(4, x);
    }

    public final void zze() throws RemoteException {
        mo34695f3(7, mo34697x());
    }

    public final void zzf() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final void zzg() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzj() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
