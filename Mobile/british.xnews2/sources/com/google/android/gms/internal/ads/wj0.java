package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class wj0 extends C8152sd implements yj0 {
    wj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final int zze() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        int readInt = b2.readInt();
        b2.recycle();
        return readInt;
    }

    public final String zzf() throws RemoteException {
        Parcel b2 = mo34694b2(1, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }
}
