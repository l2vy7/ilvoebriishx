package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class qi0 extends C8187td implements ri0 {
    public qi0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo33003x3((ParcelFileDescriptor) C8223ud.m38292a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo33002k6((zzbd) C8223ud.m38292a(parcel, zzbd.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
