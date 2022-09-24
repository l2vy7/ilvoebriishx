package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class oe0 extends C8152sd implements qe0 {
    oe0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* renamed from: b */
    public final void mo33886b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString("Adapter returned null.");
        mo34695f3(3, x);
    }

    /* renamed from: m */
    public final void mo33887m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(4, x);
    }

    public final void zzg() throws RemoteException {
        mo34695f3(2, mo34697x());
    }
}
