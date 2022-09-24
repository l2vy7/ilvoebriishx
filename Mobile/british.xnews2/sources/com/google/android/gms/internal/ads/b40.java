package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class b40 extends C8152sd implements d40 {
    b40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    /* renamed from: z4 */
    public final IBinder mo30620z4(C10487a aVar, C10487a aVar2, C10487a aVar3) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        C8223ud.m38297f(x, aVar2);
        C8223ud.m38297f(x, aVar3);
        Parcel b2 = mo34694b2(1, x);
        IBinder readStrongBinder = b2.readStrongBinder();
        b2.recycle();
        return readStrongBinder;
    }
}
