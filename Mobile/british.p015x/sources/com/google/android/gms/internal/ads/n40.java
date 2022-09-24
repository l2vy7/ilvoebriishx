package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class n40 extends C8152sd implements p40 {
    n40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: u4 */
    public final void mo33626u4(f40 f40) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, f40);
        mo34695f3(1, x);
    }
}
