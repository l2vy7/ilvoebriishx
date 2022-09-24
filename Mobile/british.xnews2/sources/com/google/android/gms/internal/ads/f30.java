package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class f30 extends C8152sd implements i30 {
    f30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String zzg() throws RemoteException {
        Parcel b2 = mo34694b2(2, mo34697x());
        String readString = b2.readString();
        b2.recycle();
        return readString;
    }

    public final List<q30> zzh() throws RemoteException {
        Parcel b2 = mo34694b2(3, mo34697x());
        ArrayList b = C8223ud.m38293b(b2);
        b2.recycle();
        return b;
    }
}
