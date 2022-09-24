package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class p90 extends C8152sd implements r90 {
    p90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: B0 */
    public final void mo34095B0(l90 l90) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38297f(x, l90);
        mo34695f3(1, x);
    }

    /* renamed from: l */
    public final void mo34096l(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(2, x);
    }

    /* renamed from: m */
    public final void mo34097m(zzbew zzbew) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbew);
        mo34695f3(3, x);
    }
}
