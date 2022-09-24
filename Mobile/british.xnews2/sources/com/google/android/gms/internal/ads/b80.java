package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class b80 extends C8152sd implements d80 {
    b80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* renamed from: c */
    public final void mo30636c(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(1, x);
    }

    public final void zze() throws RemoteException {
        mo34695f3(2, mo34697x());
    }
}
