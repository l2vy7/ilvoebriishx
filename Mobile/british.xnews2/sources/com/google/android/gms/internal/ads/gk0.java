package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gk0 extends C8152sd {
    gk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: n6 */
    public final IBinder mo32154n6(C10487a aVar, String str, tc0 tc0, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeString(str);
        C8223ud.m38297f(x, tc0);
        x.writeInt(214106000);
        Parcel b2 = mo34694b2(1, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }
}
