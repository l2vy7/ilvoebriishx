package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class j10 extends C8152sd implements l10 {
    j10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: h4 */
    public final void mo32818h4(i10 i10) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, i10);
        mo34695f3(1, x);
    }
}
