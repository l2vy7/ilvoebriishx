package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.cp */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7582cp extends C8152sd implements C7654ep {
    C7582cp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: Q0 */
    public final void mo30973Q0(C7546bp bpVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, bpVar);
        mo34695f3(1, x);
    }

    /* renamed from: w3 */
    public final void mo30974w3(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }

    public final void zzb(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(2, x);
    }
}
