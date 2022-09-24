package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class pe0 extends C8187td implements qe0 {
    public pe0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            mo33886b(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo33887m((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
