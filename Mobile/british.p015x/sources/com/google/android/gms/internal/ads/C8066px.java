package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.px */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8066px extends C8152sd implements C8137rx {
    C8066px(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String zze() throws RemoteException {
        Parcel b2 = mo34694b2(1, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final String zzf() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }
}
