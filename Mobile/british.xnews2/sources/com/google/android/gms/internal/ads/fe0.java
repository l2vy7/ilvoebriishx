package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class fe0 extends C8152sd implements he0 {
    fe0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: b */
    public final void mo31120b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString("Adapter returned null.");
        mo34695f3(2, x);
    }

    /* renamed from: m */
    public final void mo31121m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }

    /* renamed from: r3 */
    public final void mo31122r3(cd0 cd0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, cd0);
        mo34695f3(4, x);
    }

    public final void zzg(C10487a aVar) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, aVar);
        mo34695f3(1, x);
    }
}
