package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class t40 extends C8152sd implements v40 {
    t40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: L4 */
    public final void mo30918L4(l40 l40, String str) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, l40);
        x.writeString(str);
        mo34695f3(1, x);
    }
}
