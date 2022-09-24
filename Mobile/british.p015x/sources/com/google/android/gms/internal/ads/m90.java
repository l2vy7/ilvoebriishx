package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class m90 extends C8152sd implements o90 {
    m90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: l */
    public final void mo32220l(int i) throws RemoteException {
        Parcel x = mo34697x();
        x.writeInt(i);
        mo34695f3(2, x);
    }

    public final void zzf() throws RemoteException {
        mo34695f3(1, mo34697x());
    }
}
