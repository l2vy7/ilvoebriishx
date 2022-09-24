package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ve0 extends C8187td implements we0 {
    public ve0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m6 */
    public final boolean mo28554m6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30648b(parcel.readString());
        } else if (i == 2) {
            mo30650c(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo30649b6((zzbew) C8223ud.m38292a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
