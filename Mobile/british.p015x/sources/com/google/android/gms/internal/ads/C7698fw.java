package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C7698fw extends C8187td implements C7772hw {
    public C7698fw() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else if (i != 2) {
            return false;
        } else {
            mo31670S((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
