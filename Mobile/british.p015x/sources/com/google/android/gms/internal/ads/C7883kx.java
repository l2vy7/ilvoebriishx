package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.internal.ads.kx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7883kx extends C8152sd {
    C7883kx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: n6 */
    public final IBinder mo33206n6(C10487a aVar, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        x.writeInt(214106000);
        Parcel b2 = mo34694b2(1, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }
}
