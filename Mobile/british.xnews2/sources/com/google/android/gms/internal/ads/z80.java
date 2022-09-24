package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class z80 extends C8152sd implements b90 {
    z80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: b */
    public final void mo30639b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(3, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(2, mo34697x());
    }
}
