package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class um0 extends C8152sd implements wm0 {
    um0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(C10487a aVar, zzchx zzchx, tm0 tm0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzchx);
        C8223ud.m38297f(x, tm0);
        mo34695f3(1, x);
    }

    public final void zzf(zzcco zzcco) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzcco);
        mo34695f3(7, x);
    }

    public final void zzg(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(8, x);
    }

    public final void zzh(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(2, x);
    }

    public final void zzi(List<Uri> list, C10487a aVar, oh0 oh0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeTypedList(list);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, oh0);
        mo34695f3(6, x);
    }

    public final void zzj(List<Uri> list, C10487a aVar, oh0 oh0) throws RemoteException {
        Parcel x = mo34697x();
        x.writeTypedList(list);
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, oh0);
        mo34695f3(5, x);
    }
}
