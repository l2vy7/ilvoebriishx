package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class g50 extends C8152sd implements i50 {
    g50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: O */
    public final boolean mo32009O(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        Parcel b2 = mo34694b2(2, x);
        boolean g = C8223ud.m38298g(b2);
        b2.recycle();
        return g;
    }
}
