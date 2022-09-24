package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class w40 extends C8152sd implements y40 {
    w40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: c4 */
    public final void mo31572c4(l40 l40) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, l40);
        mo34695f3(1, x);
    }
}
