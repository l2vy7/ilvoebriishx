package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gp */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7727gp extends C8152sd implements C7875kp {
    C7727gp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* renamed from: J */
    public final void mo32205J(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }

    public final void zzb() throws RemoteException {
        mo34695f3(5, mo34697x());
    }

    public final void zzc() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zze() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzf() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
