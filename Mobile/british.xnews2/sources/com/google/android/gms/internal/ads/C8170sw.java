package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.sw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8170sw extends C8152sd {
    C8170sw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: n6 */
    public final IBinder mo34804n6(C10487a aVar, zzbfi zzbfi, String str, tc0 tc0, int i, int i2) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38295d(x, zzbfi);
        x.writeString(str);
        C8223ud.m38297f(x, tc0);
        x.writeInt(214106000);
        x.writeInt(i2);
        Parcel b2 = mo34694b2(2, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }
}
