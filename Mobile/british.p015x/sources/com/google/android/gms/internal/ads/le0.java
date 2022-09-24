package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class le0 extends C8152sd implements ne0 {
    le0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* renamed from: V4 */
    public final void mo33321V4(id0 id0) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, id0);
        mo34695f3(1, x);
    }

    /* renamed from: b */
    public final void mo33322b(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString("Adapter returned null.");
        mo34695f3(2, x);
    }

    /* renamed from: m */
    public final void mo33323m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }
}
