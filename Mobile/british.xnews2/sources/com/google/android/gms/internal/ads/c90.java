package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class c90 extends C8152sd implements e90 {
    c90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: O4 */
    public final void mo30862O4(List<zzbtn> list) throws RemoteException {
        Parcel x = mo34697x();
        x.writeTypedList(list);
        mo34695f3(1, x);
    }
}
