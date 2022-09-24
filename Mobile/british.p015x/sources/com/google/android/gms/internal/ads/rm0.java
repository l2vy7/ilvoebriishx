package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class rm0 extends C8152sd implements tm0 {
    rm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: I1 */
    public final void mo34122I1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        x.writeString(str2);
        C8223ud.m38295d(x, bundle);
        mo34695f3(3, x);
    }

    /* renamed from: a */
    public final void mo34123a(String str) throws RemoteException {
        Parcel x = mo34697x();
        x.writeString(str);
        mo34695f3(2, x);
    }
}
