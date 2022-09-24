package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class wg0 extends C8152sd implements yg0 {
    wg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final boolean zzE() throws RemoteException {
        Parcel b2 = mo34694b2(11, mo34697x());
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }

    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        x.writeInt(i2);
        C8223ud.m38295d(x, intent);
        mo34695f3(12, x);
    }

    public final void zzh() throws RemoteException {
        mo34695f3(10, mo34697x());
    }

    public final void zzj(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(13, x);
    }

    public final void zzk(Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, bundle);
        mo34695f3(1, x);
    }

    public final void zzl() throws RemoteException {
        mo34695f3(8, mo34697x());
    }

    public final void zzn() throws RemoteException {
        mo34695f3(5, mo34697x());
    }

    public final void zzo() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzp() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzq(Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, bundle);
        Parcel b2 = mo34694b2(6, x);
        if (b2.readInt() != 0) {
            bundle.readFromParcel(b2);
        }
        b2.recycle();
    }

    public final void zzr() throws RemoteException {
        mo34695f3(3, mo34697x());
    }

    public final void zzs() throws RemoteException {
        mo34695f3(7, mo34697x());
    }

    public final void zzt() throws RemoteException {
        mo34695f3(14, mo34697x());
    }

    public final void zzv() throws RemoteException {
        mo34695f3(9, mo34697x());
    }
}
