package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class je0 extends C8187td implements ke0 {
    public je0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            mo31491b(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo31492m((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
