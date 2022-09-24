package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p199d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class v30 extends C8152sd implements x30 {
    v30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: Y3 */
    public final IBinder mo35355Y3(C10487a aVar, C10487a aVar2, C10487a aVar3, int i) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        C8223ud.m38297f(x, aVar3);
        x.writeInt(214106000);
        Parcel b2 = mo34694b2(1, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }
}
