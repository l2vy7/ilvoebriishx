package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7591cy extends C8152sd implements C7663ey {
    C7591cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
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

    public final List<zzbfm> zzg() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList<zzbfm> createTypedArrayList = b2.createTypedArrayList(zzbfm.CREATOR);
        b2.recycle();
        return createTypedArrayList;
    }
}
