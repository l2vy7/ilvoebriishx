package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.up */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8235up extends C8152sd {
    C8235up(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: n6 */
    public final long mo35217n6(zzbak zzbak) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbak);
        Parcel b2 = mo34694b2(3, x);
        long readLong = b2.readLong();
        b2.recycle();
        return readLong;
    }

    /* renamed from: o6 */
    public final zzbah mo35218o6(zzbak zzbak) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbak);
        Parcel b2 = mo34694b2(1, x);
        zzbah zzbah = (zzbah) C8223ud.m38292a(b2, zzbah.CREATOR);
        b2.recycle();
        return zzbah;
    }

    /* renamed from: p6 */
    public final zzbah mo35219p6(zzbak zzbak) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbak);
        Parcel b2 = mo34694b2(2, x);
        zzbah zzbah = (zzbah) C8223ud.m38292a(b2, zzbah.CREATOR);
        b2.recycle();
        return zzbah;
    }
}
