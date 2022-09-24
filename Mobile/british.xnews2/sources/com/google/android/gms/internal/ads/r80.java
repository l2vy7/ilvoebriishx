package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r80 extends C8152sd {
    r80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: n6 */
    public final void mo34512n6(zzbta zzbta, q80 q80) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbta);
        C8223ud.m38297f(x, q80);
        mo34696m6(2, x);
    }
}
