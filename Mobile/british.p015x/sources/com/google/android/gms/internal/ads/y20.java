package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class y20 extends C8152sd {
    y20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    /* renamed from: n6 */
    public final void mo35840n6(hi0 hi0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, hi0);
        mo34695f3(1, x);
    }
}
