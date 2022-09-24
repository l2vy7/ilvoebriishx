package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7847jy extends C8152sd implements C7921ly {
    C7847jy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: d5 */
    public final void mo32996d5(boolean z) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38294c(x, z);
        mo34695f3(5, x);
    }

    public final void zze() throws RemoteException {
        mo34695f3(4, mo34697x());
    }

    public final void zzg() throws RemoteException {
        mo34695f3(3, mo34697x());
    }

    public final void zzh() throws RemoteException {
        mo34695f3(2, mo34697x());
    }

    public final void zzi() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
