package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pi0 extends C8152sd implements ri0 {
    pi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: k6 */
    public final void mo33002k6(zzbd zzbd) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, zzbd);
        mo34695f3(2, x);
    }

    /* renamed from: x3 */
    public final void mo33003x3(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel x = mo34697x();
        C8223ud.m38295d(x, parcelFileDescriptor);
        mo34695f3(1, x);
    }
}
