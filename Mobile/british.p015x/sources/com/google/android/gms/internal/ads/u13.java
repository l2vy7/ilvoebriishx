package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u13 extends C8152sd {
    u13(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: n6 */
    public final zzfnr mo35083n6(zzfnp zzfnp) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzfnp);
        Parcel b2 = mo34694b2(1, x);
        zzfnr zzfnr = (zzfnr) C8223ud.m38292a(b2, zzfnr.CREATOR);
        b2.recycle();
        return zzfnr;
    }

    /* renamed from: o6 */
    public final zzfoa mo35084o6(zzfny zzfny) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzfny);
        Parcel b2 = mo34694b2(3, x);
        zzfoa zzfoa = (zzfoa) C8223ud.m38292a(b2, zzfoa.CREATOR);
        b2.recycle();
        return zzfoa;
    }

    /* renamed from: p6 */
    public final void mo35085p6(zzfnm zzfnm) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzfnm);
        mo34695f3(2, x);
    }
}
