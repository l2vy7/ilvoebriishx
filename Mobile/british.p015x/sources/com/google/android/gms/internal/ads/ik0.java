package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ik0 extends C8187td implements jk0 {
    public ik0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            mo31425l(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            mo31426m((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
