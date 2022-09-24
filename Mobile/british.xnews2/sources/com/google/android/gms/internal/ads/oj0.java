package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class oj0 extends C8152sd implements qj0 {
    oj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: i2 */
    public final void mo33921i2(kj0 kj0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, kj0);
        mo34695f3(5, x);
    }

    /* renamed from: k */
    public final void mo33922k(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(7, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzh() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final void zzi() throws RemoteException {
        mo34695f3(1, mo34697x());
    }

    public final void zzj() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzk() throws RemoteException {
        mo34695f3(8, mo34697x());
    }

    public final void zzl() throws RemoteException {
        mo34695f3(3, mo34697x());
    }
}
