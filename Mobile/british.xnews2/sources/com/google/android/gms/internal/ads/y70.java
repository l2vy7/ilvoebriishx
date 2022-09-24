package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class y70 extends C8152sd implements a80 {
    y70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: a */
    public final void mo30322a(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(1, x);
    }
}
