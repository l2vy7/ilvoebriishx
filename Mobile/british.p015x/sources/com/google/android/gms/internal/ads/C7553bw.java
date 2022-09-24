package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7553bw extends C8152sd implements C7624dw {
    C7553bw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: l */
    public final void mo30547l(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(2, x);
    }

    /* renamed from: m */
    public final void mo30548m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(8, x);
    }

    public final void zzc() throws RemoteException {
        mo34695f3(6, mo34697x());
    }

    public final void zzd() throws RemoteException {
        mo34695f3(1, mo34697x());
    }

    public final void zzg() throws RemoteException {
        mo34695f3(7, mo34697x());
    }

    public final void zzh() throws RemoteException {
        mo34695f3(3, mo34697x());
    }

    public final void zzi() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzj() throws RemoteException {
        mo34695f3(5, mo34697x());
    }
}
