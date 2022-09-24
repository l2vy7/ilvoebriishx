package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8422zx extends C8152sd implements C7555by {
    C8422zx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: F5 */
    public final void mo30821F5(zzbfk zzbfk) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbfk);
        mo34695f3(1, x);
    }
}
